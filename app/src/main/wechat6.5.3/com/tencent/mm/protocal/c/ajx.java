package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ajx extends aqx {
    public int mKA;
    public int mKB;
    public LinkedList<qy> mcs = new LinkedList();
    public LinkedList<aka> mzB = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            aVar.dV(2, this.mKA);
            aVar.d(3, 8, this.mzB);
            aVar.dV(4, this.mKB);
            aVar.d(5, 8, this.mcs);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return (((r0 + a.a.a.a.dS(2, this.mKA)) + a.a.a.a.c(3, 8, this.mzB)) + a.a.a.a.dS(4, this.mKB)) + a.a.a.a.c(5, 8, this.mcs);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mzB.clear();
            this.mcs.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ajx com_tencent_mm_protocal_c_ajx = (ajx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ajx.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_ajx.mKA = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        aka com_tencent_mm_protocal_c_aka = new aka();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_aka.a(aVar4, com_tencent_mm_protocal_c_aka, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ajx.mzB.add(com_tencent_mm_protocal_c_aka);
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_ajx.mKB = aVar3.pMj.mH();
                    return 0;
                case 5:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        qy qyVar = new qy();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = qyVar.a(aVar4, qyVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ajx.mcs.add(qyVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
