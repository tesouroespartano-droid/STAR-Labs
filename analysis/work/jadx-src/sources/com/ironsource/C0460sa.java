package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0460sa extends AbstractC0348m implements P2, InterfaceC0494ua, InterfaceC0356m7 {
    private final C0366n0 b;
    private final K2 c;
    private final WeakReference<InterfaceC0537x2> d;
    private LevelPlayAdInfo e;
    private final InterfaceC0477ta f;

    public C0460sa(InterfaceC0537x2 listener, C0366n0 adTools, K2 bannerAdProperties, X2 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new WeakReference<>(listener);
        this.e = q();
        this.f = Qa.a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, p(), (64 & 64) != 0 ? new InterfaceC0454s4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M2 a(C0460sa this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final O2 p() {
        return new O2() { // from class: com.ironsource.sa$$ExternalSyntheticLambda0
            @Override // com.ironsource.O2
            public final M2 a(boolean z) {
                return C0460sa.a(this.f$0, z);
            }
        };
    }

    private final LevelPlayAdInfo q() {
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.c.c();
        String string2 = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void b() {
        this.f.b();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void c() {
        this.f.c();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void d() {
        this.f.d();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void e() {
        this.f.e();
    }

    @Override // com.ironsource.J0
    public void g() {
        onAdClicked();
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit i() {
        r();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit j() {
        t();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void k() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void l() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.a(this.e);
        }
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit m() {
        s();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void n() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.c(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void onAdClicked() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void onAdLeftApplication() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void onAdLoadFailed(IronSourceError ironSourceError) {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC0537x2.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.a(adInfo, false);
        }
    }

    public void r() {
        onAdLeftApplication();
    }

    public void s() {
        n();
    }

    public void t() {
        l();
    }

    private final M2 a(C0366n0 c0366n0, K2 k2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new M2(c0366n0, N2.z.a(k2, o().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC0494ua
    public void d(IronSourceError ironSourceError) {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.e;
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC0537x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }
}
