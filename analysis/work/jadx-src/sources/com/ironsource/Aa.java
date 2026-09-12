package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Aa implements Ha {
    private final C0545xa a;

    public Aa(C0545xa strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ha
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ha
    public void d() {
        this.a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ha
    public void e() {
        this.a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
