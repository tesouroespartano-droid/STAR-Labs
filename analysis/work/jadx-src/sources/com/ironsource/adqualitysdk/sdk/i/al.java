package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class al {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f343 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f344 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f345 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f346 = -1083288994;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f347 = {-46, -51, -48, -65, -51, -55, -71, -37, -78, -42, -71, -53, -116, -108, -127, -53, -52, -44, -68, -53, 51, 40, Ascii.RS, -53, -60, -40, -57, -53, -6, -45, -33, -52, 68, 79, 56, 54, -53, -108, -127, -107};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f348 = 57;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f349 = 903903905;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ag f350;

    public al(ag agVar) {
        this.f350 = agVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m440(ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        int i2 = f344 + 67;
        f343 = i2 % 128;
        int i3 = i2 % 2;
        this.f350.m373(m439((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1083288993, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-57) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-903903790) - KeyEvent.keyCodeFromString(""), (short) (Color.blue(0) + 57)).intern(), m438(iSAdQualitySegment));
        int i4 = f344 + 95;
        f343 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m438(ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                jSONObject.put(m439(1083289005 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0) - 57, 34306 - AndroidCharacter.getMirror('0'), (short) (Process.getGidForName("") + 116)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m439((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1083289009, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "") - 58, ((byte) KeyEvent.getModifierMetaStateMask()) - 903903789, (short) (50 - ExpandableListView.getPackedPositionType(0L))).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m439(View.combineMeasuredStates(0, 0) + 1083289013, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-57) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 903903790, (short) (TextUtils.indexOf("", "", 0, 0) - 42)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                int i2 = f343 + 113;
                f344 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m439(1083289017 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ExpandableListView.getPackedPositionType(0L), (-58) - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) - 903903790, (short) (KeyEvent.normalizeMetaState(0) + 50)).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(m439((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1083289021, (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 58, ExpandableListView.getPackedPositionType(0L) - 903903790, (short) (TextUtils.getOffsetAfter("", 0) + 30)).intern(), iSAdQualitySegment.getIsPaying().get());
                int i4 = f343 + 1;
                f344 = i4 % 128;
                int i5 = i4 % 2;
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m439(1083289025 - KeyEvent.keyCodeFromString(""), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "") - 58, (-903903790) - Color.red(0), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 64)).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
                int i6 = f343 + 11;
                f344 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                int i8 = f343 + 51;
                f344 = i8 % 128;
                int i9 = i8 % 2;
                jSONObject.put(m439(TextUtils.lastIndexOf("", '0') + 1083289031, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-58) - Color.red(0), (-903903789) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getTouchSlop() >> 8) + InterfaceC0280i1.d.b.g)).intern(), iSAdQualitySegment.getUserCreationDate());
            }
            int i10 = f344 + 91;
            f343 = i10 % 128;
            int i11 = i10 % 2;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m439(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f348;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f347;
                if (bArr != null) {
                    i5 = (byte) (bArr[f346 + i] + i4);
                } else {
                    i5 = (short) (f345[f346 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f346 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f349);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f347;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f345;
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
