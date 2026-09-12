package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Ea implements Ha {
    private final C0545xa a;
    private final M2 b;
    private final M2 c;
    private final long d;
    private InterfaceC0239fb<LevelPlayAdInfo> e;
    private Cif.a f;

    public Ea(C0545xa strategy, M2 currentAdUnit, M2 reloadingAdUnit, long j) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        g();
    }

    private final void f() {
        InterfaceC0239fb<LevelPlayAdInfo> interfaceC0239fb = this.e;
        if (interfaceC0239fb == null) {
            C0545xa c0545xa = this.a;
            c0545xa.a((Ha) new Ga(c0545xa, this.b, this.c, this.d));
        } else if (interfaceC0239fb instanceof InterfaceC0239fb.b) {
            a((LevelPlayAdInfo) ((InterfaceC0239fb.b) interfaceC0239fb).b());
        } else if (interfaceC0239fb instanceof InterfaceC0239fb.a) {
            b(((InterfaceC0239fb.a) interfaceC0239fb).b());
        }
    }

    private final void g() {
        Cif cifO = this.a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Ea$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ea.a(this.f$0);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.f = cifO.a(runnable, DurationKt.toDuration(this.a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC0239fb.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC0239fb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.Ha
    public void b() {
        this.a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ha
    public void c() {
        Cif.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Aa(c0545xa));
    }

    @Override // com.ironsource.Ha
    public void d() {
        Cif.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Da(c0545xa, this.b));
    }

    @Override // com.ironsource.Ha
    public void e() {
        C0545xa c0545xa = this.a;
        c0545xa.a((Ha) new Ea(c0545xa, this.b, this.c, c0545xa.p().a()));
    }

    private final void b(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC0318k3) new AbstractC0318k3.c(this.a.p().a() - this.d, AbstractC0318k3.d.g.a), true, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC0239fb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.a.p().a() - this.d;
        this.a.a(new C0450s0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC0318k3) new AbstractC0318k3.c(jA, AbstractC0318k3.d.h.a), false, Long.valueOf(this.d));
    }

    private final void a(InterfaceC0239fb<LevelPlayAdInfo> interfaceC0239fb) {
        if (this.e != null) {
            this.a.a("Received excessive load " + Fa.b(interfaceC0239fb) + " while reloading");
            return;
        }
        this.e = interfaceC0239fb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ea this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f();
    }
}
