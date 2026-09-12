package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Q6 {
    private final InterfaceC0576z7 a;
    private final ConcurrentHashMap<String, Object> b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Q6.this.e(this.a);
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            Q6.this.c.set(false);
        }
    }

    private static class b {
        static volatile Q6 a = new Q6();

        private b() {
        }
    }

    private Q6() {
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.a = Ab.U().i();
        this.b = new ConcurrentHashMap<>();
    }

    static Q6 b() {
        return b.a;
    }

    private void d(Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.a.d(context));
        a(P6.B, this.a.l());
        a(P6.t, this.a.q());
        a(P6.F, this.a.f());
        a(P6.p, this.a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(P6.B1, adQualitySdkVersion);
        }
        String strI = this.a.i();
        if (strI != null) {
            a(P6.G, strI.replaceAll("[^0-9/.]", ""));
            a(P6.J, strI);
        }
        a(P6.a, String.valueOf(this.a.e()));
        String strU = this.a.u(context);
        if (!TextUtils.isEmpty(strU)) {
            a(P6.P0, strU);
        }
        String strE = C1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(P6.o, strE);
        }
        String strR = this.a.r(context);
        if (!TextUtils.isEmpty(strR)) {
            a(P6.v0, strR);
        }
        a(P6.f, context.getPackageName());
        a("mem", String.valueOf(this.a.q(context)));
        a(P6.b0, P6.j0);
        a(P6.c0, Long.valueOf(C1.f(context)));
        a(P6.a0, Long.valueOf(C1.d(context)));
        a(P6.d, C1.b(context));
        a(P6.O, Integer.valueOf(Z3.f(context)));
        a(P6.Y, Z3.g(context));
        a("stid", Rc.d(context));
        a(P6.H, "android");
        a(P6.z, this.a.t());
        a("mThreshold", this.a.a(this.a.n(context)));
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(P6.U0, strI);
            }
            String strB = this.a.b(context);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a(P6.s, Boolean.valueOf(Boolean.parseBoolean(strB)));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strY = this.a.y(context);
        if (!TextUtils.isEmpty(strY)) {
            a(P6.K0, strY);
        } else if (a(P6.K0)) {
            b(P6.K0);
        }
        a("idfi", this.a.i(context));
        String strC = this.a.c(context);
        if (!TextUtils.isEmpty(strC)) {
            a(P6.q, strC.toUpperCase(Locale.getDefault()));
        }
        a(P6.r, this.a.A(context));
        String strD = this.a.d();
        if (!TextUtils.isEmpty(strD)) {
            a("tz", strD);
        }
        String strB = C0145a4.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(P6.j, strB);
        }
        String strD2 = C0145a4.d(context);
        if (!TextUtils.isEmpty(strD2)) {
            a(P6.k, strD2);
        }
        a("vpn", Boolean.valueOf(C0145a4.e(context)));
        String strG = this.a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("icc", strG);
        }
        int iS = this.a.s(context);
        if (iS >= 0) {
            a(P6.j1, Integer.valueOf(iS));
        }
        a(P6.k1, this.a.v(context));
        a(P6.l1, this.a.F(context));
        a(P6.h0, Float.valueOf(this.a.E(context)));
        a(P6.m, String.valueOf(this.a.h()));
        a(P6.R, Integer.valueOf(this.a.k()));
        a(P6.Q, Integer.valueOf(this.a.c()));
        a(P6.X0, String.valueOf(this.a.a()));
        a(P6.g1, String.valueOf(this.a.m()));
        a("mcc", Integer.valueOf(Z3.b(context)));
        a("mnc", Integer.valueOf(Z3.c(context)));
        a(P6.T, Boolean.valueOf(this.a.j()));
        a(P6.g, Boolean.valueOf(this.a.C(context)));
        a(P6.h, Integer.valueOf(this.a.D(context)));
        a(P6.b, Boolean.valueOf(this.a.e(context)));
        a(P6.K, Boolean.valueOf(this.a.h(context)));
        a("rt", Boolean.valueOf(this.a.p()));
        a(P6.Z, String.valueOf(this.a.r()));
        a(P6.e, Integer.valueOf(this.a.k(context)));
        a(P6.Y0, Boolean.valueOf(this.a.J(context)));
        a(P6.c, this.a.m(context));
        a(P6.d0, this.a.s());
        C0551y c0551y = new C0551y(Ab.U().s());
        HashMap map = new HashMap();
        c0551y.a(map);
        a(P6.D0, map);
        a(P6.L, ConfigFile.getConfigFile().getPluginType());
        a(P6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(P6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    protected void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void b(String str, Object obj) {
        a(str, obj);
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(S6.a(this.b));
    }

    protected void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.b.containsKey(str);
    }

    private void a(Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            this.c.set(false);
        }
    }

    private void a() {
        String strA = Vf.a.a();
        if (strA != null) {
            HashMap map = new HashMap();
            map.put("sdk", strA);
            HashMap map2 = new HashMap();
            map2.put(P6.G1, map);
            Map<String, Object> map3 = new HashMap<>();
            map3.put(P6.D1, map2);
            a(map3);
        }
    }
}
