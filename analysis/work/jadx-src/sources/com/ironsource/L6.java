package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class L6 implements InterfaceC0541x6, C0456s6.b, C0456s6.a {
    private final C0366n0 a;
    private final InterfaceC0541x6.a b;
    private final InterfaceC0473t6 c;
    private final InterfaceC0507v6 d;
    private final InterfaceC0524w6 e;
    private C0456s6 f;

    public L6(C0366n0 adTools, InterfaceC0541x6.a config, InterfaceC0473t6 fullscreenAdUnitFactory, InterfaceC0507v6 fullscreenAdUnitListener, InterfaceC0524w6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = config;
        this.c = fullscreenAdUnitFactory;
        this.d = fullscreenAdUnitListener;
        this.e = listener;
    }

    public final C0366n0 a() {
        return this.a;
    }

    public final InterfaceC0541x6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C0456s6.b
    public void c(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC0541x6
    public void loadAd() {
        C0456s6 c0456s6A = this.c.a(true, this.d);
        c0456s6A.a(this);
        this.f = c0456s6A;
    }

    @Override // com.ironsource.InterfaceC0541x6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0456s6 c0456s6 = this.f;
        if (c0456s6 != null) {
            c0456s6.a(activity, this);
        }
    }

    @Override // com.ironsource.C0456s6.b
    public void b(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    @Override // com.ironsource.C0456s6.b
    public void a(C0456s6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C0456s6.b
    public void b(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    @Override // com.ironsource.C0456s6.a
    public void a(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C0456s6.a
    public void a(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.b(ironSourceError);
    }
}
