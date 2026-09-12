package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
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
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class ah {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f293 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static short[] f294 = null;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f295 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f297 = 43;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f299 = 1151572606;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f300 = -405726926;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private int f301;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f302;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long f303;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f304;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f305;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Boolean f306 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f298 = {-22, Ascii.GS, -5, 1, -21, -17, -19, Ascii.SUB, Ascii.NAK, -27, -27, 54, -13, 19, Ascii.FS, -3, 17, Ascii.RS, -24, Ascii.DC4, 5, -40, Ascii.DLE, Ascii.GS, -40, -11, -15, -40, 114, -115, -40, -75, 75, -40, 19, -18, -34, 85, -66, 86, 75, -80, 81, 66, -91};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f296 = {'g', 203, 195, 199, 199, 156, 157, 196, 197, 203, 203, 197, 200, 202, 199, 191, 194, 205, 208, Typography.pound, Typography.pound, 202, 202, 204, 181, 'K', 149, '9', 's', 'l', '7', 'q', 's', ':', ':'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ long m403(ah ahVar) {
        int i = 2 % 2;
        int i2 = f293;
        int i3 = i2 + 5;
        f295 = i3 % 128;
        int i4 = i3 % 2;
        long j = ahVar.f305;
        int i5 = i2 + 87;
        f295 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ long m404(ah ahVar, long j) {
        int i = 2 % 2;
        int i2 = f293 + 85;
        int i3 = i2 % 128;
        f295 = i3;
        int i4 = i2 % 2;
        ahVar.f303 = j;
        int i5 = i3 + 67;
        f293 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ long m407(ah ahVar, long j) {
        int i = 2 % 2;
        int i2 = f295 + 93;
        int i3 = i2 % 128;
        f293 = i3;
        int i4 = i2 % 2;
        ahVar.f305 = j;
        int i5 = i3 + 87;
        f295 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ long m411(ah ahVar, long j) {
        int i = 2 % 2;
        int i2 = f293;
        int i3 = i2 + 75;
        f295 = i3 % 128;
        int i4 = i3 % 2;
        ahVar.f304 = j;
        int i5 = i2 + 35;
        f295 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ long m413(ah ahVar, long j) {
        int i = 2 % 2;
        int i2 = f295 + 89;
        int i3 = i2 % 128;
        f293 = i3;
        int i4 = i2 % 2;
        ahVar.f302 = j;
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        int i6 = i3 + 49;
        f295 = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ long m414(ah ahVar) {
        int i = 2 % 2;
        int i2 = f293 + 19;
        int i3 = i2 % 128;
        f295 = i3;
        int i4 = i2 % 2;
        long j = ahVar.f302;
        int i5 = i3 + 123;
        f293 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Boolean m415(ah ahVar, Boolean bool) {
        int i = 2 % 2;
        int i2 = f295 + 87;
        f293 = i2 % 128;
        int i3 = i2 % 2;
        ahVar.f306 = bool;
        if (i3 != 0) {
            return bool;
        }
        throw null;
    }

    ah(int i) {
        this.f301 = i;
        ar.m480().mo509(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f307 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f308 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f309 = 4037;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f310 = 10196;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f311 = 64644;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f312 = 54654;

            /* JADX WARN: Code duplicated, block: B:10:0x0072 A[PHI: r1 r2
              0x0072: PHI (r1v8 com.ironsource.adqualitysdk.sdk.i.as) = (r1v5 com.ironsource.adqualitysdk.sdk.i.as), (r1v10 com.ironsource.adqualitysdk.sdk.i.as) binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
              0x0072: PHI (r2v9 long) = (r2v1 long), (r2v10 long) binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
              0x0033: PHI (r1v6 com.ironsource.adqualitysdk.sdk.i.as) = (r1v5 com.ironsource.adqualitysdk.sdk.i.as), (r1v10 com.ironsource.adqualitysdk.sdk.i.as) binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ｋ */
            public final void mo385() {
                as asVarMo493;
                long jM552;
                int i2 = 2 % 2;
                int i3 = f307 + 43;
                f308 = i3 % 128;
                if (i3 % 2 == 0) {
                    asVarMo493 = ar.m480().mo493();
                    jM552 = asVarMo493.m552();
                    if (jM552 != 1) {
                        ah.m415(ah.this, Boolean.TRUE);
                    } else {
                        int i4 = f307 + 105;
                        f308 = i4 % 128;
                        int i5 = i4 % 2;
                        ah.m415(ah.this, Boolean.FALSE);
                        jM552 = asVarMo493.m555();
                        jz.m2766(m418("\ue127햀紧♷暓㜼\uef8eꉴ豩㤶鑝➧㧮姻慫肏巴굏\udbe6殮믄糀", 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m418("쏨荈慫肏来Ӷᚃ㶷ᆄਏ釠脘≈㫌嚗⨓⼿皓튟ﳪ罇㵧来Ӷ≈㫌紧♷暓㜼\uef8eꉴ嵏팓", 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), (Throwable) null, false);
                    }
                } else {
                    asVarMo493 = ar.m480().mo493();
                    jM552 = asVarMo493.m552();
                    if (jM552 != 0) {
                        ah.m415(ah.this, Boolean.TRUE);
                    } else {
                        int i6 = f307 + 105;
                        f308 = i6 % 128;
                        int i7 = i6 % 2;
                        ah.m415(ah.this, Boolean.FALSE);
                        jM552 = asVarMo493.m555();
                        jz.m2766(m418("\ue127햀紧♷暓㜼\uef8eꉴ豩㤶鑝➧㧮姻慫肏巴굏\udbe6殮믄糀", 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m418("쏨荈慫肏来Ӷᚃ㶷ᆄਏ釠脘≈㫌嚗⨓⼿皓튟ﳪ罇㵧来Ӷ≈㫌紧♷暓㜼\uef8eꉴ嵏팓", 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), (Throwable) null, false);
                    }
                }
                ah.m413(ah.this, asVarMo493.m556());
                ah.m407(ah.this, asVarMo493.m555());
                ah ahVar = ah.this;
                ah.m404(ahVar, jM552 - ah.m414(ahVar));
                ah ahVar2 = ah.this;
                ah.m411(ahVar2, jM552 - ah.m403(ahVar2));
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m418(String str, int i2) {
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
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f312)) ^ ((c2 >>> 5) + f310)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f311) ^ ((c3 + i3) ^ ((c3 << 4) + f309))));
                            i3 -= 40503;
                        }
                        cArr2[k.f2951] = cArr3[0];
                        cArr2[k.f2951 + 1] = cArr3[1];
                        k.f2951 += 2;
                    }
                    str2 = new String(cArr2, 0, i2);
                }
                return str2;
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final boolean m417(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f293 + 67;
        f295 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!m410(jSONObject)) {
                int i3 = f295 + 113;
                f293 = i3 % 128;
                int i4 = i3 % 2;
                if (this.f306 != null) {
                    try {
                        m406(jSONObject);
                        return true;
                    } catch (Exception e) {
                        jz.m2766(m405(Color.blue(0) + 405726926, (byte) (View.getDefaultSize(0, 0) + 16), AndroidCharacter.getMirror('0') - '\\', (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1151572521, (short) Color.red(0)).intern(), m408(new int[]{0, 25, 90, 0}, true, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001").intern(), (Throwable) e, false);
                    }
                }
            }
            int i5 = f293 + 19;
            f295 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        m410(jSONObject);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m406(JSONObject jSONObject) {
        long jOptLong;
        boolean z;
        int i = 2 % 2;
        try {
            if (jSONObject.optInt(m405(405726947 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 21), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1151572491, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), 1) == this.f301 || m416(jSONObject)) {
                jOptLong = jSONObject.optLong(m408(new int[]{25, 2, 33, 2}, false, "\u0000\u0001").intern()) + this.f303;
                jSONObject.put(m405((KeyEvent.getMaxKeyCode() >> 16) + 405726950, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14), ((byte) KeyEvent.getModifierMetaStateMask()) - 43, (-1151572489) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), this.f303);
                int i2 = f295 + 65;
                f293 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                jOptLong = jSONObject.optLong(m408(new int[]{27, 3, 0, 3}, true, "\u0001\u0001\u0000").intern()) + this.f304;
                jSONObject.put(m408(new int[]{30, 3, 0, 3}, true, "\u0001\u0000\u0001").intern(), this.f304);
                z = false;
            }
            jSONObject.put(ij.f2564, jOptLong);
            if (!this.f306.booleanValue()) {
                jSONObject.put(m405((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 405726953, (byte) (TextUtils.indexOf("", "") + 114), 4 - AndroidCharacter.getMirror('0'), (-1151572490) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), false);
            }
            m409(jSONObject, z);
            m412(jSONObject, z);
            int i4 = f295 + 31;
            f293 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m410(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f295 + 61;
        f293 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject.has(m405(405726950 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 44, (-1151572489) - Color.green(0), (short) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) || !(!jSONObject.has(m408(new int[]{30, 3, 0, 3}, true, "\u0001\u0000\u0001").intern()))) {
            return true;
        }
        int i4 = f293 + 69;
        f295 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m409(JSONObject jSONObject, boolean z) {
        long jOptLong;
        long j;
        int i = 2 % 2;
        int i2 = f293 + InterfaceC0280i1.d.b.i;
        f295 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject.has(m405(405726956 - Color.blue(0), (byte) (74 - (ViewConfiguration.getPressedStateDuration() >> 16)), (-44) - (KeyEvent.getMaxKeyCode() >> 16), (-1151572491) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
            int i4 = f293 + 33;
            f295 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (z) {
                jOptLong = jSONObject.optLong(m405(405726959 - ExpandableListView.getPackedPositionType(0L), (byte) ((Process.myPid() >> 22) - 20), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 44, Color.blue(0) - 1151572491, (short) (KeyEvent.getMaxKeyCode() >> 16)).intern());
                j = this.f303;
            } else {
                jOptLong = jSONObject.optLong(m405(405726956 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 74), (-44) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1151572491) - (ViewConfiguration.getTouchSlop() >> 8), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
                j = this.f304;
            }
            try {
                jSONObject.put(m405(Color.alpha(0) + 405726956, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 73), TextUtils.indexOf("", "", 0, 0) - 44, (-1151572491) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) View.combineMeasuredStates(0, 0)).intern(), jOptLong + j);
                int i5 = f295 + 55;
                f293 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m412(JSONObject jSONObject, boolean z) {
        long jOptLong;
        int i = 2 % 2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m405(405726961 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 80), (-44) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1151572498, (short) TextUtils.indexOf("", "", 0, 0)).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (!z) {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m408(new int[]{34, 1, 0, 0}, false, "\u0000").intern());
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f304);
                    }
                } else {
                    int i2 = f295 + 81;
                    f293 = i2 % 128;
                    if (i2 % 2 == 0) {
                        jOptLong = jSONObjectOptJSONObject.optLong(m408(new int[]{33, 1, 0, 1}, true, "\u0001").intern());
                        if (jOptLong > 1) {
                            lValueOf = Long.valueOf(jOptLong + this.f303);
                        }
                    } else {
                        long jOptLong3 = jSONObjectOptJSONObject.optLong(m408(new int[]{33, 1, 0, 1}, false, "\u0001").intern());
                        if (jOptLong3 > 0) {
                            jOptLong = jOptLong3;
                            lValueOf = Long.valueOf(jOptLong + this.f303);
                        }
                    }
                }
                if (lValueOf != null) {
                    int i3 = f293 + 35;
                    f295 = i3 % 128;
                    jSONObjectOptJSONObject.put((i3 % 2 != 0 ? m408(new int[]{34, 1, 0, 0}, false, "\u0000") : m408(new int[]{34, 1, 0, 0}, false, "\u0000")).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m416(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f293 + 121;
        f295 = i2 % 128;
        int i3 = i2 % 2;
        if (Math.abs((this.f305 - this.f302) - (jSONObject.optLong(m408(new int[]{27, 3, 0, 3}, true, "\u0001\u0001\u0000").intern()) - jSONObject.optLong(m408(new int[]{25, 2, 33, 2}, false, "\u0000\u0001").intern()))) > 10) {
            return false;
        }
        int i4 = f293 + 55;
        f295 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m405(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f297;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f298;
                if (bArr != null) {
                    i5 = (byte) (bArr[f300 + i] + i4);
                } else {
                    i5 = (short) (f294[f300 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f300 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f299);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f298;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f294;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m408(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (j.f2691) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f296, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                    }
                    c = cArr2[j.f2692];
                    j.f2692++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                    j.f2692++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                    j.f2692++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
