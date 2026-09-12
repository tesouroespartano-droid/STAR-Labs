package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class dz extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1913 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1914;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1915 = {'%', 'Y', 'Y'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private en f1916;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f1917;

    public dz(en enVar, ed edVar, dn dnVar) {
        super(dnVar);
        this.f1916 = enVar;
        this.f1917 = edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f1914 + 61;
        f1913 = i2 % 128;
        int i3 = i2 % 2;
        dr drVarM2116 = this.f1917.m2116(dqVar, coVar);
        dqVar.m2012(this.f1916.m2137(), drVarM2116.m2019());
        int i4 = f1913 + 17;
        f1914 = i4 % 128;
        int i5 = i4 % 2;
        return drVarM2116;
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1916).append(m2103(new int[]{0, 3, 43, 0}, false, "\u0001\u0001\u0001").intern()).append(this.f1917).toString();
        int i2 = f1913 + 45;
        f1914 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r6 = 91 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (getClass() == r6.getClass()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.dz) r6;
        r0 = r5.f1916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r0.equals(r6.f1916) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r6.f1916 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r0 = r5.f1917;
        r6 = r6.f1917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        return r0.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r6 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 13;
        com.ironsource.adqualitysdk.sdk.i.dz.f1914 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1913;
        int i3 = i2 + 25;
        f1914 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f1913 + 5;
        int i3 = i2 % 128;
        f1914 = i3;
        int i4 = i2 % 2;
        en enVar = this.f1916;
        int iHashCode2 = 0;
        if (enVar != null) {
            int i5 = i3 + 77;
            f1913 = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode = enVar.hashCode();
                int i6 = 97 / 0;
            } else {
                iHashCode = enVar.hashCode();
            }
        } else {
            iHashCode = 0;
        }
        int i7 = iHashCode * 31;
        ed edVar = this.f1917;
        if (edVar != null) {
            int i8 = f1914 + 59;
            f1913 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = edVar.hashCode();
        }
        return i7 + iHashCode2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final en m2104() {
        int i = 2 % 2;
        int i2 = f1913;
        int i3 = i2 + 85;
        f1914 = i3 % 128;
        int i4 = i3 % 2;
        en enVar = this.f1916;
        int i5 = i2 + InterfaceC0280i1.d.b.b;
        f1914 = i5 % 128;
        if (i5 % 2 == 0) {
            return enVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2103(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1915, i, cArr, 0, i2);
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
