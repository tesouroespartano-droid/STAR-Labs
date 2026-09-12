package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0486u2 extends C0504v3 {
    private static final C0486u2 d = new C0486u2();
    private LevelPlayBannerListener b = null;
    private LevelPlayBannerListener c = null;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLeftApplication(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    class b implements Runnable {
        final /* synthetic */ AdInfo a;

        b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdClicked(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$c */
    class c implements Runnable {
        final /* synthetic */ AdInfo a;

        c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdClicked(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$d */
    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoaded(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$e */
    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoaded(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$f */
    class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayBannerListener levelPlayBannerListener = C0486u2.this.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$g */
    class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayBannerListener levelPlayBannerListener = C0486u2.this.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$h */
    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenPresented(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$i */
    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenPresented(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$j */
    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenDismissed(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$k */
    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.b;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenDismissed(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486u2 c0486u2 = C0486u2.this;
            LevelPlayBannerListener levelPlayBannerListener = c0486u2.c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLeftApplication(c0486u2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C0486u2.this.a(this.a));
            }
        }
    }

    private C0486u2() {
    }

    public static C0486u2 a() {
        return d;
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.c = levelPlayBannerListener;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.b = levelPlayBannerListener;
    }

    public LevelPlayBannerListener b() {
        return this.b;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
