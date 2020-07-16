package tr.havelsan.ueransim.ngap4.ies.sequences;

import tr.havelsan.ueransim.ngap4.core.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap4.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap4.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap4.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap4.ies.sequences.*;
import tr.havelsan.ueransim.ngap4.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap4.ies.choices.*;
import tr.havelsan.ueransim.ngap4.ies.integers.*;
import tr.havelsan.ueransim.ngap4.ies.enumerations.*;

public class NGAP_PathSwitchRequestTransfer extends NgapSequence {

    public NGAP_UPTransportLayerInformation dL_NGU_UP_TNLInformation;
    public NGAP_DL_NGU_TNLInformationReused dL_NGU_TNLInformationReused;
    public NGAP_UserPlaneSecurityInformation userPlaneSecurityInformation;
    public NGAP_QosFlowAcceptedList qosFlowAcceptedList;

    @Override
    protected String getAsnName() {
        return "PathSwitchRequestTransfer";
    }

    @Override
    protected String getXmlTagName() {
        return "PathSwitchRequestTransfer";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"dL-NGU-UP-TNLInformation", "dL-NGU-TNLInformationReused", "userPlaneSecurityInformation", "qosFlowAcceptedList"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"dL_NGU_UP_TNLInformation", "dL_NGU_TNLInformationReused", "userPlaneSecurityInformation", "qosFlowAcceptedList"};
    }
}
