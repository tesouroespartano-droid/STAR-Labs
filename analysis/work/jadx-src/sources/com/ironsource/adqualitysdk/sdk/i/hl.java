package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class hl extends ha<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2347 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2348 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2349 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2350 = {'O', 'n', 'S', 'e', 'k', 'C', 'o', 'm', 'p', 'l', 't', 'L', 'i', 's', 'r', 'D', 'c', 'a', 'E', ' ', 'T', 'b', 'P', 'Q', 'R'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private b f2351;

    public interface b {
        /* JADX INFO: renamed from: ｋ */
        void mo1816(hl hlVar, MediaPlayer mediaPlayer);
    }

    public hl(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, b bVar) {
        super(onSeekCompleteListener);
        this.f2351 = bVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        try {
            this.f2351.mo1816(this, mediaPlayer);
        } catch (Throwable th) {
            jz.m2766(m2232("\u0001\u0002\u0003\u0004\u0004\u0000\u0006\u0007\b\t\b\u0004\r\u0000\f\r\u000e\u000b\u0004\u0002\u0004\r\u0012\u0000\u0015\u000b\f\u0013\u000b\u0005¼", (byte) (74 - View.getDefaultSize(0, 0)), (Process.myPid() >> 22) + 31).intern(), m2232("\u0013\r\u000b\t\u0013\u0018\u000b\u0002\u0011\t\u0015\u0016\f\r\u000e\u000b\u0004\u0002\u0004\r\u0010\t\u0002\u0003ÙÙ\u0000\t\u0007\b\t\u0005\u0000\rÙ", (byte) (View.resolveSize(0, 0) + 116), 35 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        if (mo795() != null) {
            mo795().onSeekComplete(mediaPlayer);
            int i2 = f2347 + 99;
            f2349 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f2347 + 53;
        f2349 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2232(String str, byte b2, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2350;
            char c = f2348;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b2);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
                    f.f2045 = cArr[f.f2047];
                    f.f2048 = cArr[f.f2047 + 1];
                    if (f.f2045 == f.f2048) {
                        cArr3[f.f2047] = (char) (f.f2045 - b2);
                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b2);
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
