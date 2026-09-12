package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class N2 extends AbstractC0501v0 {
    public static final a z = new a(null);
    private final K2 t;
    private final boolean u;
    private final C0484u0 v;
    private final V2 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final N2 a(K2 adProperties, Ra ra, boolean z) {
            List<C0378nc> listEmptyList;
            Ae aeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC0501v0.a aVar = AbstractC0501v0.r;
            U3 u3C = (ra == null || (aeD = ra.d()) == null) ? null : aeD.c();
            V2 v2C = u3C != null ? u3C.c() : null;
            if (v2C == null) {
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
            return new N2(adProperties, z, new C0484u0(userIdForNetworks, arrayList, c0238faB), v2C);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public N2(K2 adProperties, boolean z2, C0484u0 adUnitCommonData, V2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0238fa c0238faE = adUnitCommonData.e();
        C0402p2 c0402p2D = configs.d();
        Intrinsics.checkNotNullExpressionValue(c0402p2D, "configs.bannerAuctionSettings");
        super(adProperties, z2, strF, listD, c0238faE, c0402p2D, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, new N0(N0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * ((long) configs.h())), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = "BN";
        this.y = Sa.d;
    }

    @Override // com.ironsource.AbstractC0501v0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public K2 b() {
        return this.t;
    }

    public final C0484u0 B() {
        return this.v;
    }

    public final V2 C() {
        return this.w;
    }

    public final N2 a(K2 adProperties, boolean z2, C0484u0 adUnitCommonData, V2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new N2(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0501v0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return false;
        }
        N2 n2 = (N2) obj;
        return Intrinsics.areEqual(this.t, n2.t) && this.u == n2.u && Intrinsics.areEqual(this.v, n2.v) && Intrinsics.areEqual(this.w, n2.w);
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
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC0501v0
    public boolean u() {
        return this.u;
    }

    public final K2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C0484u0 y() {
        return this.v;
    }

    public final V2 z() {
        return this.w;
    }

    public static /* synthetic */ N2 a(N2 n2, K2 k2, boolean z2, C0484u0 c0484u0, V2 v2, int i, Object obj) {
        if ((i & 1) != 0) {
            k2 = n2.t;
        }
        if ((i & 2) != 0) {
            z2 = n2.u;
        }
        if ((i & 4) != 0) {
            c0484u0 = n2.v;
        }
        if ((i & 8) != 0) {
            v2 = n2.w;
        }
        return n2.a(k2, z2, c0484u0, v2);
    }

    @Override // com.ironsource.AbstractC0501v0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC0501v0
    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), new C0315k0().b(b().h())));
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
