package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class eo extends ei {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1990 = {1688, 6493};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1991 = 7527357682357247941L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1992 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1993;

    public eo(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        return new dr(Boolean.valueOf(m2129().m2116(dqVar, coVar).m2018() && m2128().m2116(dqVar, coVar).m2018()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f1993 + 85;
        f1992 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2138(Process.myTid() >> 22, 2 - (Process.myTid() >> 22), (char) (View.getDefaultSize(0, 0) + 1726)).intern();
        int i4 = f1992 + 55;
        f1993 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2138(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1990[b.f638 + i]) ^ (((long) b.f638) * f1991)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
