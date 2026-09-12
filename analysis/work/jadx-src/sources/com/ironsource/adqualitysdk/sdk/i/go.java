package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.IronSource;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class go extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2226 = {'1', 'i', 'n', 'M', 'K', 'm', 'p', 'n', 'p', 'q', 'r', 's', 'j', 'd', 'I', 'M', 'i', 'd', 'f', 'e', 'j', 'n', 'l', 'n', 'p', 'k', 'g', 'L', ';', ']', 'p', 'n', '`', 'a', 'r', 's', 'j', 'd', '[', 187, 190, 188, 190, 191, 192, 193, 184, 178};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2227 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2228;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2228 + 87;
        f2227 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2195(new int[]{0, 38, 0, 0}, false, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern();
        int i4 = f2228 + InterfaceC0280i1.d.b.b;
        f2227 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2228;
        int i3 = i2 + 25;
        f2227 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 67;
        f2227 = i4 % 128;
        if (i4 % 2 != 0) {
            return IronSource.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bu buVar = new bu(mo2168());
        int i2 = f2228 + 105;
        f2227 = i2 % 128;
        int i3 = i2 % 2;
        return buVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2227 + 89;
        f2228 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2195(new int[]{38, 10, 78, 0}, false, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern();
        int i4 = f2227 + 37;
        f2228 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2195(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (j.f2691) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f2226, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                    }
                    c = cArr2[j.f2692];
                    j.f2692++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                    j.f2692++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                    j.f2692++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
