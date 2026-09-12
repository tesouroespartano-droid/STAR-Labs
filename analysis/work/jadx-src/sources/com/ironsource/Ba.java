package com.ironsource;

import android.graphics.Rect;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Ba implements Ha {
    private final C0545xa a;
    private final M2 b;
    private final Long c;
    private Cif.a d;
    private final long e;

    static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ AbstractC0318k3.c b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0318k3.c cVar, long j) {
            super(0);
            this.b = cVar;
            this.c = j;
        }

        public final void a() {
            Ba.this.a.a(Ba.this.b, this.b, Long.valueOf(this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public Ba(C0545xa strategy, M2 currentAdUnit, Long l) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = l;
        this.e = strategy.p().a();
        strategy.r();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Ba this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C0309jb.a(this$0.a.a(), new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ba.d(this.f$0);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ba this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!kg.a(this$0.a.k(), new Rect())) {
            this$0.f();
            return;
        }
        long jA = this$0.a.p().a();
        long j = jA - this$0.e;
        Long l = this$0.c;
        C0309jb.a((C0309jb) this$0.a.a(), Vd.a.a(this$0.new a(new AbstractC0318k3.c(l != null ? jA - l.longValue() : 0L, new AbstractC0318k3.d.f(j)), jA)), 0L, 2, (Object) null);
    }

    private final void f() {
        long jQ = this.a.q();
        Cif cifO = this.a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ba.c(this.f$0);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.d = cifO.a(runnable, DurationKt.toDuration(jQ, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ha
    public void e() {
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ha
    public void c() {
        Cif.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ha
    public void d() {
        Cif.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Da(c0545xa, this.b));
    }
}
