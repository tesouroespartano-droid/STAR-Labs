package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0527w9 extends AbstractC0369n3<C0561y9, AdapterAdInteractionListener> {
    public C0527w9(List<NetworkSettings> list, B9 b9, String str, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(new C0544x9(str, list, b9), c0238fa, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC0403p3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0561y9 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i, String str, C0368n2 c0368n2) {
        return new C0561y9(this, new C0332l0(IronSource.AD_UNIT.INTERSTITIAL, this.o.o(), i, this.g, str, this.e, this.f, networkSettings, this.o.n()), baseAdAdapter, c0368n2, this);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected K0 g() {
        return new F9();
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    C0527w9(J7 j7, I7 i7, List<NetworkSettings> list, B9 b9, String str, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(j7, i7, new C0544x9(str, list, b9), c0238fa, ironSourceSegment);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
