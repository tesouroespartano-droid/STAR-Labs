package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class fb extends ei {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2054 = {-819053797, 2007702006, 340066699, -1049210336, 227062326, 1069575291, -1521549027, -2124621893, -1534716663, 1570578371, -1750813406, -393723953, -901141583, -1159684686, -2012496767, 1433237557, 1097139458, 626852395};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2055 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2056;

    public fb(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f2055 + 69;
        f2056 = i2 % 128;
        int i3 = i2 % 2;
        dr drVarM2116 = m2129().m2116(dqVar, coVar);
        if (!drVarM2116.m2018()) {
            dr drVarM2117 = m2128().m2116(dqVar, coVar);
            int i4 = f2056 + 91;
            f2055 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
            }
            return drVarM2117;
        }
        int i6 = f2056;
        int i7 = i6 + 87;
        f2055 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 65;
        f2055 = i9 % 128;
        int i10 = i9 % 2;
        return drVarM2116;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2056 + 7;
        f2055 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2149(new int[]{-1695336621, 333010991}, (PointF.length(0.0f, 0.0f) > 1.0f ? 1 : (PointF.length(0.0f, 0.0f) == 1.0f ? 0 : -1)) + 4) : m2149(new int[]{-1695336621, 333010991}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2)).intern();
        int i3 = f2055 + 121;
        f2056 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2149(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2054.clone();
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
