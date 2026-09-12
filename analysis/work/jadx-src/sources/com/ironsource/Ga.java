package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ga implements Ha {
    private final C0545xa a;
    private final M2 b;
    private final M2 c;
    private final long d;

    public Ga(C0545xa strategy, M2 currentAdUnit, M2 reloadingAdUnit, long j) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.c, this.b, (AbstractC0318k3) new AbstractC0318k3.c(this.a.p().a() - this.d, AbstractC0318k3.d.C0058d.a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ha
    public void c() {
        this.b.a(true);
        this.c.a(true);
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.Ha
    public void d() {
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Da(c0545xa, this.b));
    }

    @Override // com.ironsource.Ha
    public void e() {
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC0318k3) new AbstractC0318k3.c(this.a.p().a() - this.d, AbstractC0318k3.d.c.a), true, false, Long.valueOf(this.d));
    }
}
