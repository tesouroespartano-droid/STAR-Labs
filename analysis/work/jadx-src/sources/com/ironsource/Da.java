package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Da implements Ha {
    private final C0545xa a;
    private final M2 b;

    public Da(C0545xa strategy, M2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ha
    public void c() {
        this.b.a(true);
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.Ha
    public void d() {
    }

    @Override // com.ironsource.Ha
    public void e() {
        this.a.a(this.b, new AbstractC0318k3.a(AbstractC0318k3.b.c.a));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed while paused");
    }
}
