package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Af {
    private final InterfaceC0448rf a;

    public static final class a implements LevelPlayInterstitialListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
            Af.this.a(Bf.f, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            Af.this.a(Bf.g, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            Af.this.a(Bf.b, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
            Af.this.a(Bf.c, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
            Af.this.a(Bf.a, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            Af.this.a(Bf.e, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
            Af.this.a(Bf.d, IronSource.AD_UNIT.INTERSTITIAL, Ef.a.a(adInfo));
        }
    }

    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        b() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(AdInfo adInfo) {
            Af.this.a(Bf.h, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(Placement placement, AdInfo adInfo) {
            Af.this.a(Bf.f, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(C0584zf.a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(AdInfo adInfo) {
            Af.this.a(Bf.g, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            Af.this.a(Bf.b, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(AdInfo adInfo) {
            Af.this.a(Bf.c, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(AdInfo adInfo) {
            Af.this.a(Bf.a, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(Placement placement, AdInfo adInfo) {
            Af.this.a(Bf.i, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(C0584zf.a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            Af.this.a(Bf.e, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            Af.this.a(Bf.n, IronSource.AD_UNIT.REWARDED_VIDEO, Ef.a.a(new Object[0]));
        }
    }

    public static final class c implements LevelPlayBannerListener {
        c() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
            Af.this.a(Bf.f, IronSource.AD_UNIT.BANNER, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
            Af.this.a(Bf.k, IronSource.AD_UNIT.BANNER, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            Af.this.a(Bf.b, IronSource.AD_UNIT.BANNER, Ef.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            Af.this.a(Bf.j, IronSource.AD_UNIT.BANNER, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
            Af.this.a(Bf.m, IronSource.AD_UNIT.BANNER, Ef.a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
            Af.this.a(Bf.l, IronSource.AD_UNIT.BANNER, Ef.a.a(adInfo));
        }
    }

    public Af(InterfaceC0448rf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.a = javaScriptEvaluator;
    }

    private final void b() {
        C0584zf c0584zf = C0584zf.a;
        c0584zf.a((LevelPlayInterstitialListener) null);
        c0584zf.a((LevelPlayRewardedVideoBaseListener) null);
        c0584zf.a((LevelPlayBannerListener) null);
    }

    private final void c() {
        C0584zf.a.i();
    }

    public final void d() {
        C0584zf c0584zf = C0584zf.a;
        c0584zf.a(new a());
        c0584zf.a(new b());
        c0584zf.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.a.a(str, ad_unit, list);
    }
}
