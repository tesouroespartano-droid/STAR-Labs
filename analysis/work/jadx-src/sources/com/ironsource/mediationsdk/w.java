package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.Ab;
import com.ironsource.B3;
import com.ironsource.B5;
import com.ironsource.C0282i3;
import com.ironsource.C0320k5;
import com.ironsource.C0326kb;
import com.ironsource.C0368n2;
import com.ironsource.C0421q4;
import com.ironsource.C0486u2;
import com.ironsource.C3;
import com.ironsource.C5;
import com.ironsource.CallableC0555y3;
import com.ironsource.D3;
import com.ironsource.D9;
import com.ironsource.I7;
import com.ironsource.InterfaceC0311jd;
import com.ironsource.J7;
import com.ironsource.Lf;
import com.ironsource.M8;
import com.ironsource.N7;
import com.ironsource.S1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
public class w extends m implements InterfaceC0311jd, S1 {
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.h.a> A;
    private long B;
    private final Object C;
    private C0320k5 D;
    private boolean E;
    private final long F;
    private final Runnable G;
    private final M8 e;
    private final M8.a f;
    private final N7 g;
    private final N7.a h;
    private k i;
    private i j;
    private C0326kb k;
    private IronSourceBannerLayout l;
    private C0282i3 m;
    private int n;
    private x o;
    private int p;
    private final ConcurrentHashMap<String, x> q;
    private CopyOnWriteArrayList<x> r;
    private String s;
    private JSONObject t;
    private String u;
    private int v;
    private com.ironsource.mediationsdk.e w;
    private C0368n2 x;
    private com.ironsource.mediationsdk.h y;
    private ConcurrentHashMap<String, C0368n2> z;

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w wVar = w.this;
                if (wVar.l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    w.this.a(C5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (wVar.o()) {
                        w.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    w.this.a(C5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    w wVar2 = w.this;
                    wVar2.k.a(TimeUnit.SECONDS.toMillis(wVar2.i.f()));
                }
            } catch (Throwable th) {
                C0421q4.d().a(th);
                w.this.a(C5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.w();
            if (w.this.y()) {
                return;
            }
            w.this.a(C5.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            w.this.b(map, arrayList, sb, arrayList2);
            w.this.a(map, arrayList, sb, arrayList2);
        }
    }

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
            w.this.a(C5.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            for (C3 c3 : list) {
                if (c3.a() != null) {
                    this.a.put(c3.c(), c3.a());
                    this.b.append(c3.d()).append(c3.c()).append(",");
                    ((x) w.this.q.get(c3.c())).a(C5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c3.e())}});
                } else {
                    ((x) w.this.q.get(c3.c())).a(C5.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c3.e())}, new Object[]{"reason", c3.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((x) w.this.q.get(it.next())).a(C5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            }
            w.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b);
        }

        @Override // com.ironsource.B3.b
        public void onFailure(String str) {
            w.this.a(C5.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            w.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b);
        }
    }

    class f implements Runnable {
        final /* synthetic */ NetworkSettings a;

        f(NetworkSettings networkSettings) {
            this.a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a(this.a);
        }
    }

    class g implements D3 {
        final /* synthetic */ x a;

        g(x xVar) {
            this.a = xVar;
        }

        @Override // com.ironsource.D3
        public void a() {
            this.a.D();
        }
    }

    class h extends TimerTask {
        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w.this.u();
        }
    }

    enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public w(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(Ab.U(), Ab.O(), list, kVar, hashSet, ironSourceSegment);
    }

    private boolean a(i iVar, i iVar2) {
        boolean z;
        synchronized (this.C) {
            if (this.j == iVar) {
                IronLog.INTERNAL.verbose("set state from '" + this.j + "' to '" + iVar2 + "'");
                this.j = iVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.j);
        if (this.i.j()) {
            iVar = z ? i.AUCTION : i.FIRST_AUCTION;
        } else {
            iVar = z ? i.RELOADING : i.LOADING;
        }
        if (!a(i.STARTED_LOADING, iVar)) {
            ironLog.error("wrong state - " + this.j);
            return;
        }
        this.D = new C0320k5();
        this.s = "";
        this.t = null;
        this.n = 0;
        this.p = this.e.a(IronSource.AD_UNIT.BANNER);
        if (z) {
            a(C5.BN_RELOAD);
        } else {
            a(C5.BN_LOAD);
        }
        if (this.i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private void f(x xVar) {
        String strK;
        IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayoutB = null;
        if (xVar.p()) {
            strK = this.z.get(xVar.c()).k();
            xVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.z.get(xVar.c()).a();
        try {
            ironSourceBannerLayoutB = this.l.b();
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e2.getMessage());
        }
        xVar.a(ironSourceBannerLayoutB, this.m, strK, jSONObjectA);
    }

    private boolean g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.o.f());
            this.o.t();
            this.o = null;
        }
    }

    private List<C0368n2> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (x xVar : this.q.values()) {
            if (!xVar.p() && !this.g.c(ContextProvider.getInstance().getApplicationContext(), this.m, IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new C0368n2(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.l.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.e : ISBannerSize.BANNER;
        }
        return this.l.getSize();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private String l() {
        C0282i3 c0282i3 = this.m;
        return c0282i3 != null ? c0282i3.getPlacementName() : "";
    }

    private void m() {
        String str = this.r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = ".concat(str));
        g(null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(C5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (!a(i.RELOADING, i.LOADED)) {
            a(iVar2);
            ironLog.error("wrong state = " + this.j);
        } else {
            a(C5.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
            this.k.a(TimeUnit.SECONDS.toMillis(this.i.f()));
        }
    }

    private void n() {
        String strL = l();
        N7.a aVar = this.h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        aVar.a(applicationContext, strL, ad_unit);
        if (this.g.c(ContextProvider.getInstance().getApplicationContext(), this.m, ad_unit)) {
            a(C5.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z;
        synchronized (this.C) {
            z = this.j == i.LOADED;
        }
        return z;
    }

    private boolean r() {
        boolean z;
        synchronized (this.C) {
            i iVar = this.j;
            z = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
        }
        return z;
    }

    private boolean s() {
        boolean z;
        synchronized (this.C) {
            i iVar = this.j;
            z = iVar == i.LOADING || iVar == i.RELOADING;
        }
        return z;
    }

    private void t() {
        try {
            for (int i2 = this.n; i2 < this.r.size(); i2++) {
                x xVar = this.r.get(i2);
                if (xVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + xVar.f());
                    this.n = i2 + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            a(C5.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e2)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
        } else {
            ironLog.error("wrong state = " + this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<C0368n2> listI = i();
        this.s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.B, this.i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void c(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C0486u2.a().f(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(C5.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void d(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C0486u2.a().b(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(C5.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void e(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C0486u2.a().e(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(C5.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public boolean o() {
        if (!this.l.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.l.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.l.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void g(x xVar) {
        for (x xVar2 : this.r) {
            if (!xVar2.equals(xVar)) {
                xVar2.q();
            }
        }
    }

    w(J7 j7, I7 i7, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.j = i.NONE;
        this.u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        M8 m8S = j7.s();
        this.e = m8S;
        this.f = i7.h();
        this.g = j7.w();
        this.h = i7.x();
        long time = new Date().getTime();
        a(C5.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.i = kVar;
        this.q = new ConcurrentHashMap<>();
        this.r = new CopyOnWriteArrayList<>();
        this.z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.p = m8S.a(ad_unit);
        n.a().a(ad_unit, this.i.d());
        if (this.i.j()) {
            this.w = new com.ironsource.mediationsdk.e(ad_unit, this.i.b(), this);
        }
        this.y = new com.ironsource.mediationsdk.h(list, this.i.b().c());
        a(list, kVar);
        this.B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.k = new C0326kb(cVar, com.ironsource.lifecycle.b.d(), new Lf());
        a(C5.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.j = iVar;
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, C0282i3 c0282i3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            if (!n.a().b(ad_unit)) {
                l.a(ironSourceBannerLayout, c0282i3, new a(c0282i3, ironSourceBannerLayout));
                return;
            } else {
                ironLog.verbose("can't load banner - already has pending invocation");
                return;
            }
        }
        IronLog.API.error("can't load banner - loadBanner already called and still in progress");
    }

    class b implements l.b {
        final /* synthetic */ IronSourceBannerLayout a;

        b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            w.this.k.b();
            w wVar = w.this;
            x xVar = wVar.o;
            w.this.a(C5.BN_DESTROY, (Object[][]) null, xVar != null ? xVar.n() : wVar.p);
            w.this.h();
            this.a.a();
            w wVar2 = w.this;
            wVar2.l = null;
            wVar2.m = null;
            wVar2.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    class a implements l.b {
        final /* synthetic */ C0282i3 a;
        final /* synthetic */ IronSourceBannerLayout b;

        a(C0282i3 c0282i3, IronSourceBannerLayout ironSourceBannerLayout) {
            this.a = c0282i3;
            this.b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.a.getPlacementName());
            l.b(this.b);
            w wVar = w.this;
            wVar.l = this.b;
            wVar.m = this.a;
            N7 n7 = wVar.g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C0282i3 c0282i3 = this.a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!n7.c(applicationContext, c0282i3, ad_unit)) {
                w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.a.getPlacementName() + " is capped"));
            w.this.a(C5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void b(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C0486u2.a().c(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(C5.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        if (this.g.c(ContextProvider.getInstance().getApplicationContext(), this.m, IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (x xVar : this.q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(xVar.d, IronSource.AD_UNIT.BANNER, null, this.l);
            if (xVar.p()) {
                list2.add(new CallableC0555y3(xVar.g(), xVar.c(), adDataCreateAdDataForNetworkAdapter, xVar, null, null));
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + ",");
            }
        }
    }

    private void b(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.l != null) {
            xVar.E();
            l.a(this.l, view, layoutParams, new g(xVar));
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        l.a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    private String b(C0368n2 c0368n2) {
        x xVar = this.q.get(c0368n2.c());
        String str = "1";
        if (xVar == null ? !TextUtils.isEmpty(c0368n2.k()) : xVar.p()) {
            str = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        }
        return str + c0368n2.c();
    }

    @Override // com.ironsource.S1
    public void a(List<C0368n2> list, String str, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (r()) {
            this.u = "";
            this.s = str;
            this.v = i2;
            this.x = c0368n2;
            this.t = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                a(C5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{"reason", str2}});
            }
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            a(jSONObject2, ad_unit);
            if (this.b.a(ad_unit)) {
                a(C5.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                i iVar2 = this.j;
                a(i.READY_TO_LOAD);
                if (iVar2 == i.FIRST_AUCTION) {
                    n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
                    return;
                }
                return;
            }
            a(C5.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            if (this.j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            a(C5.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.j);
    }

    private boolean b(C5 c5) {
        return c5 == C5.BN_CALLBACK_RELOAD_ERROR || c5 == C5.BN_CALLBACK_LOAD_SUCCESS || c5 == C5.BN_CALLBACK_LOAD_ERROR || c5 == C5.BN_CALLBACK_RELOAD_SUCCESS || c5 == C5.BN_CALLBACK_SHOW || c5 == C5.BN_CALLBACK_CLICK || c5 == C5.BN_CALLBACK_LEAVE_APP || c5 == C5.BN_AUCTION_FAILED || c5 == C5.BN_AUCTION_SUCCESS || c5 == C5.BN_AD_UNIT_CAPPED;
    }

    @Override // com.ironsource.S1
    public void a(int i2, String str, int i3, String str2, long j) {
        i iVar;
        String str3 = "Auction failed (error " + i2 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (r()) {
            this.u = str2;
            this.v = i3;
            this.t = null;
            if (this.i.b().n()) {
                ironLog.verbose("Moving to fallback waterfall");
                x();
            }
            a(C5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
            if (this.j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.j);
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void a(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
            xVar.a(C5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (s()) {
            x xVar2 = this.o;
            if (xVar2 != null) {
                xVar2.q();
            }
            g(xVar);
            this.o = xVar;
            b(xVar, view, layoutParams);
            this.A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.i.j()) {
                C0368n2 c0368n2 = this.z.get(xVar.c());
                if (c0368n2 != null) {
                    a(c0368n2.a(l()), c0368n2.d());
                    this.w.a(c0368n2, xVar.g(), this.x);
                    this.w.a(this.r, this.z, xVar.g(), this.x, c0368n2);
                    if (!this.i.b().r()) {
                        a(xVar, c0368n2);
                    }
                } else {
                    String strC = xVar.c();
                    ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.s);
                    a(C5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                }
            }
            if (this.j == i.LOADING) {
                if (g()) {
                    C0486u2.a().d(this.d);
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.D))}};
                } else {
                    objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.D))}};
                }
                a(C5.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (g()) {
                    C0486u2.a().d(this.d);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                a(C5.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.D))}});
            }
            n();
            this.f.b(IronSource.AD_UNIT.BANNER);
            a(i.LOADED);
            this.k.a(TimeUnit.SECONDS.toMillis(this.i.f()));
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.j);
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void a(IronSourceError ironSourceError, x xVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() != this.s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
            xVar.a(C5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
        } else if (s()) {
            this.A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
            t();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
        }
    }

    @Override // com.ironsource.InterfaceC0311jd
    public void a(x xVar) {
        C0368n2 c0368n2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (q()) {
            if (this.i.j() && this.i.b().r() && (c0368n2 = this.z.get(xVar.c())) != null) {
                a(xVar, c0368n2);
            }
            a(C5.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.j);
        a(C5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    private void a(x xVar, C0368n2 c0368n2) {
        this.w.a(c0368n2, xVar.g(), this.x, l());
        a(this.z.get(xVar.c()), l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC0555y3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        B3 b3 = new B3();
        e eVar = new e(map, sb, list);
        a(C5.BN_COLLECT_TOKENS);
        b3.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() == 0 && list.size() == 0) {
            a(C5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            if (a(i.AUCTION, i.LOADED)) {
                this.k.a(TimeUnit.SECONDS.toMillis(this.i.f()));
                return;
            }
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            a(C5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            a(i.READY_TO_LOAD);
            return;
        }
        a(C5.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
        com.ironsource.mediationsdk.e eVar = this.w;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.y, this.p, this.c, j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            networkSettings2 = networkSettings;
            x xVar = new x(this.i, this, networkSettings2, abstractAdapterA, this.p, p());
            this.q.put(xVar.c(), xVar);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings2.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private String a(List<C0368n2> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.r.clear();
        this.z.clear();
        this.A.clear();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0368n2 c0368n2 = list.get(i2);
            a(c0368n2);
            sb.append(b(c0368n2));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    private void a(C0368n2 c0368n2) {
        x xVar = this.q.get(c0368n2.c());
        if (xVar != null) {
            AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(xVar.b.h());
            if (abstractAdapterA != null) {
                x xVar2 = new x(this.i, this, xVar.b.h(), abstractAdapterA, this.p, this.s, this.t, this.v, this.u, p());
                xVar2.a(true);
                this.r.add(xVar2);
                this.z.put(xVar2.c(), c0368n2);
                this.A.put(c0368n2.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return;
            }
            return;
        }
        IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c0368n2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c5) {
        a(c5, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c5, Object[][] objArr) {
        a(c5, objArr, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c5, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(mediationAdditionalData, iSBannerSizeK);
            }
            if (this.m != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i2);
            if (!TextUtils.isEmpty(this.s)) {
                mediationAdditionalData.put("auctionId", this.s);
            }
            JSONObject jSONObject = this.t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.t);
            }
            if (b(c5)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.v);
                if (!TextUtils.isEmpty(this.u)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
        D9.i().a(new B5(c5, mediationAdditionalData));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        byte b2;
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (!description.equals("RECTANGLE")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 72205083:
                    if (!description.equals("LARGE")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 79011241:
                    if (!description.equals("SMART")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1951953708:
                    if (!description.equals("BANNER")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1999208305:
                    if (!description.equals("CUSTOM")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                jSONObject.put(l.h, 1);
            } else if (b2 == 1) {
                jSONObject.put(l.h, 2);
            } else if (b2 == 2) {
                jSONObject.put(l.h, 3);
            } else if (b2 == 3) {
                jSONObject.put(l.h, 5);
            } else if (b2 == 4) {
                jSONObject.put(l.h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = l.q;
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
    }
}
