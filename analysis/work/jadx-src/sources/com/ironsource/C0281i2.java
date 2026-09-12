package com.ironsource;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0281i2 extends com.ironsource.mediationsdk.e.a {
    public C0281i2(S1 s1, URL url, JSONObject jSONObject, boolean z, C0402p2 c0402p2) {
        super(s1, url, jSONObject, z, c0402p2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z, S1 s1, long j) {
        try {
            if (z) {
                ((InterfaceC0161b2) s1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            s1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
