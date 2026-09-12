package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import io.bidmachine.BidMachine;

/* JADX INFO: loaded from: classes2.dex */
public final class gd extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2170 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2171 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2172 = {'i', 'o', '.', 'b', 'd', 'm', 'a', 'c', 'h', 'n', 'e', 'B', 'M', 'j', 'k', 'l'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2173;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        byte bResolveOpacity;
        int scrollBarFadeDuration;
        int i = 2 % 2;
        int i2 = f2173 + 63;
        f2170 = i2 % 128;
        if (i2 % 2 == 0) {
            bResolveOpacity = (byte) (90 / Drawable.resolveOpacity(0, 0));
            scrollBarFadeDuration = 6 - (ViewConfiguration.getScrollBarFadeDuration() * 41);
        } else {
            bResolveOpacity = (byte) (Drawable.resolveOpacity(0, 0) + 37);
            scrollBarFadeDuration = 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
        }
        return m2180("\u0001\u0002\u0003\u0000\u0004\b\u0006\u0007\u0004\u000b\u0001\b\u000e\u0006\b\u0003\b\u0000\u0007\u0004\f\u0004\n\u000b", bResolveOpacity, scrollBarFadeDuration).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2170;
        int i3 = i2 + 43;
        f2173 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 33;
        f2173 = i4 % 128;
        int i5 = i4 % 2;
        return BidMachine.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bj bjVar = new bj(mo2168());
        int i2 = f2170 + 89;
        f2173 = i2 % 128;
        int i3 = i2 % 2;
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2170 + 105;
        f2173 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2180("\u0000\u0001\u0005\u0006\u0007\u0004\f\u0004\n\u000b", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB), 9 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern();
        int i4 = f2173 + 15;
        f2170 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2180(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2172;
            char c = f2171;
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
