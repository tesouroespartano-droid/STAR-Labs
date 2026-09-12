package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC0386o3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0369n3<Smash extends AbstractC0386o3<?>, Listener extends AdapterAdInteractionListener> extends AbstractC0403p3<Smash, Listener> implements I0 {

    /* JADX INFO: renamed from: com.ironsource.n3$a */
    class a extends Vd {
        final /* synthetic */ Activity b;
        final /* synthetic */ Placement c;

        a(Activity activity, Placement placement) {
            this.b = activity;
            this.c = placement;
        }

        @Override // com.ironsource.Vd
        public void a() {
            AbstractC0369n3.this.b(this.b, this.c);
        }
    }

    protected AbstractC0369n3(U u, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(u, c0238fa, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Placement placement) {
        AbstractC0386o3 abstractC0386o3;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(b("state = " + this.p));
        synchronized (this.x) {
            this.i = placement;
            this.s.i.a(activity, n());
            AbstractC0403p3.f fVar = this.p;
            AbstractC0403p3.f fVar2 = AbstractC0403p3.f.SHOWING;
            abstractC0386o3 = null;
            if (fVar == fVar2) {
                ironSourceError = new IronSourceError(C0569z0.g(this.o.b()), "can't show ad while an ad is already showing");
            } else if (fVar != AbstractC0403p3.f.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                ironSourceError = new IronSourceError(C0569z0.b(this.o.b()), "empty default placement");
            } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), placement, this.o.b())) {
                ironSourceError = new IronSourceError(C0569z0.f(this.o.b()), "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(b(ironSourceError.getErrorMessage()));
                a(ironSourceError, "");
            } else {
                List listB = this.a.b();
                wg wgVar = new wg(this.o);
                abstractC0386o3 = (AbstractC0386o3) wgVar.c(listB);
                a(abstractC0386o3, (List<AbstractC0386o3>) wgVar.b(listB));
                if (abstractC0386o3 != null) {
                    a(fVar2);
                    i(abstractC0386o3);
                } else {
                    a(ErrorBuilder.buildNoAdsToShowError(this.o.b().toString()), a(listB));
                }
            }
        }
        if (abstractC0386o3 != null) {
            a(activity, (AbstractC0386o3<?>) abstractC0386o3, this.i);
        }
    }

    public void a(Activity activity, Placement placement) {
        if (e()) {
            a(new a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.ironsource.I0
    public void c(AbstractC0386o3<?> abstractC0386o3) {
        IronLog.INTERNAL.verbose(b(abstractC0386o3.k()));
        this.t.a();
    }

    @Override // com.ironsource.I0
    public void d(AbstractC0386o3<?> abstractC0386o3) {
        IronLog.INTERNAL.verbose(b(abstractC0386o3.k()));
        this.t.b();
    }

    @Override // com.ironsource.I0
    public String f() {
        StringBuilder sb = new StringBuilder();
        if (this.p == AbstractC0403p3.f.READY_TO_SHOW) {
            for (AbstractC0386o3 abstractC0386o3 : this.a.b()) {
                if (abstractC0386o3.y()) {
                    sb.append(abstractC0386o3.c()).append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ironsource.AbstractC0403p3
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.j && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.a.b().iterator();
        while (it.hasNext()) {
            if (((AbstractC0386o3) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean v() {
        return false;
    }

    AbstractC0369n3(J7 j7, I7 i7, U u, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(j7, i7, u, c0238fa, ironSourceSegment);
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            } else {
                smash2.b(false);
                IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
            }
        }
    }

    private String a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c()).append(":").append(smash.e()).append(",");
            }
        }
        return sb.toString();
    }

    private void a(Activity activity, AbstractC0386o3<?> abstractC0386o3, Placement placement) {
        if (this.o.h().e()) {
            this.r.a();
        }
        abstractC0386o3.a(activity, placement);
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (AbstractC0386o3<?>) null, str);
    }

    private void a(IronSourceError ironSourceError, AbstractC0386o3<?> abstractC0386o3, String str) {
        this.s.i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.q.g();
        this.t.a(ironSourceError, abstractC0386o3 != null ? abstractC0386o3.f() : null);
        if (this.o.h().e()) {
            b(false);
        }
    }

    @Override // com.ironsource.I0
    public void a(IronSourceError ironSourceError, AbstractC0386o3<?> abstractC0386o3) {
        IronLog.INTERNAL.verbose(b(abstractC0386o3.k() + " - error = " + ironSourceError));
        this.b.put(abstractC0386o3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToShow);
        a(AbstractC0403p3.f.READY_TO_LOAD);
        a(ironSourceError, abstractC0386o3, "");
    }

    @Override // com.ironsource.I0
    public void a(AbstractC0386o3<?> abstractC0386o3) {
        IronLog.INTERNAL.verbose(b(abstractC0386o3.k()));
        if (this.p == AbstractC0403p3.f.SHOWING) {
            a(AbstractC0403p3.f.READY_TO_LOAD);
        }
        this.q.f();
        this.t.a(abstractC0386o3.f());
    }

    @Override // com.ironsource.I0
    public void b(AbstractC0386o3<?> abstractC0386o3) {
        IronLog.INTERNAL.verbose(b(abstractC0386o3.k()));
        this.t.g(abstractC0386o3.f());
    }
}
