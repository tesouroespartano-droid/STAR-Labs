package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0192cf extends vg {
    private final Lc d;
    private final qg e;
    private final F f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192cf(V0 adTools, Lc outcomeReporter, qg waterfallInstances, F adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.vg
    public void a(AbstractC0568z instance) {
        AbstractC0568z abstractC0568zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (abstractC0568zA = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), abstractC0568zA);
        }
    }

    @Override // com.ironsource.vg
    public void b(AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.vg
    public void c(AbstractC0568z instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.vg
    public void a() {
        AbstractC0568z abstractC0568zA = this.f.c().a();
        if (abstractC0568zA != null) {
            this.d.a(this.e.b(), abstractC0568zA);
        }
    }
}
