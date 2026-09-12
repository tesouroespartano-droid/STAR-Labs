package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Cf implements C0364mf.c, C0364mf.d, C0364mf.b {
    private final WeakReference<TestSuiteActivity> a;
    private final Handler b;
    private RelativeLayout c;
    private IronSourceBannerLayout d;

    public Cf(TestSuiteActivity activity, Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = new WeakReference<>(activity);
        this.b = handler;
    }

    private final TestSuiteActivity f() {
        return this.a.get();
    }

    @Override // com.ironsource.C0364mf.d
    public void a(C0465sf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        C0584zf c0584zf = C0584zf.a;
        c0584zf.a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        c0584zf.h();
    }

    @Override // com.ironsource.C0364mf.c
    public void b(C0465sf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        C0584zf c0584zf = C0584zf.a;
        c0584zf.a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        c0584zf.g();
    }

    @Override // com.ironsource.C0364mf.d
    public void c() {
        C0584zf.a.b((Activity) this.a.get());
    }

    @Override // com.ironsource.C0364mf.b
    public void d() {
        IronSourceBannerLayout ironSourceBannerLayout = this.d;
        if (ironSourceBannerLayout != null) {
            C0584zf.a.a(ironSourceBannerLayout);
        }
        this.b.post(new Runnable() { // from class: com.ironsource.Cf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Cf.a(this.f$0);
            }
        });
        this.d = null;
    }

    @Override // com.ironsource.C0364mf.c
    public boolean e() {
        return C0584zf.a.e();
    }

    @Override // com.ironsource.C0364mf.d
    public boolean a() {
        return C0584zf.a.f();
    }

    @Override // com.ironsource.C0364mf.c
    public void b() {
        C0584zf.a.a((Activity) this.a.get());
    }

    @Override // com.ironsource.C0364mf.b
    public void a(C0465sf loadAdConfig, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        d();
        C0584zf c0584zf = C0584zf.a;
        c0584zf.a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            IronSourceBannerLayout ironSourceBannerLayoutA = c0584zf.a(testSuiteActivityF, c0584zf.a(description, i, i2));
            this.d = ironSourceBannerLayoutA;
            c0584zf.b(ironSourceBannerLayoutA);
        }
    }

    @Override // com.ironsource.C0364mf.b
    public void a(double d) {
        final TestSuiteActivity testSuiteActivityF;
        if (this.c != null || (testSuiteActivityF = f()) == null) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.d;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.setLayoutParams(Ef.a.a((Context) testSuiteActivityF));
        }
        this.c = a(testSuiteActivityF);
        this.b.post(new Runnable() { // from class: com.ironsource.Cf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Cf.a(this.f$0, testSuiteActivityF);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cf this$0, TestSuiteActivity testSuiteActivity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.c;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.d);
        }
        testSuiteActivity.getContainer().addView(this$0.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cf this$0) {
        RelativeLayout container;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.c;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity testSuiteActivityF = this$0.f();
        if (testSuiteActivityF != null && (container = testSuiteActivityF.getContainer()) != null) {
            container.removeView(this$0.c);
        }
        this$0.c = null;
    }

    private final RelativeLayout a(TestSuiteActivity testSuiteActivity) {
        RelativeLayout relativeLayout = new RelativeLayout(testSuiteActivity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }
}
