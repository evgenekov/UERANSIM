package tr.havelsan.ueransim.ngap0.ies.sequence_ofs;

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

public class NGAP_CompletedCellsInTAI_NR extends NGAP_SequenceOf<NGAP_CompletedCellsInTAI_NR_Item> {

    public NGAP_CompletedCellsInTAI_NR() {
        super();
    }

    public NGAP_CompletedCellsInTAI_NR(List<NGAP_CompletedCellsInTAI_NR_Item> value) {
        super(value);
    }

    @Override
    public String getAsnName() {
        return "CompletedCellsInTAI-NR";
    }

    @Override
    public String getXmlTagName() {
        return "CompletedCellsInTAI-NR";
    }

    @Override
    public Class<NGAP_CompletedCellsInTAI_NR_Item> getItemType() {
        return NGAP_CompletedCellsInTAI_NR_Item.class;
    }
}
