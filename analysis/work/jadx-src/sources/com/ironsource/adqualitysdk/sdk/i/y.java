package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends w<Activity> implements jg {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f3166 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f3167 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static byte[] f3168;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3169;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f3170;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3171;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3172;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String f3173;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3174;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private d f3175;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3176;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f3177;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jg f3178;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3179;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3180;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static void m3026() {
        f3172 = -203418306;
        f3171 = 62;
        f3169 = -487132483;
        f3168 = new byte[]{-23, -43, -28, -46, -23, -11, -64, -1, -92, -31, -25, -49, -23, -47, -19, -2, 91, 65, 116, 113, 126, -65, 38, 112, -55, 49, 107, 126, -121, 84, 122, -106, 84, -128, -71, 46, 110, 122, 122, 117, 120, -74, 35, 120, 114, 117, -94, -75, -58, -59, -45, -83, -31, -47, -127, -59, -81, 3, -127, -59, -81, -72, -61, -55, -69, -55, -86, -62, -53, -63, -15, -121, -64, -81, -69, -60, -70, -61, -67, -69, -57, -7, 127, -68, -54, 0, 0, 0};
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ String m3027() {
        int i = 2 % 2;
        int i2 = f3167 + 7;
        int i3 = i2 % 128;
        f3170 = i3;
        int i4 = i2 % 2;
        String str = f3173;
        int i5 = i3 + 19;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ boolean m3028(y yVar) {
        int i = 2 % 2;
        int i2 = f3170;
        int i3 = i2 + 125;
        f3167 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = yVar.f3174;
        int i5 = i2 + 97;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Class m3031(y yVar, Class cls) {
        int i = 2 % 2;
        int i2 = f3167;
        int i3 = i2 + 121;
        f3170 = i3 % 128;
        int i4 = i3 % 2;
        yVar.f3177 = cls;
        int i5 = i2 + 53;
        f3170 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m3032(y yVar) {
        int i = 2 % 2;
        int i2 = f3167 + 15;
        int i3 = i2 % 128;
        f3170 = i3;
        int i4 = i2 % 2;
        boolean z = yVar.f3180;
        int i5 = i3 + 53;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m3033(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3170 + 39;
        int i3 = i2 % 128;
        f3167 = i3;
        int i4 = i2 % 2;
        yVar.f3174 = z;
        int i5 = i3 + 57;
        f3170 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ d m3034(y yVar) {
        int i = 2 % 2;
        int i2 = f3170 + 97;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        d dVar = yVar.f3175;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return dVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m3036(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3170 + 33;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        yVar.f3180 = z;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ jg m3037(y yVar) {
        int i = 2 % 2;
        int i2 = f3167 + 97;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        jg jgVarM3024 = yVar.m3024();
        int i4 = f3167 + 75;
        f3170 = i4 % 128;
        int i5 = i4 % 2;
        return jgVarM3024;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m3039(Activity activity) {
        int i = 2 % 2;
        int i2 = f3167 + 115;
        f3170 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3025(activity);
        }
        m3025(activity);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m3040(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3167 + 57;
        int i3 = i2 % 128;
        f3170 = i3;
        int i4 = i2 % 2;
        yVar.f3179 = z;
        int i5 = i3 + 27;
        f3167 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m3042() {
        int i = 2 % 2;
        int i2 = f3167 + 107;
        int i3 = i2 % 128;
        f3170 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m3043(y yVar) {
        int i = 2 % 2;
        int i2 = f3170 + 3;
        int i3 = i2 % 128;
        f3167 = i3;
        int i4 = i2 % 2;
        boolean z = yVar.f3176;
        int i5 = i3 + 29;
        f3170 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m3044(y yVar, Activity activity) {
        int i = 2 % 2;
        int i2 = f3170 + 49;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM3029 = yVar.m3029(activity);
        int i4 = f3170 + 69;
        f3167 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM3029;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m3045(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3170;
        int i3 = i2 + 69;
        f3167 = i3 % 128;
        int i4 = i3 % 2;
        yVar.f3176 = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 33;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m3046(y yVar) {
        int i = 2 % 2;
        int i2 = f3170;
        int i3 = i2 + 23;
        f3167 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = yVar.f3179;
        int i5 = i2 + 97;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻛ */
    final /* synthetic */ View mo2981(Activity activity) {
        int i = 2 % 2;
        int i2 = f3170 + 97;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        View viewM3030 = m3030(activity);
        int i4 = f3167 + 105;
        f3170 = i4 % 128;
        int i5 = i4 % 2;
        return viewM3030;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ｋ */
    final /* synthetic */ void mo2986(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = f3167 + 119;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        m3051(activity, str);
        int i4 = f3167 + 87;
        f3170 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ｋ */
    final /* synthetic */ void mo2987(Activity activity, List list) {
        int i = 2 % 2;
        int i2 = f3167 + 85;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        m3041(activity, (List<WebView>) list);
        int i4 = f3167 + 119;
        f3170 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾒ */
    final /* synthetic */ void mo2988(Activity activity) {
        int i = 2 % 2;
        int i2 = f3170 + 59;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        m3050(activity);
        int i4 = f3170 + 107;
        f3167 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        m3026();
        f3173 = m3038((-23) - (ViewConfiguration.getTouchSlop() >> 8), (short) (TextUtils.getOffsetBefore("", 0) + 66), (byte) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 203418353, 487132583 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
        int i = f3167 + 11;
        f3170 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    y(JSONObject jSONObject, iq iqVar) {
        super(iqVar);
        this.f3180 = false;
        this.f3179 = false;
        this.f3174 = false;
        this.f3176 = false;
        m3048(jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m3048(JSONObject jSONObject) {
        int i = 2 % 2;
        d dVar = new d(this, jSONObject);
        m2982((w.c) dVar);
        this.f3175 = dVar;
        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f3194 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f3195 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f3196 = 5;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f3197 = {'A', 'c', 't', 'i', 'v', 'y', 'd', 'H', 'a', 'n', 'l', 'e', 'r', 'E', 'o', ' ', 's', 'g', 'f', ':', 'B', 'C', 'D', 'F', 'G'};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                try {
                    y yVar = y.this;
                    y.m3031(yVar, Class.forName(d.m3063(y.m3034(yVar))));
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            y.this.m3052();
                        }
                    });
                    int i3 = f3194 + 13;
                    f3195 = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                } catch (ClassNotFoundException e) {
                    n.m2887(m3053((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, "\u0001\u0002\u0003\u0004\u0000\u0004\u0000\u0007\u0001\u0005\b\t\u0005\u0007\u000b\fª", (byte) (ExpandableListView.getPackedPositionType(0L) + 56)).intern(), new StringBuilder().append(m3053(29 - KeyEvent.keyCodeFromString(""), "\u000e\r\r\n\n\u0011\r\u0000\u0011\u0001\u000e\u0006\u0004\b\u0012\u0010\u0004\f\u0010\n\u0001\u000e\u0007\u0004\u0011\u0010\r\u0013\u0096", (byte) (Color.alpha(0) + 118)).intern()).append(d.m3063(y.m3034(y.this))).append(m3053(View.resolveSize(0, 0) + 2, "\u000f\u0010", (byte) (View.MeasureSpec.getMode(0) + 6)).intern()).append(e.getLocalizedMessage()).toString());
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m3053(int i2, String str, byte b) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2043) {
                    char[] cArr2 = f3197;
                    char c = f3196;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b);
                    }
                    if (i2 > 1) {
                        f.f2047 = 0;
                        while (f.f2047 < i2) {
                            f.f2045 = cArr[f.f2047];
                            f.f2048 = cArr[f.f2047 + 1];
                            if (f.f2045 == f.f2048) {
                                cArr3[f.f2047] = (char) (f.f2045 - b);
                                cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                            } else {
                                f.f2046 = f.f2045 / c;
                                f.f2042 = f.f2045 % c;
                                f.f2044 = f.f2048 / c;
                                f.f2041 = f.f2048 % c;
                                if (f.f2042 == f.f2041) {
                                    f.f2046 = ((f.f2046 + c) - 1) % c;
                                    f.f2044 = ((f.f2044 + c) - 1) % c;
                                    int i3 = (f.f2046 * c) + f.f2042;
                                    int i4 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i3];
                                    cArr3[f.f2047 + 1] = cArr2[i4];
                                } else if (f.f2046 == f.f2044) {
                                    f.f2042 = ((f.f2042 + c) - 1) % c;
                                    f.f2041 = ((f.f2041 + c) - 1) % c;
                                    int i5 = (f.f2046 * c) + f.f2042;
                                    int i6 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i5];
                                    cArr3[f.f2047 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (f.f2046 * c) + f.f2041;
                                    int i8 = (f.f2044 * c) + f.f2042;
                                    cArr3[f.f2047] = cArr2[i7];
                                    cArr3[f.f2047 + 1] = cArr2[i8];
                                }
                            }
                            f.f2047 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        });
        int i2 = f3170 + 51;
        f3167 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3052() {
        int i = 2 % 2;
        int i2 = f3167 + 77;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        jj.m2645().m2648(this);
        int i4 = f3170 + InterfaceC0280i1.d.b.b;
        f3167 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3049() {
        int i = 2 % 2;
        int i2 = f3167 + 33;
        f3170 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m2975((r) null);
            m3047((jg) null);
            jj.m2645().m2646(this);
        } else {
            m2975((r) null);
            m3047((jg) null);
            jj.m2645().m2646(this);
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3047(jg jgVar) {
        int i = 2 % 2;
        int i2 = f3167;
        int i3 = i2 + 57;
        f3170 = i3 % 128;
        int i4 = i3 % 2;
        this.f3178 = jgVar;
        int i5 = i2 + 13;
        f3170 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private jg m3024() {
        int i = 2 % 2;
        int i2 = f3167 + 87;
        int i3 = i2 % 128;
        f3170 = i3;
        int i4 = i2 % 2;
        jg jgVar = this.f3178;
        int i5 = i3 + InterfaceC0280i1.d.b.b;
        f3167 = i5 % 128;
        int i6 = i5 % 2;
        return jgVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static View m3030(Activity activity) {
        int i = 2 % 2;
        int i2 = f3170 + 37;
        f3167 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            activity.findViewById(R.id.content);
            super.hashCode();
            throw null;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        int i3 = f3170 + 55;
        f3167 = i3 % 128;
        if (i3 % 2 != 0) {
            return viewFindViewById;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻐ */
    final r<WebView, Activity> mo2980() {
        int i = 2 % 2;
        int i2 = f3167 + 47;
        int i3 = i2 % 128;
        f3170 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 5;
        f3167 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ﻛ, reason: avoid collision after fix types in other method */
    public final void mo393(final Activity activity) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).mo393(activity);
                }
            }
        });
        int i2 = f3170 + 17;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ﾒ */
    public final void mo394(final Activity activity) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).mo394(activity);
                }
            }
        });
        int i2 = f3167 + 83;
        f3170 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m3035(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).onActivityCreated(activity, bundle);
                    y.m3042();
                    y.m3040(y.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        y.m3036(y.this, bundle2.getBoolean(y.m3027()));
                        if (y.m3032(y.this)) {
                            y.m3040(y.this, true);
                        }
                        y.m3045(y.this, true);
                        return;
                    }
                    y.m3036(y.this, false);
                }
            }
        });
        int i2 = f3170 + 123;
        f3167 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.9
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).onActivityStarted(activity);
                }
            }
        });
        int i2 = f3170 + 41;
        f3167 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        int i = 2 % 2;
        m3035(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            y.m3037(y.this).onActivityResumed(activity);
                        }
                    });
                    y.m3033(y.this, false);
                    y.m3040(y.this, true);
                    if ((!y.m3032(y.this) || y.m3043(y.this)) && !activity.isFinishing()) {
                        y yVar = y.this;
                        Activity activity2 = activity;
                        yVar.m3051(activity2, y.m3039(activity2));
                    }
                    y.m3045(y.this, false);
                }
            }
        });
        int i2 = f3167 + 99;
        f3170 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m3035(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(y.m3027(), y.m3032(y.this));
                    }
                    y.m3033(y.this, true);
                }
            }
        });
        int i2 = f3167 + 59;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    y.m3037(y.this).onActivityPaused(activity);
                }
            }
        });
        int i2 = f3167 + 77;
        f3170 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        int i = 2 % 2;
        m3035(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            y.m3037(y.this).onActivityStopped(activity);
                        }
                    });
                    if (y.m3046(y.this) && !y.m3028(y.this) && activity.isFinishing()) {
                        y.this.m3050(activity);
                    }
                }
            }
        });
        int i2 = f3170 + 79;
        f3167 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        int i = 2 % 2;
        m3035(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (y.m3044(y.this, activity)) {
                    p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            y.m3037(y.this).onActivityDestroyed(activity);
                        }
                    });
                    if (y.m3046(y.this) && y.m3032(y.this) && activity.isFinishing()) {
                        y.this.m3050(activity);
                    }
                }
            }
        });
        int i2 = f3170 + 21;
        f3167 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3035(iu iuVar) {
        int i = 2 % 2;
        if (d.m3056(this.f3175)) {
            int i2 = f3170 + 81;
            f3167 = i2 % 128;
            if (i2 % 2 != 0) {
                p.m2899(iuVar);
                return;
            }
            p.m2899(iuVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        p.m2897(iuVar);
        int i3 = f3167 + 23;
        f3170 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3041(Activity activity, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f3170 + 97;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        kh.m2837(activity, WebView.class, d.m3060(this.f3175), d.m3065(this.f3175), false, false, null, this.f3175.f3140, list);
        int i4 = f3170 + 29;
        f3167 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean m3029(Activity activity) {
        int i = 2 % 2;
        Class<?> cls = activity.getClass();
        if (this.f3177 == null) {
            return false;
        }
        int i2 = f3170 + 113;
        f3167 = i2 % 128;
        if (i2 % 2 == 0) {
            d.m3059(this.f3175);
            throw null;
        }
        if (d.m3059(this.f3175)) {
            return this.f3177.equals(cls);
        }
        boolean zIsAssignableFrom = this.f3177.isAssignableFrom(cls);
        int i3 = f3170 + 73;
        f3167 = i3 % 128;
        if (i3 % 2 != 0) {
            return zIsAssignableFrom;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m3051(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = f3170 + 83;
        int i3 = i2 % 128;
        f3167 = i3;
        int i4 = i2 % 2;
        if (!this.f3180) {
            int i5 = i3 + 121;
            f3170 = i5 % 128;
            int i6 = i5 % 2;
            this.f3180 = true;
            super.mo2986(activity, str);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ij.f2519, true);
        } catch (JSONException e) {
            n.m2887(m3038(View.MeasureSpec.getMode(0) - 45, (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36), (byte) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) + 203418306, 487132548 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new StringBuilder().append(m3038((ViewConfiguration.getLongPressTimeout() >> 16) - 30, (short) ((-117) - Color.alpha(0)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 203418322, 487132552 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()).append(e.getLocalizedMessage()).toString());
        }
        super.m2983(jSONObject, activity, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ｋ */
    final ac mo2984() {
        int i = 2 % 2;
        aa aaVar = new aa();
        int i2 = f3170 + 41;
        f3167 = i2 % 128;
        int i3 = i2 % 2;
        return aaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m3050(Activity activity) {
        int i = 2 % 2;
        int i2 = f3167 + 51;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        super.mo2988(activity);
        this.f3180 = false;
        int i4 = f3170 + 43;
        f3167 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m3025(Activity activity) {
        int i = 2 % 2;
        int i2 = f3167 + 71;
        f3170 = i2 % 128;
        int i3 = i2 % 2;
        String hexString = Integer.toHexString(activity.hashCode());
        int i4 = f3170 + 13;
        f3167 = i4 % 128;
        int i5 = i4 % 2;
        return hexString;
    }

    public class d extends w.c {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f3210 = 0;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static int f3211 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f3212 = {Typography.less, 'p', 'g', 'e', 'k', 'a', 'Z', 'i', 'g', 'W', '`', 's', 'j', 'f', 'W', ']', 'n', 'g', '_', '\\', 'c', 'n', '5', 'n', 'c', 'a', '\\', '[', 'l', 'g', 'd', 'k', '2', 'k', 'a', '^', 'o', 's', 'v', 'p', 'g', ']', 209, 224, 217, 209, 206, 213, 208, 208, 222, 230, 224, 223, 220, 'b', 195, 187, 164, 173, 197, 194, 184, 164, 173, '@', Ascii.MAX, 'w', 'd', 'l', '{', '{', 'y', 'w', 'y', 's', 'i', 'i', 'n', 'g', 'j', 'r', 'y', 128, '4', 'k', 'n', '_', '^', '_', '_', 'q', 's'};

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f3213 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static long f3214 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3215 = 995757376;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3216 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3217;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3218;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f3219;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f3220;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ boolean m3056(d dVar) {
            int i = 2 % 2;
            int i2 = f3210 + 3;
            f3211 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = dVar.f3216;
            if (i3 != 0) {
                return z;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ boolean m3059(d dVar) {
            int i = 2 % 2;
            int i2 = f3210;
            int i3 = i2 + 121;
            f3211 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = dVar.f3217;
            int i5 = i2 + 91;
            f3211 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 97 / 0;
            }
            return z;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ int m3060(d dVar) {
            int i = 2 % 2;
            int i2 = f3211 + 61;
            int i3 = i2 % 128;
            f3210 = i3;
            int i4 = i2 % 2;
            int i5 = dVar.f3220;
            int i6 = i3 + 1;
            f3211 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ String m3063(d dVar) {
            int i = 2 % 2;
            int i2 = f3211 + 25;
            f3210 = i2 % 128;
            int i3 = i2 % 2;
            String str = dVar.f3219;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ String m3065(d dVar) {
            int i = 2 % 2;
            int i2 = f3211;
            int i3 = i2 + 5;
            f3210 = i3 % 128;
            int i4 = i3 % 2;
            String str = dVar.f3218;
            int i5 = i2 + 87;
            f3210 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public d(y yVar, JSONObject jSONObject) {
            boolean z = true;
            m3062(jSONObject.optString(m3058("遾㼃旉⫝", (char) (TextUtils.lastIndexOf("", '0', 0) + 56678), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, "騙歡\uf50d\uef20\ue150姕\uf278쭻༸ᔇ\udc62ᜂ븬轟", "\u0000\u0000\u0000\u0000").intern()));
            m3057(jSONObject.optString(m3064(true, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{0, 22, 0, 0}).intern()));
            m3061(jSONObject.optInt(m3058("ਊ䡨뒔㎼", (char) Color.blue(0), (-1807194102) - Color.alpha(0), "種ᒏᝠ醯滪⪈㏛俚⽧", "\u0000\u0000\u0000\u0000").intern(), -1));
            m3054(jSONObject.optBoolean(m3058("ꢣ力圁眢", (char) (View.resolveSize(0, 0) + 8791), 22191017 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "끺콉ﾽؙὄ砳㡹\ue547兰땴씱뉮\ude1c灄囈ᴥ⥝", "\u0000\u0000\u0000\u0000").intern()));
            m3055(jSONObject.optBoolean(m3058("\uee00헄\ufbcf貗", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38908), TextUtils.getOffsetAfter("", 0) - 808074002, "ꏯﶂě郂筆焀稞갱䄉⏹閙貄䰴鉓转ꉒ朅\ue47b\uecc3", "\u0000\u0000\u0000\u0000").intern()));
            m3006(jSONObject.optString(m3064(false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{22, 10, 0, 0}).intern()));
            m3007(TextUtils.isEmpty(jSONObject.optString(m3064(true, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{32, 9, 0, 6}).intern())) ? null : Arrays.asList(jSONObject.optString(m3064(true, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{32, 9, 0, 6}).intern()).split(m3058("娿晌\ueef8\ue70f", (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4077), (-127513511) - TextUtils.lastIndexOf("", '0'), "㤌", "\u0000\u0000\u0000\u0000").intern())));
            m3009(jSONObject.optBoolean(m3064(true, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{41, 14, 114, 11}).intern()));
            m3008(jSONObject.optBoolean(m3058("隇鉁蔿챬", (char) (27781 - ExpandableListView.getPackedPositionType(0L)), 1066549654 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\ue737鍓㐬Ѿ꿶\ue0bd瘀ዴ鬊ཡ\udcbf륞ᇤ", "\u0000\u0000\u0000\u0000").intern(), true));
            if (TextUtils.isEmpty(jSONObject.optString(m3064(false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{22, 10, 0, 0}).intern())) && !jSONObject.optBoolean(m3058("ࣰ숉\ue1ac厉", (char) (35298 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0), "蘨⧢邤\uf7bf\udf1c巆鞢╝험爿壯픊褤숄细⽼", "\u0000\u0000\u0000\u0000").intern()) && !jSONObject.optBoolean(m3058("\uf5ce龽谟죅", (char) (View.resolveSize(0, 0) + 50572), Color.alpha(0), "ꘆఢ狛롖鰏飠祐⌃桯䝹큇ⶡ멟潜횦\uf739ય樍", "\u0000\u0000\u0000\u0000").intern())) {
                z = false;
            }
            m3004(z);
            m3005(jSONObject.optBoolean(m3058("ࣰ숉\ue1ac厉", (char) (35297 - (ViewConfiguration.getScrollBarSize() >> 8)), ViewConfiguration.getFadingEdgeLength() >> 16, "蘨⧢邤\uf7bf\udf1c巆鞢╝험爿壯픊褤숄细⽼", "\u0000\u0000\u0000\u0000").intern()));
            m3000(jSONObject.optBoolean(m3064(false, "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{55, 10, 79, 10}).intern()));
            m3010(jSONObject.optBoolean(m3064(false, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{65, 19, 11, 0}).intern()));
            m3002(jSONObject.optBoolean(m3058("帛踠魵Ḍ", (char) (AndroidCharacter.getMirror('0') + 3179), 1972248670 - (ViewConfiguration.getScrollBarSize() >> 8), "↣麁铞ꑂ댘峥衧ଘ\u0cd2ᗴ礽殆㧐鴏㷊灩\ud9f4", "\u0000\u0000\u0000\u0000").intern()));
            m3001(jSONObject.optBoolean(m3064(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{84, 9, 0, 0}).intern()));
            m3003(kd.m2825(jSONObject.optJSONArray(m3058("㷨닔\ud87b\uf3e9", (char) (Color.rgb(0, 0, 0) + 16837080), (ViewConfiguration.getTouchSlop() >> 8) + 2075317309, "쇺\ue88cØ늚襌㳄\uefa2\ue55a냈ﺘꆋ㨍夸", "\u0000\u0000\u0000\u0000").intern())));
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private d m3062(String str) {
            int i = 2 % 2;
            int i2 = f3211 + 81;
            f3210 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f3219 = str;
                return this;
            }
            this.f3219 = str;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private d m3057(String str) {
            int i = 2 % 2;
            int i2 = f3210 + 7;
            f3211 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f3218 = str;
                return this;
            }
            this.f3218 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private d m3061(int i) {
            int i2 = 2 % 2;
            int i3 = f3211 + 113;
            f3210 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f3220 = i;
                return this;
            }
            this.f3220 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private d m3054(boolean z) {
            int i = 2 % 2;
            int i2 = f3210;
            int i3 = i2 + 107;
            f3211 = i3 % 128;
            int i4 = i3 % 2;
            this.f3217 = z;
            int i5 = i2 + 115;
            f3211 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private d m3055(boolean z) {
            int i = 2 % 2;
            int i2 = f3210 + 33;
            int i3 = i2 % 128;
            f3211 = i3;
            int i4 = i2 % 2;
            this.f3216 = z;
            int i5 = i3 + 87;
            f3210 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m3058(String str, char c, int i, String str2, String str3) {
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
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr2[g.f2156])) ^ f3214) ^ ((long) f3215)) ^ ((long) f3213));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m3064(boolean z, String str, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3212, i, cArr, 0, i2);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m3038(int i, short s, byte b, int i2, int i3) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f3171;
            int i5 = i + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f3168;
                if (bArr != null) {
                    i5 = (byte) (bArr[f3172 + i2] + i4);
                } else {
                    i5 = (short) (f3166[f3172 + i2] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i2 + i5) - 2) + f3172 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f3169);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f3168;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f3166;
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
