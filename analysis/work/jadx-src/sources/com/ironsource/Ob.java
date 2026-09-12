package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ob extends AbstractC0403p3<Sb, AdapterAdListener> implements Q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ob(List<? extends NetworkSettings> list, Fb configs, String str, C0238fa publisherDataHolder, IronSourceSegment ironSourceSegment) {
        super(new Pb(str, list, configs), publisherDataHolder, ironSourceSegment);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void G() {
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean H() {
        return false;
    }

    public final void M() {
        Sf sf;
        int iIntValue;
        C0377nb c0377nb;
        IronLog.INTERNAL.verbose();
        try {
            Sb sb = (Sb) this.a.d();
            if (sb != null) {
                Integer numR = sb.r();
                if (numR == null) {
                    iIntValue = this.C.a(this.o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(numR, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numR.intValue();
                }
                D0 d0 = this.s;
                if (d0 != null && (c0377nb = d0.f) != null) {
                    c0377nb.a(iIntValue);
                }
                sb.P();
                this.a.a(null);
                this.a.b(null);
            }
            this.i = null;
            a(AbstractC0403p3.f.NONE);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            D0 d1 = this.s;
            if (d1 == null || (sf = d1.j) == null) {
                return;
            }
            sf.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC0403p3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Sb a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i, String currentAuctionId, C0368n2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new Sb(this, new C0332l0(IronSource.AD_UNIT.NATIVE_AD, this.o.o(), i, this.g, currentAuctionId, this.e, this.f, providerSettings, this.o.n()), adapter, this.i, item, this);
    }

    @Override // com.ironsource.AbstractC0403p3
    protected K0 g() {
        return new C0337l5();
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC0403p3
    protected String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC0403p3
    protected boolean v() {
        return false;
    }

    public final void a(Placement placement) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placement == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C0569z0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), placement, this.o.b())) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C0569z0.f(this.o.b());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.i = placement;
            A();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    @Override // com.ironsource.AbstractC0403p3
    protected JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Nb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void a(AbstractC0453s3<?> abstractC0453s3, AdInfo adInfo) {
        if (abstractC0453s3 instanceof Sb) {
            Sb sb = (Sb) abstractC0453s3;
            this.t.a(sb.Q(), sb.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC0403p3
    protected void a(IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC0403p3, com.ironsource.C0
    public Map<String, Object> a(A0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        Placement placement = this.i;
        if (placement != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
