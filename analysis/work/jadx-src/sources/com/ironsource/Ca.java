package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ca implements Ha {
    private final C0545xa a;
    private final M2 b;
    private boolean c;

    public Ca(C0545xa strategy, M2 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b, (M2) null, new AbstractC0318k3.a(AbstractC0318k3.b.C0057b.a), this.c, (Long) null);
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ha
    public void c() {
        this.b.a(true);
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.Ha
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.Ha
    public void e() {
        this.c = false;
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC0318k3) new AbstractC0318k3.a(AbstractC0318k3.b.a.a), false, this.c, (Long) null);
    }
}
