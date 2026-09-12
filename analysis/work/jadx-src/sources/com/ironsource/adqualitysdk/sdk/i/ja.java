package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ja {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2693 = 65168;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2694 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2695 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2696 = 53691;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2697 = 64170;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2698 = 23171;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2699;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject f2700;

    ja(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    ja(JSONObject jSONObject, String str) {
        this.f2700 = jSONObject;
        this.f2699 = str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2548() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m2547("洊\u2b75钱⭢歖ꮲ풰\ue368", KeyEvent.normalizeMetaState(0) + 8).intern(), this.f2700);
        jSONObject.put(m2547("葊\udc5a蒃ᡊ", TextUtils.lastIndexOf("", '0') + 5).intern(), this.f2699);
        int i2 = f2695 + 99;
        f2694 = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObject;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m2549() {
        int i = 2 % 2;
        int i2 = f2695 + 35;
        int i3 = i2 % 128;
        f2694 = i3;
        int i4 = i2 % 2;
        JSONObject jSONObject = this.f2700;
        int i5 = i3 + 3;
        f2695 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2550() {
        int i = 2 % 2;
        int i2 = f2694 + 37;
        int i3 = i2 % 128;
        f2695 = i3;
        int i4 = i2 % 2;
        String str = this.f2699;
        int i5 = i3 + 119;
        f2694 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2547(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2697)) ^ ((c2 >>> 5) + f2693)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2696) ^ ((c3 + i2) ^ ((c3 << 4) + f2698))));
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
