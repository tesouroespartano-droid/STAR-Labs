package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class js {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2901 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2902 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2903 = 14;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m2697(String str, at atVar, boolean z, ao aoVar) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(m2696("\u0007\ufffa", 2 - Color.blue(0), 122 - TextUtils.indexOf("", "", 0), true, Color.blue(0) + 2).intern(), true);
            } catch (JSONException e) {
                n.m2873(m2696("\u0002\u000b\u0011￤\u0002\u000b\u0002\u000f\ufffe\u0011\f\u000f\uffde\u0001￮\u0012\ufffe\t\u0006\u0011\u0016\ufff0￡￨￢\u0013", 12 - KeyEvent.keyCodeFromString(""), MotionEvent.axisFromString("") + 114, false, 26 - ExpandableListView.getPackedPositionType(0L)).intern(), m2696("\u0014\uffc0\u0015\u0010\u0004\u0001\u0014\u0005\uffc0\u0014\t\r\u0005\uffc0\u0014\u000f\uffc0\n\u0013\u000f\u000e￥\u0012\u0012\u000f\u0012\uffc0\u0001\u0004\u0004\t\u000e\u0007\uffc0\u0006\t\u0012\u0013\u0014\uffc0\t\u000e\u0013\u0014\u0001\f\fￏ\f\u0001\u0013", 21 - View.MeasureSpec.makeMeasureSpec(0, 0), 110 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), false, Drawable.resolveOpacity(0, 0) + 51).intern(), (Throwable) e);
            }
        }
        if (aoVar.m456()) {
            int i2 = f2901 + 77;
            f2902 = i2 % 128;
            int i3 = i2 % 2;
            jSONObject.put(m2696("\ufffe\ufff9\ufff6\n\t", 2 - TextUtils.getTrimmedLength(""), 121 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5).intern(), true);
        }
        jSONObject.put(m2696("\u0004\t�\ufff8", 4 - TextUtils.getTrimmedLength(""), 122 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, 4 - ExpandableListView.getPackedPositionType(0L)).intern(), str);
        kd.m2828(jSONObject, atVar.m625());
        kd.m2828(jSONObject, atVar.m623());
        int i4 = f2901 + 123;
        f2902 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObject;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2696(String str, int i, int i2, boolean z, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (e.f1919) {
            char[] cArr2 = new char[i3];
            e.f1921 = 0;
            while (e.f1921 < i3) {
                e.f1920 = cArr[e.f1921];
                cArr2[e.f1921] = (char) (e.f1920 + i2);
                int i4 = e.f1921;
                cArr2[i4] = (char) (cArr2[i4] - f2903);
                e.f1921++;
            }
            if (i > 0) {
                e.f1918 = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - e.f1918, e.f1918);
                System.arraycopy(cArr3, e.f1918, cArr2, 0, i3 - e.f1918);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                e.f1921 = 0;
                while (e.f1921 < i3) {
                    cArr4[e.f1921] = cArr2[(i3 - e.f1921) - 1];
                    e.f1921++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
