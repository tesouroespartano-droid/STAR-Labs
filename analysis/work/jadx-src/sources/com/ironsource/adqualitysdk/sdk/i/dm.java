package com.ironsource.adqualitysdk.sdk.i;

import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dm {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1793 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1794;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1795 = {'l', 210, 209, Typography.times, 207, 208, 219, '6', 'n', 'n', 'h', 'i', 'n', ';', Ascii.MAX, 137, 140, 132, ';', 'n', 'g', 'o', 'l', 'c', 'n', ':', 't', 'l', 'U', '^', 'v', 's', 'i', 'U', '^'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1796;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1797;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1798;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1799;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1800;

    public dm(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1798 = jSONObject.optString(m1984(new int[]{0, 7, InterfaceC0280i1.d.b.d, 0}, true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern());
            this.f1800 = jSONObject.optString(m1984(new int[]{7, 6, 0, 3}, false, "\u0001\u0000\u0001\u0001\u0000\u0000").intern());
            this.f1796 = jSONObject.optString(m1984(new int[]{13, 5, 22, 0}, true, "\u0001\u0001\u0000\u0000\u0001").intern());
            this.f1799 = jSONObject.optString(m1984(new int[]{18, 7, 0, 7}, true, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern());
            this.f1797 = jSONObject.optBoolean(m1984(new int[]{25, 10, 0, 0}, false, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001").intern());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1987() {
        int i = 2 % 2;
        int i2 = f1793;
        int i3 = i2 + 81;
        f1794 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1798;
        int i5 = i2 + 121;
        f1794 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1986() {
        int i = 2 % 2;
        int i2 = f1794 + 107;
        int i3 = i2 % 128;
        f1793 = i3;
        int i4 = i2 % 2;
        String str = this.f1800;
        int i5 = i3 + 47;
        f1794 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1989() {
        String str;
        int i = 2 % 2;
        int i2 = f1794 + 107;
        int i3 = i2 % 128;
        f1793 = i3;
        if (i2 % 2 == 0) {
            str = this.f1796;
            int i4 = 10 / 0;
        } else {
            str = this.f1796;
        }
        int i5 = i3 + 3;
        f1794 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1985() {
        int i = 2 % 2;
        int i2 = f1794;
        int i3 = i2 + 99;
        f1793 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1799;
        int i4 = i2 + 37;
        f1793 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m1988() {
        int i = 2 % 2;
        int i2 = f1793 + 47;
        int i3 = i2 % 128;
        f1794 = i3;
        int i4 = i2 % 2;
        boolean z = this.f1797;
        int i5 = i3 + 123;
        f1793 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1984(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1795, i, cArr, 0, i2);
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
