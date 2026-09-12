package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.A3;
import com.ironsource.B5;
import com.ironsource.C0160b1;
import com.ironsource.C0169ba;
import com.ironsource.C0226ef;
import com.ironsource.C0282i3;
import com.ironsource.C0320k5;
import com.ironsource.C0421q4;
import com.ironsource.C5;
import com.ironsource.D9;
import com.ironsource.InterfaceC0311jd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x extends y implements BannerSmashListener, C0226ef.a, A3 {
    private k h;
    private C0226ef i;
    private a j;
    private InterfaceC0311jd k;
    private IronSourceBannerLayout l;
    private String m;
    private JSONObject n;
    private int o;
    private String p;
    private C0282i3 q;
    private final Object r;
    private C0320k5 s;
    private boolean t;
    private boolean u;
    private JSONObject v;

    protected enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    x(k kVar, InterfaceC0311jd interfaceC0311jd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(kVar, interfaceC0311jd, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.a != null) {
                if (p()) {
                    this.a.initBannerForBidding(this.h.a(), this.h.i(), this.d, this);
                } else {
                    this.a.initBanners(this.h.a(), this.h.i(), this.d, this);
                }
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            a(C5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z;
        synchronized (this.r) {
            z = this.j == a.DESTROYED;
        }
        return z;
    }

    private boolean C() {
        boolean z;
        synchronized (this.r) {
            z = this.j == a.LOADED;
        }
        return z;
    }

    private void F() {
        if (this.a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(C5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean b(C5 c5) {
        return c5 == C5.BN_INSTANCE_LOAD_SUCCESS || c5 == C5.BN_INSTANCE_LOAD || c5 == C5.BN_INSTANCE_RELOAD || c5 == C5.BN_INSTANCE_RELOAD_SUCCESS || c5 == C5.BN_INSTANCE_CLICK || c5 == C5.BN_INSTANCE_DESTROY || c5 == C5.BN_INSTANCE_LOAD_ERROR || c5 == C5.BN_INSTANCE_LOAD_NO_FILL || c5 == C5.BN_INSTANCE_RELOAD_NO_FILL || c5 == C5.BN_INSTANCE_PRESENT_SCREEN || c5 == C5.BN_INSTANCE_DISMISS_SCREEN || c5 == C5.BN_INSTANCE_LEAVE_APP || c5 == C5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.u = true;
        A();
    }

    public void D() {
        this.a.onBannerViewBound(this.b.h().getBannerSettings());
    }

    public void E() {
        this.a.onBannerViewWillBind(this.b.h().getBannerSettings());
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, C0282i3 c0282i3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.q = c0282i3;
        this.v = jSONObject;
        if (!l.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.a == null) {
            ironLog.verbose("mAdapter is null");
            this.k.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null"), this, false);
            return;
        }
        this.l = ironSourceBannerLayout;
        this.i.a((C0226ef.a) this);
        try {
            if (p()) {
                a(str, this.v);
            } else {
                A();
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.A3
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(C5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.a.collectBannerBiddingData(this.d, adData != null ? C0169ba.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.y
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(C5.BN_INSTANCE_CLICK);
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(C5.BN_INSTANCE_LEAVE_APP);
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.t ? C5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : C5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.t ? C5.BN_INSTANCE_RELOAD_SUCCESS : C5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.s))}});
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(C5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(C5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!C()) {
            ironLog.warning("wrong state - mState = " + this.j);
            a(C5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
            return;
        }
        a(C5.BN_INSTANCE_SHOW);
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (!a(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.j);
            return;
        }
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.a(ironSourceError, this, false);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.u) {
                this.u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.l)) {
                    a((String) null, this.v);
                } else {
                    this.k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public void q() {
        this.i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(C5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.b.h().getBannerSettings());
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(C5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.b.h().getAdSourceNameForEvents()) ? this.b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.a;
    }

    public String x() {
        return this.m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.b.i();
    }

    x(k kVar, InterfaceC0311jd interfaceC0311jd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C0160b1(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.j = a.NONE;
        this.h = kVar;
        this.i = new C0226ef(kVar.e());
        this.k = interfaceC0311jd;
        this.f = i;
        this.m = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.v = null;
        if (r()) {
            u();
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.s = new C0320k5();
            a(this.t ? C5.BN_INSTANCE_RELOAD : C5.BN_INSTANCE_LOAD);
            if (this.a != null) {
                try {
                    try {
                        if (p()) {
                            this.a.loadBannerForBidding(this.d, this.v, str, this.l, this);
                            return;
                        } else {
                            this.a.loadBanner(this.d, this.v, this.l, this);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Throwable th3 = th;
                C0421q4.d().a(th3);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.a.getProviderName() + ", exception =  " + th3.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th3.getLocalizedMessage()));
                a(C5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th3.getLocalizedMessage()}});
                return;
            }
            return;
        }
        ironLog.error("wrong state - state = " + this.j);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.j == aVar) {
                IronLog.INTERNAL.verbose(y() + "set state from '" + this.j + "' to '" + aVar2 + "'");
                this.j = aVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.r) {
            this.j = aVar;
        }
    }

    @Override // com.ironsource.C0226ef.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (a(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.j);
            return;
        }
        a(ironSourceError);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z = ironSourceError.getErrorCode() == 606;
        if (z) {
            a(this.t ? C5.BN_INSTANCE_RELOAD_NO_FILL : C5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.s))}});
        } else {
            a(this.t ? C5.BN_INSTANCE_RELOAD_ERROR : C5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0320k5.a(this.s))}});
        }
        InterfaceC0311jd interfaceC0311jd = this.k;
        if (interfaceC0311jd != null) {
            interfaceC0311jd.a(ironSourceError, this, z);
        }
    }

    public void a(C5 c5) {
        a(c5, (Object[][]) null);
    }

    public void a(C5 c5, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.l;
            if (ironSourceBannerLayout != null) {
                l.a(mapM, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            mapM.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.n);
        }
        C0282i3 c0282i3 = this.q;
        if (c0282i3 != null) {
            mapM.put("placement", c0282i3.getPlacementName());
        }
        if (b(c5)) {
            D9.i().a(mapM, this.o, this.p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        D9.i().a(new B5(c5, new JSONObject(mapM)));
    }
}
