package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class J9 {
    public static final J9 a = new J9();
    private static final C0237f9 b = new C0237f9();

    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private J9() {
    }

    public static final class b implements InterfaceC0225ee {
        final /* synthetic */ Context a;
        final /* synthetic */ C0320k5 b;
        final /* synthetic */ InitListener c;

        b(Context context, C0320k5 c0320k5, InitListener initListener) {
            this.a = context;
            this.b = c0320k5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(Yd sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            J9.a.a(this.a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(C0155ae error) {
            Intrinsics.checkNotNullParameter(error, "error");
            J9.a.a(this.c, this.b, error);
        }
    }

    public final void a(final Context context, final InitRequest initRequest, final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new Runnable() { // from class: com.ironsource.J9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                J9.a(initRequest, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C0320k5 c0320k5 = new C0320k5();
        C0380ne.a.c(context, new C0259ge(initRequest.getAppKey(), null, ArraysKt.toMutableList(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c0320k5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ae ae, C0320k5 c0320k5, InitListener initListener) {
        String strU = com.ironsource.mediationsdk.p.m().u();
        X8 x8F = ae.f();
        Intrinsics.checkNotNullExpressionValue(x8F, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = ae.k().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        x8F.a(new V.a(interstitialSettings));
        x8F.a(ConfigFile.getConfigFile().getPluginType());
        x8F.b(strU);
        new X(new C0240fc()).a(context, x8F, new a());
        a(ae, c0320k5, initListener);
    }

    private final void a(Ae ae, C0320k5 c0320k5, final InitListener initListener) {
        J1 j1E;
        A1 a1B = ae.c().b();
        new Bb().a((a1B == null || (j1E = a1B.e()) == null) ? null : j1E.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.m().u();
        Yb ybA = Yb.e.a();
        ybA.a(ae.k());
        ybA.a(ae.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        ybA.a(sessionId);
        ybA.g();
        long jA = C0320k5.a(c0320k5);
        C0237f9 c0237f9 = b;
        Ae.a aVarH = ae.h();
        Intrinsics.checkNotNullExpressionValue(aVarH, "serverResponse.origin");
        c0237f9.a(jA, aVarH);
        c0237f9.b(new Runnable() { // from class: com.ironsource.J9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                J9.a(initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C0320k5 c0320k5, final C0155ae c0155ae) {
        long jA = C0320k5.a(c0320k5);
        C0237f9 c0237f9 = b;
        c0237f9.a(c0155ae, jA);
        c0237f9.b(new Runnable() { // from class: com.ironsource.J9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                J9.a(c0155ae, initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0155ae error, InitListener initListener) {
        Intrinsics.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(b.a(error));
        }
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.m().a(key, arrayList);
    }
}
