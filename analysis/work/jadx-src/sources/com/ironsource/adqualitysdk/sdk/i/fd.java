package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class fd extends ek {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2061 = 1644891526634528587L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2062 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2063 = 1;

    public fd(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾒ */
    public final Number mo2131(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2062 + 95;
        int i3 = i2 % 128;
        f2063 = i3;
        int i4 = i2 % 2;
        if (!(number instanceof Double)) {
            int i5 = i3 + 17;
            f2062 = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                return ((number instanceof Long) || (number2 instanceof Long)) ? Long.valueOf(number.longValue() * number2.longValue()) : Integer.valueOf(number.intValue() * number2.intValue());
            }
        }
        return Double.valueOf(number.doubleValue() * number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2062 + 17;
        f2063 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2151("\udf61", 44917 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        int i4 = f2062 + 125;
        f2063 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2151(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2061);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
