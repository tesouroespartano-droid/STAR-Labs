package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0516vf implements C0364mf.c, C0364mf.d, C0364mf.b {
    private final R8.a a;
    private final WeakReference<TestSuiteActivity> b;
    private final Handler c;
    private final AtomicReference<LevelPlayBannerAdView> d;
    private final AtomicReference<LevelPlayInterstitialAd> e;
    private final AtomicReference<LevelPlayRewardedAd> f;

    public C0516vf(TestSuiteActivity activity, Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = Ab.s.a().c();
        this.b = new WeakReference<>(activity);
        this.c = handler;
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    private final TestSuiteActivity f() {
        return this.b.get();
    }

    @Override // com.ironsource.C0364mf.d
    public void a(C0465sf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new C0567yf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    @Override // com.ironsource.C0364mf.c
    public void b(C0465sf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new C0550xf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    @Override // com.ironsource.C0364mf.d
    public void c() {
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityF, null, 2, null);
        }
    }

    @Override // com.ironsource.C0364mf.b
    public void d() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new Runnable() { // from class: com.ironsource.vf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0516vf.b(testSuiteActivityF, andSet);
            }
        });
    }

    @Override // com.ironsource.C0364mf.c
    public boolean e() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.C0364mf.d
    public boolean a() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.C0364mf.c
    public void b() {
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityF, null, 2, null);
        }
    }

    @Override // com.ironsource.C0364mf.b
    public void a(C0465sf loadAdConfig, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        d();
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            this.a.a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(C0584zf.a.b(description, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
            String strA = loadAdConfig.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityF, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new C0533wf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    @Override // com.ironsource.C0364mf.b
    public void a(double d) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.ironsource.vf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0516vf.a(testSuiteActivityF, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, Ef.a.a((Context) testSuiteActivity));
    }
}
