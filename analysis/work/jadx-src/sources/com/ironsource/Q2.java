package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Q2 implements D2 {
    private final G9 a;
    private final C0270h8 b;
    private final W1 c;
    private final InterfaceC0401p1 d;
    private final InterfaceC0153ac e;
    private final If f;
    private final M8 g;
    private final M8.a h;
    private BannerAdInfo i;
    private WeakReference<R2> j;
    private WeakReference<FrameLayout> k;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C0236f8 size = Q2.this.d().getSize();
            ((FrameLayout) v).addView(Q2.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public Q2(G9 adInstance, C0270h8 container, W1 auctionDataReporter, InterfaceC0401p1 analytics, InterfaceC0153ac networkDestroyAPI, If threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.a = adInstance;
        this.b = container;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.i = new BannerAdInfo(strF, strE);
        this.j = new WeakReference<>(null);
        this.k = new WeakReference<>(null);
        C0564yc c0564yc = new C0564yc();
        adInstance.a(c0564yc);
        c0564yc.a(this);
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.i = bannerAdInfo;
    }

    public final void b(WeakReference<FrameLayout> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final BannerAdInfo c() {
        return this.i;
    }

    public final C0270h8 d() {
        return this.b;
    }

    public final WeakReference<R2> e() {
        return this.j;
    }

    public final WeakReference<FrameLayout> f() {
        return this.k;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.D2
    public void onBannerClick() {
        InterfaceC0280i1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Q2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Q2.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.D2
    public void onBannerShowSuccess() {
        M8 m8 = this.g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        InterfaceC0280i1.a.a.f(new C0333l1.w(m8.a(ad_unit))).a(this.d);
        this.h.b(ad_unit);
        this.c.b("onBannerShowSuccess");
        this.f.a(new Runnable() { // from class: com.ironsource.Q2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Q2.c(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Q2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        R2 r2 = this$0.j.get();
        if (r2 != null) {
            r2.onBannerAdShown();
        }
    }

    public final void a(WeakReference<R2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.j = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Q2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC0280i1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public final void b() {
        If.a(this.f, new Runnable() { // from class: com.ironsource.Q2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Q2.a(this.f$0);
            }
        }, 0L, 2, null);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Q2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        R2 r2 = this$0.j.get();
        if (r2 != null) {
            r2.onBannerAdClicked();
        }
    }

    public /* synthetic */ Q2(G9 g9, C0270h8 c0270h8, W1 w1, InterfaceC0401p1 interfaceC0401p1, InterfaceC0153ac interfaceC0153ac, If r17, M8 m8, M8.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g9, c0270h8, w1, interfaceC0401p1, (i & 16) != 0 ? new C0171bc() : interfaceC0153ac, (i & 32) != 0 ? T7.a : r17, (i & 64) != 0 ? Ab.s.d().s() : m8, (i & 128) != 0 ? Ab.s.a().h() : aVar);
    }
}
