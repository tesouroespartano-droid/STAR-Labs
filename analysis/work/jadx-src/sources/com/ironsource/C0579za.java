package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0579za implements Ha {
    private final C0545xa a;
    private boolean b;

    public C0579za(C0545xa strategy, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = z;
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load");
    }

    @Override // com.ironsource.Ha
    public void b() {
        M2 m2A = this.a.j().a(true);
        m2A.a(this.a.g());
        this.a.a((Ha) new Ca(this.a, m2A, this.b));
    }

    @Override // com.ironsource.Ha
    public void c() {
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.Ha
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.Ha
    public void e() {
        this.b = false;
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load");
    }

    public /* synthetic */ C0579za(C0545xa c0545xa, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0545xa, (i & 2) != 0 ? false : z);
    }
}
