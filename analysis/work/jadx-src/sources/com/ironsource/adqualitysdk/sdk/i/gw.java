package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.ironsource.InterfaceC0280i1;
import com.smaato.sdk.core.SmaatoSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class gw extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2262 = {'c', 'o', 'm', '.', 's', 'a', 't', 'd', 'k', 'r', 'e', 'S', 'f', 'g', 'h', 'i'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2263 = 4;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2264 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2265;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2265 + 113;
        f2264 = i2 % 128;
        int i3 = i2 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        return (i3 == 0 ? m2204("\u0001\u0002\u0003\u0000\u0006\u0000\u0095\u0095\u0005\u0002\u0000\u0007\u0004\u000b\u0000\u0001\u0005\r\u000b\u0002\n\u0003\u0095\u0095\u0005\u0002\u000f\u000b\u009f", (byte) (29 << (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1))), Color.rgb(0, 1, 0) * (-16777187)) : m2204("\u0001\u0002\u0003\u0000\u0006\u0000\u0095\u0095\u0005\u0002\u0000\u0007\u0004\u000b\u0000\u0001\u0005\r\u000b\u0002\n\u0003\u0095\u0095\u0005\u0002\u000f\u000b\u009f", (byte) (53 - (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1))), (-16777187) - Color.rgb(0, 0, 0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2264;
        int i3 = i2 + 35;
        f2265 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 55;
        f2265 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bx bxVar = new bx(mo2168());
        int i2 = f2264 + 41;
        f2265 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return bxVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        byte b;
        int iResolveOpacity;
        int i = 2 % 2;
        int i2 = f2265 + InterfaceC0280i1.d.b.b;
        f2264 = i2 % 128;
        int i3 = i2 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i3 == 0) {
            b = (byte) (25 - (jElapsedRealtime > 1L ? 1 : (jElapsedRealtime == 1L ? 0 : -1)));
            iResolveOpacity = Drawable.resolveOpacity(1, 1) + 23;
        } else {
            b = (byte) ((jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)) + 115);
            iResolveOpacity = 6 - Drawable.resolveOpacity(0, 0);
        }
        String strIntern = m2204("\u0006\u0000ÕÕ\u0005\u0002", b, iResolveOpacity).intern();
        int i4 = f2264 + InterfaceC0280i1.d.b.g;
        f2265 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2204(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2262;
            char c = f2263;
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
