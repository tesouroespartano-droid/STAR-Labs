package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class eq extends el {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1997 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1998 = 27642;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1999 = 46093;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2000 = 11374;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2001 = 29468;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2002;

    public eq(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ｋ */
    final boolean mo2132(int i) {
        int i2 = 2 % 2;
        int i3 = f2002;
        int i4 = i3 + InterfaceC0280i1.d.b.b;
        int i5 = i4 % 128;
        f1997 = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            int i6 = i3 + 125;
            f1997 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i5 + 13;
        f2002 = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo2133(String str, String str2) {
        int i = 2 % 2;
        int i2 = f1997 + 123;
        f2002 = i2 % 128;
        if (i2 % 2 == 0) {
            return str.equals(str2);
        }
        str.equals(str2);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo2134(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj == obj2) {
            int i2 = f2002 + 37;
            f1997 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1997 + 89;
        f2002 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2002 + 5;
        f1997 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2140("亮㘷", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1).intern();
        int i4 = f1997 + 83;
        f2002 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2140(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1999)) ^ ((c2 >>> 5) + f2000)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2001) ^ ((c3 + i2) ^ ((c3 << 4) + f1998))));
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
