package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cs extends cx {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1526 = 46495;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1527 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1528 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1529;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1530;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1739(co coVar, List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 99;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        coVar.m1636((String) m1770(list, 0, String.class), (JSONObject) m1770(list, 1, JSONObject.class));
        int i4 = f1528 + 69;
        f1530 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1749(final co coVar, List<Object> list, final dq dqVar) {
        final du duVar;
        int i = 2 % 2;
        int i2 = f1528 + 99;
        f1530 = i2 % 128;
        if (i2 % 2 != 0) {
            duVar = (du) m1770(list, 0, du.class);
            if (duVar == null) {
                return null;
            }
        } else {
            duVar = (du) m1770(list, 0, du.class);
            if (duVar == null) {
                return null;
            }
        }
        coVar.m1634(new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.cs.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﻐ */
            public final JSONObject mo638(String str, JSONObject jSONObject) {
                return (JSONObject) duVar.m2081(dqVar, coVar, Arrays.asList(str, jSONObject)).m2019();
            }
        });
        int i3 = f1530 + 77;
        f1528 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1742(co coVar) {
        int i = 2 % 2;
        int i2 = f1528 + 57;
        f1530 = i2 % 128;
        if (i2 % 2 != 0) {
            coVar.m1637();
            throw null;
        }
        cp cpVarM1637 = coVar.m1637();
        int i3 = f1528 + 31;
        f1530 = i3 % 128;
        int i4 = i3 % 2;
        return cpVarM1637;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1738(co coVar) {
        int i = 2 % 2;
        int i2 = f1528 + 43;
        f1530 = i2 % 128;
        if (i2 % 2 != 0) {
            coVar.m1633();
            throw null;
        }
        Context contextM1633 = coVar.m1633();
        int i3 = f1528 + 67;
        f1530 = i3 % 128;
        int i4 = i3 % 2;
        return contextM1633;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m1741() {
        int i = 2 % 2;
        int i2 = f1530 + 41;
        f1528 = i2 % 128;
        if (i2 % 2 == 0) {
            jv.m2711();
            throw null;
        }
        long jM2711 = jv.m2711();
        int i3 = f1530 + InterfaceC0280i1.d.b.i;
        f1528 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return jM2711;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m1746() {
        int i = 2 % 2;
        int i2 = f1528 + 59;
        f1530 = i2 % 128;
        if (i2 % 2 == 0) {
            ih ihVarM1720 = m1720();
            return kd.m2818(ihVarM1720.m2454(), ihVarM1720.m2452(), ihVarM1720.m2453(), ihVarM1720.m2455());
        }
        ih ihVarM1721 = m1720();
        kd.m2818(ihVarM1721.m2454(), ihVarM1721.m2452(), ihVarM1721.m2453(), ihVarM1721.m2455());
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static long m1747() {
        int i = 2 % 2;
        int i2 = f1530 + 19;
        f1528 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1720().m2453();
        }
        m1720().m2453();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Activity m1734() {
        int i = 2 % 2;
        int i2 = f1530 + 107;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        Activity activityMo2651 = jj.m2645().mo2651();
        int i4 = f1528 + 39;
        f1530 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return activityMo2651;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static dg m1737() {
        int i = 2 % 2;
        dg dgVar = new dg();
        int i2 = f1528 + 81;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        return dgVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static dk m1726() {
        int i = 2 % 2;
        dk dkVar = new dk();
        int i2 = f1528 + 55;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        return dkVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static dj m1731() {
        int i = 2 % 2;
        dj djVar = new dj();
        int i2 = f1530 + 93;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        return djVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static di m1728() {
        int i = 2 % 2;
        di diVar = new di();
        int i2 = f1528 + 79;
        f1530 = i2 % 128;
        if (i2 % 2 == 0) {
            return diVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m1736(co coVar) {
        int i = 2 % 2;
        int i2 = f1528 + 49;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        String strM1696 = coVar.m1637().m1696();
        int i4 = f1530 + 13;
        f1528 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1696;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m1745(co coVar) {
        int i = 2 % 2;
        int i2 = f1530 + InterfaceC0280i1.d.b.d;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        cp cpVarM1637 = coVar.m1637();
        if (i3 != 0) {
            return cpVarM1637.m1693();
        }
        cpVarM1637.m1693();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String m1732() {
        int i = 2 % 2;
        int i2 = f1528 + 27;
        f1530 = i2 % 128;
        if (i2 % 2 == 0) {
            return IronSourceAdQuality.getSDKVersion();
        }
        IronSourceAdQuality.getSDKVersion();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static JSONObject m1730() {
        int i = 2 % 2;
        int i2 = f1528 + 107;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2826 = kd.m2826(ar.m480().m514());
        int i4 = f1530 + 85;
        f1528 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM2826;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1750(List<Object> list) {
        String str;
        List<Object> list2;
        at atVarM2957;
        int i = 2 % 2;
        int i2 = f1528 + 23;
        f1530 = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) m1770(list, 1, String.class);
            list2 = m1772(list, 0);
            atVarM2957 = t.m2942().m2957();
            if (atVarM2957 == null) {
                return null;
            }
        } else {
            str = (String) m1770(list, 0, String.class);
            list2 = m1772(list, 1);
            atVarM2957 = t.m2942().m2957();
            if (atVarM2957 == null) {
                return null;
            }
        }
        int i3 = f1530 + 99;
        f1528 = i3 % 128;
        if (i3 % 2 != 0) {
            atVarM2957.m628(str, list2);
            return null;
        }
        atVarM2957.m628(str, list2);
        int i4 = 64 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m1748(co coVar) {
        int i = 2 % 2;
        int i2 = f1530 + 85;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM1625 = coVar.m1625();
        int i4 = f1530 + 77;
        f1528 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM1625;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String m1733(co coVar) {
        int i = 2 % 2;
        int i2 = f1528 + 9;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        String strM1698 = coVar.m1637().m1698();
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = f1530 + InterfaceC0280i1.d.b.g;
        f1528 = i5 % 128;
        int i6 = i5 % 2;
        return strM1698;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1740(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + InterfaceC0280i1.d.b.d;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        n.m2874(m1743("确ܸ譕짰䷭繘\uefd6\u128f\ue9db뭔뉣拴", KeyEvent.keyCodeFromString(""), "旝菈ᇝ尶", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), (String) m1770(list, 0, String.class));
        int i4 = f1528 + 27;
        f1530 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static boolean m1724() {
        int i = 2 % 2;
        int i2 = f1528 + 89;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        boolean zMo498 = ar.m480().mo498();
        int i4 = f1528 + 45;
        f1530 = i4 % 128;
        int i5 = i4 % 2;
        return zMo498;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m1744(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1528 + InterfaceC0280i1.d.b.g;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = ISAdQualityAdType.fromInt(((Integer) m1770(list, 0, Integer.class)).intValue()).name().toLowerCase();
        int i4 = f1528 + 107;
        f1530 = i4 % 128;
        if (i4 % 2 == 0) {
            return lowerCase;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m1729(co coVar) {
        int i = 2 % 2;
        int i2 = f1530 + 61;
        f1528 = i2 % 128;
        int i3 = i2 % 2;
        String strM1703 = coVar.m1637().m1703();
        int i4 = f1528 + 123;
        f1530 = i4 % 128;
        int i5 = i4 % 2;
        return strM1703;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1727(co coVar) {
        int i = 2 % 2;
        int i2 = f1528 + 19;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        String strM2286 = coVar.m1638().m2286();
        int i4 = f1530 + 5;
        f1528 = i4 % 128;
        int i5 = i4 % 2;
        return strM2286;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m1725() {
        int i = 2 % 2;
        int i2 = f1528 + 33;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        ar arVarM480 = ar.m480();
        if (i3 == 0) {
            return arVarM480.mo506();
        }
        arVarM480.mo506();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static double m1722() {
        int i = 2 % 2;
        int i2 = f1530 + 49;
        f1528 = i2 % 128;
        if (i2 % 2 == 0) {
            ar.m480().mo496();
            throw null;
        }
        double dMo496 = ar.m480().mo496();
        int i3 = f1530 + 73;
        f1528 = i3 % 128;
        if (i3 % 2 != 0) {
            return dMo496;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static JSONObject m1723() {
        int i = 2 % 2;
        int i2 = f1528 + 49;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM514 = ar.m480().mo495().m514();
        int i4 = f1530 + InterfaceC0280i1.d.b.i;
        f1528 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return jSONObjectM514;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static String m1721() {
        int i = 2 % 2;
        int i2 = f1528 + 19;
        f1530 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ar.m480().mo495().m472();
            super.hashCode();
            throw null;
        }
        String strM472 = ar.m480().mo495().m472();
        int i3 = f1530 + 77;
        f1528 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM472;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static JSONObject m1719() {
        JSONObject jSONObjectM474;
        int i = 2 % 2;
        int i2 = f1530 + 15;
        f1528 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM474 = ar.m480().mo495().m474();
            int i3 = 47 / 0;
        } else {
            jSONObjectM474 = ar.m480().mo495().m474();
        }
        int i4 = f1530 + 99;
        f1528 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM474;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1735(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 79;
        f1528 = i2 % 128;
        return ar.m480().mo495().m473((String) m1770(list, i2 % 2 == 0 ? 1 : 0, String.class));
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static ih m1720() {
        int i = 2 % 2;
        int i2 = f1528 + InterfaceC0280i1.d.b.i;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        ih ihVarM2633 = jh.m2628().m2633();
        int i4 = f1530 + 65;
        f1528 = i4 % 128;
        int i5 = i4 % 2;
        return ihVarM2633;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1743(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1529) ^ ((long) f1527)) ^ ((long) f1526));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
