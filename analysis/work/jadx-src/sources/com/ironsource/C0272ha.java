package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0272ha {
    private String a;
    private JSONObject b;
    private String c;
    private String d;

    public C0272ha(JSONObject jSONObject) {
        this.a = jSONObject.optString(C0198d4.g.b);
        this.b = jSONObject.optJSONObject(C0198d4.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(C0198d4.g.e);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0198d4.g.b, this.a);
            jSONObject.put(C0198d4.g.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(C0198d4.g.e, this.d);
            return jSONObject;
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
