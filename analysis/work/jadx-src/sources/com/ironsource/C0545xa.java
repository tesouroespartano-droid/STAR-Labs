package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0545xa implements InterfaceC0477ta {
    private final C0366n0 a;
    private final X2 b;
    private final long c;
    private final long d;
    private final K2 e;
    private InterfaceC0494ua f;
    private final O2 g;
    private final Cif h;
    private final InterfaceC0454s4 i;
    private L0 j;
    private InterfaceC0535x0 k;
    private P2 l;
    private Ha m;

    /* JADX INFO: renamed from: com.ironsource.xa$a */
    public static final class a implements P2 {
        a() {
        }

        public void a() {
            C0545xa.this.n().onAdLeftApplication();
        }

        public void b() {
            C0545xa.this.n().n();
        }

        public void c() {
            C0545xa.this.n().l();
        }

        @Override // com.ironsource.J0
        public void g() {
            C0545xa.this.n().onAdClicked();
        }

        @Override // com.ironsource.P2
        public /* bridge */ /* synthetic */ Unit i() {
            a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.P2
        public /* bridge */ /* synthetic */ Unit j() {
            c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.P2
        public /* bridge */ /* synthetic */ Unit m() {
            b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xa$b */
    public static final class b implements L0 {
        b() {
        }

        @Override // com.ironsource.L0
        public void a(C0450s0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            C0545xa.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(IronSourceError ironSourceError) {
            C0545xa.this.m().a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xa$c */
    public static final class c implements InterfaceC0535x0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC0535x0
        public void b(IronSourceError ironSourceError) {
            C0545xa.this.n().d(ironSourceError);
        }

        @Override // com.ironsource.InterfaceC0535x0
        public void f() {
            C0545xa.this.n().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xa$d */
    static final class d extends Lambda implements Function0<Unit> {
        final /* synthetic */ M2 b;
        final /* synthetic */ AbstractC0318k3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(M2 m2, AbstractC0318k3 abstractC0318k3) {
            super(0);
            this.b = m2;
            this.c = abstractC0318k3;
        }

        public final void a() {
            C0545xa.this.a(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xa$e */
    static final class e extends Lambda implements Function0<Unit> {
        final /* synthetic */ M2 b;
        final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(M2 m2, Long l) {
            super(0);
            this.b = m2;
            this.c = l;
        }

        public final void a() {
            C0545xa c0545xa = C0545xa.this;
            c0545xa.a((Ha) new Ba(c0545xa, this.b, this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xa$f */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ M2 b;
        final /* synthetic */ AbstractC0318k3 c;
        final /* synthetic */ Long d;

        /* JADX INFO: renamed from: com.ironsource.xa$f$a */
        static final class a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C0545xa a;
            final /* synthetic */ M2 b;
            final /* synthetic */ AbstractC0318k3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C0545xa c0545xa, M2 m2, AbstractC0318k3 abstractC0318k3) {
                super(0);
                this.a = c0545xa;
                this.b = m2;
                this.c = abstractC0318k3;
            }

            public final void a() {
                this.a.a(this.b, this.c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.xa$f$b */
        static final class b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C0545xa a;
            final /* synthetic */ M2 b;
            final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C0545xa c0545xa, M2 m2, Long l) {
                super(0);
                this.a = c0545xa;
                this.b = m2;
                this.c = l;
            }

            public final void a() {
                C0545xa c0545xa = this.a;
                c0545xa.a((Ha) new Ba(c0545xa, this.b, this.c));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        f(M2 m2, AbstractC0318k3 abstractC0318k3, Long l) {
            this.b = m2;
            this.c = abstractC0318k3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C0545xa.this.k().getViewTreeObserver().isAlive()) {
                C0545xa.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (kg.a(C0545xa.this.k(), new Rect())) {
                C0309jb.a((C0309jb) C0545xa.this.a(), Vd.a.a(new a(C0545xa.this, this.b, this.c)), 0L, 2, (Object) null);
            } else {
                C0309jb.a((C0309jb) C0545xa.this.a(), Vd.a.a(new b(C0545xa.this, this.b, this.d)), 0L, 2, (Object) null);
            }
        }
    }

    public C0545xa(C0366n0 adTools, X2 bannerContainer, long j, long j2, K2 bannerAdProperties, InterfaceC0494ua strategyListener, O2 bannerAdUnitFactory, Cif taskScheduler, InterfaceC0454s4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = bannerAdProperties;
        this.f = strategyListener;
        this.g = bannerAdUnitFactory;
        this.h = taskScheduler;
        this.i = timeProvider;
        this.j = new b();
        this.k = new c();
        this.l = new a();
        this.m = new C0579za(this, false, 2, null);
    }

    public final C0366n0 a() {
        return this.a;
    }

    public final void b(InterfaceC0494ua interfaceC0494ua) {
        Intrinsics.checkNotNullParameter(interfaceC0494ua, "<set-?>");
        this.f = interfaceC0494ua;
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void c() {
        this.m.c();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void d() {
        this.m.d();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void e() {
        this.m.e();
    }

    public final P2 f() {
        return this.l;
    }

    public final L0 g() {
        return this.j;
    }

    public final InterfaceC0535x0 h() {
        return this.k;
    }

    public final K2 i() {
        return this.e;
    }

    public final O2 j() {
        return this.g;
    }

    public final X2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final Ha m() {
        return this.m;
    }

    public final InterfaceC0494ua n() {
        return this.f;
    }

    public final Cif o() {
        return this.h;
    }

    public final InterfaceC0454s4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.a.e().h().h("Banner view is not visible");
    }

    public final void a(L0 l0) {
        Intrinsics.checkNotNullParameter(l0, "<set-?>");
        this.j = l0;
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void b() {
        this.m.b();
    }

    public final void a(InterfaceC0535x0 interfaceC0535x0) {
        Intrinsics.checkNotNullParameter(interfaceC0535x0, "<set-?>");
        this.k = interfaceC0535x0;
    }

    public final void a(P2 p2) {
        Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.l = p2;
    }

    public final void a(Ha ha) {
        Intrinsics.checkNotNullParameter(ha, "<set-?>");
        this.m = ha;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(C0450s0 adUnitCallback, M2 currentAdUnit, M2 m2, AbstractC0318k3 reloadReason, boolean z, Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.k);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f.onAdLoaded(levelPlayAdInfoC);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C0366n0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (m2 != null) {
            m2.a(false);
        }
        if (z) {
            this.m = new Da(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(IronSourceError ironSourceError, M2 currentAdUnit, AbstractC0318k3 reloadReason, boolean z, boolean z2, Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f.onAdLoadFailed(ironSourceError);
        if (z2) {
            this.m = new Da(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason);
        }
    }

    public final void a(final M2 currentAdUnit, final AbstractC0318k3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C0309jb.a(this.a, new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0545xa.a(this.f$0, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0545xa this$0, M2 currentAdUnit, AbstractC0318k3 reloadReason, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (kg.a(this$0.b, new Rect())) {
            C0309jb.a((C0309jb) this$0.a, Vd.a.a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            C0309jb.a((C0309jb) this$0.a, Vd.a.a(this$0.new e(currentAdUnit, l)), 0L, 2, (Object) null);
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public /* synthetic */ C0545xa(C0366n0 c0366n0, X2 x2, long j, long j2, K2 k2, InterfaceC0494ua interfaceC0494ua, O2 o2, Cif cif, InterfaceC0454s4 interfaceC0454s4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0366n0, x2, j, j2, k2, interfaceC0494ua, o2, (i & 128) != 0 ? new V6(W6.a(c0366n0.a())) : cif, interfaceC0454s4);
    }

    public final void a(M2 currentAdUnit, AbstractC0318k3 reloadReason) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        M2 m2A = this.g.a(false);
        Ea ea = new Ea(this, currentAdUnit, m2A, this.i.a());
        a(reloadReason);
        this.m = ea;
        m2A.a(this.j);
    }

    private final void a(AbstractC0318k3 abstractC0318k3) {
        this.a.e().h().a(abstractC0318k3.c(), abstractC0318k3.b(), abstractC0318k3.a());
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void a(InterfaceC0494ua listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }
}
