package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class A {
    private final AbstractC0501v0 a;
    private final NetworkSettings b;
    private final C0317k2 c;
    private final C0160b1 d;
    private final C0368n2 e;
    private final int f;
    private final H g;
    private final IronSource.AD_UNIT h;
    private final JSONObject i;
    private final String j;
    private final int k;
    private final String l;
    private final C0368n2 m;
    private final String n;
    private final String o;
    private final int p;
    private final AdData q;

    public A(AbstractC0501v0 adUnitData, NetworkSettings providerSettings, C0317k2 auctionData, C0160b1 adapterConfig, C0368n2 auctionResponseItem, int i) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.a = adUnitData;
        this.b = providerSettings;
        this.c = auctionData;
        this.d = adapterConfig;
        this.e = auctionResponseItem;
        this.f = i;
        this.g = new H(C0400p0.a.DidntAttemptToLoad);
        IronSource.AD_UNIT ad_unitA = adUnitData.b().a();
        this.h = ad_unitA;
        this.i = auctionData.h();
        this.j = auctionData.g();
        this.k = auctionData.i();
        this.l = auctionData.f();
        this.m = auctionData.j();
        String strF = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        this.n = strF;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strF, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        this.o = str;
        this.p = adapterConfig.d();
        String strK = auctionResponseItem.k();
        Map<String, Object> mapA = C0169ba.a(auctionResponseItem.a());
        Intrinsics.checkNotNullExpressionValue(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", ad_unitA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C0169ba.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", adUnitData.r());
        mapA.put("adUnitId", adUnitData.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.q = new AdData(strK, map, mapA);
    }

    public final AbstractC0501v0 a() {
        return this.a;
    }

    public final NetworkSettings b() {
        return this.b;
    }

    public final C0317k2 c() {
        return this.c;
    }

    public final C0160b1 d() {
        return this.d;
    }

    public final C0368n2 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return Intrinsics.areEqual(this.a, a.a) && Intrinsics.areEqual(this.b, a.b) && Intrinsics.areEqual(this.c, a.c) && Intrinsics.areEqual(this.d, a.d) && Intrinsics.areEqual(this.e, a.e) && this.f == a.f;
    }

    public final int f() {
        return this.f;
    }

    public final AdData g() {
        return this.q;
    }

    public final IronSource.AD_UNIT h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f);
    }

    public final AbstractC0501v0 i() {
        return this.a;
    }

    public final C0160b1 j() {
        return this.d;
    }

    public final C0317k2 k() {
        return this.c;
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.j;
    }

    public final C0368n2 n() {
        return this.e;
    }

    public final int o() {
        return this.k;
    }

    public final C0368n2 p() {
        return this.m;
    }

    public final JSONObject q() {
        return this.i;
    }

    public final String r() {
        return this.n;
    }

    public final int s() {
        return this.p;
    }

    public final H t() {
        return this.g;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.a + ", providerSettings=" + this.b + ", auctionData=" + this.c + ", adapterConfig=" + this.d + ", auctionResponseItem=" + this.e + ", sessionDepth=" + this.f + ")";
    }

    public final NetworkSettings u() {
        return this.b;
    }

    public final int v() {
        return this.f;
    }

    public final String w() {
        return this.o;
    }

    public final A a(AbstractC0501v0 adUnitData, NetworkSettings providerSettings, C0317k2 auctionData, C0160b1 adapterConfig, C0368n2 auctionResponseItem, int i) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new A(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i);
    }

    public static /* synthetic */ A a(A a, AbstractC0501v0 abstractC0501v0, NetworkSettings networkSettings, C0317k2 c0317k2, C0160b1 c0160b1, C0368n2 c0368n2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC0501v0 = a.a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = a.b;
        }
        if ((i2 & 4) != 0) {
            c0317k2 = a.c;
        }
        if ((i2 & 8) != 0) {
            c0160b1 = a.d;
        }
        if ((i2 & 16) != 0) {
            c0368n2 = a.e;
        }
        if ((i2 & 32) != 0) {
            i = a.f;
        }
        C0368n2 c0368n3 = c0368n2;
        int i3 = i;
        return a.a(abstractC0501v0, networkSettings, c0317k2, c0160b1, c0368n3, i3);
    }

    public final void a(C0400p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.g.b(performance);
    }
}
