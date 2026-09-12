package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0426q9 implements InterfaceC0234f6 {
    private G9 a;
    private InterfaceC0141a0 b;
    private X1 c;
    private InterfaceC0401p1 d;
    private InterfaceC0153ac e;
    private If f;
    private M8 g;
    private M8.a h;
    private final Map<String, C0426q9> i;
    private InterstitialAdInfo j;
    private InterfaceC0442r9 k;

    public C0426q9(G9 adInstance, InterfaceC0141a0 adNetworkShow, X1 auctionDataReporter, InterfaceC0401p1 analytics, InterfaceC0153ac networkDestroyAPI, If threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor, Map<String, C0426q9> retainer) {
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
        this.j = new InterstitialAdInfo(strF, strE);
        C0200d6 c0200d6 = new C0200d6();
        this.a.a(c0200d6);
        c0200d6.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.j;
    }

    public final InterfaceC0442r9 c() {
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
        this.f.a(new Runnable() { // from class: com.ironsource.q9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0426q9.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC0280i1.a.a.a(new InterfaceC0350m1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.q9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0426q9.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC0234f6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        InterfaceC0280i1.a.a.b(new C0333l1.w(m8.a(ad_unit))).a(this.d);
        this.h.b(ad_unit);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.q9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0426q9.d(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0426q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0442r9 interfaceC0442r9 = this$0.k;
        if (interfaceC0442r9 != null) {
            interfaceC0442r9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0426q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0442r9 interfaceC0442r9 = this$0.k;
        if (interfaceC0442r9 != null) {
            interfaceC0442r9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC0442r9 interfaceC0442r9) {
        this.k = interfaceC0442r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0426q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0442r9 interfaceC0442r9 = this$0.k;
        if (interfaceC0442r9 != null) {
            interfaceC0442r9.onAdInstanceDidShow();
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
        this.f.a(new Runnable() { // from class: com.ironsource.q9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0426q9.a(this.f$0, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0426q9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC0442r9 interfaceC0442r9 = this$0.k;
        if (interfaceC0442r9 != null) {
            interfaceC0442r9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        If.a(this.f, new Runnable() { // from class: com.ironsource.q9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0426q9.a(this.f$0);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0426q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0280i1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ C0426q9(G9 g9, InterfaceC0141a0 interfaceC0141a0, X1 x1, InterfaceC0401p1 interfaceC0401p1, InterfaceC0153ac interfaceC0153ac, If r18, M8 m8, M8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g9, interfaceC0141a0, x1, interfaceC0401p1, (i & 16) != 0 ? new C0171bc() : interfaceC0153ac, (i & 32) != 0 ? T7.a : r18, (i & 64) != 0 ? Ab.s.d().s() : m8, (i & 128) != 0 ? Ab.s.a().h() : aVar, map);
    }
}
