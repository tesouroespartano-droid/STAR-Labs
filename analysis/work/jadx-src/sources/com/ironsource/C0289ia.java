package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0289ia {
    private InterfaceC0255ga a;

    public C0289ia(InterfaceC0255ga interfaceC0255ga) {
        this.a = interfaceC0255ga;
    }

    public void a(C0272ha c0272ha, JSONObject jSONObject) {
        this.a.a(false, c0272ha.a(), jSONObject);
    }

    public void b(C0272ha c0272ha, JSONObject jSONObject) {
        this.a.a(true, c0272ha.d(), jSONObject);
    }
}
