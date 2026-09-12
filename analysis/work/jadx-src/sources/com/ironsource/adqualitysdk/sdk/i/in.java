package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class in {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2583 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2584 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2585 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2586 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2587;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Object> f2588;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Integer> f2589;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Integer> f2590;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2591;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static void m2479() {
        f2583 = (char) 63555;
        f2587 = (char) 41427;
        f2585 = (char) 63206;
        f2591 = (char) 54332;
    }

    static {
        m2479();
        f2588 = new HashMap();
        f2590 = new HashMap();
        f2589 = new HashMap();
        int i = f2584 + 71;
        f2586 = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2481(Context context, String str, JSONObject jSONObject, Object... objArr) {
        int i = 2 % 2;
        ii.m2456(context).m2465(new Intent(str).putExtra(ij.f2528, jSONObject.toString()));
        int i2 = f2584 + 43;
        f2586 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2480(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2583)) ^ ((c2 >>> 5) + f2585)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2587) ^ ((c3 + i2) ^ ((c3 << 4) + f2591))));
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
