package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ef extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1956 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1957 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1958 = 7527400085820611168L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f1959;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f1960;

    ef(ed edVar, ed edVar2, dn dnVar) {
        super(dnVar);
        this.f1960 = edVar;
        this.f1959 = edVar2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final ed m2122() {
        int i = 2 % 2;
        int i2 = f1956;
        int i3 = i2 + 9;
        f1957 = i3 % 128;
        int i4 = i3 % 2;
        ed edVar = this.f1960;
        int i5 = i2 + 125;
        f1957 = i5 % 128;
        int i6 = i5 % 2;
        return edVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final ed m2121() {
        int i = 2 % 2;
        int i2 = f1956;
        int i3 = i2 + 21;
        f1957 = i3 % 128;
        int i4 = i3 % 2;
        ed edVar = this.f1959;
        int i5 = i2 + 107;
        f1957 = i5 % 128;
        int i6 = i5 % 2;
        return edVar;
    }

    public String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2122().toString()).append(m2120("ᨻ", 39929 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()).append(m2121().toString()).append(m2120("ᨽ", 332 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).toString();
        int i2 = f1956 + 77;
        f1957 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r6.f1960 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ef efVar = (ef) obj;
            ed edVar = this.f1960;
            if (edVar != null) {
                if (!edVar.equals(efVar.f1960)) {
                    int i2 = f1957 + 45;
                    f1956 = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                ed edVar2 = this.f1959;
                if (edVar2 != null) {
                    int i4 = f1957 + 87;
                    f1956 = i4 % 128;
                    int i5 = i4 % 2;
                    return edVar2.equals(efVar.f1959);
                }
                if (efVar.f1959 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        ed edVar = this.f1960;
        int iHashCode2 = 0;
        if (edVar != null) {
            iHashCode = edVar.hashCode();
            int i2 = f1956 + 13;
            f1957 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iHashCode = 0;
        }
        int i4 = iHashCode * 31;
        ed edVar2 = this.f1959;
        if (edVar2 != null) {
            int i5 = f1956 + 43;
            f1957 = i5 % 128;
            if (i5 % 2 != 0) {
                edVar2.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iHashCode2 = edVar2.hashCode();
        } else {
            int i6 = f1956 + 33;
            f1957 = i6 % 128;
            int i7 = i6 % 2;
        }
        return i4 + iHashCode2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2120(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1958);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
