package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0578z9 extends AbstractC0501v0 {
    public static final a z = new a(null);
    private final C0228f0 t;
    private final boolean u;
    private final C0484u0 v;
    private final B9 w;
    private final String x;
    private final String y;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0578z9 a(C0228f0 adProperties, Ra ra, boolean z) {
            List<C0378nc> listEmptyList;
            Ae aeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC0501v0.a aVar = AbstractC0501v0.r;
            U3 u3C = (ra == null || (aeD = ra.d()) == null) ? null : aeD.c();
            B9 b9D = u3C != null ? u3C.d() : null;
            if (b9D == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ra == null || (listEmptyList = ra.d(adProperties.e(), adProperties.c())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0378nc) it.next()).f());
            }
            C0238fa c0238faB = C0238fa.b();
            Intrinsics.checkNotNullExpressionValue(c0238faB, "getInstance()");
            return new C0578z9(adProperties, z, new C0484u0(userIdForNetworks, arrayList, c0238faB), b9D);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0578z9(C0228f0 adProperties, boolean z2, C0484u0 adUnitCommonData, B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0238fa c0238faE = adUnitCommonData.e();
        C0402p2 c0402p2G = configs.g();
        Intrinsics.checkNotNullExpressionValue(c0402p2G, "configs.interstitialAuctionSettings");
        super(adProperties, z2, strF, listD, c0238faE, c0402p2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Sa.c;
    }

    public final C0484u0 A() {
        return this.v;
    }

    public final B9 B() {
        return this.w;
    }

    public final C0578z9 a(C0228f0 adProperties, boolean z2, C0484u0 adUnitCommonData, B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C0578z9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0501v0
    public C0228f0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC0501v0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0578z9)) {
            return false;
        }
        C0578z9 c0578z9 = (C0578z9) obj;
        return Intrinsics.areEqual(this.t, c0578z9.t) && this.u == c0578z9.u && Intrinsics.areEqual(this.v, c0578z9.v) && Intrinsics.areEqual(this.w, c0578z9.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC0501v0
    public String j() {
        return this.y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC0501v0
    public boolean u() {
        return this.u;
    }

    public final C0228f0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C0484u0 y() {
        return this.v;
    }

    public final B9 z() {
        return this.w;
    }

    public static /* synthetic */ C0578z9 a(C0578z9 c0578z9, C0228f0 c0228f0, boolean z2, C0484u0 c0484u0, B9 b9, int i, Object obj) {
        if ((i & 1) != 0) {
            c0228f0 = c0578z9.t;
        }
        if ((i & 2) != 0) {
            z2 = c0578z9.u;
        }
        if ((i & 4) != 0) {
            c0484u0 = c0578z9.v;
        }
        if ((i & 8) != 0) {
            b9 = c0578z9.w;
        }
        return c0578z9.a(c0228f0, z2, c0484u0, b9);
    }

    @Override // com.ironsource.AbstractC0501v0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
