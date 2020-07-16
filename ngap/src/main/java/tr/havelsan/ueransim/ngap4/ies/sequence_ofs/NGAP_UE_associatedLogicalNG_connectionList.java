package tr.havelsan.ueransim.ngap4.ies.sequence_ofs;

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

public class NGAP_UE_associatedLogicalNG_connectionList extends NgapSequenceOf<NGAP_UE_associatedLogicalNG_connectionItem> {

    @Override
    protected String getAsnName() {
        return "UE-associatedLogicalNG-connectionList";
    }

    @Override
    protected String getXmlTagName() {
        return "UE-associatedLogicalNG-connectionList";
    }

    @Override
    public Class<NGAP_UE_associatedLogicalNG_connectionItem> getItemType() {
        return NGAP_UE_associatedLogicalNG_connectionItem.class;
    }
}
