package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class K1 {
    private final JSONObject a;
    private final boolean b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final JSONObject l;

    public K1(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
        this.b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", S5.j);
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.c = strOptString;
        this.d = config.optBoolean(P6.c1, true);
        this.e = config.optBoolean("radvid", false);
        this.f = config.optInt("uaeh", 0);
        this.g = config.optBoolean("sharedThreadPool", false);
        this.h = config.optBoolean("sharedThreadPoolADP", true);
        this.i = config.optInt(P6.S0, -1);
        this.j = config.optBoolean("axal", false);
        this.k = config.optBoolean("psrt", false);
        this.l = config.optJSONObject(C0198d4.a.c);
    }

    private final JSONObject a() {
        return this.a;
    }

    public final int b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.l;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && Intrinsics.areEqual(this.a, ((K1) obj).a);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.f;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.a + ")";
    }

    public final K1 a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new K1(config);
    }

    public static /* synthetic */ K1 a(K1 k1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = k1.a;
        }
        return k1.a(jSONObject);
    }
}
