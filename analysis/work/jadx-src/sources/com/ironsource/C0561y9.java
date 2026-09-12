package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0561y9 extends AbstractC0386o3<I0> implements InterstitialAdListener {
    public C0561y9(InterfaceC0275hd interfaceC0275hd, C0332l0 c0332l0, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C0368n2 c0368n2, I0 i0) {
        super(interfaceC0275hd, c0332l0, baseAdAdapter, new C0160b1(c0332l0.g(), c0332l0.g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), c0368n2, i0);
    }
}
