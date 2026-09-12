package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class V3 {
    private final C0449s a;
    private final C0449s b;
    private final U2 c;
    private final Gb d;
    private final C0570z1 e;
    private final Map<LevelPlay.AdFormat, C0449s> f;

    public V3(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C0449s c0449s = new C0449s(a(configurations, "rewarded"));
        this.a = c0449s;
        C0449s c0449s2 = new C0449s(a(configurations, "interstitial"));
        this.b = c0449s2;
        this.c = new U2(a(configurations, "banner"));
        this.d = new Gb(a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.e = new C0570z1(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c0449s2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c0449s));
    }

    public final Map<LevelPlay.AdFormat, C0449s> a() {
        return this.f;
    }

    public final C0570z1 b() {
        return this.e;
    }

    public final U2 c() {
        return this.c;
    }

    public final Gb d() {
        return this.d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
