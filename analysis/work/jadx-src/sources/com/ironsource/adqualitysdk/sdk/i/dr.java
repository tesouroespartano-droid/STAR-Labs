package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class dr {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1832 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1833;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1834 = {17};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1835;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Object f1836;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1837;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1838;

    public dr(Object obj) {
        this.f1836 = obj;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m2019() {
        int i = 2 % 2;
        int i2 = f1832;
        int i3 = i2 + 19;
        f1833 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.f1836;
        int i5 = i2 + 23;
        f1833 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2018() {
        int i = 2 % 2;
        Object obj = this.f1836;
        if (obj == null) {
            int i2 = f1833 + 93;
            f1832 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            int i4 = f1832 + 49;
            f1833 = i4 % 128;
            int i5 = i4 % 2;
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        }
        if (!(obj instanceof String)) {
            int i6 = f1833 + 17;
            f1832 = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        int i7 = f1832 + 77;
        f1833 = i7 % 128;
        int i8 = i7 % 2;
        if (TextUtils.isEmpty((String) obj)) {
            return false;
        }
        int i9 = f1833 + 7;
        f1832 = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Number m2023() {
        Number number;
        int i;
        int i2 = 2 % 2;
        Object obj = this.f1836;
        if (!(obj instanceof Integer)) {
            if (obj instanceof Long) {
                number = (Long) obj;
                i = f1832 + 11;
                f1833 = i % 128;
            } else {
                if (!(obj instanceof Double)) {
                    return null;
                }
                number = (Double) obj;
                i = f1833 + 45;
                f1832 = i % 128;
            }
            int i3 = i % 2;
            return number;
        }
        int i4 = f1833 + 77;
        f1832 = i4 % 128;
        if (i4 % 2 != 0) {
            return (Integer) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2021() {
        int i = 2 % 2;
        int i2 = f1832;
        int i3 = i2 + 25;
        f1833 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean z = this.f1835;
        int i4 = i2 + 3;
        f1833 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr m2020(boolean z) {
        int i = 2 % 2;
        int i2 = f1832 + 99;
        f1833 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1835 = z;
            int i3 = 58 / 0;
            return this;
        }
        this.f1835 = z;
        return this;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2022() {
        int i = 2 % 2;
        int i2 = f1833;
        int i3 = i2 + 71;
        f1832 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1838;
        int i5 = i2 + 95;
        f1832 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final dr m2015() {
        int i = 2 % 2;
        int i2 = f1833;
        int i3 = i2 + 95;
        f1832 = i3 % 128;
        int i4 = i3 % 2;
        this.f1838 = true;
        int i5 = i2 + 77;
        f1832 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2016() {
        int i = 2 % 2;
        int i2 = f1832;
        int i3 = i2 + 61;
        f1833 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1837;
        int i5 = i2 + 35;
        f1833 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final dr m2017() {
        int i = 2 % 2;
        int i2 = f1832 + 53;
        int i3 = i2 % 128;
        f1833 = i3;
        int i4 = i2 % 2;
        this.f1837 = true;
        int i5 = i3 + 69;
        f1832 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1832 + InterfaceC0280i1.d.b.g;
        f1833 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1836 instanceof String) {
            return new StringBuilder().append(m2014(new int[]{0, 1, 0, 1}, false, "\u0000").intern()).append(this.f1836).append(m2014(new int[]{0, 1, 0, 1}, false, "\u0000").intern()).toString();
        }
        String string = new StringBuilder().append(this.f1836).toString();
        int i4 = f1833 + InterfaceC0280i1.d.b.g;
        f1832 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2014(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1834, i, cArr, 0, i2);
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
