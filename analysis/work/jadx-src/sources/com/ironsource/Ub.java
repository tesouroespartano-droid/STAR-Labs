package com.ironsource;

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
public final class Ub extends AbstractC0501v0 {
    public static final a y = new a(null);
    private final C0228f0 t;
    private final C0484u0 u;
    private final Fb v;
    private final String w;
    private final String x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ub a(C0228f0 adProperties, Ra ra) {
            List<C0378nc> listEmptyList;
            Ae aeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC0501v0.a aVar = AbstractC0501v0.r;
            U3 u3C = (ra == null || (aeD = ra.d()) == null) ? null : aeD.c();
            Fb fbE = u3C != null ? u3C.e() : null;
            if (fbE == null) {
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
            return new Ub(adProperties, new C0484u0(userIdForNetworks, arrayList, c0238faB), fbE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ub(C0228f0 adProperties, C0484u0 adUnitCommonData, Fb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = Sa.e;
    }

    public final Fb A() {
        return this.v;
    }

    public final Ub a(C0228f0 adProperties, C0484u0 adUnitCommonData, Fb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Ub(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0501v0
    public C0228f0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC0501v0
    public String c() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ub)) {
            return false;
        }
        Ub ub = (Ub) obj;
        return Intrinsics.areEqual(this.t, ub.t) && Intrinsics.areEqual(this.u, ub.u) && Intrinsics.areEqual(this.v, ub.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC0501v0
    public String j() {
        return this.x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final C0228f0 w() {
        return this.t;
    }

    public final C0484u0 x() {
        return this.u;
    }

    public final Fb y() {
        return this.v;
    }

    public final C0484u0 z() {
        return this.u;
    }

    public static /* synthetic */ Ub a(Ub ub, C0228f0 c0228f0, C0484u0 c0484u0, Fb fb, int i, Object obj) {
        if ((i & 1) != 0) {
            c0228f0 = ub.t;
        }
        if ((i & 2) != 0) {
            c0484u0 = ub.u;
        }
        if ((i & 4) != 0) {
            fb = ub.v;
        }
        return ub.a(c0228f0, c0484u0, fb);
    }

    @Override // com.ironsource.AbstractC0501v0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
