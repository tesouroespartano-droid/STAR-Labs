package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0389o6 implements InterfaceC0439r6 {
    private final Ta a;
    private final InterfaceC0454s4 b;
    private final long c;
    private final LevelPlayAdInfo d;

    public C0389o6(Ta adInternal, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        String string = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.d = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public InterfaceC0279i0 c() {
        return new InterfaceC0279i0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClicked() {
        this.a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClosed() {
        this.a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(error, this.b.a() - this.c);
        this.a.a(C0304j6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Ta ta = this.a;
        ta.a(new C0372n6(ta, adInfo, this.b));
        this.a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a() {
        this.a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
