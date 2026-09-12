package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.VideoView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jy {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static short[] f2934 = null;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2935 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2936 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Field f2938 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2939 = -898603357;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2940 = 88;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2941 = -534976191;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field f2942;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Field f2943;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Class f2944;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field f2945;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object f2946;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f2937 = {-58, -4, 3, 36, -41, Ascii.CR, -2, 6, -13, Ascii.CR, Ascii.DC4, -42, 8, Ascii.VT, -10, 5, Ascii.DC2, 41, -73, Ascii.DC2, -4, -13, 72, -54, -5, -6, -3, Ascii.SO, -10, Ascii.CR, -78, 8, -9, Ascii.DC4, -5, 1, 33, -48, Ascii.SI, -2, -77, 2, -11, Ascii.CR, -19, 1, 5, 37, -43, Ascii.SI, -2, -53, -26, -57, -4, Ascii.DC2, -4, -13, 86, -82, Ascii.CR, -2, 6, -13, Ascii.CR, Ascii.DC4, -42, 8, Ascii.VT, -10, 5, Ascii.DC2, 55, -71, -7, 5, -11, 0, Ascii.SI, -2, 71, -82, 3, -3, 0, 45, -72, Ascii.CR, -9, 9, -15, 1, 10, Ascii.GS, -28, 5, -18, 6, Ascii.ESC, -26, Ascii.US, -30, -65, Ascii.CR, -20, Ascii.CAN, -11, Ascii.FS, -17, -8, 5, -1, Ascii.CAN, -39, Ascii.SI, -2, 71, -78, 5, 73, -82, 3, -3, 0, Ascii.CR, -53, Ascii.CR, -9, 9, -15, 1, 10, Ascii.GS, -35, 9, -8, 37, -24, -8, 5, -1, Ascii.CAN, -33, Ascii.US, -22, 2, 2, -11, -4, Ascii.VT, -13, 82, -78, 5, 73, -82, 3, -3, 0, Ascii.CR, -49, Ascii.CR, -9, 9, -15, 1, 10, Ascii.GS, -24, -1, -13, 17, -15, Ascii.VT, -13, 34, -17, -8, 5, -1, Ascii.CAN, -33, Ascii.US, -22, 2, 2, -11, -4, Ascii.VT, -13, 82, -78, 5, 73, -82, 3, -3, 0, Ascii.CR, -82, -4, Ascii.DC2, -4, 19, -23};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f2933 = -3313740021071807258L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<View> m2747() {
        int i = 2 % 2;
        int i2 = f2935 + 123;
        f2936 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = f2936 + 117;
        f2935 = i4 % 128;
        if (i4 % 2 != 0) {
            try {
                if (Build.VERSION.SDK_INT < 111) {
                    if (f2944 == null || f2946 == null) {
                        Class<?> cls = Class.forName(m2746(534976191 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") - 89, TextUtils.getCapsMode("", 0, 0) + 898603454, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
                        f2944 = cls;
                        f2946 = cls.getMethod(m2746(ExpandableListView.getPackedPositionChild(0L) + 534976222, (byte) (Process.myPid() >> 22), (-90) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 898603459, (short) View.resolveSizeAndState(0, 0, 0)).intern(), new Class[0]).invoke(null, new Object[0]);
                    }
                    return m2748(f2944, f2946);
                }
            } catch (Throwable th) {
                n.m2867(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", (Process.getThreadPriority(0) + 20) >> 6).intern(), new StringBuilder().append(m2746(TextUtils.lastIndexOf("", '0', 0, 0) + 534976243, (byte) View.getDefaultSize(0, 0), (-89) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 898603425, (short) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()).append(th.getLocalizedMessage()).toString());
                return new ArrayList();
            }
        }
        int i5 = f2935 + 99;
        f2936 = i5 % 128;
        int i6 = i5 % 2;
        if (f2944 == null || f2946 == null) {
            Class<?> cls2 = Class.forName(m2753("껇꺦䰍낅서㢴架崰酶䂒Ⱌ笒䦁哺ↅ䳣琡杼ᗡ䁢惃箬े吩潞ี窹⦻ᬲʁ渇㵘ހᛩ掉ເ", ViewConfiguration.getEdgeSlop() >> 16).intern());
            f2944 = cls2;
            f2946 = cls2.getMethod(m2746(534976231 - View.resolveSize(0, 0), (byte) View.getDefaultSize(0, 0), View.MeasureSpec.getMode(0) - 89, 898603460 - KeyEvent.keyCodeFromString(""), (short) (MotionEvent.axisFromString("") + 1)).intern(), new Class[0]).invoke(null, new Object[0]);
        }
        return m2748(f2944, f2946);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static View.OnClickListener m2749(View view) {
        try {
            Object objM2745 = m2745(view);
            if (objM2745 == null) {
                return null;
            }
            Class<?> cls = objM2745.getClass();
            synchronized (jv.class) {
                if (f2943 == null) {
                    f2943 = m2756(cls, m2753("梒棿馦攏\udee7❅ߺ魦\uf10b锘㏠ᬪ迮腰㹨ⲝ눿닏ਖ\u2003", TextUtils.lastIndexOf("", '0', 0) + 1).intern());
                }
            }
            return (View.OnClickListener) f2943.get(objM2745);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2750(View view, hf.e eVar) {
        int i = 2 % 2;
        int i2 = f2936 + 9;
        f2935 = i2 % 128;
        if (i2 % 2 == 0) {
            View.OnClickListener onClickListenerM2749 = m2749(view);
            if (!(onClickListenerM2749 instanceof hf)) {
                view.setOnClickListener(new hf(onClickListenerM2749, eVar));
            }
            int i3 = f2936 + 119;
            f2935 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = m2749(view) instanceof hf;
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m2744(View view) {
        try {
            Object objM2745 = m2745(view);
            if (objM2745 == null) {
                return null;
            }
            Class<?> cls = objM2745.getClass();
            synchronized (jv.class) {
                if (f2938 == null) {
                    f2938 = m2756(cls, m2746(534976277 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) Color.green(0), (-88) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 898603466, (short) TextUtils.indexOf("", "")).intern());
                }
            }
            return (View.OnTouchListener) f2938.get(objM2745);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static MediaPlayer m2752(VideoView videoView) {
        int i = 2 % 2;
        int i2 = f2935 + 55;
        f2936 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM2756 = m2756(VideoView.class, m2753("מּﭓ뻿䉔\u0ada\uf373\u209e࣏홈뉋\ue7ee㱮ᱯ\ua63b\uea43\u0bd8", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
            if (fieldM2756 != null) {
                return (MediaPlayer) fieldM2756.get(videoView);
            }
            int i4 = f2935 + 117;
            f2936 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m2746((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 534976294, (byte) View.resolveSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 89, 898603458 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), (Throwable) e, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2754(MediaPlayer mediaPlayer, hc.c cVar) {
        Field fieldM2756;
        MediaPlayer.OnInfoListener onInfoListener;
        int i = 2 % 2;
        int i2 = f2935 + InterfaceC0280i1.d.b.g;
        f2936 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                fieldM2756 = m2756(MediaPlayer.class, m2753("ᢣᣎ壮ꑇ볈䕪촰\ueb55㯋呟凃퇍\ufffa䀢局\ue64c숅玌栮", Gravity.getAbsoluteGravity(1, 1)).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM2756.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            } else {
                fieldM2756 = m2756(MediaPlayer.class, m2753("ᢣᣎ壮ꑇ볈䕪촰\ueb55㯋呟凃퇍\ufffa䀢局\ue64c숅玌栮", Gravity.getAbsoluteGravity(0, 0)).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM2756.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            }
            fieldM2756.set(mediaPlayer, new hc(onInfoListener, cVar));
            int i3 = f2936 + 79;
            f2935 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", Gravity.getAbsoluteGravity(0, 0)).intern(), m2746(534976316 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (AndroidCharacter.getMirror('0') - '0'), (-89) - View.resolveSizeAndState(0, 0, 0), 898603458 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) KeyEvent.keyCodeFromString("")).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2755(MediaPlayer mediaPlayer, hd.d dVar) {
        Field fieldM2756;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i = 2 % 2;
        int i2 = f2936 + 51;
        f2935 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                fieldM2756 = m2756(MediaPlayer.class, m2753("阢陏⡲퓛臾硜童旕谔Ⓢ泪昲煷ス慫写䲄̹唃崝堶Ὸ䦼䥣垨", View.MeasureSpec.makeMeasureSpec(0, 1)).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2756.get(mediaPlayer);
                if (onCompletionListener instanceof hd) {
                    return;
                }
            } else {
                fieldM2756 = m2756(MediaPlayer.class, m2753("阢陏⡲퓛臾硜童旕谔Ⓢ泪昲煷ス慫写䲄̹唃崝堶Ὸ䦼䥣垨", View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2756.get(mediaPlayer);
                if (onCompletionListener instanceof hd) {
                    return;
                }
            }
            fieldM2756.set(mediaPlayer, new hd(onCompletionListener, dVar));
            int i3 = f2936 + 23;
            f2935 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", TextUtils.indexOf("", "")).intern(), m2753("\uea06\uea63ⶌ턘鍏櫱\ud827᧬\u2efaⅆ繂쓞ഖ㕼珖\uf368アۗ䞸￥␩ᨰ嬮\ueb8d⮚澯⣪阓忹挃㱣苔䍋睢㇒녏皨䣲֪뷻稪屃ᤅꦕ榄", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2757(MediaPlayer mediaPlayer, he.c cVar) {
        int i = 2 % 2;
        int i2 = f2936 + 27;
        f2935 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM2756 = m2756(MediaPlayer.class, m2753("톐퇽\ue836ᒟ벻䔙紈≺诪\ue484冯懁㛒\uf0ec尣噄\u0b31썂桛嫵ᾞ\udfbc瓥", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2756.get(mediaPlayer);
            if (!(onPreparedListener instanceof he)) {
                fieldM2756.set(mediaPlayer, new he(onPreparedListener, cVar));
            }
            int i4 = f2935 + 71;
            f2936 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", View.MeasureSpec.getMode(0)).intern(), m2746(534976350 - ImageFormat.getBitsPerPixel(0), (byte) View.MeasureSpec.getSize(0), (-89) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 898603458, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2758(MediaPlayer mediaPlayer, hl.b bVar) {
        int i = 2 % 2;
        int i2 = f2936 + 19;
        f2935 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM2756 = m2756(MediaPlayer.class, m2753("捗挺௯\uf746ӹﵛ\ue27f邪ᒞݝ\ue9f6ﺗ萈ጽ\ue475줐맺ₜ퀈얨굞㱳첡퇩ꋁ䧽뽏", TextUtils.getOffsetBefore("", 0)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2756.get(mediaPlayer);
            if (!(onSeekCompleteListener instanceof hl)) {
                fieldM2756.set(mediaPlayer, new hl(onSeekCompleteListener, bVar));
                int i4 = f2936 + 115;
                f2935 = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = f2935 + 73;
            f2936 = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2753("羽嗢鑔检뒘䴦\ufd91৴ୌ颞妕\ue168ᴎ貤吁훞₺뼏息\uda53㐱ꏨ糧츻㮃홵༟뎉俣\udac6ᮨꝫ卂캫ᘠ铿暭\uf112≱顐樣\ue58c", View.combineMeasuredStates(0, 0)).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<View> m2748(Class cls, Object obj) throws Exception {
        int i = 2 % 2;
        if (f2945 == null) {
            Field declaredField = cls.getDeclaredField(m2746((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 534976389, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) - 88, Process.getGidForName("") + 898603467, (short) View.getDefaultSize(0, 0)).intern());
            f2945 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2945.get(obj);
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof View[]) {
                List<View> listAsList = Arrays.asList((View[]) f2945.get(obj));
                int i2 = f2935 + 21;
                f2936 = i2 % 128;
                int i3 = i2 % 2;
                return listAsList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = f2935 + 25;
            f2936 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return arrayList;
        }
        int i6 = f2936 + 19;
        f2935 = i6 % 128;
        if (i6 % 2 == 0) {
            return (List) f2945.get(obj);
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m2745(View view) {
        try {
            synchronized (jv.class) {
                if (f2942 == null) {
                    f2942 = m2756(View.class, m2753("\uf658\uf635캈㈢躂眧ﳥִਤ숹授\ue00bᄚ홽渐힠⳿", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern());
                }
            }
            return f2942.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Field m2756(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f2935 + 3;
        f2936 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i4 = f2935 + 45;
            f2936 = i4 % 128;
            if (i4 % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (Exception e) {
            jz.m2766(m2753("덻댺\u0e73\uf2fb⬯튇躏䂌硏ˬ옯鉐吿ᚄ쮿ꗞ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m2753("픫핎\uf20cຘ聅移䁄⛁뚙ﻆ浈岽㈻\ueae9惜欏ྦྷ\ud953咲枏ᬪ얬䠌珯ᒕ뀯㯤\u0e5f惟", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), (Throwable) e, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2751(View view, hh.e eVar) {
        View.OnTouchListener onTouchListenerM2744;
        int i = 2 % 2;
        int i2 = f2936 + 19;
        f2935 = i2 % 128;
        if (i2 % 2 != 0) {
            onTouchListenerM2744 = m2744(view);
            int i3 = 34 / 0;
            if (onTouchListenerM2744 instanceof hh) {
                return;
            }
        } else {
            onTouchListenerM2744 = m2744(view);
            if (onTouchListenerM2744 instanceof hh) {
                return;
            }
        }
        view.setOnTouchListener(new hh(onTouchListenerM2744, eVar));
        int i4 = f2936 + 81;
        f2935 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2746(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2940;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2937;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2941 + i] + i4);
                } else {
                    i5 = (short) (f2934[f2941 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2941 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2939);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2937;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2934;
                        int i8 = l.f3000;
                        l.f3000 = i8 - 1;
                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                    }
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001++;
                }
            }
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2753(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2933, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2933));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
