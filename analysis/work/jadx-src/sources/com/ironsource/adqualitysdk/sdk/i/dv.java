package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dv extends ed {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1883 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1884 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1885 = -4922359291111631031L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed[] f1886;

    public dv(List<ed> list, dn dnVar) {
        super(dnVar);
        ed[] edVarArr = new ed[list.size()];
        this.f1886 = edVarArr;
        list.toArray(edVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1886;
        int length = edVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f1883 + 61;
            f1884 = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList.add(edVarArr[i2].m2116(dqVar, coVar).m2019());
                i2 += 41;
            } else {
                arrayList.add(edVarArr[i2].m2116(dqVar, coVar).m2019());
                i2++;
            }
        }
        return new dr(arrayList);
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2083("霒", 32798 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(m2114(this.f1886)).append(m2083("霔", 27611 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()).toString();
        int i2 = f1884 + 79;
        f1883 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f1884 + 65;
            f1883 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        boolean zEquals = Arrays.equals(this.f1886, ((dv) obj).f1886);
        int i4 = f1883 + 113;
        f1884 = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1884 + 59;
        f1883 = i2 % 128;
        int i3 = i2 % 2;
        ed[] edVarArr = this.f1886;
        if (i3 != 0) {
            return Arrays.hashCode(edVarArr);
        }
        Arrays.hashCode(edVarArr);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2083(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1885);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
