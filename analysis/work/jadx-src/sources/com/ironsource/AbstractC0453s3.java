package com.ironsource;

import android.text.TextUtils;
import com.ironsource.Q0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0453s3<Listener extends Q0> implements NetworkInitializationListener, C0226ef.a, C0, AdapterAdListener, L8.b {
    protected C0332l0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected D0 d;
    protected h e;
    protected Placement g;
    protected C0160b1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C0320k5 m;
    private final C0368n2 o;
    private final InterfaceC0275hd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private C0226ef n = new C0226ef(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* JADX INFO: renamed from: com.ironsource.s3$a */
    class a extends Vd {
        a() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0453s3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$b */
    class b extends Vd {
        b() {
        }

        @Override // com.ironsource.Vd
        public void a() throws Throwable {
            AbstractC0453s3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$c */
    class c extends Vd {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0453s3.this.a(this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$d */
    class d extends Vd {
        d() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0453s3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$e */
    class e extends Vd {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.Vd
        public void a() throws Throwable {
            AbstractC0453s3.this.a(this.b, this.c, this.d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$f */
    class f extends Vd {
        f() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0453s3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$g */
    class g extends Vd {
        g() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0453s3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0453s3(InterfaceC0275hd interfaceC0275hd, C0332l0 c0332l0, BaseAdAdapter<?, ?> baseAdAdapter, C0160b1 c0160b1, C0368n2 c0368n2, Listener listener) {
        this.a = c0332l0;
        this.b = listener;
        this.d = new D0(c0332l0.a(), D0.b.PROVIDER, this);
        this.h = c0160b1;
        this.i = c0160b1.c();
        this.c = baseAdAdapter;
        this.o = c0368n2;
        this.p = interfaceC0275hd;
        a(h.NONE);
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() throws Throwable {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((C0226ef.a) this);
            G();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            D0 d0 = this.d;
            if (d0 != null) {
                d0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C0226ef c0226ef = this.n;
        if (c0226ef != null) {
            c0226ef.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            zO = false;
            if (hVar == h.LOADING) {
                long jA = C0320k5.a(this.m);
                ironLog.verbose(a("Load duration = " + jA));
                if (this.d != null) {
                    if (v()) {
                        this.d.f.a(jA);
                    } else {
                        this.d.f.a(jA, false);
                    }
                }
                a(h.LOADED);
                zO = O();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.e)));
                String str = String.format("unexpected load success, state - %s", this.e);
                if (this.d != null) {
                    if (v()) {
                        this.d.j.s(str);
                    } else {
                        this.d.j.p(str);
                    }
                }
            }
        }
        if (zO) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() throws Throwable {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C0226ef c0226ef = this.n;
            if (c0226ef != null) {
                c0226ef.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.j.n(String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C0320k5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            if (!z()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                if (this.d != null) {
                    this.d.j.u(String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                }
                return;
            }
            a(h.FAILED);
            D0 d0 = this.d;
            if (d0 != null) {
                d0.f.a(jA, 1025, false);
                this.d.f.a(jA, 1025, "time out", false);
            }
            this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C0368n2 c0368n2 = this.o;
        if (c0368n2 == null) {
            return this.a.f();
        }
        Integer numF = c0368n2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C0368n2 c0368n2I = i();
        String strK = c0368n2I.k();
        Map<String, Object> mapA = C0169ba.a(c0368n2I.a());
        mapA.put("adUnit", this.a.a());
        b(strK);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.a();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new C0320k5();
            this.k = a(strK, mapA);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(C0569z0.c(this.a.a()), str);
                return;
            }
            this.n.a((C0226ef.a) this);
            AdapterBaseInterface networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(C0569z0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            D0 d0 = this.d;
            if (d0 != null) {
                d0.j.g(str3);
            }
            onInitFailed(C0569z0.c(this.a.a()), str3);
        }
    }

    protected void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: all -> 0x0069, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x0055, B:15:0x0059, B:16:0x005e, B:18:0x0062, B:19:0x0067, B:10:0x000f, B:12:0x0050), top: B:26:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[Catch: all -> 0x0069, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x0055, B:15:0x0059, B:16:0x005e, B:18:0x0062, B:19:0x0067, B:10:0x000f, B:12:0x0050), top: B:26:0x0003, inners: #0 }] */
    public void M() {
        D0 d0;
        C0226ef c0226ef;
        synchronized (this) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.c = null;
                } catch (Exception e2) {
                    C0421q4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    D0 d1 = this.d;
                    if (d1 != null) {
                        d1.j.g(str);
                    }
                }
                d0 = this.d;
                if (d0 != null) {
                    d0.f();
                    this.d = null;
                }
                c0226ef = this.n;
                if (c0226ef != null) {
                    c0226ef.d();
                    this.n = null;
                }
            } else {
                d0 = this.d;
                if (d0 != null) {
                    d0.f();
                    this.d = null;
                }
                c0226ef = this.n;
                if (c0226ef != null) {
                    c0226ef.d();
                    this.n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.a();
        }
    }

    protected boolean O() {
        return true;
    }

    public Map<String, Object> a(A0 a0) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            map.put("dynamicDemandSource", this.j);
        }
        map.put("sessionDepth", r());
        if (this.a.e() != null && this.a.e().length() > 0) {
            map.put("genericParams", this.a.e());
        }
        if (!TextUtils.isEmpty(this.a.c())) {
            map.put("auctionId", this.a.c());
        }
        if (b(a0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.d()));
            if (!TextUtils.isEmpty(this.a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.a.b());
            }
        }
        if (!TextUtils.isEmpty(this.a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.AD_UNIT g() {
        return this.a.a();
    }

    public String h() {
        return this.a.c();
    }

    public C0368n2 i() {
        return this.o;
    }

    protected String j() {
        Placement placement = this.g;
        return placement == null ? "" : placement.getPlacementName();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.e()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        if (this.p.e()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.e()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.e()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.e()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() throws Throwable {
        if (this.p.e()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.a.g();
    }

    protected Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C0169ba.a(this.i));
        return map;
    }

    public Integer r() {
        C0332l0 c0332l0 = this.a;
        if (c0332l0 != null) {
            return Integer.valueOf(c0332l0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    protected InterfaceC0275hd u() {
        return this.p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(A0 a0) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD, A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.LOAD_AD_NO_FILL, A0.RELOAD_AD, A0.RELOAD_AD_SUCCESS, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_NO_FILL, A0.DESTROY_AD, A0.AD_PRESENT_SCREEN, A0.AD_DISMISS_SCREEN, A0.AD_LEFT_APPLICATION, A0.AD_OPENED, A0.AD_CLOSED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.AD_REWARDED)).contains(a0);
    }

    protected void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.a.i());
        return map;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    protected String a(String str) {
        String str2 = this.a.a().name() + " - " + k() + " - state = " + this.e;
        return TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    @Override // com.ironsource.C0226ef.a
    public void a() {
        if (!this.p.e()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            C0226ef c0226ef = this.n;
            if (c0226ef != null) {
                c0226ef.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C0320k5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        long jA = C0320k5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        C0226ef c0226ef = this.n;
        if (c0226ef != null) {
            c0226ef.e();
        }
        synchronized (this.q) {
            try {
                try {
                    h hVar = this.e;
                    if (hVar == h.LOADING) {
                        a(adapterErrorType, i, str, jA);
                        a(h.FAILED);
                        this.b.a(new IronSourceError(i, str), this);
                        return;
                    }
                    if (hVar == h.FAILED) {
                        a(adapterErrorType, i, str, jA);
                        return;
                    }
                    if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.l = Long.valueOf(System.currentTimeMillis());
                        ironLog.error(a(String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                        D0 d0 = this.d;
                        if (d0 != null) {
                            d0.j.a(String.format("ad expired, state = %s", this.e));
                        }
                        return;
                    }
                    ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
                    String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str);
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.r(str2);
                        } else if (this.a.a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.e != h.SHOWING) {
                            this.d.j.o(str2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.b(j, i);
                    return;
                } else {
                    this.d.f.a(j, i);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
