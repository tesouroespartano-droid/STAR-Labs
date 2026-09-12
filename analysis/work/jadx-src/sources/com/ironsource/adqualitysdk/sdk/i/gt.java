package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import com.ogury.ad.OguryReward;
import io.presage.Presage;

/* JADX INFO: loaded from: classes2.dex */
public final class gt extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2243 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2244 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2245 = 96;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2243 + 35;
        f2244 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2200("\u0000\u0012\u0004\u0011\u000fￍ\u000e\b\u0004\u0006\u0000\u0012\u0004\u0011\uffefￍ\u0004\u0006", TextUtils.lastIndexOf("", '0', 0, 0) + 9, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 193, true, KeyEvent.getDeadChar(0, 0) + 18).intern();
        int i4 = f2243 + 49;
        f2244 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2244 + 17;
        int i3 = i2 % 128;
        f2243 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + InterfaceC0280i1.d.b.d;
        f2244 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return Presage.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        by byVar = new by(mo2168());
        int i2 = f2243 + 91;
        f2244 = i2 % 128;
        if (i2 % 2 != 0) {
            return byVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2243 + 39;
        f2244 = i2 % 128;
        return (i2 % 2 == 0 ? m2200("\b\u0001\u0004\ufff6\ufffe", 5 << (ViewConfiguration.getLongPressTimeout() - 60), 5862 - (ViewConfiguration.getLongPressTimeout() << 23), true, 3 % (KeyEvent.getMaxKeyCode() + 96)) : m2200("\b\u0001\u0004\ufff6\ufffe", 5 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 209, true, 5 - (KeyEvent.getMaxKeyCode() >> 16))).intern();
    }

    public static class b extends gk {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f2246 = {510668098, -258031676, -2087280446, 937018508, -904562019, -545415303, 938046906, 288341311, -1711854753, -1457147266, 305299207, -1278122019, -1899612988, -204832002, -1443076211, -1501924549, -698512215, 205716002};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2247 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2248 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2247 + 113;
            f2248 = i2 % 128;
            String strIntern = (i2 % 2 == 0 ? m2201(new int[]{-1772595640, 1778973303, -45365385, 1586292252, 2077821643, 685613671, 1690407138, -134387259, -1363436540, 738820589, 948754483, 1781721356}, 10 >> Drawable.resolveOpacity(1, 0)) : m2201(new int[]{-1772595640, 1778973303, -45365385, 1586292252, 2077821643, 685613671, 1690407138, -134387259, -1363436540, 738820589, 948754483, 1781721356}, 24 - Drawable.resolveOpacity(0, 0))).intern();
            int i3 = f2247 + 81;
            f2248 = i3 % 128;
            int i4 = i3 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2248 + 113;
            f2247 = i2 % 128;
            if (i2 % 2 == 0) {
                return OguryReward.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            cb cbVar = new cb(mo2168());
            int i2 = f2247 + 91;
            f2248 = i2 % 128;
            int i3 = i2 % 2;
            return cbVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2168() {
            int i = 2 % 2;
            int i2 = f2248 + 93;
            f2247 = i2 % 128;
            String strIntern = (i2 % 2 != 0 ? m2201(new int[]{-45365385, 1586292252, 512795753, -933001820}, (ViewConfiguration.getFadingEdgeLength() / 96) * 3) : m2201(new int[]{-45365385, 1586292252, 512795753, -933001820}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 5)).intern();
            int i3 = f2248 + 99;
            f2247 = i3 % 128;
            int i4 = i3 % 2;
            return strIntern;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2201(int[] iArr, int i) {
            String str;
            synchronized (c.f1230) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2246.clone();
                c.f1231 = 0;
                while (c.f1231 < iArr.length) {
                    cArr[0] = (char) (iArr[c.f1231] >> 16);
                    cArr[1] = (char) iArr[c.f1231];
                    cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                    cArr[3] = (char) iArr[c.f1231 + 1];
                    c.f1232 = (cArr[0] << 16) + cArr[1];
                    c.f1233 = (cArr[2] << 16) + cArr[3];
                    c.m1415(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = c.f1232 ^ iArr2[i2];
                        c.f1232 = i3;
                        c.f1233 = c.m1414(i3) ^ c.f1233;
                        int i4 = c.f1232;
                        c.f1232 = c.f1233;
                        c.f1233 = i4;
                    }
                    int i5 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i5;
                    c.f1233 = i5 ^ iArr2[16];
                    c.f1232 ^= iArr2[17];
                    int i6 = c.f1232;
                    int i7 = c.f1233;
                    cArr[0] = (char) (c.f1232 >>> 16);
                    cArr[1] = (char) c.f1232;
                    cArr[2] = (char) (c.f1233 >>> 16);
                    cArr[3] = (char) c.f1233;
                    c.m1415(iArr2);
                    cArr2[c.f1231 << 1] = cArr[0];
                    cArr2[(c.f1231 << 1) + 1] = cArr[1];
                    cArr2[(c.f1231 << 1) + 2] = cArr[2];
                    cArr2[(c.f1231 << 1) + 3] = cArr[3];
                    c.f1231 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2200(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2245);
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
