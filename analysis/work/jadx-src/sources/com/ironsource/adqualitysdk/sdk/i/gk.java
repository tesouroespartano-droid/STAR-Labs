package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2205 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2206 = {'7', 'n', 'i', 'I', 'Q', 'r', 'p', 'q', 'k', 'd', 'i', 30, Typography.less, '?'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2207;

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo2168();

    /* JADX INFO: renamed from: ｋ */
    public abstract Class mo2169();

    /* JADX INFO: renamed from: ﾇ */
    public abstract String mo2170();

    /* JADX INFO: renamed from: ﾒ */
    public abstract bg mo2171();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final jc.c m2190() {
        int i = 2 % 2;
        int i2 = f2207 + 81;
        f2205 = i2 % 128;
        int i3 = i2 % 2;
        if (!ar.m480().mo492().m479()) {
            return new jc.c(new StringBuilder().append(m2189(new int[]{0, 11, 0, 3}, true, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001").intern()).append(mo2168()).toString(), m2189(new int[]{11, 3, 13, 0}, true, "\u0001\u0000\u0001").intern());
        }
        int i4 = f2207 + 17;
        f2205 = i4 % 128;
        if (i4 % 2 == 0) {
            TextUtils.isEmpty(ar.m480().mo492().m478(mo2168()));
            throw null;
        }
        String strM478 = ar.m480().mo492().m478(mo2168());
        if (!TextUtils.isEmpty(strM478)) {
            return new jc.d(new StringBuilder().append(m2189(new int[]{0, 11, 0, 3}, true, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001").intern()).append(mo2168()).toString(), m2189(new int[]{11, 3, 13, 0}, true, "\u0001\u0000\u0001").intern(), strM478);
        }
        int i5 = f2205 + 75;
        f2207 = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2189(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f2206, i, cArr, 0, i2);
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
