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

import tr.havelsan.ueransim.nas.core.ies.InformationElement1;
import tr.havelsan.ueransim.nas.impl.enums.EFollowOnRequest;
import tr.havelsan.ueransim.nas.impl.enums.ERegistrationType;
import tr.havelsan.ueransim.utils.bits.Bit4;

public class IE5gsRegistrationType extends InformationElement1 {
    public EFollowOnRequest followOnRequestPending;
    public ERegistrationType registrationType;

    public IE5gsRegistrationType() {
    }

    public IE5gsRegistrationType(EFollowOnRequest followOnRequestPending, ERegistrationType registrationType) {
        this.followOnRequestPending = followOnRequestPending;
        this.registrationType = registrationType;
    }

    @Override
    public InformationElement1 decodeIE1(Bit4 value) {
        int val = value.intValue();

        var res = new IE5gsRegistrationType();
        res.registrationType = ERegistrationType.fromValue(val & 0b111);
        res.followOnRequestPending = EFollowOnRequest.fromValue(val >> 3 & 0b1);
        return res;
    }

    @Override
    public int encodeIE1() {
        return followOnRequestPending.intValue() << 3 | registrationType.intValue();
    }
}
