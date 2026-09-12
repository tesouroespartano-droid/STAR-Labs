package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0206dc {
    private final InterfaceC0576z7 b = Ab.U().i();
    T6 a = new T6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(P6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(P6.i, new JSONObject(controllerConfig).opt(C0198d4.a.q));
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(P6.V, "8.12.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(P6.E, C0513vc.f);
        map.put(P6.D, C0513vc.e);
        this.a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(P6.l, jSONObject);
    }

    public void b(Context context) {
        this.a.a("gpi", Boolean.valueOf(Rc.e(context)));
    }

    public void a(C0425q8.c cVar) {
        this.a.a(P6.x1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.a.a(P6.A1, list);
    }

    public void a(boolean z) {
        this.a.a(P6.R0, Boolean.valueOf(z));
    }
}
