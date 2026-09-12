package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0200d6 implements InterfaceC0581zc {
    private InterfaceC0217e6 a;
    private WeakReference<InterfaceC0234f6> b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.d6$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC0217e6 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC0234f6 interfaceC0234f6 = this.b.get();
        if (interfaceC0234f6 != null) {
            interfaceC0234f6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialClick() {
        InterfaceC0234f6 interfaceC0234f6 = this.b.get();
        if (interfaceC0234f6 != null) {
            interfaceC0234f6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialClose() {
        InterfaceC0234f6 interfaceC0234f6 = this.b.get();
        if (interfaceC0234f6 != null) {
            interfaceC0234f6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC0234f6 interfaceC0234f6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC0234f6 = this.b.get()) == null) {
            return;
        }
        interfaceC0234f6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialLoadFailed(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC0217e6 interfaceC0217e6 = this.a;
        if (interfaceC0217e6 != null) {
            interfaceC0217e6.a(description);
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialLoadSuccess(G9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC0217e6 interfaceC0217e6 = this.a;
        if (interfaceC0217e6 != null) {
            interfaceC0217e6.a(adInstance);
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialOpen() {
        InterfaceC0234f6 interfaceC0234f6 = this.b.get();
        if (interfaceC0234f6 != null) {
            interfaceC0234f6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialShowFailed(String str) {
        InterfaceC0234f6 interfaceC0234f6 = this.b.get();
        if (interfaceC0234f6 != null) {
            interfaceC0234f6.a(str);
        }
    }

    @Override // com.ironsource.InterfaceC0581zc
    public void onInterstitialShowSuccess() {
    }

    public final void a(InterfaceC0234f6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
