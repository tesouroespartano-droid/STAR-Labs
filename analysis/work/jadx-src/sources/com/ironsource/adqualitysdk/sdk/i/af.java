package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class af extends jp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f149 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f150 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f153;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f154;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Handler f155;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f156;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int f157;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f152 = {'V', 171, 172, 165, 164, 166, 164, 164, 145, 152, 172, 164, 168, 152, 151, 166, 161, Typography.copyright, Typography.plusMinus, 173, 161, Typography.cent, 146, 135, 262, 263, 'k', 209, 201, '6', 'm', 'p', '~', 275, 298, 296, 296, 257, 249, 290, 291, 283, 290, 294, 291, 290, 251, 250, 293, 293, 289, 297, 280, 273, 292, 290};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f151 = 4650376123689940840L;

    public interface c {
        void onEventGenerated(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ int m313(af afVar) {
        int i = 2 % 2;
        int i2 = f149;
        int i3 = i2 + 55;
        f150 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = afVar.f156;
        int i6 = i2 + 35;
        f150 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m314(af afVar) {
        int i = 2 % 2;
        int i2 = f150;
        int i3 = i2 + 95;
        f149 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = afVar.f153;
        afVar.f153 = i5 + 1;
        int i6 = i2 + 113;
        f149 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ int m315(af afVar) {
        int i = 2 % 2;
        int i2 = f149 + 83;
        int i3 = i2 % 128;
        f150 = i3;
        int i4 = i2 % 2;
        int i5 = afVar.f156;
        afVar.f156 = i5 + 1;
        int i6 = i3 + 37;
        f149 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    af(Context context, ao aoVar, int i, String str, long j) {
        super(context, aoVar, j);
        this.f157 = i;
        this.f153 = 0;
        this.f156 = 1;
        this.f154 = str;
        HandlerThread handlerThread = new HandlerThread(m317(new int[]{0, 23, 59, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern());
        handlerThread.start();
        this.f155 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m319() {
        int i = 2 % 2;
        int i2 = f149 + 117;
        int i3 = i2 % 128;
        f150 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = this.f153;
        if (i4 != 0) {
            return i4;
        }
        int i5 = i3 + 39;
        f149 = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m322(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z, final c cVar) throws Throwable {
        try {
            int i = 2 % 2;
            try {
                this.f155.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2

                    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                    private static short[] f158 = null;

                    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                    private static int f159 = 1;

                    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                    private static int f160 = 0;

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f161 = 88563128;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f162 = 29;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static byte[] f163 = {-16, 89, 108, 0, 92, 103, -1, 91, 93, 9, 103, -2, Ascii.SI, -25, Base64.padSymbol, 41, 52, -27, -40, -20, Base64.padSymbol, 71, -14, -16, 71, 71, -30, -13, -25, 71, 79, -67, -22, -11, 69, -13, -10, 89, 76};

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f164 = -975688019;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() throws Exception {
                        int i2 = 2 % 2;
                        if (str.equals(m323(975688019 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Color.argb(0, 0, 0, 0) + 38), (-30) - View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) - 88563012, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 52)).intern())) {
                            af.m314(af.this);
                        }
                        int iM313 = af.m313(af.this);
                        af.m315(af.this);
                        JSONObject jSONObjectM2826 = kd.m2826(jSONObject);
                        jSONObjectM2826.put(m323(975688033 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 11), (ViewConfiguration.getJumpTapTimeout() >> 16) - 30, Color.rgb(0, 0, 0) - 71785802, (short) ((Process.myPid() >> 22) - 47)).intern(), str);
                        jSONObjectM2826.put(m323(975688036 - Drawable.resolveOpacity(0, 0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 104), (-29) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) - 88563027, (short) (TextUtils.indexOf("", "") - 71)).intern(), iM313);
                        String strIntern = m323(KeyEvent.normalizeMetaState(0) + 975688038, (byte) (41 - TextUtils.indexOf("", "", 0)), ((byte) KeyEvent.getModifierMetaStateMask()) - 29, (-88563012) - View.combineMeasuredStates(0, 0), (short) ((-28) - Drawable.resolveOpacity(0, 0))).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            strIntern = jSONObject3.optString(ij.f2572);
                            jSONObjectM2826.put(ij.f2525, jSONObject2.optString(ij.f2525, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            strIntern = m323(975688048 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (55 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-30) - (Process.myTid() >> 22), (-88563019) - TextUtils.lastIndexOf("", '0', 0), (short) (121 - KeyEvent.getDeadChar(0, 0))).intern();
                        } else {
                            int i3 = f160 + 5;
                            f159 = i3 % 128;
                            int i4 = i3 % 2;
                        }
                        jSONObjectM2826.put(ij.f2569, strIntern);
                        if (!jSONObjectM2826.has(ij.f2571)) {
                            int i5 = f159 + 99;
                            f160 = i5 % 128;
                            int i6 = i5 % 2;
                            jSONObjectM2826.put(ij.f2571, strIntern);
                            int i7 = f159 + 41;
                            f160 = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        final JSONObject jSONObjectMo320 = af.this.mo320(jSONObjectM2826, z, true, str.equals(m323(975688051 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (83 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-30) - Color.blue(0), TextUtils.indexOf("", "") - 88563012, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 99)).intern()));
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                cVar.onEventGenerated(jSONObjectMo320);
                            }
                        });
                    }

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m323(int i2, byte b, int i3, int i4, short s) {
                        String string;
                        synchronized (l.f2999) {
                            StringBuilder sb = new StringBuilder();
                            int i5 = f162;
                            int i6 = i3 + i5;
                            int i7 = i6 == -1 ? 1 : 0;
                            if (i7 != 0) {
                                byte[] bArr = f163;
                                if (bArr != null) {
                                    i6 = (byte) (bArr[f164 + i2] + i5);
                                } else {
                                    i6 = (short) (f158[f164 + i2] + i5);
                                }
                            }
                            if (i6 > 0) {
                                l.f3000 = ((i2 + i6) - 2) + f164 + i7;
                                l.f3002 = b;
                                l.f3004 = (char) (i4 + f161);
                                sb.append(l.f3004);
                                l.f3003 = l.f3004;
                                l.f3001 = 1;
                                while (l.f3001 < i6) {
                                    byte[] bArr2 = f163;
                                    if (bArr2 != null) {
                                        int i8 = l.f3000;
                                        l.f3000 = i8 - 1;
                                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i8] + s)) ^ l.f3002));
                                    } else {
                                        short[] sArr = f158;
                                        int i9 = l.f3000;
                                        l.f3000 = i9 - 1;
                                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i9] + s)) ^ l.f3002));
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
                });
                int i2 = f150 + 9;
                f149 = i2 % 128;
                if (i2 % 2 == 0) {
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m321(final JSONArray jSONArray, final boolean z, final c cVar) {
        int i = 2 % 2;
        this.f155.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f173 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f174;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f175 = {':', 'q', 'i', 'm', 'm', 'l', 157, 138, 155, 142, 151, 142, 'p', 157, 151, 142, 159, 'n', 156, 140, 146, 157, Typography.cent, 149, 138, 151, 'j', 155, 152, 128, 266, 268, 249, 256, 273, 265, 269, 269, 226, 227, 266, 267, 270, 266, 259, 267, 266, 225, 233, 272, 272, 274, 251};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() throws Exception {
                int i2 = 2 % 2;
                int i3 = f174 + 29;
                f173 = i3 % 128;
                int i4 = i3 % 2;
                final JSONObject jSONObjectMo320 = af.this.mo320(null, z, false, false);
                try {
                    jSONObjectMo320.put(m324(new int[]{0, 6, 0, 5}, true, "\u0000\u0000\u0001\u0001\u0001\u0000").intern(), jSONArray);
                    int i5 = f173 + 31;
                    f174 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (JSONException e) {
                    n.m2873(m324(new int[]{6, 23, 41, 21}, true, null).intern(), m324(new int[]{29, 24, 160, 0}, true, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), (Throwable) e);
                }
                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        cVar.onEventGenerated(jSONObjectMo320);
                    }
                });
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m324(int[] iArr, boolean z2, String str) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (j.f2691) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f175, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        j.f2692 = 0;
                        char c2 = 0;
                        while (j.f2692 < i3) {
                            if (bArr[j.f2692] == 1) {
                                cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c2);
                            } else {
                                cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c2);
                            }
                            c2 = cArr2[j.f2692];
                            j.f2692++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i6, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr4[j.f2692] = cArr[(i3 - j.f2692) - 1];
                            j.f2692++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                            j.f2692++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        });
        int i2 = f149 + 23;
        f150 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jp
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject mo320(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        long jM2711;
        long jM2715;
        synchronized (this) {
            jM2711 = jv.m2711();
            jM2715 = jv.m2715();
        }
        JSONObject jSONObjectMo320 = super.mo320(jSONObject, z, z2, z3);
        try {
            long jOptLong = jSONObjectMo320.optLong(ij.f2564);
            jSONObjectMo320.remove(ij.f2564);
            if (jOptLong != 0) {
                long j = jM2715 - (jM2711 - jOptLong);
                jSONObjectMo320.put(m316("㜛鸇攭", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43291).intern(), jM2711);
                jSONObjectMo320.put(m316("㜛\uf478뇖", 50021 - View.resolveSize(0, 0)).intern(), jM2715);
                jM2711 = jOptLong;
                jM2715 = j;
            }
            jSONObjectMo320.put(m317(new int[]{23, 3, ModuleDescriptor.MODULE_VERSION, 1}, false, "\u0000\u0001\u0000").intern(), jM2711);
            jSONObjectMo320.put(m316("㜝\ue2a9", ExpandableListView.getPackedPositionGroup(0L) + 54709).intern(), jM2715);
            jSONObjectMo320.put(m316("㜛\ue468釫䵓", Color.alpha(0) + 54133).intern(), this.f154);
            jSONObjectMo320.put(m317(new int[]{26, 3, 99, 0}, false, "\u0000\u0000\u0001").intern(), this.f157);
            jSONObjectMo320.put(m317(new int[]{29, 3, 0, 0}, true, "\u0001\u0001\u0001").intern(), m319());
            if (ar.m480().mo482()) {
                jSONObjectMo320.put(m316("㜋ⓎႮ\u0c73", (ViewConfiguration.getLongPressTimeout() >> 16) + 5077).intern(), true);
            }
            ap apVarMo495 = ar.m480().mo495();
            if (apVarMo495 != null) {
                String strM472 = apVarMo495.m472();
                if (!TextUtils.isEmpty(strM472)) {
                    jSONObjectMo320.put(m316("㜍\ued91舆", 55949 - View.getDefaultSize(0, 0)).intern(), strM472);
                }
            }
            if (z2) {
                m318(jSONObjectMo320);
                return jSONObjectMo320;
            }
        } catch (JSONException e) {
            n.m2873(m317(new int[]{0, 23, 59, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern(), m317(new int[]{32, 24, 184, 0}, false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001").intern(), (Throwable) e);
        }
        return jSONObjectMo320;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m318(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f150 + 89;
        f149 = i2 % 128;
        int i3 = i2 % 2;
        ih ihVarM2633 = jh.m2628().m2633();
        try {
            jSONObject.put(m316("㜄敊鎝쇕縰걈\uda8fࣞꔘ", 21059 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), kd.m2818(ihVarM2633.m2454(), ihVarM2633.m2452(), ihVarM2633.m2453(), ihVarM2633.m2455()));
            int i4 = f150 + 87;
            f149 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            n.m2873(m317(new int[]{0, 23, 59, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern(), m316("㜍㑝㆔㻒㨆✫⒣⇽ⴴ⩾ៀጂလᶟ\u1aebزͬ°\u0de3ॎ皌玛缆籦秠曢戨潰泂栗", View.MeasureSpec.makeMeasureSpec(0, 0) + 839).intern(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m317(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f152, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c2 = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c2);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c2);
                    }
                    c2 = cArr2[j.f2692];
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m316(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f151);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
