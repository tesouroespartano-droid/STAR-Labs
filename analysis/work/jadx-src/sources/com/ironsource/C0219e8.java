package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* JADX INFO: renamed from: com.ironsource.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0219e8 extends C0504v3 {
    private static final C0219e8 d = new C0219e8();
    private LevelPlayInterstitialListener b = null;
    private LevelPlayInterstitialListener c = null;

    /* JADX INFO: renamed from: com.ironsource.e8$a */
    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowSucceeded(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$b */
    class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowFailed(this.a, c0219e8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0219e8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$c */
    class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowFailed(this.a, c0219e8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0219e8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$d */
    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClicked(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$e */
    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClicked(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$f */
    class f implements Runnable {
        final /* synthetic */ AdInfo a;

        f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdReady(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$g */
    class g implements Runnable {
        final /* synthetic */ AdInfo a;

        g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdReady(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$h */
    class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayInterstitialListener levelPlayInterstitialListener = C0219e8.this.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$i */
    class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            LevelPlayInterstitialListener levelPlayInterstitialListener = C0219e8.this.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$j */
    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdOpened(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$k */
    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdOpened(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClosed(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$m */
    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.b;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClosed(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$n */
    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0219e8 c0219e8 = C0219e8.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = c0219e8.c;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowSucceeded(c0219e8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C0219e8.this.a(this.a));
            }
        }
    }

    private C0219e8() {
    }

    public static synchronized C0219e8 a() {
        return d;
    }

    public synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.c = levelPlayInterstitialListener;
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
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.b = levelPlayInterstitialListener;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
