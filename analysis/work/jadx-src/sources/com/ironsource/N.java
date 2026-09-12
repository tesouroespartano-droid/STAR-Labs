package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class N {
    public static final a f = new a(null);
    public static final String g = "0";
    public static final String h = "0";
    public static final String i = "0";
    public static final String j = "0";
    private final G9 a;
    private U7 b;
    private String c;
    private EnumC0349m0 d;
    private double e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public N(G9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.a = adInstance;
        this.b = U7.UnknownProvider;
        this.c = "0";
        this.d = EnumC0349m0.LOAD_REQUEST;
        this.e = new Date().getTime() / 1000.0d;
    }

    public final G9 a() {
        return this.a;
    }

    public final IronSource.AD_UNIT b() {
        if (this.a.i()) {
            return IronSource.AD_UNIT.BANNER;
        }
        return this.a.n() ? IronSource.AD_UNIT.REWARDED_VIDEO : IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final String c() {
        String strE = this.a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        return strE;
    }

    public final G9 d() {
        return this.a;
    }

    public final U7 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return Intrinsics.areEqual(c(), n.c()) && Intrinsics.areEqual(g(), n.g()) && b() == n.b() && Intrinsics.areEqual(i(), n.i()) && this.b == n.b && Intrinsics.areEqual(this.c, n.c) && this.d == n.d;
    }

    public final EnumC0349m0 f() {
        return this.d;
    }

    public final String g() {
        String strC = this.a.c();
        return strC == null ? "0" : strC;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    public final String i() {
        String strG = this.a.g();
        Intrinsics.checkNotNullExpressionValue(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.e;
    }

    public String toString() {
        String string = new JSONObject().put(com.ironsource.sdk.controller.f.b.c, c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    public final N a(G9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new N(adInstance);
    }

    public static /* synthetic */ N a(N n, G9 g9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g9 = n.a;
        }
        return n.a(g9);
    }

    public final void a(U7 u7) {
        Intrinsics.checkNotNullParameter(u7, "<set-?>");
        this.b = u7;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(EnumC0349m0 enumC0349m0) {
        Intrinsics.checkNotNullParameter(enumC0349m0, "<set-?>");
        this.d = enumC0349m0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
