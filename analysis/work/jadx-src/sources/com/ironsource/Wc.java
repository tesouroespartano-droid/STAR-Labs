package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class Wc extends AbstractC0487u3 {
    public static final Wc P;

    public static final class a {
        public final void a() throws JSONException {
            new P9().b(ContextProvider.getInstance().getApplicationContext());
            Wc.P.a(new B5(C5.INIT_DEFERRED_DATA, new Z8().a()));
        }
    }

    static {
        Wc wc = new Wc();
        P = wc;
        wc.H = "outcome";
        wc.G = 0;
        wc.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        wc.e();
    }

    private Wc() {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void a(ArrayList<B5> arrayList) {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected int c(B5 b5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean d(B5 b5) {
        return true;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void f(B5 b5) {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean g(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean h(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean j(B5 b5) {
        return false;
    }
}
