package com.ironsource;

import android.app.Activity;
import com.ironsource.I0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Locale;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0386o3<Listener extends I0> extends AbstractC0453s3<Listener> implements AdapterAdInteractionListener {

    /* JADX INFO: renamed from: com.ironsource.o3$a */
    class a extends Vd {
        a() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.P();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o3$b */
    class b extends Vd {
        b() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.S();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o3$c */
    class c extends Vd {
        c() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o3$d */
    class d extends Vd {
        d() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.T();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o3$e */
    class e extends Vd {
        e() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.R();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o3$f */
    class f extends Vd {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        f(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0386o3.this.b(this.b, this.c);
        }
    }

    public AbstractC0386o3(InterfaceC0275hd interfaceC0275hd, C0332l0 c0332l0, BaseAdAdapter<?, ?> baseAdAdapter, C0160b1 c0160b1, C0368n2 c0368n2, Listener listener) {
        super(interfaceC0275hd, c0332l0, baseAdAdapter, c0160b1, c0368n2, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.q) {
            if (this.e != AbstractC0453s3.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.e);
                D0 d0 = this.d;
                if (d0 != null) {
                    d0.j.l("unexpected ad closed - state = " + this.e);
                }
                return;
            }
            a(AbstractC0453s3.h.NONE);
            if (this.d != null) {
                String str = "";
                if (this.a.a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    String strF = ((I0) this.b).f();
                    str = "otherInstanceAvailable = " + (strF.length() > 0 ? "true|" + strF : "false");
                }
                this.d.i.a(j(), str);
            }
            ((I0) this.b).a((AbstractC0386o3<?>) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.d(j());
        }
        ((I0) this.b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.l(j());
        }
        ((I0) this.b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.i(j());
        }
        ((I0) this.b).d((AbstractC0386o3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.k(j());
        }
    }

    @Override // com.ironsource.AbstractC0453s3
    public boolean B() {
        if (this.k == null || !y()) {
            return false;
        }
        try {
            Object obj = this.c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.k);
            }
            IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            D0 d0 = this.d;
            if (d0 != null) {
                d0.j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            D0 d1 = this.d;
            if (d1 != null) {
                d1.j.g(str);
            }
        }
    }

    public void a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getPlacementName()));
        try {
            this.g = placement;
            a(AbstractC0453s3.h.SHOWING);
            this.d.i.a(activity, j());
            Object obj = this.c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.k, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            D0 d0 = this.d;
            if (d0 != null) {
                d0.j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            a(AbstractC0453s3.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            D0 d1 = this.d;
            if (d1 != null) {
                d1.j.g(str);
            }
            onAdShowFailed(C0569z0.h(this.a.a()), str);
        }
    }

    public void b(boolean z) {
        D0 d0 = this.d;
        if (d0 != null) {
            d0.i.a(z);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().e()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().e()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        if (u().e()) {
            u().a(new f(i, str));
        } else {
            b(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (u().e()) {
            u().a(new e());
        } else {
            R();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().e()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().e()) {
            u().a(new d());
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        AbstractC0453s3.h hVar = this.e;
        if (hVar == AbstractC0453s3.h.SHOWING) {
            a(AbstractC0453s3.h.FAILED);
            D0 d0 = this.d;
            if (d0 != null) {
                d0.i.a(j(), i, str, "");
            }
            ((I0) this.b).a(new IronSourceError(i, str), (AbstractC0386o3<?>) this);
            return;
        }
        String strA = a(hVar, i, str);
        ironLog.error(a(strA));
        D0 d1 = this.d;
        if (d1 != null) {
            d1.j.t(strA);
        }
    }

    static String a(AbstractC0453s3.h hVar, int i, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i), str);
    }
}
