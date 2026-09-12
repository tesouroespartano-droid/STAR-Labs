package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class es extends em {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2006 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2007 = 26473;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2008 = 62158;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2009 = 35897;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2010 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2011 = 13861;

    public es(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ｋ */
    final boolean mo2132(int i) {
        int i2 = 2 % 2;
        if (i >= 0) {
            int i3 = f2010 + 65;
            f2006 = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = f2010 + 29;
        f2006 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2006 + 113;
        f2010 = i2 % 128;
        return m2142("룃꿓", i2 % 2 != 0 ? 4 / View.combineMeasuredStates(0, 0) : 2 - View.combineMeasuredStates(0, 0)).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2142(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2011)) ^ ((c2 >>> 5) + f2009)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2007) ^ ((c3 + i2) ^ ((c3 << 4) + f2008))));
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
