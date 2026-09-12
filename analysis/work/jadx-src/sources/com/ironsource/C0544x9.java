package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0544x9 extends U {
    private final String s;
    private final List<NetworkSettings> t;
    private final B9 u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0544x9(String str, List<? extends NetworkSettings> list, B9 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        C0402p2 c0402p2G = configs.g();
        Intrinsics.checkNotNullExpressionValue(c0402p2G, "configs.interstitialAuctionSettings");
        super(ad_unit, str, list, c0402p2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), new H0(-1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 32768, null);
        this.s = str;
        this.t = list;
        this.u = configs;
    }

    public final C0544x9 a(String str, List<? extends NetworkSettings> list, B9 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C0544x9(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0544x9)) {
            return false;
        }
        C0544x9 c0544x9 = (C0544x9) obj;
        return Intrinsics.areEqual(this.s, c0544x9.s) && Intrinsics.areEqual(this.t, c0544x9.t) && Intrinsics.areEqual(this.u, c0544x9.u);
    }

    public int hashCode() {
        String str = this.s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.u.hashCode();
    }

    @Override // com.ironsource.U
    public List<NetworkSettings> j() {
        return this.t;
    }

    @Override // com.ironsource.U
    public String o() {
        return this.s;
    }

    public final String s() {
        return this.s;
    }

    public final List<NetworkSettings> t() {
        return this.t;
    }

    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    public final B9 u() {
        return this.u;
    }

    public final B9 v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0544x9 a(C0544x9 c0544x9, String str, List list, B9 b9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0544x9.s;
        }
        if ((i & 2) != 0) {
            list = c0544x9.t;
        }
        if ((i & 4) != 0) {
            b9 = c0544x9.u;
        }
        return c0544x9.a(str, list, b9);
    }
}
