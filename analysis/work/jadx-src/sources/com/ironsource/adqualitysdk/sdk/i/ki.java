package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.InterfaceC0280i1;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ki {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static e f2986 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2987 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f2988;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static e f2989;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2990;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2991;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2992;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2993;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2994;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2995;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m2857() {
        f2988 = -5258654881587544011L;
    }

    static {
        m2857();
        f2994 = true;
        f2995 = true;
        f2991 = true;
        byte b = 0;
        f2992 = false;
        f2993 = false;
        f2986 = new e(b);
        f2989 = new e(b);
        int i = f2987 + 3;
        f2990 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized ax m2848() {
        ax axVarMo494;
        int i = 2 % 2;
        int i2 = f2990 + 67;
        f2987 = i2 % 128;
        if (i2 % 2 == 0) {
            ar.m480().mo494();
            throw null;
        }
        axVarMo494 = ar.m480().mo494();
        int i3 = f2990 + 63;
        f2987 = i3 % 128;
        int i4 = i3 % 2;
        return axVarMo494;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[RETURN] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2854(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2987 + 3;
        int i3 = i2 % 128;
        f2990 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (webView != null) {
            int i4 = i3 + 29;
            f2987 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
                if (webView.getHandler() == null) {
                    if (webView.getRootView() == null) {
                        return;
                    }
                }
            } else if (webView.getHandler() == null) {
                if (webView.getRootView() == null) {
                    return;
                }
            }
            webView.loadUrl(new StringBuilder().append(m2846("Ⲝ\u2cf6\ue51e╊殲ᒨ\uebae呖ⰻ⑴\ueafe喲ⵄⒷ\ue99a嚊⺖⟎\ue938垛⾭⛯\ue867圥⢐Ⅵ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).append(str).append(m2846("⧁⧣熒놎뉇튃㈄鈧", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern()).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (m2861(r4.getContext()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r4 = r4.getWebViewClient();
        r1 = com.ironsource.adqualitysdk.sdk.i.ki.f2990 + 87;
        com.ironsource.adqualitysdk.sdk.i.ki.f2987 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (m2861(r4.getContext()) == false) goto L13;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebViewClient m2852(WebView webView) {
        int i = 2 % 2;
        if (m2848().m670()) {
            int i2 = f2987 + InterfaceC0280i1.d.b.b;
            f2990 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
        }
        hr<WebViewClient> hrVarM2856 = m2856(webView);
        if (hrVarM2856 == null) {
            throw new RuntimeException(m2846("\uea5c\uea1f夊饐꣬\ufdd3⣳봠\ueaec顭⧵볔\uebd4颱⪗뿺\ue844鮛⩝뺭\ue96e髙⬿빙\uee0f鴐Ⰾ륹\ueec1鱉ⷺ롤\ueff6齢⺿믔\uec98", 1 - View.MeasureSpec.getSize(0)).intern());
        }
        WebViewClient webViewClientMo2274 = hrVarM2856.mo2274();
        int i4 = f2987 + InterfaceC0280i1.d.b.d;
        f2990 = i4 % 128;
        int i5 = i4 % 2;
        return webViewClientMo2274;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static WebChromeClient m2843(WebView webView) {
        int i = 2 % 2;
        if (!(!m2848().m666())) {
            int i2 = f2987 + 9;
            f2990 = i2 % 128;
            int i3 = i2 % 2;
            if (m2855(webView.getContext())) {
                int i4 = f2990 + 63;
                f2987 = i4 % 128;
                int i5 = i4 % 2;
                WebChromeClient webChromeClient = webView.getWebChromeClient();
                int i6 = f2990 + InterfaceC0280i1.d.b.b;
                f2987 = i6 % 128;
                int i7 = i6 % 2;
                return webChromeClient;
            }
        }
        hr<WebChromeClient> hrVarM2858 = m2858(webView);
        if (hrVarM2858 == null) {
            throw new RuntimeException(m2846("꒡ꓢ\udee3ẹ摝\ude4c\ue442麿ꐑᾄ\ue544齋ꔩ\u1f58\ue626鱥ꚹᱲ\ue6ec鴲ꞓᴥ\ue78f鷑ꃪ\u1ad7\ue0b6髌ꀵᮧ\ue15a鮵ꄙᣂ\ue20d顎ꉤᡚ\ue333", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        }
        WebChromeClient webChromeClientMo2274 = hrVarM2858.mo2274();
        int i8 = f2990 + 71;
        f2987 = i8 % 128;
        int i9 = i8 % 2;
        return webChromeClientMo2274;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2851(WebView webView) {
        int i = 2 % 2;
        int i2 = f2990 + 93;
        f2987 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = m2852(webView) instanceof hj;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static hr<WebViewClient> m2856(WebView webView) {
        int i = 2 % 2;
        int i2 = f2987 + 77;
        f2990 = i2 % 128;
        int i3 = i2 % 2;
        m2847(webView.getContext());
        hr<WebViewClient> hrVarM2859 = m2859(webView, m2845(), f2986);
        int i4 = f2990 + 105;
        f2987 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return hrVarM2859;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static hr<WebChromeClient> m2858(WebView webView) {
        int i = 2 % 2;
        int i2 = f2987 + InterfaceC0280i1.d.b.d;
        f2990 = i2 % 128;
        int i3 = i2 % 2;
        m2847(webView.getContext());
        hr<WebChromeClient> hrVarM2859 = m2859(webView, m2853(), f2989);
        int i4 = f2987 + InterfaceC0280i1.d.b.g;
        f2990 = i4 % 128;
        if (i4 % 2 == 0) {
            return hrVarM2859;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2847(Context context) {
        int i = 2 % 2;
        int i2 = f2990 + InterfaceC0280i1.d.b.g;
        f2987 = i2 % 128;
        int i3 = i2 % 2;
        if (f2994) {
            f2994 = false;
            try {
                WebView webView = new WebView(context);
                hj hjVar = new hj(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.4
                });
                webView.setWebViewClient(hjVar);
                hk hkVar = new hk(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
                });
                webView.setWebChromeClient(hkVar);
                f2986 = m2860(webView, hjVar, m2845());
                f2989 = m2860(webView, hkVar, m2853());
                int i4 = f2990 + 77;
                f2987 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 24 / 0;
                    return;
                }
                return;
            } catch (Throwable th) {
                jz.m2766(m2846("鷞鶉틄ኔ菲ͭϺ䎤鵣Ꭸʻ䉋鰂፰ƌ䅙", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), m2846("蹫踮槈ꦏ賸嫑ೠᨡ軍꣡ඥᯊ辦꡶ກ\u18ff豹\uab1e\u0e3e\u19ac赔\uaa3fརᥗ訡귿ࠓṠ誳겆৶Ἧ诂꾧\u0aba\u1cc9", 1 - Color.red(0)).intern(), th, false);
            }
        }
        int i6 = f2987 + 13;
        f2990 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2861(Context context) {
        WebView webView;
        hj hjVar;
        boolean z;
        int i = 2 % 2;
        int i2 = f2990 + InterfaceC0280i1.d.b.i;
        f2987 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
            if (f2995) {
                try {
                    f2995 = false;
                    webView = new WebView(context);
                    hjVar = new hj(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
                    });
                    webView.setWebViewClient(hjVar);
                    if (hjVar == webView.getWebViewClient()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f2992 = z;
                } catch (Throwable th) {
                    jz.m2766(m2846("鷞鶉틄ኔ菲ͭϺ䎤鵣Ꭸʻ䉋鰂፰ƌ䅙", View.getDefaultSize(0, 0) + 1).intern(), m2846("鄤酡裈䢏飤ﶯ\u18fc뵟醂䧡ᦹ벴郩䥶\u1a9d뾁錶䨞ᨢ뻝鈒䭭ᬭ븡镭䳴\u1c4a뤻閹䶇᷐롑钍亾ẑ뮨韭乸ᾀ뫤", 1 - Color.green(0)).intern(), th, false);
                }
            }
        } else if (f2995) {
            f2995 = false;
            webView = new WebView(context);
            hjVar = new hj(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
            });
            webView.setWebViewClient(hjVar);
            if (hjVar == webView.getWebViewClient()) {
                z = true;
            } else {
                z = false;
            }
            f2992 = z;
        }
        boolean z2 = f2992;
        int i4 = f2990 + 53;
        f2987 = i4 % 128;
        int i5 = i4 % 2;
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2855(Context context) {
        int i = 2 % 2;
        int i2 = f2990 + 27;
        f2987 = i2 % 128;
        int i3 = i2 % 2;
        if (f2991) {
            boolean z = false;
            f2991 = false;
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.1
            });
            webView.setWebChromeClient(hkVar);
            if (hkVar == webView.getWebChromeClient()) {
                z = true;
            } else {
                int i4 = f2990 + 69;
                f2987 = i4 % 128;
                int i5 = i4 % 2;
            }
            f2993 = z;
        }
        return f2993;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> e m2860(WebView webView, T t, hx hxVar) {
        int i = 2 % 2;
        e eVar = new e((byte) 0);
        hr hrVarM2849 = m2849(webView, hxVar, m2848().m667(), m2848().m671());
        if (hrVarM2849 != null) {
            Object objMo2274 = hrVarM2849.mo2274();
            if (objMo2274 == t) {
                int i2 = f2987 + 73;
                f2990 = i2 % 128;
                int i3 = i2 % 2;
                eVar.m2866();
                return eVar;
            }
            hr hrVarM2850 = m2850(objMo2274, hxVar, m2848().m669(), m2848().m668());
            if (hrVarM2850 != null) {
                int i4 = f2987 + 81;
                f2990 = i4 % 128;
                int i5 = i4 % 2;
                if (hrVarM2850.mo2274() == t) {
                    eVar.m2865();
                    int i6 = f2987 + 87;
                    f2990 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> hr<T> m2859(WebView webView, hx hxVar, e eVar) {
        int i = 2 % 2;
        Object obj = null;
        try {
            if (eVar.m2864()) {
                int i2 = f2990 + InterfaceC0280i1.d.b.b;
                f2987 = i2 % 128;
                int i3 = i2 % 2;
                hr<T> hrVarM2849 = m2849(webView, hxVar, m2848().m667(), m2848().m671());
                if (eVar.m2863() && hrVarM2849 != null) {
                    int i4 = f2987 + 15;
                    f2990 = i4 % 128;
                    if (i4 % 2 != 0) {
                        hrVarM2849.mo2274();
                        super.hashCode();
                        throw null;
                    }
                    T tMo2274 = hrVarM2849.mo2274();
                    if (tMo2274 != null) {
                        int i5 = f2987 + 65;
                        f2990 = i5 % 128;
                        int i6 = i5 % 2;
                        if (!tMo2274.getClass().equals(hrVarM2849.mo2275().getType())) {
                            return m2850(tMo2274, hxVar, m2848().m669(), m2848().m668());
                        }
                    }
                }
                return hrVarM2849;
            }
        } catch (Throwable th) {
            jz.m2766(m2846("鷞鶉틄ኔ菲ͭϺ䎤鵣Ꭸʻ䉋鰂፰ƌ䅙", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern(), m2846("ᰈᱍ錐南㽋箥뽓㭕Ხ刹븒㪳ᷔ効봰㦌ḓ冁뷎㣒ἱ僰벟㠾᠌圯뮬㼃ᢜ噙", -TextUtils.lastIndexOf("", '0', 0)).intern(), th, false);
        }
        int i7 = f2987 + 45;
        f2990 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hr<T> m2849(WebView webView, hx hxVar, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f2990 + 117;
        f2987 = i3 % 128;
        if (i3 % 2 != 0) {
            return m2844(webView, hxVar, list, i);
        }
        m2844(webView, hxVar, list, i);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hr<T> m2850(T t, hx hxVar, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f2987 + 43;
        f2990 = i3 % 128;
        if (i3 % 2 == 0) {
            return m2844(t, hxVar, list, i);
        }
        m2844(t, hxVar, list, i);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hr<T> m2844(Object obj, hx hxVar, final List<String> list, int i) {
        int i2 = 2 % 2;
        hr<T> hrVarM2348 = hu.m2296().m2297().m2348(obj, hxVar, new hn() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            @Override // com.ironsource.adqualitysdk.sdk.i.hn
            /* JADX INFO: renamed from: ﻐ */
            public final Field[] mo2245(Object obj2) {
                hu.m2296().m2298();
                return hm.m2234(obj2.getClass(), true, -1, list);
            }
        }, list, i);
        int i3 = f2990 + 81;
        f2987 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return hrVarM2348;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static hx m2845() {
        int i = 2 % 2;
        hx hxVar = new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.6
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1856(hr hrVar) {
                return WebViewClient.class.equals(hrVar.mo2275().getType());
            }
        };
        int i2 = f2987 + 1;
        f2990 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return hxVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static hx m2853() {
        int i = 2 % 2;
        hx hxVar = new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.8
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1856(hr hrVar) {
                return WebChromeClient.class.equals(hrVar.mo2275().getType());
            }
        };
        int i2 = f2987 + 105;
        f2990 = i2 % 128;
        int i3 = i2 % 2;
        return hxVar;
    }

    static class e {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2997;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f2998;

        private e() {
            this.f2998 = false;
            this.f2997 = false;
        }

        /* synthetic */ e(byte b) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean m2862() {
            return this.f2998;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final void m2866() {
            this.f2998 = true;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final boolean m2863() {
            return this.f2997;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final void m2865() {
            this.f2997 = true;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final boolean m2864() {
            return m2862() || m2863();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2846(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2988, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2988));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
