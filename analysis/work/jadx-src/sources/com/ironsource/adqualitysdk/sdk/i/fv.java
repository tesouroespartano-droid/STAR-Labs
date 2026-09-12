package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class fv extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2132 = {'E', 145, 150, 'u', 's', 149, 152, 150, 152, 153, 154, 155, 146, 140, 'q', 'o', 138, 146, 155, 147, 142, 146, 150, 158, 158, 147, 143, 't', 'x', 147, 143, 't', 'c', 133, 152, 150, 136, 137, 154, 155, 146, 140, '{', 'z', 130, 139, 147, 142, 146, 150, 158, '0', 'd', 'm', 'r', 'j', 'b', 'k', 'u', 'k', 'l', 'm', 'b', 'b', 'd', 'k'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2133 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2134;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2134 + 55;
        f2133 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2167(new int[]{0, 51, 40, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001") : m2167(new int[]{0, 51, 40, 0}, false, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001")).intern();
        int i3 = f2134 + 125;
        f2133 = i3 % 128;
        if (i3 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2133;
        int i3 = i2 + 21;
        f2134 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        f2134 = i5 % 128;
        int i6 = i5 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final bg mo2171() {
        int i = 2 % 2;
        bd bdVar = new bd(mo2168());
        int i2 = f2133 + 107;
        f2134 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return bdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2133 + 7;
        f2134 = i2 % 128;
        return (i2 % 2 != 0 ? m2167(new int[]{51, 15, 0, 6}, false, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001") : m2167(new int[]{51, 15, 0, 6}, true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001")).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2167(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f2132, i, cArr, 0, i2);
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
