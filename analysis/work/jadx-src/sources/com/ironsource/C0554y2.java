package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0554y2 extends AbstractC0568z implements BannerAdListener {
    private WeakReference<A2> x;
    private View y;
    private FrameLayout.LayoutParams z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0554y2(V0 adTools, A instanceData, G adInstancePayload, A2 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.x = new WeakReference<>(listener);
    }

    private final ISBannerSize I() {
        V0 v0F = f();
        AbstractC0501v0 abstractC0501v0I = n().i();
        Intrinsics.checkNotNull(abstractC0501v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return v0F.a(((N2) abstractC0501v0I).b().h());
    }

    private final void J() {
        Placement placementJ = j();
        if (placementJ != null) {
            f().e().a().f(placementJ.getPlacementName());
        }
        A2 a2 = this.x.get();
        if (a2 != null) {
            a2.a(this);
        }
    }

    private final void K() {
        Placement placementJ = j();
        if (placementJ != null) {
            f().e().a().c(placementJ.getPlacementName());
        }
        A2 a2 = this.x.get();
        if (a2 != null) {
            a2.b(this);
        }
    }

    private final void L() {
        Placement placementJ = j();
        if (placementJ != null) {
            f().e().a().h(placementJ.getPlacementName());
        }
        A2 a2 = this.x.get();
        if (a2 != null) {
            a2.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0554y2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0554y2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    @Override // com.ironsource.AbstractC0568z
    protected void A() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataI = i();
        ISBannerSize iSBannerSizeI = I();
        Map<String, Object> adUnitData = adDataI.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeI));
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeI, this);
    }

    @Override // com.ironsource.AbstractC0568z
    public void a(I adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC0568z
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C0309jb.a(f(), new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.a(this.f$0);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object objG = g();
                Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.AbstractC0568z
    public LevelPlayAdInfo e() {
        String string = n().i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().i().b().c();
        String string2 = n().h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        ImpressionData impressionDataA = n().n().a(k());
        C0394ob c0394obD = n().n().d();
        AbstractC0501v0 abstractC0501v0I = n().i();
        Intrinsics.checkNotNull(abstractC0501v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, impressionDataA, c0394obD, ((N2) abstractC0501v0I).b().h(), n().i().l());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final View adView, final FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        C0309jb.a(f(), new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.a(this.f$0, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.d(this.f$0);
            }
        });
    }

    public final void a(final eg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C0309jb.a(f(), new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.a(this.f$0, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C0554y2 this$0, eg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.y;
        if (view == null || (layoutParams = this$0.z) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C0366n0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().d(new Runnable() { // from class: com.ironsource.y2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0554y2.e(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0554y2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y = null;
        this$0.z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0554y2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.y = adView;
        this$0.z = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C0554y2 this$0) {
        String placementName;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        M mA = this$0.f().e().a();
        Placement placementJ = this$0.j();
        if (placementJ == null || (placementName = placementJ.getPlacementName()) == null) {
            placementName = "";
        }
        mA.j(placementName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0554y2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }
}
