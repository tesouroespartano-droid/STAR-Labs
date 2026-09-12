package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0243ff {
    private final JSONObject a;

    public C0243ff(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(C0198d4.a.o, false);
    }

    public boolean c() {
        return this.a.optBoolean(C0198d4.a.p, false);
    }

    public boolean d() {
        return this.a.optBoolean(C0198d4.a.l, false);
    }

    public boolean e() {
        return this.a.optBoolean(C0198d4.a.n, false);
    }
}
