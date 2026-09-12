package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public final class fa extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2049 = 54955;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2050 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2051;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2052;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2053;

    public fa(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ｋ */
    final boolean mo2132(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            return false;
        }
        int i3 = f2050 + 55;
        int i4 = i3 % 128;
        f2052 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        f2050 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo2133(String str, String str2) {
        int i = 2 % 2;
        if (str.equals(str2)) {
            return false;
        }
        int i2 = f2050 + 25;
        int i3 = i2 % 128;
        f2052 = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 63;
        f2050 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo2134(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f2052;
        int i3 = i2 + 77;
        int i4 = i3 % 128;
        f2050 = i4;
        if (i3 % 2 == 0) {
            Object obj3 = null;
            super.hashCode();
            throw null;
        }
        if (obj != obj2) {
            int i5 = i4 + 3;
            f2052 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 47;
        f2050 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2050 + 65;
        f2052 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2148("뭦\ue49a", ViewConfiguration.getTouchSlop() >> 8, "➭㗣ვ㬎", "\u0000\u0000\u0000\u0000", (char) (3600 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern();
        int i4 = f2052 + 87;
        f2050 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2148(String str, int i, String str2, String str3, char c) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (g.f2155) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2053) ^ ((long) f2051)) ^ ((long) f2049));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
