package com.ironsource;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cd implements InterfaceC0411pb, InterfaceC0217e6 {
    private final RewardedAdRequest a;
    private final C0428qb b;
    private final T<RewardedAd> c;
    private final InterfaceC0351m2 d;
    private final InterfaceC0310jc e;
    private final InterfaceC0401p1 f;
    private final InterfaceC0177c0<RewardedAd> g;
    private final Kf.c h;
    private final Executor i;
    private C0320k5 j;
    private Kf k;
    private W1 l;
    private boolean m;

    public static final class a implements Kf.a {
        a() {
        }

        @Override // com.ironsource.Kf.a
        public void a() {
            Cd.this.a(C0557y5.a.s());
        }
    }

    public Cd(RewardedAdRequest adRequest, C0428qb loadTaskConfig, T<RewardedAd> adLoadTaskListener, InterfaceC0351m2 auctionResponseFetcher, InterfaceC0310jc networkLoadApi, InterfaceC0401p1 analytics, InterfaceC0177c0<RewardedAd> adObjectFactory, Kf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = loadTaskConfig;
        this.c = adLoadTaskListener;
        this.d = auctionResponseFetcher;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adObjectFactory;
        this.h = timerFactory;
        this.i = taskFinishedExecutor;
    }

    @Override // com.ironsource.InterfaceC0217e6
    public void a(final G9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.i.execute(new Runnable() { // from class: com.ironsource.Cd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Cd.a(this.f$0, adInstance);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0411pb
    public void start() {
        this.j = new C0320k5();
        this.f.a(new C0333l1.s(this.b.f()), new C0333l1.n(this.b.g().b()), new C0333l1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC0280i1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long jH = this.b.h();
        Kf.c cVar = this.h;
        Kf.b bVar = new Kf.b();
        bVar.b(jH);
        Unit unit = Unit.INSTANCE;
        Kf kfA = cVar.a(bVar);
        this.k = kfA;
        if (kfA != null) {
            kfA.a(new a());
        }
        Object objA = this.d.a();
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
        EnumC0341l9 enumC0341l9G = this.b.g();
        C0200d6 c0200d6 = new C0200d6();
        c0200d6.a(this);
        G9 adInstance = new H9(this.a.getProviderName$mediationsdk_release().value(), c0200d6).a(enumC0341l9G.b(EnumC0341l9.Bidder)).b(this.b.i()).c().a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C0189cc().a(), T5.a.a(this.a.getExtraParams()))).a();
        InterfaceC0401p1 interfaceC0401p2 = this.f;
        String strE = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        interfaceC0401p2.a(new C0333l1.b(strE));
        C0344lc c0344lc = new C0344lc(c0300j2, this.b.j());
        this.l = new W1(new C0324k9(this.a.getInstanceId(), enumC0341l9G.b(), c0300j2.a()), new com.ironsource.mediationsdk.d(), c0300j2.c());
        InterfaceC0280i1.d.a.c().a(this.f);
        InterfaceC0310jc interfaceC0310jc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC0310jc.a(adInstance, c0344lc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cd this$0, G9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        Kf kf = this$0.k;
        if (kf != null) {
            kf.cancel();
        }
        C0320k5 c0320k5 = this$0.j;
        if (c0320k5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c0320k5 = null;
        }
        InterfaceC0280i1.c.a.a(new C0333l1.f(C0320k5.a(c0320k5))).a(this$0.f);
        W1 w1 = this$0.l;
        if (w1 != null) {
            w1.c("onAdInstanceLoadSuccess");
        }
        InterfaceC0177c0<RewardedAd> interfaceC0177c0 = this$0.g;
        W1 w2 = this$0.l;
        Intrinsics.checkNotNull(w2);
        this$0.c.a(interfaceC0177c0.a(adInstance, w2));
    }

    public /* synthetic */ Cd(RewardedAdRequest rewardedAdRequest, C0428qb c0428qb, T t, InterfaceC0351m2 interfaceC0351m2, InterfaceC0310jc interfaceC0310jc, InterfaceC0401p1 interfaceC0401p1, InterfaceC0177c0 interfaceC0177c0, Kf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, c0428qb, t, interfaceC0351m2, interfaceC0310jc, interfaceC0401p1, interfaceC0177c0, (i & 128) != 0 ? new Kf.d() : cVar, (i & 256) != 0 ? T7.a.c() : executor);
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

    @Override // com.ironsource.InterfaceC0217e6
    public void a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C0557y5.a.c(description));
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.i.execute(new Runnable() { // from class: com.ironsource.Cd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Cd.a(this.f$0, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        Kf kf = this$0.k;
        if (kf != null) {
            kf.cancel();
        }
        InterfaceC0280i1.c.a aVar = InterfaceC0280i1.c.a;
        C0333l1.j jVar = new C0333l1.j(error.getErrorCode());
        C0333l1.k kVar = new C0333l1.k(error.getErrorMessage());
        C0320k5 c0320k5 = this$0.j;
        if (c0320k5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c0320k5 = null;
        }
        aVar.a(jVar, kVar, new C0333l1.f(C0320k5.a(c0320k5))).a(this$0.f);
        W1 w1 = this$0.l;
        if (w1 != null) {
            w1.a("onAdInstanceLoadFail");
        }
        this$0.c.onAdLoadFailed(error);
    }
}
