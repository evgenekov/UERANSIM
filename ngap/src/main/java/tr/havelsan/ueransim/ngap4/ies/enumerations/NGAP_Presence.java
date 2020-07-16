package tr.havelsan.ueransim.ngap4.ies.enumerations;

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

public class NGAP_Presence extends NgapEnumerated {

    public static final NGAP_Presence OPTIONAL = new NGAP_Presence("optional");
    public static final NGAP_Presence CONDITIONAL = new NGAP_Presence("conditional");
    public static final NGAP_Presence MANDATORY = new NGAP_Presence("mandatory");

    protected NGAP_Presence(String sValue) {
        super(sValue);
    }

    @Override
    protected String getAsnName() {
        return "Presence";
    }

    @Override
    protected String getXmlTagName() {
        return "Presence";
    }
}
