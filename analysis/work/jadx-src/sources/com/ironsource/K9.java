package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class K9 implements Ud, InterfaceC0539x4, InterfaceC0522w4, InterfaceC0488u4, InterfaceC0505v4, Q9, Cc {
    private static final String m = "IronSourceAdsPublisherAgent";
    private static K9 n;
    private com.ironsource.sdk.controller.e a;
    private String b;
    private String c;
    private Y4 d;
    private C0206dc e;
    private C0249g4 g;
    private boolean f = false;
    private FeaturesManager h = FeaturesManager.getInstance();
    private N8.a i = Ab.O().j();
    private O.a j = Ab.O().E();
    private O k = Ab.U().G();
    private InterfaceC0391o8 l = Ab.U().t();

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;

        a(String str, String str2, X4 x4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, this.b, this.c, (InterfaceC0539x4) k9);
        }
    }

    class b implements Runnable {
        final /* synthetic */ JSONObject a;

        b(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, (InterfaceC0539x4) k9);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;

        c(String str, String str2, X4 x4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, this.b, this.c, (InterfaceC0522w4) k9);
        }
    }

    class d implements Runnable {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, k9);
        }
    }

    class e implements Runnable {
        final /* synthetic */ JSONObject a;

        e(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, (InterfaceC0522w4) k9);
        }
    }

    class f implements Runnable {
        final /* synthetic */ G9 a;
        final /* synthetic */ Map b;

        f(G9 g9, Map map) {
            this.a = g9;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0425q8.e eVar = this.a.i() ? C0425q8.e.Banner : C0425q8.e.Interstitial;
            X4 x4A = K9.this.d.a(eVar, this.a);
            C0458s8 c0458s8 = new C0458s8();
            c0458s8.a(F5.x, Boolean.valueOf(this.a.j())).a(F5.G, Boolean.valueOf(this.a.m())).a(F5.v, this.a.g()).a(F5.w, R9.a(this.a)).a(F5.I, Long.valueOf(L.a.b(this.a.e())));
            C0543x8.a(Sd.h, c0458s8.a());
            if (eVar == C0425q8.e.Banner) {
                K9 k9 = K9.this;
                k9.a.a(k9.b, k9.c, x4A, (InterfaceC0505v4) k9);
                K9 k10 = K9.this;
                k10.a.a(x4A, this.b, (InterfaceC0505v4) k10);
                return;
            }
            K9 k11 = K9.this;
            k11.a.a(k11.b, k11.c, x4A, (InterfaceC0522w4) k11);
            K9 k12 = K9.this;
            k12.a.b(x4A, this.b, k12);
        }
    }

    class g implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;

        g(X4 x4, Map map) {
            this.a = x4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            K9 k9 = K9.this;
            k9.a.a(this.a, this.b, (InterfaceC0522w4) k9);
        }
    }

    class h implements Runnable {
        final /* synthetic */ G9 a;

        h(G9 g9) {
            this.a = g9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0425q8.e eVar = this.a.i() ? C0425q8.e.Banner : C0425q8.e.Interstitial;
            X4 x4A = K9.this.d.a(eVar, this.a);
            C0458s8 c0458s8 = new C0458s8();
            c0458s8.a(F5.x, Boolean.valueOf(this.a.j())).a(F5.v, this.a.g()).a(F5.w, R9.a(this.a)).a("isMultipleAdObjects", Boolean.valueOf(this.a.l()));
            C0543x8.a(Sd.m, c0458s8.a());
            if (eVar == C0425q8.e.Banner) {
                K9.this.a.a(x4A);
            } else {
                x4A.a(false);
                K9.this.a.b(x4A);
            }
        }
    }

    private K9(Context context, int i) {
        c(context);
    }

    public static Q9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized K9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            X9.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C0243ff(SDKUtils.getNetworkConfiguration().optJSONObject(C0198d4.a.k)));
            X9.e().d(SDKUtils.getSDKVersion());
            this.d = new Y4();
            C0249g4 c0249g4 = new C0249g4();
            this.g = c0249g4;
            if (context instanceof Activity) {
                c0249g4.a((Activity) context);
            }
            int debugMode = this.h.getDebugMode();
            this.e = new C0206dc();
            this.a = new com.ironsource.sdk.controller.e(context, this.g, this.d, T7.a, debugMode, this.h.getDataManagerConfig(), this.b, this.c, this.e);
            Logger.enableLogging(debugMode);
            Logger.i(m, "C'tor");
            a(context);
            this.e.d();
            this.e.e();
            this.e.a(context);
            this.e.b();
            this.e.a();
            this.e.b(context);
            this.e.c();
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0522w4
    public void d(String str, String str2) {
        X4 x4D = d(C0425q8.e.Interstitial, str);
        if (x4D != null) {
            G9 g9C = x4D.c();
            this.j.a(EnumC0349m0.SHOW_FAIL, g9C.e());
            if (c(g9C)) {
                this.i.a(new Oe(this.k.a(g9C.e())));
            }
            InterfaceC0581zc interfaceC0581zcB = b(x4D);
            if (interfaceC0581zcB != null) {
                interfaceC0581zcB.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.InterfaceC0522w4
    public void onInterstitialAdRewarded(String str, int i) {
        X4 x4D = d(C0425q8.e.Interstitial, str);
        InterfaceC0581zc interfaceC0581zcB = b(x4D);
        if (x4D == null || interfaceC0581zcB == null) {
            return;
        }
        interfaceC0581zcB.onInterstitialAdRewarded(str, i);
    }

    @Override // com.ironsource.Ud, com.ironsource.Q9
    public void onPause(Activity activity) {
        if (this.f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.Ud, com.ironsource.Q9
    public void onResume(Activity activity) {
        if (this.f) {
            return;
        }
        c(activity);
    }

    public static synchronized Q9 a(String str, String str2, Context context) {
        if (n == null) {
            C0543x8.a(Sd.a);
            n = new K9(str, str2, context);
        }
        return n;
    }

    private InterfaceC0581zc b(X4 x4) {
        if (x4 == null) {
            return null;
        }
        return (InterfaceC0581zc) x4.i();
    }

    @Override // com.ironsource.Ud
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.a.a(new d(strOptString));
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void b(C0425q8.e eVar, String str) {
        InterfaceC0581zc interfaceC0581zcB;
        X4 x4D = d(eVar, str);
        if (x4D != null) {
            if (eVar == C0425q8.e.RewardedVideo) {
                Ec ecC = c(x4D);
                if (ecC != null) {
                    ecC.d();
                    return;
                }
                return;
            }
            if (eVar != C0425q8.e.Interstitial || (interfaceC0581zcB = b(x4D)) == null) {
                return;
            }
            interfaceC0581zcB.onInterstitialClose();
        }
    }

    public static synchronized K9 a(Context context, int i) throws Exception {
        Logger.i(m, "getInstance()");
        if (n == null) {
            n = new K9(context, i);
        }
        return n;
    }

    private X4 d(C0425q8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.ironsource.Q9
    public com.ironsource.sdk.controller.e a() {
        return this.a;
    }

    private InterfaceC0547xc a(X4 x4) {
        if (x4 == null) {
            return null;
        }
        return (InterfaceC0547xc) x4.i();
    }

    @Override // com.ironsource.Ud
    public void a(String str, String str2, String str3, Map<String, String> map, Ec ec) {
        this.b = str;
        this.c = str2;
        this.a.a(new a(str, str2, this.d.a(C0425q8.e.RewardedVideo, str3, map, ec)));
    }

    K9(String str, String str2, Context context) {
        this.b = str;
        this.c = str2;
        c(context);
    }

    @Override // com.ironsource.InterfaceC0539x4
    public void b(String str, String str2) {
        Ec ecC;
        X4 x4D = d(C0425q8.e.RewardedVideo, str);
        if (x4D == null || (ecC = c(x4D)) == null) {
            return;
        }
        ecC.a(str2);
    }

    @Override // com.ironsource.InterfaceC0522w4
    public void b(String str) {
        X4 x4D = d(C0425q8.e.Interstitial, str);
        if (x4D != null) {
            G9 g9C = x4D.c();
            this.j.a(EnumC0349m0.SHOW_SUCCESS, g9C.e());
            if (c(g9C)) {
                this.i.a(new Pe(this.k.a(g9C.e())));
            }
            InterfaceC0581zc interfaceC0581zcB = b(x4D);
            if (interfaceC0581zcB != null) {
                interfaceC0581zcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.Ud
    public void a(JSONObject jSONObject) {
        this.a.a(new b(jSONObject));
    }

    @Override // com.ironsource.Ud
    public void a(String str, String str2, String str3, Map<String, String> map, InterfaceC0581zc interfaceC0581zc) {
        this.b = str;
        this.c = str2;
        this.a.a(new c(str, str2, this.d.a(C0425q8.e.Interstitial, str3, map, interfaceC0581zc)));
    }

    @Override // com.ironsource.Ud
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // com.ironsource.Ud, com.ironsource.Q9
    public void a(Activity activity) {
        try {
            Logger.i(m, "release()");
            C0164b5.g();
            this.g.b();
            this.a.a((Context) activity);
            this.a.a();
            this.a = null;
        } catch (Exception e2) {
            C0421q4.d().a(e2);
        }
        n = null;
    }

    @Override // com.ironsource.S9
    public void b(Activity activity, G9 g9, Map<String, String> map) {
        if (Ab.U().g().d()) {
            this.g.a(activity);
        }
        a(g9, map);
    }

    private void b(G9 g9, Map<String, String> map) {
        Logger.d(m, "loadOnNewInstance " + g9.e());
        this.a.a(new f(g9, map));
    }

    @Override // com.ironsource.S9
    public void b(G9 g9) {
        Logger.d(m, "destroyInstance " + g9.e());
        if (c(g9)) {
            this.j.a(EnumC0349m0.DESTROYED, g9.e());
            this.i.a(new Le(this.k.a(g9.e())));
        }
        this.a.a(new h(g9));
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void a(C0425q8.e eVar, String str, Y0 y0) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(eVar, str);
        if (x4D != null) {
            x4D.b(2);
            if (eVar == C0425q8.e.RewardedVideo) {
                Ec ecC = c(x4D);
                if (ecC != null) {
                    ecC.a(y0);
                    return;
                }
                return;
            }
            if (eVar == C0425q8.e.Interstitial) {
                InterfaceC0581zc interfaceC0581zcB = b(x4D);
                if (interfaceC0581zcB != null) {
                    interfaceC0581zcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C0425q8.e.Banner || (interfaceC0547xcA = a(x4D)) == null) {
                return;
            }
            interfaceC0547xcA.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.Cc
    public void b(Activity activity) {
        try {
            this.a.e();
            this.a.a((Context) activity);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private Ec c(X4 x4) {
        if (x4 == null) {
            return null;
        }
        return (Ec) x4.i();
    }

    @Override // com.ironsource.Ud
    public void c(JSONObject jSONObject) {
        this.a.a(new e(jSONObject));
    }

    @Override // com.ironsource.InterfaceC0539x4
    public void c(String str) {
        Ec ecC;
        X4 x4D = d(C0425q8.e.RewardedVideo, str);
        if (x4D == null || (ecC = c(x4D)) == null) {
            return;
        }
        ecC.c();
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void c(C0425q8.e eVar, String str) {
        Ec ecC;
        X4 x4D = d(eVar, str);
        if (x4D != null) {
            if (eVar == C0425q8.e.Interstitial) {
                InterfaceC0581zc interfaceC0581zcB = b(x4D);
                if (interfaceC0581zcB != null) {
                    interfaceC0581zcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C0425q8.e.RewardedVideo || (ecC = c(x4D)) == null) {
                return;
            }
            ecC.b();
        }
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void a(C0425q8.e eVar, String str, String str2) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(eVar, str);
        C0458s8 c0458s8A = new C0458s8().a(F5.v, str).a(F5.w, eVar).a(F5.A, str2);
        if (x4D != null) {
            L l = L.a;
            c0458s8A.a(F5.I, Long.valueOf(l.b(x4D.h())));
            c0458s8A.a(F5.x, Boolean.valueOf(C0560y8.a(x4D)));
            l.a(x4D.h());
            x4D.b(3);
            if (eVar == C0425q8.e.RewardedVideo) {
                Ec ecC = c(x4D);
                if (ecC != null) {
                    ecC.b(str2);
                }
            } else if (eVar == C0425q8.e.Interstitial) {
                InterfaceC0581zc interfaceC0581zcB = b(x4D);
                if (interfaceC0581zcB != null) {
                    interfaceC0581zcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C0425q8.e.Banner && (interfaceC0547xcA = a(x4D)) != null) {
                interfaceC0547xcA.onBannerLoadFail(str2);
            }
        }
        C0543x8.a(Sd.i, c0458s8A.a());
    }

    @Override // com.ironsource.InterfaceC0505v4
    public void c(String str, String str2) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(C0425q8.e.Banner, str);
        if (x4D == null || (interfaceC0547xcA = a(x4D)) == null) {
            return;
        }
        interfaceC0547xcA.onBannerLoadFail(str2);
    }

    private void c(G9 g9, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            C0458s8 c0458s8A = new C0458s8().a(F5.A, e2.getMessage()).a(F5.x, Boolean.valueOf(g9.j())).a(F5.G, Boolean.valueOf(g9.m())).a(F5.v, g9.g()).a(F5.w, R9.a(g9)).a(F5.I, Long.valueOf(L.a.b(g9.e())));
            L.a.a(g9.e());
            C0543x8.a(Sd.k, c0458s8A.a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(g9, map);
    }

    @Override // com.ironsource.InterfaceC0539x4
    public void a(String str, int i) {
        Ec ecC;
        X4 x4D = d(C0425q8.e.RewardedVideo, str);
        if (x4D == null || (ecC = c(x4D)) == null) {
            return;
        }
        ecC.a(i);
    }

    @Override // com.ironsource.Cc
    public void c(Activity activity) {
        this.g.a(activity);
        this.a.g();
        this.a.b(activity);
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void a(C0425q8.e eVar, String str) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(eVar, str);
        if (x4D != null) {
            if (eVar == C0425q8.e.RewardedVideo) {
                Ec ecC = c(x4D);
                if (ecC != null) {
                    ecC.a();
                    return;
                }
                return;
            }
            if (eVar == C0425q8.e.Interstitial) {
                InterfaceC0581zc interfaceC0581zcB = b(x4D);
                if (interfaceC0581zcB != null) {
                    interfaceC0581zcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C0425q8.e.Banner || (interfaceC0547xcA = a(x4D)) == null) {
                return;
            }
            interfaceC0547xcA.onBannerClick();
        }
    }

    public boolean c(G9 g9) {
        return g9.l() && !g9.i() && a(g9);
    }

    @Override // com.ironsource.InterfaceC0488u4
    public void a(C0425q8.e eVar, String str, String str2, JSONObject jSONObject) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(eVar, str);
        if (x4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + x4D.f());
            if (eVar == C0425q8.e.Interstitial) {
                InterfaceC0581zc interfaceC0581zcB = b(x4D);
                if (interfaceC0581zcB != null) {
                    jSONObject.put("demandSourceName", str);
                    interfaceC0581zcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C0425q8.e.RewardedVideo) {
                Ec ecC = c(x4D);
                if (ecC != null) {
                    jSONObject.put("demandSourceName", str);
                    ecC.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C0425q8.e.Banner || (interfaceC0547xcA = a(x4D)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                interfaceC0547xcA.onBannerShowSuccess();
            }
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0522w4
    public void a(String str, JSONObject jSONObject) {
        C0425q8.e eVar = C0425q8.e.Interstitial;
        X4 x4D = d(eVar, str);
        C0458s8 c0458s8A = new C0458s8().a(F5.v, str);
        if (x4D != null) {
            G9 g9C = x4D.c();
            this.j.a(jSONObject, EnumC0349m0.LOAD_SUCCESS, g9C.e());
            if (c(g9C)) {
                this.i.a(new Ne(this.k.a(g9C.e())));
            }
            C0458s8 c0458s8A2 = c0458s8A.a(F5.w, C0560y8.a(x4D, eVar)).a(F5.x, Boolean.valueOf(C0560y8.a(x4D)));
            L l = L.a;
            c0458s8A2.a(F5.I, Long.valueOf(l.b(x4D.h())));
            l.a(x4D.h());
            InterfaceC0581zc interfaceC0581zcB = b(x4D);
            if (interfaceC0581zcB != null) {
                interfaceC0581zcB.onInterstitialLoadSuccess(x4D.c());
            }
        }
        C0543x8.a(Sd.l, c0458s8A.a());
    }

    @Override // com.ironsource.InterfaceC0522w4
    public void a(String str, String str2) {
        Object obj;
        C0425q8.e eVar = C0425q8.e.Interstitial;
        X4 x4D = d(eVar, str);
        C0458s8 c0458s8 = new C0458s8();
        c0458s8.a(F5.A, str2).a(F5.v, str);
        if (x4D != null) {
            C0458s8 c0458s8A = c0458s8.a(F5.w, C0560y8.a(x4D, eVar));
            if (x4D.e() == 2) {
                obj = F5.E;
            } else {
                obj = F5.F;
            }
            C0458s8 c0458s8A2 = c0458s8A.a(F5.y, obj).a(F5.x, Boolean.valueOf(C0560y8.a(x4D)));
            L l = L.a;
            c0458s8A2.a(F5.I, Long.valueOf(l.b(x4D.h())));
            l.a(x4D.h());
            InterfaceC0581zc interfaceC0581zcB = b(x4D);
            if (interfaceC0581zcB != null) {
                interfaceC0581zcB.onInterstitialLoadFailed(str2);
            }
        }
        C0543x8.a(Sd.g, c0458s8.a());
    }

    @Override // com.ironsource.Ud
    public void a(String str, String str2, int i) {
        C0425q8.e productType;
        X4 x4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (x4A = this.d.a(productType, str2)) == null) {
            return;
        }
        x4A.c(i);
    }

    @Override // com.ironsource.InterfaceC0505v4
    public void a(String str, C0270h8 c0270h8) {
        InterfaceC0547xc interfaceC0547xcA;
        X4 x4D = d(C0425q8.e.Banner, str);
        if (x4D == null || (interfaceC0547xcA = a(x4D)) == null) {
            return;
        }
        interfaceC0547xcA.onBannerLoadSuccess(x4D.c(), c0270h8);
    }

    @Override // com.ironsource.S9
    public void a(G9 g9, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C0198d4.i.y0, String.valueOf(jCurrentTimeMillis));
        L.a.a(g9.e(), jCurrentTimeMillis);
        C0458s8 c0458s8 = new C0458s8();
        c0458s8.a(F5.x, Boolean.valueOf(g9.j())).a(F5.G, Boolean.valueOf(g9.m())).a(F5.v, g9.g()).a(F5.w, R9.a(g9)).a(F5.I, Long.valueOf(jCurrentTimeMillis));
        C0543x8.a(Sd.f, c0458s8.a());
        Logger.d(m, "loadAd " + g9.e());
        N n2 = new N(g9);
        this.j.a(n2);
        this.j.a(new JSONObject(map), EnumC0349m0.LOAD_REQUEST, n2.c());
        if (c(g9)) {
            this.i.a(new Me(n2));
        }
        if (g9.k()) {
            c(g9, map);
        } else {
            b(g9, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.S9
    public void a(Activity activity, G9 g9, Map<String, String> map) {
        this.g.a(activity);
        Logger.i(m, "showAd " + g9.e());
        X4 x4A = this.d.a(C0425q8.e.Interstitial, g9.e());
        if (x4A == null) {
            return;
        }
        this.a.a(new g(x4A, map));
    }

    @Override // com.ironsource.S9
    public boolean a(G9 g9) {
        Logger.d(m, "isAdAvailable " + g9.e());
        X4 x4A = this.d.a(C0425q8.e.Interstitial, g9.e());
        if (x4A == null) {
            return false;
        }
        return x4A.d();
    }

    public void a(Context context) {
        this.f = false;
        Boolean boolC = this.l.c(C0198d4.a.g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C0278i(this));
            } catch (Throwable th) {
                C0421q4.d().a(th);
                C0458s8 c0458s8 = new C0458s8();
                c0458s8.a(F5.y, th.getMessage());
                C0543x8.a(Sd.u, c0458s8.a());
            }
        }
    }
}
