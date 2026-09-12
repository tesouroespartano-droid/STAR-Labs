package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bh extends bg {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f816 = -5462032364330383224L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f817 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f818 = 1;

    public bh(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f818 + 73;
        f817 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m821("\uee62뉖鉐\uee27轂㪐茁ᚘ찎ᢻꄤ", TextUtils.getOffsetBefore("", 0)).intern();
        int i4 = f817 + 93;
        f818 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f818 + 17;
        f817 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
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
        int i2 = f817 + 13;
        f818 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo802() {
        int i = 2 % 2;
        int i2 = f817 + 17;
        f818 = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo804() {
        int i = 2 % 2;
        int i2 = f818;
        int i3 = i2 + 27;
        f817 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        f817 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m821(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f816, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f816));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
