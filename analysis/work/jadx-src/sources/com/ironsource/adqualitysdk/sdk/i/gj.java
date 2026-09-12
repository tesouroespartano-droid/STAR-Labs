package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class gj extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2202 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2203 = {-947433995, -635344736, 1097789696, -422418223, -2111489508, -68354461, -1078792025, -338692563, 1284975873, 1197893723, -171803887, -62631670, 27271875, -754185024, 1272250322, 1839149540, 897538774, 260050442};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2204 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2202 + 67;
        f2204 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2188(new int[]{-2097874205, -406107086, -775536565, 899323330, -533573457, -2080866450, -1239092817, -1389653796, -1010585607, -411737986, -1814195815, -750600693, 66645622, -2017338175, -1938216009, -2130298188, 1438977221, -330698055, -1695157352, -13306272, -1886621073, -31507794, -1577922862, 1592190971, -346157216, -1839675067, -833673387, 531541519}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 56).intern();
        int i4 = f2204 + 57;
        f2202 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2202 + 45;
        f2204 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return InneractiveAdManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bw bwVar = new bw(mo2168());
        int i2 = f2202 + 121;
        f2204 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return bwVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2202 + 39;
        f2204 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2188(new int[]{822447739, -675912025, 734769850, 45572999, -1370695552, 971754190}, 10 - TextUtils.lastIndexOf("", '0', 0, 0)).intern();
        int i4 = f2204 + InterfaceC0280i1.d.b.g;
        f2202 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2188(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2203.clone();
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
