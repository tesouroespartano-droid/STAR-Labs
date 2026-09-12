package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class E6 implements InterfaceC0541x6, C0456s6.b, C0456s6.a {
    public static final a f = new a(null);
    public static final String g = "Fullscreen ProgressiveOnShown Strategy";
    private final C0366n0 a;
    private final InterfaceC0473t6 b;
    private final InterfaceC0507v6 c;
    private final InterfaceC0524w6 d;
    private K6 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E6(C0366n0 adTools, InterfaceC0473t6 factory, InterfaceC0507v6 fullscreenAdUnitListener, InterfaceC0524w6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new F6(this, null, false, 4, null);
    }

    public final C0366n0 a() {
        return this.a;
    }

    public final InterfaceC0473t6 b() {
        return this.b;
    }

    public final InterfaceC0507v6 c() {
        return this.c;
    }

    public final InterfaceC0524w6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0541x6
    public void loadAd() {
        this.e.loadAd();
    }

    @Override // com.ironsource.InterfaceC0541x6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C0456s6.b
    public void b(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adInfo);
    }

    @Override // com.ironsource.C0456s6.b
    public void c(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    public final void a(K6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C0456s6.b
    public void b(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
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

    @Override // com.ironsource.C0456s6.b
    public void a(C0456s6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a();
    }
}
