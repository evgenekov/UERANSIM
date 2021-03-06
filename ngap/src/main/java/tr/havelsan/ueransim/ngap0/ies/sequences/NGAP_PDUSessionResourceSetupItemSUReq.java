package tr.havelsan.ueransim.ngap0.ies.sequences;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

import java.util.List;

public class NGAP_PDUSessionResourceSetupItemSUReq extends NGAP_Sequence {

    public NGAP_PDUSessionID pDUSessionID;
    public NGAP_NAS_PDU pDUSessionNAS_PDU;
    public NGAP_S_NSSAI s_NSSAI;
    public NGAP_OctetString pDUSessionResourceSetupRequestTransfer;

    @Override
    public String getAsnName() {
        return "PDUSessionResourceSetupItemSUReq";
    }

    @Override
    public String getXmlTagName() {
        return "PDUSessionResourceSetupItemSUReq";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"pDUSessionID", "pDUSessionNAS-PDU", "s-NSSAI", "pDUSessionResourceSetupRequestTransfer"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"pDUSessionID", "pDUSessionNAS_PDU", "s_NSSAI", "pDUSessionResourceSetupRequestTransfer"};
    }
}
