package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3011 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3012 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f3013;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f3014;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f3015;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Handler f3016;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Handler f3017;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m2893() {
        f3015 = -6068257372808872509L;
        f3013 = 0;
        f3014 = (char) 0;
    }

    static {
        m2893();
        f3016 = new Handler(Looper.getMainLooper());
        f3017 = m2896();
        int i = f3011 + 27;
        f3012 = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Handler m2898() {
        int i = 2 % 2;
        int i2 = f3011 + 59;
        f3012 = i2 % 128;
        if (i2 % 2 != 0) {
            return f3016;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2899(iu iuVar) {
        int i = 2 % 2;
        int i2 = f3012 + 117;
        f3011 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(!m2901())) {
                iuVar.run();
                return;
            }
            m2897(iuVar);
            int i3 = f3011 + 39;
            f3012 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
                return;
            }
            return;
        }
        m2901();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2897(iu iuVar) {
        int i = 2 % 2;
        int i2 = f3012 + 73;
        f3011 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m2898().post(iuVar);
            int i4 = f3012 + 67;
            f3011 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Error unused) {
            n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) View.resolveSizeAndState(0, 0, 0), Drawable.resolveOpacity(0, 0), "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("ꎽ欙⭁낊", (char) (Color.rgb(0, 0, 0) + 16812587), Process.getGidForName("") + 1097537956, "목\udf1b쨃迈⍭ᷨ辷竪ꐇ긅㻕鿞\uf73b駒\udd27⨆먦劵茸䝎秂吳켠奋沏೪遲\uf564\udab0", "ﷃࠔ㠒ꯉ").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2895(iu iuVar, long j) {
        int i = 2 % 2;
        int i2 = f3011 + 35;
        f3012 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m2898().postDelayed(iuVar, j);
                int i3 = f3011 + 17;
                f3012 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            m2898().postDelayed(iuVar, j);
            throw null;
        } catch (Error unused) {
            n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) (Process.myTid() >> 22), ViewConfiguration.getScrollBarFadeDuration() >> 16, "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("䑘㜓兎쏬", (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.blue(0) + 1312232260, "\ue9c0옻铐䶍\udfd0奕\uf2ef睧躨햼蚵㞊ୖ鈜E艥냠鋖縆瀰챫俣Ⓙ\udd27㏍\uec8a玶祮쿄ქꛆ笖鴙ӂ\u139c蚡竮", "ﷃࠔ㠒ꯉ").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2894(iu iuVar) {
        int i = 2 % 2;
        int i2 = f3011 + 87;
        f3012 = i2 % 128;
        int i3 = i2 % 2;
        if (m2901()) {
            m2900(iuVar);
            int i4 = f3011 + 23;
            f3012 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        iuVar.run();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2900(iu iuVar) {
        int i = 2 % 2;
        int i2 = f3012 + 9;
        f3011 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m2890().post(iuVar);
            int i4 = f3012 + 81;
            f3011 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
        } catch (Error unused) {
            n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), MotionEvent.axisFromString("") + 1, "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("쪇䲪嗿\udb35", (char) TextUtils.getOffsetAfter("", 0), ViewConfiguration.getKeyRepeatTimeout() >> 16, "獕朠릗畝뜈棔\u2fde䳪⌨ΰ荚鿣囹ᵖ̧\ue21d죆惲눖턺쵊촜卙伲囇㿫\uee74侭븝ʱ๕ᦓ\uf88d蠯ꂔ螝", "ﷃࠔ㠒ꯉ").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2892(iu iuVar, long j) {
        int i = 2 % 2;
        int i2 = f3012 + 57;
        f3011 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m2890().postDelayed(iuVar, j);
            int i4 = f3011 + 51;
            f3012 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Error unused) {
            n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 1, "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("쪇䲪嗿\udb35", (char) View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "獕朠릗畝뜈棔\u2fde䳪⌨ΰ荚鿣囹ᵖ̧\ue21d죆惲눖턺쵊촜卙伲囇㿫\uee74侭븝ʱ๕ᦓ\uf88d蠯ꂔ螝", "ﷃࠔ㠒ꯉ").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m2890() {
        int i = 2 % 2;
        int i2 = f3012 + 1;
        int i3 = i2 % 128;
        f3011 = i3;
        int i4 = i2 % 2;
        Handler handler = f3017;
        int i5 = i3 + 21;
        f3012 = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2901() {
        int i = 2 % 2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            int i2 = f3011 + 107;
            f3012 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f3011 + 67;
        f3012 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Handler m2896() {
        int i = 2 % 2;
        try {
            HandlerThread handlerThread = new HandlerThread(m2891("檁\ud9f5䘟蛕", (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0), "\udd9b揇\udba1쟼痍䵬ﵴ䠠錱恝", "ﷃࠔ㠒ꯉ").intern());
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    handlerThread.start();
                    return new Handler(handlerThread.getLooper());
                } catch (Error unused) {
                    n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) ExpandableListView.getPackedPositionGroup(0L), ViewConfiguration.getMinimumFlingVelocity() >> 16, "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("⇴誴\udbe6껾", (char) KeyEvent.normalizeMetaState(0), Color.alpha(0), "嫘磖癥锌扦㝋竤龺\u0adf丯መ៍酸\udce5Ｋ霍砳䢎\u0dd5\udcdb儮븹鲔\ue1af聸\uf0ca쪀\u20f2ଥ\ue91b㨑鍄ᄼ↰\ue4ef\ud8f2唓珘㴛龖\uf4af爜『慇韬볂ප⑄", "ﷃࠔ㠒ꯉ").intern(), true);
                }
            }
            int i3 = f3011 + 69;
            f3012 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Error unused2) {
            n.m2885(m2891("\ufdda\uf3cb墙ꡍ", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Process.myPid() >> 22, "\udfb8䶱₇⛎\ue27a\u2cf4ᖠ뮡迪챚⚱꓂", "ﷃࠔ㠒ꯉ").intern(), m2891("抦ꬄₗ⣑", (char) View.resolveSize(0, 0), MotionEvent.axisFromString("") - 1750399901, "퓍｛馭ꑂ¸삉\ue3f4뷅ꗘ턅嗓ऴ谌\ue46e댴ꐂ胿矺䨻ஏᆤ쎘흽䪅迴틳줦`켐澭漍㚤㴢䋡稞", "ﷃࠔ㠒ꯉ").intern(), true);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2891(String str, char c, int i, String str2, String str3) {
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
            char[] cArr4 = (char[]) cArr3.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr2[g.f2156])) ^ f3015) ^ ((long) f3013)) ^ ((long) f3014));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
