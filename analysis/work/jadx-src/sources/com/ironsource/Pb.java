package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Pb extends U {
    private final String s;
    private final List<NetworkSettings> t;
    private final Fb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Pb(String str, List<? extends NetworkSettings> list, Fb configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new H0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.s = str;
        this.t = list;
        this.u = configs;
    }

    public final Pb a(String str, List<? extends NetworkSettings> list, Fb configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Pb(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pb)) {
            return false;
        }
        Pb pb = (Pb) obj;
        return Intrinsics.areEqual(this.s, pb.s) && Intrinsics.areEqual(this.t, pb.t) && Intrinsics.areEqual(this.u, pb.u);
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
        return "NativeAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    public final Fb u() {
        return this.u;
    }

    public final Fb v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pb a(Pb pb, String str, List list, Fb fb, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pb.s;
        }
        if ((i & 2) != 0) {
            list = pb.t;
        }
        if ((i & 4) != 0) {
            fb = pb.u;
        }
        return pb.a(str, list, fb);
    }
}
