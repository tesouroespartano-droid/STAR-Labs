package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ei extends ed {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1976 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1977 = {' '};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1978 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1979;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f1980;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f1981;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract String mo2127();

    public ei(ed edVar, ed edVar2, dn dnVar) {
        super(dnVar);
        this.f1981 = edVar;
        this.f1980 = edVar2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ed m2129() {
        int i = 2 % 2;
        int i2 = f1979 + 113;
        int i3 = i2 % 128;
        f1976 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ed edVar = this.f1981;
        int i4 = i3 + 107;
        f1979 = i4 % 128;
        int i5 = i4 % 2;
        return edVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ed m2128() {
        int i = 2 % 2;
        int i2 = f1976 + 45;
        f1979 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1980;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1981).append(m2126(" ", (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1).intern()).append(mo2127()).append(m2126(" ", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern()).append(this.f1980).toString();
        int i2 = f1976 + 41;
        f1979 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r2 = r2 + 21;
        com.ironsource.adqualitysdk.sdk.i.ei.f1979 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (getClass() == r7.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r7 = (com.ironsource.adqualitysdk.sdk.i.ei) r7;
        r1 = r6.f1981;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.ei.f1976 + 1;
        com.ironsource.adqualitysdk.sdk.i.ei.f1979 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1.equals(r7.f1981) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r7.f1981 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r1 = r6.f1980;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.ei.f1979 + 3;
        com.ironsource.adqualitysdk.sdk.i.ei.f1976 = r2 % 128;
        r2 = r2 % 2;
        r7 = r1.equals(r7.f1980);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r2 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r0 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r7.f1980 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ei.f1976 + 93;
        com.ironsource.adqualitysdk.sdk.i.ei.f1979 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if ((r7 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r7 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r7 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1979 + 5;
        int i3 = i2 % 128;
        f1976 = i3;
        if (i2 % 2 == 0) {
            int i4 = 53 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f1979;
        int i3 = i2 + 21;
        f1976 = i3 % 128;
        int i4 = i3 % 2;
        ed edVar = this.f1981;
        int iHashCode2 = 0;
        if (edVar != null) {
            int i5 = i2 + 99;
            f1976 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = edVar.hashCode();
            int i7 = f1976 + 59;
            f1979 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode = 0;
        }
        int i9 = iHashCode * 31;
        ed edVar2 = this.f1980;
        if (edVar2 != null) {
            int i10 = f1979 + 41;
            f1976 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode2 = edVar2.hashCode();
            int i12 = f1979 + 79;
            f1976 = i12 % 128;
            int i13 = i12 % 2;
        }
        return i9 + iHashCode2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2126(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f1977;
            char c = f1978;
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
