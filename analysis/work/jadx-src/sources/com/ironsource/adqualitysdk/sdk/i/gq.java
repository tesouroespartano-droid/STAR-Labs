package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import com.moloco.sdk.publisher.Moloco;

/* JADX INFO: loaded from: classes2.dex */
public final class gq extends gk {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2234 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2236;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2233 = {28232, 45311, 54064, 62004, 5290, 14307, 22053, 31065, 39824, 47831, 56651, 64593, 7819, 8511, 16447, 25262, 34286, 42018, 51041, 59811, 2244, 11028, 19036, 27796, 36749, 44581, 61626, 5118, 12848, 21863, 30638, 26536, 47377, 56031, 64411, 7498, 15885};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2235 = 5545008036240875195L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2236 + InterfaceC0280i1.d.b.b;
        f2234 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2197((-1) >>> Process.getGidForName(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) * 6, (char) (Drawable.resolveOpacity(0, 0) * 9454)) : m2197((-1) - Process.getGidForName(""), 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 28203))).intern();
        int i3 = f2236 + 93;
        f2234 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2234;
        int i3 = i2 + 55;
        f2236 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + InterfaceC0280i1.d.b.b;
        f2236 = i5 % 128;
        if (i5 % 2 == 0) {
            return Moloco.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bt btVar = new bt(mo2168());
        int i2 = f2234 + 79;
        f2236 = i2 % 128;
        if (i2 % 2 == 0) {
            return btVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2234 + 61;
        f2236 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2197((ViewConfiguration.getFadingEdgeLength() >> 16) + 31, 5 - Process.getGidForName(""), (char) (26565 - (ViewConfiguration.getScrollBarSize() >> 8))).intern();
        int i4 = f2234 + 11;
        f2236 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2197(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2233[b.f638 + i]) ^ (((long) b.f638) * f2235)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
