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

public class NGAP_CancelledCellsInTAI_EUTRA extends NgapSequenceOf<NGAP_CancelledCellsInTAI_EUTRA_Item> {

    @Override
    protected String getAsnName() {
        return "CancelledCellsInTAI-EUTRA";
    }

    @Override
    protected String getXmlTagName() {
        return "CancelledCellsInTAI-EUTRA";
    }

    @Override
    public Class<NGAP_CancelledCellsInTAI_EUTRA_Item> getItemType() {
        return NGAP_CancelledCellsInTAI_EUTRA_Item.class;
    }
}
