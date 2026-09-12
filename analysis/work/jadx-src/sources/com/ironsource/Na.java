package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Na implements Oa {
    private final Ja a;
    private final M2 b;

    public Na(Ja strategy, M2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Oa
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b);
        Ja ja = this.a;
        ja.a(new Ma(ja, this.b));
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Oa
    public void c() {
        this.b.a(true);
        this.a.a((M2) null);
        Ja ja = this.a;
        ja.a(new La(ja));
    }

    @Override // com.ironsource.Oa
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError);
        this.b.a(false);
        this.a.a((M2) null);
        Ja ja = this.a;
        ja.a(new La(ja));
    }
}
