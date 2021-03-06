/*
 * MIT License
 *
 * Copyright (c) 2020 ALİ GÜNGÖR
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tr.havelsan.ueransim.nas.impl.ies;

import tr.havelsan.ueransim.nas.core.NasValue;
import tr.havelsan.ueransim.nas.core.ProtocolEnum;
import tr.havelsan.ueransim.nas.core.ies.InformationElement6;
import tr.havelsan.ueransim.utils.OctetInputStream;
import tr.havelsan.ueransim.utils.OctetOutputStream;
import tr.havelsan.ueransim.utils.Utils;
import tr.havelsan.ueransim.utils.bits.Bit5;
import tr.havelsan.ueransim.utils.octets.Octet;
import tr.havelsan.ueransim.utils.octets.OctetString;

import java.util.Arrays;

public class IEOperatorDefinedAccessCategoryDefinitions extends InformationElement6 {
    public VOperatorDefinedAccessCategoryDefinition[] operatorDefinedAccessCategoryDefinitions;

    public IEOperatorDefinedAccessCategoryDefinitions() {
    }

    public IEOperatorDefinedAccessCategoryDefinitions(VOperatorDefinedAccessCategoryDefinition[] operatorDefinedAccessCategoryDefinitions) {
        this.operatorDefinedAccessCategoryDefinitions = operatorDefinedAccessCategoryDefinitions;
    }

    @Override
    protected IEOperatorDefinedAccessCategoryDefinitions decodeIE6(OctetInputStream stream, int length) {
        var res = new IEOperatorDefinedAccessCategoryDefinitions();
        res.operatorDefinedAccessCategoryDefinitions = Utils.decodeList(stream, new VOperatorDefinedAccessCategoryDefinition()::decode, length, VOperatorDefinedAccessCategoryDefinition.class);
        return res;
    }

    @Override
    public void encodeIE6(OctetOutputStream stream) {
        Arrays.stream(operatorDefinedAccessCategoryDefinitions).forEach(item -> item.encode(stream));
    }

    public static class VOperatorDefinedAccessCategoryDefinition extends NasValue {
        public Octet precedence;
        public Bit5 operatorDefinedAccessCategoryNumber;
        public EPresenceOfStandardizedAccessCategory psac;
        public OctetString criteria;
        public Bit5 standardizedAccessCategory;

        public VOperatorDefinedAccessCategoryDefinition() {
        }

        public VOperatorDefinedAccessCategoryDefinition(Octet precedence, Bit5 operatorDefinedAccessCategoryNumber, EPresenceOfStandardizedAccessCategory psac, OctetString criteria, Bit5 standardizedAccessCategory) {
            this.precedence = precedence;
            this.operatorDefinedAccessCategoryNumber = operatorDefinedAccessCategoryNumber;
            this.psac = psac;
            this.criteria = criteria;
            this.standardizedAccessCategory = standardizedAccessCategory;
        }

        @Override
        public VOperatorDefinedAccessCategoryDefinition decode(OctetInputStream stream) {
            var res = new VOperatorDefinedAccessCategoryDefinition();

            int length = stream.readOctetI();
            res.precedence = stream.readOctet();

            int octet = stream.readOctetI();
            res.operatorDefinedAccessCategoryNumber = new Bit5(octet);
            res.psac = EPresenceOfStandardizedAccessCategory.fromValue(octet >> 7 & 0b1);

            int lengthOfCriteria = stream.readOctetI();
            res.criteria = stream.readOctetString(lengthOfCriteria);

            res.standardizedAccessCategory = new Bit5(stream.readOctetI());
            return res;
        }

        @Override
        public void encode(OctetOutputStream stream) {
            int totalLength = 4 + criteria.length;
            stream.writeOctet(totalLength);
            stream.writeOctet(precedence);

            int octet = psac.intValue();
            octet <<= 7;
            octet |= operatorDefinedAccessCategoryNumber.intValue();
            stream.writeOctet(octet);

            stream.writeOctet(criteria.length);
            stream.writeOctetString(criteria);

            stream.writeOctet(standardizedAccessCategory.intValue());
        }
    }

    public static class EPresenceOfStandardizedAccessCategory extends ProtocolEnum {
        public static final EPresenceOfStandardizedAccessCategory NOT_INCLUDED
                = new EPresenceOfStandardizedAccessCategory(0b0, "Standardized access category field is not included");
        public static final EPresenceOfStandardizedAccessCategory INCLUDED
                = new EPresenceOfStandardizedAccessCategory(0b1, "Standardized access category field is included");

        private EPresenceOfStandardizedAccessCategory(int value, String name) {
            super(value, name);
        }

        public static EPresenceOfStandardizedAccessCategory fromValue(int value) {
            return fromValueGeneric(EPresenceOfStandardizedAccessCategory.class, value, null);
        }
    }
}
