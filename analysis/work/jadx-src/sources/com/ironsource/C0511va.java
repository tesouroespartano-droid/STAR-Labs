package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0511va implements InterfaceC0537x2 {
    public static final a n = new a(null);
    private final UUID a;
    private final String b;
    private final X2 c;
    private final LevelPlayBannerAdView.Config d;
    private final C0366n0 e;
    private final R8 f;
    private LevelPlayAdSize g;
    private LevelPlayBannerAdViewListener h;
    private String i;
    private InterfaceC0356m7 j;
    private Boolean k;
    private Placement l;
    private boolean m;

    /* JADX INFO: renamed from: com.ironsource.va$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return TuplesKt.to(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C0511va(UUID adId, String adUnitId, X2 bannerContainer, LevelPlayBannerAdView.Config config, C0366n0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = Ab.s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        adTools.e().a(new C0365n(IronSource.AD_UNIT.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C0511va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m) {
            IronLog.INTERNAL.warning(C0366n0.a(this$0.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.j == null) {
            IronLog.INTERNAL.warning(C0366n0.a(this$0.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C0309jb.a(this$0.e, new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.b(this.f$0);
            }
        }, 0L, 2, (Object) null);
        InterfaceC0356m7 interfaceC0356m7 = this$0.j;
        if (interfaceC0356m7 != null) {
            interfaceC0356m7.c();
        }
        this$0.j = null;
        this$0.k = null;
        this$0.h = null;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String string = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.g()) {
            String string2 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Ra raA = Ab.s.d().e().a();
        if (raA != null && raA.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(this.f$0);
            }
        });
    }

    public final UUID c() {
        return this.a;
    }

    public final LevelPlayAdSize d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.c(this.f$0);
            }
        });
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final InterfaceC0356m7 interfaceC0356m7 = this.j;
        if (interfaceC0356m7 != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    C0511va.a(this.f$0, interfaceC0356m7);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final InterfaceC0356m7 interfaceC0356m7 = this.j;
        if (interfaceC0356m7 != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    C0511va.b(this.f$0, interfaceC0356m7);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0511va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m) {
            IronLog.INTERNAL.warning(C0366n0.a(this$0.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m = true;
        if (this$0.h()) {
            InterfaceC0356m7 interfaceC0356m7A = this$0.a();
            this$0.j = interfaceC0356m7A;
            Boolean bool = this$0.k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    interfaceC0356m7A.e();
                } else {
                    interfaceC0356m7A.d();
                }
            }
            interfaceC0356m7A.b();
        }
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void d(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void e(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.c(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0511va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        ViewParent parent = this$0.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0511va this$0, InterfaceC0356m7 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().c();
        it.e();
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.b(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(this.f$0, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0511va this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = levelPlayBannerAdViewListener;
    }

    public final void a(final LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        IronLog.API.info("LevelPlayBannerAdView.setBannerAdSize() adSize: " + adSize);
        this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(this.f$0, adSize);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void c(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.d(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0511va this$0, LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adSize, "$adSize");
        if (this$0.m) {
            return;
        }
        this$0.g = adSize;
    }

    public final void a(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        IronLog.API.info("LevelPlayBannerAdView.setPlacementName() placementName: " + placementName);
        this.e.d(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(this.f$0, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0511va this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        if (this$0.m) {
            return;
        }
        this$0.i = placementName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0511va this$0, InterfaceC0356m7 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().b();
        it.d();
    }

    private final InterfaceC0356m7 a() {
        Placement placement;
        this.l = this.e.a(this.i);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        Placement placement2 = this.l;
        if (placement2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            placement = null;
        } else {
            placement = placement2;
        }
        K2 k2 = new K2(uuid, str, placement, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.e().a(new B0(this.e, k2, null, 4, null));
        ISBannerSize iSBannerSizeA = this.e.a(k2.h());
        D5 d5E = this.e.e();
        C0366n0 c0366n0 = this.e;
        Placement placement3 = this.l;
        if (placement3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            placement3 = null;
        }
        d5E.a(new Z2(c0366n0, iSBannerSizeA, placement3.getPlacementName()));
        if (Ab.s.d().g().c()) {
            IronLog.INTERNAL.verbose(C0366n0.a(this.e, "Using legacy BannerAdController", (String) null, 2, (Object) null));
            return new C0520w2(this, this.e, k2, this.c);
        }
        IronLog.INTERNAL.verbose(C0366n0.a(this.e, "Using new LevelPlayBannerAdController", (String) null, 2, (Object) null));
        return new C0460sa(this, this.e, k2, this.c);
    }

    public /* synthetic */ C0511va(UUID uuid, String str, X2 x2, LevelPlayBannerAdView.Config config, C0366n0 c0366n0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C0542x7.a.a() : uuid, str, x2, config, (i & 16) != 0 ? new C0366n0(IronSource.AD_UNIT.BANNER, D0.b.MEDIATION) : c0366n0);
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void a(final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0511va.a(levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, C0511va this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C0511va.a(adInfo, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, C0511va this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0537x2
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.va$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0511va.e(adInfo, this);
            }
        });
    }
}
