package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0166b7 implements X6 {
    private final JSONObject a;

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;
        public static final a a = new a();
        private static final int c = EnumC0184c7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public C0166b7(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.X6
    public long a() {
        return ((long) this.a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.W5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.j, false);
    }

    @Override // com.ironsource.X6
    public EnumC0184c7 c() {
        return EnumC0184c7.b.a(this.a.optInt(C0198d4.f.e, a.a.a()));
    }
}
