package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import com.fyber.FairBid;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class ge extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2174 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2175;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2176 = {1571551050, -1444082080, 142683144, -938096348, -1972751821, -102796038, 523940202, 1194546482, -154783336, 62323258, 1150627316, -1904335265, -1229242423, -240899732, 1089092787, 1482262234, 1143100373, 1797073864};

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2174 + 99;
        f2175 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2181(new int[]{-741376047, 424262929, 1816394120, -514383697, 806843887, 669657161, -645028838, 699760513, 1194858772, 1764808113}, (-16777199) - Color.rgb(0, 0, 0)).intern();
        int i4 = f2174 + 41;
        f2175 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2174 + InterfaceC0280i1.d.b.d;
        f2175 = i2 % 128;
        if (i2 % 2 == 0) {
            return FairBid.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        br brVar = new br(mo2168());
        int i2 = f2174 + 61;
        f2175 = i2 % 128;
        int i3 = i2 % 2;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2175 + 35;
        f2174 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2181(new int[]{1581567737, -727164127, -1905193812, -420961711}, (Process.myTid() >> 22) + 7).intern();
        int i4 = f2175 + 33;
        f2174 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2181(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2176.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
                cArr[0] = (char) (c.f1232 >>> 16);
                cArr[1] = (char) c.f1232;
                cArr[2] = (char) (c.f1233 >>> 16);
                cArr[3] = (char) c.f1233;
                c.m1415(iArr2);
                cArr2[c.f1231 << 1] = cArr[0];
                cArr2[(c.f1231 << 1) + 1] = cArr[1];
                cArr2[(c.f1231 << 1) + 2] = cArr[2];
                cArr2[(c.f1231 << 1) + 3] = cArr[3];
                c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
