package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class er extends ek {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2003 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2004 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2005 = -6328717219247351126L;

    public er(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾒ */
    public final Number mo2131(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2003;
        int i3 = i2 + 119;
        f2004 = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = number instanceof Double;
            throw null;
        }
        if (!(!(number instanceof Double)) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() / number2.doubleValue());
        }
        if (!(number instanceof Long)) {
            int i4 = i2 + 83;
            f2004 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z2 = number2 instanceof Long;
                throw null;
            }
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() / number2.intValue());
            }
        }
        return Long.valueOf(number.longValue() / number2.longValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2004 + 83;
        f2003 = i2 % 128;
        return m2141("叢反\uea3c碳텇", i2 % 2 == 0 ? View.combineMeasuredStates(0, 1) : View.combineMeasuredStates(0, 0)).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2141(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2005, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2005));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
