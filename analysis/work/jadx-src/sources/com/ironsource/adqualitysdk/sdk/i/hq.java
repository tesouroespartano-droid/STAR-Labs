package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public enum hq {
    f2381(-1),
    f2380(0),
    f2384(1),
    f2382(2),
    f2383(3),
    f2379(4),
    f2376(5),
    f2378(6);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2372 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2373 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f2374;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f2375;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final int f2385;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m2271() {
        f2375 = (char) 5;
        f2374 = new char[]{'U', 'N', 'K', 'O', 'W', 'I', 'M', 'A', 'G', 'E', 'H', 'T', 'L', 'V', 'D', 'P', 'Y', 'B', 'S', 'C', 'R', 'X', 'Z', '[', '\\'};
    }

    public static hq valueOf(String str) {
        int i = 2 % 2;
        int i2 = f2372 + 63;
        f2373 = i2 % 128;
        int i3 = i2 % 2;
        hq hqVar = (hq) Enum.valueOf(hq.class, str);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f2373 + 71;
        f2372 = i4 % 128;
        int i5 = i4 % 2;
        return hqVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hq[] valuesCustom() {
        hq[] hqVarArr;
        int i = 2 % 2;
        int i2 = f2372 + InterfaceC0280i1.d.b.i;
        f2373 = i2 % 128;
        if (i2 % 2 == 0) {
            hqVarArr = (hq[]) values().clone();
            int i3 = 1 / 0;
        } else {
            hqVarArr = (hq[]) values().clone();
        }
        int i4 = f2372 + 83;
        f2373 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return hqVarArr;
    }

    static {
        m2271();
        int i = f2372 + 115;
        f2373 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    hq(int i) {
        this.f2385 = i;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hq m2270(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        switch (i) {
            case -1:
                hq hqVar = f2381;
                int i3 = f2373 + InterfaceC0280i1.d.b.b;
                f2372 = i3 % 128;
                if (i3 % 2 == 0) {
                    return hqVar;
                }
                super.hashCode();
                throw null;
            case 0:
                return f2380;
            case 1:
                return f2384;
            case 2:
                return f2382;
            case 3:
                hq hqVar2 = f2383;
                int i4 = f2372 + 17;
                f2373 = i4 % 128;
                int i5 = i4 % 2;
                return hqVar2;
            case 4:
                return f2379;
            case 5:
                return f2376;
            case 6:
                return f2378;
            default:
                int i6 = f2372 + 95;
                f2373 = i6 % 128;
                int i7 = i6 % 2;
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2273() {
        int i = 2 % 2;
        int i2 = f2372;
        int i3 = i2 + 41;
        f2373 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.f2385;
        int i5 = i2 + 33;
        f2373 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2272(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2374;
            char c = f2375;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
                    f.f2045 = cArr[f.f2047];
                    f.f2048 = cArr[f.f2047 + 1];
                    if (f.f2045 == f.f2048) {
                        cArr3[f.f2047] = (char) (f.f2045 - b);
                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                    } else {
                        f.f2046 = f.f2045 / c;
                        f.f2042 = f.f2045 % c;
                        f.f2044 = f.f2048 / c;
                        f.f2041 = f.f2048 % c;
                        if (f.f2042 == f.f2041) {
                            f.f2046 = ((f.f2046 + c) - 1) % c;
                            f.f2044 = ((f.f2044 + c) - 1) % c;
                            int i2 = (f.f2046 * c) + f.f2042;
                            int i3 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c) - 1) % c;
                            f.f2041 = ((f.f2041 + c) - 1) % c;
                            int i4 = (f.f2046 * c) + f.f2042;
                            int i5 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c) + f.f2041;
                            int i7 = (f.f2044 * c) + f.f2042;
                            cArr3[f.f2047] = cArr2[i6];
                            cArr3[f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
