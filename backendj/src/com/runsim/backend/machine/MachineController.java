package com.runsim.backend.machine;

import com.runsim.backend.Constants;
import com.runsim.backend.machine.annotations.Starter;
import com.runsim.backend.machine.annotations.State;
import com.runsim.backend.sctp.SCTPClient;
import com.sun.nio.sctp.MessageInfo;
import com.sun.nio.sctp.SctpChannel;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

public class MachineController<TMachine> {
    private final TMachine machine;
    private Method starterMethod;
    private Map<String, Method> stateMethods;
    private Map<String, State> stateAnnotations;
    private String currentState;
    private final SCTPClient sctpClient;
    private boolean runCalled;
    private MachineContext machineContext;

    public MachineController(TMachine machine, String host, int port) throws Exception {
        this.machine = machine;
        this.sctpClient = new SCTPClient(host, port, Constants.NGAP_PROTOCOL_ID);
        this.currentState = null;
        this.starterMethod = null;
        this.machineContext = new MachineContext();
        this.stateMethods = new HashMap<>();
        this.stateAnnotations = new HashMap<>();

        for (Method method : machine.getClass().getMethods()) {
            if (method.isAnnotationPresent(Starter.class)) {
                if (starterMethod != null)
                    throw new RuntimeException("multiple starters are not allowed");
                Parameter[] params = method.getParameters();
                if (params.length != 1 || params[0].getType() != MachineContext.class)
                    throw new RuntimeException("bad parameters for starter method");
                if (!Action.class.isAssignableFrom(method.getReturnType()))
                    throw new RuntimeException("return type of the starter method must be Action");
                method.setAccessible(true);
                starterMethod = method;
            }
            if (method.isAnnotationPresent(State.class)) {
                Parameter[] params = method.getParameters();
                if (params.length != 2 || params[0].getType() != MessageContext.class || params[1].getType() != MachineContext.class)
                    throw new RuntimeException("bad parameters for state function.");
                if (!Action.class.isAssignableFrom(method.getReturnType()))
                    throw new RuntimeException("return type of the starter method must be Action");
                method.setAccessible(true);
                stateMethods.put(method.getName(), method);
                stateAnnotations.put(method.getName(), method.getAnnotation(State.class));
            }
        }
        if (starterMethod == null)
            throw new RuntimeException("starter method could not found");
    }

    public synchronized void run() throws Exception {
        if (runCalled) throw new IllegalStateException("run can only called once");
        runCalled = true;

        handleActionResult((Action) starterMethod.invoke(machine, machineContext));
    }

    private synchronized void handleActionResult(Action actionRes) throws Exception {
        if (actionRes instanceof Action.NoOperation) {

        } else if (actionRes instanceof Action.CloseConnection) {
            sctpClient.close();
        } else if (actionRes instanceof Action.SendData) {
            String oldState = currentState;
            Action.SendData action = (Action.SendData) actionRes;
            currentState = action.getNextState();
            sctpClient.send(action.getStreamNumber(), action.getData(), this::handleMessage, stateAnnotations.get(oldState).timeout());
        } else {
            throw new RuntimeException("unhandled action result");
        }
    }

    private synchronized void handleMessage(byte[] receivedBytes, MessageInfo messageInfo, SctpChannel channel) throws Exception {
        Method stateMethod = stateMethods.get(currentState);
        if (stateMethod == null)
            throw new RuntimeException("state method could not found: " + currentState);

        MessageContext messageContext = new MessageContext(receivedBytes, messageInfo.streamNumber());
        handleActionResult((Action) stateMethod.invoke(machine, messageContext, machineContext));
    }
}