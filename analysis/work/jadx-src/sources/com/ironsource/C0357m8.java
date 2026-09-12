package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0357m8 implements H8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "m8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C0323k8 d;
    private C0236f8 e;
    private Context f;

    /* JADX INFO: renamed from: com.ironsource.m8$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0357m8.this.c != null) {
                C0543x8.a(Sd.q, new C0458s8().a(F5.A, C0357m8.g).a());
            }
            try {
                C0357m8.this.b(this.a);
                C0357m8.this.c.loadUrl(C0357m8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C0357m8.this.a);
                C0357m8.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                C0421q4.d().a(e);
                C0357m8.this.b(this.a, e.getMessage());
                C0543x8.a(Sd.q, new C0458s8().a(F5.A, e.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$b */
    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C0357m8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C0357m8.this.a);
                C0323k8 c0323k8 = C0357m8.this.d;
                if (c0323k8 != null) {
                    c0323k8.a(this.a, jSONObject);
                    C0357m8.this.d.b();
                }
                C0357m8 c0357m8 = C0357m8.this;
                c0357m8.d = null;
                c0357m8.f = null;
            } catch (Exception e) {
                C0421q4.d().a(e);
                Log.e(C0357m8.h, "performCleanup | could not destroy ISNAdView webView ID: " + C0357m8.this.a);
                C0543x8.a(Sd.r, new C0458s8().a(F5.A, e.getMessage()).a());
                C0357m8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$c */
    class c implements H8.a {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.H8.a
        public void a(String str) {
            Logger.i(C0357m8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C0357m8.this.b(this.a, str);
        }

        @Override // com.ironsource.H8.a
        public void b(String str) {
            Logger.i(C0357m8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C0357m8.this.c.getParent()).removeView(C0357m8.this.c);
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C0357m8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$d */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C0357m8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$e */
    private class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C0357m8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }
    }

    public C0357m8(InterfaceC0287i8 interfaceC0287i8, Context context, String str, C0236f8 c0236f8) {
        this.f = context;
        C0323k8 c0323k8 = new C0323k8();
        this.d = c0323k8;
        c0323k8.g(str);
        this.a = str;
        this.d.a(interfaceC0287i8);
        this.e = c0236f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.a;
    }

    public C0323k8 b() {
        return this.d;
    }

    public C0236f8 c() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        T7.a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new C0306j8(this), C0253g8.e);
        this.c.setWebViewClient(new C0340l8(new c(str)));
        this.c.setWebChromeClient(new d());
        Bg.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        T7.a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C0198d4.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C0198d4.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(C0198d4.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, C0198d4.c.C);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            b(str3, C0198d4.c.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return c(str) ? i + this.b + d(str) : str;
    }

    public void b(String str, String str2) {
        C0323k8 c0323k8 = this.d;
        if (c0323k8 != null) {
            c0323k8.a(str, str2);
        }
    }
}
