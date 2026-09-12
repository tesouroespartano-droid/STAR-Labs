package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Jd extends AbstractC0420q3<Kd> {
    public Jd(List<NetworkSettings> list, Md md, String str, boolean z, C0238fa c0238fa, IronSourceSegment ironSourceSegment) {
        super(new Hd(str, list, md, z), c0238fa, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC0403p3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Kd a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i, String str, C0368n2 c0368n2) {
        return new Kd(this, new C0332l0(IronSource.AD_UNIT.REWARDED_VIDEO, this.o.o(), i, this.g, str, this.e, this.f, networkSettings, this.o.n()), baseAdAdapter, c0368n2, this);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected K0 g() {
        return new Pd();
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean q() {
        return this.o.h().a() == N0.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean t() {
        return this.o.h().a() == N0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void a(IronSourceError ironSourceError) {
        N0.a aVarA = this.o.h().a();
        if (aVarA != N0.a.AUTOMATIC_LOAD_AFTER_CLOSE && aVarA != N0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            super.a(ironSourceError);
        } else {
            this.t.a(false, (AdInfo) null);
        }
    }

    @Override // com.ironsource.AbstractC0403p3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }
}
