package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0372n6 implements InterfaceC0439r6 {
    private final Ta a;
    private LevelPlayAdInfo b;
    private final InterfaceC0454s4 c;
    private final long d;

    public C0372n6(Ta adInternal, LevelPlayAdInfo adInfo, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Placement placementA = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Ta ta = this.a;
        ta.a(new C0406p6(ta, levelPlayAdInfo));
        this.a.c().a(activity, placementA);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public InterfaceC0279i0 c() {
        N3 n3A = this.a.l().f().a(this.a.h());
        return n3A.d() ? InterfaceC0279i0.a.c.a(n3A.e()) : InterfaceC0279i0.b.a;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void loadAd() {
        this.a.f().e().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClicked() {
        this.a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClosed() {
        this.a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C0366n0 c0366n0F = this.a.f();
        IronLog.INTERNAL.verbose(C0366n0.a(c0366n0F, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c0366n0F.e().h().a(this.b, adInfo);
        this.b = adInfo;
        c0366n0F.e(new Runnable() { // from class: com.ironsource.n6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0372n6.a(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a() {
        IronLog.INTERNAL.verbose(C0366n0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C0304j6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0372n6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ua uaK = this$0.a.k();
        if (uaK != null) {
            uaK.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
