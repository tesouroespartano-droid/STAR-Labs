package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* JADX INFO: renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0446rd extends C0504v3 {
    private static final C0446rd d = new C0446rd();
    private LevelPlayRewardedVideoBaseListener b = null;
    private LevelPlayRewardedVideoBaseListener c = null;

    /* JADX INFO: renamed from: com.ironsource.rd$a */
    class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                if (this.a) {
                    ((LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener).onAdAvailable(c0446rd.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C0446rd.this.a(this.b));
                } else {
                    ((LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener).onAdUnavailable();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$b */
    class b implements Runnable {
        final /* synthetic */ Placement a;
        final /* synthetic */ AdInfo b;

        b(Placement placement, AdInfo adInfo) {
            this.a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdRewarded(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + C0446rd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$c */
    class c implements Runnable {
        final /* synthetic */ Placement a;
        final /* synthetic */ AdInfo b;

        c(Placement placement, AdInfo adInfo) {
            this.a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdRewarded(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + C0446rd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$d */
    class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdShowFailed(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0446rd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$e */
    class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdShowFailed(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0446rd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$f */
    class f implements Runnable {
        final /* synthetic */ Placement a;
        final /* synthetic */ AdInfo b;

        f(Placement placement, AdInfo adInfo) {
            this.a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClicked(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + C0446rd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$g */
    class g implements Runnable {
        final /* synthetic */ Placement a;
        final /* synthetic */ AdInfo b;

        g(Placement placement, AdInfo adInfo) {
            this.a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClicked(this.a, c0446rd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + C0446rd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$h */
    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdReady(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$i */
    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdReady(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$j */
    class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = C0446rd.this.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$k */
    class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = C0446rd.this.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdOpened(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$m */
    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdOpened(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$n */
    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClosed(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$o */
    class o implements Runnable {
        final /* synthetic */ AdInfo a;

        o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClosed(c0446rd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0446rd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rd$p */
    class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0446rd c0446rd = C0446rd.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = c0446rd.c;
            if (levelPlayRewardedVideoBaseListener != null) {
                if (this.a) {
                    ((LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener).onAdAvailable(c0446rd.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C0446rd.this.a(this.b));
                } else {
                    ((LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener).onAdUnavailable();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    private C0446rd() {
    }

    public void b() {
    }

    public void c() {
    }

    public static C0446rd a() {
        return d;
    }

    public void b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.c = levelPlayRewardedVideoBaseListener;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.b = levelPlayRewardedVideoBaseListener;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(Placement placement, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(placement, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(placement, adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(Placement placement, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(placement, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(placement, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
