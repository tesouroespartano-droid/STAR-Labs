package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0520w2 extends AbstractC0348m implements P2, InterfaceC0335l3, InterfaceC0356m7 {
    private final C0366n0 b;
    private final K2 c;
    private final WeakReference<InterfaceC0537x2> d;
    private LevelPlayAdInfo e;
    private LevelPlayAdInfo f;
    private final AbstractC0301j3 g;

    public C0520w2(InterfaceC0537x2 listener, C0366n0 adTools, K2 bannerAdProperties, X2 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new WeakReference<>(listener);
        this.e = r();
        this.f = r();
        this.g = AbstractC0301j3.c.a(adTools, bannerViewContainer, q(), bannerAdProperties, this, p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M2 a(C0520w2 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final O2 p() {
        return new O2() { // from class: com.ironsource.w2$$ExternalSyntheticLambda0
            @Override // com.ironsource.O2
            public final M2 a(boolean z) {
                return C0520w2.a(this.f$0, z);
            }
        };
    }

    private final AbstractC0301j3.b q() {
        Qa.a aVarD = this.b.d(this.c.c());
        Long lJ = this.c.j();
        long jLongValue = lJ != null ? lJ.longValue() : aVarD.d();
        Boolean boolI = this.c.i();
        return new AbstractC0301j3.b(jLongValue, boolI != null ? boolI.booleanValue() : aVarD.f());
    }

    private final LevelPlayAdInfo r() {
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.c.c();
        String string2 = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void b() {
        this.g.b();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void c() {
        this.g.c();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void d() {
        this.g.d();
    }

    @Override // com.ironsource.InterfaceC0356m7
    public void e() {
        this.g.e();
    }

    @Override // com.ironsource.J0
    public void g() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void h() {
        this.e = this.f;
        this.f = r();
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.b(this.e);
        }
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit i() {
        s();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit j() {
        u();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit m() {
        t();
        return Unit.INSTANCE;
    }

    public void s() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.e(this.e);
        }
    }

    public void t() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.c(this.e);
        }
    }

    public void u() {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            interfaceC0537x2.a(this.e);
        }
    }

    private final M2 a(C0366n0 c0366n0, K2 k2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new M2(c0366n0, N2.z.a(k2, o().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void c(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f = levelPlayAdInfoC;
            InterfaceC0537x2 interfaceC0537x2 = this.d.get();
            if (interfaceC0537x2 != null) {
                interfaceC0537x2.a(levelPlayAdInfoC, false);
            }
        }
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void e(IronSourceError ironSourceError) {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.e;
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC0537x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void c(IronSourceError ironSourceError) {
        InterfaceC0537x2 interfaceC0537x2 = this.d.get();
        if (interfaceC0537x2 != null) {
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC0537x2.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }
}
