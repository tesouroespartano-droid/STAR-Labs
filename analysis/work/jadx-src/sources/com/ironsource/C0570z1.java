package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0570z1 {
    private final C0495ub a;
    private final boolean b;
    private final D1 c;
    private final K1 d;
    private final C0536x1 e;

    public C0570z1(JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(B1.a);
        this.a = new C0495ub(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.b = applicationConfigurations.optBoolean(B1.g, false);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(B1.h);
        this.c = new D1(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.d = new K1(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(B1.f);
        this.e = new C0536x1(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    public final C0536x1 a() {
        return this.e;
    }

    public final D1 b() {
        return this.c;
    }

    public final K1 c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final C0495ub e() {
        return this.a;
    }
}
