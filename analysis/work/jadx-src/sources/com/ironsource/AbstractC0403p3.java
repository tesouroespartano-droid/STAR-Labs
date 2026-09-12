package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC0453s3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0403p3<Smash extends AbstractC0453s3<?>, Listener extends AdapterAdListener> implements Q0, S1, C0, InterfaceC0478tb, InterfaceC0445rc, InterfaceC0382o, sg, InterfaceC0572z3, InterfaceC0275hd {
    private AdInfo A;
    private C0238fa B;
    final M8 C;
    final M8.a D;
    protected final N7 E;
    private final N7.a F;
    private boolean G;
    private C0465sf H;
    private AtomicBoolean I;
    private N9 J;
    protected rg<Smash> a;
    protected ConcurrentHashMap<String, com.ironsource.mediationsdk.h.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected com.ironsource.mediationsdk.h d;
    protected int e;
    protected String f;
    protected JSONObject g;
    protected C0368n2 h;
    protected Placement i;
    protected boolean j;
    private NetworkStateReceiver k;
    protected Fe l;
    protected C0320k5 m;
    protected C0320k5 n;
    protected U o;
    protected f p;
    protected P0 q;
    protected Q5 r;
    protected D0 s;
    protected K0 t;
    protected r u;
    protected IronSourceSegment v;
    protected UUID w;
    protected final Object x;
    private long y;
    private Boolean z;

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    class a extends Vd {
        a() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0403p3.this.B();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$b */
    class b implements Runnable {
        final /* synthetic */ NetworkSettings a;

        b(NetworkSettings networkSettings) {
            this.a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0403p3.this.c(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$c */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC0403p3.this.D();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0403p3.this.g = new JSONObject();
            AbstractC0403p3.this.s.h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC0403p3.this.b(map, arrayList, sb, arrayList2);
            AbstractC0403p3.this.a(map, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$e */
    class e implements B3.b {
        final /* synthetic */ Map a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        e(Map map, StringBuilder sb, List list) {
            this.a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.B3.b
        public void a(List<C3> list, long j, List<String> list2) {
            AbstractC0403p3.this.s.g.a(j);
            for (C3 c3 : list) {
                NetworkSettings networkSettingsA = AbstractC0403p3.this.o.a(c3.c());
                Map<String, Object> mapB = AbstractC0403p3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC0403p3.this.o.b(), AbstractC0403p3.this.k()));
                if (c3.a() != null) {
                    this.a.put(c3.c(), c3.a());
                    this.b.append(c3.d()).append(c3.c()).append(",");
                    AbstractC0403p3.this.s.g.a(mapB, c3.e());
                } else {
                    AbstractC0403p3.this.s.g.a(mapB, c3.e(), c3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC0403p3.this.o.a(it.next());
                AbstractC0403p3.this.s.g.b(AbstractC0403p3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC0403p3.this.o.b(), AbstractC0403p3.this.k())), j);
            }
            AbstractC0403p3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.B3.b
        public void onFailure(String str) {
            AbstractC0403p3.this.s.g.a(str);
            AbstractC0403p3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC0403p3(U u, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        this(Ab.U(), Ab.O(), u, c0238fa, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.x) {
            if (this.o.h().e() && this.l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(C0569z0.a(this.o.b()), "all smashes are capped", false);
                return;
            }
            if (!t() && this.p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new IronSourceError(C0569z0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.o.h().a() != N0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != N0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.o.b()))) {
                IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.g = new JSONObject();
            F();
            if (v()) {
                this.s.f.a();
            } else {
                this.s.f.a(q());
            }
            this.n = new C0320k5();
            if (this.o.q()) {
                if (!this.b.isEmpty()) {
                    this.d.a(this.b);
                    this.b.clear();
                }
                K();
            } else {
                a(f.LOADING);
            }
            if (this.o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            L();
            C();
        }
    }

    private void C() {
        xg<Smash> xgVarE = E();
        if (xgVarE.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = xgVarE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private xg<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new wg(this.o).d(this.a.b());
    }

    private void F() {
        this.u.a(this.o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.x) {
            f fVar = this.p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long jK = this.o.d().k() - C0320k5.a(this.m);
            if (jK > 0) {
                new Timer().schedule(new c(), jK);
            } else {
                D();
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && u()) {
            return true;
        }
        return !z && this.z.booleanValue();
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.o.b());
        }
        return false;
    }

    private List<C0368n2> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                Ee ee = new Ee(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(ee)) {
                    copyOnWriteArrayList.add(new C0368n2(ee.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new Ee(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        Fe fe = new Fe();
        this.l = fe;
        fe.a(arrayList);
    }

    public void A() {
        if (e()) {
            a(new a());
        } else {
            B();
        }
    }

    protected void G() {
        com.ironsource.mediationsdk.n.a().a(this.o.b(), this.o.f());
    }

    protected boolean H() {
        return true;
    }

    protected boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.o.b(), k());
        }
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C0368n2 c0368n2);

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    protected void b(boolean z) {
        a(false, z, (AbstractC0453s3<?>) null);
    }

    @Override // com.ironsource.Q0
    public void e(AbstractC0453s3<?> abstractC0453s3) {
        IronLog.INTERNAL.verbose(b(abstractC0453s3.k()));
        this.s.i.a(n());
        this.t.a(this.i, abstractC0453s3.f());
    }

    protected abstract K0 g();

    protected void g(AbstractC0453s3<?> abstractC0453s3) {
        this.t.d(abstractC0453s3.f());
    }

    protected P0 h() {
        return new P0(this.o.h(), this);
    }

    protected String i() {
        return b((String) null);
    }

    public UUID k() {
        return this.w;
    }

    protected abstract String l();

    protected String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String n() {
        Placement placement = this.i;
        return placement == null ? "" : placement.getPlacementName();
    }

    abstract String o();

    protected boolean q() {
        return false;
    }

    protected boolean t() {
        return false;
    }

    protected boolean u() {
        return false;
    }

    protected abstract boolean v();

    protected boolean w() {
        boolean z;
        synchronized (this.x) {
            f fVar = this.p;
            z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean x() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean y() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    protected boolean z() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    protected void h(AbstractC0453s3<?> abstractC0453s3) {
        if (this.o.h().f()) {
            a(abstractC0453s3, abstractC0453s3.f());
        } else {
            a(true, false, abstractC0453s3);
        }
    }

    protected void i(AbstractC0453s3<?> abstractC0453s3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            C0368n2 c0368n2I = abstractC0453s3.i();
            this.c.a(c0368n2I, abstractC0453s3.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C0368n2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC0453s3.l(), this.h, c0368n2I);
        }
    }

    AbstractC0403p3(J7 j7, I7 i7, U u, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.I = new AtomicBoolean(false);
        this.w = UUID.randomUUID();
        this.C = j7.s();
        this.D = i7.h();
        this.E = j7.w();
        this.F = i7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + u.b() + ", loading mode = " + u.h().a());
        IronSourceUtils.sendAutomationLog(u.b() + " initiated object per waterfall mode");
        C0320k5 c0320k5 = new C0320k5();
        this.J = a(u);
        this.v = ironSourceSegment;
        this.o = u;
        this.s = new D0(u.b(), D0.b.MEDIATION, this);
        this.t = g();
        this.q = h();
        a(f.NONE);
        this.B = c0238fa;
        this.a = new rg<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(o(), this.o.h().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        G();
        this.g = new JSONObject();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), IronSourceUtils.getSessionId()));
        }
        this.d = new com.ironsource.mediationsdk.h(this.o.j(), this.o.d().c());
        s();
        r();
        this.m = new C0320k5();
        a(f.READY_TO_LOAD);
        this.r = new Q5(u.a(), this);
        this.u = new r();
        this.s.e.a(C0320k5.a(c0320k5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        String str;
        for (NetworkSettings networkSettings : this.o.j()) {
            C0465sf c0465sf = this.H;
            if (c0465sf == null || c0465sf.a(networkSettings, this.o.b())) {
                if (!this.l.b(new Ee(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), k());
                        if (adapterBaseInterfaceB instanceof A3) {
                            list2.add(new CallableC0555y3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), adDataA, (A3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            if (adapterBaseInterfaceB == null) {
                                str = "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName();
                            } else {
                                str = "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface";
                            }
                            this.s.j.g(str);
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.b())).append(networkSettings.getProviderInstanceName()).append(",");
                    }
                }
            }
        }
    }

    @Override // com.ironsource.InterfaceC0275hd
    public boolean e() {
        N9 n9 = this.J;
        if (n9 == null || n9 == Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.Q0
    public void d(AbstractC0453s3<?> abstractC0453s3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC0453s3.k()));
        if (!abstractC0453s3.h().equals(this.a.c())) {
            ironLog.error(b("invoked from " + abstractC0453s3.c() + " with state = " + this.p + " auctionId: " + abstractC0453s3.h() + " and the current id is " + this.a.c()));
            this.s.j.p("onAdLoadSuccess invoked with state = " + this.p);
            return;
        }
        if (this.o.m()) {
            List<Smash> listB = this.a.b();
            wg wgVar = new wg(this.o);
            boolean zA = wgVar.a(abstractC0453s3, listB);
            synchronized (this.x) {
                if (zA) {
                    if (w()) {
                        i(abstractC0453s3);
                    }
                }
                if (wgVar.a(listB)) {
                    i(wgVar.c(listB));
                }
            }
        }
        this.b.put(abstractC0453s3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = C0320k5.a(this.n);
            if (v()) {
                this.s.f.a(jA);
            } else {
                this.s.f.a(jA, q());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC0453s3);
            }
            h(abstractC0453s3);
        }
    }

    protected void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.p == fVar) {
                IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                this.p = fVar2;
                z = true;
            } else {
                IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                z = false;
            }
        }
        return z;
    }

    private N9 a(U u) {
        if (u.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    protected void a(K0 k0) {
        this.t = k0;
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, ad_unit, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected void a(boolean z, boolean z2, AbstractC0453s3<?> abstractC0453s3) {
        synchronized (this.x) {
            Boolean bool = this.z;
            if (bool == null || bool.booleanValue() != z) {
                this.z = Boolean.valueOf(z);
                long time = 0;
                if (this.y != 0) {
                    time = new Date().getTime() - this.y;
                }
                this.y = new Date().getTime();
                this.s.f.a(z, time, z2);
                AdInfo adInfoF = abstractC0453s3 != null ? abstractC0453s3.f() : this.A;
                this.A = adInfoF;
                K0 k0 = this.t;
                if (!z) {
                    adInfoF = null;
                }
                k0.a(z, adInfoF);
            }
        }
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.o.b());
    }

    private boolean b(A0 a0) {
        return !new ArrayList(Arrays.asList(A0.INIT_STARTED, A0.LOAD_AD, A0.AUCTION_REQUEST, A0.AUCTION_REQUEST_WATERFALL, A0.AUCTION_FAILED_NO_CANDIDATES, A0.COLLECT_TOKEN, A0.COLLECT_TOKENS_COMPLETED, A0.COLLECT_TOKENS_FAILED, A0.INSTANCE_COLLECT_TOKEN, A0.INSTANCE_COLLECT_TOKEN_SUCCESS, A0.INSTANCE_COLLECT_TOKEN_FAILED, A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(a0);
    }

    private boolean c(A0 a0) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.AUCTION_SUCCESS, A0.AUCTION_FAILED, A0.AUCTION_FAILED_NO_CANDIDATES, A0.AD_FORMAT_CAPPED, A0.AD_OPENED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_SUCCESS, A0.AD_LEFT_APPLICATION)).contains(a0);
    }

    @Override // com.ironsource.InterfaceC0382o
    public void a() {
        if (this.o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    protected void b(C0368n2 c0368n2, String str) {
        if (c0368n2 != null) {
            ImpressionData impressionDataA = c0368n2.a(str);
            if (impressionDataA != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA));
                    impressionDataListener.onImpressionSuccess(impressionDataA);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        D0 d0 = this.s;
        if (d0 != null) {
            d0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC0445rc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (AbstractC0453s3<?>) null);
        }
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C0368n2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0368n2 c0368n2 = list.get(i);
            AbstractC0453s3 abstractC0453s3A = a(c0368n2, str);
            if (abstractC0453s3A != null) {
                copyOnWriteArrayList.add(abstractC0453s3A);
                sb.append(a(c0368n2, abstractC0453s3A.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.a.a(this.o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    private void b(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(b(this.o.r()));
            } catch (JSONException e2) {
                C0421q4.d().a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    @Override // com.ironsource.sg
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(C0368n2 c0368n2, String str) {
        NetworkSettings networkSettingsA = this.o.a(c0368n2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.o.b(), k());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.o.b()), str, c0368n2);
                this.b.put(c0368n2.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c0368n2.c() + " state = " + this.p;
        IronLog.INTERNAL.error(b(str2));
        this.s.j.i(str2);
        return null;
    }

    protected String b(String str) {
        String str2 = this.o.b().name() + " state:" + this.p;
        return TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
            return map;
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return map;
        }
    }

    protected void a(int i, String str, boolean z) {
        int i2;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (z) {
                i2 = i;
                str2 = str;
            } else {
                i2 = i;
                str2 = str;
                this.s.f.a(C0320k5.a(this.n), i2, str2, q());
            }
            a(new IronSourceError(i2, str2));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    protected void a(AbstractC0453s3<?> abstractC0453s3, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    protected void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.o.b(), ironSourceError);
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        B3 b3 = new B3();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        b3.a(list2, eVar, this.o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(C0569z0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int iA = this.C.a(this.o.b());
            com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.o.b());
            iVar.b(IronSourceUtils.isEncryptedResponse());
            iVar.a(map);
            iVar.a(list);
            iVar.a(this.d);
            iVar.a(iA);
            iVar.a(this.v);
            iVar.d(this.G);
            C0465sf c0465sf = this.H;
            if (c0465sf != null && c0465sf.b()) {
                z = true;
            }
            iVar.e(z);
            a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    protected void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, iVar, s1);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C0368n2> list, String str, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            this.f = "";
            this.e = i;
            this.h = c0368n2;
            this.g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(strA);
            a(f.LOADING);
            C();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
        this.s.j.k("unexpected auction success, state = " + this.p);
    }

    @Override // com.ironsource.S1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.sendAutomationLog(l() + ": " + str3);
            this.e = i2;
            this.f = str2;
            this.g = new JSONObject();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                L();
            }
            this.s.h.a(j, i, str);
            a(f.LOADING);
            C();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
        ironLog.error(b(str4));
        this.s.j.j(str4);
    }

    @Override // com.ironsource.Q0
    public void a(IronSourceError ironSourceError, AbstractC0453s3<?> abstractC0453s3) {
        xg<Smash> xgVarE;
        AbstractC0453s3<?> abstractC0453s3C;
        synchronized (this.x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(abstractC0453s3.k() + " - error = " + ironSourceError));
            if (abstractC0453s3.h().equals(this.a.c()) && this.p != f.AUCTION) {
                this.b.put(abstractC0453s3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
                if (z() || x()) {
                    xgVarE = E();
                    if (xgVarE.c()) {
                        a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                        return;
                    }
                } else {
                    xgVarE = null;
                }
                if (xgVarE == null) {
                    return;
                }
                if (this.o.m()) {
                    synchronized (this.x) {
                        if (xgVarE.b() && w() && (abstractC0453s3C = new wg(this.o).c(this.a.b())) != null) {
                            i(abstractC0453s3C);
                        }
                    }
                }
                Iterator<Smash> it = xgVarE.a().iterator();
                while (it.hasNext()) {
                    it.next().E();
                }
                return;
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + abstractC0453s3.c() + " with state =" + this.p + " auctionId: " + abstractC0453s3.h() + " and the current id is " + this.a.c()));
            this.s.j.o("onAdLoadFailed was invoked with state =" + this.p);
        }
    }

    @Override // com.ironsource.Q0
    public void a(AbstractC0453s3<?> abstractC0453s3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC0453s3.k()));
        this.s.i.g(n());
        this.a.a(abstractC0453s3);
        this.a.b(abstractC0453s3);
        this.l.a(abstractC0453s3);
        if (this.l.b(abstractC0453s3)) {
            ironLog.verbose(b(abstractC0453s3.c() + " was session capped"));
            abstractC0453s3.N();
            IronSourceUtils.sendAutomationLog(abstractC0453s3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.s.i.b(n(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            C0368n2 c0368n2I = abstractC0453s3.i();
            this.c.a(c0368n2I, abstractC0453s3.l(), this.h, n());
            this.b.put(abstractC0453s3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(c0368n2I, n());
            }
        }
        g(abstractC0453s3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public Map<String, Object> a(A0 a0) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.o.b())));
        if (c(a0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(a0) && !TextUtils.isEmpty(this.a.c())) {
            map.put("auctionId", this.a.c());
        }
        return map;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.v = ironSourceSegment;
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    protected String a(C0368n2 c0368n2, int i) {
        return String.format("%s%s", Integer.valueOf(i), c0368n2.c());
    }

    public void a(C0465sf c0465sf) {
        this.H = c0465sf;
        if (c0465sf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC0572z3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), k());
        if (adapterBaseInterfaceB != null) {
            this.s.g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.InterfaceC0572z3
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC0275hd
    public void a(Runnable runnable) {
        N9 n9 = this.J;
        if (n9 != null) {
            n9.a(runnable);
        }
    }
}
