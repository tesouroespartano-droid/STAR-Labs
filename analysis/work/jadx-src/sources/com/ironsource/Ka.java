package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ka implements Oa {
    private final Ja a;

    public Ka(Ja strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.Oa
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load called");
    }

    @Override // com.ironsource.Oa
    public void b() {
        M2 m2A = this.a.i().a(true);
        this.a.a(m2A);
        Ja ja = this.a;
        ja.a(new Na(ja, m2A));
        m2A.a(this.a.g());
    }

    @Override // com.ironsource.Oa
    public void c() {
        M2 m2K = this.a.k();
        if (m2K != null) {
            m2K.a(false);
        }
        this.a.a((M2) null);
        Ja ja = this.a;
        ja.a(new La(ja));
    }

    @Override // com.ironsource.Oa
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load called");
    }
}
