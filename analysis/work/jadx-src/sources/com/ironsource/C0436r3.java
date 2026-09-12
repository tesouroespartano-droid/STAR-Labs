package com.ironsource;

import com.ironsource.U0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0436r3<Listener extends U0> extends AbstractC0386o3<Listener> implements AdapterAdRewardListener {
    private C0320k5 r;

    /* JADX INFO: renamed from: com.ironsource.r3$a */
    class a extends Vd {
        a() {
        }

        @Override // com.ironsource.Vd
        public void a() {
            C0436r3.this.U();
        }
    }

    public C0436r3(InterfaceC0275hd interfaceC0275hd, C0332l0 c0332l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C0160b1 c0160b1, C0368n2 c0368n2, Listener listener) {
        super(interfaceC0275hd, c0332l0, baseAdAdapter, c0160b1, c0368n2, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            D0 d0 = this.d;
            if (d0 != null) {
                d0.j.g("mCurrentPlacement is null state = " + this.e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.p.m().s() != null) {
                for (String str : com.ironsource.mediationsdk.p.m().s().keySet()) {
                    map.put("custom_" + str, com.ironsource.mediationsdk.p.m().s().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.d.i.a(j(), this.g.getRewardName(), this.g.getRewardAmount(), jCurrentTimeMillis, IronSourceUtils.getTransId(jCurrentTimeMillis, c()), C0320k5.a(this.r), map, com.ironsource.mediationsdk.p.m().l());
        }
        ((U0) this.b).a((C0436r3<?>) this, this.g);
    }

    @Override // com.ironsource.AbstractC0386o3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.r = new C0320k5();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC0453s3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().e()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
