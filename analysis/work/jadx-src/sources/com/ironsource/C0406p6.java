package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0406p6 implements InterfaceC0439r6 {
    private final Ta a;
    private final LevelPlayAdInfo b;

    public C0406p6(Ta adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public InterfaceC0279i0 c() {
        return new InterfaceC0279i0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Ta.a(this.a, new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClicked() {
        this.a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClosed() {
        this.a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C0366n0 c0366n0F = this.a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C0366n0.a(c0366n0F, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c0366n0F.e().h().e();
        Ta ta = this.a;
        ta.a(new C0423q6(ta, levelPlayAdInfo));
        c0366n0F.e(new Runnable() { // from class: com.ironsource.p6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0406p6.a(this.f$0, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(a(error, this.b));
        this.a.a(error, this.b);
    }

    private final InterfaceC0439r6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C0216e5.a.a(Ef.a.a(levelPlayAdError))) {
            Ta ta = this.a;
            return new C0372n6(ta, levelPlayAdInfo, ta.j());
        }
        return new C0304j6(this.a, C0304j6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a() {
        this.a.a("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0406p6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        Ua uaK = this$0.a.k();
        if (uaK != null) {
            uaK.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
