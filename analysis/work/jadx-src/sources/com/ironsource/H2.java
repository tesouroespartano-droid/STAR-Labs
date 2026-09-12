package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class H2 extends AbstractC0403p3<L2, AdapterAdViewListener> implements InterfaceC0433r0, G2 {
    private C0162b3 K;
    private boolean L;
    private IronSourceBannerLayout M;
    private View N;
    private AbstractC0453s3<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    class a implements D3 {
        final /* synthetic */ AbstractC0453s3 a;

        a(AbstractC0453s3 abstractC0453s3) {
            this.a = abstractC0453s3;
        }

        @Override // com.ironsource.D3
        public void a() {
            ((L2) this.a).Q();
        }
    }

    class b implements D3 {
        final /* synthetic */ AbstractC0453s3 a;

        b(AbstractC0453s3 abstractC0453s3) {
            this.a = abstractC0453s3;
        }

        @Override // com.ironsource.D3
        public void a() {
            ((L2) this.a).Q();
            H2 h2 = H2.this;
            h2.s.i.j(h2.n());
            H2.this.Q.set(false);
            H2.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + H2.this.o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            H2.this.O().h();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[N0.a.values().length];
            a = iArr;
            try {
                iArr[N0.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[N0.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public H2(List<NetworkSettings> list, V2 v2, String str, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(new I2(str, list, v2), c0238fa, ironSourceSegment);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private void M() {
        int i = c.a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().a();
        } else {
            if (i != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private C0162b3 N() {
        return new C0162b3(this.o.h(), this.o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0162b3 O() {
        return this.K;
    }

    private C0265h3 P() {
        return (C0265h3) this.q;
    }

    private ISBannerSize Q() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.M.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER;
        }
        return this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i = c.a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().k();
        } else {
            if (i != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i = c.a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().k();
        } else {
            if (i != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    boolean R() {
        if (!this.M.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.M.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void T() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC0403p3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public L2 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i, String str, C0368n2 c0368n2) {
        return new L2(this, new C0332l0(IronSource.AD_UNIT.BANNER, this.o.o(), i, this.g, str, this.e, this.f, networkSettings, this.o.n()), baseAdAdapter, this.M, this.i, v(), c0368n2, this);
    }

    @Override // com.ironsource.G2
    public void c() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.s.f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else if (S()) {
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        } else {
            IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
            this.Q.set(true);
        }
    }

    @Override // com.ironsource.G2
    public void d() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.s.j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.T0
    public void f(AbstractC0453s3<?> abstractC0453s3) {
        IronLog.INTERNAL.verbose(b(abstractC0453s3.k()));
        this.t.f(abstractC0453s3.f());
    }

    @Override // com.ironsource.AbstractC0403p3
    protected K0 g() {
        return new C0180c3();
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void g(AbstractC0453s3<?> abstractC0453s3) {
    }

    @Override // com.ironsource.AbstractC0403p3
    protected P0 h() {
        return new C0265h3(this.o.h(), this);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void h(AbstractC0453s3<?> abstractC0453s3) {
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean v() {
        return this.L;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s1) {
        if (this.c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.c.a(context, iVar, s1);
        }
    }

    @Override // com.ironsource.AbstractC0403p3
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void a(int i, String str, boolean z) {
        if (v()) {
            if (!z) {
                this.s.f.a(C0320k5.a(this.n), i, str);
                com.ironsource.mediationsdk.n.a().b(this.o.b(), new IronSourceError(i, str));
            }
            if (v()) {
                a(AbstractC0403p3.f.SHOWING);
                V();
                return;
            }
            return;
        }
        super.a(i, str, z);
    }

    @Override // com.ironsource.AbstractC0403p3, com.ironsource.InterfaceC0478tb
    public void b() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.s.f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (R()) {
                synchronized (this.x) {
                    if (a(AbstractC0403p3.f.SHOWING, AbstractC0403p3.f.READY_TO_LOAD)) {
                        ironLog.verbose("start reload");
                        z = true;
                        this.L = true;
                    } else {
                        ironLog.error("wrong state = " + this.p);
                        z = false;
                    }
                }
                if (z) {
                    a(this.M, this.i);
                    return;
                }
                return;
            }
            if (this.o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                ironLog.verbose("banner is not visible, reload skipped");
                this.s.f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
            }
            U();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            this.s.j.c(th.getMessage());
        }
    }

    private void c(AbstractC0453s3<?> abstractC0453s3, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(AbstractC0403p3.f.READY_TO_SHOW, AbstractC0403p3.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((L2) abstractC0453s3).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(abstractC0453s3));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.p);
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String str;
        IronLog.INTERNAL.verbose("placement = " + placement);
        int iB = 510;
        if (!b(ironSourceBannerLayout)) {
            str = String.format("can't load banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        } else if (placement != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            if (this.E.c(ContextProvider.getInstance().getApplicationContext(), placement, this.o.b())) {
                str = String.format("placement %s is capped", placement.getPlacementName());
                iB = C0569z0.f(this.o.b());
            } else {
                str = null;
            }
        } else {
            str = String.format("can't load banner - %s", placement == null ? "placement is null" : "placement name is empty");
            iB = C0569z0.b(this.o.b());
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            com.ironsource.mediationsdk.l.b(ironSourceBannerLayout);
            this.M = ironSourceBannerLayout;
            this.i = placement;
            A();
        }
    }

    @Override // com.ironsource.T0
    public void c(AbstractC0453s3<?> abstractC0453s3) {
        IronLog.INTERNAL.verbose(b(abstractC0453s3.k()));
        this.t.b(abstractC0453s3.f());
    }

    boolean b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private void b(AbstractC0453s3<?> abstractC0453s3, View view, FrameLayout.LayoutParams layoutParams) {
        ((L2) abstractC0453s3).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(abstractC0453s3));
    }

    @Override // com.ironsource.T0
    public void b(AbstractC0453s3<?> abstractC0453s3) {
        IronLog.INTERNAL.verbose(b(abstractC0453s3.k()));
        this.t.e(abstractC0453s3.f());
    }

    @Override // com.ironsource.AbstractC0403p3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        int iA;
        try {
            if (!b(ironSourceBannerLayout)) {
                IronLog.API.error("destroy banner failed - errorMessage = " + String.format("can't destroy banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"));
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            L2 l2 = (L2) this.a.d();
            if (l2 != null) {
                if (l2.r() != null) {
                    iA = l2.r().intValue();
                } else {
                    iA = this.C.a(this.o.b());
                }
                this.s.f.a(iA);
                l2.P();
                this.a.a(null);
                this.a.b(null);
            }
            com.ironsource.mediationsdk.l.a(ironSourceBannerLayout);
            this.M = null;
            this.i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(AbstractC0403p3.f.READY_TO_LOAD);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.p;
            IronLog.INTERNAL.error(b(str));
            D0 d0 = this.s;
            if (d0 != null) {
                d0.j.g(str);
            }
        }
    }

    @Override // com.ironsource.AbstractC0403p3, com.ironsource.C0
    public Map<String, Object> a(A0 a0) {
        Map<String, Object> mapA = super.a(a0);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.ironsource.InterfaceC0433r0
    public void a(AbstractC0453s3<?> abstractC0453s3, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.p);
        super.d(abstractC0453s3);
        if (this.o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (a(AbstractC0403p3.f.READY_TO_SHOW, AbstractC0403p3.f.SHOWING)) {
                this.a.a(abstractC0453s3);
                this.a.b(abstractC0453s3);
                b(abstractC0453s3, view, layoutParams);
                P().k();
                this.t.c(abstractC0453s3.f());
                return;
            }
            return;
        }
        if (P().o()) {
            this.a.b(abstractC0453s3);
            if (this.Q.get()) {
                c(abstractC0453s3, view, layoutParams);
            } else {
                this.O = abstractC0453s3;
                this.N = view;
                this.P = layoutParams;
            }
            this.t.c(abstractC0453s3.f());
        }
    }

    @Override // com.ironsource.AbstractC0403p3, com.ironsource.Q0
    public void a(AbstractC0453s3<?> abstractC0453s3) {
        super.a(abstractC0453s3);
        if (P().o()) {
            if (this.R.compareAndSet(false, true)) {
                O().b();
                U();
            } else {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            }
        }
    }

    @Override // com.ironsource.AbstractC0403p3
    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str, this.M);
    }
}
