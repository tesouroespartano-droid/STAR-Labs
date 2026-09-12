package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public final class he extends ha<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2306 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2307 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2308 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2309 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2310 = 58640;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private c f2311;

    public interface c {
        /* JADX INFO: renamed from: ﻛ */
        void mo1810(he heVar, MediaPlayer mediaPlayer);
    }

    public he(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f2311 = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        try {
            this.f2311.mo1810(this, mediaPlayer);
        } catch (Throwable th) {
            jz.m2766(m2216("孆见\u206f톟唬孊鈥ⱻ끅ꁁ\u192f⟃査㽽鸅\ud8f5偂螑\ue322嘯駚\uffd9显贂휈㊧뾟", (-454145104) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "낏\uee4b滤Ü", "\u0000\u0000\u0000\u0000", (char) (View.getDefaultSize(0, 0) + 56430)).intern(), m2216("符簂ࣾΑ覯롲䀙ঙ迅\ud95c㫲셮낅ᛰ쟷덍龯鹈뗢땦닊쵬⇓쀔ൟ䄧㥛\u1f46꧊묫镂", 135568780 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "豇ᒝ⨈⮐", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0') + 36907)).intern(), th, false);
        }
        if (mo795() != null) {
            int i2 = f2307 + 113;
            f2306 = i2 % 128;
            int i3 = i2 % 2;
            mo795().onPrepared(mediaPlayer);
            int i4 = f2306 + 77;
            f2307 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2216(String str, int i, String str2, String str3, char c2) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (g.f2155) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c2 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2309) ^ ((long) f2308)) ^ ((long) f2310));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
