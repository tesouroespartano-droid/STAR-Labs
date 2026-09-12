package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0251g6 extends AbstractC0348m implements InterfaceC0507v6, InterfaceC0524w6 {
    private final InterfaceC0285i6 b;
    private final C0228f0 c;
    private final InterfaceC0541x6 d;

    public /* synthetic */ C0251g6(InterfaceC0285i6 interfaceC0285i6, C0366n0 c0366n0, C0228f0 c0228f0, InterfaceC0541x6.b bVar, InterfaceC0473t6 interfaceC0473t6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0285i6, c0366n0, c0228f0, (i & 8) != 0 ? new InterfaceC0541x6.b() : bVar, interfaceC0473t6);
    }

    public final void a(Activity activity, Placement placement) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c.a(placement);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.J0
    public void g() {
        this.b.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC0507v6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public final void p() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void b(IronSourceError ironSourceError) {
        InterfaceC0285i6 interfaceC0285i6 = this.b;
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC0285i6.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
    }

    public C0251g6(InterfaceC0285i6 listener, C0366n0 adTools, C0228f0 adProperties, InterfaceC0541x6.b adUnitStrategyFactory, InterfaceC0473t6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.b = listener;
        this.c = adProperties;
        this.d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void a(IronSourceError ironSourceError) {
        InterfaceC0285i6 interfaceC0285i6 = this.b;
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC0285i6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.c.c()));
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC0507v6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.b.a(reward);
    }

    @Override // com.ironsource.InterfaceC0524w6
    public void a() {
        this.b.a();
    }
}
