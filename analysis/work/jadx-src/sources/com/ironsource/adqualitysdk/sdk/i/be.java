package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class be extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f787 = 10483;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f788 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f789;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f790;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f791;

    public be(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f791 + 75;
        f788 = i2 % 128;
        return (i2 % 2 == 0 ? m803("䏡涒뷏옰柬\ue57b곝", TextUtils.getOffsetAfter("", 0) * 341833554, "勽忷怔ꝇ", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getScrollBarSize() + 9)) : m803("䏡涒뷏옰柬\ue57b곝", 341833554 - TextUtils.getOffsetAfter("", 0), "勽忷怔ꝇ", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getScrollBarSize() >> 8))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f788;
        int i3 = i2 + 1;
        f791 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 107;
        f791 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f791 + 125;
        f788 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo802() {
        int i = 2 % 2;
        int i2 = f791 + 77;
        int i3 = i2 % 128;
        f788 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        f791 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean mo804() {
        int i = 2 % 2;
        int i2 = f791;
        int i3 = i2 + 85;
        f788 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        f788 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m803(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f790) ^ ((long) f789)) ^ ((long) f787));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
