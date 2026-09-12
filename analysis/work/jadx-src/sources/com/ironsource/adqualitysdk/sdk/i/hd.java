package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class hd extends ha<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2302 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2303 = 131;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2304;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2305;

    public interface d {
        /* JADX INFO: renamed from: ﾇ */
        void mo1814(hd hdVar, MediaPlayer mediaPlayer);
    }

    public hd(MediaPlayer.OnCompletionListener onCompletionListener, d dVar) {
        super(onCompletionListener);
        this.f2305 = dVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2304 + 83;
        f2302 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2305.mo1814(this, mediaPlayer);
        } catch (Throwable th) {
            jz.m2766(m2215("￼\b\u000b\ufffa\r\b\u000b￨\u0007ￜ\b\u0006\t\u0005\ufffe\r\u0002\b\u0007￥\u0002\f\r\ufffe\u0007\ufffe\u000b\uffdd\ufffe", Color.green(0) + 7, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 234, false, 29 - Gravity.getAbsoluteGravity(0, 0)).intern(), m2215("\uffbf\u0011\u0004\r\u0004\u0013\u0012\b￫\u0001\ufff3\f\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\r\u000e\b\u0013\u0004\u000b\u000f\f\u000e￢\r\u000e", 22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 228 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33).intern(), th, false);
        }
        if (mo795() != null) {
            int i4 = f2302 + 61;
            f2304 = i4 % 128;
            if (i4 % 2 != 0) {
                mo795().onCompletion(mediaPlayer);
                throw null;
            }
            mo795().onCompletion(mediaPlayer);
        }
        int i5 = f2304 + 91;
        f2302 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2215(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2303);
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
