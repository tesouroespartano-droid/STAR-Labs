package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dg extends cx implements ci {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1704 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1705 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1706 = 4236398849405514549L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1707 = {'9', 'o', 'o', 'c', ']', 'f', 'd', 'g', '[', '^', 'l', 'f', 142, 278, 270, 277, 281, 282, 280, 263, 273, 287, 277, 273, 273, 279, 262, '|', 252, 240, 234, 243, 241, 244, 232, 227, 241, 239, '6', 'o', 'c', 'a', 'n', 'i', 'V', 'V', 'd', 'b', 'j', Typography.less, 'y', '{', 't', 'v', '}', '{', 129, 'y', 'z', 134, 'h', 221, 229, 223, 225, 218, 216, 223, 221, 229, 234, 234, '2', 'j', 't', 'f', '\\', 'm', 'o', 'n', 'j', 'c', 'k', 'Z', '[', 'l', 'l', 'A', 128, 'w', 'q', 'j', 'p', '|', 'l', 'n', Ascii.MAX, 128, 'w', 'q', 'y', 'y', 'y', 'p', 'n', 'L', 155, 156, 147, 141, 149, 149, 149, 135, 132, 144, 141, 143, 134, 140, 152, 136, '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', ']', 'f', 'd', 'g', '[', '^', 'l', 'f', ':', 's', 'j', 'd', 'l', 'l', 'l', 'e', '_', 'f', 'd', 'j', 'b', 'c', 'o', '_', 'a', '9', 'c', 'a', 'n', 'i', 'V', '^', 'l', 'l', 'l', 'd', 'j', 's', 'r', 'a', '_', '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', '\\', 'k', 'i', 'R', 'S', 'i', 'Y', '\\', 'l', 'l', '3', 'f', 'l', '[', 'Z', 'k', 'c', 'j', 'n', 'o', 'm', '\\', 'a', 'r', 's', 'j', 'd', 'W', '^', 'q', 'n', 128, 249, 249, 232, 231, 248, 240, 247, 251, 252, 250, 233, 238, 255, 256, 247, 241, 228, 235, 254, 251};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private hq f1708;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hq f1710;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1714 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1711 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1713 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1715 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1712 = new ArrayList();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private JSONObject f1709 = new JSONObject();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m1891() {
        int i = 2 % 2;
        int i2 = f1704 + 35;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.f1714;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1875() {
        int i = 2 % 2;
        int i2 = f1705;
        int i3 = i2 + InterfaceC0280i1.d.b.g;
        f1704 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.f1711;
        int i5 = i2 + 5;
        f1704 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m1887() {
        int i = 2 % 2;
        int i2 = f1705 + 119;
        f1704 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1713;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1883() {
        int i = 2 % 2;
        int i2 = f1704;
        int i3 = i2 + 69;
        f1705 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1715;
        int i4 = i2 + 89;
        f1705 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1878() {
        List<String> list;
        int i = 2 % 2;
        int i2 = f1704 + InterfaceC0280i1.d.b.g;
        int i3 = i2 % 128;
        f1705 = i3;
        if (i2 % 2 != 0) {
            list = this.f1712;
            int i4 = 25 / 0;
        } else {
            list = this.f1712;
        }
        int i5 = i3 + 93;
        f1704 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hq m1864() {
        int i = 2 % 2;
        int i2 = f1705 + 117;
        int i3 = i2 % 128;
        f1704 = i3;
        int i4 = i2 % 2;
        hq hqVar = this.f1710;
        int i5 = i3 + 27;
        f1705 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return hqVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hq m1870() {
        int i = 2 % 2;
        int i2 = f1704;
        int i3 = i2 + 81;
        f1705 = i3 % 128;
        int i4 = i3 % 2;
        hq hqVar = this.f1708;
        int i5 = i2 + 7;
        f1705 = i5 % 128;
        if (i5 % 2 == 0) {
            return hqVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1884(String str) {
        int i = 2 % 2;
        int i2 = f1704 + 9;
        f1705 = i2 % 128;
        if (i2 % 2 != 0) {
            m1881(str, this.f1714);
            int i3 = 68 / 0;
        } else {
            m1881(str, this.f1714);
        }
        int i4 = f1704 + 9;
        f1705 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1882(List<String> list) {
        int i = 2 % 2;
        int i2 = f1704 + 23;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        m1895(list, this.f1714);
        int i4 = f1705 + InterfaceC0280i1.d.b.d;
        f1704 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1880(String str) {
        int i = 2 % 2;
        int i2 = f1704 + 67;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        m1881(str, this.f1711);
        int i4 = f1704 + 53;
        f1705 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1885(List<String> list) {
        int i = 2 % 2;
        int i2 = f1705 + 43;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        m1895(list, this.f1711);
        int i4 = f1705 + 87;
        f1704 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1876(String str) {
        int i = 2 % 2;
        int i2 = f1704 + 87;
        f1705 = i2 % 128;
        if (i2 % 2 != 0) {
            m1881(str, this.f1713);
            int i3 = 95 / 0;
        } else {
            m1881(str, this.f1713);
        }
        int i4 = f1704 + 21;
        f1705 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1894(List<String> list) {
        int i = 2 % 2;
        int i2 = f1705 + 99;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        m1895(list, this.f1713);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1893(String str) {
        int i = 2 % 2;
        int i2 = f1704 + InterfaceC0280i1.d.b.g;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        m1881(str, this.f1715);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1877(List<String> list) {
        int i = 2 % 2;
        int i2 = f1704 + 45;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        m1895(list, this.f1715);
        int i4 = f1705 + 69;
        f1704 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1888(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 35;
        f1704 = i2 % 128;
        if (i2 % 2 == 0) {
            m1881(str, this.f1712);
            throw null;
        }
        m1881(str, this.f1712);
        int i3 = f1705 + InterfaceC0280i1.d.b.d;
        f1704 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1889(List<String> list) {
        int i = 2 % 2;
        int i2 = f1704 + 85;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        m1895(list, this.f1712);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1879(hq hqVar) {
        int i = 2 % 2;
        if (hqVar != null) {
            int i2 = f1704 + 51;
            f1705 = i2 % 128;
            int i3 = i2 % 2;
            this.f1710 = hqVar;
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = f1705 + 73;
        f1704 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1892(hq hqVar) {
        int i = 2 % 2;
        int i2 = f1704 + 57;
        int i3 = i2 % 128;
        f1705 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (hqVar != null) {
            this.f1708 = hqVar;
        }
        int i4 = i3 + 119;
        f1704 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1872() {
        int i = 2 % 2;
        int i2 = f1705 + 49;
        f1704 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.f1709.optString(ij.f2553);
            throw null;
        }
        String strOptString = this.f1709.optString(ij.f2553);
        int i3 = f1705 + 23;
        f1704 = i3 % 128;
        if (i3 % 2 != 0) {
            return strOptString;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1865(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 71;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1709.put(ij.f2553, str);
            int i4 = f1705 + 7;
            f1704 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1868() {
        int i = 2 % 2;
        int i2 = f1705 + 19;
        f1704 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1709.optString(ij.f2552);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strOptString = this.f1709.optString(ij.f2552);
        int i3 = f1704 + 3;
        f1705 = i3 % 128;
        int i4 = i3 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1873(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 59;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1709.put(ij.f2552, str);
            int i4 = f1705 + 73;
            f1704 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1866() {
        int i = 2 % 2;
        int i2 = f1705 + InterfaceC0280i1.d.b.i;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f1709.optString(ij.f2548);
        int i4 = f1705 + 65;
        f1704 = i4 % 128;
        if (i4 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1871(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 17;
        f1704 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1709.put(ij.f2548, str);
                int i3 = 54 / 0;
            } else {
                this.f1709.put(ij.f2548, str);
            }
            int i4 = f1704 + 53;
            f1705 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String m1858() {
        int i = 2 % 2;
        int i2 = f1704 + 53;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1709;
        if (i3 == 0) {
            return jSONObject.optString(ij.f2549);
        }
        jSONObject.optString(ij.f2549);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1869(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 69;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1709.put(ij.f2549, str);
            int i4 = f1704 + 99;
            f1705 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m1861() {
        int i = 2 % 2;
        int i2 = f1705 + 45;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f1709.optString(ij.f2545);
        int i4 = f1705 + 69;
        f1704 = i4 % 128;
        if (i4 % 2 != 0) {
            return strOptString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1867(String str) {
        int i = 2 % 2;
        int i2 = f1705 + 99;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1709.put(ij.f2545, str);
            int i4 = f1705 + 59;
            f1704 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1859() {
        int i = 2 % 2;
        int i2 = f1704 + 7;
        int i3 = i2 % 128;
        f1705 = i3;
        int i4 = i2 % 2;
        JSONObject jSONObject = this.f1709;
        int i5 = i3 + 45;
        f1704 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1886(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1705 + 9;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        this.f1709 = kd.m2826(jSONObject);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1863(String str) {
        int i = 2 % 2;
        int i2 = f1704 + 119;
        f1705 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1709.put(ij.f2540, str);
            } else {
                this.f1709.put(ij.f2540, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private String m1860() {
        int i = 2 % 2;
        int i2 = f1704 + 89;
        f1705 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f1709.optString(ij.f2540);
        int i4 = f1705 + 49;
        f1704 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1881(String str, List<String> list) {
        int i = 2 % 2;
        int i2 = f1705 + 59;
        f1704 = i2 % 128;
        int i3 = i2 % 2;
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i4 = f1705 + 61;
        f1704 = i4 % 128;
        if (i4 % 2 != 0) {
            if (list.contains(str)) {
                return;
            }
            list.add(str);
        } else {
            list.contains(str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1895(List<String> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = f1705 + 77;
        f1704 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i3 = f1705 + 79;
                f1704 = i3 % 128;
                int i4 = i3 % 2;
                m1881(it.next(), list2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Object m1862() {
        boolean z;
        int i = 2 % 2;
        if (this.f1714.size() <= 0) {
            int i2 = f1705 + 69;
            f1704 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f1711.size() <= 0) {
                int i4 = f1704 + InterfaceC0280i1.d.b.i;
                f1705 = i4 % 128;
                int i5 = i4 % 2;
                if (this.f1712.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private JSONObject m1857() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f1710 != null) {
                int i2 = f1705 + 31;
                f1704 = i2 % 128;
                if (i2 % 2 == 0) {
                    jSONObject.put(ij.f2557, this.f1710.m2273());
                    int i3 = 86 / 0;
                } else {
                    jSONObject.put(ij.f2557, this.f1710.m2273());
                }
            }
            if (this.f1708 != null) {
                jSONObject.put(ij.f2550, this.f1708.m2273());
            }
            if (this.f1714.size() > 0) {
                jSONObject.put(ij.f2553, new JSONArray((Collection) this.f1714));
            }
            if (this.f1711.size() > 0) {
                jSONObject.put(ij.f2548, new JSONArray((Collection) this.f1711));
            }
            if (this.f1713.size() > 0) {
                jSONObject.put(ij.f2545, new JSONArray((Collection) this.f1713));
            }
            if (this.f1715.size() > 0) {
                jSONObject.put(ij.f2549, new JSONArray((Collection) this.f1715));
            }
            if (this.f1712.size() > 0) {
                jSONObject.put(ij.f2552, new JSONArray((Collection) this.f1712));
            }
            if (this.f1709.length() > 0) {
                int i4 = f1705 + 81;
                f1704 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.putOpt(ij.f2551, this.f1709.toString());
            }
            int i6 = f1705 + 49;
            f1704 = i6 % 128;
            int i7 = i6 % 2;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x044f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = Ascii.ETB;
        switch (iHashCode) {
            case -1836320845:
                if (!str.equals(m1874("獔腘靃ꕽ뭾쥭\udf71\ued69\ue318\uf131ܝᔺ", 61961 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i2 = f1704 + 7;
                    f1705 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 7;
                }
                break;
            case -1833890347:
                if (!str.equals(m1890(new int[]{27, 11, 141, 0}, true, "\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    int i4 = f1704 + 9;
                    f1705 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 9;
                }
                break;
            case -1803337567:
                if (!str.equals(m1890(new int[]{172, 19, 0, 0}, true, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = Ascii.ESC;
                }
                break;
            case -1712168770:
                if (!str.equals(m1890(new int[]{38, 11, 0, 10}, true, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i6 = f1705 + 31;
                    f1704 = i6 % 128;
                    int i7 = i6 % 2;
                    b = Ascii.SO;
                }
                break;
            case -1409157227:
                if (!str.equals(m1874("獒\ue38f勿쇻〦ꜛᙽ蕏\uf5a8撷\udbf1䫌뤲", ExpandableListView.getPackedPositionType(0L) + 37087).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1362450249:
                if (!str.equals(m1874("獝枳媈䷃⃛ᯓ\u0e3e\ue110푤콜ꉖ隑規糨埸", 5351 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case -1273813711:
                if (!str.equals(m1890(new int[]{139, 17, 0, 4}, false, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    b = -1;
                }
                break;
            case -1249364341:
                if (!str.equals(m1874("獒곳찇\ued98්\u2d6a", Process.getGidForName("") + 57252).intern())) {
                    b = -1;
                } else {
                    int i8 = f1705 + 115;
                    f1704 = i8 % 128;
                    b = i8 % 2 != 0 ? Ascii.US : (byte) 73;
                }
                break;
            case -1245993915:
                if (!str.equals(m1890(new int[]{122, 17, 0, 0}, true, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = Ascii.SYN;
                }
                break;
            case -1190960472:
                if (!str.equals(m1890(new int[]{191, 21, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.GS;
                }
                break;
            case -1099149698:
                if (!str.equals(m1874("獒漟䯟➝ɧﻚ\udaac땽鄿趖桠䐢⃤͗３\udbfd랳鉯軯檑䕩Å", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7246).intern())) {
                    b = -1;
                } else {
                    int i9 = f1704 + 113;
                    f1705 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 6;
                }
                break;
            case -1091371232:
                if (!str.equals(m1874("獔烰琓禅緞慥暁樱湘叉圍咲壊", TextUtils.indexOf("", "") + 929).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1016025794:
                if (!str.equals(m1874("獔䮘˃\ud927遼梹⟤︯딨豖䒃ϥ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14537).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -924327250:
                if (!str.equals(m1874("獔걎쵯\uee2d༧⣊䧌檍访ꭆ쑖\ue512ح⟕", 57119 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -905814529:
                if (!str.equals(m1874("獆磙摓凪嵢䫨", Color.argb(0, 0, 0, 0) + 2953).intern())) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case -890333697:
                if (!str.equals(m1890(new int[]{12, 15, 171, 11}, false, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -887729623:
                if (!str.equals(m1890(new int[]{0, 12, 0, 0}, true, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -869156349:
                if (!str.equals(m1874("獁犩炙皟璖竤", 500 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case -747967915:
                if (!str.equals(m1874("獔畬缫懋殢汫嘵壋䊯䭼", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1596).intern())) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case -333660891:
                if (!str.equals(m1874("獒焇矯瑦稀磢絚挻懘晈搿櫛潎洫厅偏嘠", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 600).intern())) {
                    b = -1;
                } else {
                    b = Ascii.CAN;
                }
                break;
            case -259609707:
                if (!str.equals(m1874("獒\ueff3䨇ꚙǗ籾\ud8a4㬡陟\uf2ea派졆⓽蜡\ue3b0廍륷ᖅ瀦", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40099).intern())) {
                    b = -1;
                } else {
                    b = Ascii.FS;
                }
                break;
            case -140869031:
                if (!str.equals(m1874("獒璱粃擅泞吥封䑱䱘㖉㶍◲ⷪᔷᴎըെ\uf6a1", TextUtils.lastIndexOf("", '0', 0) + 2018).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case 20418827:
                if (!str.equals(m1890(new int[]{72, 15, 0, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 108267695:
                if (!str.equals(m1890(new int[]{156, 16, 0, 9}, true, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.EM;
                }
                break;
            case 177098421:
                if (!str.equals(m1890(new int[]{49, 11, 23, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = Ascii.SI;
                }
                break;
            case 213978610:
                if (!str.equals(m1874("獆항㼻臇\uebaf䱠阘\uf8ff䊯ꭴഔ埘릌ɍ搗컏႓祝쌫○辁큑", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42557).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 779164621:
                if (!str.equals(m1890(new int[]{87, 18, 13, 13}, false, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 801466981:
                if (!str.equals(m1874("獔첌೫䳧谯찀ౘ䱟趯추ෂ䴸贅", 49118 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i11 = f1704 + 39;
                    f1705 = i11 % 128;
                    b = i11 % 2 == 0 ? (byte) 11 : (byte) 103;
                }
                break;
            case 1195083870:
                if (!str.equals(m1890(new int[]{60, 12, 123, 9}, true, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 1323380041:
                if (!str.equals(m1874("獒燑癃瓠祘翔籖拝杨旎橓棍", 641 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i12 = f1704 + 57;
                    f1705 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 2;
                }
                break;
            case 1340011123:
                if (!str.equals(m1874("獒㰫\uedb7鴍人︽꾹弽࢟렊榈", Process.getGidForName("") + 20348).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1345250484:
                if (!str.equals(m1890(new int[]{212, 21, 141, 0}, false, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.RS;
                }
                break;
            case 1939710523:
                if (!str.equals(m1874("獒✏\udbff蹡∪횁襡㷹톿萎㣐퍏蜴㮔\uee64苁", 21598 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i14 = f1704 + 63;
                    f1705 = i14 % 128;
                    b = i14 % 2 != 0 ? (byte) 101 : Ascii.SUB;
                }
                break;
            case 2108820561:
                if (!str.equals(m1890(new int[]{105, 17, 41, 5}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    int i15 = f1704 + 25;
                    f1705 = i15 % 128;
                    b = i15 % 2 == 0 ? (byte) 21 : (byte) 71;
                }
                break;
            case 2109208793:
                if (!str.equals(m1874("獒낛\uf4d7㠑籷ꆦ\ue5b4⧙洟酲횎\u1afe廝舉", 50123 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return m1891();
            case 1:
                return m1875();
            case 2:
                return m1878();
            case 3:
                return m1883();
            case 4:
                return m1887();
            case 5:
                return Integer.valueOf(m1864().m2273());
            case 6:
                return Integer.valueOf(m1870().m2273());
            case 7:
                m1884((String) m1770(list, 0, String.class));
                return null;
            case 8:
                m1882((List<String>) m1770(list, 0, List.class));
                return null;
            case 9:
                m1880((String) m1770(list, 0, String.class));
                return null;
            case 10:
                m1885((List<String>) m1770(list, 0, List.class));
                return null;
            case 11:
                m1876((String) m1770(list, 0, String.class));
                return null;
            case 12:
                m1894((List<String>) m1770(list, 0, List.class));
                return null;
            case 13:
                m1893((String) m1770(list, 0, String.class));
                return null;
            case 14:
                m1877((List<String>) m1770(list, 0, List.class));
                return null;
            case 15:
                m1888((String) m1770(list, 0, String.class));
                return null;
            case 16:
                m1889((List<String>) m1770(list, 0, List.class));
                return null;
            case 17:
                m1879(hq.m2270(((Integer) m1770(list, 0, Integer.class)).intValue()));
                return null;
            case 18:
                m1892(hq.m2270(((Integer) m1770(list, 0, Integer.class)).intValue()));
                return null;
            case 19:
                m1865((String) m1770(list, 0, String.class));
                return null;
            case 20:
                return m1872();
            case 21:
                m1871((String) m1770(list, 0, String.class));
                return null;
            case 22:
                return m1866();
            case 23:
                m1873((String) m1770(list, 0, String.class));
                return null;
            case 24:
                return m1868();
            case 25:
                m1869((String) m1770(list, 0, String.class));
                return null;
            case 26:
                return m1858();
            case 27:
                m1867((String) m1770(list, 0, String.class));
                return null;
            case 28:
                return m1861();
            case 29:
                JSONObject jSONObjectM1859 = m1859();
                int i16 = f1704 + 43;
                f1705 = i16 % 128;
                int i17 = i16 % 2;
                return jSONObjectM1859;
            case 30:
                m1886((JSONObject) m1770(list, 0, JSONObject.class));
                return null;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return m1860();
            case 32:
                m1863((String) m1770(list, 0, String.class));
                return null;
            case 33:
                return m1862();
            case 34:
                return m1857();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1874(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1706);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1890(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (j.f2691) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f1707, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                    }
                    c = cArr2[j.f2692];
                    j.f2692++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                    j.f2692++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                    j.f2692++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
