package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0423q6 implements InterfaceC0439r6 {
    private final Ta a;
    private final LevelPlayAdInfo b;

    public C0423q6(Ta adInternal, LevelPlayAdInfo adInfo) {
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
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC0439r6
    public InterfaceC0279i0 c() {
        return new InterfaceC0279i0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Ta.a(this.a, new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C0366n0.a(this.a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().e(new Runnable() { // from class: com.ironsource.q6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0423q6.a(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C0366n0.a(this.a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().d(new Runnable() { // from class: com.ironsource.q6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0423q6.b(this.f$0);
            }
        });
        this.a.f().e(new Runnable() { // from class: com.ironsource.q6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0423q6.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0423q6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(C0304j6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0423q6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Ua uaK = this$0.a.k();
        if (uaK != null) {
            uaK.onAdClosed(this$0.b);
        }
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a() {
        this.a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC0439r6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0423q6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Ua uaK = this$0.a.k();
        if (uaK != null) {
            uaK.onAdClicked(this$0.b);
        }
    }
}
