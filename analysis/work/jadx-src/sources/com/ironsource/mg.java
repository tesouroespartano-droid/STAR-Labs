package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mg implements E {
    private final V0 a;
    private final AbstractC0501v0 b;
    private final tg c;
    private final og d;
    private F e;
    private vg f;
    private final List<AbstractC0568z> g;
    private AbstractC0568z h;
    private boolean i;

    public mg(V0 adTools, AbstractC0501v0 adUnitData, tg listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = adUnitData;
        this.c = listener;
        this.d = og.d.a(adTools, adUnitData);
        this.g = new ArrayList();
    }

    private final boolean e() {
        return this.h != null;
    }

    private final void f() {
        F f = this.e;
        F.b bVarD = f != null ? f.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<AbstractC0568z> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            vg vgVar = this.f;
            if (vgVar != null) {
                vgVar.a();
            }
        }
    }

    public final AbstractC0568z c() {
        F.c cVarC;
        F f = this.e;
        if (f == null || (cVarC = f.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final boolean d() {
        Iterator<AbstractC0568z> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }

    private final void c(AbstractC0568z abstractC0568z) {
        d(abstractC0568z);
        b();
    }

    public final void b() {
        IronLog.INTERNAL.verbose(C0366n0.a(this.a, "dispose", (String) null, 2, (Object) null));
        Iterator<T> it = this.g.iterator();
        while (it.hasNext()) {
            ((AbstractC0568z) it.next()).c();
        }
        this.g.clear();
        this.a.e().h().a();
    }

    private final void d(AbstractC0568z abstractC0568z) {
        this.h = abstractC0568z;
        this.g.remove(abstractC0568z);
    }

    public final void a(C adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.d.a(adInstanceFactory, new a());
    }

    public static final class a implements pg {
        a() {
        }

        @Override // com.ironsource.pg
        public void a(qg waterfallInstances) {
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (mg.this.i) {
                return;
            }
            mg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.pg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (mg.this.i) {
                return;
            }
            mg.this.c.a(i, errorReason);
        }
    }

    public final void a(I adInstancePresenter) {
        AbstractC0568z abstractC0568zC;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        F f = this.e;
        F.c cVarC = f != null ? f.c() : null;
        if (cVarC == null || (abstractC0568zC = cVarC.c()) == null) {
            return;
        }
        c(abstractC0568zC);
        vg vgVar = this.f;
        if (vgVar != null) {
            vgVar.a(cVarC.c(), cVarC.d());
        }
        cVarC.c().a(adInstancePresenter);
    }

    public final void a() {
        this.i = true;
        AbstractC0568z abstractC0568z = this.h;
        if (abstractC0568z != null) {
            abstractC0568z.b();
        }
    }

    @Override // com.ironsource.E
    public void a(AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!this.i && !e()) {
            vg vgVar = this.f;
            if (vgVar != null) {
                vgVar.a(instance);
            }
            this.g.add(instance);
            if (this.g.size() == 1) {
                vg vgVar2 = this.f;
                if (vgVar2 != null) {
                    vgVar2.b(instance);
                }
                this.c.b(instance);
                return;
            }
            F f = this.e;
            if (f == null || !f.a(instance)) {
                return;
            }
            this.c.a(instance);
            return;
        }
        instance.c();
    }

    @Override // com.ironsource.E
    public void a(IronSourceError error, AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.i) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(qg qgVar) {
        F fA = F.c.a(this.b, qgVar);
        this.e = fA;
        this.f = vg.c.a(this.a, this.b, this.d.a(), qgVar, fA);
        f();
    }

    public final void b(AbstractC0568z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        vg vgVar = this.f;
        if (vgVar != null) {
            vgVar.a(instance, this.b.l(), this.b.o());
        }
    }
}
