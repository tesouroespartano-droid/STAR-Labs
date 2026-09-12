package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.Ab;
import com.ironsource.B3;
import com.ironsource.B5;
import com.ironsource.C0221ea;
import com.ironsource.C0368n2;
import com.ironsource.C0402p2;
import com.ironsource.C0410pa;
import com.ironsource.C0421q4;
import com.ironsource.C0446rd;
import com.ironsource.C3;
import com.ironsource.C5;
import com.ironsource.CallableC0555y3;
import com.ironsource.Fe;
import com.ironsource.InterfaceC0382o;
import com.ironsource.InterfaceC0393oa;
import com.ironsource.InterfaceC0445rc;
import com.ironsource.Md;
import com.ironsource.N7;
import com.ironsource.Od;
import com.ironsource.P7;
import com.ironsource.Q5;
import com.ironsource.Qd;
import com.ironsource.Rd;
import com.ironsource.S1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class q extends m implements InterfaceC0393oa, Rd, S1, P7, InterfaceC0445rc, InterfaceC0382o {
    private e A;
    private long B;
    private Boolean C;
    private final Object D;
    private Q5 E;
    private final long F;
    private final N7.a G;
    private final N7 H;
    private C0410pa e;
    private ConcurrentHashMap<String, C0368n2> f;
    private ConcurrentHashMap<String, h.a> g;
    private C0368n2 h;
    private h i;
    private com.ironsource.mediationsdk.e j;
    private JSONObject k;
    private Qd l;
    private boolean m;
    private boolean n;
    private long o;
    private String p;
    private int q;
    private NetworkStateReceiver r;
    private boolean s;
    private final ConcurrentHashMap<String, r> t;
    private Fe u;
    private int v;
    private String w;
    private int x;
    private boolean y;
    private boolean z;

    class a implements Runnable {
        final /* synthetic */ NetworkSettings a;
        final /* synthetic */ Md b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        a(NetworkSettings networkSettings, Md md, String str, String str2) {
            this.a = networkSettings;
            this.b = md;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a(this.a, this.b, this.c, this.d);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q.this.j();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d("makeAuction()");
            q.this.o = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            q.this.b(map, arrayList, sb, arrayList2);
            q.this.a(map, arrayList, sb, arrayList2);
        }
    }

    class d implements B3.b {
        final /* synthetic */ Map a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        d(Map map, StringBuilder sb, List list) {
            this.a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.B3.b
        public void a(List<C3> list, long j, List<String> list2) {
            q.this.c(C5.RV_COLLECT_TOKENS_COMPLETED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
            for (C3 c3 : list) {
                r rVar = (r) q.this.t.get(c3.c());
                if (c3.a() != null) {
                    this.a.put(c3.c(), c3.a());
                    this.b.append(c3.d()).append(c3.c()).append(",");
                    if (rVar != null) {
                        rVar.a(C5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c3.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(C5.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c3.e())}, new Object[]{"reason", c3.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) q.this.t.get(it.next());
                if (rVar2 != null) {
                    rVar2.a(C5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
                }
            }
            q.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.B3.b
        public void onFailure(String str) {
            q.this.c(C5.RV_COLLECT_TOKENS_FAILED, C0221ea.a(new Object[][]{new Object[]{"reason", str}}));
            q.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }
    }

    private enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(List<NetworkSettings> list, Md md, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws Throwable {
        super(hashSet, ironSourceSegment);
        this.p = "";
        this.s = false;
        this.v = 1;
        this.D = new Object();
        this.G = Ab.O().x();
        this.H = Ab.U().w();
        long time = new Date().getTime();
        c(C5.RV_MANAGER_INIT_STARTED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.x = md.g();
        this.y = md.j();
        this.w = "";
        this.k = null;
        C0402p2 c0402p2K = md.k();
        this.z = false;
        this.e = new C0410pa(md.k().f(), md.k().i());
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.B = new Date().getTime();
        this.m = c0402p2K.g() > 0;
        this.n = c0402p2K.n();
        if (this.m) {
            this.j = new com.ironsource.mediationsdk.e(IronSource.AD_UNIT.REWARDED_VIDEO, c0402p2K, this);
        }
        this.l = new Qd(c0402p2K, this);
        ConcurrentHashMap<String, r> concurrentHashMap = new ConcurrentHashMap<>();
        this.t = concurrentHashMap;
        a(list, md, str, str2);
        this.i = new h(list, c0402p2K.c());
        Fe fe = new Fe();
        this.u = fe;
        fe.a(new ArrayList(concurrentHashMap.values()));
        this.E = new Q5(md.c(), this);
        this.F = md.l();
        c(C5.RV_MANAGER_INIT_ENDED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        a(c0402p2K.k());
    }

    private void a(List<NetworkSettings> list, Md md, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), md, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(md.f(), md.o(), arrayList);
    }

    private List<C0368n2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (r rVar : this.t.values()) {
            if (!rVar.p() && !this.u.b(rVar) && this.e.b(rVar)) {
                copyOnWriteArrayList.add(new C0368n2(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.z) {
            b(false);
        }
        this.l.a();
    }

    private void i() throws Throwable {
        if (this.e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(C5.TROUBLESHOOTING_RV_LOAD_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.e.c().size() && i < this.x; i2++) {
            r rVar = this.e.c().get(i2);
            if (rVar.h()) {
                if (this.y && rVar.p()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + rVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    } else {
                        String str2 = "Advanced Loading: Starting to load bidder " + rVar.c() + ". No other instances will be loaded at the same time.";
                        d(str2);
                        IronSourceUtils.sendAutomationLog(str2);
                        g(rVar);
                        return;
                    }
                }
                g(rVar);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            e eVar = this.A;
            e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                AsyncTask.execute(new c());
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.k);
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void b(r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        C0446rd.a().c();
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void c(r rVar) {
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.A.name());
        C0446rd.a().b(this.e.a(rVar.u()));
        this.z = false;
        boolean z = this.A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            for (r rVar2 : this.e.c()) {
                if (rVar2.y()) {
                    sb.append(rVar2.c() + ";");
                }
            }
        }
        rVar.b(C5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = " + (sb.length() > 0 ? "true|" + ((Object) sb) : "false")}});
        if (rVar.equals(this.e.f())) {
            this.e.a((r) null);
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.ironsource.P7
    public boolean d() {
        if ((!this.s || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.A == e.RV_STATE_READY_TO_SHOW && !this.z) {
            Iterator<r> it = this.e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void e(r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        C0446rd.a().b();
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void f(r rVar) {
        this.e.a(rVar);
        this.v++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.m) {
            C0368n2 c0368n2 = this.f.get(rVar.c());
            if (c0368n2 != null) {
                C0410pa c0410pa = this.e;
                c0410pa.a(c0410pa.d(), c0368n2.a(this.w), c0368n2.d());
                this.j.a(c0368n2, rVar.g(), this.h, this.w);
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c0368n2, this.w);
            } else {
                String strC = rVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(C5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        C0446rd.a().c(this.e.a(rVar.u()));
        b(false);
        this.l.c();
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void b(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        C0446rd.a().a(placement, this.e.a(rVar.u()));
    }

    @Override // com.ironsource.Rd
    public void b() throws Throwable {
        d("onLoadTriggered: RV load was triggered in " + this.A + " state");
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        for (r rVar : this.t.values()) {
            if (!this.u.b(rVar) && this.e.b(rVar)) {
                if (rVar.p()) {
                    list2.add(new CallableC0555y3(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + ",");
                }
            }
        }
    }

    private void g(r rVar) throws Throwable {
        String strK = this.f.get(rVar.c()).k();
        JSONObject jSONObjectA = this.f.get(rVar.c()).a();
        rVar.c(strK);
        rVar.a(strK, jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, Md md, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            r rVar = new r(str, str2, networkSettings, this, md.h(), abstractAdapterA, this.v);
            this.t.put(rVar.c(), rVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x005a A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC0393oa
    public void d(r rVar) throws Throwable {
        String str;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this.D) {
            a(rVar, "onLoadError mState=" + this.A);
            if (rVar.u() == this.e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                e eVar = this.A;
                if (eVar == e.RV_STATE_LOADING_SMASHES || eVar == e.RV_STATE_READY_TO_SHOW) {
                    boolean z = false;
                    boolean z2 = false;
                    for (r rVar2 : this.e.c()) {
                        if (rVar2.h()) {
                            if (this.y && rVar2.p()) {
                                if (!z && !z2) {
                                    String str2 = "Advanced Loading: Starting to load bidder " + rVar2.c() + ". No other instances will be loaded at the same time.";
                                    d(str2);
                                    IronSourceUtils.sendAutomationLog(str2);
                                    if (this.f.get(rVar2.c()) != null) {
                                        copyOnWriteArrayList.add(rVar2);
                                        if (this.y) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                    continue;
                                } else {
                                    if (z) {
                                        str = "a non bidder is being loaded";
                                    } else {
                                        str = "a non bidder was already loaded successfully";
                                    }
                                    String str3 = "Advanced Loading: Won't start loading bidder " + rVar2.c() + " as " + str;
                                    d(str3);
                                    IronSourceUtils.sendAutomationLog(str3);
                                    break;
                                }
                            } else if (this.f.get(rVar2.c()) != null) {
                                copyOnWriteArrayList.add(rVar2);
                                if (this.y || !rVar.p() || rVar2.p() || copyOnWriteArrayList.size() >= this.x) {
                                    break;
                                } else {
                                    z = true;
                                }
                            } else {
                                continue;
                            }
                        } else if (rVar2.z()) {
                            z = true;
                        } else if (rVar2.A()) {
                            z2 = true;
                        }
                    }
                    if (copyOnWriteArrayList.size() == 0 && !z2 && !z) {
                        d("onLoadError(): No other available smashes");
                        if (!this.z) {
                            b(false);
                        }
                        a(C5.TROUBLESHOOTING_RV_LOAD_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "Mediation No fill"}}));
                        a(e.RV_STATE_NOT_LOADED);
                        this.l.a();
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        g((r) it.next());
                    }
                    return;
                }
                return;
            }
            d("onLoadError was invoked with auctionId:" + rVar.u() + " and the current id is " + this.e.d());
            rVar.a(C5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 4}, new Object[]{"reason", "loadError wrong auction ID " + this.A}});
        }
    }

    private void b(boolean z) {
        a(z, (Map<String, Object>) null);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    private void b(C5 c5) {
        a(c5, (Map<String, Object>) null, false, false);
    }

    private void b(C5 c5, Map<String, Object> map) {
        a(c5, map, true, true);
    }

    private void c(r rVar, Placement placement) {
        d("showVideo()");
        this.u.a(rVar);
        if (this.u.b(rVar)) {
            rVar.B();
            IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        N7.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String placementName = placement.getPlacementName();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.a(applicationContext, placementName, ad_unit);
        if (this.H.c(ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            a(C5.RV_CAP_PLACEMENT);
        }
        this.E.a();
        rVar.a(placement);
    }

    @Override // com.ironsource.P7
    public void a(Activity activity, Placement placement) {
        synchronized (this.D) {
            try {
                if (placement == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    C0446rd c0446rdA = C0446rd.a();
                    C0410pa c0410pa = this.e;
                    c0446rdA.a(ironSourceError, c0410pa.a(c0410pa.d()));
                    a(C5.RV_CALLBACK_SHOW_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.w = placement.getPlacementName();
                b("showRewardedVideo(" + placement + ")");
                r rVar = null;
                b(C5.RV_API_SHOW_CALLED, activity != null ? C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                if (this.z) {
                    a("showRewardedVideo error: can't show ad while an ad is already showing");
                    IronSourceError ironSourceError2 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing");
                    C0446rd c0446rdA2 = C0446rd.a();
                    C0410pa c0410pa2 = this.e;
                    c0446rdA2.a(ironSourceError2, c0410pa2.a(c0410pa2.d()));
                    b(C5.RV_CALLBACK_SHOW_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    return;
                }
                if (this.A != e.RV_STATE_READY_TO_SHOW) {
                    a("showRewardedVideo error: show called while no ads are available");
                    IronSourceError ironSourceError3 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available");
                    C0446rd c0446rdA3 = C0446rd.a();
                    C0410pa c0410pa3 = this.e;
                    c0446rdA3.a(ironSourceError3, c0410pa3.a(c0410pa3.d()));
                    b(C5.RV_CALLBACK_SHOW_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    return;
                }
                if (this.H.c(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    String str = "showRewardedVideo error: placement " + this.w + " is capped";
                    a(str);
                    IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                    C0446rd c0446rdA4 = C0446rd.a();
                    C0410pa c0410pa4 = this.e;
                    c0446rdA4.a(ironSourceError4, c0410pa4.a(c0410pa4.d()));
                    b(C5.RV_CALLBACK_SHOW_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (r rVar2 : this.e.c()) {
                    if (rVar2.A()) {
                        this.z = true;
                        rVar2.b(true);
                        a(e.RV_STATE_NOT_LOADED);
                        rVar = rVar2;
                        break;
                    }
                    if (rVar2.e() != null) {
                        stringBuffer.append(rVar2.c() + ":" + rVar2.e() + ",");
                    }
                    rVar2.b(false);
                }
                if (rVar == null) {
                    d("showRewardedVideo(): No ads to show");
                    C0446rd c0446rdA5 = C0446rd.a();
                    IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    C0410pa c0410pa5 = this.e;
                    c0446rdA5.a(ironSourceErrorBuildNoAdsToShowError, c0410pa5.a(c0410pa5.d()));
                    HashMap map = new HashMap();
                    map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                    map.put("reason", "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    b(C5.RV_CALLBACK_SHOW_FAILED, map);
                    this.l.b();
                    return;
                }
                c(rVar, placement);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean c(C5 c5) {
        return c5 == C5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || c5 == C5.RV_AUCTION_SUCCESS || c5 == C5.RV_AUCTION_FAILED || c5 == C5.RV_AD_UNIT_CAPPED;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C5 c5, Map<String, Object> map) {
        a(c5, map, false, false);
    }

    private boolean c(boolean z) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && d()) {
            return true;
        }
        return !z && this.C.booleanValue();
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void a(r rVar) {
        synchronized (this.D) {
            a(rVar, "onLoadSuccess mState=" + this.A);
            if (rVar.u() == this.e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                e eVar = this.A;
                e eVar2 = e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(e.RV_STATE_READY_TO_SHOW);
                    a(C5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.o)}}));
                    this.E.a(0L);
                    if (this.m) {
                        C0368n2 c0368n2 = this.f.get(rVar.c());
                        if (c0368n2 != null) {
                            C0410pa c0410pa = this.e;
                            c0410pa.a(c0410pa.d(), c0368n2.a(""), c0368n2.d());
                            this.j.a(c0368n2, rVar.g(), this.h);
                            this.j.a(this.e.c(), this.f, rVar.g(), this.h, c0368n2);
                        } else {
                            String strC = rVar.c();
                            c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.e.d());
                            a(C5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing " + eVar2}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.e.d());
            rVar.a(C5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "onLoadSuccess wrong auction ID " + this.A}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void a(IronSourceError ironSourceError, r rVar) {
        C0368n2 c0368n2;
        if (this.m && (c0368n2 = this.f.get(rVar.c())) != null) {
            C0410pa c0410pa = this.e;
            c0410pa.a(c0410pa.d(), c0368n2.a(this.w), c0368n2.d());
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.z = false;
        b(C5.RV_CALLBACK_SHOW_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        C0446rd.a().a(ironSourceError, this.e.a(rVar.u()));
        this.g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.l.b();
    }

    @Override // com.ironsource.InterfaceC0393oa
    public void a(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        C0446rd.a().b(placement, this.e.a(rVar.u()));
    }

    @Override // com.ironsource.S1
    public void a(List<C0368n2> list, String str, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws Throwable {
        d("makeAuction(): success");
        this.h = c0368n2;
        this.q = i;
        this.k = jSONObject;
        this.p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(C5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.b.a(ad_unit)) {
            a(C5.RV_AD_UNIT_CAPPED, C0221ea.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.k);
            a(C5.RV_AUCTION_SUCCESS, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
            i();
        }
    }

    @Override // com.ironsource.S1
    public void a(int i, String str, int i2, String str2, long j) throws Throwable {
        String str3 = "Auction failed (error " + i + " - " + str + ")";
        d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.q = i2;
        this.p = str2;
        this.k = null;
        if (this.n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(C5.RV_AUCTION_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        } else {
            a(C5.RV_AUCTION_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        }
        i();
    }

    private void a(long j) throws Throwable {
        if (this.u.a()) {
            d("all smashes are capped");
            a(C5.TROUBLESHOOTING_RV_LOAD_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.m) {
            if (!this.g.isEmpty()) {
                this.i.a(this.g);
                this.g.clear();
            }
            new Timer().schedule(new b(), j);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (this.e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(C5.TROUBLESHOOTING_RV_LOAD_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        } else {
            b(C5.RV_BUSINESS_MEDIATION_LOAD);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        B3 b3 = new B3();
        d dVar = new d(map, sb, list);
        b(C5.RV_COLLECT_TOKENS);
        b3.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(C5.RV_AUCTION_FAILED, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
        } else {
            d("makeAuction() - request waterfall is: " + str);
            b(C5.RV_BUSINESS_MEDIATION_LOAD);
            b(C5.RV_AUCTION_REQUEST);
            c(C5.RV_AUCTION_REQUEST_WATERFALL, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
            this.j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.i, this.v, this.c);
        }
    }

    private void a(List<C0368n2> list, String str, JSONObject jSONObject) {
        this.f.clear();
        this.g.clear();
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (C0368n2 c0368n2 : list) {
            sb.append(a(c0368n2) + ",");
            r rVar = this.t.get(c0368n2.c());
            if (rVar != null) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(rVar.b.h());
                if (abstractAdapterA != null) {
                    r rVar2 = new r(rVar, this, abstractAdapterA, this.v, str, jSONObject, this.q, this.p);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f.put(rVar2.c(), c0368n2);
                    this.g.put(c0368n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c0368n2.c());
            }
        }
        this.e.a(copyOnWriteArrayList, str);
        if (this.e.a()) {
            a(C5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C0221ea.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(C5.RV_AUCTION_RESPONSE_WATERFALL, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    private String a(C0368n2 c0368n2) {
        String string;
        r rVar = this.t.get(c0368n2.c());
        if (rVar != null) {
            string = Integer.toString(rVar.g());
        } else {
            string = TextUtils.isEmpty(c0368n2.k()) ? "1" : CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        }
        return string + c0368n2.c();
    }

    private void a(e eVar) {
        d("current state=" + this.A + ", new state=" + eVar);
        this.A = eVar;
    }

    private void a(boolean z, Map<String, Object> map) {
        C5 c5;
        synchronized (this.D) {
            Boolean bool = this.C;
            if (bool == null || bool.booleanValue() != z) {
                this.C = Boolean.valueOf(z);
                long time = new Date().getTime() - this.B;
                this.B = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                if (z) {
                    c5 = C5.RV_CALLBACK_AVAILABILITY_TRUE;
                } else {
                    c5 = C5.RV_CALLBACK_AVAILABILITY_FALSE;
                }
                a(c5, map);
                C0446rd c0446rdA = C0446rd.a();
                C0410pa c0410pa = this.e;
                c0446rdA.a(z, c0410pa.a(c0410pa.d()));
            }
        }
    }

    private void a(r rVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + (rVar.c() + " : " + str), 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(C5 c5, Map<String, Object> map) {
        a(c5, map, false, true);
    }

    private void a(C5 c5) {
        a(c5, (Map<String, Object>) null, true, true);
    }

    private void a(C5 c5, Map<String, Object> map, boolean z, boolean z2) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.e.d())) {
            map2.put("auctionId", this.e.d());
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.k);
        }
        if (z && !TextUtils.isEmpty(this.w)) {
            map2.put("placement", this.w);
        }
        if (c(c5)) {
            Od.i().a(map2, this.q, this.p);
        }
        map2.put("sessionDepth", Integer.valueOf(this.v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (Exception e2) {
                C0421q4.d().a(e2);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        Od.i().a(new B5(c5, new JSONObject(map2)));
    }

    @Override // com.ironsource.InterfaceC0382o
    public void a() throws Throwable {
        a(e.RV_STATE_NOT_LOADED);
        a(false, C0221ea.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.InterfaceC0445rc
    public void a(boolean z) {
        if (this.s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (c(z)) {
                b(z);
            }
        }
    }

    @Override // com.ironsource.P7
    public void a(Context context, boolean z) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.s = z;
            if (z) {
                if (this.r == null) {
                    this.r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.r != null) {
                context.getApplicationContext().unregisterReceiver(this.r);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }
}
