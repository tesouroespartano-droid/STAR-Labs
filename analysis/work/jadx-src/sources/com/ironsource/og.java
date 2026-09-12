package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og {
    public static final a d = new a(null);
    private final V0 a;
    private final AbstractC0501v0 b;
    private final Lc c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final og a(V0 adTools, AbstractC0501v0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C0419q2(adTools, adUnitData) : new C0479tc(adTools, adUnitData);
        }

        private a() {
        }
    }

    public static final class b implements Lc {
        b() {
        }
    }

    public og(V0 adTools, AbstractC0501v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        this.c = new b();
    }

    public Lc a() {
        return this.c;
    }

    public abstract void a(C c, pg pgVar);

    public final qg a(List<? extends C0368n2> waterfallItems, Map<String, G> adInstancePayloads, C0317k2 auctionData, C adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C0366n0.a(this.a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i = 0; i < size; i++) {
            C0368n2 c0368n2 = waterfallItems.get(i);
            AbstractC0568z abstractC0568zA = a(c0368n2, auctionData, adInstanceFactory, adInstancePayloads.get(c0368n2.c()));
            if (abstractC0568zA != null && abstractC0568zA.g() != null) {
                arrayList.add(abstractC0568zA);
            }
        }
        qg qgVar = new qg(arrayList);
        IronLog.INTERNAL.verbose(C0366n0.a(this.a, "updateWaterfall() - next waterfall is " + qgVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return qgVar;
    }

    private final AbstractC0568z a(C0368n2 c0368n2, C0317k2 c0317k2, C c, G g) {
        AbstractC0501v0 abstractC0501v0 = this.b;
        String strC = c0368n2.c();
        Intrinsics.checkNotNullExpressionValue(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC0501v0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c0368n2.c();
            Intrinsics.checkNotNullExpressionValue(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (g == null) {
            String strC3 = c0368n2.c();
            Intrinsics.checkNotNullExpressionValue(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.b.b().a(), this.b.b().b());
        int iF = this.a.f();
        AbstractC0501v0 abstractC0501v1 = this.b;
        return c.a(new A(abstractC0501v1, networkSettingsA, c0317k2, new C0160b1(networkSettingsA, abstractC0501v1.b(networkSettingsA), this.b.b().a()), c0368n2, iF), g);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C0366n0.a(this.a, str3, (String) null, 2, (Object) null));
        this.a.e().h().i(str3);
    }
}
