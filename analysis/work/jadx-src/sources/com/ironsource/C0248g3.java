package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0248g3 implements InterfaceC0461sb {
    private final BannerAdRequest a;
    private final BannerAdLoaderListener b;
    private final InterfaceC0195d1 c;
    private final InterfaceC0384o1 d;

    public C0248g3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC0195d1 adapterConfigProvider, InterfaceC0384o1 analyticsFactory) {
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
        IronSourceError ironSourceErrorA;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC0401p1 interfaceC0401p1A = this.d.a(new C0299j1(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            C0428qb c0428qbA = new C0444rb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, Yb.e.a().c().get()).a();
            new C0214e3(c0428qbA, this.a.getSize()).a();
            C0327kc c0327kc = new C0327kc();
            C0334l2 c0334l2 = new C0334l2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(c0428qbA);
            T7 t7 = T7.a;
            return new C0197d3(bannerAdRequest, size, c0334l2, c0428qbA, c0327kc, interfaceC0401p1A, new C0231f3(t7, this.b), new F2(interfaceC0401p1A, t7.c()), null, null, 768, null);
        } catch (Exception e) {
            C0421q4.d().a(e);
            if (e instanceof C0191ce) {
                ironSourceErrorA = ((C0191ce) e).a();
            } else {
                C0557y5 c0557y5 = C0557y5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c0557y5.a(message);
            }
            return new C0540x5(ironSourceErrorA, new C0231f3(T7.a, this.b), interfaceC0401p1A);
        }
    }

    public /* synthetic */ C0248g3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC0195d1 interfaceC0195d1, InterfaceC0384o1 interfaceC0384o1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC0195d1, (i & 8) != 0 ? new C0367n1(IronSource.AD_UNIT.BANNER) : interfaceC0384o1);
    }
}
