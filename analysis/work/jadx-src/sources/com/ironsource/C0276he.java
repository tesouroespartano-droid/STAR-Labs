package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0276he {
    private final Ae a;
    private final C0379nd b;
    private final C0413pd c;
    private final V3 d;
    private final P5 e;

    public C0276he(Ae fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.i().optJSONObject(C0296ie.a);
        this.b = new C0379nd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.i().optJSONObject(C0296ie.b);
        this.c = new C0413pd(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.i().optJSONObject("configurations");
        this.d = new V3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.i().optJSONObject(C0296ie.d);
        this.e = new P5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    public final V3 a() {
        return this.d;
    }

    public final P5 b() {
        return this.e;
    }

    public final Ae c() {
        return this.a;
    }

    public final C0379nd d() {
        return this.b;
    }

    public final C0413pd e() {
        return this.c;
    }
}
