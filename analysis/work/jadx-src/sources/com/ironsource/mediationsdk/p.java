package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.Ab;
import com.ironsource.AbstractC0487u3;
import com.ironsource.Ac;
import com.ironsource.Ae;
import com.ironsource.B5;
import com.ironsource.B9;
import com.ironsource.Bb;
import com.ironsource.C0163b4;
import com.ironsource.C0186c9;
import com.ironsource.C0190cd;
import com.ironsource.C0219e8;
import com.ironsource.C0220e9;
import com.ironsource.C0238fa;
import com.ironsource.C0260gf;
import com.ironsource.C0262h0;
import com.ironsource.C0282i3;
import com.ironsource.C0298j0;
import com.ironsource.C0360mb;
import com.ironsource.C0371n5;
import com.ironsource.C0381nf;
import com.ironsource.C0388o5;
import com.ironsource.C0398of;
import com.ironsource.C0414pe;
import com.ironsource.C0421q4;
import com.ironsource.C0446rd;
import com.ironsource.C0465sf;
import com.ironsource.C0527w9;
import com.ironsource.C5;
import com.ironsource.D9;
import com.ironsource.EnumC0242fe;
import com.ironsource.EnumC0397oe;
import com.ironsource.F3;
import com.ironsource.Fb;
import com.ironsource.H1;
import com.ironsource.H2;
import com.ironsource.InterfaceC0339l7;
import com.ironsource.InterfaceC0462sc;
import com.ironsource.InterfaceC0576z7;
import com.ironsource.J8;
import com.ironsource.Jd;
import com.ironsource.K1;
import com.ironsource.Md;
import com.ironsource.N6;
import com.ironsource.N7;
import com.ironsource.O9;
import com.ironsource.Ob;
import com.ironsource.Od;
import com.ironsource.P7;
import com.ironsource.P9;
import com.ironsource.Pf;
import com.ironsource.Qb;
import com.ironsource.Qf;
import com.ironsource.R5;
import com.ironsource.R7;
import com.ironsource.S4;
import com.ironsource.T3;
import com.ironsource.T4;
import com.ironsource.U3;
import com.ironsource.U6;
import com.ironsource.U9;
import com.ironsource.V2;
import com.ironsource.Wc;
import com.ironsource.Xc;
import com.ironsource.Y7;
import com.ironsource.Z4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.FeaturesManager;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p implements O9, Ac, S4, S4.b, S4.c, S4.a {
    private static boolean r0;
    private Set<IronSource.AD_UNIT> A;
    private boolean B;
    private IronSourceSegment C;
    private final String D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private Boolean L;
    private IronSourceBannerLayout M;
    private String N;
    private Boolean O;
    private P7 P;
    private w Q;
    private C0527w9 R;
    private Jd S;
    private H2 T;
    private InitializationListener U;
    private InterfaceC0462sc V;
    private AtomicBoolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private final String a;
    private boolean a0;
    private final String b;
    private boolean b0;
    private final InterfaceC0576z7 c;
    private int c0;
    private final InterfaceC0576z7.a d;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.d> d0;
    private final N7 e;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.b> e0;
    private final InterfaceC0339l7 f;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.d> f0;
    private final J8.a g;
    private com.ironsource.mediationsdk.demandOnly.f g0;
    private IronSourceLoggerManager h;
    private com.ironsource.mediationsdk.demandOnly.k h0;
    private C0360mb i;
    private com.ironsource.mediationsdk.demandOnly.c i0;
    private com.ironsource.mediationsdk.logger.b j;
    private R5 j0;
    private AtomicBoolean k;
    private P9 k0;
    private final Object l;
    private U6 l0;
    private Ae m;
    private boolean m0;
    private String n;
    private AdQualityBridge n0;
    private String o;
    ISErrorListener o0;
    private String p;
    Y7<ISDemandOnlyInterstitialListener> p0;
    private String q;
    Y7<ISDemandOnlyRewardedVideoListener> q0;
    private Map<String, String> r;
    private String s;
    private AtomicBoolean t;
    private boolean u;
    private List<IronSource.AD_UNIT> v;
    private String w;
    private Context x;
    private Boolean y;
    private Set<IronSource.AD_UNIT> z;

    class a implements ISErrorListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[C0190cd.b.values().length];
            c = iArr;
            try {
                iArr[C0190cd.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[C0190cd.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[C0190cd.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[C0190cd.b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s.d.values().length];
            b = iArr2;
            try {
                iArr2[s.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[s.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[s.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[s.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface c {
        void a(String str);
    }

    private static class d {
        static volatile p a = new p();

        private d() {
        }
    }

    private p() {
        this(Ab.U().i(), Ab.O().b(), Ab.U().w(), Ab.U().k(), Ab.O().C());
    }

    private boolean A() {
        return z() && B();
    }

    private boolean B() {
        Ae ae = this.m;
        return (ae == null || ae.j() == null || this.m.j().a() == null || this.m.j().a().size() <= 0) ? false : true;
    }

    private synchronized boolean D() {
        return this.u;
    }

    private boolean E() {
        Ae ae = this.m;
        return (ae == null || ae.c() == null || this.m.c().d() == null) ? false : true;
    }

    private boolean F() {
        return E() && H();
    }

    private boolean H() {
        Ae ae = this.m;
        return (ae == null || ae.j() == null || this.m.j().b() == null || this.m.j().b().size() <= 0) ? false : true;
    }

    private boolean I() {
        Ae ae = this.m;
        return (ae == null || ae.c() == null || this.m.c().e() == null) ? false : true;
    }

    private boolean J() {
        return I() && K();
    }

    private boolean K() {
        Ae ae = this.m;
        return (ae == null || ae.j() == null || this.m.j().c() == null || this.m.j().c().isEmpty()) ? false : true;
    }

    private boolean M() {
        Ae ae = this.m;
        return (ae == null || ae.c() == null || this.m.c().f() == null) ? false : true;
    }

    private boolean N() {
        return M() && O();
    }

    private boolean O() {
        Ae ae = this.m;
        return (ae == null || ae.j() == null || this.m.j().d() == null || this.m.j().d().size() <= 0) ? false : true;
    }

    private void U() {
        if (this.U == null || !this.W.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        Ab.U().q().a(new B5(C5.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.U.onInitializationComplete();
    }

    private void W() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C0238fa.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.c)) {
            String str = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.c).get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Z4.a.b(!MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    private void X() {
        if (this.H) {
            Z();
            return;
        }
        boolean zH = this.m.c().c().d().h();
        this.b0 = zH;
        if (zH) {
            Y();
        } else {
            f0();
        }
    }

    private void Y() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.T = new H2(listA, this.m.c().c(), IronSourceUtils.getUserIdForNetworks(), C0238fa.b(), this.C);
            v();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(C5.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void Z() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.m.j().a().size(); i++) {
            String str = this.m.j().a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(C5.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.e0) {
            V2 v2C = this.m.c().c();
            T4.a aVar = new T4.a("Mediation");
            if (v2C.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.i0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, v2C, n(), o(), new T4.b(D9.i(), aVar));
        }
        for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.e0.values()) {
            this.i0.a(bVar.g(), bVar.e());
        }
        this.e0.clear();
    }

    private void a0() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.m.j().b().size(); i++) {
            String str = this.m.j().b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(C5.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.d0) {
            this.g0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.d0.values().iterator();
        while (it.hasNext()) {
            this.g0.a(it.next());
        }
        this.d0.clear();
    }

    private boolean b(List<IronSource.AD_UNIT> list, boolean z, U3 u3) {
        IronLog.INTERNAL.verbose();
        try {
            this.j.a(u3.b().h().d());
            this.v = list;
            c(true);
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                Ab.U().q().a(new B5(C5.FIRST_INSTANCE_RESULT, mediationAdditionalData));
            }
            int iB = u3.b().f().b();
            if (iB >= 0) {
                C0163b4 c0163b4 = new C0163b4();
                c0163b4.a(iB);
                c0163b4.a(iB, this.m.k().d());
            }
            D9.i().h();
            Od.i().h();
            Ab.U().q().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            U();
            InterfaceC0462sc interfaceC0462scR = r();
            if (interfaceC0462scR != null) {
                interfaceC0462scR.a(this.m);
            }
            return true;
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            InterfaceC0462sc interfaceC0462scR2 = r();
            if (interfaceC0462scR2 != null) {
                interfaceC0462scR2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.m.j().d().size(); i++) {
            String str = this.m.j().d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f0) {
            this.h0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.f0.values().iterator();
        while (it.hasNext()) {
            this.h0.a(it.next());
        }
        this.f0.clear();
    }

    private synchronized void c(boolean z) {
        this.u = z;
    }

    private void c0() {
        if (this.G) {
            a0();
        } else {
            d0();
        }
    }

    private void d(boolean z) {
        if (z) {
            this.k0.a(EnumC0242fe.EXTERNAL_MEDIATION_INIT);
        } else {
            this.k0.a(EnumC0242fe.LEVEL_PLAY_INIT);
        }
    }

    private void d0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().b());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(C5.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        C0527w9 c0527w9 = new C0527w9(listA, this.m.c().d(), IronSourceUtils.getUserIdForNetworks(), C0238fa.b(), this.C);
        this.R = c0527w9;
        Boolean bool = this.y;
        if (bool != null) {
            c0527w9.a(this.x, bool.booleanValue());
        }
        if (this.a0) {
            this.a0 = false;
            this.R.A();
        }
    }

    private void e(Activity activity, String str) {
        Placement placementP;
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    placementP = j();
                } catch (Exception e) {
                    e = e;
                    C0421q4.d().a(e);
                    this.h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                }
            }
            if (placementP == null) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                C0446rd.a().a(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e2) {
            e = e2;
            placementP = null;
        }
        if (activity != null) {
            e(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            C0446rd.a().a(ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            return;
        }
        Jd jd = this.S;
        if (jd != null && (this.X || this.Z)) {
            jd.a(activity, placementP);
            return;
        }
        P7 p7 = this.P;
        if (p7 != null) {
            p7.a(activity, placementP);
            return;
        }
        this.h.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        C0446rd.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    private void e0() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.c0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(C5.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        q qVar = new q(listA, this.m.c().f(), n(), IronSourceUtils.getUserIdForNetworks(), C0238fa.b().a(), this.C);
        this.P = qVar;
        Boolean bool = this.y;
        if (bool != null) {
            qVar.a(this.x, bool.booleanValue());
        }
    }

    private void f0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.Q = new w(listA, new k(n(), IronSourceUtils.getUserIdForNetworks(), this.m.c().c()), C0238fa.b().a(), this.C);
            v();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(C5.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void g0() {
        if (this.F) {
            b0();
            return;
        }
        Md mdF = this.m.c().f();
        this.Z = mdF.k().h();
        this.c0 = a(mdF);
        if (this.X || this.Z) {
            h0();
        } else {
            e0();
        }
    }

    private void h0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.c0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(C5.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Jd jd = new Jd(listA, this.m.c().f(), IronSourceUtils.getUserIdForNetworks(), this.X, C0238fa.b(), this.C);
        this.S = jd;
        Boolean bool = this.y;
        if (bool != null) {
            jd.a(this.x, bool.booleanValue());
        }
        if (this.Y && this.X) {
            this.Y = false;
            this.S.A();
        }
    }

    private InterstitialPlacement i() {
        B9 b9D = this.m.c().d();
        if (b9D != null) {
            return b9D.a();
        }
        return null;
    }

    private Placement j() {
        Md mdF = this.m.c().f();
        if (mdF != null) {
            return mdF.a();
        }
        return null;
    }

    private C0282i3 k(String str) {
        V2 v2C = this.m.c().c();
        if (v2C == null) {
            return new C0371n5();
        }
        if (TextUtils.isEmpty(str)) {
            return v2C.i();
        }
        C0282i3 c0282i3A = v2C.a(str);
        return c0282i3A != null ? c0282i3A : v2C.i();
    }

    public static p m() {
        return d.a;
    }

    private Placement p(String str) {
        Md mdF = this.m.c().f();
        if (mdF != null) {
            return mdF.a(str);
        }
        return null;
    }

    private synchronized InterfaceC0462sc r() {
        return this.V;
    }

    private boolean u(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private void v() {
        if (this.L.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.L = Boolean.FALSE;
            a(this.M, this.N);
            this.M = null;
            this.N = null;
        }
    }

    private void w() {
        this.h = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.j = bVar;
        this.h.addLogger(bVar);
        this.i = new C0360mb();
    }

    private boolean x() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getName());
            return true;
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean y() {
        Ae ae = this.m;
        return (ae == null || ae.c() == null || this.m.c().b() == null || this.m.c().b().b() == null) ? false : true;
    }

    private boolean z() {
        Ae ae = this.m;
        return (ae == null || ae.c() == null || this.m.c().c() == null) ? false : true;
    }

    boolean C() {
        return this.F || this.G || this.H;
    }

    public boolean G() {
        boolean z;
        try {
            if (this.G) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            C0527w9 c0527w9 = this.R;
            boolean z2 = c0527w9 != null && c0527w9.u();
            try {
                D9.i().a(new B5(z2 ? C5.IS_CHECK_READY_TRUE : C5.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                C0421q4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z, 1);
                this.h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    public boolean L() {
        boolean z;
        boolean z2;
        try {
            if (this.F) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.X || this.Z) {
                Jd jd = this.S;
                if (jd == null || !jd.u()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                P7 p7 = this.P;
                if (p7 == null || !p7.d()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            try {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.c0)}});
                Od.i().a(new B5(z2 ? C5.RV_API_HAS_AVAILABILITY_TRUE : C5.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                this.h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                C0421q4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z, 1);
                this.h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public boolean P() {
        return D();
    }

    public void S() {
        C0527w9 c0527w9 = this.R;
        if (c0527w9 != null) {
            c0527w9.a((C0465sf) null);
        }
        Jd jd = this.S;
        if (jd != null) {
            jd.a((C0465sf) null);
        }
        H2 h2 = this.T;
        if (h2 != null) {
            h2.a((C0465sf) null);
        }
        this.m0 = false;
    }

    public void T() {
        IronLog.API.info("removing all impression data listeners");
        C0238fa.b().d();
        P7 p7 = this.P;
        if (p7 != null) {
            p7.c();
        }
        w wVar = this.Q;
        if (wVar != null) {
            wVar.c();
        }
    }

    public void V() {
        if (r0) {
            return;
        }
        r0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ab.U().q().a(new B5(C5.FIRST_INSTANCE_RESULT, mediationAdditionalData));
    }

    public void a(long j, Ae.a aVar) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(C());
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put("sessionDepth", this.E);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ab.U().q().a(new B5(C5.INIT_COMPLETE, mediationAdditionalData));
    }

    public Ob f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().c());
        if (listA.size() > 0) {
            return new Ob(listA, this.m.c().e(), IronSourceUtils.getUserIdForNetworks(), C0238fa.b(), this.C);
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(C5.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    @Override // com.ironsource.O9
    public void g(String str) {
        try {
            String str2 = this.a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !u(str)) {
                this.h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.s = str;
                this.k0.f(str);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.ironsource.Ac
    public void h(String str) {
        try {
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.i != null) {
                Iterator<IronSource.AD_UNIT> it = this.z.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            InterfaceC0462sc interfaceC0462scR = r();
            if (interfaceC0462scR != null) {
                interfaceC0462scR.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public String l() {
        return this.q;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.o;
    }

    public String q() {
        return this.s;
    }

    public Map<String, String> s() {
        return this.r;
    }

    public void t(String str) {
        IronLog.API.verbose("userId = " + str);
        this.o = str;
        Ab.U().q().a(new B5(C5.SET_USER_ID, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.n0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    private C0190cd.b l(String str) {
        InterstitialPlacement interstitialPlacementM;
        Ae ae = this.m;
        if (ae == null || ae.c() == null || this.m.c().d() == null) {
            return C0190cd.b.NOT_CAPPED;
        }
        try {
            interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                try {
                    interstitialPlacementM = i();
                    if (interstitialPlacementM == null) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e) {
                    e = e;
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (Exception e2) {
            e = e2;
            interstitialPlacementM = null;
        }
        return interstitialPlacementM == null ? C0190cd.b.NOT_CAPPED : a(interstitialPlacementM);
    }

    private InterstitialPlacement m(String str) {
        B9 b9D = this.m.c().d();
        if (b9D != null) {
            return b9D.a(str);
        }
        return null;
    }

    private C0190cd.b o(String str) {
        Placement placementP;
        Ae ae = this.m;
        if (ae == null || ae.c() == null || this.m.c().f() == null) {
            return C0190cd.b.NOT_CAPPED;
        }
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    placementP = j();
                    if (placementP == null) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e) {
                    e = e;
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (Exception e2) {
            e = e2;
            placementP = null;
        }
        return placementP == null ? C0190cd.b.NOT_CAPPED : a(placementP);
    }

    public void Q() {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.J) {
                this.h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                this.h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (!s.c().d()) {
                    this.a0 = true;
                    return;
                } else {
                    this.h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!F()) {
                this.h.log(ironSourceTag, "No interstitial configurations found", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            C0527w9 c0527w9 = this.R;
            if (c0527w9 == null) {
                this.a0 = true;
            } else {
                c0527w9.A();
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public void R() {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.F) {
                this.h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.X && !this.m0) {
                this.h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.I) {
                this.h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                this.h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (!s.c().d()) {
                    this.Y = true;
                    return;
                } else {
                    this.h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!N()) {
                this.h.log(ironSourceTag, "No rewarded video configurations found", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Jd jd = this.S;
            if (jd == null) {
                this.Y = true;
            } else {
                jd.A();
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.O9
    public void c() {
        this.r = null;
    }

    public Qb n(String str) {
        Fb fbE = this.m.c().e();
        if (fbE == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return fbE.e();
        }
        Qb qbA = fbE.a(str);
        return qbA != null ? qbA : fbE.e();
    }

    boolean q(String str) {
        if (!z()) {
            return false;
        }
        C0282i3 c0282i3A = null;
        try {
            c0282i3A = this.m.c().c().a(str);
            if (c0282i3A == null && (c0282i3A = this.m.c().c().i()) == null) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (c0282i3A == null) {
            return false;
        }
        return a(c0282i3A);
    }

    boolean r(String str) {
        if (this.G) {
            return false;
        }
        boolean z = l(str) != C0190cd.b.NOT_CAPPED;
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception e) {
                C0421q4.d().a(e);
            }
            D9.i().a(new B5(C5.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    boolean s(String str) {
        boolean z;
        C0190cd.b bVarO = o(str);
        if (bVarO != null) {
            int i = b.c[bVarO.ordinal()];
            z = true;
            if (i != 1 && i != 2 && i != 3) {
                z = false;
            }
        } else {
            z = false;
        }
        a(z, str);
        return z;
    }

    public String u() {
        return this.w;
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C0260gf.a().a(new N6(context));
        Ab.U().q().a(context, this.C);
        D9.i().a(context, this.C);
        Od.i().a(context, this.C);
        Wc.P.a(context, this.C);
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C0219e8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else {
                if (!E()) {
                    C0219e8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
                    return;
                }
                InterstitialPlacement interstitialPlacementI = i();
                if (interstitialPlacementI != null) {
                    c(activity, interstitialPlacementI.getPlacementName());
                } else {
                    C0219e8.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            C0219e8.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    p(InterfaceC0576z7 interfaceC0576z7, InterfaceC0576z7.a aVar, N7 n7, InterfaceC0339l7 interfaceC0339l7, J8.a aVar2) {
        this.a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.12.0";
        this.l = new Object();
        this.m = null;
        this.n = null;
        this.o = "";
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = false;
        this.y = null;
        this.B = true;
        this.D = "sessionDepth";
        this.O = null;
        this.m0 = false;
        this.c = interfaceC0576z7;
        this.d = aVar;
        this.e = n7;
        this.f = interfaceC0339l7;
        this.g = aVar2;
        w();
        this.k = new AtomicBoolean();
        this.z = new HashSet();
        this.A = new HashSet();
        this.G = false;
        this.F = false;
        this.H = false;
        this.t = new AtomicBoolean(true);
        this.W = new AtomicBoolean(false);
        this.E = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.w = IronSourceUtils.getSessionId();
        this.L = Boolean.FALSE;
        this.a0 = false;
        this.N = null;
        this.P = null;
        this.U = null;
        this.V = null;
        this.Q = null;
        this.X = false;
        this.d0 = new ConcurrentHashMap<>();
        this.f0 = new ConcurrentHashMap<>();
        this.e0 = new ConcurrentHashMap<>();
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.c0 = 1;
        this.j0 = new R5();
        P9 p9 = new P9();
        this.k0 = p9;
        this.l0 = new U6(p9);
        this.o0 = new a();
        this.n0 = null;
        this.p0 = new Y7.a();
        this.q0 = new Y7.b();
    }

    private T3 v(String str) {
        T3 t3 = new T3();
        if (str != null) {
            if (a(str, 5, 10)) {
                if (!u(str)) {
                    t3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
                }
                return t3;
            }
            t3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
            return t3;
        }
        t3.a(new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing"));
        return t3;
    }

    @Override // com.ironsource.S4.c
    public synchronized boolean j(String str) {
        com.ironsource.mediationsdk.demandOnly.k kVar;
        kVar = this.h0;
        return kVar != null && kVar.a(str);
    }

    public List<IronSource.AD_UNIT> p() {
        ArrayList arrayList = new ArrayList();
        Set<IronSource.AD_UNIT> set = this.z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    @Override // com.ironsource.O9
    public Placement i(String str) {
        Placement placementP;
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placementP = j();
                } catch (Exception e) {
                    e = e;
                    C0421q4.d().a(e);
                    return placementP;
                }
            }
            this.h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placementP, 1);
            return placementP;
        } catch (Exception e2) {
            e = e2;
            placementP = null;
        }
    }

    public IronSourceSegment t() {
        return this.C;
    }

    public void d(Activity activity) {
        if (!M()) {
            C0446rd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement placementJ = j();
        if (placementJ == null) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            C0446rd.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        f(activity, placementJ.getPlacementName());
    }

    public synchronized void a(Context context, String str, boolean z, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                d(z);
                if (a(context, str, z, initializationListener, null, ad_unitArr) == null) {
                    s.c().a(this);
                    s.c().a(this.j0);
                    s.c().a(context, str, this.o, ad_unitArr);
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

    private T4 k() {
        return new T4.b(Ab.U().q(), new T4.a("IronSource"));
    }

    Boolean g() {
        return this.O;
    }

    public Ae h() {
        return this.m;
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.F) {
                this.h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                C0446rd.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!M()) {
                C0446rd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else {
                e(activity, str);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            C0446rd.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    public synchronized IronSourceError a(Context context, String str, boolean z, InitializationListener initializationListener, InterfaceC0462sc interfaceC0462sc, IronSource.AD_UNIT... ad_unitArr) throws Throwable {
        Throwable th;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 6104be2");
                try {
                    if (!U9.a((Object) context, "Init Failed - provided context is null")) {
                        h("Provided context is null");
                        return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, "Provided context is null");
                    }
                    this.g.a(context);
                    boolean z2 = context instanceof Activity;
                    if (z2) {
                        e((Activity) context);
                    }
                    if (initializationListener != null) {
                        this.U = initializationListener;
                    }
                    AtomicBoolean atomicBoolean = this.t;
                    if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                        C0414pe.a.a(interfaceC0462sc == null);
                        if ((ad_unitArr == null || ad_unitArr.length == 0) && interfaceC0462sc == null) {
                            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                                this.z.add(ad_unit);
                            }
                            this.I = true;
                            this.J = true;
                            this.K = true;
                        } else {
                            for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                                this.z.add(ad_unit2);
                                this.A.add(ad_unit2);
                                if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                                    this.J = true;
                                }
                                if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                                    this.K = true;
                                }
                                if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                                    this.I = true;
                                }
                            }
                        }
                        IronLog.API.info("init(appKey:" + str + ")");
                        T3 t3V = v(str);
                        if (t3V.b()) {
                            this.n = str;
                        }
                        Ae aeA = a(context, this.n);
                        if (aeA != null) {
                            IronLog.INTERNAL.verbose("init cache exists");
                            a(aeA.c().b().f());
                        } else {
                            IronLog.INTERNAL.verbose("init cache does not exist");
                        }
                        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                        this.d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(Z4.a.d()));
                        this.k0.g(LevelPlay.getSdkVersion());
                        this.k0.a(R7.a());
                        this.k0.b(IronSourceUtils.isGooglePlayInstalled(context));
                        this.k0.a(C0298j0.a());
                        W();
                        d(context);
                        if (this.n == null) {
                            s.c().f();
                            if (this.z.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                                C0446rd.a().a(false, (AdInfo) null);
                            }
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, t3V.a().toString(), 1);
                            return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
                        }
                        this.k0.a(context);
                        this.k0.c(this.n);
                        this.k0.h(this.w);
                        if (this.B) {
                            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
                            if (ad_unitArr != null) {
                                for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                                    try {
                                        mediationAdditionalData.put(ad_unit3.toString(), true);
                                    } catch (Exception e) {
                                        C0421q4.d().a(e);
                                    }
                                }
                            }
                            int i = this.E + 1;
                            this.E = i;
                            try {
                                a(z2, z, i, mediationAdditionalData, interfaceC0462sc != null);
                                this.B = false;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                throw th;
                            }
                        }
                        return null;
                    }
                    if (ad_unitArr != null) {
                        a(z2, z, interfaceC0462sc != null, ad_unitArr);
                        if (D() && !z) {
                            U();
                        }
                    } else {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                    }
                    EnumC0397oe enumC0397oeB = C0414pe.a.b();
                    if (D()) {
                        a(this.m);
                        return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                    }
                    if (enumC0397oeB == EnumC0397oe.INIT_FAILED) {
                        return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                    }
                    if (enumC0397oeB != EnumC0397oe.NOT_INIT) {
                        if (interfaceC0462sc != null) {
                            a(interfaceC0462sc);
                        }
                        return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
                    }
                    return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private void d(Activity activity, String str) {
        try {
            InterstitialPlacement interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                interstitialPlacementM = i();
            }
            if (interstitialPlacementM == null) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C0219e8.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C0219e8.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.R.a(activity, new Placement(interstitialPlacementM));
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C0219e8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!E()) {
                C0219e8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            } else {
                d(activity, str);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            C0219e8.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.S4.a
    public void e(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.i0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public String e() {
        s sVarC = s.c();
        int i = b.b[sVarC.a().ordinal()];
        if (i == 1) {
            return "init() must be called first";
        }
        if (i == 2) {
            return "init() had failed";
        }
        if (i != 3) {
            return (i == 4 && !J()) ? "No Native Ad configurations found" : "";
        }
        return sVarC.d() ? "init() had failed" : "init() not finished yet";
    }

    @Override // com.ironsource.O9
    public InterstitialPlacement f(String str) {
        InterstitialPlacement interstitialPlacementM;
        try {
            interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                try {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacementM = i();
                } catch (Exception e) {
                    e = e;
                    C0421q4.d().a(e);
                    return interstitialPlacementM;
                }
            }
            this.h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacementM, 1);
            return interstitialPlacementM;
        } catch (Exception e2) {
            e = e2;
            interstitialPlacementM = null;
        }
    }

    @Override // com.ironsource.S4.b
    public synchronized boolean d(String str) {
        com.ironsource.mediationsdk.demandOnly.f fVar;
        fVar = this.g0;
        return fVar != null && fVar.b(str);
    }

    @Override // com.ironsource.O9
    public void d() {
        this.h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        C0219e8.a().a((LevelPlayInterstitialListener) null);
    }

    private boolean d(Ae ae) {
        com.ironsource.mediationsdk.adquality.a aVarA = ae.c().a();
        return this.n0 == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    @Override // com.ironsource.S4.b
    public void c(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.p0.a(str);
        try {
            if (!this.G) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.g0;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i = b.a[ad_unit.ordinal()];
        if (i == 1) {
            g0();
        } else if (i == 2) {
            c0();
        } else {
            if (i != 3) {
                return;
            }
            X();
        }
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        Md mdF = this.m.c().f();
        T4.a aVar = new T4.a("Mediation");
        if (mdF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, mdF, com.ironsource.mediationsdk.c.b(), this.q0, n(), o(), new T4.b(Od.i(), aVar));
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ironLog.info("onResume() is disabled");
            } else {
                ContextProvider.getInstance().onResume(activity);
            }
        } catch (Throwable th) {
            this.h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
            C0421q4.d().a(th);
        }
    }

    public void c(Context context) {
        C0381nf c0381nf = C0381nf.a;
        c0381nf.b();
        if (!D()) {
            c0381nf.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.m)) {
            c0381nf.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.isNetworkConnected(context)) {
            c0381nf.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        C0527w9 c0527w9 = this.R;
        if (c0527w9 != null) {
            c0527w9.J();
        }
        Jd jd = this.S;
        if (jd != null) {
            jd.J();
        }
        H2 h2 = this.T;
        if (h2 != null) {
            h2.J();
            this.T.T();
        }
        new C0398of().a(context, n(), this.m.i(), LevelPlay.getSdkVersion(), this.m.c().g().b(), g(), this.X);
        this.m0 = true;
        c0381nf.c();
    }

    @Override // com.ironsource.O9
    public boolean b(String str) {
        try {
            T3 t3 = new T3();
            a(str, t3);
            if (t3.b()) {
                this.q = str;
                Ab.U().q().a(new B5(C5.SET_USER_ID, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, t3.a().toString(), 2);
            return false;
        } catch (Exception e) {
            C0421q4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.ironsource.S4.c
    public synchronized void b(Activity activity, String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.q0.a(str));
    }

    private boolean c(Ae ae) {
        return ae != null && ae.o();
    }

    @Override // com.ironsource.S4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.p0.a(str));
    }

    public IronSourceBannerLayout b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    private void a(K1 k1) {
        Z4 z4 = Z4.a;
        z4.c(k1.g());
        z4.a(k1.f());
        z4.a(k1.j());
        this.f.a(k1);
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    private boolean b(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        synchronized (this.e0) {
            if (this.i0 != null) {
                return false;
            }
            this.e0.put(bVar.e(), bVar);
            return true;
        }
    }

    Ae b(Context context, String str, c cVar) {
        synchronized (this.l) {
            Ae ae = this.m;
            if (ae != null) {
                return new Ae(ae);
            }
            Ae aeA = a(context, str, cVar);
            if (aeA == null || !aeA.p()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                aeA = a(context, n());
                if (aeA != null) {
                    this.h.log(ironSourceTag, ErrorBuilder.buildUsingCachedConfigurationError(n(), str).toString() + ": " + aeA.toString(), 1);
                    Ab.U().q().a(new B5(C5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
                }
            }
            if (aeA != null) {
                this.m = aeA;
                IronSourceUtils.saveLastResponse(context, aeA.toString());
                b(this.m, context);
                D9.i().c(true);
                Od.i().c(true);
                Wc.P.c(true);
                Ab.U().q().c(true);
            }
            return aeA;
        }
    }

    @Override // com.ironsource.S4
    public synchronized void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                List<IronSource.AD_UNIT> listA = a(context, str, true, ad_unitArr);
                if (!listA.isEmpty()) {
                    a(context, str, true, (InitializationListener) null, (IronSource.AD_UNIT[]) listA.toArray(new IronSource.AD_UNIT[listA.size()]));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized List<IronSource.AD_UNIT> a(Context context, String str, boolean z, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if ((ad_unitArr == null || ad_unitArr.length == 0) && z) {
            if (this.I) {
                a(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else {
                this.F = true;
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (this.J) {
                a(IronSource.AD_UNIT.INTERSTITIAL);
            } else {
                this.G = true;
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            }
            if (this.K) {
                a(IronSource.AD_UNIT.BANNER);
            } else {
                this.H = true;
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        } else {
            for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                    if (this.J) {
                        a(ad_unit);
                    } else {
                        this.G = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    if (this.I) {
                        a(ad_unit);
                    } else {
                        this.F = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                    if (this.K) {
                        a(ad_unit);
                    } else {
                        this.H = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                e((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    public void b(Ae ae, Context context) {
        b(ae);
        a(ae, context);
    }

    private void b(Ae ae) {
        this.j.setDebugLevel(ae.c().b().h().b());
        this.h.setLoggerDebugLevel("console", ae.c().b().h().a());
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private synchronized void a(boolean z, boolean z2, boolean z3, IronSource.AD_UNIT... ad_unitArr) throws Throwable {
        Throwable th;
        try {
            try {
                int i = 0;
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    try {
                        if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                            this.J = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                            this.K = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            this.I = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (s.c().a() == s.d.INIT_FAILED) {
                    try {
                        if (this.i != null) {
                            int length = ad_unitArr.length;
                            while (i < length) {
                                IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                                if (!this.z.contains(ad_unit2)) {
                                    a(ad_unit2, true);
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        C0421q4.d().a(e);
                        IronLog.INTERNAL.error(e.toString());
                    }
                } else if (!D()) {
                    JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
                    int length2 = ad_unitArr.length;
                    while (i < length2) {
                        IronSource.AD_UNIT ad_unit3 = ad_unitArr[i];
                        if (!this.z.contains(ad_unit3)) {
                            this.z.add(ad_unit3);
                            this.A.add(ad_unit3);
                            try {
                                mediationAdditionalData.put(ad_unit3.toString(), true);
                            } catch (Exception e2) {
                                C0421q4.d().a(e2);
                                IronLog.INTERNAL.error(e2.toString());
                            }
                        } else {
                            this.h.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                        }
                        i++;
                    }
                    int i2 = this.E + 1;
                    this.E = i2;
                    a(z, z2, i2, mediationAdditionalData, z3);
                } else {
                    if (this.v == null) {
                        return;
                    }
                    try {
                        new Bb().a(this.m.c().b().e().b(), C());
                    } catch (Exception e3) {
                        C0421q4.d().a(e3);
                        IronLog.INTERNAL.error(e3.toString());
                    }
                    JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(z2);
                    for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                        if (!this.z.contains(ad_unit4)) {
                            this.z.add(ad_unit4);
                            this.A.add(ad_unit4);
                            try {
                                mediationAdditionalData2.put(ad_unit4.toString(), true);
                            } catch (Exception e4) {
                                C0421q4.d().a(e4);
                                IronLog.INTERNAL.error(e4.toString());
                            }
                            List<IronSource.AD_UNIT> list = this.v;
                            if (list != null && list.contains(ad_unit4)) {
                                b(ad_unit4);
                            } else {
                                a(ad_unit4, false);
                            }
                        } else {
                            a(ad_unit4);
                        }
                    }
                    int i3 = this.E + 1;
                    this.E = i3;
                    try {
                        a(z, z2, i3, mediationAdditionalData2, z3);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.ironsource.O9
    public void b() {
        this.h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        C0446rd.a().a((LevelPlayRewardedVideoBaseListener) null);
    }

    @Override // com.ironsource.O9
    public String b(Context context) {
        String strI = this.c.I(context);
        Ab.U().q().a(new B5(C5.GET_ADVERTISING_ID, IronSourceUtils.getMediationAdditionalData(false)));
        return !TextUtils.isEmpty(strI) ? strI : "";
    }

    private void b(C5 c5, JSONObject jSONObject) {
        Od.i().a(new B5(c5, jSONObject));
    }

    public void b(boolean z) {
        this.O = Boolean.valueOf(z);
        com.ironsource.mediationsdk.c.b().b(z);
        this.k0.a(z);
        Ab.U().q().a(new B5(z ? C5.CONSENT_TRUE_CODE : C5.CONSENT_FALSE_CODE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public void b(String str, JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new v(str, jSONObject));
    }

    @Override // com.ironsource.V8
    public void b(ImpressionDataListener impressionDataListener) {
        if (U9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C0238fa.b().a(impressionDataListener);
            P7 p7 = this.P;
            if (p7 != null) {
                p7.b(impressionDataListener);
            }
            w wVar = this.Q;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    private void a(boolean z, boolean z2, int i, JSONObject jSONObject, boolean z3) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z) {
                sb.append(",init_context_flow");
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.c.n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ab.U().q().a(new B5(C5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(InterfaceC0462sc interfaceC0462sc) {
        this.V = interfaceC0462sc;
    }

    public boolean a(boolean z, Ae ae) {
        a(ae);
        if (D()) {
            return true;
        }
        synchronized (this.l) {
            this.m = ae;
        }
        return b(ae.g(), z, ae.c());
    }

    @Override // com.ironsource.Ac
    public void a(List<IronSource.AD_UNIT> list, boolean z, U3 u3) {
        a(this.m);
        b(list, z, u3);
    }

    private void a(Ae ae) {
        if (x() && d(ae)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new C0262h0(), ae.c().b().h().a());
            this.n0 = adQualityBridge;
            IronSourceSegment ironSourceSegment = this.C;
            if (ironSourceSegment != null) {
                adQualityBridge.setSegment(ironSourceSegment);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        B9 b9D = this.m.c().d();
        T4.a aVar = new T4.a("Mediation");
        if (b9D.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, b9D, com.ironsource.mediationsdk.c.b(), this.p0, n(), o(), new T4.b(D9.i(), aVar));
    }

    private int a(Md md) {
        return (this.Z || this.X || !md.k().e()) ? 1 : 2;
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.m.k().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Ac
    public void a() {
        if (this.L.booleanValue()) {
            this.L = Boolean.FALSE;
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.M = null;
            this.N = null;
        }
        if (this.a0) {
            this.a0 = false;
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.Y) {
            this.Y = false;
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.d0) {
            Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.d0.values().iterator();
            while (it.hasNext()) {
                String strE = it.next().e();
                this.p0.a(strE).onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.d0.clear();
        }
        synchronized (this.f0) {
            Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.f0.values().iterator();
            while (it2.hasNext()) {
                String strE2 = it2.next().e();
                this.q0.a(strE2).onRewardedVideoAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f0.clear();
        }
        synchronized (this.e0) {
            for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.e0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.e0.clear();
        }
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = b.a[ad_unit.ordinal()];
        if (i == 1) {
            if (this.F) {
                Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.f0.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.q0.a(strE).onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f0.clear();
                return;
            }
            if (this.X) {
                if (this.Y) {
                    this.Y = false;
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z || M() || this.A.contains(ad_unit)) {
                C0446rd.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.G) {
                Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.d0.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.p0.a(strE2).onInterstitialAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
                }
                this.d0.clear();
                return;
            }
            if (this.a0) {
                this.a0 = false;
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        if (this.H) {
            for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.e0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            this.e0.clear();
            return;
        }
        if (this.L.booleanValue()) {
            this.L = Boolean.FALSE;
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
            this.M = null;
            this.N = null;
        }
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.C = ironSourceSegment;
        Jd jd = this.S;
        if (jd != null) {
            jd.a(ironSourceSegment);
        }
        P7 p7 = this.P;
        if (p7 != null) {
            p7.a(ironSourceSegment);
        }
        C0527w9 c0527w9 = this.R;
        if (c0527w9 != null) {
            c0527w9.a(ironSourceSegment);
        }
        w wVar = this.Q;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        H2 h2 = this.T;
        if (h2 != null) {
            h2.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.n0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        D9.i().a(this.C);
        Od.i().a(this.C);
        Wc.P.a(this.C);
        Ab.U().q().a(this.C);
    }

    @Override // com.ironsource.O9
    public void a(boolean z) {
        com.ironsource.mediationsdk.c.b().a(z);
    }

    public synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog = IronLog.API;
        ironLog.info();
        if (!this.I) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.X = false;
                ironLog.info("Disabling rewarded video manual mode");
            } else {
                this.X = true;
                ironLog.info("Enabling rewarded video manual mode");
            }
        }
        C0446rd.a().a(levelPlayRewardedVideoManualListener);
    }

    public void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog.API.info();
        C0446rd.a().a(levelPlayRewardedVideoListener);
    }

    @Override // com.ironsource.O9
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.h.log(IronSourceLogger.IronSourceTag.API, this.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.r = new HashMap(map);
                B5 b5 = new B5(C5.SET_RV_SERVER_PARAMS, IronSourceUtils.getMediationAdditionalData(false));
                b5.a(IronSourceConstants.EVENTS_EXT1, map.toString());
                Od.i().a(b5);
            } catch (Exception e) {
                C0421q4.d().a(e);
                this.h.logException(IronSourceLogger.IronSourceTag.API, this.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    @Override // com.ironsource.S4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.q0.a(str));
    }

    void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.I) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
                return;
            }
            if (!this.F) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(C5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            e(dVar.d());
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.f0) {
                    this.f0.put(strE, dVar);
                }
                if (TextUtils.isEmpty(dVar.b())) {
                    return;
                }
                b(C5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                return;
            }
            if (!N()) {
                ironLog.error("No rewarded video configurations found");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f0) {
                com.ironsource.mediationsdk.demandOnly.k kVar = this.h0;
                if (kVar == null) {
                    this.f0.put(strE, dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        b(C5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                kVar.a(dVar);
                return;
            }
            C0421q4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th.getMessage()));
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.S4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.q0.a(str);
        try {
            if (!this.F) {
                ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.k kVar = this.h0;
            if (kVar == null) {
                ironLog.error("Rewarded video was not initiated");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
            } else {
                kVar.b(str);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
    }

    @Override // com.ironsource.S4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.q0.a(iSDemandOnlyRewardedVideoListener);
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog.API.info();
        C0219e8.a().a(levelPlayInterstitialListener);
    }

    @Override // com.ironsource.S4.b
    public synchronized void a(Activity activity, String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).b(), this.p0.a(str));
    }

    private synchronized void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.J) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.G) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(C5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            e(dVar.d());
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.d0) {
                        this.d0.put(dVar.e(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.e())) {
                        a(C5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
                return;
            }
            if (!F()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.d0) {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.g0;
                if (fVar == null) {
                    this.d0.put(dVar.e(), dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        a(C5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                fVar.a(dVar);
            }
            throw th;
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.S4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.p0.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.InterfaceC0529wb
    public void a(LogListener logListener) {
        if (logListener == null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.j.a(logListener);
        this.h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
        Ab.U().q().a(new B5(C5.SET_LOG_LISTENER, IronSourceUtils.getMediationAdditionalData(false)));
    }

    @Override // com.ironsource.S4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.H) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            if (!this.K) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
                return;
            }
            if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
                return;
            }
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                    return;
                } else {
                    this.M = ironSourceBannerLayout;
                    this.L = Boolean.TRUE;
                    this.N = str;
                    return;
                }
            }
            if (!A()) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
                return;
            }
            w wVar = this.Q;
            if (wVar == null && this.T == null) {
                this.M = ironSourceBannerLayout;
                this.L = Boolean.TRUE;
                this.N = str;
                return;
            } else if (this.b0) {
                this.T.a(ironSourceBannerLayout, new Placement(k(str)));
                return;
            } else {
                wVar.a(ironSourceBannerLayout, k(str));
                return;
            }
        }
        String strConcat = "loadBanner can't be called - ".concat(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
        this.h.log(IronSourceLogger.IronSourceTag.API, strConcat, 3);
        n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(strConcat));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        H2 h2;
        this.h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.b0 && (h2 = this.T) != null) {
                h2.a(ironSourceBannerLayout);
                return;
            }
            w wVar = this.Q;
            if (wVar != null) {
                wVar.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    @Override // com.ironsource.S4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        com.ironsource.mediationsdk.demandOnly.h.b bVarA = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(s.c().a());
        if (ironSourceErrorA2 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!A()) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.i0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.S4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        com.ironsource.mediationsdk.demandOnly.h.b bVarA = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(s.c().a());
        if (ironSourceErrorA2 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!A()) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.i0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        if (s.c().a() != s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.e0) {
            this.e0.put(bVar.e(), bVar);
        }
        return true;
    }

    private IronSourceError a(s.d dVar) {
        if (!this.K) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.H) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == s.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == s.d.INIT_IN_PROGRESS && s.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public Ae a(Context context, String str) {
        if (!C0220e9.a(context)) {
            return null;
        }
        F3 f3C = C0220e9.c(context);
        String strD = f3C.d();
        String strF = f3C.f();
        String strE = f3C.e();
        if (!strD.equals(str)) {
            return null;
        }
        Ae ae = new Ae(context, strD, strF, strE);
        ae.a(Ae.a.CACHE);
        return ae;
    }

    private Ae a(Context context, String str, c cVar) {
        Exception exc;
        Ae ae = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            IronSourceSegment ironSourceSegment = this.C;
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, n(), str, str2, q(), this.X, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, C()), C0186c9.a().toString(), cVar);
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String strOptString = jSONObject.optString(Ae.n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strSendPostRequest = a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    V();
                    return null;
                }
            }
            Ae ae2 = new Ae(context, n(), str, strSendPostRequest);
            try {
                ae2.a(Ae.a.SERVER);
                if (ae2.p()) {
                    return ae2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                exc = e;
                ae = ae2;
                C0421q4.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return ae;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return IronSourceAES.decryptAndDecompress(C0388o5.b().c(), str);
        }
        return IronSourceAES.decode(C0388o5.b().c(), str);
    }

    private void a(Ae ae, Context context) {
        boolean zL = y() ? ae.c().b().b().l() : false;
        boolean zL2 = M() ? ae.c().f().m().l() : false;
        boolean zL3 = E() ? ae.c().d().i().l() : false;
        boolean zL4 = z() ? ae.c().c().g().l() : false;
        boolean zL5 = I() ? ae.c().e().g().l() : false;
        Xc xcI = ae.c().b().i();
        boolean zI = xcI.i();
        if (zL) {
            a((AbstractC0487u3) Ab.U().q(), ae.c().b().b(), context, ae, true);
        }
        if (zL2) {
            a((AbstractC0487u3) Od.i(), ae.c().f().m(), context, ae, true);
        } else {
            Od.i().a(false);
        }
        if (zL3) {
            a((AbstractC0487u3) D9.i(), ae.c().d().i(), context, ae, true);
        } else if (zL4) {
            a((AbstractC0487u3) D9.i(), ae.c().c().g(), context, ae, true);
        } else if (zL5) {
            a((AbstractC0487u3) D9.i(), ae.c().e().g(), context, ae, true);
        } else {
            D9.i().a(false);
        }
        Wc wc = Wc.P;
        wc.a(zI);
        if (zI) {
            wc.b(xcI.j(), context);
            wc.b(xcI.l(), context);
            wc.c(xcI.k(), context);
            wc.b(xcI.g());
            wc.c(xcI.h());
        }
    }

    private void a(AbstractC0487u3 abstractC0487u3, H1 h1, Context context, Ae ae, boolean z) {
        abstractC0487u3.a(z);
        abstractC0487u3.a(h1.c(), context);
        abstractC0487u3.b(h1.d(), context);
        abstractC0487u3.a(h1.f());
        abstractC0487u3.d(h1.e());
        abstractC0487u3.b(h1.a());
        abstractC0487u3.b(h1.i(), context);
        abstractC0487u3.c(h1.h(), context);
        abstractC0487u3.a(h1.j(), context);
        abstractC0487u3.d(h1.g(), context);
        abstractC0487u3.a(ae.c().b().j());
        abstractC0487u3.b(h1.k());
        abstractC0487u3.c(h1.b());
    }

    private void a(String str, T3 t3) {
        if (a(str, 1, 128)) {
            return;
        }
        t3.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    @Override // com.ironsource.O9
    public void a(Context context, boolean z) {
        this.x = context;
        this.y = Boolean.valueOf(z);
        C0527w9 c0527w9 = this.R;
        if (c0527w9 != null) {
            c0527w9.a(context, z);
        }
        if (this.Z) {
            Jd jd = this.S;
            if (jd != null) {
                jd.a(context, z);
            }
        } else {
            P7 p7 = this.P;
            if (p7 != null) {
                p7.a(context, z);
            }
        }
        Ab.U().q().a(new B5(C5.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    boolean a(C0282i3 c0282i3) {
        return this.e.c(ContextProvider.getInstance().getApplicationContext(), c0282i3, IronSource.AD_UNIT.BANNER);
    }

    C0190cd.b a(InterstitialPlacement interstitialPlacement) {
        return this.e.a(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
    }

    C0190cd.b a(Placement placement) {
        return this.e.a(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    private void a(C5 c5, JSONObject jSONObject) {
        D9.i().a(new B5(c5, jSONObject));
    }

    private void a(boolean z, String str) {
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.F, true, this.c0);
            if (str != null) {
                a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            b(C5.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    String a(String str, C0190cd.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i = b.c[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    void a(SegmentListener segmentListener) {
        C0360mb c0360mb = this.i;
        if (c0360mb != null) {
            c0360mb.a(segmentListener);
            s.c().a(this.i);
        }
    }

    HashSet<String> a(String str, String str2) {
        Ae ae = this.m;
        return ae == null ? new HashSet<>() : ae.k().a(str, str2);
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    public void a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (D() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C0238fa.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(C0238fa.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.l0.a(jSONObject);
            this.k0.a(jSONObject);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        Ab.U().q().a(new B5(D() ? C5.SET_META_DATA_AFTER_INIT : C5.SET_META_DATA, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    @Override // com.ironsource.S4
    public String a(Context context) {
        String str;
        String strEncrypt;
        Qf qfK;
        T4 t4K = k();
        EnumC0397oe enumC0397oe = null;
        try {
            EnumC0397oe enumC0397oeA = C0414pe.a.a();
            try {
                t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, enumC0397oeA);
                if (context == null) {
                    IronLog.API.error("bidding data cannot be retrieved, context required");
                    t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (EnumC0397oe) null);
                    return null;
                }
                if (enumC0397oeA == EnumC0397oe.NOT_INIT) {
                    IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
                    t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (EnumC0397oe) null);
                    return null;
                }
                s.c().g();
                Ae ae = this.m;
                boolean zE = (ae == null || (qfK = ae.c().b().k()) == null) ? true : qfK.e();
                this.k0.b(context);
                JSONObject jSONObjectA = new Pf().a(context);
                com.ironsource.mediationsdk.d.b().a(jSONObjectA, true);
                if (zE) {
                    strEncrypt = IronSourceAES.compressAndEncrypt(jSONObjectA.toString());
                } else {
                    strEncrypt = IronSourceAES.encrypt(jSONObjectA.toString());
                }
                str = strEncrypt;
                if (TextUtils.isEmpty(str)) {
                    t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, enumC0397oeA);
                }
                t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, enumC0397oeA);
                return str;
            } catch (Exception unused) {
                enumC0397oe = enumC0397oeA;
                t4K.a(C5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, enumC0397oe);
                enumC0397oeA = enumC0397oe;
                str = null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.ironsource.V8
    public void a(ImpressionDataListener impressionDataListener) {
        if (U9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C0238fa.b().b(impressionDataListener);
            P7 p7 = this.P;
            if (p7 != null) {
                p7.a(impressionDataListener);
            }
            w wVar = this.Q;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (U9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && U9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.j0.a(str, jSONObject);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, C0465sf c0465sf) {
        H2 h2;
        Jd jd;
        C0527w9 c0527w9;
        if (this.m0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (c0527w9 = this.R) != null) {
                c0527w9.a(c0465sf);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (jd = this.S) != null) {
                jd.a(c0465sf);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (h2 = this.T) == null) {
                return;
            }
            h2.a(c0465sf);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog.API.info(String.format("(%s, %s)", ad_unit.name(), waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString()));
        B5 b5 = new B5(C5.SET_WATERFALL_CONFIGURATION, IronSourceUtils.getMediationAdditionalData(false));
        b5.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        Ab.U().q().a(b5, ad_unit);
        this.k0.a(ad_unit, waterfallConfiguration);
    }
}
