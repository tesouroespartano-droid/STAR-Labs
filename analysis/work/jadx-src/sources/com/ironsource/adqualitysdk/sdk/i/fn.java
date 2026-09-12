package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class fn extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2089 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static fn f2090 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2091 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2092;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2093;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m2159() {
        f2092 = new char[]{63784, 53206, 38112, 23941};
        f2089 = -738278658983971099L;
    }

    static {
        m2159();
        f2090 = new fn();
        int i = f2093 + 119;
        f2091 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public fn() {
        super(dn.m1990("", -1));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized fn m2157() {
        fn fnVar;
        int i = 2 % 2;
        int i2 = f2093 + 31;
        int i3 = i2 % 128;
        f2091 = i3;
        int i4 = i2 % 2;
        fnVar = f2090;
        int i5 = i3 + 105;
        f2093 = i5 % 128;
        int i6 = i5 % 2;
        return fnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVar = new dr(null);
        int i2 = f2093 + 15;
        f2091 = i2 % 128;
        if (i2 % 2 != 0) {
            return drVar;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2093 + 19;
        f2091 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2158(MotionEvent.axisFromString("") + 1, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (63815 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern();
        int i4 = f2093 + 59;
        f2091 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2158(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2092[b.f638 + i]) ^ (((long) b.f638) * f2089)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
