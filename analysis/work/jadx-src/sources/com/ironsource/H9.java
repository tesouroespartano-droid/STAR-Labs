package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class H9 {
    private String a;
    private String e;
    private Map<String, String> f;
    private final InterfaceC0530wc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private C0236f8 d = null;
    protected boolean i = false;
    protected String j = null;

    public H9(String str, InterfaceC0530wc interfaceC0530wc) throws NullPointerException {
        this.a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (InterfaceC0530wc) SDKUtils.requireNonNull(interfaceC0530wc, "AdListener name can't be null");
    }

    public H9 a(boolean z) {
        this.c = z;
        return this;
    }

    public H9 b(boolean z) {
        this.i = z;
        return this;
    }

    public H9 c() {
        this.b = true;
        return this;
    }

    public H9 a(C0236f8 c0236f8) {
        this.d = c0236f8;
        return this;
    }

    public H9 b(String str) {
        this.j = str;
        return this;
    }

    public H9 c(boolean z) {
        this.h = z;
        return this;
    }

    public H9 a(String str) {
        this.e = str;
        return this;
    }

    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.a);
            jSONObject.put("rewarded", this.b);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? R9.a() : R9.a(jSONObject);
    }

    public H9 a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public G9 a() {
        return new G9(b(), this.a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }
}
