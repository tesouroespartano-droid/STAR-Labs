package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0575z6 implements D6 {
    private final C0558y6 a;

    public C0575z6(C0558y6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.D6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.D6
    public void b(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.D6
    public void c(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.D6
    public void loadAd() {
        C0456s6 c0456s6A = this.a.b().a(true, this.a.c());
        this.a.a(new B6(this.a, c0456s6A, true));
        c0456s6A.a(this.a);
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.D6
    public void b(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad display failed before load called");
    }
}
