package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;
import com.tencent.mm.ba.b;

public final class bgz extends a {
    public b eew;
    public long nco;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.C(1, this.nco);
            if (this.eew != null) {
                aVar.b(2, this.eew);
            }
            return 0;
        } else if (i == 1) {
            r0 = a.a.a.a.B(1, this.nco) + 0;
            if (this.eew != null) {
                return r0 + a.a.a.a.a(2, this.eew);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bgz com_tencent_mm_protocal_c_bgz = (bgz) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_bgz.nco = aVar3.pMj.mI();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bgz.eew = aVar3.bQK();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
