package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ja implements InterfaceC0477ta {
    private final C0366n0 a;
    private final X2 b;
    private final O2 c;
    private InterfaceC0494ua d;
    private Oa e;
    private M2 f;
    private final L0 g;
    private final InterfaceC0535x0 h;
    private final P2 i;

    public static final class a implements P2 {
        a() {
        }

        public void a() {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.n();
            }
        }

        public void c() {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.l();
            }
        }

        @Override // com.ironsource.J0
        public void g() {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.onAdClicked();
            }
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

    public static final class b implements L0 {
        b() {
        }

        @Override // com.ironsource.L0
        public void a(C0450s0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            Ja.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(IronSourceError ironSourceError) {
            Ja.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC0535x0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC0535x0
        public void b(IronSourceError ironSourceError) {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.d(ironSourceError);
            }
        }

        @Override // com.ironsource.InterfaceC0535x0
        public void f() {
            InterfaceC0494ua interfaceC0494uaM = Ja.this.m();
            if (interfaceC0494uaM != null) {
                interfaceC0494uaM.k();
            }
        }
    }

    public Ja(C0366n0 adTools, X2 bannerContainer, O2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = bannerAdUnitFactory;
        this.e = new Ka(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    public final C0366n0 a() {
        return this.a;
    }

    public final void b(InterfaceC0494ua interfaceC0494ua) {
        this.d = interfaceC0494ua;
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void c() {
        this.e.c();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void d() {
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void e() {
    }

    public final P2 f() {
        return this.i;
    }

    public final L0 g() {
        return this.g;
    }

    public final InterfaceC0535x0 h() {
        return this.h;
    }

    public final O2 i() {
        return this.c;
    }

    public final X2 j() {
        return this.b;
    }

    public final M2 k() {
        return this.f;
    }

    public final Oa l() {
        return this.e;
    }

    public final InterfaceC0494ua m() {
        return this.d;
    }

    public final void a(Oa oa) {
        Intrinsics.checkNotNullParameter(oa, "<set-?>");
        this.e = oa;
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void b() {
        this.e.b();
    }

    public final void a(M2 m2) {
        this.f = m2;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(C0450s0 adUnitCallback, M2 adUnit) {
        InterfaceC0494ua interfaceC0494ua;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC == null || (interfaceC0494ua = this.d) == null) {
            return;
        }
        interfaceC0494ua.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC0494ua interfaceC0494ua = this.d;
        if (interfaceC0494ua != null) {
            interfaceC0494ua.onAdLoadFailed(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void a(InterfaceC0494ua listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }
}
