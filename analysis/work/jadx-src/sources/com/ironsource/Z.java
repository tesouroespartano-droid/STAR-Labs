package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Z implements Y {
    private final InterfaceC0310jc a;

    public static final class a {
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public Z(InterfaceC0310jc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.a = networkLoadApi;
    }

    @Override // com.ironsource.Y
    public String a() {
        return this.a.a();
    }

    @Override // com.ironsource.Y
    public void a(G9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.a.a(adInstance, new C0344lc(null, false, 3, null));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            String str = "1000: loadAd failed: " + e.getMessage();
            InterfaceC0530wc interfaceC0530wcB = adInstance.b();
            if (interfaceC0530wcB instanceof C0200d6) {
                InterfaceC0530wc interfaceC0530wcB2 = adInstance.b();
                Intrinsics.checkNotNull(interfaceC0530wcB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C0200d6) interfaceC0530wcB2).onInterstitialLoadFailed(str);
            } else if (interfaceC0530wcB instanceof C0564yc) {
                InterfaceC0530wc interfaceC0530wcB3 = adInstance.b();
                Intrinsics.checkNotNull(interfaceC0530wcB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((C0564yc) interfaceC0530wcB3).onBannerLoadFail(str);
            }
        }
    }
}
