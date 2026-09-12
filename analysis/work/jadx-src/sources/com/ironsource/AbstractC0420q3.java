package com.ironsource;

import com.ironsource.C0436r3;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0420q3<Smash extends C0436r3<?>> extends AbstractC0369n3<Smash, AdapterAdRewardListener> implements U0 {
    public AbstractC0420q3(U u, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(u, c0238fa, ironSourceSegment);
    }

    @Override // com.ironsource.U0
    public void a(C0436r3<?> c0436r3, Placement placement) {
        IronLog.INTERNAL.verbose(b(c0436r3.k()));
        this.t.b(placement, c0436r3.f());
    }
}
