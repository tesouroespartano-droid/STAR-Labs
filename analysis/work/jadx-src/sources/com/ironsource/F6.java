package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class F6 implements K6 {
    private final E6 a;
    private final C0456s6 b;
    private final boolean c;

    public F6(E6 strategy, C0456s6 c0456s6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = c0456s6;
        this.c = z;
    }

    @Override // com.ironsource.K6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.K6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.K6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.K6
    public void loadAd() {
        C0456s6 c0456s6A = this.a.b().a(true, this.a.c());
        E6 e6 = this.a;
        e6.a(new J6(e6, c0456s6A));
        c0456s6A.a(this.a);
    }

    @Override // com.ironsource.K6
    public void b(IronSourceError ironSourceError) {
        this.a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ F6(E6 e6, C0456s6 c0456s6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e6, c0456s6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.K6
    public void a(IronSourceError ironSourceError) {
        this.a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.K6
    public void a() {
        this.a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.K6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
