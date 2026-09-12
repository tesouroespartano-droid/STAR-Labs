package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes2.dex */
public class Od extends AbstractC0487u3 {
    private static Od R;
    private String P;
    private final M8 Q = Ab.U().s();

    private Od() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized Od i() {
        if (R == null) {
            Od od = new Od();
            R = od;
            od.e();
        }
        return R;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected int c(B5 b5) {
        return this.Q.a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean d(B5 b5) {
        int iC = b5.c();
        return iC == C5.FIRST_INSTANCE.b() || iC == C5.INIT_COMPLETE.b() || iC == C5.SDK_INIT_FAILED.b() || iC == C5.SDK_INIT_SUCCESS.b() || iC == C5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || iC == C5.RV_BUSINESS_INSTANCE_OPENED.b() || iC == C5.RV_INSTANCE_CLOSED.b() || iC == C5.RV_BUSINESS_INSTANCE_REWARDED.b() || iC == C5.RV_AUCTION_FAILED.b() || iC == C5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC0487u3
    protected String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void f(B5 b5) {
        if (b5.c() == 15 || (b5.c() >= 300 && b5.c() < 400)) {
            this.P = b5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean j(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void d() {
        this.J.add(Integer.valueOf(C5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(C5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(C5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(C5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(C5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
