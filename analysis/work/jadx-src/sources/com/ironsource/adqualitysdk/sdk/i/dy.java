package com.ironsource.adqualitysdk.sdk.i;

import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class dy {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1895 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1896 = {'@'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1897;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c f1898;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1899;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1900;

    public enum c {
        f1911,
        f1909,
        f1908,
        f1910,
        f1912,
        f1903,
        f1904,
        f1906;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f1901 = 1;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f1902;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f1907;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static void m2101() {
            f1907 = new char[]{'u', 245, 254, 249, 246, 241, 237, ')', 'K', 'G', 'G', 'G', 'N', 'Q', 'I', 'D', 'F', 'B', 133, 133, 134, Ascii.MAX, '~', 128, Ascii.MAX, 'l', 219, 220, 222, 228, 228, Typography.dollar, 'K', 'Q', 'L', 'F', 'F', 'K', Typography.quote, 'D', 'I', 'R', 'K', 'G', ' ', 'G', 'H', 'H', 'O', 'M', 'H', 'o', 227, 226, 230, 239};
        }

        public static c valueOf(String str) {
            int i = 2 % 2;
            int i2 = f1901 + 115;
            f1902 = i2 % 128;
            int i3 = i2 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i4 = f1901 + 13;
            f1902 = i4 % 128;
            int i5 = i4 % 2;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f1901 + 9;
            f1902 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            c[] cVarArr = (c[]) values().clone();
            int i3 = f1902 + 21;
            f1901 = i3 % 128;
            int i4 = i3 % 2;
            return cVarArr;
        }

        static {
            m2101();
            int i = f1902 + 113;
            f1901 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2102(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1907, i, cArr, 0, i2);
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

    public dy(c cVar, String str, int i) {
        this.f1898 = cVar;
        this.f1899 = str;
        this.f1900 = i;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final c m2096() {
        int i = 2 % 2;
        int i2 = f1895 + 105;
        int i3 = i2 % 128;
        f1897 = i3;
        int i4 = i2 % 2;
        c cVar = this.f1898;
        int i5 = i3 + 69;
        f1895 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2099() {
        int i = 2 % 2;
        int i2 = f1895 + 47;
        int i3 = i2 % 128;
        f1897 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1899;
        int i4 = i3 + 75;
        f1895 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m2097() {
        int i = 2 % 2;
        int i2 = f1895 + 107;
        int i3 = i2 % 128;
        f1897 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = this.f1900;
        int i5 = i3 + 53;
        f1895 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2100(String str) {
        int i = 2 % 2;
        int i2 = f1895 + 63;
        f1897 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = this.f1899.equals(str);
        int i4 = f1895 + 1;
        f1897 = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (m2092() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (m2092() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2098() {
        int i = 2 % 2;
        if (!m2095() && !m2090()) {
            int i2 = f1897 + 27;
            f1895 = i2 % 128;
            int i3 = i2 % 2;
            if (!m2093()) {
                int i4 = f1895 + 13;
                f1897 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 90 / 0;
                }
            }
        }
        int i6 = f1897 + 49;
        f1895 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2095() {
        int i = 2 % 2;
        if (m2096() == c.f1910) {
            int i2 = f1895 + 19;
            f1897 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1897 + 71;
        f1895 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (m2096() == com.ironsource.adqualitysdk.sdk.i.dy.c.f1912) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (m2096() == com.ironsource.adqualitysdk.sdk.i.dy.c.f1912) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.dy.f1895 + 63;
        com.ironsource.adqualitysdk.sdk.i.dy.f1897 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2090() {
        int i = 2 % 2;
        int i2 = f1895 + InterfaceC0280i1.d.b.i;
        f1897 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2093() {
        int i = 2 % 2;
        if (m2096() != c.f1903) {
            return false;
        }
        int i2 = f1895 + 63;
        int i3 = i2 % 128;
        f1897 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        f1895 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2092() {
        int i = 2 % 2;
        int i2 = f1895 + 23;
        f1897 = i2 % 128;
        if (i2 % 2 != 0) {
            m2096();
            c cVar = c.f1904;
            throw null;
        }
        if (m2096() != c.f1904) {
            return false;
        }
        int i3 = f1895 + 69;
        f1897 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2091() {
        int i = 2 % 2;
        int i2 = f1895 + 61;
        f1897 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
            if (m2096() == c.f1908) {
                return true;
            }
        } else if (m2096() == c.f1908) {
            return true;
        }
        int i4 = f1897 + 79;
        f1895 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2094() {
        int i = 2 % 2;
        int i2 = f1895 + InterfaceC0280i1.d.b.d;
        f1897 = i2 % 128;
        int i3 = i2 % 2;
        if (m2096() == c.f1906) {
            int i4 = f1897 + 65;
            f1895 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f1895 + 75;
        f1897 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final boolean m2088() {
        int i = 2 % 2;
        int i2 = f1895 + 13;
        f1897 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m2096();
            c cVar = c.f1909;
            super.hashCode();
            throw null;
        }
        if (m2096() != c.f1909) {
            return false;
        }
        int i3 = f1895 + 59;
        f1897 = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m2089() {
        int i = 2 % 2;
        if (m2096() == c.f1911) {
            int i2 = f1895 + 23;
            f1897 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1895 + 69;
        f1897 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1898).append(m2087(new int[]{0, 1, 70, 0}, true, "\u0000").intern()).append(this.f1899).toString();
        int i2 = f1895 + 57;
        f1897 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2087(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1896, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c2 = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c2);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c2);
                    }
                    c2 = cArr2[j.f2692];
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
