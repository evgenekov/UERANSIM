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

public class NGAP_SourceOfUEActivityBehaviourInformation extends NgapEnumerated {

    public static final NGAP_SourceOfUEActivityBehaviourInformation SUBSCRIPTION_INFORMATION = new NGAP_SourceOfUEActivityBehaviourInformation("subscription-information");
    public static final NGAP_SourceOfUEActivityBehaviourInformation STATISTICS = new NGAP_SourceOfUEActivityBehaviourInformation("statistics");

    protected NGAP_SourceOfUEActivityBehaviourInformation(String sValue) {
        super(sValue);
    }

    @Override
    protected String getAsnName() {
        return "SourceOfUEActivityBehaviourInformation";
    }

    @Override
    protected String getXmlTagName() {
        return "SourceOfUEActivityBehaviourInformation";
    }
}
