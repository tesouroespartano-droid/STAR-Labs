package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public final class dn {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1801 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1802 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1803 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1804 = 39758;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1805;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1806;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1807;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static dn m1990(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f1802 + 39;
        f1801 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            t.m2942().m2959();
            super.hashCode();
            throw null;
        }
        if (!t.m2942().m2959()) {
            return null;
        }
        dn dnVar = new dn(str, i);
        int i4 = f1802 + 51;
        f1801 = i4 % 128;
        if (i4 % 2 != 0) {
            return dnVar;
        }
        throw null;
    }

    private dn(String str, int i) {
        this.f1807 = str;
        this.f1806 = i;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m1992() {
        int i = 2 % 2;
        int i2 = f1801 + 115;
        f1802 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1806;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1807).append(m1991("슦", Color.alpha(0) + 1759085552, "\uf03b\ud983遨䲶", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf("", "") + 46736)).intern()).append(this.f1806).toString();
        int i2 = f1801 + 43;
        f1802 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1991(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1803) ^ ((long) f1805)) ^ ((long) f1804));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
