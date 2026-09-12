package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0321k6 extends AbstractC0568z implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {
    private WeakReference<InterfaceC0338l6> x;
    private C0320k5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321k6(V0 adTools, A instanceData, G adInstancePayload, InterfaceC0338l6 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.x = new WeakReference<>(listener);
    }

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new R6().a(new String[]{P6.u}).optJSONObject(P6.u);
        if (jSONObjectOptJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(P6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Map<String, String> rvServerParams = com.ironsource.mediationsdk.p.m().s();
        if (rvServerParams != null) {
            Intrinsics.checkNotNullExpressionValue(rvServerParams, "rvServerParams");
            for (Map.Entry<String, String> entry : rvServerParams.entrySet()) {
                mapCreateMapBuilder.put("custom_" + ((Object) entry.getKey()), entry.getValue());
            }
        }
        for (String str : I()) {
            List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C0198d4.j.b}, false, 2, 2, (Object) null);
            if (listSplit$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                mapCreateMapBuilder.put("custom_" + ((String) listSplit$default.get(0)), (String) listSplit$default.get(1));
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private final void K() {
        this.y = new C0320k5();
        IronLog.INTERNAL.verbose(AbstractC0568z.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC0338l6 interfaceC0338l6 = this.x.get();
        if (interfaceC0338l6 != null) {
            interfaceC0338l6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(AbstractC0568z.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C0320k5.a(this.y);
        LevelPlayReward levelPlayRewardA = Ab.s.d().B().a(k(), n().i().b().c());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = L4.a.a();
        }
        LevelPlayReward levelPlayReward = levelPlayRewardA;
        f().e().a().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC0338l6 interfaceC0338l6 = this.x.get();
        if (interfaceC0338l6 != null) {
            interfaceC0338l6.a(this, levelPlayReward);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(AbstractC0568z.a(this, (String) null, 1, (Object) null));
        f().e().a().l(k());
        InterfaceC0338l6 interfaceC0338l6 = this.x.get();
        if (interfaceC0338l6 != null) {
            interfaceC0338l6.a(this);
        }
    }

    private final void O() {
        IronLog.INTERNAL.verbose(AbstractC0568z.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(AbstractC0568z.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    private final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        f().e().a().a(k(), i, str, "");
        a(C0400p0.a.FailedToShow);
        IronSourceError ironSourceError = new IronSourceError(i, str);
        InterfaceC0338l6 interfaceC0338l6 = this.x.get();
        if (interfaceC0338l6 != null) {
            interfaceC0338l6.a(this, ironSourceError);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0321k6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C0321k6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    @Override // com.ironsource.AbstractC0568z
    protected void A() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getCurrentActiveActivity(), this);
    }

    @Override // com.ironsource.AbstractC0568z
    public void a(I adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC0568z
    public void c() {
        if (Ab.s.d().g().i()) {
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            Object objG = g();
            Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((AdapterAdFullScreenInterface) objG).disposeAd(n().g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.a(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(final int i, final String str) {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.a(this.f$0, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        onAdShowSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.e(this.f$0);
            }
        });
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objG = g();
                Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), this);
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            b(C0569z0.h(n().h()), str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0321k6.a(this.f$0, extraData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0321k6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0321k6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0321k6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0321k6 this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0321k6 this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
        this$0.N();
    }
}
