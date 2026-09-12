package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public enum hi {
    f2330(-1),
    f2331(0),
    f2333(1),
    f2332(2),
    f2329(3),
    f2327(4),
    f2328(5),
    f2325(6),
    f2326(7);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2321 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2322 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2324;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final int f2334;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static void m2221() {
        f2324 = 102;
    }

    public static hi valueOf(String str) {
        int i = 2 % 2;
        int i2 = f2322 + 87;
        f2321 = i2 % 128;
        int i3 = i2 % 2;
        hi hiVar = (hi) Enum.valueOf(hi.class, str);
        if (i3 == 0) {
            return hiVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hi[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f2321 + 75;
        f2322 = i2 % 128;
        int i3 = i2 % 2;
        hi[] hiVarArrValuesCustom = values();
        if (i3 != 0) {
            return (hi[]) hiVarArrValuesCustom.clone();
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static {
        m2221();
        int i = f2321 + 23;
        f2322 = i % 128;
        int i2 = i % 2;
    }

    hi(int i) {
        this.f2334 = i;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static hi m2219(int i) {
        hi hiVar;
        int i2;
        int i3 = 2 % 2;
        switch (i) {
            case -1:
                return f2330;
            case 0:
                return f2331;
            case 1:
                return f2333;
            case 2:
                return f2332;
            case 3:
                hi hiVar2 = f2329;
                int i4 = f2321 + InterfaceC0280i1.d.b.i;
                f2322 = i4 % 128;
                if (i4 % 2 != 0) {
                    return hiVar2;
                }
                throw null;
            case 4:
                hiVar = f2327;
                i2 = f2321 + 21;
                break;
            case 5:
                return f2328;
            case 6:
                return f2325;
            case 7:
                hiVar = f2326;
                i2 = f2321 + InterfaceC0280i1.d.b.d;
                break;
            default:
                return null;
        }
        f2322 = i2 % 128;
        int i5 = i2 % 2;
        return hiVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m2222() {
        int i;
        int i2 = 2 % 2;
        int i3 = f2322 + 7;
        int i4 = i3 % 128;
        f2321 = i4;
        if (i3 % 2 != 0) {
            i = this.f2334;
            int i5 = 68 / 0;
        } else {
            i = this.f2334;
        }
        int i6 = i4 + 31;
        f2322 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2220(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2324);
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
