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

public class NGAP_AMF_TNLAssociationToAddList extends NgapSequenceOf<NGAP_AMF_TNLAssociationToAddItem> {

    @Override
    protected String getAsnName() {
        return "AMF-TNLAssociationToAddList";
    }

    @Override
    protected String getXmlTagName() {
        return "AMF-TNLAssociationToAddList";
    }

    @Override
    public Class<NGAP_AMF_TNLAssociationToAddItem> getItemType() {
        return NGAP_AMF_TNLAssociationToAddItem.class;
    }
}
