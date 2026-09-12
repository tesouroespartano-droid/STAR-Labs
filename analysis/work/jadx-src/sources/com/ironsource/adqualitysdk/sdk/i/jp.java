package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2878 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2879 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2880 = 6591366580196471031L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2881 = {-451049720, 1469628649, -1192964313, 639516727, 745389693, -128995142, -979279071, -905943564, -632106364, -1151859176, -1175317842, 574222632, -1105495068, -2058033674, -1469215915, -1849701088, -1434283344, 840293051};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2882;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2883;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ao f2884;

    public jp(Context context, ao aoVar, long j) {
        this.f2882 = context;
        this.f2884 = aoVar;
        this.f2883 = j;
        new gn(context);
    }

    /* JADX INFO: renamed from: ﻐ */
    public JSONObject mo320(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        int i = 2 % 2;
        int i2 = f2879 + 15;
        f2878 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectM2826 = kd.m2826(jSONObject);
        jSONObjectM2826.put(m2674("\uf096ࣀ\tᡩᆎ⧭", KeyEvent.normalizeMetaState(0) + 63559).intern(), this.f2884.m462());
        String strM469 = this.f2884.m469();
        if (!TextUtils.isEmpty(strM469)) {
            jSONObjectM2826.put(m2674("\uf09e帽귷ﲿ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44728).intern(), strM469);
        }
        if (z2) {
            if (this.f2883 > 0) {
                jSONObjectM2826.put(m2674("\uf09bᶣ⫭㜡", 60727 - Color.blue(0)).intern(), this.f2883);
            }
            jSONObjectM2826.put(m2675(new int[]{300425022, -1416656275, 1342616086, -1283500026}, 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), this.f2884.m461());
            jSONObjectM2826.put(m2675(new int[]{-805082722, 415892814}, ((Process.getThreadPriority(0) + 20) >> 6) + 3).intern(), this.f2884.m455());
            jSONObjectM2826.put(m2674("\uf082\ue797\ude81", 5897 - Gravity.getAbsoluteGravity(0, 0)).intern(), this.f2884.m467());
            jSONObjectM2826.put(m2674("\uf082狗", 33347 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), this.f2884.m466());
            jSONObjectM2826.put(m2675(new int[]{1936755061, -1606990868}, (Process.myTid() >> 22) + 2).intern(), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM2826.put(m2675(new int[]{-1324200895, 2002474777, -1409075798, -2005409179}, (ViewConfiguration.getTapTimeout() >> 16) + 5).intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM2826.put(m2675(new int[]{-1816353444, 609896188}, Drawable.resolveOpacity(0, 0) + 1).intern(), ju.m2705());
            jSONObjectM2826.put(m2674("\uf09a㉗甍룿ﮧ", 49871 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), Build.MODEL);
            jSONObjectM2826.put(m2675(new int[]{-1805489178, 1782220078, 1524668691, -426319542, -833869034, 1305922450}, 12 - View.getDefaultSize(0, 0)).intern(), Build.MANUFACTURER);
            jSONObjectM2826.put(m2675(new int[]{2078384200, -881936756, 392350226, 1794896354}, MotionEvent.axisFromString("") + 9).intern(), m2674("\uf096雪㱵쏜楔\uf0a1阡", 26227 - KeyEvent.normalizeMetaState(0)).intern());
            jSONObjectM2826.put(m2674("\uf098楓쌯", 39383 - TextUtils.getTrimmedLength("")).intern(), jx.m2726());
            ju.m2708(this.f2882, jSONObjectM2826);
            jx.m2730(this.f2882, jSONObjectM2826);
            jx.m2724(this.f2882, jSONObjectM2826, z3);
            jx.m2736(jSONObjectM2826);
            jx.m2732(jSONObjectM2826);
            jSONObjectM2826.put(m2675(new int[]{-51078130, 248768045}, (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern(), z);
            jx.m2741(this.f2882, jSONObjectM2826);
            jx.m2725(jSONObjectM2826);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f2884.m458());
                jSONObject2.remove(m2674("\uf096ᾼ⻘㴥䰢孲殄竊觐頲ꝍ랝욡", 61231 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                if (jSONObject2.length() > 0) {
                    jSONObjectM2826.putOpt(m2675(new int[]{-175548464, -162644985}, Color.rgb(0, 0, 0) + 16777220).intern(), jSONObject2);
                    int i4 = f2879 + 23;
                    f2878 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (Exception e) {
                n.m2873(m2675(new int[]{-1770558641, 463092840, 1285171667, 682650385, -1347734561, 1133352514, -474682454, 1261917178, -72301484, -2144180123, -231244433, -2017985872, -1409075798, -2005409179}, TextUtils.lastIndexOf("", '0') + 26).intern(), m2674("\uf0b2놤狇㏻\uf401땲癐㝴鍊몷篓㳻ﵛ븷罜\u206c\ue286ꏦ擁◥\ue617ꜣ栁⥪\ueb9c겡淃⺬\uef1f逥儉ቭ풡闓囻ᜀ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16672).intern(), (Throwable) e);
            }
        }
        int i6 = f2878 + 45;
        f2879 = i6 % 128;
        int i7 = i6 % 2;
        return jSONObjectM2826;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ao m2676() {
        int i = 2 % 2;
        int i2 = f2878 + 35;
        int i3 = i2 % 128;
        f2879 = i3;
        int i4 = i2 % 2;
        ao aoVar = this.f2884;
        int i5 = i3 + 95;
        f2878 = i5 % 128;
        int i6 = i5 % 2;
        return aoVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2674(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2880);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2675(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2881.clone();
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
