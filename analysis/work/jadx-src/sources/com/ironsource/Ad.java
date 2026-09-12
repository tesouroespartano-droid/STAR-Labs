package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ad implements InterfaceC0234f6 {
    private G9 a;
    private InterfaceC0141a0 b;
    private X1 c;
    private InterfaceC0401p1 d;
    private InterfaceC0153ac e;
    private If f;
    private M8 g;
    private M8.a h;
    private final Map<String, Ad> i;
    private RewardedAdInfo j;
    private Bd k;

    public Ad(G9 adInstance, InterfaceC0141a0 adNetworkShow, X1 auctionDataReporter, InterfaceC0401p1 analytics, InterfaceC0153ac networkDestroyAPI, If threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor, Map<String, Ad> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.j = new RewardedAdInfo(strF, strE);
        C0200d6 c0200d6 = new C0200d6();
        this.a.a(c0200d6);
        c0200d6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ad this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bd bd = this$0.k;
        if (bd != null) {
            bd.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.j;
    }

    public final Bd c() {
        return this.k;
    }

    public final boolean d() {
        boolean zA = this.b.a(this.a);
        InterfaceC0280i1.a.a.a(zA).a(this.d);
        return zA;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC0280i1.a.a.f(new InterfaceC0350m1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidClick() {
        InterfaceC0280i1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Ad.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC0280i1.a.a.a(new InterfaceC0350m1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ad.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidReward(String str, int i) {
        C0333l1.u uVar = new C0333l1.u("Virtual Item");
        C0333l1.t tVar = new C0333l1.t(1);
        C0333l1.q qVar = new C0333l1.q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.a.g());
        Intrinsics.checkNotNullExpressionValue(transId, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC0280i1.a.a.c(uVar, tVar, qVar, new C0333l1.y(transId)).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ad.d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        InterfaceC0280i1.a.a.b(new C0333l1.w(m8.a(ad_unit))).a(this.d);
        this.h.b(ad_unit);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ad.e(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ad this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bd bd = this$0.k;
        if (bd != null) {
            bd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ad this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bd bd = this$0.k;
        if (bd != null) {
            bd.onRewardedAdDismissed();
        }
    }

    public final void a(Bd bd) {
        this.k = bd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ad this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bd bd = this$0.k;
        if (bd != null) {
            bd.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C0557y5.a.t());
        } else {
            InterfaceC0280i1.a.a.d(new InterfaceC0350m1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void a(String str) {
        a(C0557y5.a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC0280i1.a.a.a(new C0333l1.j(ironSourceError.getErrorCode()), new C0333l1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ad.a(this.f$0, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ad this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Bd bd = this$0.k;
        if (bd != null) {
            bd.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        If.a(this.f, new Runnable() { // from class: com.ironsource.Ad$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Ad.a(this.f$0);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ad this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0280i1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ Ad(G9 g9, InterfaceC0141a0 interfaceC0141a0, X1 x1, InterfaceC0401p1 interfaceC0401p1, InterfaceC0153ac interfaceC0153ac, If r18, M8 m8, M8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g9, interfaceC0141a0, x1, interfaceC0401p1, (i & 16) != 0 ? new C0171bc() : interfaceC0153ac, (i & 32) != 0 ? T7.a : r18, (i & 64) != 0 ? Ab.s.d().s() : m8, (i & 128) != 0 ? Ab.s.a().h() : aVar, map);
    }
}
