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

public class NGAP_PDUSessionResourceInformationItem extends NgapSequence {

    public NGAP_PDUSessionID pDUSessionID;
    public NGAP_QosFlowInformationList qosFlowInformationList;
    public NGAP_DRBsToQosFlowsMappingList dRBsToQosFlowsMappingList;

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceInformationItem";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceInformationItem";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"pDUSessionID", "qosFlowInformationList", "dRBsToQosFlowsMappingList"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"pDUSessionID", "qosFlowInformationList", "dRBsToQosFlowsMappingList"};
    }
}
