package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ct extends cx {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1534 = 195;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1535 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1536;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1752(co coVar, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        int i = 2 % 2;
        boolean zBooleanValue2 = false;
        String str = (String) m1770(list, 0, String.class);
        String string = new StringBuilder().append(coVar.m1624()).append(m1751("\u0000", 1 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 253, false, View.getDefaultSize(0, 0) + 1).intern()).append(Integer.toHexString(str.hashCode())).toString();
        Throwable th = (Throwable) m1770(list, 1, Throwable.class);
        if (list.size() > 2) {
            int i2 = f1535 + 121;
            f1536 = i2 % 128;
            int i3 = i2 % 2;
            if (m1769(list, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) m1770(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    int i4 = f1535 + 33;
                    f1536 = i4 % 128;
                    if (i4 % 2 == 0 ? m1769(list, 3, Boolean.class) : m1769(list, 5, Boolean.class)) {
                        zBooleanValue2 = ((Boolean) m1770(list, 3, Boolean.class)).booleanValue();
                    }
                }
                zBooleanValue = zBooleanValue2;
                jSONObject = jSONObject2;
            } else {
                zBooleanValue = m1769(list, 2, Boolean.class) ? ((Boolean) m1770(list, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            jz.m2767(coVar.m1624(), str, string, th, jSONObject, zBooleanValue);
            int i5 = f1535 + 11;
            f1536 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jz.m2767(coVar.m1624(), str, string, th, null, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1751(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1534);
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
