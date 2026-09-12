package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Tb extends AbstractC0383o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(C0366n0 adTools, Ub adUnitData, Vb listener) {
        String str;
        int iB;
        super(adTools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Placement placementG = g();
        IronLog.INTERNAL.verbose("placement = " + placementG);
        if (placementG == null || TextUtils.isEmpty(placementG.getPlacementName())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placementG == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C0569z0.b(adUnitData.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.ironsource.AbstractC0383o0
    protected C a() {
        return new C() { // from class: com.ironsource.Tb$$ExternalSyntheticLambda0
            @Override // com.ironsource.C
            public final AbstractC0568z a(A a, G g) {
                return Tb.a(this.f$0, a, g);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0568z a(Tb this$0, A adInstanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new Lb(new V0(this$0.f(), D0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC0383o0.a());
    }
}
