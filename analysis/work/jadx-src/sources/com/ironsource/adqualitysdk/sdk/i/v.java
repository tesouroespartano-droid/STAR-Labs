package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v<K, T> implements r<K, T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f3109 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3110 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3111 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f3112 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3113 = -7290823048849716438L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3114 = {'W', 'z', '6', 'y', 130, 133, 137, '{', 140, Ascii.MAX, 141, 'w', 138, '~', 'P', 'm', 132, '^', 136, 'f', 142, 143, '[', '}', 128};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3115 = 22;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private r<K, T> f3116 = new r<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.v.4
        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo228(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻛ */
        public final void mo229(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻛ */
        public final void mo230(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo231(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo232(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo233(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾒ */
        public final void mo234(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾒ */
        public final void mo235(JSONObject jSONObject, K k, Object obj, T t) {
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> f3117;

    /* JADX INFO: renamed from: ﾇ */
    protected abstract String mo224(T t);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2975(r<K, T> rVar) {
        int i = 2 % 2;
        int i2 = f3111;
        int i3 = i2 + 27;
        f3110 = i3 % 128;
        int i4 = i3 % 2;
        this.f3117 = rVar;
        int i5 = i2 + 29;
        f3110 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private r<K, T> m2972() {
        int i = 2 % 2;
        int i2 = f3111 + 49;
        int i3 = i2 % 128;
        f3110 = i3;
        int i4 = i2 % 2;
        r<K, T> rVar = this.f3117;
        if (rVar != null) {
            int i5 = i3 + 29;
            f3111 = i5 % 128;
            if (i5 % 2 == 0) {
                return rVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f3116;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public void mo234(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3110 + 43;
        f3111 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2974 = m2974(jSONObject, t);
        m2973(m2970("୫枥틜䶏룯⯎蛘\uf12b氓\udf10䩡ꕗန", 27883 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObjectM2974);
        m2972().mo234(jSONObjectM2974, k, t);
        int i4 = f3111 + 49;
        f3110 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public void mo229(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM2974;
        int iIndexOf;
        int i = 2 % 2;
        int i2 = f3111 + 21;
        f3110 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM2974 = m2974(jSONObject, t);
            iIndexOf = 17974 - TextUtils.indexOf("", "", 0);
        } else {
            jSONObjectM2974 = m2974(jSONObject, t);
            iIndexOf = 24043 - TextUtils.indexOf("", "", 0);
        }
        m2973(m2970("୫嚥냜\u128f糯\udece㣘騫\ue413䘐ꁡɗ氎쾠⦈讛헨㟐醖", iIndexOf).intern(), jSONObjectM2974);
        m2972().mo229(jSONObjectM2974, k, t);
        int i3 = f3111 + 23;
        f3110 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final void mo232(JSONObject jSONObject, K k, Object obj, T t) {
        JSONObject jSONObjectM2974;
        int i;
        int i2 = 2 % 2;
        int i3 = f3111 + InterfaceC0280i1.d.b.i;
        f3110 = i3 % 128;
        if (i3 % 2 == 0) {
            jSONObjectM2974 = m2974(jSONObject, t);
            i = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)) + 209;
        } else {
            jSONObjectM2974 = m2974(jSONObject, t);
            i = 14370 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        }
        m2973(m2970("୫㍯筈ꌪ\uebc2Ꮶ宏莦쩇\uf267㩚", i).intern(), jSONObjectM2974);
        m2972().mo232(jSONObjectM2974, k, obj, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public final void mo230(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3111 + 5;
        f3110 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2974 = m2974(jSONObject, t);
        m2973(m2970("୫띍猌㽀תּꝌ捛⽔\ueb57靕匔Ὥ\udb7c蝢䍭༧쭰睪㌦", 48131 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), jSONObjectM2974);
        m2972().mo230(jSONObjectM2974, k, obj, t);
        int i4 = f3110 + 125;
        f3111 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo233(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM2974;
        int iMakeMeasureSpec;
        int i = 2 % 2;
        int i2 = f3111 + 9;
        f3110 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM2974 = m2974(jSONObject, t);
            iMakeMeasureSpec = 41 / View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            jSONObjectM2974 = m2974(jSONObject, t);
            iMakeMeasureSpec = 127 - View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        m2973(m2971(null, iMakeMeasureSpec, null, "\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObjectM2974);
        m2972().mo233(jSONObjectM2974, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final void mo231(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3111 + 87;
        f3110 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2974 = m2974(jSONObject, t);
        m2973(m2971(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u008f\u0082\u0088\u008e\u0084\u008c\u008d\u008d\u008c\u0083\u008b\u0088\u008a\u0089").intern(), jSONObjectM2974);
        m2972().mo231(jSONObjectM2974, k, t);
        int i4 = f3111 + 125;
        f3110 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public final void mo235(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3111 + 55;
        f3110 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2974 = m2974(jSONObject, t);
        m2973(m2971(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u008f\u008d\u0091\u0088\u0089\u0088\u0083\u0084\u0084\u0090").intern(), jSONObjectM2974);
        m2972().mo235(jSONObjectM2974, k, obj, t);
        int i4 = f3111 + 91;
        f3110 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo228(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM2974;
        String strM2970;
        int i = 2 % 2;
        int i2 = f3110 + 55;
        f3111 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM2974 = m2974(jSONObject, t);
            strM2970 = m2970("୩慠\ue8f3\ude21찑뉮ꇴ鞜藴謲礖潹廬", ExpandableListView.getPackedPositionGroup(1L) * 61909);
        } else {
            jSONObjectM2974 = m2974(jSONObject, t);
            strM2970 = m2970("୩慠\ue8f3\ude21찑뉮ꇴ鞜藴謲礖潹廬", 61909 - ExpandableListView.getPackedPositionGroup(0L));
        }
        m2973(strM2970.intern(), jSONObjectM2974);
        m2972().mo228(jSONObjectM2974, k, t);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2973(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        Object obj = null;
        n.m2871(m2971(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0096\u0095\u0086\u0093\u0094\u0093\u0088\u0085\u0082\u0091\u008c\u0092\u0082\u0081").intern(), new StringBuilder().append(getClass().getName()).append(m2970("ଊ—崬", 11028 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()).append(str).toString(), jSONObject);
        int i2 = f3110 + 21;
        f3111 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m2974(JSONObject jSONObject, T t) {
        int i = 2 % 2;
        try {
            if (!jSONObject.has(ij.f2570)) {
                int i2 = f3111 + 87;
                f3110 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(ij.f2570, mo224(t));
            }
            if (!jSONObject.has(ij.f2564)) {
                int i4 = f3111 + 65;
                f3110 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put(ij.f2564, jv.m2711());
            }
        } catch (JSONException e) {
            n.m2873(m2971(null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0096\u0095\u0086\u0093\u0094\u0093\u0088\u0085\u0082\u0091\u008c\u0092\u0082\u0081").intern(), m2971(null, (Process.myTid() >> 22) + WorkQueueKt.MASK, null, "\u0091\u0086\u0087\u0099\u0083\u008d\u0091\u0088\u0089\u0088\u0083\u0098\u0091\u008a\u008d\u008c\u0088\u0093\u0084\u0083\u0093\u0086\u0093\u0093\u0097").intern(), (Throwable) e);
        }
        int i6 = f3110 + 69;
        f3111 = i6 % 128;
        int i7 = i6 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2970(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f3113);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2971(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3007) {
            char[] cArr2 = f3114;
            int i2 = f3115;
            if (f3109) {
                int length = bArr.length;
                m.f3005 = length;
                char[] cArr3 = new char[length];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i] - i2);
                    m.f3006++;
                }
                return new String(cArr3);
            }
            if (f3112) {
                int length2 = cArr.length;
                m.f3005 = length2;
                char[] cArr4 = new char[length2];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                    m.f3006++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3005 = length3;
            char[] cArr5 = new char[length3];
            m.f3006 = 0;
            while (m.f3006 < m.f3005) {
                cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                m.f3006++;
            }
            return new String(cArr5);
        }
    }
}
