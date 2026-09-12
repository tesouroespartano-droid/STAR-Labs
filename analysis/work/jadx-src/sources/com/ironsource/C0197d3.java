package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0197d3 implements InterfaceC0411pb, B2 {
    private final BannerAdRequest a;
    private final AdSize b;
    private final InterfaceC0351m2 c;
    private final C0428qb d;
    private final InterfaceC0310jc e;
    private final InterfaceC0401p1 f;
    private final T<BannerAdView> g;
    private final E2 h;
    private final Kf.c i;
    private final Executor j;
    private C0320k5 k;
    private Kf l;
    private W1 m;
    private boolean n;

    /* JADX INFO: renamed from: com.ironsource.d3$a */
    public static final class a implements Kf.a {
        a() {
        }

        @Override // com.ironsource.Kf.a
        public void a() {
            C0197d3.this.a(C0557y5.a.s());
        }
    }

    public C0197d3(BannerAdRequest adRequest, AdSize size, InterfaceC0351m2 auctionResponseFetcher, C0428qb loadTaskConfig, InterfaceC0310jc networkLoadApi, InterfaceC0401p1 analytics, T<BannerAdView> adLoadTaskListener, E2 adLayoutFactory, Kf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = T5.a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC0280i1.c.a.a(new C0333l1.l(str + C0198d4.j.b + String.valueOf(mapA.get(str)))).a(this.f);
        }
    }

    @Override // com.ironsource.B2
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C0557y5.a.c(description));
    }

    @Override // com.ironsource.B2
    public void onBannerLoadSuccess(final G9 adInstance, final C0270h8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        this.j.execute(new Runnable() { // from class: com.ironsource.d3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0197d3.a(this.f$0, adInstance, adContainer);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0411pb
    public void start() {
        this.k = new C0320k5();
        this.f.a(new C0333l1.s(this.d.f()), new C0333l1.n(this.d.g().b()), new C0333l1.c(this.b), new C0333l1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC0280i1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long jH = this.d.h();
        Kf.c cVar = this.i;
        Kf.b bVar = new Kf.b();
        bVar.b(jH);
        Unit unit = Unit.INSTANCE;
        Kf kfA = cVar.a(bVar);
        this.l = kfA;
        if (kfA != null) {
            kfA.a(new a());
        }
        Object objA = this.c.a();
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objA);
        if (thM3607exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(thM3607exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C0185c8) thM3607exceptionOrNullimpl).a());
            objA = null;
        }
        C0300j2 c0300j2 = (C0300j2) objA;
        if (c0300j2 == null) {
            return;
        }
        InterfaceC0401p1 interfaceC0401p1 = this.f;
        String strB = c0300j2.b();
        if (strB != null) {
            interfaceC0401p1.a(new C0333l1.d(strB));
        }
        JSONObject jSONObjectF = c0300j2.f();
        if (jSONObjectF != null) {
            interfaceC0401p1.a(new C0333l1.m(jSONObjectF));
        }
        String strA = c0300j2.a();
        if (strA != null) {
            interfaceC0401p1.a(new C0333l1.g(strA));
        }
        EnumC0341l9 enumC0341l9G = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C0236f8 c0236f8 = new C0236f8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        C0564yc c0564yc = new C0564yc();
        c0564yc.a(this);
        G9 adInstance = new H9(this.a.getProviderName$mediationsdk_release().value(), c0564yc).a(enumC0341l9G.b(EnumC0341l9.Bidder)).a(c0236f8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C0189cc().a(), T5.a.a(this.a.getExtraParams()))).a();
        C0344lc c0344lc = new C0344lc(c0300j2, this.d.j());
        this.m = new W1(new C0324k9(this.a.getInstanceId(), enumC0341l9G.b(), c0300j2.a()), new com.ironsource.mediationsdk.d(), c0300j2.c());
        InterfaceC0280i1.d.a.c().a(this.f);
        InterfaceC0310jc interfaceC0310jc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC0310jc.a(adInstance, c0344lc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0197d3 this$0, G9 adInstance, C0270h8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        Kf kf = this$0.l;
        if (kf != null) {
            kf.cancel();
        }
        C0320k5 c0320k5 = this$0.k;
        if (c0320k5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c0320k5 = null;
        }
        InterfaceC0280i1.c.a.a(new C0333l1.f(C0320k5.a(c0320k5))).a(this$0.f);
        W1 w1 = this$0.m;
        if (w1 != null) {
            w1.c("onBannerLoadSuccess");
        }
        E2 e2 = this$0.h;
        W1 w2 = this$0.m;
        Intrinsics.checkNotNull(w2);
        this$0.g.a(e2.a(adInstance, adContainer, w2));
    }

    public /* synthetic */ C0197d3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC0351m2 interfaceC0351m2, C0428qb c0428qb, InterfaceC0310jc interfaceC0310jc, InterfaceC0401p1 interfaceC0401p1, T t, E2 e2, Kf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC0351m2, c0428qb, interfaceC0310jc, interfaceC0401p1, t, e2, (i & 256) != 0 ? new Kf.d() : cVar, (i & 512) != 0 ? T7.a.c() : executor);
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.j.execute(new Runnable() { // from class: com.ironsource.d3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0197d3.a(this.f$0, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0197d3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        Kf kf = this$0.l;
        if (kf != null) {
            kf.cancel();
        }
        InterfaceC0280i1.c.a aVar = InterfaceC0280i1.c.a;
        C0333l1.j jVar = new C0333l1.j(error.getErrorCode());
        C0333l1.k kVar = new C0333l1.k(error.getErrorMessage());
        C0320k5 c0320k5 = this$0.k;
        if (c0320k5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c0320k5 = null;
        }
        aVar.a(jVar, kVar, new C0333l1.f(C0320k5.a(c0320k5))).a(this$0.f);
        W1 w1 = this$0.m;
        if (w1 != null) {
            w1.a("onBannerLoadFail");
        }
        this$0.g.onAdLoadFailed(error);
    }
}
