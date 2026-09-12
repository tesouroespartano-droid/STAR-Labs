package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class am {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f351 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f352 = 1058;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f353 = 19075;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f354 = 40155;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f355 = 26734;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f356;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m443(Map<String, String> map, String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = f356 + 59;
        f351 = i3 % 128;
        int i4 = i3 % 2;
        if (map.containsKey(str)) {
            return false;
        }
        int size = map.size();
        if (m442(map)) {
            int i5 = f351 + 99;
            f356 = i5 % 128;
            int i6 = i5 % 2;
            i = 1;
        } else {
            i = 0;
        }
        return size >= 5 + i;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m442(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f356 + 5;
        f351 = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsKey = map.containsKey(m445("蟸麁ꮜ絩搜\udf6b丢ⷸꚃ柸ྮ劦榎Ў", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12).intern());
        int i4 = f356 + 1;
        f351 = i4 % 128;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m444(String str) {
        int i = 2 % 2;
        int i2 = f351 + 121;
        f356 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = m445("蟸麁ꮜ絩搜\udf6b丢ⷸꚃ柸ྮ劦榎Ў", KeyEvent.getDeadChar(0, 0) + 13).intern().equals(str);
        int i4 = f351 + 77;
        f356 = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m441(String str, String str2) {
        int i = 2 % 2;
        int i2 = f356 + 39;
        f351 = i2 % 128;
        int i3 = i2 % 2;
        if ((!kb.m2789(str, 64)) || !kb.m2789(str2, 64)) {
            return false;
        }
        int i4 = f356 + 1;
        int i5 = i4 % 128;
        f351 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 7;
        f356 = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m445(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f354)) ^ ((c2 >>> 5) + f353)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f352) ^ ((c3 + i2) ^ ((c3 << 4) + f355))));
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
