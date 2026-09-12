package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0378nc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final JSONObject f;
    private final Map<String, JSONObject> g;
    private final String h;
    private final String i;
    private final boolean j;
    private C0378nc k;
    private final Lazy l;

    /* JADX INFO: renamed from: com.ironsource.nc$a */
    static final class a extends Lambda implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C0378nc.this.j();
            String strL = C0378nc.this.l();
            String strH = C0378nc.this.h();
            String strK = C0378nc.this.k();
            JSONObject jSONObjectC = C0378nc.this.c();
            C0378nc c0378nc = C0378nc.this.k;
            JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC, c0378nc != null ? c0378nc.c() : null);
            JSONObject jSONObjectM = C0378nc.this.m();
            C0378nc c0378nc2 = C0378nc.this.k;
            JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectM, c0378nc2 != null ? c0378nc2.m() : null);
            JSONObject jSONObjectE = C0378nc.this.e();
            C0378nc c0378nc3 = C0378nc.this.k;
            JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectE, c0378nc3 != null ? c0378nc3.e() : null);
            JSONObject jSONObjectD = C0378nc.this.d();
            C0378nc c0378nc4 = C0378nc.this.k;
            JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectD, c0378nc4 != null ? c0378nc4.d() : null);
            JSONObject jSONObjectG = C0378nc.this.g();
            C0378nc c0378nc5 = C0378nc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4, IronSourceUtils.mergeJsons(jSONObjectG, c0378nc5 != null ? c0378nc5.g() : null));
            networkSettings.setIsMultipleInstances(C0378nc.this.o());
            networkSettings.setSubProviderId(C0378nc.this.n());
            networkSettings.setAdSourceNameForEvents(C0378nc.this.b());
            return networkSettings;
        }
    }

    public C0378nc(String providerName, JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.a = providerName;
        this.b = providerName;
        String strOptString = networkSettings.optString(C0395oc.d, providerName);
        Intrinsics.checkNotNullExpressionValue(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.c = strOptString;
        String strOptString2 = networkSettings.optString(C0395oc.e, strOptString);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = strOptString2;
        Object objOpt = networkSettings.opt(C0395oc.f);
        this.e = objOpt instanceof String ? (String) objOpt : null;
        this.f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C0313jf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = strOptString3;
        String strOptString4 = networkSettings.optString(C0395oc.a);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = strOptString4;
        this.j = networkSettings.optBoolean(C0395oc.c, false);
        this.l = LazyKt.lazy(new a());
    }

    public final String b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.f;
    }

    public final JSONObject d() {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.g.get("banner"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    public final JSONObject e() {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.g.get("interstitial"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.g.get("nativeAd"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    public final String h() {
        return this.d;
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.c;
    }

    public final JSONObject m() {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.g.get("rewarded"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectMergeJsons, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectMergeJsons;
    }

    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(C0378nc c0378nc) {
        this.k = c0378nc;
    }
}
