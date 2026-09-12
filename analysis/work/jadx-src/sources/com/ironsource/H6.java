package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class H6 implements K6 {
    private final E6 a;
    private final C0456s6 b;
    private final C0456s6 c;

    public H6(E6 strategy, C0456s6 currentAdUnit, C0456s6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
    }

    @Override // com.ironsource.K6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.K6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.K6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        E6 e6 = this.a;
        e6.a(new G6(e6, this.b, this.c, adInfo));
    }

    @Override // com.ironsource.K6
    public void loadAd() {
        E6 e6 = this.a;
        e6.a(new J6(e6, this.c));
    }

    @Override // com.ironsource.K6
    public void b(IronSourceError ironSourceError) {
        this.a.a("show failed before progressive load success");
    }

    @Override // com.ironsource.K6
    public void a(IronSourceError ironSourceError) {
        E6 e6 = this.a;
        e6.a(new F6(e6, this.b, false, 4, null));
    }

    @Override // com.ironsource.K6
    public void a() {
        this.a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.K6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success before progressive load success");
    }
}
