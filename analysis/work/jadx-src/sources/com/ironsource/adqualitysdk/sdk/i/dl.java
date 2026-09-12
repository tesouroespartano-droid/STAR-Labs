package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1784 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1785;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1786 = {':', 'v', 't', 'j', 'u', 229, 222, 221, Typography.times, 225, '8', 'h', 'i', 'i', 'g', 'p', 'h', 201, 196, 203, 203, 204, 204, 203, 200, 191, '9', 'k', 'l', 'p', 'j', 'W', '^', 'n', 'g', 'o', '#', 'V', 'l', 't', 'l', 'k', 't', 'n', 'c', '\\', '_', 'g', 'n', 'u'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1787;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f1788;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f1789;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1790;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityAdType f1791;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1792;

    public dl(JSONObject jSONObject) {
        this.f1791 = ISAdQualityAdType.UNKNOWN;
        this.f1792 = dx.m2086(jSONObject.optString(m1977(new int[]{0, 4, 0, 4}, false, "\u0000\u0001\u0001\u0001").intern()));
        String strM2086 = dx.m2086(jSONObject.optString(m1977(new int[]{4, 6, 123, 2}, false, "\u0001\u0001\u0000\u0001\u0000\u0001").intern()));
        if (!TextUtils.isEmpty(strM2086)) {
            this.f1791 = ISAdQualityAdType.fromInt(Integer.parseInt(strM2086));
        }
        this.f1788 = jSONObject.optJSONObject(m1977(new int[]{10, 6, 0, 0}, false, "\u0000\u0001\u0001\u0001\u0000\u0000").intern());
        this.f1789 = kd.m2822(jSONObject, m1977(new int[]{16, 10, 93, 0}, true, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000").intern(), new ArrayList());
        this.f1790 = dx.m2086(jSONObject.optString(m1977(new int[]{26, 10, 0, 0}, true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001").intern()));
        this.f1787 = dx.m2086(jSONObject.optString(m1977(new int[]{36, 14, 0, 6}, false, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000").intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1979() {
        int i = 2 % 2;
        int i2 = f1784;
        int i3 = i2 + 97;
        f1785 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1792;
        int i5 = i2 + 39;
        f1785 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType m1982() {
        int i = 2 % 2;
        int i2 = f1784 + 31;
        f1785 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1791;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m1980() {
        int i = 2 % 2;
        int i2 = f1785 + 91;
        f1784 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1788;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m1983() {
        int i = 2 % 2;
        int i2 = f1785 + 115;
        int i3 = i2 % 128;
        f1784 = i3;
        int i4 = i2 % 2;
        List<String> list = this.f1789;
        int i5 = i3 + 83;
        f1785 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1981() {
        int i = 2 % 2;
        int i2 = f1785 + 39;
        f1784 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1790;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1978() {
        int i = 2 % 2;
        int i2 = f1785 + 97;
        int i3 = i2 % 128;
        f1784 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1787;
        int i4 = i3 + 47;
        f1785 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1977(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1786, i, cArr, 0, i2);
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
