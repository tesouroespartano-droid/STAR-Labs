package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class R3 implements W5 {
    private final JSONObject a;

    public static final class a {
        public static final a a = new a();
        public static final boolean b = false;

        private a() {
        }
    }

    public R3(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.W5
    public boolean b() {
        return this.a.optBoolean("clickCheck", false);
    }
}
