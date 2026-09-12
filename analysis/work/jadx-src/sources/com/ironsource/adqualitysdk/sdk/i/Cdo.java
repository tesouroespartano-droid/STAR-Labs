package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class Cdo {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1808 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1809 = {'7', 'a', '^', 'm', 'k', 'c', 'b', 'h', 'g', 'e', 134, 261, 262, 263, 253, 257, 261, 255, 241, '}', 256, 258, 261, 259, 256};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1810;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1811;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1812;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1813;

    public Cdo(JSONObject jSONObject) {
        this.f1811 = jSONObject.optBoolean(m1993(new int[]{0, 10, 0, 7}, false, "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000").intern());
        this.f1813 = jSONObject.optBoolean(m1993(new int[]{10, 9, 154, 5}, true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000").intern());
        this.f1812 = dx.m2086(jSONObject.optString(m1993(new int[]{19, 6, 151, 0}, true, "\u0001\u0001\u0001\u0000\u0001\u0000").intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m1994() {
        int i = 2 % 2;
        int i2 = f1808 + 79;
        f1810 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.f1811;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m1996() {
        int i = 2 % 2;
        int i2 = f1808 + 39;
        int i3 = i2 % 128;
        f1810 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.f1813;
        int i4 = i3 + 121;
        f1808 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1995() {
        int i = 2 % 2;
        int i2 = f1808;
        int i3 = i2 + InterfaceC0280i1.d.b.d;
        f1810 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1812;
        int i5 = i2 + 107;
        f1810 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1993(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1809, i, cArr, 0, i2);
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
