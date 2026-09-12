package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0265h3 extends P0 {
    C0265h3(N0 n0, InterfaceC0478tb interfaceC0478tb) {
        super(n0, interfaceC0478tb);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    boolean o() {
        return b().a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
