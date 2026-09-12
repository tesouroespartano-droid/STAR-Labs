package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class fl extends fe<String> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2077 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2078 = 38235;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2079 = 32955;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2080 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2081 = 13610;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2082 = 23442;

    public fl(String str, dn dnVar) {
        super(dx.m2086(str), dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fe
    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2155("\uf7f4㤟", 1 - View.resolveSizeAndState(0, 0, 0)).intern()).append(super.toString()).append(m2155("\uf7f4㤟", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()).toString();
        int i2 = f2080 + 37;
        f2077 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2155(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2081)) ^ ((c2 >>> 5) + f2078)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2079) ^ ((c3 + i2) ^ ((c3 << 4) + f2082))));
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
