package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes2.dex */
public class Kd extends C0436r3<U0> implements RewardedVideoAdListener {
    public Kd(InterfaceC0275hd interfaceC0275hd, C0332l0 c0332l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C0368n2 c0368n2, U0 u0) {
        super(interfaceC0275hd, c0332l0, baseAdAdapter, new C0160b1(c0332l0.g(), c0332l0.g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), c0368n2, u0);
    }
}
