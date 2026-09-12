package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Hd extends U {
    private final String s;
    private final List<NetworkSettings> t;
    private final Md u;
    private final boolean v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Hd(String str, List<? extends NetworkSettings> list, Md configs, boolean z) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        C0402p2 c0402p2K = configs.k();
        Intrinsics.checkNotNullExpressionValue(c0402p2K, "configs.rewardedVideoAuctionSettings");
        super(ad_unit, str, list, c0402p2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), Id.b(configs, z), new H0(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        this.s = str;
        this.t = list;
        this.u = configs;
        this.v = z;
    }

    public final Hd a(String str, List<? extends NetworkSettings> list, Md configs, boolean z) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Hd(str, list, configs, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hd)) {
            return false;
        }
        Hd hd = (Hd) obj;
        return Intrinsics.areEqual(this.s, hd.s) && Intrinsics.areEqual(this.t, hd.t) && Intrinsics.areEqual(this.u, hd.u) && this.v == hd.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.u.hashCode()) * 31;
        boolean z = this.v;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
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
        return "RewardedVideoAdDataManager(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ", isManual=" + this.v + ")";
    }

    public final Md u() {
        return this.u;
    }

    public final boolean v() {
        return this.v;
    }

    public final Md w() {
        return this.u;
    }

    public final boolean x() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Hd a(Hd hd, String str, List list, Md md, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hd.s;
        }
        if ((i & 2) != 0) {
            list = hd.t;
        }
        if ((i & 4) != 0) {
            md = hd.u;
        }
        if ((i & 8) != 0) {
            z = hd.v;
        }
        return hd.a(str, list, md, z);
    }
}
