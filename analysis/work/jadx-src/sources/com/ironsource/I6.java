package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class I6 implements K6 {
    private final E6 a;
    private final C0456s6 b;

    public I6(E6 strategy, C0456s6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.K6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.K6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.K6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.K6
    public void loadAd() {
        E6 e6 = this.a;
        e6.a(new F6(e6, null, false, 4, null));
        this.a.loadAd();
    }

    @Override // com.ironsource.K6
    public void a(IronSourceError ironSourceError) {
        this.a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.K6
    public void b(IronSourceError ironSourceError) {
        if (!C0216e5.a.a(ironSourceError)) {
            E6 e6 = this.a;
            e6.a(new F6(e6, null, false, 4, null));
        }
        this.a.d().b(ironSourceError);
    }

    @Override // com.ironsource.K6
    public void a() {
        E6 e6 = this.a;
        e6.a(new F6(e6, null, true));
        this.a.d().a();
    }

    @Override // com.ironsource.K6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().a(adInfo);
        C0456s6 c0456s6A = this.a.b().a(false, this.a.c());
        E6 e6 = this.a;
        e6.a(new H6(e6, this.b, c0456s6A));
        c0456s6A.a(this.a);
    }
}
