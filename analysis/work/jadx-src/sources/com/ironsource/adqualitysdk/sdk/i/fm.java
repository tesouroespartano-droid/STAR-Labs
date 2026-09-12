package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class fm extends fr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2083 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2084 = 43819;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2085 = 12386;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2086 = 30254;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2087 = 9068;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2088;

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVar = new dr(null);
        drVar.m2015();
        int i2 = f2088 + 35;
        f2083 = i2 % 128;
        int i3 = i2 % 2;
        return drVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2088 + 83;
        f2083 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2156("龂푊챚ꏷ뤘⺒", (Process.myPid() >> 22) + 6).intern();
        int i4 = f2083 + 7;
        f2088 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2156(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2952) {
            char[] cArr2 = new char[cArr.length];
            k.f2951 = 0;
            char[] cArr3 = new char[2];
            while (k.f2951 < cArr.length) {
                cArr3[0] = cArr[k.f2951];
                cArr3[1] = cArr[k.f2951 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2084)) ^ ((c2 >>> 5) + f2087)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2085) ^ ((c3 + i2) ^ ((c3 << 4) + f2086))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
