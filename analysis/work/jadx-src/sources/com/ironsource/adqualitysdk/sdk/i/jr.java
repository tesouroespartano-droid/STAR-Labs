package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class jr implements jn {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<WebView, jr> f2891 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2892;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jq f2893;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<jn> f2894 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static jr m2685(WebView webView, String str) {
        jr jrVar = f2891.get(webView);
        if (jrVar != null) {
            return jrVar;
        }
        jr jrVar2 = new jr(webView, str);
        f2891.put(webView, jrVar2);
        return jrVar2;
    }

    private jr(WebView webView, String str) {
        this.f2892 = str;
        jq jqVar = new jq(webView);
        this.f2893 = jqVar;
        jqVar.m2682(new AnonymousClass4());
        this.f2893.m2681(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2693() {
        this.f2893.m2682(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2687() {
        this.f2893.m2681(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2688(jn jnVar) {
        this.f2894.add(jnVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2691(jn jnVar) {
        this.f2894.remove(jnVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2689() {
        return this.f2893.m2680();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m2690() {
        return this.f2893.m2684();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ay.d m2692() {
        return this.f2893.m2683();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﾇ */
    public final void mo296(WebView webView) {
        for (jn jnVar : new HashSet(this.f2894)) {
            if (jnVar != null) {
                jnVar.mo296(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﾒ */
    public final void mo297(WebView webView, String str, String str2) {
        for (jn jnVar : new HashSet(this.f2894)) {
            if (jnVar != null) {
                jnVar.mo297(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﾒ */
    public final void mo298(WebView webView, String str, boolean z) {
        for (jn jnVar : new HashSet(this.f2894)) {
            if (jnVar != null) {
                jnVar.mo298(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﻐ */
    public final void mo295(WebView webView, String str) {
        for (jn jnVar : new HashSet(this.f2894)) {
            if (jnVar != null) {
                jnVar.mo295(webView, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jr$4, reason: invalid class name */
    final class AnonymousClass4 extends WebViewClient {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f2898 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f2899 = false;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2900 = null;

        AnonymousClass4() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            jr.this.mo296(webView);
            this.f2898 = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            jr.this.mo296(webView);
            this.f2898 = false;
            this.f2899 = true;
            if (this.f2900 == null) {
                this.f2900 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m2694(webView, str)) {
                return true;
            }
            if (this.f2900 == null) {
                this.f2900 = webView.getOriginalUrl();
            }
            jr.this.mo298(webView, str, m2695(webView));
            this.f2899 = true;
            this.f2898 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2695(WebView webView) {
            if (this.f2898 && this.f2899) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2900 == null || webView.getOriginalUrl().equals(this.f2900)) ? false : true;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean m2694(WebView webView, String str) {
            if (!str.startsWith(jr.this.f2892)) {
                return false;
            }
            this.f2900 = webView.getOriginalUrl();
            String strSubstring = str.substring(jr.this.f2892.length());
            jr jrVar = jr.this;
            jrVar.mo297(webView, jrVar.f2892, strSubstring);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jr$2, reason: invalid class name */
    final class AnonymousClass2 extends WebChromeClient {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2896 = false;

        AnonymousClass2() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jr.this.mo295(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i != 100 || this.f2896) {
                return;
            }
            this.f2896 = true;
            jr.this.mo296(webView);
        }
    }
}
