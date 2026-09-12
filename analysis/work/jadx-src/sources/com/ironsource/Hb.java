package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Hb extends AbstractC0348m implements Vb, L0, InterfaceC0535x0 {
    private final Kb b;
    private final C0366n0 c;
    private final Rb d;
    private Tb e;
    private LevelPlayAdInfo f;

    public Hb(Kb listener, C0366n0 adTools, Rb nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.b = listener;
        this.c = adTools;
        this.d = nativeAdProperties;
        this.f = p();
    }

    private final LevelPlayAdInfo p() {
        String string = this.d.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "nativeAdProperties.adId.toString()");
        String strC = this.d.c();
        String string2 = this.d.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void a(Eb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        Tb tb = this.e;
        if (tb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            tb = null;
        }
        tb.a(new Mb(nativeAdBinder), this);
    }

    @Override // com.ironsource.InterfaceC0535x0
    public void b(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC0535x0
    public void f() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.J0
    public void g() {
        this.b.b(this.f);
    }

    public final void q() {
        this.f = p();
        Tb tb = this.e;
        if (tb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            tb = null;
        }
        tb.a(true);
    }

    public final void r() {
        Tb tbA = a(this.c, this.d);
        this.e = tbA;
        if (tbA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            tbA = null;
        }
        tbA.a((L0) this);
    }

    private final Tb a(C0366n0 c0366n0, Rb rb) {
        IronLog.INTERNAL.verbose();
        return new Tb(c0366n0, Ub.y.a(rb, o().a()), this);
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f = levelPlayAdInfoC;
            this.b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }
}
