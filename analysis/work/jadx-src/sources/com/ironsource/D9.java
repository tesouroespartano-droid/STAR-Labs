package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes2.dex */
public class D9 extends AbstractC0487u3 {
    private static D9 R;
    private String P;
    private final M8 Q = Ab.U().s();

    private D9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized D9 i() {
        if (R == null) {
            D9 d9 = new D9();
            R = d9;
            d9.e();
        }
        return R;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected int c(B5 b5) {
        int iF = f(b5.c());
        if (iF == AbstractC0487u3.e.BANNER.b()) {
            return this.Q.a(IronSource.AD_UNIT.BANNER);
        }
        return iF == AbstractC0487u3.e.NATIVE_AD.b() ? this.Q.a(IronSource.AD_UNIT.NATIVE_AD) : this.Q.a(IronSource.AD_UNIT.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean d(B5 b5) {
        int iC = b5.c();
        return iC == C5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == C5.IS_INSTANCE_OPENED.b() || iC == C5.IS_INSTANCE_CLOSED.b() || iC == C5.IS_AUCTION_SUCCESS.b() || iC == C5.IS_AUCTION_FAILED.b() || iC == C5.BN_INSTANCE_SHOW.b() || iC == C5.BN_AUCTION_SUCCESS.b() || iC == C5.BN_AUCTION_FAILED.b() || iC == C5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == C5.NT_INSTANCE_SHOW.b() || iC == C5.NT_AUCTION_SUCCESS.b() || iC == C5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC0487u3
    protected String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void f(B5 b5) {
        this.P = b5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean j(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void d() {
        this.J.add(Integer.valueOf(C5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(C5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(C5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(C5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(C5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(C5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(C5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(C5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(C5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(C5.NT_INSTANCE_SHOW.b()));
    }
}
