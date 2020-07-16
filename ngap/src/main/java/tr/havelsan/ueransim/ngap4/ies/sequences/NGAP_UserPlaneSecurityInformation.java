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

public class NGAP_UserPlaneSecurityInformation extends NgapSequence {

    public NGAP_SecurityResult securityResult;
    public NGAP_SecurityIndication securityIndication;

    @Override
    protected String getAsnName() {
        return "UserPlaneSecurityInformation";
    }

    @Override
    protected String getXmlTagName() {
        return "UserPlaneSecurityInformation";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"securityResult", "securityIndication"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"securityResult", "securityIndication"};
    }
}
