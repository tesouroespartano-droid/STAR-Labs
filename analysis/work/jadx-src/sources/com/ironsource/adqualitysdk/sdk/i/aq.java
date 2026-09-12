package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aq extends ar.AnonymousClass3 {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f380 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f381 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f382 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f383 = 21;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f384 = -1436480671;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f385 = {-55, -53, 51, -39, 54, Utf8.REPLACEMENT_BYTE, -56, 55, -60, 122, -128, 52, -51, Base64.padSymbol, -54, -58, -60, 47, -56, 48, -38, 53, 60, -53, 52, -57, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f386 = -1919647989;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f387;

    public aq(aw awVar) {
        m475(1919647988 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 55), (-12) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1436480770 - Color.green(0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        this.f387 = new StringBuilder().append(m475(1919647998 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-69) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-19) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1436480786 - TextUtils.indexOf("", "", 0), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()).append(UUID.randomUUID().toString().replace(m475(1919647998 - View.MeasureSpec.getSize(0), (byte) (Color.alpha(0) - 119), (-20) - Color.red(0), 1436480715 - ImageFormat.getBitsPerPixel(0), (short) Gravity.getAbsoluteGravity(0, 0)).intern(), "")).toString();
        m516(awVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m477() {
        int i = 2 % 2;
        int i2 = f380 + 67;
        f382 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = m514().optString(m475((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1919647998, (byte) (TextUtils.indexOf("", "", 0, 0) + WorkQueueKt.MASK), (-19) - TextUtils.lastIndexOf("", '0'), AndroidCharacter.getMirror('0') + 62681, (short) TextUtils.getOffsetAfter("", 0)).intern(), this.f387);
        int i4 = f380 + 85;
        f382 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m478(String str) {
        int i = 2 % 2;
        int i2 = f382 + 9;
        f380 = i2 % 128;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectOptJSONObject = m476().optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            String strOptString = jSONObjectOptJSONObject.optString(m475(1919648000 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (TextUtils.indexOf("", "", 0) - 53), (-6) - MotionEvent.axisFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1436480769, (short) (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            int i3 = f382 + 53;
            f380 = i3 % 128;
            if (i3 % 2 == 0) {
                return strOptString;
            }
            throw null;
        }
        m476().optJSONObject(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m479() {
        int i = 2 % 2;
        int i2 = f380 + InterfaceC0280i1.d.b.d;
        f382 = i2 % 128;
        int i3 = i2 % 2;
        boolean zHas = m514().has(m475(1919647989 - ExpandableListView.getPackedPositionGroup(0L), (byte) ((-56) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-12) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1436480770 - KeyEvent.getDeadChar(0, 0), (short) ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        int i4 = f382 + 117;
        f380 = i4 % 128;
        if (i4 % 2 == 0) {
            return zHas;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m476() {
        int i = 2 % 2;
        int i2 = f382 + 61;
        f380 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = m514().optJSONObject(m475((ViewConfiguration.getWindowTouchSlop() >> 8) + 1919647989, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 56), Process.getGidForName("") - 10, 1436480769 - ImageFormat.getBitsPerPixel(0), (short) ExpandableListView.getPackedPositionType(0L)).intern());
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        int i4 = f380 + 33;
        f382 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObjectOptJSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m475(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f383;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f385;
                if (bArr != null) {
                    i5 = (byte) (bArr[f386 + i] + i4);
                } else {
                    i5 = (short) (f381[f386 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f386 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f384);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f385;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f381;
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
