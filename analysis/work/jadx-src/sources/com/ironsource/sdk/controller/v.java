package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.A4;
import com.ironsource.Ab;
import com.ironsource.Ag;
import com.ironsource.Bg;
import com.ironsource.C0145a4;
import com.ironsource.C0164b5;
import com.ironsource.C0198d4;
import com.ironsource.C0232f4;
import com.ironsource.C0249g4;
import com.ironsource.C0254g9;
import com.ironsource.C0270h8;
import com.ironsource.C0284i5;
import com.ironsource.C0298j0;
import com.ironsource.C0319k4;
import com.ironsource.C0370n4;
import com.ironsource.C0374n8;
import com.ironsource.C0421q4;
import com.ironsource.C0425q8;
import com.ironsource.C0434r1;
import com.ironsource.C0441r8;
import com.ironsource.C0458s8;
import com.ironsource.C0509v8;
import com.ironsource.C0532we;
import com.ironsource.C0543x8;
import com.ironsource.C0577z8;
import com.ironsource.C1;
import com.ironsource.Cb;
import com.ironsource.Dc;
import com.ironsource.EnumC0288i9;
import com.ironsource.F5;
import com.ironsource.Gc;
import com.ironsource.H8;
import com.ironsource.Hc;
import com.ironsource.Ic;
import com.ironsource.InterfaceC0148a7;
import com.ironsource.InterfaceC0201d7;
import com.ironsource.InterfaceC0218e7;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.InterfaceC0302j4;
import com.ironsource.InterfaceC0325ka;
import com.ironsource.InterfaceC0454s4;
import com.ironsource.InterfaceC0468t1;
import com.ironsource.InterfaceC0488u4;
import com.ironsource.InterfaceC0505v4;
import com.ironsource.InterfaceC0522w4;
import com.ironsource.InterfaceC0539x4;
import com.ironsource.InterfaceC0576z7;
import com.ironsource.L;
import com.ironsource.P6;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.Sd;
import com.ironsource.T7;
import com.ironsource.Td;
import com.ironsource.Wf;
import com.ironsource.X3;
import com.ironsource.X4;
import com.ironsource.X9;
import com.ironsource.Y0;
import com.ironsource.Y1;
import com.ironsource.Y4;
import com.ironsource.Z0;
import com.ironsource.Z3;
import com.ironsource.Z9;
import com.ironsource.dg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v implements com.ironsource.sdk.controller.l, Dc, DownloadListener {
    private static final String b0 = "about:blank";
    public static int c0 = 0;
    public static String d0 = "is_store";
    public static String e0 = "external_url";
    public static String f0 = "secondary_web_view";
    private static String g0 = "success";
    private static String h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private dg C;
    private Z0 D;
    private Y4 G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private C0434r1 N;
    private A4 O;
    private Ag P;
    private com.ironsource.sdk.controller.c Q;
    private X3 R;
    private JSONObject S;
    private com.ironsource.sdk.controller.l.a T;
    private com.ironsource.sdk.controller.l.b U;
    private C0370n4 V;
    private boolean W;
    C0249g4 Y;
    final Z9 Z;
    private final T7 a;
    private Gc a0;
    private InterfaceC0302j4 b;
    private String f;
    private String g;
    private final C0284i5 h;
    private boolean i;
    private p j;
    private boolean k;
    private CountDownTimer l;
    public CountDownTimer m;
    private final o q;
    private View r;
    private FrameLayout s;
    private WebChromeClient.CustomViewCallback t;
    private FrameLayout u;
    private u v;
    private String w;
    private InterfaceC0539x4 x;
    private InterfaceC0522w4 y;
    private InterfaceC0505v4 z;
    private String c = "v";
    private String d = "IronSource";
    private final String e = "We're sorry, some error occurred. we will investigate it";
    private int n = 50;
    private int o = 50;
    private String p = C0198d4.e.b;
    private Object E = new Object();
    private boolean F = false;
    private final InterfaceC0576z7 X = Ab.U().i();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class b implements Runnable {
        final /* synthetic */ C0441r8 a;

        b(C0441r8 c0441r8) {
            this.a = c0441r8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.c("controller html - failed to download - " + this.a.b());
        }
    }

    class c implements Runnable {
        final /* synthetic */ Context a;

        c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.a);
        }
    }

    class d implements Runnable {
        final /* synthetic */ Context a;

        d(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.a);
        }
    }

    class e implements Runnable {
        final /* synthetic */ C0425q8.e a;
        final /* synthetic */ String b;

        e(C0425q8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0488u4 interfaceC0488u4A;
            C0425q8.e eVar = this.a;
            if ((eVar == C0425q8.e.RewardedVideo || eVar == C0425q8.e.Interstitial) && (interfaceC0488u4A = v.this.a(eVar)) != null) {
                interfaceC0488u4A.b(this.a, this.b);
            }
        }
    }

    class g implements Ag {
        g() {
        }

        @Override // com.ironsource.Ag
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    class h implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ WebView b;
        final /* synthetic */ String c;

        h(JSONObject jSONObject, WebView webView, String str) {
            this.a = jSONObject;
            this.b = webView;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.a, this.b);
            v.this.m("about:blank");
            v.this.m(this.c);
        }
    }

    class i extends CountDownTimer {
        final /* synthetic */ int a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.c(C0198d4.c.j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j, long j2, int i) {
            super(j, j2);
            this.a = i;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.c, "Loading Controller Timer Finish");
            int i = this.a;
            if (i == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(v.this.c, "Loading Controller Timer Tick " + j);
        }
    }

    class j implements s {
        j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C0425q8.e eVar, X4 x4) {
            v.this.a(str, eVar, x4);
        }
    }

    class k implements s {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C0425q8.e eVar, X4 x4) {
            v.this.a(str, eVar, x4);
        }
    }

    class l implements s {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C0425q8.e eVar, X4 x4) {
            v.this.a(str, eVar, x4);
        }
    }

    class m implements Runnable {
        final /* synthetic */ C0425q8.e a;
        final /* synthetic */ X4 b;
        final /* synthetic */ String c;

        m(C0425q8.e eVar, X4 x4, String str) {
            this.a = eVar;
            this.b = x4;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            X4 x4;
            C0425q8.e eVar = C0425q8.e.RewardedVideo;
            C0425q8.e eVar2 = this.a;
            if ((eVar != eVar2 && C0425q8.e.Interstitial != eVar2 && C0425q8.e.Banner != eVar2) || (x4 = this.b) == null || TextUtils.isEmpty(x4.h())) {
                return;
            }
            InterfaceC0488u4 interfaceC0488u4A = v.this.a(this.a);
            Log.d(v.this.c, "onAdProductInitFailed (message:" + this.c + ")(" + this.a + ")");
            if (interfaceC0488u4A != null) {
                interfaceC0488u4A.a(this.a, this.b.h(), this.c);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    private class o extends WebChromeClient {
        private o() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.r;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.s.removeView(vVar.r);
            v vVar2 = v.this;
            vVar2.r = null;
            vVar2.s.setVisibility(8);
            v.this.t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.s.addView(view);
            v vVar = v.this;
            vVar.r = view;
            vVar.t = customViewCallback;
            vVar.s.setVisibility(0);
        }
    }

    static class p {
        C0425q8.e a;
        String b;

        public p(C0425q8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        String a() {
            return this.b;
        }

        C0425q8.e b() {
            return this.a;
        }
    }

    private class q extends WebViewClient {
        private q() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextP = v.this.p();
            contextP.startActivity(new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(contextP));
            return true;
        }
    }

    private interface s {
        void a(String str, C0425q8.e eVar, X4 x4);
    }

    static class t {
        String a;
        String b;

        t() {
        }
    }

    public enum u {
        Display,
        Gone
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    private class C0072v extends WebViewClient {
        private C0072v() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(C0198d4.f) && (cVar = v.this.Q) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.v();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e) {
                C0421q4.d().a(e);
                zContains = false;
            }
            if (zContains) {
                String str2 = "file://" + v.this.A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e2) {
                    C0421q4.d().a(e2);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public v(Context context, Y4 y4, C0249g4 c0249g4, com.ironsource.sdk.controller.c cVar, T7 t7, int i2, C0284i5 c0284i5, String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, String str2, String str3) throws Throwable {
        Z9 z9 = new Z9(context, new InterfaceC0325ka.a());
        this.Z = z9;
        Logger.i(this.c, "C'tor");
        this.Y = c0249g4;
        this.Q = cVar;
        this.a = t7;
        this.G = y4;
        a(context, z9);
        this.A = str;
        this.D = new Z0();
        this.S = new JSONObject();
        this.h = c0284i5;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C0198d4.a.i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new C0370n4(new C0319k4(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new Sc(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.c((C0577z8) obj);
                }
            }, c0284i5, new InterfaceC0454s4.a());
        } else {
            c0284i5.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), c0284i5);
        }
        o oVar = new o();
        this.q = oVar;
        z9.setWebViewClient(new C0072v());
        z9.setWebChromeClient(oVar);
        Bg.a(z9);
        a(z9);
        z9.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        this.b = InterfaceC0302j4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    private void G() {
    }

    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), C0198d4.d);
        webView.addJavascriptInterface(b(sVar), C0198d4.e);
    }

    private X3 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        boolean z2 = true;
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            X4 x4A = this.G.a(g(str), str2);
            if (x4A != null) {
                mapG = x4A.g();
                mapG.put("demandSourceName", x4A.f());
                mapG.put("demandSourceId", x4A.h());
            }
            try {
                jSONObject.put(C0198d4.i.m, str);
            } catch (JSONException e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C0421q4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.f), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                C0421q4.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.g), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                C0421q4.d().a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
            z2 = z;
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    C0421q4.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.Z.a(new com.ironsource.sdk.controller.m.b(str, q()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Gc gc = this.a0;
        if (gc != null) {
            gc.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C0425q8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C0425q8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C0425q8.e.Banner.toString()) || this.z == null : this.x == null) : this.y != null) {
            z = true;
        }
        if (!z) {
            Logger.d(this.c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    public void A() {
        i(f(C0198d4.h.A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            Logger.i(this.c, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C0198d4.c.z;
        }
        i(e(C0198d4.h.a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(C0198d4.h.t));
    }

    public void g(String str, String str2) {
        i(e(C0198d4.h.W, a(C0198d4.i.p, str2, C0198d4.i.m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C0425q8.c h() {
        return C0425q8.c.Web;
    }

    public void j(String str) {
        i(e(C0198d4.f.j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(C0198d4.h.w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public Ag o() {
        if (this.P == null) {
            this.P = new g();
        }
        return this.P;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.c, str + " " + str4);
    }

    public Context p() {
        return this.Y.a();
    }

    public int q() {
        return c0;
    }

    public String s() {
        return this.w;
    }

    public Z0 t() {
        return this.D;
    }

    public u u() {
        return this.v;
    }

    public void v() {
        if (this.j == null) {
            return;
        }
        n();
        C0425q8.e eVarB = this.j.b();
        String strA = this.j.a();
        if (r(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void w() {
        this.q.onHideCustomView();
    }

    public boolean x() {
        return this.r != null;
    }

    public void y() {
        i(f(C0198d4.f.h));
    }

    public void z() {
        i(f(C0198d4.h.Z));
    }

    class f extends X3 {
        f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC0491u7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC0491u7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC0491u7
        public void a() {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n("none");
            }
        }
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.Z.getSettings().setCacheMode(2);
        } else {
            this.Z.getSettings().setCacheMode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        Td td = new Td(str);
        String strD = td.d(C0198d4.i.S);
        String strD2 = td.d("adViewId");
        int color = !C0198d4.i.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C0374n8.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.W) {
            this.V.b();
            return;
        }
        this.B.a(new C0458s8());
        if (this.B.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                i(e(C0198d4.h.p, a(C0198d4.i.b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C0421q4.d().a(exc);
                b(str3, str2, exc.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str;
        }
    }

    public boolean h(String str) {
        try {
            if (!new C0532we(str, X9.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            Wf.a(p(), str);
            return true;
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public class r {

        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVShowFail(message:" + this.a + ")");
                v.this.x.b(this.b, str);
            }
        }

        class b implements Runnable {
            final /* synthetic */ String a;

            b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onInterstitialInitSuccess()");
                v.this.y.a(C0425q8.e.Interstitial, this.a, (Y0) null);
            }
        }

        class c implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onInterstitialInitFail(message:" + str + ")");
                v.this.y.a(C0425q8.e.Interstitial, this.b, str);
            }
        }

        class d implements Runnable {
            final /* synthetic */ InterfaceC0488u4 a;
            final /* synthetic */ C0425q8.e b;
            final /* synthetic */ String c;

            d(InterfaceC0488u4 interfaceC0488u4, C0425q8.e eVar, String str) {
                this.a = interfaceC0488u4;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(this.b, this.c);
            }
        }

        class e implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ JSONObject b;

            e(String str, JSONObject jSONObject) {
                this.a = str;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.y.a(this.a, this.b);
            }
        }

        class f implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            f(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.y.a(this.b, str);
            }
        }

        class g implements Runnable {
            final /* synthetic */ String a;

            g(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerInitSuccess()");
                v.this.z.a(C0425q8.e.Banner, this.a, (Y0) null);
            }
        }

        class h implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onBannerInitFail(message:" + str + ")");
                v.this.z.a(C0425q8.e.Banner, this.b, str);
            }
        }

        class i implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ C0270h8 b;

            i(String str, C0270h8 c0270h8) {
                this.a = str;
                this.b = c0270h8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerLoadSuccess()");
                v.this.z.a(this.a, this.b);
            }
        }

        class j implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            j(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onLoadBannerFail()");
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.z.c(this.b, str);
            }
        }

        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        class l implements Runnable {
            final /* synthetic */ String a;

            l(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.a).has(com.ironsource.sdk.controller.f.b.b)) {
                        v.this.T.a(com.ironsource.sdk.controller.f.a.a(this.a));
                    } else {
                        v.this.U.a(Cb.a(this.a));
                    }
                } catch (JSONException e) {
                    C0421q4.d().a(e);
                    Logger.e(v.this.c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        class m implements Runnable {
            final /* synthetic */ C0425q8.e a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ JSONObject d;

            m(C0425q8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0488u4 interfaceC0488u4A;
                C0425q8.e eVar = this.a;
                if ((eVar == C0425q8.e.Interstitial || eVar == C0425q8.e.RewardedVideo || eVar == C0425q8.e.Banner) && (interfaceC0488u4A = v.this.a(eVar)) != null) {
                    interfaceC0488u4A.a(this.a, this.b, this.c, this.d);
                }
            }
        }

        class n implements Runnable {
            final /* synthetic */ String a;

            n(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.c, "omidAPI(" + this.a + ")");
                    v.this.H.a(new Td(this.a).toString(), r.this.new w());
                } catch (Exception e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(C0198d4.e);
            }
        }

        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        class RunnableC0070r implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ Y0 c;

            RunnableC0070r(int i, String str, Y0 y0) {
                this.a = i;
                this.b = str;
                this.c = y0;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a <= 0) {
                    v.this.x.c(this.b);
                } else {
                    Log.d(v.this.c, "onRVInitSuccess()");
                    v.this.x.a(C0425q8.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        class s implements Runnable {
            final /* synthetic */ String a;

            s(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(new JSONObject(this.a), r.this.new w());
                } catch (Exception e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        class t implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;

            t(String str, String str2, int i) {
                this.a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a.equalsIgnoreCase(C0425q8.e.RewardedVideo.toString())) {
                    v.this.x.a(this.b, this.c);
                }
            }
        }

        class u implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ int b;

            u(String str, int i) {
                this.a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.y.onInterstitialAdRewarded(this.a, this.b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        class RunnableC0071v implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            RunnableC0071v(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVInitFail(message:" + str + ")");
                v.this.x.a(C0425q8.e.RewardedVideo, this.b, str);
            }
        }

        public r() {
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.B.f());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                Logger.d(v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(C0198d4.a.h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                C0543x8.a(Sd.p, new C0458s8().a(F5.A, e2.getMessage()).a());
                Logger.d(v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.c, "adClicked(" + str + ")");
            Td td = new Td(str);
            String strD = td.d(C0198d4.i.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C0425q8.e eVarG = v.this.g(strD);
            InterfaceC0488u4 interfaceC0488u4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC0488u4A == null) {
                return;
            }
            v.this.b(new d(interfaceC0488u4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.d, "adCredited(" + str + ")");
            Td td = new Td(str);
            String strD = td.d(C0198d4.i.k);
            int i2 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            String strD2 = td.d(C0198d4.i.m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.d, "adCredited | product type is missing");
            }
            if (C0425q8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i2);
            } else if (v.this.r(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i2));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Td(str));
            Y0 y0 = new Y0(str);
            if (!y0.g()) {
                v.this.a(str, false, C0198d4.c.r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = y0.d();
            if (C0425q8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.r(strD)) {
                v.this.b(new RunnableC0070r(Integer.parseInt(y0.c()), strFetchDemandSourceId, y0));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.c, "adViewAPI(" + str + ")");
                v.this.L.a(new Td(str).toString(), new w());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            T7.a.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C0425q8.e eVarG;
            try {
                Logger.i(v.this.c, "cleanAdInstance(" + str + ")");
                Td td = new Td(str);
                String strD = td.d(C0198d4.i.m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = X9.e().a();
                Td td = new Td(str);
                if (!arrayListA.isEmpty()) {
                    td.b(C0198d4.i.x0, arrayListA.toString());
                }
                v.this.a(td.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        void d(String str) {
            v.this.i(v.this.a(C0198d4.h.e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.c, "deleteFile(" + str + ")");
                Td td = new Td(str);
                String strD = td.d(C0198d4.i.b);
                String strD2 = td.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C0577z8 c0577z8 = new C0577z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c0577z8, v.this.A);
                    if (!c0577z8.exists()) {
                        v.this.a(str, false, C0198d4.c.f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c0577z8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, C0198d4.c.g, "1");
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.c, "deleteFolder(" + str + ")");
                String strD = new Td(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, C0198d4.c.g, "1");
                    return;
                }
                C0577z8 c0577z8 = new C0577z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD));
                IronSourceStorageUtils.ensurePathSafety(c0577z8, v.this.A);
                if (!c0577z8.exists()) {
                    v.this.a(str, false, C0198d4.c.e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c0577z8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.c, "destroyInlineStore() called");
            try {
                com.unity3d.ironsourceads.internal.services.a.AbstractC0088a abstractC0088aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), EnumC0288i9.b.a(new Td(str).a(C0198d4.f.e, EnumC0288i9.APP_ACTIVITY.b())));
                if (abstractC0088aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a) abstractC0088aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new Td(str).toString(), new w());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            Td td = new Td(str);
            boolean zBooleanValue = ((Boolean) td.b("display")).booleanValue();
            String strD = td.d(C0198d4.i.m);
            boolean zC = td.c(C0198d4.i.u);
            String strD2 = td.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            boolean zC2 = td.c(C0198d4.i.z0);
            if (!zBooleanValue) {
                v.this.a(u.Gone);
                v.this.n();
                return;
            }
            v.this.F = td.c(C0198d4.i.v);
            boolean zC3 = td.c(C0198d4.i.y);
            u uVarU = v.this.u();
            u uVar = u.Display;
            if (uVarU == uVar) {
                Logger.i(v.this.c, "State: " + v.this.v);
                return;
            }
            v.this.a(uVar);
            Logger.i(v.this.c, "State: " + v.this.v);
            Context contextP = v.this.p();
            String strS = v.this.s();
            int iK = v.this.X.K(contextP);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextP);
                hVar.addView(v.this.u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextP, (Class<?>) InterstitialActivity.class) : new Intent(contextP, (Class<?>) ControllerActivity.class);
            C0425q8.e eVar = C0425q8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strS)) {
                    strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                }
                intent.putExtra(C0198d4.i.m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.x.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C0425q8.e eVar2 = C0425q8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strS)) {
                        strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                    }
                    intent.putExtra(C0198d4.i.m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(C0198d4.i.z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(C0198d4.i.v, v.this.F);
            intent.putExtra(C0198d4.i.A, strS);
            intent.putExtra(C0198d4.i.B, iK);
            v vVar = v.this;
            vVar.j = new p(vVar.g(strD), strFetchDemandSourceId);
            contextP.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new Td(str).toString(), new w());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.c, "fileSystemAPI(" + str + ")");
            v.this.a(new s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005e  */
        @JavascriptInterface
        public void getApplicationInfo(String str) {
            Logger.i(v.this.c, "getApplicationInfo(" + str + ")");
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            Td td = new Td(str);
            Object[] objArrF = v.this.f(td.d(C0198d4.i.m), SDKUtils.fetchDemandSourceId(td));
            String str2 = (String) objArrF[0];
            if (((Boolean) objArrF[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, C0198d4.h.n, C0198d4.h.o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            Logger.i(v.this.c, "getCachedFilesMap(" + str + ")");
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            Td td = new Td(str);
            if (!td.a("path")) {
                v.this.a(str, false, C0198d4.c.s, (String) null);
                return;
            }
            String str2 = (String) td.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.A, str2)) {
                v.this.a(str, false, C0198d4.c.t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str2), C0198d4.h.s, C0198d4.h.r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.c, "getConnectivityInfo(" + str + ")");
            Td td = new Td(str);
            String strD = td.d(v.g0);
            String strD2 = td.d(v.h0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            X3 x3 = vVar.R;
            if (x3 != null) {
                jSONObject = x3.a(vVar.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", C0198d4.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.c, "getControllerConfig(" + str + ")");
            String strD = new Td(str).d(v.g0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strD;
            Logger.i(v.this.c, "getMediationState(" + str + ")");
            Td td = new Td(str);
            String strD2 = td.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            String strD3 = td.d(C0198d4.i.m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C0425q8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    X4 x4A = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0198d4.i.m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (x4A == null || x4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", x4A.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0055  */
        @JavascriptInterface
        public void getDeviceStatus(String str) {
            Logger.i(v.this.c, "getDeviceStatus(" + str + ")");
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            v vVar = v.this;
            Object[] objArrD = vVar.d(vVar.Z.getContext());
            String str2 = (String) objArrD[0];
            if (((Boolean) objArrD[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, C0198d4.h.l, C0198d4.h.m));
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float fA = C0164b5.b(context).a(context);
                Td td = new Td(str);
                td.b(C0198d4.j.P, String.valueOf(fA));
                v.this.a(td.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.c, "getInitSummery(" + str + ")");
            Td td = new Td(str);
            td.a(C0198d4.j.s0, v.this.S);
            v.this.a(td.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C0543x8.a(Sd.z, new C0458s8().a(F5.y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, C0198d4.h.X, C0198d4.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.c, "getUserData(" + str + ")");
            Td td = new Td(str);
            if (!td.a(C0198d4.i.W)) {
                v.this.a(str, false, C0198d4.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = td.d(C0198d4.i.W);
            v.this.i(v.this.e(strE, v.this.a(strD, X9.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.c, "iabTokenAPI(" + str + ")");
                v.this.J.a(new Td(str).toString(), new w());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.c, "initController(" + str + ")");
            Td td = new Td(str);
            CountDownTimer countDownTimer = v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.m = null;
            }
            if (td.a(C0198d4.i.q)) {
                String strD = td.d(C0198d4.i.q);
                if (C0198d4.i.s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.i = true;
                    vVar.Q.d();
                } else if (C0198d4.i.r.equalsIgnoreCase(strD)) {
                    v.this.Q.c();
                } else if (!C0198d4.i.t.equalsIgnoreCase(strD)) {
                    Logger.i(v.this.c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.Q.c("controller js failed to initialize : " + td.d("errMsg"));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.c, "onAdWindowsClosed(" + str + ")");
            v.this.D.a();
            v.this.D.f(null);
            v.this.j = null;
            Td td = new Td(str);
            String strD = td.d(C0198d4.i.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            C0425q8.e eVarG = v.this.g(strD);
            Log.d(v.this.d, "onAdClosed() with type " + eVarG);
            if (v.this.r(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.c, "onInitBannerFail(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            Y4 y4 = v.this.G;
            C0425q8.e eVar = C0425q8.e.Banner;
            X4 x4A = y4.a(eVar, strFetchDemandSourceId);
            if (x4A != null) {
                x4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Td(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C0425q8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.c, "onInitInterstitialFail(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            Y4 y4 = v.this.G;
            C0425q8.e eVar = C0425q8.e.Interstitial;
            X4 x4A = y4.a(eVar, strFetchDemandSourceId);
            if (x4A != null) {
                x4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Td(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C0425q8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onInitRewardedVideoFail(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            Y4 y4 = v.this.G;
            C0425q8.e eVar = C0425q8.e.RewardedVideo;
            X4 x4A = y4.a(eVar, strFetchDemandSourceId);
            if (x4A != null) {
                x4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0071v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.c, "onLoadBannerFail()");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.r(C0425q8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.c, "onLoadBannerSuccess()");
            Td td = new Td(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            String strD = td.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            H8 h8A = C0374n8.a().a(strD);
            if (h8A == null) {
                v.this.z.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
            } else if (h8A instanceof C0270h8) {
                C0270h8 c0270h8 = (C0270h8) h8A;
                if (v.this.r(C0425q8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c0270h8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.c, "onLoadInterstitialFail(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.r(C0425q8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            Td td = new Td(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            JSONObject jSONObjectA = td.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C0425q8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.c, "onReceivedMessage(" + str + ")");
            T7.a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.c, "onShowInterstitialFail(" + str + ")");
            Td td = new Td(str);
            final String strD = td.d("errMsg");
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zR = v.this.r(C0425q8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(zR, strD, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Td(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            Z0 z0 = v.this.D;
            C0425q8.e eVar = C0425q8.e.Interstitial;
            z0.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            final boolean zR = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(zR, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoFail(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
            if (v.this.r(C0425q8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.c, "onVideoStatusChanged(" + str + ")");
            Td td = new Td(str);
            String strD = td.d(C0198d4.i.m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = td.d("status");
            if (C0198d4.i.d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if (C0198d4.i.e0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if (C0198d4.i.f0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (C0198d4.i.g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
            } else if (C0198d4.i.h0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
            } else {
                Logger.i(v.this.c, "onVideoStatusChanged: unknown status: " + strD2);
            }
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.c, "openInlineStore(" + str + ")");
                Td td = new Td(str);
                com.unity3d.ironsourceads.internal.services.a.AbstractC0088a abstractC0088aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), new C0254g9(td.d("url"), td.d(C0198d4.f.c), EnumC0288i9.b.a(td.a(C0198d4.f.e, EnumC0288i9.APP_ACTIVITY.b())), (!td.a(C0198d4.f.d) || td.e(C0198d4.f.d)) ? null : (JSONObject) td.b(C0198d4.f.d)));
                if (abstractC0088aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a) abstractC0088aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.c, "openUrl(" + str + ")");
                Td td = new Td(str);
                com.ironsource.sdk.controller.p.c cVarA = new com.ironsource.sdk.controller.p.a(td.d("method"), new Ic(v.this.F, 805306368)).a(td.c(C0198d4.i.L0) ? v.this.Z.getContext() : v.this.p(), new Hc(td.d("url"), td.d(C0198d4.i.V)));
                if (cVarA instanceof com.ironsource.sdk.controller.p.c.a) {
                    v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.c, "permissionsAPI(" + str + ")");
                v.this.I.a(new Td(str).toString(), new w());
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.i(v.this.c, "postAdEventNotification(" + str + ")");
                Td td = new Td(str);
                String strD = td.d(C0198d4.i.j0);
                try {
                    if (TextUtils.isEmpty(strD)) {
                        v.this.a(str, false, C0198d4.c.w, (String) null);
                        return;
                    }
                    String strD2 = td.d(C0198d4.i.k0);
                    String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(td);
                    String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                    JSONObject jSONObject = (JSONObject) td.b(C0198d4.i.l0);
                    String strD3 = td.d(C0198d4.i.m);
                    C0425q8.e eVarG = v.this.g(strD3);
                    try {
                        if (!v.this.r(strD3)) {
                            v.this.a(str, false, C0198d4.c.v, (String) null);
                            return;
                        }
                        String strE = v.this.e(str);
                        if (TextUtils.isEmpty(strE)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            v.this.i(v.this.a(strE, v.this.a(C0198d4.i.m, strD3, C0198d4.i.j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), C0198d4.h.c0, C0198d4.h.d0));
                        }
                        try {
                            v.this.b(new m(eVarG, str2, strD, jSONObject));
                            return;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                }
            } catch (Exception e5) {
                e = e5;
            }
            exc = e;
            C0421q4.d().a(exc);
            IronLog.INTERNAL.error(exc.toString());
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = v.this.l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.c, "saveFile(" + str + ")");
                Td td = new Td(str);
                String strD = td.d("path");
                String strD2 = td.d(C0198d4.i.b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, C0198d4.c.g, "1");
                    return;
                }
                C0577z8 c0577z8 = new C0577z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c0577z8, v.this.A);
                v vVar = v.this;
                if (vVar.X.a(vVar.A) <= 0) {
                    v.this.a(str, false, C0232f4.A, (String) null);
                    return;
                }
                if (c0577z8.exists()) {
                    v.this.a(str, false, C0232f4.z, (String) null);
                    return;
                }
                if (!Z3.h(v.this.Z.getContext())) {
                    v.this.a(str, false, C0232f4.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.h.a(c0577z8, strD2, td.a("connectionTimeout", 0), td.a("readTimeout", 0));
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.c, "setBackButtonState(" + str + ")");
            X9.e().c(new Td(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.c, "setForceClose(" + str + ")");
            Td td = new Td(str);
            String strD = td.d("width");
            String strD2 = td.d("height");
            v.this.n = Integer.parseInt(strD);
            v.this.o = Integer.parseInt(strD2);
            v.this.p = td.d(C0198d4.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.c, "setOrientation(" + str + ")");
                String strD = new Td(str).d("orientation");
                v.this.o(strD);
                v vVar = v.this;
                if (vVar.a0 != null) {
                    v.this.a0.onOrientationChanged(strD, vVar.X.K(vVar.Z.getContext()));
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.c, "setStoreSearchKeys(" + str + ")");
            X9.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.c, "setUserData(" + str + ")");
            Td td = new Td(str);
            if (!td.a(C0198d4.i.W)) {
                v.this.a(str, false, C0198d4.c.F, (String) null);
                return;
            }
            if (!td.a("value")) {
                v.this.a(str, false, C0198d4.c.G, (String) null);
                return;
            }
            String strD = td.d(C0198d4.i.W);
            String strD2 = td.d("value");
            X9.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.c, "setWebviewBackgroundColor(" + str + ")");
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.c, "stillAlive(" + str + ")");
            v.this.b.a();
        }

        public class w implements InterfaceC0255ga {
            public w() {
            }

            @Override // com.ironsource.InterfaceC0255ga
            public void a(boolean z, String str, String str2) {
                Td td = new Td();
                td.b(z ? v.g0 : v.h0, str);
                td.b("data", str2);
                v.this.a(td.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC0255ga
            public void a(boolean z, String str, Td td) {
                td.b(z ? v.g0 : v.h0, str);
                v.this.a(td.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC0255ga
            public void a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z) {
                        str2 = v.g0;
                    } else {
                        str2 = v.h0;
                    }
                    jSONObject.put(str2, str);
                    v.this.a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C0421q4.d().a(e2);
                    Logger.d(v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        void c(String str) {
            v.this.i(v.this.a(C0198d4.h.d, str, (String) null, (String) null));
        }

        boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(Y1.f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return (jSONObject.getString("testerABGroup").isEmpty() || jSONObject.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (JSONException e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                InterfaceC0468t1 interfaceC0468t1A = InterfaceC0468t1.a(str);
                v vVar = v.this;
                C0434r1.a aVarA = vVar.N.a(vVar.Z.getContext(), interfaceC0468t1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i2) {
            X4 x4A;
            v vVar = v.this;
            C0425q8.e eVar = C0425q8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (x4A = v.this.G.a(eVar, str)) != null && x4A.k()) {
                v.this.b(new u(str, i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str) {
            if (z) {
                v.this.y.c(C0425q8.e.Interstitial, str);
                v.this.y.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z) {
            X4 x4A = v.this.G.a(C0425q8.e.Interstitial, str);
            if (x4A != null) {
                x4A.a(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str, String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.y.d(str2, str);
            }
            a(str2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new Td(str).d(g0);
    }

    public void n(String str) {
        try {
            String strD = C0145a4.d(this.Z.getContext());
            Logger.i(this.c, "device status changed, connection type " + str);
            C0509v8.a(str);
            C0509v8.b(strD);
            try {
                i(e(C0198d4.h.x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C0421q4.d().a(exc);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(C0198d4.h.y, a(C0198d4.j.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    public void b(int i2) {
        c0 = i2;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        a(x4, map);
    }

    public void o(String str) {
        this.w = str;
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new r()), sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4) {
        Map<String, String> mapB = x4.b();
        if (mapB != null) {
            i(e(C0198d4.h.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(C0425q8.e.Interstitial, x4.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0425q8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0425q8.e eVar = C0425q8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C0425q8.e eVar2 = C0425q8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C0425q8.e eVar3 = C0425q8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public FrameLayout r() {
        return this.u;
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    private String d(JSONObject jSONObject) {
        C0164b5 c0164b5B = C0164b5.b(this.Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=").append(sDKVersion).append(C0198d4.j.c);
        }
        String strE = c0164b5B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb.append("deviceOs=").append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + ":";
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol=").append(str);
            sb.append("&domain=").append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C0198d4.j.Z, C0198d4.j.g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(C0198d4.j.c).append("controllerConfig").append(C0198d4.j.b).append(string);
                    }
                } catch (JSONException e2) {
                    C0421q4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
            sb.append("&debug=").append(q());
        }
        return sb.toString();
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), Rc.e(this.Z.getContext()));
        jSONObject.put(SDKUtils.encodeString(C0198d4.j.p0), SDKUtils.encodeString(Rc.b(this.Z.getContext())));
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(o());
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(C0198d4.h.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    public void a(C0434r1 c0434r1) {
        this.N = c0434r1;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(C0198d4.h.u));
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.u = new FrameLayout(context);
        this.s = new FrameLayout(context);
        this.s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.u.addView(this.s, layoutParams);
        this.u.addView(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            X3 x3 = this.R;
            if (x3 == null) {
                return;
            }
            x3.b(context);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(C0198d4.h.q, a(C0198d4.i.b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                C0421q4.d().a(e);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(C0577z8 c0577z8) {
        this.h.a(this);
        if (c0577z8 != null && c0577z8.exists()) {
            a(c0577z8);
            return null;
        }
        a(new C0577z8(C0198d4.f), new C0441r8(1, "Unable to download Html file"));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    public void c(String str) {
        if (str.equals(C0198d4.i.i)) {
            n();
        }
        i(e(C0198d4.h.z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    private String c(String str, String str2, String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    public void b(boolean z, String str) {
        i(e(C0198d4.h.V, a(C0198d4.i.K, str, null, null, null, null, null, null, C0198d4.i.o, z)));
    }

    void c(Runnable runnable) {
        T7 t7 = this.a;
        if (t7 != null) {
            t7.d(runnable);
        }
    }

    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public void a(A4 a4) {
        this.O = a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0488u4 a(C0425q8.e eVar) {
        if (eVar == C0425q8.e.Interstitial) {
            return this.y;
        }
        if (eVar == C0425q8.e.RewardedVideo) {
            return this.x;
        }
        if (eVar == C0425q8.e.Banner) {
            return this.z;
        }
        return null;
    }

    public void a(dg dgVar) {
        this.C = dgVar;
    }

    public void a(int i2) {
        String string;
        if (!this.W && !this.B.m()) {
            Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        if (this.W) {
            string = this.V.c().toURI().toString();
        } else {
            string = this.B.g().toURI().toString();
        }
        this.a.d(new h(controllerConfigAsJSONObject, this.Z, string + "?" + strD));
        this.m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i2).start();
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    void b(Runnable runnable) {
        T7 t7 = this.a;
        if (t7 != null) {
            t7.c(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new Td(str).d(h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        C0164b5 c0164b5B = C0164b5.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        try {
            jSONObject.put(C0198d4.j.z, "none");
            jSONObject.put(C0198d4.j.A, SDKUtils.translateDeviceOrientation(this.X.z(context)));
            String strD = c0164b5B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c0164b5B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            } else {
                z = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.c, "add LAT");
                jSONObject.put(C0198d4.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            String strE = c0164b5B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.m), SDKUtils.encodeString(strE));
            } else {
                z = true;
            }
            String strF = c0164b5B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.n), strF.replaceAll("[^0-9/.]", ""));
            } else {
                z = true;
            }
            String strF2 = c0164b5B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.o), SDKUtils.encodeString(strF2));
            }
            String strValueOf = String.valueOf(c0164b5B.a());
            if (strValueOf != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.p), strValueOf);
            } else {
                z = true;
            }
            jSONObject.put(P6.i0, String.valueOf(C0298j0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.q), SDKUtils.encodeString(sDKVersion));
            }
            if (c0164b5B.b() != null && c0164b5B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.r), SDKUtils.encodeString(c0164b5B.b()));
            }
            String strB = C0145a4.b(context);
            if (strB.equals("none")) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            String strD2 = C0145a4.d(context);
            if (strD2 != null) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
            } else {
                z = true;
            }
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.v), C0145a4.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(C0198d4.j.y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
            String strValueOf2 = String.valueOf(this.X.o());
            if (TextUtils.isEmpty(strValueOf2)) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(SDKUtils.encodeString(C0198d4.j.G)).append(C0198d4.j.d).append(SDKUtils.encodeString("width")).append(C0198d4.j.e);
                jSONObject.put(sb.toString(), SDKUtils.encodeString(strValueOf2));
            }
            String strValueOf3 = String.valueOf(this.X.b());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SDKUtils.encodeString(C0198d4.j.G)).append(C0198d4.j.d).append(SDKUtils.encodeString("height")).append(C0198d4.j.e);
            jSONObject.put(sb2.toString(), SDKUtils.encodeString(strValueOf3));
            String strG = C1.g(this.Z.getContext());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf4 = String.valueOf(this.X.r());
            if (!TextUtils.isEmpty(strValueOf4)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.K), SDKUtils.encodeString(strValueOf4));
            }
            String strValueOf5 = String.valueOf(this.X.p());
            if (!TextUtils.isEmpty(strValueOf5)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.O), SDKUtils.encodeString(strValueOf5));
            }
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.P), C0164b5.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.Y), this.X.k(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), Z3.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), Z3.c(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.S), Z3.f(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.R), SDKUtils.encodeString(Z3.g(context)));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.W), SDKUtils.encodeString(C1.b(context)));
            String strE2 = C1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.c0), SDKUtils.encodeString(strE2));
            }
            c(jSONObject);
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.q0), this.X.t(context));
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            X3 x3 = this.R;
            if (x3 == null) {
                return;
            }
            x3.c(context);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private String f(String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private void a(String str, C0425q8.e eVar, X4 x4, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, x4);
        } else {
            i(a(eVar, x4).b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0539x4 interfaceC0539x4) {
        this.f = str;
        this.g = str2;
        this.x = interfaceC0539x4;
        this.D.i(str);
        this.D.j(str2);
        a(str, C0425q8.e.RewardedVideo, x4, new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0522w4 interfaceC0522w4) {
        this.f = str;
        this.g = str2;
        this.y = interfaceC0522w4;
        this.D.g(str);
        this.D.h(this.g);
        a(this.f, C0425q8.e.Interstitial, x4, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0522w4 interfaceC0522w4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(C0198d4.h.E, strFlatMapToJsonAsString, C0198d4.h.F, C0198d4.h.G));
    }

    private void a(X4 x4, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, x4.b()});
        if (map.containsKey("adm")) {
            this.b.a(new InterfaceC0302j4.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
                @Override // com.ironsource.InterfaceC0302j4.d
                public final void a(InterfaceC0201d7 interfaceC0201d7) {
                    this.f$0.a(interfaceC0201d7);
                }
            });
        }
        this.D.d(x4.h(), true);
        i(a(C0198d4.h.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C0198d4.h.F, C0198d4.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0201d7 interfaceC0201d7) {
        interfaceC0201d7.a(new InterfaceC0218e7() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC0218e7
            public final void a(InterfaceC0148a7 interfaceC0148a7) {
                this.f$0.a(interfaceC0148a7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0148a7 interfaceC0148a7) {
        try {
            this.Q.a(interfaceC0148a7);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0522w4 interfaceC0522w4) {
        i(a(C0425q8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        i(a(C0425q8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, x4.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        X4 x4A = this.G.a(C0425q8.e.Interstitial, str);
        return x4A != null && x4A.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0505v4 interfaceC0505v4) {
        this.f = str;
        this.g = str2;
        this.z = interfaceC0505v4;
        a(str, C0425q8.e.Banner, x4, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0505v4 interfaceC0505v4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, x4.b()});
        if (map != null) {
            i(a(C0198d4.h.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C0198d4.h.O, C0198d4.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4) {
        Map<String, String> mapB = x4.b();
        if (mapB != null) {
            i(a(C0198d4.h.S, SDKUtils.flatMapToJsonAsString(mapB), C0198d4.h.P, C0198d4.h.Q));
        }
        this.G.b(C0425q8.e.Banner, x4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0505v4 interfaceC0505v4) {
        i(a(C0198d4.h.N, jSONObject.toString(), C0198d4.h.O, C0198d4.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), C0198d4.h.U, C0198d4.h.U));
    }

    private t a(C0425q8.e eVar, X4 x4) {
        t tVar = new t();
        if (eVar != C0425q8.e.RewardedVideo && eVar != C0425q8.e.Interstitial && eVar != C0425q8.e.Banner) {
            return tVar;
        }
        HashMap map = new HashMap();
        map.put(C0198d4.j.g, this.f);
        if (!TextUtils.isEmpty(this.g)) {
            map.put(C0198d4.j.f, this.g);
        }
        if (x4 != null) {
            if (x4.g() != null) {
                map.putAll(x4.g());
                map.put(C0198d4.i.y0, String.valueOf(L.a.c(x4.h())));
            }
            map.put("demandSourceName", x4.f());
            map.put("demandSourceId", x4.h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C0198d4.h hVarA = C0198d4.h.a(eVar);
        String strA = a(hVarA.a, strFlatMapToJsonAsString, hVarA.b, hVarA.c);
        tVar.a = hVarA.a;
        tVar.b = strA;
        return tVar;
    }

    private String a(C0425q8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        X4 x4A = this.G.a(eVar, strFetchDemandSourceId);
        if (x4A != null) {
            if (x4A.g() != null) {
                map.putAll(x4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C0198d4.h hVarB = C0198d4.h.b(eVar);
        return a(hVarB.a, strFlatMapToJsonAsString, hVarB.b, hVarB.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C0425q8.e eVar, X4 x4) {
        if (r(eVar.toString())) {
            b(new m(eVar, x4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0539x4 interfaceC0539x4) {
        i(a(C0425q8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    public void a(boolean z, String str) {
        i(e(C0198d4.h.V, a(C0198d4.i.M0, str, null, null, null, null, null, null, C0198d4.i.o, z)));
    }

    public void a(int i2, boolean z) {
        i(e(C0198d4.f.i, a(C0198d4.f.f, String.valueOf(i2), null, null, null, null, null, null, C0198d4.f.g, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, String str2, String str3) {
        String strD = new Td(str).d(z ? g0 : h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, C0198d4.i.g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C0421q4.d().a(e2);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 c0577z8) {
        if (this.W && this.V.a(c0577z8)) {
            a(1);
        } else if (c0577z8.getName().contains(C0198d4.f)) {
            this.B.a(new n());
        } else {
            c(c0577z8.getName(), c0577z8.getParent());
        }
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 c0577z8, C0441r8 c0441r8) {
        if (this.W && this.V.a(c0577z8)) {
            this.Q.c("controller html - failed to download - " + c0441r8.b());
        } else if (c0577z8.getName().contains(C0198d4.f)) {
            this.B.a(new a(), new b(c0441r8));
        } else {
            b(c0577z8.getName(), c0577z8.getParent(), c0441r8.b());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    public void a(Gc gc) {
        this.a0 = gc;
        this.Z.a(gc);
    }

    public void a(u uVar) {
        this.v = uVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        this.Z.destroy();
        C0284i5 c0284i5 = this.h;
        if (c0284i5 != null) {
            c0284i5.d();
        }
        X3 x3 = this.R;
        if (x3 != null) {
            x3.b();
        }
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    void a(C0425q8.e eVar, String str) {
        b(new e(eVar, str));
    }

    public void a(Z0 z0) {
        synchronized (this.E) {
            if (z0.j() && this.i) {
                Log.d(this.c, "restoreState(state:" + z0 + ")");
                int iC = z0.c();
                if (iC != -1) {
                    C0425q8.e eVar = C0425q8.e.RewardedVideo;
                    if (iC == eVar.ordinal()) {
                        Log.d(this.c, "onRVAdClosed()");
                        String strB = z0.b();
                        InterfaceC0488u4 interfaceC0488u4A = a(eVar);
                        if (interfaceC0488u4A != null && !TextUtils.isEmpty(strB)) {
                            interfaceC0488u4A.b(eVar, strB);
                        }
                    } else {
                        C0425q8.e eVar2 = C0425q8.e.Interstitial;
                        if (iC == eVar2.ordinal()) {
                            Log.d(this.c, "onInterstitialAdClosed()");
                            String strB2 = z0.b();
                            InterfaceC0488u4 interfaceC0488u4A2 = a(eVar2);
                            if (interfaceC0488u4A2 != null && !TextUtils.isEmpty(strB2)) {
                                interfaceC0488u4A2.b(eVar2, strB2);
                            }
                        }
                    }
                    z0.a(-1);
                    z0.f(null);
                } else {
                    Log.d(this.c, "No ad was opened");
                }
                String strD = z0.d();
                String strF = z0.f();
                for (X4 x4 : this.G.a(C0425q8.e.Interstitial)) {
                    if (x4.e() == 2) {
                        Log.d(this.c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + x4.f() + ")");
                        a(strD, strF, x4, this.y);
                    }
                }
                String strG = z0.g();
                String strH = z0.h();
                for (X4 x5 : this.G.a(C0425q8.e.RewardedVideo)) {
                    if (x5.e() == 2) {
                        String strF2 = x5.f();
                        Log.d(this.c, "onRVNoMoreOffers()");
                        this.x.c(strF2);
                        Log.d(this.c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                        a(strG, strH, x5, this.x);
                    }
                }
                z0.a(false);
            }
            this.D = z0;
        }
    }

    void a(Runnable runnable) {
        T7 t7 = this.a;
        if (t7 != null) {
            t7.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }
}
