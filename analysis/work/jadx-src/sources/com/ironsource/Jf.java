package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Jf extends AbstractC0301j3 implements L0, InterfaceC0535x0 {
    private final C0366n0 d;
    private final X2 e;
    private final InterfaceC0335l3 f;
    private final O2 g;
    private Rf h;
    private final C0519w1 i;
    private final hg j;
    private final C0563yb k;
    private a l;
    private a m;
    private boolean n;
    private boolean o;
    private C0450s0 p;
    private IronSourceError q;

    private final class a {
        private final M2 a;
        public C0450s0 b;
        private boolean c;
        final /* synthetic */ Jf d;

        public a(Jf jf, O2 bannerAdUnitFactory, boolean z) {
            Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.d = jf;
            this.a = bannerAdUnitFactory.a(z);
            this.c = true;
        }

        public final C0450s0 a() {
            C0450s0 c0450s0 = this.b;
            if (c0450s0 != null) {
                return c0450s0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        public final M2 b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.a.d().a();
        }

        public final void e() {
            this.a.a((L0) this.d);
        }

        public final void a(C0450s0 c0450s0) {
            Intrinsics.checkNotNullParameter(c0450s0, "<set-?>");
            this.b = c0450s0;
        }

        public final void b(boolean z) {
            this.c = z;
        }

        public final void a(boolean z) {
            this.a.a(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jf(C0366n0 adTools, X2 bannerContainer, AbstractC0301j3.b config, K2 bannerAdProperties, InterfaceC0335l3 bannerStrategyListener, O2 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.d = adTools;
        this.e = bannerContainer;
        this.f = bannerStrategyListener;
        this.g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C0366n0.a(adTools, "refresh interval: " + g() + ", auto refresh: " + h(), (String) null, 2, (Object) null));
        this.i = new C0519w1(adTools.b());
        this.j = new hg(bannerContainer);
        this.k = new C0563yb(!h());
        this.m = new a(this, bannerAdUnitFactory, true);
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Jf this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n = true;
        if (this$0.m.d()) {
            this$0.l();
        } else {
            if (this$0.m.c()) {
                return;
            }
            this$0.i();
            this$0.a(this$0.i, this$0.k);
        }
    }

    private final void i() {
        if (h()) {
            a aVar = new a(this, this.g, false);
            this.m = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.d.a(new Runnable() { // from class: com.ironsource.Jf$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Jf.a(this.f$0);
            }
        });
    }

    private final void k() {
        this.f.c(this.q);
        this.p = null;
        this.q = null;
    }

    private final void l() {
        this.o = false;
        this.m.b().a(this.e.getViewBinder(), this);
        this.f.c(this.m.a());
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.l = this.m;
        i();
        a(this.j, this.i, this.k);
    }

    @Override // com.ironsource.AbstractC0301j3
    public void b() {
        this.m.e();
    }

    @Override // com.ironsource.AbstractC0301j3
    public void c() {
        this.i.e();
        this.j.e();
        Rf rf = this.h;
        if (rf != null) {
            rf.c();
        }
        this.h = null;
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.m.a(true);
    }

    @Override // com.ironsource.AbstractC0301j3
    public void d() {
        if (h()) {
            this.k.e();
        }
    }

    @Override // com.ironsource.AbstractC0301j3
    public void e() {
        if (h()) {
            this.k.f();
        }
    }

    @Override // com.ironsource.InterfaceC0535x0
    public void f() {
        this.f.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Jf this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    @Override // com.ironsource.InterfaceC0535x0
    public void b(IronSourceError ironSourceError) {
        this.f.e(ironSourceError);
    }

    private final void a(final Uc... ucArr) {
        this.n = false;
        this.d.c(new Runnable() { // from class: com.ironsource.Jf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Jf.a(this.f$0, ucArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Jf this$0, Uc[] triggers) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(triggers, "$triggers");
        Rf rf = this$0.h;
        if (rf != null) {
            rf.c();
        }
        this$0.h = new Rf(this$0.d, new Runnable() { // from class: com.ironsource.Jf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Jf.b(this.f$0);
            }
        }, this$0.g(), ArraysKt.toList(triggers));
    }

    @Override // com.ironsource.L0
    public void a(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.m.a(adUnitCallback);
        this.m.b(false);
        if (this.n || this.o) {
            l();
        }
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.m.b(false);
        this.q = ironSourceError;
        if (this.o) {
            k();
            a(this.i, this.k);
        } else if (this.n) {
            k();
            i();
            a(this.i, this.k);
        }
    }
}
