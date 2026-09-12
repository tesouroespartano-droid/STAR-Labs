package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ac<T> extends v<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f106 = 41379;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f107 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f108 = 50121;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f109 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f110 = 9043;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f111 = 19805;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private jt f114;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f115;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f116;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jr f117;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f118;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f119;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, jr> f113 = new WeakHashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private List<jn> f112 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ */
    abstract T mo205(WebView webView);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ay.d m271(ac acVar) {
        int i = 2 % 2;
        int i2 = f107 + 81;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        ay.d dVarM274 = acVar.m274();
        int i4 = f107 + 87;
        f109 = i4 % 128;
        int i5 = i4 % 2;
        return dVarM274;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m273(String str) {
        int i = 2 % 2;
        int i2 = f109 + 29;
        f107 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM281 = m281(str);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = f109 + InterfaceC0280i1.d.b.i;
        f107 = i5 % 128;
        if (i5 % 2 == 0) {
            return jSONObjectM281;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m276(ac acVar) {
        int i = 2 % 2;
        int i2 = f107 + 99;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = acVar.f115;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ List m278(ac acVar) {
        int i = 2 % 2;
        int i2 = f107 + 33;
        int i3 = i2 % 128;
        f109 = i3;
        int i4 = i2 % 2;
        List<String> list = acVar.f118;
        int i5 = i3 + 23;
        f107 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m280(ac acVar, WebView webView) {
        int i = 2 % 2;
        int i2 = f107 + 29;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        acVar.m279(webView);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = f107 + 9;
        f109 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public final /* synthetic */ void mo229(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f107 + 11;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        m283(jSONObject, (WebView) obj, obj2);
        int i4 = f109 + 81;
        f107 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public final /* synthetic */ void mo234(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f109 + 123;
        f107 = i2 % 128;
        int i3 = i2 % 2;
        m286(jSONObject, (WebView) obj, obj2);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m290(String str, List<String> list, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        this.f119 = z;
        this.f114 = new jt(str, z3);
        this.f115 = z2;
        this.f118 = list;
        int i2 = f109 + 15;
        f107 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m285() {
        int i = 2 % 2;
        for (WebView webView : this.f113.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            jr jrVar = this.f113.get(webView);
            Iterator<jn> it = this.f112.iterator();
            while (it.hasNext()) {
                jrVar.m2691(it.next());
                int i2 = f107 + 37;
                f109 = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        this.f112.clear();
        this.f117 = null;
        this.f113.clear();
        int i4 = f107 + InterfaceC0280i1.d.b.g;
        f109 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m289() {
        int i = 2 % 2;
        jr jrVar = this.f117;
        if (jrVar != null) {
            int i2 = f107 + 97;
            f109 = i2 % 128;
            int i3 = i2 % 2;
            return jrVar.m2690();
        }
        int i4 = f109 + 31;
        f107 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ay.d m274() {
        int i = 2 % 2;
        int i2 = f107 + 37;
        int i3 = i2 % 128;
        f109 = i3;
        int i4 = i2 % 2;
        jr jrVar = this.f117;
        Object obj = null;
        if (jrVar == null) {
            return null;
        }
        int i5 = i3 + 77;
        f107 = i5 % 128;
        if (i5 % 2 == 0) {
            return jrVar.m2692();
        }
        jrVar.m2692();
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[PHI: r1
      0x005f: PHI (r1v16 com.ironsource.adqualitysdk.sdk.i.jr) = (r1v15 com.ironsource.adqualitysdk.sdk.i.jr), (r1v23 com.ironsource.adqualitysdk.sdk.i.jr) binds: [B:14:0x005d, B:11:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m284(WebView webView) {
        jr jrVarM2685;
        int i = 2 % 2;
        int i2 = f107 + InterfaceC0280i1.d.b.b;
        int i3 = i2 % 128;
        f109 = i3;
        int i4 = i2 % 2;
        if (webView != null) {
            int i5 = i3 + 119;
            f107 = i5 % 128;
            if (i5 % 2 != 0) {
                this.f113.containsKey(webView);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (this.f113.containsKey(webView)) {
                return;
            }
            int i6 = f107 + InterfaceC0280i1.d.b.d;
            f109 = i6 % 128;
            if (i6 % 2 == 0) {
                jrVarM2685 = jr.m2685(webView, m272("\uf3c3Ӳ큲꿂\ue048⦳竖ᜤ곢ী", 117 >> (ViewConfiguration.getLongPressTimeout() << 50)).intern());
                if (this.f117 == null) {
                    this.f117 = jrVarM2685;
                    int i7 = f107 + 125;
                    f109 = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else {
                jrVarM2685 = jr.m2685(webView, m272("\uf3c3Ӳ큲꿂\ue048⦳竖ᜤ곢ী", 9 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
                if (this.f117 == null) {
                    this.f117 = jrVarM2685;
                    int i9 = f107 + 125;
                    f109 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            this.f113.put(webView, jrVarM2685);
            jn jnVarM277 = m277();
            this.f112.add(jnVarM277);
            jrVarM2685.m2688(jnVarM277);
            m279(webView);
            webView.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WebView webView;
        int i9 = 2 % 2;
        try {
            if (view instanceof WebView) {
                int i10 = f107 + 19;
                f109 = i10 % 128;
                if (i10 % 2 == 0) {
                    webView = (WebView) view;
                    int i11 = 94 / 0;
                    if (this.f113.containsKey(webView)) {
                        m279(webView);
                    }
                } else {
                    webView = (WebView) view;
                    if (this.f113.containsKey(webView)) {
                        m279(webView);
                    }
                }
            }
            int i12 = f107 + 7;
            f109 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th) {
            jz.m2766(m272("\uf104\uf265柂\u187fűᰣ䡷ᑴ쾨\ueed9됸筡\ue255ғ緃數", TextUtils.lastIndexOf("", '0', 0, 0) + 17).intern(), m272("˪\uf2be躅蘟픈膺簋ᶄ\uf49c\uec33䗋ꎊྩ釂挩逌羏✔ꂘ陥i\ueef8搡̓", 23 - TextUtils.getCapsMode("", 0, 0)).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m288(List<WebView> list) {
        int i = 2 % 2;
        if (list != null) {
            int i2 = f109 + 91;
            f107 = i2 % 128;
            if (i2 % 2 == 0) {
                Iterator<WebView> it = list.iterator();
                int i3 = f109 + 125;
                f107 = i3 % 128;
                int i4 = i3 % 2;
                while (it.hasNext()) {
                    m284(it.next());
                }
                return;
            }
            list.iterator();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ac$1, reason: invalid class name */
    final class AnonymousClass1 implements jn {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f120 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f121 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f122 = 10975;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f123 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f124 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f125 = 44327;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f126 = 50065;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f127 = 62056;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f128 = 3582;

        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ void m293(AnonymousClass1 anonymousClass1, WebView webView, String str, boolean z) {
            int i = 2 % 2;
            int i2 = f124 + 81;
            f123 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass1.m291(webView, str, z);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f123 + 71;
            f124 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
        
            if (r0.equals(m292("淍쨂쮥鐤樄\uf401", 62 / (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 75)).intern()) != false) goto L9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jn
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo297(WebView webView, String str, String str2) {
            String strSubstring;
            String strSubstring2;
            int i = 2 % 2;
            int i2 = f124 + InterfaceC0280i1.d.b.i;
            f123 = i2 % 128;
            if (i2 % 2 != 0) {
                String strSubstring3 = str2.substring(0, str2.indexOf(63));
                strSubstring = str2.substring(str2.indexOf(63) + 1);
                if (!strSubstring3.equals(m292("淍쨂쮥鐤樄\uf401", 6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    strSubstring2 = strSubstring3;
                    if (strSubstring2.equals(m294("⍥䞝\uf389\ue25b⏽⾗", Drawable.resolveOpacity(0, 0), "缥媱亲\ued5e", "\u0000\u0000\u0000\u0000", (char) (24142 - (ViewConfiguration.getEdgeSlop() >> 16))).intern())) {
                        int i3 = f123 + InterfaceC0280i1.d.b.b;
                        f124 = i3 % 128;
                        int i4 = i3 % 2;
                        JSONObject jSONObjectM273 = ac.m273(strSubstring);
                        ac acVar = ac.this;
                        acVar.m286(jSONObjectM273, webView, acVar.mo205(webView));
                        return;
                    }
                    if (strSubstring2.equals(m292("淍쨂쮥鐤䭬袣", ImageFormat.getBitsPerPixel(0) + 7).intern())) {
                        JSONObject jSONObjectM274 = ac.m273(strSubstring);
                        ac acVar2 = ac.this;
                        acVar2.mo232(jSONObjectM274, webView, ac.m271(acVar2), ac.this.mo205(webView));
                        int i5 = f124 + 33;
                        f123 = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    if (strSubstring2.equals(m294("䦪㿨Ο휢奪៨", ViewConfiguration.getMinimumFlingVelocity() >> 16, "徇䛑₨趬", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44064)).intern())) {
                        JSONObject jSONObjectM275 = ac.m273(strSubstring);
                        jSONObjectM275.remove(ij.f2564);
                        ac acVar3 = ac.this;
                        acVar3.mo228(jSONObjectM275, webView, acVar3.mo205(webView));
                        return;
                    }
                    if (strSubstring2.equals(m294("준訲惘㾑봡ꖯ", ViewConfiguration.getKeyRepeatDelay() >> 16, "렍㙌䫅䃇", "\u0000\u0000\u0000\u0000", (char) (MotionEvent.axisFromString("") + 51019)).intern())) {
                        JSONObject jSONObjectM276 = ac.m273(strSubstring);
                        jz.m2764(jSONObjectM276.optString(m292("\udd7a\uf8cf吒潍", 2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()), jSONObjectM276.optString(m292("ꒂ\ued77柩놾吒潍", AndroidCharacter.getMirror('0') - '+').intern()), jSONObjectM276.optString(m294("좁裖䯷\udaa6㿚\u0a64", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u2d6d嵻\u0092毖", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 54784)).intern()), jSONObjectM276.optString(m292("ꒂ\ued77淍쨂묗蓪", (KeyEvent.getMaxKeyCode() >> 16) + 5).intern()));
                        return;
                    }
                    return;
                }
                ac.m280(ac.this, webView);
                return;
            }
            strSubstring2 = str2.substring(1, str2.indexOf(49));
            strSubstring = str2.substring(str2.indexOf(0) - 1);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jn
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo298(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ac.1.5
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    if (ac.m276(ac.this)) {
                        if (ac.m278(ac.this) == null || ac.m278(ac.this).isEmpty()) {
                            AnonymousClass1.m293(AnonymousClass1.this, webView, str, z);
                            return;
                        }
                        Iterator it = ac.m278(ac.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass1.m293(AnonymousClass1.this, webView, str, z);
                                return;
                            }
                        }
                    }
                }
            });
            int i2 = f124 + 23;
            f123 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jn
        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void mo296(WebView webView) {
            int i = 2 % 2;
            int i2 = f124 + 13;
            f123 = i2 % 128;
            int i3 = i2 % 2;
            ac.m280(ac.this, webView);
            int i4 = f123 + 31;
            f124 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m291(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            p.m2897(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ac.1.3
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo205 = ac.this.mo205(webView);
                    p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ac.1.3.5

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f134 = 1;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f135;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f136 = {'w', 48692, 31975, 'W', 48679, 31974, 14992, 63841, 46895, 30203, 13199, 62068, 45082, 28405, 11448, 60284, 43318, 26617, 9644, 'E', 48688, 31990, 15017, 63866, 46954, 30191, 13244, 62069, 45107, 28384, 11455, 60278, 43325, 26556, 9661, 58444, 41483, 24775, 7821, 56584, 39680, 23007, 6017, 54878, 37960, 21140};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static long f137 = -5256537297425547710L;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            int i2 = 2 % 2;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ij.f2558, str);
                                jSONObject.put(ij.f2554, m299(ViewConfiguration.getMinimumFlingVelocity() >> 16, 2 - MotionEvent.axisFromString(""), (char) (Process.myTid() >> 22)).intern());
                                jSONObject.put(ij.f2566, originalUrl);
                                if (z) {
                                    int i3 = f134 + 21;
                                    f135 = i3 % 128;
                                    jSONObject.put(i3 % 2 != 0 ? ij.f2567 : ij.f2567, true);
                                }
                                int i4 = f135 + 113;
                                f134 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (JSONException e) {
                                n.m2887(m299((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m299(View.getDefaultSize(0, 0) + 19, 27 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()).append(e.getLocalizedMessage()).toString());
                            }
                            ac.this.mo230(jSONObject, webView, ac.m271(ac.this), objMo205);
                        }

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m299(int i2, int i3, char c) {
                            String str2;
                            synchronized (b.f637) {
                                char[] cArr = new char[i3];
                                b.f638 = 0;
                                while (b.f638 < i3) {
                                    cArr[b.f638] = (char) ((((long) f136[b.f638 + i2]) ^ (((long) b.f638) * f137)) ^ ((long) c));
                                    b.f638++;
                                }
                                str2 = new String(cArr);
                            }
                            return str2;
                        }
                    });
                }
            });
            int i2 = f124 + 125;
            f123 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jn
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo295(WebView webView, String str) {
            int i = 2 % 2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ij.f2568, str);
                jSONObject.put(ij.f2560, ij.f2563);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ij.f2565, jSONObject);
                ac acVar = ac.this;
                acVar.mo235(jSONObject2, webView, this, acVar.mo205(webView));
                int i2 = f124 + 61;
                f123 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (Exception e) {
                jz.m2766(m292("蘰⛌⭰軠\uf59d䡣츐鳘䅌憠妖蘥諚䑆ꒂ\ued77", 15 - Process.getGidForName("")).intern(), m294("ඐ鹆\ue267붃ꔢ檸띤\u0b51眏\ue8f7Ᵹ骍픂\ueb73\ue78b缩疩\uef2e狁ꥊ\udc67㗐\uf511妢Цᜩ篷쨕攉", 1346859416 - KeyEvent.normalizeMetaState(0), "颵䝱ᙐપ", "\u0000\u0000\u0000\u0000", (char) (KeyEvent.normalizeMetaState(0) + 43542)).intern(), (Throwable) e, false);
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m292(String str, int i) {
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
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f127)) ^ ((c2 >>> 5) + f128)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f125) ^ ((c3 + i2) ^ ((c3 << 4) + f126))));
                        i2 -= 40503;
                    }
                    cArr2[k.f2951] = cArr3[0];
                    cArr2[k.f2951 + 1] = cArr3[1];
                    k.f2951 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m294(String str, int i, String str2, String str3, char c) {
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
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                g.f2156 = 0;
                while (g.f2156 < length) {
                    int i2 = (g.f2156 + 2) % 4;
                    int i3 = (g.f2156 + 3) % 4;
                    g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                    cArr4[i3] = g.f2154;
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f121) ^ ((long) f120)) ^ ((long) f122));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jn m277() {
        int i = 2 % 2;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        int i2 = f107 + 65;
        f109 = i2 % 128;
        if (i2 % 2 != 0) {
            return anonymousClass1;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m279(WebView webView) {
        int i = 2 % 2;
        int i2 = f109 + 79;
        f107 = i2 % 128;
        int i3 = i2 % 2;
        jr jrVar = this.f113.get(webView);
        if (!this.f119) {
            return;
        }
        int i4 = f107 + 37;
        f109 = i4 % 128;
        if (i4 % 2 == 0) {
            jrVar.m2689();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (jrVar.m2689()) {
            if (!ki.m2851(webView)) {
                jrVar.m2693();
            }
            m275(webView);
            int i5 = f109 + 81;
            f107 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m275(WebView webView) {
        int i = 2 % 2;
        int i2 = f107 + 19;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        this.f114.m2704(webView);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L9;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject m281(String str) {
        String strDecode;
        int i = 2 % 2;
        int i2 = f109 + 61;
        f107 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                strDecode = URLDecoder.decode(str, m272("熖㹔蔠ઽᾩ觩", 2 >> ((byte) KeyEvent.getModifierMetaStateMask())).intern());
                if (!TextUtils.isEmpty(strDecode)) {
                    JSONObject jSONObject = new JSONObject(strDecode);
                    int i3 = f107 + 77;
                    f109 = i3 % 128;
                    if (i3 % 2 != 0) {
                        return jSONObject;
                    }
                    throw null;
                }
                int i4 = f107 + 55;
                f109 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strDecode = URLDecoder.decode(str, m272("熖㹔蔠ઽᾩ觩", 4 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
            }
        } catch (Exception e) {
            n.m2873(m272("\uf104\uf265柂\u187fűᰣ䡷ᑴ쾨\ueed9됸筡\ue255ғ緃數", 16 - Color.argb(0, 0, 0, 0)).intern(), m272("˪\uf2be躅蘟픈膺뭝绵娔婼簋ᶄ裬`∛ኃ䊫揼", TextUtils.getTrimmedLength("") + 18).intern(), (Throwable) e);
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m287(String str) {
        int i = 2 % 2;
        int i2 = f109;
        int i3 = i2 + 77;
        f107 = i3 % 128;
        int i4 = i3 % 2;
        this.f116 = str;
        int i5 = i2 + 1;
        f107 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* JADX INFO: renamed from: ﾇ */
    public final String mo224(T t) {
        int i = 2 % 2;
        int i2 = f109;
        int i3 = i2 + 31;
        f107 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f116;
        int i5 = i2 + 97;
        f107 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m282(JSONObject jSONObject, WebView webView) {
        int i;
        int i2 = 2 % 2;
        int i3 = f109 + InterfaceC0280i1.d.b.g;
        f107 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
            if (webView != null) {
                try {
                    jSONObject.put(ij.f2527, webView.getWindowToken() != null);
                    i = f107 + 81;
                    f109 = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                } catch (JSONException unused) {
                }
            }
        } else if (webView != null) {
            jSONObject.put(ij.f2527, webView.getWindowToken() != null);
            i = f107 + 81;
            f109 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = f109 + 5;
        f107 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m286(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f107 + 87;
        f109 = i2 % 128;
        if (i2 % 2 == 0) {
            m282(jSONObject, webView);
            super.mo234(jSONObject, webView, (Object) t);
            int i3 = 34 / 0;
        } else {
            m282(jSONObject, webView);
            super.mo234(jSONObject, webView, (Object) t);
        }
        int i4 = f109 + 93;
        f107 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m283(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f107 + 15;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        jSONObject.remove(ij.f2564);
        super.mo229(jSONObject, webView, (Object) t);
        int i4 = f107 + 65;
        f109 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m272(String str, int i) {
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
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f108)) ^ ((c2 >>> 5) + f106)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f110) ^ ((c3 + i2) ^ ((c3 << 4) + f111))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
