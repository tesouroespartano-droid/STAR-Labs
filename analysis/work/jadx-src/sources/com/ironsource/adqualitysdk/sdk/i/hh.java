package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class hh extends ha<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2316 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2317 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2318 = {'O', 'n', 'T', 'o', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'r', 'D', 'a', 'E', ' ', 'm', 'b', 'P', 'Q', 'R', 'S', 'U', 'V'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2319 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private e f2320;

    public interface e {
        /* JADX INFO: renamed from: ﾒ */
        boolean mo1812(hh hhVar, View view, MotionEvent motionEvent);
    }

    public hh(View.OnTouchListener onTouchListener, e eVar) {
        super(onTouchListener);
        this.f2320 = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f2317 + 75;
        f2319 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2320.mo1812(this, view, motionEvent);
                throw null;
            }
            this.f2320.mo1812(this, view, motionEvent);
            if (mo795() == null) {
                return false;
            }
            int i3 = f2319 + 47;
            f2317 = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnTouch = mo795().onTouch(view, motionEvent);
            int i5 = f2317 + 79;
            f2319 = i5 % 128;
            if (i5 % 2 != 0) {
                return zOnTouch;
            }
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2218("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0006\u0010\r\u000e\n\u0006\u0002\r\n\u000b\u0002\r", (byte) (AndroidCharacter.getMirror('0') + 'E'), TextUtils.indexOf((CharSequence) "", '0', 0) + 25).intern(), m2218("\u0011\n\r\u0002\u000b\u0011\u0006\u0003\u0011\u0012\u0003\u0011\b\t\u0005\u000e\u0010\u0006\f\r\u0012\u0001\u0002\u0003\u0004\u0000\u0006\u0007", (byte) (85 - Color.alpha(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2218(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2318;
            char c = f2316;
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
