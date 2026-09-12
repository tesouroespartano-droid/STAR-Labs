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

/* JADX INFO: loaded from: classes2.dex */
public final class Gd extends AbstractC0501v0 {
    public static final a z = new a(null);
    private final C0228f0 t;
    private final boolean u;
    private final C0484u0 v;
    private final Md w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Gd a(C0228f0 adProperties, Ra ra, boolean z) {
            List<C0378nc> listEmptyList;
            Ae aeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC0501v0.a aVar = AbstractC0501v0.r;
            U3 u3C = (ra == null || (aeD = ra.d()) == null) ? null : aeD.c();
            Md mdF = u3C != null ? u3C.f() : null;
            if (mdF == null) {
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
            return new Gd(adProperties, z, new C0484u0(userIdForNetworks, arrayList, c0238faB), mdF);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gd(C0228f0 adProperties, boolean z2, C0484u0 adUnitCommonData, Md configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0238fa c0238faE = adUnitCommonData.e();
        C0402p2 c0402p2K = configs.k();
        Intrinsics.checkNotNullExpressionValue(c0402p2K, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z2, strF, listD, c0238faE, c0402p2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new N0(N0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = Sa.b;
    }

    public final C0484u0 A() {
        return this.v;
    }

    public final Md B() {
        return this.w;
    }

    public final Gd a(C0228f0 adProperties, boolean z2, C0484u0 adUnitCommonData, Md configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Gd(adProperties, z2, adUnitCommonData, configs);
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
        if (!(obj instanceof Gd)) {
            return false;
        }
        Gd gd = (Gd) obj;
        return Intrinsics.areEqual(this.t, gd.t) && this.u == gd.u && Intrinsics.areEqual(this.v, gd.v) && Intrinsics.areEqual(this.w, gd.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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

    public final Md z() {
        return this.w;
    }

    public static /* synthetic */ Gd a(Gd gd, C0228f0 c0228f0, boolean z2, C0484u0 c0484u0, Md md, int i, Object obj) {
        if ((i & 1) != 0) {
            c0228f0 = gd.t;
        }
        if ((i & 2) != 0) {
            z2 = gd.u;
        }
        if ((i & 4) != 0) {
            c0484u0 = gd.v;
        }
        if ((i & 8) != 0) {
            md = gd.w;
        }
        return gd.a(c0228f0, z2, c0484u0, md);
    }

    @Override // com.ironsource.AbstractC0501v0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
