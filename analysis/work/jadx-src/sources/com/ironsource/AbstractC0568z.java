package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0568z implements AdapterAdListener, NetworkInitializationListener {
    private final V0 a;
    private final A b;
    private final G c;
    private WeakReference<D> d;
    private E e;
    private final BaseAdAdapter<?, ?> f;
    private C0320k5 g;
    private Vd h;
    private final Map<String, Object> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final AdData n;
    private final C0368n2 o;
    private final C0368n2 p;
    private final boolean q;
    private final String r;
    private final int s;
    private final String t;
    private final IronSource.AD_UNIT u;
    private final int v;
    private final H w;

    /* JADX INFO: renamed from: com.ironsource.z$a */
    public static final class a extends Vd {
        a() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            long jA = C0320k5.a(AbstractC0568z.this.g);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC0568z abstractC0568z = AbstractC0568z.this;
            ironLog.verbose(abstractC0568z.a("Load duration = " + jA + ", isBidder = " + abstractC0568z.u()));
            AbstractC0568z.this.m = true;
            AbstractC0568z.this.f().e().e().a(jA, 1025, false);
            AbstractC0568z.this.f().e().e().a(jA, 1025, "time out", false);
            AbstractC0568z abstractC0568z2 = AbstractC0568z.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC0568z2.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC0568z(V0 adTools, A instanceData, G adInstancePayload, D listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = instanceData;
        this.c = adInstancePayload;
        this.d = new WeakReference<>(listener);
        this.i = new LinkedHashMap();
        this.n = instanceData.g();
        this.o = instanceData.n();
        this.p = instanceData.p();
        this.q = instanceData.j().j();
        this.r = instanceData.r();
        this.s = instanceData.s();
        this.t = instanceData.w();
        this.u = instanceData.h();
        this.v = instanceData.v();
        this.w = instanceData.t();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.f = baseAdAdapterA;
        adTools.e().a(new B(adTools, instanceData, baseAdAdapterA));
        adTools.e().a(new U1(instanceData.k()));
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            G();
            A();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void C() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.a.e().a().a(k());
        D d = this.d.get();
        if (d != null) {
            d.a(this);
        }
    }

    private final void D() {
        IronLog ironLog = IronLog.INTERNAL;
        E e = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.m) {
            c();
            this.a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.k) {
            this.a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.k = true;
        long jA = C0320k5.a(this.g);
        ironLog.verbose(a("Load duration = " + jA));
        this.a.e().e().a(jA, false);
        a(C0400p0.a.LoadedSuccessfully);
        E e2 = this.e;
        if (e2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            e = e2;
        }
        e.a(this);
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.l) {
            this.a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.l = true;
        this.a.e().a().g(k());
        a(C0400p0.a.ShowedSuccessfully);
        D d = this.d.get();
        if (d != null) {
            d.b(this);
        }
    }

    private final void F() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.m) {
            return;
        }
        B();
    }

    private final void G() {
        H();
        a aVarA = a();
        this.h = aVarA;
        if (aVarA != null) {
            this.a.a((Vd) aVarA, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void H() {
        Vd vd = this.h;
        if (vd != null) {
            this.a.b(vd);
            this.h = null;
        }
    }

    private final int o() {
        Integer numF = this.b.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.b.i().h() : numF.intValue();
    }

    protected abstract void A();

    public abstract void a(I i);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        this.a.e().e().a(this.v);
    }

    public void c() {
    }

    public final IronSource.AD_UNIT d() {
        return this.u;
    }

    public LevelPlayAdInfo e() {
        String string = this.b.i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.b.i().b().c();
        String string2 = this.b.h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.b.n().a(k()), this.b.n().d(), null, this.b.i().l(), MapsKt.toMap(this.i));
    }

    public final V0 f() {
        return this.a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f;
    }

    public final C0368n2 h() {
        return this.o;
    }

    protected final AdData i() {
        return this.n;
    }

    protected final Placement j() {
        return this.b.i().b().f();
    }

    protected final String k() {
        return this.b.i().l();
    }

    protected final Map<String, Object> l() {
        return this.i;
    }

    public final C0368n2 m() {
        return this.p;
    }

    protected final A n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.a(this.f$0, adapterErrorType, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final String str) {
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.a(this.f$0, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.d(this.f$0);
            }
        });
    }

    public final String p() {
        return this.r;
    }

    public final String q() {
        return this.t;
    }

    public final int r() {
        return this.s;
    }

    public final H s() {
        return this.w;
    }

    public final int t() {
        return this.v;
    }

    public final boolean u() {
        return this.q;
    }

    public final boolean v() {
        return this.m;
    }

    public final boolean w() {
        return this.k;
    }

    public final boolean x() {
        return this.j;
    }

    public final boolean y() {
        return this.l;
    }

    public boolean z() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC0568z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC0568z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.z$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0568z.a(this.f$0, extraData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC0568z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    protected final void a(C0400p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.b.a(performance);
    }

    protected final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.a(callback);
    }

    public final void a(boolean z) {
        this.a.e().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(A a2) {
        if (a2.i().e().q()) {
            return this.c.b();
        }
        return this.a.a(a2);
    }

    public final void a(E listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.e = listener;
        this.j = true;
        try {
            this.a.e().e().a(false);
            this.g = new C0320k5();
            G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f;
            Intrinsics.checkNotNull(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.b.g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.t;
            ironLog.error(a(str));
            a(C0569z0.c(this.b.h()), str);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.a.e().h().g(str2);
            a(C0569z0.c(this.b.h()), str2);
        }
    }

    public static /* synthetic */ String a(AbstractC0568z abstractC0568z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return abstractC0568z.a(str);
    }

    protected final String a(String str) {
        return this.a.a(str, this.t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C0400p0.a.FailedToLoad);
        E e = this.e;
        if (e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            e = null;
        }
        e.a(ironSourceError, this);
    }

    private final void a(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        H();
        this.m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C0320k5.a(this.g));
        a(new IronSourceError(i, str));
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long jA = C0320k5.a(this.g);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        H();
        if (this.m) {
            c();
            a(adapterErrorType, i, str, jA);
        } else {
            if (this.k) {
                a(adapterErrorType);
                return;
            }
            this.m = true;
            c();
            a(adapterErrorType, i, str, jA);
            a(new IronSourceError(i, str));
        }
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.a.e().h().a("");
        } else {
            this.a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.a.e().e().a(j, i);
        } else if (str != null && str.length() != 0) {
            this.a.e().e().a(j, i, str, false);
        } else {
            this.a.e().e().a(j, i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC0568z this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.i.putAll(extraData);
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC0568z this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC0568z this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(i, str);
    }
}
