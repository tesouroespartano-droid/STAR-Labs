package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0383o0 {
    private final AbstractC0501v0 a;
    private final V6 b;
    private final V0 c;
    private L0 d;
    private InterfaceC0535x0 e;
    private final mg f;
    private final WeakReference<J0> g;
    private C0320k5 h;
    private Cif.a i;
    private final D5 j;

    /* JADX INFO: renamed from: com.ironsource.o0$a */
    protected class a implements D {
        public a() {
        }

        @Override // com.ironsource.D
        public void a(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC0383o0.this.j.a().a(AbstractC0383o0.this.h());
            J0 j0 = (J0) AbstractC0383o0.this.g.get();
            if (j0 != null) {
                j0.g();
            }
        }

        @Override // com.ironsource.D
        public void b(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC0383o0.this.a(instance.q()));
            AbstractC0383o0.this.k().b(instance);
            AbstractC0383o0.this.j.a().g(AbstractC0383o0.this.h());
            AbstractC0383o0.this.f().l().b(AbstractC0383o0.this.e().b().a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o0$b */
    public static final class b implements tg {
        b() {
        }

        @Override // com.ironsource.tg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC0383o0.this.a(i, errorReason);
        }

        @Override // com.ironsource.tg
        public void b(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC0383o0.this.j.e().a(C0320k5.a(AbstractC0383o0.this.h), AbstractC0383o0.this.e().u());
            L0 l0J = AbstractC0383o0.this.j();
            if (l0J != null) {
                l0J.a(new C0450s0(AbstractC0383o0.this, instance.e()));
            }
            AbstractC0383o0.this.l();
        }

        @Override // com.ironsource.tg
        public void a(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC0383o0.this.f().e().a().e(AbstractC0383o0.this.h());
            L0 l0J = AbstractC0383o0.this.j();
            if (l0J != null) {
                l0J.b(new C0450s0(AbstractC0383o0.this, instance.e()));
            }
            AbstractC0383o0.this.l();
        }
    }

    public AbstractC0383o0(C0366n0 adTools, AbstractC0501v0 adUnitData, J0 listener, V6 taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.a = adUnitData;
        this.b = taskScheduler;
        V0 v0 = new V0(adTools, adUnitData, D0.b.MEDIATION);
        this.c = v0;
        this.f = new mg(v0, adUnitData, c());
        this.g = new WeakReference<>(listener);
        this.j = v0.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        Cif.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.c.b(this.a.b().e());
        V6 v6 = this.b;
        Runnable runnable = new Runnable() { // from class: com.ironsource.o0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0383o0.e(this.f$0);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.i = v6.a(runnable, DurationKt.toDuration(jB, DurationUnit.MILLISECONDS));
    }

    protected abstract C a();

    protected final AbstractC0501v0 e() {
        return this.a;
    }

    protected final V0 f() {
        return this.c;
    }

    protected final Placement g() {
        return this.a.b().f();
    }

    protected final String h() {
        return this.a.l();
    }

    protected final InterfaceC0535x0 i() {
        return this.e;
    }

    protected final L0 j() {
        return this.d;
    }

    protected final mg k() {
        return this.f;
    }

    private final b c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC0383o0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        L0 l0 = this$0.d;
        if (l0 != null) {
            l0.a();
        }
    }

    protected final void a(InterfaceC0535x0 interfaceC0535x0) {
        this.e = interfaceC0535x0;
    }

    protected final void b(L0 l0) {
        this.d = l0;
    }

    public InterfaceC0279i0 d() {
        return this.f.d() ? InterfaceC0279i0.b.a : new InterfaceC0279i0.a(null, 1, null);
    }

    public void a(L0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C0366n0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.c.a(b());
        this.d = loadListener;
        this.j.a(this.a.u());
        this.h = new C0320k5();
        this.f.a(a());
    }

    public C0417q0 b() {
        return new C0417q0(this.a.b());
    }

    public final void a(I adInstancePresenter, InterfaceC0535x0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.e = displayListener;
        Cif.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        this.f.a(adInstancePresenter);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C0366n0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.f.a();
        if (z) {
            this.c.e().e().a(this.c.f());
        }
    }

    protected final void a(int i, String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.j.e().a(C0320k5.a(this.h), i, errorReason, this.a.u());
        L0 l0 = this.d;
        if (l0 != null) {
            l0.a(new IronSourceError(i, errorReason));
        }
    }

    protected final String a(String str) {
        return C0366n0.a(this.c, str, (String) null, 2, (Object) null);
    }

    public /* synthetic */ AbstractC0383o0(C0366n0 c0366n0, AbstractC0501v0 abstractC0501v0, J0 j0, V6 v6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0366n0, abstractC0501v0, j0, (i & 8) != 0 ? new V6(W6.a(c0366n0.a())) : v6);
    }
}
