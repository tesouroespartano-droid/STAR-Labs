package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0456s6 implements InterfaceC0338l6 {
    private final Ab a;
    private final V0 b;
    private final AbstractC0501v0 c;
    private InterfaceC0507v6 d;
    private final Function3<A, G, InterfaceC0338l6, C0321k6> e;
    private final Cif f;
    private final InterfaceC0454s4 g;
    private b h;
    private a i;
    private final mg j;
    private Cif.a k;
    private Long l;

    /* JADX INFO: renamed from: com.ironsource.s6$a */
    public interface a {
        void a(C0456s6 c0456s6, IronSourceError ironSourceError);

        void a(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.s6$b */
    public interface b {
        void a(C0456s6 c0456s6);

        void b(C0456s6 c0456s6, IronSourceError ironSourceError);

        void b(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.s6$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function3<A, G, InterfaceC0338l6, C0321k6> {
        d(Object obj) {
            super(3, obj, C0456s6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0321k6 invoke(A p0, G p1, InterfaceC0338l6 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return ((C0456s6) this.receiver).a(p0, p1, p2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0456s6(Ab mediationServices, V0 adUnitTools, AbstractC0501v0 adUnitData, InterfaceC0507v6 fullscreenListener, ng ngVar, Function3<? super A, ? super G, ? super InterfaceC0338l6, C0321k6> function3, Cif taskScheduler, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = function3;
        this.f = taskScheduler;
        this.g = currentTimeProvider;
        this.j = a(ngVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C0456s6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar = this$0.h;
        if (bVar != null) {
            bVar.a(this$0);
        }
        this$0.j.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC0239fb<Unit> f() {
        if (!this.j.d()) {
            return new InterfaceC0239fb.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.a.p().a(c(), b()).d()) {
            return new InterfaceC0239fb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.a.f().a(this.c.b().c()).d()) {
            return new InterfaceC0239fb.b(Unit.INSTANCE);
        }
        return new InterfaceC0239fb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        Cif.a aVar = this.k;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.b.b(b());
        Cif cif = this.f;
        Runnable runnable = new Runnable() { // from class: com.ironsource.s6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0456s6.h(this.f$0);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.k = cif.a(runnable, DurationKt.toDuration(jB, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.D
    public void b(AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.j.b(instance);
        this.b.e().a().g(c());
        this.a.h().b(com.unity3d.mediation.a.a(b()));
    }

    public final InterfaceC0507v6 d() {
        return this.d;
    }

    public final LevelPlayAdInfo e() {
        AbstractC0568z abstractC0568zC = this.j.c();
        if (abstractC0568zC != null) {
            return abstractC0568zC.e();
        }
        return null;
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.a.a().b(strC, b());
            N3 n3A = this.a.p().a(strC, b());
            if (n3A.d()) {
                this.b.e().a().b(strC, n3A.e());
            }
        }
    }

    public final void a(InterfaceC0507v6 interfaceC0507v6) {
        Intrinsics.checkNotNullParameter(interfaceC0507v6, "<set-?>");
        this.d = interfaceC0507v6;
    }

    public final void a(b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C0366n0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.h = loadListener;
        this.l = Long.valueOf(this.g.a());
        this.b.a(new C0417q0(this.c.b()));
        C c2 = new C() { // from class: com.ironsource.s6$$ExternalSyntheticLambda1
            @Override // com.ironsource.C
            public final AbstractC0568z a(A a2, G g) {
                return C0456s6.a(this.f$0, a2, g);
            }
        };
        this.b.e().e().a(this.c.u());
        this.j.a(c2);
    }

    /* JADX INFO: renamed from: com.ironsource.s6$c */
    public static final class c implements tg {
        c() {
        }

        @Override // com.ironsource.tg
        public void a(int i, String errorReason) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l = C0456s6.this.l;
            if (l != null) {
                lValueOf = Long.valueOf(C0456s6.this.g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C0456s6.this.b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i, errorReason, C0456s6.this.c.u());
            b bVar = C0456s6.this.h;
            if (bVar != null) {
                bVar.b(C0456s6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.tg
        public void b(AbstractC0568z instance) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l = C0456s6.this.l;
            if (l != null) {
                lValueOf = Long.valueOf(C0456s6.this.g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C0456s6.this.b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C0456s6.this.c.u());
            C0456s6.this.g();
            b bVar = C0456s6.this.h;
            if (bVar != null) {
                bVar.b(C0456s6.this, instance.e());
            }
        }

        @Override // com.ironsource.tg
        public void a(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C0456s6.this.b.e().a().e(C0456s6.this.c());
            C0456s6.this.g();
            b bVar = C0456s6.this.h;
            if (bVar != null) {
                bVar.c(C0456s6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC0338l6
    public void b(C0321k6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.b.e().a().b(c());
        this.d.onClosed();
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public /* synthetic */ C0456s6(Ab ab, V0 v0, AbstractC0501v0 abstractC0501v0, InterfaceC0507v6 interfaceC0507v6, ng ngVar, Function3 function3, Cif cif, InterfaceC0454s4 interfaceC0454s4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ab, v0, abstractC0501v0, interfaceC0507v6, (i & 16) != 0 ? null : ngVar, (i & 32) != 0 ? null : function3, (i & 64) != 0 ? new V6(W6.a(v0.a())) : cif, (i & 128) != 0 ? new InterfaceC0454s4.a() : interfaceC0454s4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0568z a(C0456s6 this$0, A instanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function3 dVar = this$0.e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC0568z) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    public final void a(Activity activity, a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C0366n0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.i = displayListener;
        this.b.e().a().a(activity, c());
        InterfaceC0239fb<Unit> interfaceC0239fbF = f();
        if (interfaceC0239fbF instanceof InterfaceC0239fb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC0239fb.a) interfaceC0239fbF).b();
            ironLog.verbose(C0366n0.a(this.b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), "");
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        Cif.a aVar = this.k;
        if (aVar != null) {
            aVar.a();
        }
        this.j.a(new C0355m6(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0321k6 a(A a2, G g, InterfaceC0338l6 interfaceC0338l6) {
        return new C0321k6(new V0(this.b, D0.b.PROVIDER), a2, g, interfaceC0338l6);
    }

    private final mg a(ng ngVar) {
        tg tgVarA = a();
        if (ngVar != null) {
            return ngVar.a(tgVarA);
        }
        return new mg(this.b, this.c, tgVarA);
    }

    private final tg a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC0338l6
    public void a(C0321k6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.b.e().a().l(c());
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        h();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.InterfaceC0338l6
    public void a(C0321k6 fullscreenInstance, IronSourceError error) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C0366n0.a(this.b, error.toString(), (String) null, 2, (Object) null));
        this.b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC0338l6
    public void a(C0321k6 fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C0366n0.a(this.b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.D
    public void a(AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.e().a().a(c());
        this.d.g();
    }
}
