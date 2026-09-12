package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class jw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2922 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2923 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2924 = {-910533536, -1306662308, -77009230, -1070204325, -1555938481, 161563964, 101628754, -1891352083, 2041503236, -233717110, -1728199590, 104309538, 723369741, -931794329, -955028294, 172468647, 1235963686, -1806797779};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2718(String str) {
        int i = 2 % 2;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m2719(new int[]{4120152, -708370713, -2057868425, -181516551, -194371485, -1643310531, 529977050, 175915964, -1970249473, -355815966, 831249877, 824903936, 1378595271, -1017996099, -1002153011, 1330985052, 2038056807, -2026773936}, Color.blue(0) + 34).intern().getBytes(m2719(new int[]{-1013845493, 1065963007, -57290623, -393784622}, 4 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()), mac.getAlgorithm()));
            String strM2446 = Cif.m2446(mac.doFinal(str.replaceAll(m2719(new int[]{-2021786767, 314667708}, -ImageFormat.getBitsPerPixel(0)).intern(), "").replaceAll(m2719(new int[]{335858583, 1729022139}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), "").getBytes(m2719(new int[]{-1013845493, 1065963007, -57290623, -393784622}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5).intern())));
            int i2 = f2923 + 23;
            f2922 = i2 % 128;
            int i3 = i2 % 2;
            return strM2446;
        } catch (Exception e) {
            n.m2887(m2719(new int[]{1155465172, -227570482, -170062840, 584831469, 676494584, 711698564}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern(), new StringBuilder().append(m2719(new int[]{-672917326, -1377121515, 1578977556, -352490439}, 7 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).append(e.getLocalizedMessage()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2719(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2924.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
                cArr[0] = (char) (c.f1232 >>> 16);
                cArr[1] = (char) c.f1232;
                cArr[2] = (char) (c.f1233 >>> 16);
                cArr[3] = (char) c.f1233;
                c.m1415(iArr2);
                cArr2[c.f1231 << 1] = cArr[0];
                cArr2[(c.f1231 << 1) + 1] = cArr[1];
                cArr2[(c.f1231 << 1) + 2] = cArr[2];
                cArr2[(c.f1231 << 1) + 3] = cArr[3];
                c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
