package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.A1;
import com.ironsource.Ab;
import com.ironsource.Ac;
import com.ironsource.Ae;
import com.ironsource.B5;
import com.ironsource.Bb;
import com.ironsource.Be;
import com.ironsource.C0414pe;
import com.ironsource.C0421q4;
import com.ironsource.C0430qd;
import com.ironsource.C0463sd;
import com.ironsource.C5;
import com.ironsource.De;
import com.ironsource.E1;
import com.ironsource.EnumC0397oe;
import com.ironsource.InterfaceC0339l7;
import com.ironsource.InterfaceC0445rc;
import com.ironsource.K1;
import com.ironsource.M6;
import com.ironsource.P9;
import com.ironsource.Wc;
import com.ironsource.Z4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class s implements InterfaceC0445rc {
    private static s A;
    private De a;
    private NetworkStateReceiver p;
    private CountDownTimer q;
    private String t;
    private Ae u;
    private SegmentListener v;
    private long x;
    private int b = e.f;
    private InterfaceC0339l7 c = Ab.U().k();
    private final String d = "appKey";
    private final String e = getClass().getSimpleName();
    private boolean l = false;
    private boolean n = false;
    private List<Ac> r = new ArrayList();
    private String s = "";
    private f z = new a();
    private Handler m = IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;
    private int h = 62;
    private int i = 12;
    private int j = 5;
    private AtomicBoolean o = new AtomicBoolean(true);
    private boolean k = false;
    private boolean w = false;
    private P9 y = new P9();

    class a extends f {
        a() {
            super();
        }

        /* JADX WARN: Code duplicated, block: B:62:0x02d2 A[Catch: Exception -> 0x0327, TryCatch #0 {Exception -> 0x0327, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0194, B:26:0x01a8, B:28:0x01ae, B:29:0x01c8, B:31:0x01d8, B:33:0x01ea, B:35:0x01f4, B:36:0x0201, B:38:0x0219, B:73:0x0321, B:39:0x023e, B:41:0x0246, B:42:0x0258, B:44:0x025e, B:45:0x026a, B:47:0x0271, B:48:0x027c, B:50:0x0282, B:51:0x028c, B:53:0x0290, B:55:0x029c, B:57:0x02b9, B:58:0x02c2, B:60:0x02c6, B:72:0x0317, B:62:0x02d2, B:64:0x02da, B:66:0x02e5, B:67:0x02e9, B:68:0x02f3, B:70:0x02f9, B:71:0x0305), top: B:78:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x02da A[Catch: Exception -> 0x0327, TryCatch #0 {Exception -> 0x0327, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0194, B:26:0x01a8, B:28:0x01ae, B:29:0x01c8, B:31:0x01d8, B:33:0x01ea, B:35:0x01f4, B:36:0x0201, B:38:0x0219, B:73:0x0321, B:39:0x023e, B:41:0x0246, B:42:0x0258, B:44:0x025e, B:45:0x026a, B:47:0x0271, B:48:0x027c, B:50:0x0282, B:51:0x028c, B:53:0x0290, B:55:0x029c, B:57:0x02b9, B:58:0x02c2, B:60:0x02c6, B:72:0x0317, B:62:0x02d2, B:64:0x02da, B:66:0x02e5, B:67:0x02e9, B:68:0x02f3, B:70:0x02f9, B:71:0x0305), top: B:78:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x02e5 A[Catch: Exception -> 0x0327, TryCatch #0 {Exception -> 0x0327, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0194, B:26:0x01a8, B:28:0x01ae, B:29:0x01c8, B:31:0x01d8, B:33:0x01ea, B:35:0x01f4, B:36:0x0201, B:38:0x0219, B:73:0x0321, B:39:0x023e, B:41:0x0246, B:42:0x0258, B:44:0x025e, B:45:0x026a, B:47:0x0271, B:48:0x027c, B:50:0x0282, B:51:0x028c, B:53:0x0290, B:55:0x029c, B:57:0x02b9, B:58:0x02c2, B:60:0x02c6, B:72:0x0317, B:62:0x02d2, B:64:0x02da, B:66:0x02e5, B:67:0x02e9, B:68:0x02f3, B:70:0x02f9, B:71:0x0305), top: B:78:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x02f9 A[Catch: Exception -> 0x0327, LOOP:3: B:68:0x02f3->B:70:0x02f9, LOOP_END, TryCatch #0 {Exception -> 0x0327, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0194, B:26:0x01a8, B:28:0x01ae, B:29:0x01c8, B:31:0x01d8, B:33:0x01ea, B:35:0x01f4, B:36:0x0201, B:38:0x0219, B:73:0x0321, B:39:0x023e, B:41:0x0246, B:42:0x0258, B:44:0x025e, B:45:0x026a, B:47:0x0271, B:48:0x027c, B:50:0x0282, B:51:0x028c, B:53:0x0290, B:55:0x029c, B:57:0x02b9, B:58:0x02c2, B:60:0x02c6, B:72:0x0317, B:62:0x02d2, B:64:0x02da, B:66:0x02e5, B:67:0x02e9, B:68:0x02f3, B:70:0x02f9, B:71:0x0305), top: B:78:0x0000 }] */
        @Override // java.lang.Runnable
        public void run() {
            s sVar;
            Iterator it;
            Be beJ;
            try {
                p pVarM = p.m();
                if (!TextUtils.isEmpty(s.this.s)) {
                    M6.a().a("userId", s.this.s);
                }
                if (!TextUtils.isEmpty(s.this.t)) {
                    M6.a().a("appKey", s.this.t);
                }
                s sVar2 = s.this;
                sVar2.y.i(sVar2.s);
                s.this.x = new Date().getTime();
                C0430qd.c().a();
                s.this.u = pVarM.b(ContextProvider.getInstance().getApplicationContext(), s.this.s, this.c);
                s sVar3 = s.this;
                if (sVar3.u != null) {
                    sVar3.m.removeCallbacks(this);
                    if (s.this.u.p()) {
                        s.this.b(d.INITIATED);
                        new Bb().a(s.this.u.c().b().e().b(), pVarM.C());
                        K1 k1F = s.this.u.c().b().f();
                        if (k1F != null) {
                            Z4 z4 = Z4.a;
                            z4.c(k1F.g());
                            z4.a(k1F.f());
                            z4.a(k1F.j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1F.h());
                            s.this.c.a(k1F);
                        }
                        s.this.a(ContextProvider.getInstance().getApplicationContext(), s.this.u);
                        long time = new Date().getTime();
                        s sVar4 = s.this;
                        pVarM.a(time - sVar4.x, sVar4.u.h());
                        if (k1F != null && k1F.e()) {
                            new C0463sd(Ab.U().q(), new Function0() { // from class: com.ironsource.mediationsdk.s$a$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Long.valueOf(System.currentTimeMillis());
                                }
                            }, Ab.U(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                        }
                        s.this.a = new De();
                        s sVar5 = s.this;
                        sVar5.a.a(sVar5.c);
                        if (s.this.u.c().b().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                            IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.AD_UNIT> listG = s.this.u.g();
                        Iterator it2 = s.this.r.iterator();
                        while (it2.hasNext()) {
                            ((Ac) it2.next()).a(listG, s.this.h(), s.this.u.c());
                        }
                        new Wc.a().a();
                        s sVar6 = s.this;
                        if (sVar6.v != null && (beJ = sVar6.u.c().b().j()) != null && !TextUtils.isEmpty(beJ.c())) {
                            s.this.v.onSegmentReceived(beJ.c());
                        }
                        E1 e1D = s.this.u.c().b().d();
                        if (e1D.f()) {
                            C0421q4.d().a(e1D.b(), e1D.d(), e1D.c(), e1D.e(), IronSourceUtils.getSessionId(), e1D.a(), e1D.g());
                        }
                    } else {
                        s sVar7 = s.this;
                        if (!sVar7.l) {
                            sVar7.b(d.INIT_FAILED);
                            s sVar8 = s.this;
                            sVar8.l = true;
                            Iterator it3 = sVar8.r.iterator();
                            while (it3.hasNext()) {
                                ((Ac) it3.next()).h("serverResponseIsNotValid");
                            }
                        }
                    }
                } else {
                    if (sVar3.g == 3) {
                        sVar3.w = true;
                        Iterator it4 = sVar3.r.iterator();
                        while (it4.hasNext()) {
                            ((Ac) it4.next()).a();
                        }
                    }
                    if (this.a) {
                        s sVar9 = s.this;
                        if (sVar9.g < sVar9.h) {
                            sVar9.k = true;
                            sVar9.m.postDelayed(this, sVar9.f * 1000);
                            s sVar10 = s.this;
                            if (sVar10.g < sVar10.i) {
                                sVar10.f *= 2;
                            }
                        }
                    }
                    if (this.a) {
                        s sVar11 = s.this;
                        if (sVar11.g == sVar11.j) {
                            sVar = s.this;
                            if (!sVar.l) {
                                sVar.l = true;
                                if (TextUtils.isEmpty(this.b)) {
                                    this.b = "noServerResponse";
                                }
                                it = s.this.r.iterator();
                                while (it.hasNext()) {
                                    ((Ac) it.next()).h(this.b);
                                }
                                s.this.b(d.INIT_FAILED);
                                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                            }
                        }
                    } else {
                        sVar = s.this;
                        if (!sVar.l) {
                            sVar.l = true;
                            if (TextUtils.isEmpty(this.b)) {
                                this.b = "noServerResponse";
                            }
                            it = s.this.r.iterator();
                            while (it.hasNext()) {
                                ((Ac) it.next()).h(this.b);
                            }
                            s.this.b(d.INIT_FAILED);
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                        }
                    }
                    s.this.g++;
                }
                s.this.e();
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {

        class a extends CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                s sVar = s.this;
                if (sVar.l) {
                    return;
                }
                sVar.l = true;
                Iterator it = sVar.r.iterator();
                while (it.hasNext()) {
                    ((Ac) it.next()).h("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    s sVar = s.this;
                    sVar.w = true;
                    Iterator it = sVar.r.iterator();
                    while (it.hasNext()) {
                        ((Ac) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.q = new a(60000L, 15000L).start();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    abstract class f implements Runnable {
        String b;
        boolean a = true;
        protected p.c c = new a();

        class a implements p.c {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.a = false;
                fVar.b = str;
            }
        }

        f() {
        }
    }

    private s() {
    }

    public static synchronized s c() {
        if (A == null) {
            A = new s();
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Ab.U().g().g()) {
            Ab.U().q().a(new B5(C5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.k;
    }

    public void a(Context context, Ae ae) {
        this.y.i(ae.f().h());
        this.y.c(ae.f().d());
        A1 a1B = ae.c().b();
        this.y.a(a1B.a());
        this.y.d(a1B.c().b());
        this.y.b(a1B.k().b());
        this.y.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        K1 k1F = ae.c().b().f();
        this.y.b(k1F.b());
        Ab.O().o().a(k1F.c());
    }

    public int b() {
        return this.b;
    }

    public synchronized boolean d() {
        return this.w;
    }

    void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.b = iA;
        this.y.c(iA);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        C0414pe.a.a(EnumC0397oe.values()[dVar.ordinal()]);
    }

    public void b(Ac ac) {
        if (ac == null || this.r.size() == 0) {
            return;
        }
        this.r.remove(ac);
    }

    private static int a(d dVar) {
        int i = c.a[dVar.ordinal()];
        if (i == 1) {
            return e.d;
        }
        if (i == 2) {
            return e.e;
        }
        if (i != 3) {
            return e.a;
        }
        return e.b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            AtomicBoolean atomicBoolean = this.o;
            if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                b(d.INIT_IN_PROGRESS);
                this.s = str2;
                this.t = str;
                if (IronSourceUtils.isNetworkConnected(context)) {
                    this.m.post(this.z);
                } else {
                    this.n = true;
                    if (this.p == null) {
                        this.p = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.e + ": Multiple calls to init are not allowed", 2);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0445rc
    public void a(boolean z) {
        if (this.n && z) {
            CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.n = false;
            this.k = true;
            Ab.U().q().a(new B5(C5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.getMediationAdditionalData(false)));
            this.m.post(this.z);
        }
    }

    public synchronized d a() {
        return d.values()[C0414pe.a.a().ordinal()];
    }

    public void a(Ac ac) {
        if (ac == null) {
            return;
        }
        this.r.add(ac);
    }

    public void a(SegmentListener segmentListener) {
        this.v = segmentListener;
    }
}
