package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class P9 {
    T6 a = new T6();

    class a extends Vd {
        final /* synthetic */ EnumC0242fe b;

        a(EnumC0242fe enumC0242fe) {
            this.b = enumC0242fe;
        }

        @Override // com.ironsource.Vd
        public void a() {
            P9.this.a.a(P6.g0, new JSONArray().put(this.b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(P6.u, (Object) jSONObject);
    }

    public void b(JSONObject jSONObject) {
        this.a.a(P6.e1, (Object) jSONObject);
    }

    public void c(String str) {
        this.a.a(P6.J0, str);
    }

    public void d(String str) {
        this.a.a(P6.L0, str);
    }

    public void e(String str) {
        this.a.a(com.ironsource.mediationsdk.metadata.a.i, str);
    }

    public void f(String str) {
        this.a.a(P6.Z0, str);
    }

    public void g(String str) {
        this.a.a(P6.A, str);
    }

    public void h(String str) {
        this.a.a(P6.c1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(P6.e0, str);
    }

    public void a(boolean z) {
        this.a.a(P6.Q0, Boolean.valueOf(z));
    }

    public void b(boolean z) {
        this.a.a("gpi", Boolean.valueOf(z));
    }

    public void c(int i) {
        this.a.a(P6.f0, Integer.valueOf(i));
    }

    public void a(Context context) {
        this.a.a(context);
    }

    public void b(int i) {
        if (i >= 0) {
            this.a.a(P6.S0, Integer.valueOf(i));
        }
    }

    public void a(Boolean bool) {
        this.a.a(P6.T0, bool);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(P6.C1, str);
    }

    public void a(EnumC0242fe enumC0242fe) {
        new Thread(new a(enumC0242fe)).start();
    }

    public void b(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        ActivityManager.MemoryInfo memoryInfoN = interfaceC0576z7I.n(context);
        this.a.a(P6.w, interfaceC0576z7I.c(memoryInfoN));
        this.a.a(P6.x, interfaceC0576z7I.b(memoryInfoN));
    }

    public void a(S7 s7) {
        try {
            HashMap map = new HashMap();
            map.put(P6.E, s7.a());
            map.put(P6.D, s7.b());
            map.put(P6.V, s7.c());
            this.a.a(map);
        } catch (Exception e) {
            C0421q4.d().a(e);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(P6.t1, waterfallConfiguration.getFloor());
                jSONObject.put(P6.u1, waterfallConfiguration.getCeiling());
            } catch (JSONException e) {
                C0421q4.d().a(e);
            }
        }
        if (jSONObject.length() == 0) {
            this.a.a(P6.s1, W0.a(ad_unit));
        } else {
            this.a.a(P6.s1, jSONObject, W0.a(ad_unit));
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a("abt", str);
    }

    public void a(int i) {
        this.a.a(P6.i0, Integer.valueOf(i));
    }
}
