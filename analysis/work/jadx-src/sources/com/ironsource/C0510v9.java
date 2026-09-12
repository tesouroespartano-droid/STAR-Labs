package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0510v9 implements InterfaceC0461sb {
    private final InterstitialAdRequest a;
    private final InterstitialAdLoaderListener b;
    private final InterfaceC0195d1 c;
    private final InterfaceC0384o1 d;

    public C0510v9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC0195d1 adapterConfigProvider, InterfaceC0384o1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC0461sb
    public InterfaceC0411pb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC0401p1 interfaceC0401p1A = this.d.a(new C0299j1(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            C0428qb c0428qbA = new C0444rb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, Yb.e.a().c().get()).a();
            new C0476t9(c0428qbA).a();
            C0327kc c0327kc = new C0327kc();
            C0334l2 c0334l2 = new C0334l2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.a;
            Intrinsics.checkNotNull(c0428qbA);
            T7 t7 = T7.a;
            return new C0459s9(interstitialAdRequest, c0428qbA, new C0493u9(t7, this.b), c0334l2, c0327kc, interfaceC0401p1A, new C0392o9(interfaceC0401p1A, t7.c()), null, null, 384, null);
        } catch (Exception e) {
            C0421q4.d().a(e);
            if (e instanceof C0191ce) {
                ironSourceErrorB = ((C0191ce) e).a();
            } else {
                C0557y5 c0557y5 = C0557y5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c0557y5.b(message);
            }
            return new C0574z5(this.a, new C0493u9(T7.a, this.b), interfaceC0401p1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ C0510v9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC0195d1 interfaceC0195d1, InterfaceC0384o1 interfaceC0384o1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC0195d1, (i & 8) != 0 ? new C0367n1(IronSource.AD_UNIT.INTERSTITIAL) : interfaceC0384o1);
    }
}
