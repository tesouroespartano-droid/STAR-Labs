package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0256gb {
    private final Ta a;

    /* JADX INFO: renamed from: com.ironsource.gb$a */
    public static final class a implements InterfaceC0518w0 {
        final /* synthetic */ J7 a;

        a(J7 j7) {
            this.a = j7;
        }

        @Override // com.ironsource.InterfaceC0518w0
        public AbstractC0501v0 a(boolean z, C0228f0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return Gd.z.a(adProperties, this.a.e().a(), z);
        }
    }

    public C0256gb(String adUnitId, Ta.b config, C0366n0 adTools, C0268h6 adControllerFactory, J7 provider, InterfaceC0454s4 currentTimeProvider, C0542x7 idFactory) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.a = new Ta(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.a.n();
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C0273hb.b(levelPlayRewardedAdListener) : null);
    }

    private final a a(J7 j7) {
        return new a(j7);
    }
}
