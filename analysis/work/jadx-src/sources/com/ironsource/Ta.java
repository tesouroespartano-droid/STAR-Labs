package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class Ta implements InterfaceC0285i6 {
    public static final a n = new a(null);
    public static final String o = "Fullscreen Ad Internal";
    private final LevelPlay.AdFormat a;
    private final String b;
    private final b c;
    private final C0366n0 d;
    private final C0268h6 e;
    private final InterfaceC0518w0 f;
    private final J7 g;
    private final InterfaceC0454s4 h;
    private final Lazy i;
    private Ua j;
    private final UUID k;
    private InterfaceC0439r6 l;
    private C0320k5 m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C0366n0 c0366n0A = C0366n0.a.a(com.unity3d.mediation.a.a(adFormat), D0.b.MEDIATION);
            if (!c0366n0A.g()) {
                c0366n0A.e().a().a(placementName, "SDK is not initialized", false);
                return false;
            }
            N3 n3A = Ab.s.d().p().a(placementName, adFormat);
            boolean zD = n3A.d();
            c0366n0A.e().a().a(placementName, n3A.e(), zD);
            return zD;
        }

        private a() {
        }
    }

    public interface b {
        Double getBidFloor();
    }

    public static final class c {
        private final C0366n0 a;
        private final C0268h6 b;
        private final J7 c;
        private final InterfaceC0454s4 d;
        private final C0542x7 e;
        private final b f;

        public c(C0366n0 adTools, C0268h6 adControllerFactory, J7 provider, InterfaceC0454s4 currentTimeProvider, C0542x7 idFactory, b config) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            this.a = adTools;
            this.b = adControllerFactory;
            this.c = provider;
            this.d = currentTimeProvider;
            this.e = idFactory;
            this.f = config;
        }

        public final C0268h6 a() {
            return this.b;
        }

        public final C0366n0 b() {
            return this.a;
        }

        public final b c() {
            return this.f;
        }

        public final InterfaceC0454s4 d() {
            return this.d;
        }

        public final C0542x7 e() {
            return this.e;
        }

        public final J7 f() {
            return this.c;
        }
    }

    static final class d extends Lambda implements Function0<C0251g6> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0251g6 invoke() {
            return Ta.this.b();
        }
    }

    public static final class e implements InterfaceC0473t6 {
        final /* synthetic */ C0228f0 b;

        e(C0228f0 c0228f0) {
            this.b = c0228f0;
        }

        @Override // com.ironsource.InterfaceC0473t6
        public C0456s6 a(boolean z, InterfaceC0507v6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC0501v0 abstractC0501v0A = Ta.this.g().a(z, this.b);
            return new C0456s6(Ab.s.c(), new V0(Ta.this.f(), abstractC0501v0A, D0.b.MEDIATION), abstractC0501v0A, listener, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ta(LevelPlay.AdFormat adFormat, String adUnitId, b config, C0366n0 adTools, C0268h6 fullscreenAdControllerFactory, InterfaceC0518w0 adUnitDataFactory, J7 mediationServicesProvider, InterfaceC0454s4 currentTimeProvider, C0542x7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.a = adFormat;
        this.b = adUnitId;
        this.c = config;
        this.d = adTools;
        this.e = fullscreenAdControllerFactory;
        this.f = adUnitDataFactory;
        this.g = mediationServicesProvider;
        this.h = currentTimeProvider;
        this.i = LazyKt.lazy(new d());
        UUID uuidA = idFactory.a();
        this.k = uuidA;
        this.l = new C0304j6(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new C0365n(com.unity3d.mediation.a.a(adFormat), uuidA, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ta this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a();
        this$0.l.loadAd();
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final C0251g6 c() {
        return (C0251g6) this.i.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.a;
    }

    public final UUID e() {
        return this.k;
    }

    public final C0366n0 f() {
        return this.d;
    }

    public final InterfaceC0518w0 g() {
        return this.f;
    }

    public final String h() {
        return this.b;
    }

    public final b i() {
        return this.c;
    }

    public final InterfaceC0454s4 j() {
        return this.h;
    }

    public final Ua k() {
        return this.j;
    }

    public final J7 l() {
        return this.g;
    }

    public final boolean m() {
        InterfaceC0279i0 interfaceC0279i0C = this.l.c();
        this.d.e().e().a(Boolean.valueOf(interfaceC0279i0C.a()), interfaceC0279i0C instanceof InterfaceC0279i0.a ? ((InterfaceC0279i0.a) interfaceC0279i0C).c() : null);
        return interfaceC0279i0C.a();
    }

    public final void n() {
        this.m = new C0320k5();
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ta.b(this.f$0);
            }
        });
    }

    public final void o() {
        a(new C0389o6(this, this.h));
        c().p();
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdClicked() {
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Ta.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdClosed() {
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Ta.d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdDisplayed(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                Ta.b(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                Ta.c(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdLoadFailed(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Ta.c(this.f$0, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void onAdLoaded(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ta.d(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ta this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.l.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ta this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.l.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ta this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l.a();
    }

    public final void a(Ua ua) {
        this.j = ua;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ta this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.l.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ta this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ta this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l.onAdClosed();
    }

    public final void a(InterfaceC0439r6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.l = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ta this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.l.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ta this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.l.onAdInfoChanged(adInfo);
    }

    public final void a(final Activity activity, final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Ta this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.d.e().h().d();
        this$0.l.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0251g6 b() {
        C0228f0 c0228f0 = new C0228f0(com.unity3d.mediation.a.a(this.a), this.k, this.b, null, this.g.A().a(), this.c.getBidFloor(), 8, null);
        e eVar = new e(c0228f0);
        D5 d5E = this.d.e();
        C0366n0 c0366n0 = this.d;
        d5E.a(new B0(c0366n0, c0228f0, c0366n0.b(this.a, this.b).b().b()));
        return this.e.a(this, this.d, c0228f0, eVar);
    }

    public final void a(C0304j6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.l = new C0304j6(this, status);
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void a(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Ta.b(this.f$0, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void a() {
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                Ta.e(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0285i6
    public void a(final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C0366n0.a(this.d, "onAdRewarded adInfo: " + this.l.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.d.e(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Ua ua = this$0.j;
        if (ua != null) {
            ua.onAdRewarded(reward, this$0.l.b());
        }
    }

    public final void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C0366n0.a(this.d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long jA = C0320k5.a(this.m);
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, jA);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ua ua = this$0.j;
        if (ua != null) {
            ua.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Ta ta, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ta.a(levelPlayAdError, j);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C0366n0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, j, levelPlayAdError);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(levelPlayAdError, this);
            }
        });
    }

    public /* synthetic */ Ta(LevelPlay.AdFormat adFormat, String str, b bVar, C0366n0 c0366n0, C0268h6 c0268h6, InterfaceC0518w0 interfaceC0518w0, J7 j7, InterfaceC0454s4 interfaceC0454s4, C0542x7 c0542x7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c0366n0, c0268h6, interfaceC0518w0, (i & 64) != 0 ? Ab.s.d() : j7, interfaceC0454s4, c0542x7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, long j, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Jc jcF = this$0.d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        jcF.a(j, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Ta this$0) {
        Ua ua;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (ua = this$0.j) == null) {
            return;
        }
        ua.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(final LevelPlayAdError error, final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C0366n0.a(this.d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.d.d(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, error);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Ta$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Ta.a(this.f$0, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.d.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ta this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ua ua = this$0.j;
        if (ua != null) {
            ua.onAdDisplayFailed(error, adInfo);
        }
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.d.e().h().f("Fullscreen Ad Internal - " + message);
    }
}
