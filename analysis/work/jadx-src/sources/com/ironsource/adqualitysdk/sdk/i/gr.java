package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import jp.maio.sdk.android.MaioAds;

/* JADX INFO: loaded from: classes2.dex */
public final class gr extends gk {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2237 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2238 = {-836617915, 151570255, -638497221, -674602582, -410244903, 235462872, 1041634725, 632226981, -1778547298, 45396312, 2096577689, 2142233774, 1711104207, -1506096039, -224325339, -1007186606, -96627950, -1369828056};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2239 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2237 + 63;
        f2239 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2198(new int[]{-38580159, 1289730787, -447323937, 59179316, -2088458042, -1857842128, 573504234, -98146169, -1636436456, -1419249912, -165870801, -1442078898, 1002098752, 99643244}, 27 - View.combineMeasuredStates(0, 0)).intern();
        int i4 = f2237 + 87;
        f2239 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2239;
        int i3 = i2 + 107;
        f2237 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        f2237 = i5 % 128;
        if (i5 % 2 == 0) {
            return MaioAds.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bv bvVar = new bv(mo2168());
        int i2 = f2237 + 113;
        f2239 = i2 % 128;
        if (i2 % 2 != 0) {
            return bvVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2237 + 33;
        f2239 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2198(new int[]{1090038906, 1283757543}, 3 - Color.argb(1, 0, 1, 1)) : m2198(new int[]{1090038906, 1283757543}, Color.argb(0, 0, 0, 0) + 4)).intern();
        int i3 = f2237 + 81;
        f2239 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2198(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2238.clone();
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
