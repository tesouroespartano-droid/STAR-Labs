package com.ironsource.adqualitysdk.sdk.i;

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
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu implements Runnable {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2597 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2598 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2599 = -1190879714;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2600 = {3, Ascii.SI, 32, Ascii.ETB, 9, Ascii.SYN, Ascii.SI, 57, 3, Ascii.NAK, Ascii.ESC, 36, 39, 4, 4, Ascii.FF, 95, 113, 84, 104, -94, 17, 100, -88, Ascii.CR, 98, 92, 95, -116, -5, 42, 117, -121, 106, -98, -10, -3, Ascii.DLE, 80, 76, 81, 54, 88, 106};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2601 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2602 = 11;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2603 = -1125522179;

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo227() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = f2597 + 43;
        f2598 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                mo227();
                int i3 = f2597 + 113;
                f2598 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 66 / 0;
                    return;
                }
                return;
            }
            mo227();
            throw null;
        } catch (Throwable th) {
            try {
                mo635(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public void mo635(Throwable th) {
        int i = 2 % 2;
        jz.m2759(m2488(1190879714 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-12) - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1125522263, (short) ((-21) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new StringBuilder().append(m2488((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1190879727, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) - 12, 1125522248 - Gravity.getAbsoluteGravity(0, 0), (short) (View.combineMeasuredStates(0, 0) - 95)).intern()).append(getClass().getName()).toString(), new StringBuilder().append(m2488(1190879742 - MotionEvent.axisFromString(""), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-12) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1125522246 - KeyEvent.getDeadChar(0, 0), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 117)).intern()).append(getClass().getName()).append(m2488(TextUtils.getOffsetBefore("", 0) + 1190879749, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-13) - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1125522220, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 69)).intern()).toString(), th);
        n.m2887(m2488(1190879714 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (KeyEvent.getMaxKeyCode() >> 16) - 12, View.MeasureSpec.getMode(0) + 1125522263, (short) ((-21) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new StringBuilder().append(m2488((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1190879728, (byte) ('0' - AndroidCharacter.getMirror('0')), (-12) - TextUtils.getCapsMode("", 0, 0), 1125522248 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 94)).intern()).append(getClass().getName()).toString());
        n.m2873(m2488((ViewConfiguration.getJumpTapTimeout() >> 16) + 1190879714, (byte) View.resolveSize(0, 0), (-13) - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1125522263, (short) (TextUtils.getOffsetAfter("", 0) - 22)).intern(), m2488(1190879750 - TextUtils.getOffsetAfter("", 0), (byte) (ViewConfiguration.getTouchSlop() >> 8), (-12) - KeyEvent.keyCodeFromString(""), 1125522247 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (ExpandableListView.getPackedPositionType(0L) - 73)).intern(), th);
        int i2 = f2598 + 61;
        f2597 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2488(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2602;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2600;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2599 + i] + i4);
                } else {
                    i5 = (short) (f2601[f2599 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2599 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2603);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2600;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2601;
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
}
