package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dp {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1814 = {'9', 't', 'r', 'j', 'k', '0', 'i', 's', 's', 'j', 'a', 'j', 'k', 'Y', Typography.paragraph, 184, Typography.plusMinus, Typography.copyright, 173, 175, ':', 'l', 'l', 'q', 'r', 128, 256, 254, 246, 250, 250, ':', 'l', 'i', 'p', 'k', 'i', 'k'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1815 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1816;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, Cdo> f1817;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, du> f1818;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f1819;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<dl> f1820;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1821;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1822;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1823;

    public dp(final String str, String str2, JSONObject jSONObject) {
        this.f1822 = dx.m2086(str2);
        this.f1823 = dx.m2086(jSONObject.optString(m1998(new int[]{0, 5, 0, 5}, false, "\u0001\u0000\u0001\u0001\u0001").intern()));
        this.f1821 = jSONObject.optBoolean(m1998(new int[]{5, 8, 0, 6}, true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern());
        this.f1819 = m1997(kd.m2812(jSONObject.optJSONArray(m1998(new int[]{13, 7, 70, 1}, true, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern()), new kd.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo546(JSONArray jSONArray, int i) {
                return dx.m2086(jSONArray.optString(i));
            }
        }));
        this.f1820 = m1997(kd.m2812(jSONObject.optJSONArray(m1998(new int[]{20, 5, 0, 3}, true, "\u0000\u0001\u0000\u0001\u0001").intern()), new kd.b<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ dl mo546(JSONArray jSONArray, int i) {
                return new dl(jSONArray.optJSONObject(i));
            }
        }));
        this.f1817 = m1999(kd.m2823(jSONObject.optJSONObject(m1998(new int[]{25, 6, 141, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001").intern()), new kd.a<Cdo>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ Cdo mo547(JSONObject jSONObject2, String str3) {
                return new Cdo(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f1818 = m1999(kd.m2823(jSONObject.optJSONObject(m1998(new int[]{31, 7, 0, 3}, true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001").intern()), new kd.a<du>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ du mo547(JSONObject jSONObject2, String str3) {
                return new du(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> List<T> m1997(List<T> list) {
        int i = 2 % 2;
        int i2 = f1816 + 29;
        int i3 = i2 % 128;
        f1815 = i3;
        int i4 = i2 % 2;
        if (list == null) {
            return new ArrayList();
        }
        int i5 = i3 + 21;
        int i6 = i5 % 128;
        f1816 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 39;
        f1815 = i8 % 128;
        int i9 = i8 % 2;
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r2 + 37;
        com.ironsource.adqualitysdk.sdk.i.dp.f1816 = r1 % 128;
        r1 = r1 % 2;
        r2 = r2 + 57;
        com.ironsource.adqualitysdk.sdk.i.dp.f1816 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <K, V> Map<K, V> m1999(Map<K, V> map) {
        int i = 2 % 2;
        int i2 = f1816 + 93;
        int i3 = i2 % 128;
        f1815 = i3;
        if (i2 % 2 == 0) {
            int i4 = 25 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2004() {
        int i = 2 % 2;
        int i2 = f1815;
        int i3 = i2 + 83;
        f1816 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f1822;
        int i4 = i2 + InterfaceC0280i1.d.b.i;
        f1816 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2002() {
        int i = 2 % 2;
        int i2 = f1815 + 7;
        f1816 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1823;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2003() {
        int i = 2 % 2;
        int i2 = f1815 + InterfaceC0280i1.d.b.b;
        f1816 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.f1821;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2005() {
        List<String> list;
        int i = 2 % 2;
        int i2 = f1816;
        int i3 = i2 + 79;
        f1815 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.f1819;
            int i4 = 83 / 0;
        } else {
            list = this.f1819;
        }
        int i5 = i2 + 19;
        f1815 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Map<String, du> m2006() {
        int i = 2 % 2;
        int i2 = f1815 + 63;
        f1816 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, du> map = this.f1818;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final List<dl> m2001() {
        int i = 2 % 2;
        int i2 = f1815;
        int i3 = i2 + 87;
        f1816 = i3 % 128;
        int i4 = i3 % 2;
        List<dl> list = this.f1820;
        int i5 = i2 + 53;
        f1816 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Map<String, Cdo> m2000() {
        int i = 2 % 2;
        int i2 = f1816;
        int i3 = i2 + 49;
        f1815 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Cdo> map = this.f1817;
        int i5 = i2 + 97;
        f1815 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1998(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1814, i, cArr, 0, i2);
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
