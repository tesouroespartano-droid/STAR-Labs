package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class eg extends ed {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1961 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1962 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1963 = 8023;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1964 = 53245;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1965 = 35058;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1966 = 40299;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f1967;

    public eg(ed edVar, dn dnVar) {
        super(dnVar);
        this.f1967 = edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f1961 + 91;
        f1962 = i2 % 128;
        int i3 = i2 % 2;
        dr drVarM2116 = this.f1967.m2116(dqVar, coVar);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return drVarM2116;
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2123("䡏ᜪ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(this.f1967).append(m2123("ೂ뺁", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern()).toString();
        int i2 = f1961 + 7;
        f1962 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f1961 + 55;
            f1962 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i4 = f1962 + 55;
            f1961 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ed edVar = this.f1967;
        ed edVar2 = ((eg) obj).f1967;
        if (edVar != null) {
            return edVar.equals(edVar2);
        }
        if (edVar2 != null) {
            return false;
        }
        int i6 = f1962 + 51;
        f1961 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.f1967 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.f1967 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 69;
        com.ironsource.adqualitysdk.sdk.i.eg.f1962 = r1 % 128;
        r1 = r1 % 2;
        r0 = r5.f1967.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1961;
        int i3 = i2 + 69;
        f1962 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2123(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1966)) ^ ((c2 >>> 5) + f1964)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1965) ^ ((c3 + i2) ^ ((c3 << 4) + f1963))));
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
