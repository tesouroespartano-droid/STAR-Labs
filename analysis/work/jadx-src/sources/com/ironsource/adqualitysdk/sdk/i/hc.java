package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class hc extends ha<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2295 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2296 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2297 = 14990;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2298 = 13654;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2299 = 53580;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2300 = 62660;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private c f2301;

    public interface c {
        /* JADX INFO: renamed from: ﻛ */
        boolean mo1813(hc hcVar, MediaPlayer mediaPlayer, int i, int i2);
    }

    public hc(MediaPlayer.OnInfoListener onInfoListener, c cVar) {
        super(onInfoListener);
        this.f2301 = cVar;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f2296 + 91;
        f2295 = i4 % 128;
        int i5 = i4 % 2;
        try {
            this.f2301.mo1813(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            jz.m2766(m2214("뀻㐔℠ᥩ䖮昏흽ᄷ뒐莁ﻴ갽\uf7faﮣ蹿鞀\u2d6aꜥｷ糏率㺀计㌗", 23 - KeyEvent.getDeadChar(0, 0)).intern(), m2214("ꩳ⫽\udbe7䏆㤵ꀜ铻\u139d뒓Ꙙ䬵퉷흽ᄷ뒐莁ﻴ갽\uf7faﮣ\uf539꣔쐛鬩鎆綞౾을", 27 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th, false);
        }
        if (mo795() == null) {
            int i6 = f2296 + 99;
            f2295 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 72 / 0;
            }
            return false;
        }
        int i8 = f2295 + 93;
        f2296 = i8 % 128;
        if (i8 % 2 == 0) {
            mo795().onInfo(mediaPlayer, i, i2);
            throw null;
        }
        boolean zOnInfo = mo795().onInfo(mediaPlayer, i, i2);
        int i9 = f2295 + 5;
        f2296 = i9 % 128;
        if (i9 % 2 != 0) {
            return zOnInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2214(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2952) {
            char[] cArr2 = new char[cArr.length];
            k.f2951 = 0;
            char[] cArr3 = new char[2];
            while (k.f2951 < cArr.length) {
                cArr3[0] = cArr[k.f2951];
                cArr3[1] = cArr[k.f2951 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    char c4 = (char) (c2 - (((c3 + i2) ^ ((c3 << 4) + f2299)) ^ ((c3 >>> 5) + f2297)));
                    cArr3[1] = c4;
                    cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2300) ^ ((c4 + i2) ^ ((c4 << 4) + f2298))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
