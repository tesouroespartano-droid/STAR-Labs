package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public final class cn {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1369 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1370 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1371 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1372 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1373 = 1088536058;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m1578(String str, String str2) {
        int i = 2 % 2;
        n.m2882(new StringBuilder().append(m1577("Ⲝ눈痏≆", ViewConfiguration.getTouchSlop() >> 8, "\udf01朙偪\ufe75", "\u0000\u0000\u0000\u0000", (char) (30032 - ((Process.getThreadPriority(0) + 20) >> 6))).intern()).append(str).toString(), str2);
        int i2 = f1369 + 67;
        f1370 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m1575(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f1369 + 53;
        f1370 = i2 % 128;
        int i3 = i2 % 2;
        m1576(str, str2, th);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1576(String str, String str2, Throwable th) {
        int i = 2 % 2;
        jz.m2767(new StringBuilder().append(m1577("࠷\ue859번\udd9f", TextUtils.indexOf((CharSequence) "", '0') + 1, "䠶ﵖ辥\ua4c7", "\u0000\u0000\u0000\u0000", (char) (51087 - View.getDefaultSize(0, 0))).intern()).append(str).toString(), str2, Integer.toHexString(str2.hashCode()), th, null, false);
        int i2 = f1370 + 75;
        f1369 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1577(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1371) ^ ((long) f1373)) ^ ((long) f1372));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
