package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ap extends ar.AnonymousClass3 {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f374 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f375 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f376 = 35051;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f377 = 48103;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f378 = 36052;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f379 = 51606;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m472() {
        JSONObject jSONObjectM514;
        String strM471;
        int i = 2 % 2;
        int i2 = f375 + 119;
        f374 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM514 = m514();
            strM471 = m471("篈嚨㒛䍳", 4 / ExpandableListView.getPackedPositionType(1L));
        } else {
            jSONObjectM514 = m514();
            strM471 = m471("篈嚨㒛䍳", ExpandableListView.getPackedPositionType(0L) + 3);
        }
        return jSONObjectM514.optString(strM471.intern());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m473(String str) {
        int i = 2 % 2;
        int i2 = f375 + 19;
        f374 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectM474 = m474();
            if (jSONObjectM474 != null) {
                return jSONObjectM474.opt(str);
            }
            int i3 = f375 + 95;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        m474();
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m474() {
        JSONObject jSONObjectM514;
        String strM471;
        int i = 2 % 2;
        int i2 = f374 + 73;
        f375 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM514 = m514();
            strM471 = m471("籹캑갍\udc01䆕왇", 5 << (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)));
        } else {
            jSONObjectM514 = m514();
            strM471 = m471("籹캑갍\udc01䆕왇", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5);
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectM514.optJSONObject(strM471.intern());
        int i3 = f374 + InterfaceC0280i1.d.b.g;
        f375 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m471(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f376)) ^ ((c2 >>> 5) + f379)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f378) ^ ((c3 + i2) ^ ((c3 << 4) + f377))));
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
