package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.ironsource.W2;

/* JADX INFO: loaded from: classes2.dex */
public final class ij {

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    private static int f2514 = 1;

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    private static int f2515;

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    private static long f2516;

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    private static int f2517;

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    private static char[] f2518;

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static String f2519;

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static String f2520;

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static String f2521;

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static String f2522;

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static String f2523;

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static String f2524;

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static String f2525;

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static String f2526;

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static String f2527;

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static String f2528;

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static String f2529;

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static String f2530;

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static String f2531;

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static String f2532;

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static String f2533;

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static String f2534;

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static String f2535;

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static String f2536;

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static String f2537;

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static String f2538;

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static String f2539;

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static String f2540;

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static String f2541;

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static String f2542;

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static String f2543;

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static String f2544;

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static String f2545;

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static String f2546;

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static String f2547;

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static String f2548;

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static String f2549;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static String f2550;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static String f2551;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static String f2552;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static String f2553;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static String f2554;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static String f2555;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static String f2556;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static String f2557;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static String f2558;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static String f2559;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static String f2560;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static String f2561;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static String f2562;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static String f2563;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String f2564;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String f2565;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String f2566;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String f2567;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String f2568;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String f2569;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String f2570;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String f2571;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String f2572;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String f2573;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m2469() {
        f2518 = new char[]{'i', 11191, 22470, 33774, 44803, 56143, 1911, 12955, 24225, 35534, 46612, 'p', 11189, 22485, 33765, 18322, 27726, 4105, 50201, 59620, 40102, 46323, 40749, 8048, 13480, 18650, 40185, 45073, 50262, 'r', 11196, 22486, 33762, 44822, 56152, 1909, 12955, 30363, 23882, 8496, 62741, 55805, 44463, 28348, 17760, 14617, 60735, 49629, 'a', 11197, 22468, 33762, 44823, 'c', 11189, 22489, 33784, 44822, 56158, 'c', 11181, 22468, 33759, 44829, 56141, 1907, 28485, 17565, 14567, 60648, 49184, 46183, 26707, 25054, 18968, 13950, 57942, 52926, 47865, 26317, 61196, 50399, 47288, 27803, 16499, 13364, 59392, 'e', 11194, 22471, 33785, 44808, 56142, 3894, 9442, 22670, 36000, 41037, 'i', 11197, 22481, 33787, 44810, 60906, 50750, 47698, 28280, 17033, 14042, 60134, 57116, 11011, 222, 31929, 43172, 33902, 61440, 11274, 6626, 30165, 48817, 38241, 59688, 15622, 4557, 26021, 47514, 35941, 57428, 13372, 19139, 24851, 7514, 51572, 58796, 37316, 19960, 30725, 5175, 49231, 64661, 20940, 31260, 1621, 53883, 65203, 35533, 22259, 25369, 3896, 56128, 59290, 64631, 55208, 43989, 32763, 21295, 10065, 64370, 52866, 'o', 11195, 22488, 33774, 44807, 56137, 1859, 12954, 24225, 35525, 6422, 13018, 20146, 'd', 11190, 22524, 33764, 44816, 56174, 1907, 12929, 24236, 35556, 46604, 57910, 3650, 14961};
        f2516 = 3951127393364028377L;
        f2517 = 156;
    }

    static {
        m2469();
        f2572 = m2470(Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 11, (char) TextUtils.getTrimmedLength("")).intern();
        f2569 = m2468("\ufffb\b\u0002�", Color.alpha(0) + 4, 264 - (ViewConfiguration.getEdgeSlop() >> 16), true, View.MeasureSpec.getMode(0) + 4).intern();
        f2571 = m2470((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 4 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(0, 0)).intern();
        f2573 = m2468("\ufffb\uffff\n\u0013￮\ufffe", 1 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 258, true, 6 - KeyEvent.keyCodeFromString("")).intern();
        f2570 = m2470(15 - KeyEvent.keyCodeFromString(""), Gravity.getAbsoluteGravity(0, 0) + 6, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18419)).intern();
        f2564 = m2470((Process.myTid() >> 22) + 21, 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (46215 - (ViewConfiguration.getScrollBarSize() >> 8))).intern();
        f2566 = m2470(23 - (ViewConfiguration.getLongPressTimeout() >> 16), 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 7943)).intern();
        f2567 = m2470(29 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 8, (char) KeyEvent.normalizeMetaState(0)).intern();
        f2565 = m2468("\u000b\ufffa\u0006\f\u0010￼￼￩\ufffa", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, AndroidCharacter.getMirror('0') + 211, false, (ViewConfiguration.getPressedStateDuration() >> 16) + 9).intern();
        f2568 = m2468("￼\ufffe\ufff8\n\n￼\u0004", 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 261 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, 7 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        f2560 = m2470(37 - (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, (char) (30453 - TextUtils.indexOf((CharSequence) "", '0'))).intern();
        f2563 = m2468("\u0006\u000b\u0007\u0004\u0006\t\uffe7\n￡\u0005", 1 - TextUtils.getOffsetBefore("", 0), 261 - TextUtils.indexOf("", "", 0), true, 9 - MotionEvent.axisFromString("")).intern();
        f2559 = m2470((ViewConfiguration.getWindowTouchSlop() >> 8) + 43, (Process.myPid() >> 22) + 5, (char) (28381 - (Process.myPid() >> 22))).intern();
        f2561 = m2468("\ufff9\ufff6\t\ufffe\u000b", 3 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 263 - (ViewConfiguration.getPressedStateDuration() >> 16), true, View.MeasureSpec.makeMeasureSpec(0, 0) + 5).intern();
        f2562 = m2470(48 - KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") + 5, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern();
        f2555 = m2468("\u000b\n￼\ufffb\u0003\t￬", 4 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTapTimeout() >> 16) + 261, true, 7 - View.MeasureSpec.getSize(0)).intern();
        f2556 = m2468("\u0007\u0002\uffff\u0005\u000b￮\u0005\ufffa", 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 259 - KeyEvent.normalizeMetaState(0), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8).intern();
        f2558 = m2468("\u0005￼\u0005\u0002￼\u0004￮\u000b", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, 259 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, TextUtils.getTrimmedLength("") + 8).intern();
        f2554 = m2470(53 - TextUtils.getTrimmedLength(""), 5 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern();
        f2557 = m2470(59 - KeyEvent.normalizeMetaState(0), 6 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) View.resolveSizeAndState(0, 0, 0)).intern();
        f2550 = m2468("\t\u0012￭￼\ufffe\ufffe", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 259, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5).intern();
        f2551 = m2468("\b\u0001\u0007￪\u000b\t\ufff8", 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 263, true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7).intern();
        f2553 = m2470((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 66, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 28471)).intern();
        f2552 = m2470((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 73, 7 - TextUtils.getTrimmedLength(""), (char) ((Process.myTid() >> 22) + W2.g)).intern();
        f2549 = m2470((Process.myPid() >> 22) + 80, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, (char) (MotionEvent.axisFromString("") + 61286)).intern();
        f2548 = m2468("\uffff\ufffb\u0005\ufffe\u0004\u0007\ufff9", 2 - View.resolveSize(0, 0), 265 - ((byte) KeyEvent.getModifierMetaStateMask()), true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6).intern();
        f2545 = m2470(87 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 6, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2546 = m2470(93 - Gravity.getAbsoluteGravity(0, 0), 4 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3935)).intern();
        f2544 = m2470(TextUtils.indexOf((CharSequence) "", '0', 0) + 99, 4 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.indexOf("", "", 0)).intern();
        f2547 = m2468("\ufffa\uffff\u0006\b�", (ViewConfiguration.getEdgeSlop() >> 16) + 2, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 263, true, Color.blue(0) + 5).intern();
        f2542 = m2468("\u0007\ufffb\b\ufffa\uffff", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, 262 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 5).intern();
        f2539 = m2468("\u0000�\u0000\u0005", (ViewConfiguration.getEdgeSlop() >> 16) + 3, 256 - (ViewConfiguration.getTouchSlop() >> 8), false, 4 - TextUtils.getTrimmedLength("")).intern();
        f2541 = m2468("￼\u0001\u000e￼\ufff9", KeyEvent.normalizeMetaState(0) + 2, 260 - (KeyEvent.getMaxKeyCode() >> 16), true, Color.argb(0, 0, 0, 0) + 5).intern();
        f2540 = m2468("\ufff8\u0007\u0004�", Gravity.getAbsoluteGravity(0, 0) + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 263, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4).intern();
        f2543 = m2468("�\u0004\u0007\ufff8\n\b\ufff7\ufff8", TextUtils.getTrimmedLength("") + 1, 264 - KeyEvent.normalizeMetaState(0), true, (ViewConfiguration.getTapTimeout() >> 16) + 8).intern();
        f2534 = m2470(103 - (ViewConfiguration.getLongPressTimeout() >> 16), 8 - TextUtils.getCapsMode("", 0, 0), (char) (60802 - ImageFormat.getBitsPerPixel(0))).intern();
        f2536 = m2470(111 - (Process.myTid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, (char) (11118 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern();
        f2535 = m2468("\u0004\u0000\ufffe\u0000￭\u000f\t\u0000\u0011￠\uffff\u0000\u0011", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, MotionEvent.axisFromString("") + 258, true, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        f2538 = m2470(View.MeasureSpec.makeMeasureSpec(0, 0) + 120, View.MeasureSpec.makeMeasureSpec(0, 0) + 10, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 48889)).intern();
        f2537 = m2468("\u0013\u0002￠\uffe7\u0003\u0004\f\u0014\u0012\u0004\ufff1", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, ((byte) KeyEvent.getModifierMetaStateMask()) + 254, true, 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        f2532 = m2470(130 - (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 12, (char) (19083 - Drawable.resolveOpacity(0, 0))).intern();
        f2533 = m2470(142 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 11 - KeyEvent.normalizeMetaState(0), (char) (20868 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern();
        f2531 = m2468("\u0012\u0001\uffdf￦\u0002\u0003\u000e\u000e\r\u0012\ufff1", TextUtils.getTrimmedLength("") + 4, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 254, true, TextUtils.indexOf("", "", 0) + 11).intern();
        f2529 = m2468("￡\u0002\u0010\u0011\u000f\f\u0016\u0002\u0001￥\uffde\u0000\u0011", (ViewConfiguration.getTapTimeout() >> 16) + 9, ExpandableListView.getPackedPositionType(0L) + 255, false, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        f2530 = m2468("\u0013\u0000\u0013\ufff2\u0003\u0004\u0015\u0000\ufff2\u0013\u0002￠\uffe7\u0004", 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 253 - (Process.myTid() >> 22), true, 14 - (Process.myTid() >> 22)).intern();
        f2528 = m2470(TextUtils.indexOf("", "", 0, 0) + 152, (KeyEvent.getMaxKeyCode() >> 16) + 8, (char) (Color.argb(0, 0, 0, 0) + 64514)).intern();
        f2524 = m2470(160 - ExpandableListView.getPackedPositionType(0L), 10 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        f2525 = m2468("\ufffe\u0002", 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 272, false, View.MeasureSpec.getMode(0) + 2).intern();
        f2526 = m2468("\u0006\ufff9\u0003", 3 - (ViewConfiguration.getJumpTapTimeout() >> 16), 268 - KeyEvent.keyCodeFromString(""), true, 2 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();
        f2527 = m2470(170 - View.MeasureSpec.getSize(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, (char) (6518 - ExpandableListView.getPackedPositionChild(0L))).intern();
        f2519 = m2470((ViewConfiguration.getScrollDefaultDelay() >> 16) + 173, (ViewConfiguration.getPressedStateDuration() >> 16) + 14, (char) View.combineMeasuredStates(0, 0)).intern();
        f2521 = m2468("\u0011\ufffe\n\u0002\u0001\u0006￡\ufffe", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, 255 - (ViewConfiguration.getLongPressTimeout() >> 16), false, (Process.myPid() >> 22) + 8).intern();
        f2522 = m2468("\u0003\u0007\ufff6", Color.blue(0) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 267, true, 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        f2520 = m2468("\ufff9\u0002\u0006", (ViewConfiguration.getJumpTapTimeout() >> 16) + 3, 262 - (Process.myPid() >> 22), true, 3 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        f2523 = m2468("\u0002\ufffe\ufff8\t", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 264 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, 3 - TextUtils.indexOf((CharSequence) "", '0')).intern();
        int i = f2514 + 81;
        f2515 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2470(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2518[b.f638 + i]) ^ (((long) b.f638) * f2516)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2468(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2517);
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
