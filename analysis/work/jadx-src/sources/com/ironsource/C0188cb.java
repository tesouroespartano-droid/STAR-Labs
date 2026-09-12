package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0188cb extends AbstractC0427qa implements Kb {
    private final UUID d;
    private final C0152ab e;
    private Hb f;
    private String g;
    private Placement h;
    private InterfaceC0222eb i;
    private AdapterNativeAdData j;
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C0188cb(UUID uuid, C0152ab c0152ab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C0542x7.a.a() : uuid, c0152ab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0188cb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Hb hb = this$0.f;
            if (hb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                hb = null;
            }
            hb.q();
            this$0.i = null;
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0188cb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Hb hb = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C0366n0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Hb hb2 = this$0.f;
            if (hb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                hb = hb2;
            }
            hb.r();
        }
    }

    private final Hb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String strB = b();
        Placement placement = this.h;
        if (placement == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            placement = null;
        }
        Rb rb = new Rb(uuid, strB, placement);
        a(rb);
        return new Hb(this, a(), rb);
    }

    @Override // com.ironsource.AbstractC0427qa
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.a(this.f$0);
            }
        });
    }

    public final UUID g() {
        return this.d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC0170bb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC0170bb.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.Kb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, b());
        b(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.a(this.f$0, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0188cb(UUID adId, C0152ab nativeAd) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        super(new C0366n0(ad_unit, D0.b.MEDIATION));
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().e().a(new C0365n(ad_unit, adId, b()));
    }

    public final void a(final InterfaceC0222eb interfaceC0222eb) {
        a(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.a(this.f$0, interfaceC0222eb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0188cb this$0, InterfaceC0222eb interfaceC0222eb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC0222eb;
    }

    @Override // com.ironsource.Kb
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Eb eb = new Eb();
        Hb hb = this.f;
        if (hb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            hb = null;
        }
        hb.a(eb);
        this.j = eb.a();
        this.k = eb.b();
        b(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.b(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0188cb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC0222eb interfaceC0222eb = this$0.i;
        if (interfaceC0222eb != null) {
            interfaceC0222eb.b(this$0.e, adInfo);
        }
    }

    @Override // com.ironsource.Kb
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.a(this.f$0, adInfo);
            }
        });
    }

    public final void b(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.cb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0188cb.a(this.f$0, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0188cb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC0222eb interfaceC0222eb = this$0.i;
        if (interfaceC0222eb != null) {
            interfaceC0222eb.a(this$0.e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0188cb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC0222eb interfaceC0222eb = this$0.i;
        if (interfaceC0222eb != null) {
            interfaceC0222eb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0188cb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
