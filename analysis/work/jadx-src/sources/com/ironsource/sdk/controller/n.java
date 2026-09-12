package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C0421q4;
import com.ironsource.C0425q8;
import com.ironsource.InterfaceC0505v4;
import com.ironsource.InterfaceC0522w4;
import com.ironsource.InterfaceC0539x4;
import com.ironsource.T7;
import com.ironsource.X4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n implements l {
    private final T7 a;
    private final String b;

    class a implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        a(l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.b);
                this.a.a(new com.ironsource.sdk.controller.f.a(this.b.f(), jSONObject));
            } catch (JSONException e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ InterfaceC0539x4 a;
        final /* synthetic */ X4 b;

        b(InterfaceC0539x4 interfaceC0539x4, X4 x4) {
            this.a = interfaceC0539x4;
            this.b = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C0425q8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ InterfaceC0539x4 a;
        final /* synthetic */ JSONObject b;

        c(InterfaceC0539x4 interfaceC0539x4, JSONObject jSONObject) {
            this.a = interfaceC0539x4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class d implements Runnable {
        final /* synthetic */ InterfaceC0522w4 a;
        final /* synthetic */ X4 b;

        d(InterfaceC0522w4 interfaceC0522w4, X4 x4) {
            this.a = interfaceC0522w4;
            this.b = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C0425q8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ InterfaceC0522w4 a;
        final /* synthetic */ String b;

        e(InterfaceC0522w4 interfaceC0522w4, String str) {
            this.a = interfaceC0522w4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, n.this.b);
        }
    }

    class f implements Runnable {
        final /* synthetic */ InterfaceC0522w4 a;
        final /* synthetic */ X4 b;

        f(InterfaceC0522w4 interfaceC0522w4, X4 x4) {
            this.a = interfaceC0522w4;
            this.b = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b.h(), n.this.b);
        }
    }

    class g implements Runnable {
        final /* synthetic */ InterfaceC0522w4 a;
        final /* synthetic */ JSONObject b;

        g(InterfaceC0522w4 interfaceC0522w4, JSONObject jSONObject) {
            this.a = interfaceC0522w4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class h implements Runnable {
        final /* synthetic */ InterfaceC0522w4 a;
        final /* synthetic */ X4 b;

        h(InterfaceC0522w4 interfaceC0522w4, X4 x4) {
            this.a = interfaceC0522w4;
            this.b = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.h(), n.this.b);
        }
    }

    class i implements Runnable {
        final /* synthetic */ InterfaceC0505v4 a;
        final /* synthetic */ Map b;

        i(InterfaceC0505v4 interfaceC0505v4, Map map) {
            this.a = interfaceC0505v4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    class j implements Runnable {
        final /* synthetic */ InterfaceC0505v4 a;
        final /* synthetic */ JSONObject b;

        j(InterfaceC0505v4 interfaceC0505v4, JSONObject jSONObject) {
            this.a = interfaceC0505v4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    n(String str, T7 t7) {
        this.a = t7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C0425q8.c h() {
        return C0425q8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        if (interfaceC0522w4 != null) {
            a(new f(interfaceC0522w4, x4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0539x4 interfaceC0539x4) {
        if (interfaceC0539x4 != null) {
            a(new b(interfaceC0539x4, x4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0539x4 interfaceC0539x4) {
        if (interfaceC0539x4 != null) {
            a(new c(interfaceC0539x4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0522w4 interfaceC0522w4) {
        if (interfaceC0522w4 != null) {
            a(new d(interfaceC0522w4, x4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0522w4 interfaceC0522w4) {
        if (interfaceC0522w4 != null) {
            a(new e(interfaceC0522w4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0522w4 interfaceC0522w4) {
        if (interfaceC0522w4 != null) {
            a(new g(interfaceC0522w4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        if (interfaceC0522w4 != null) {
            a(new h(interfaceC0522w4, x4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0505v4 interfaceC0505v4) {
        if (interfaceC0505v4 != null) {
            interfaceC0505v4.a(C0425q8.e.Banner, x4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0505v4 interfaceC0505v4) {
        if (interfaceC0505v4 != null) {
            a(new i(interfaceC0505v4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0505v4 interfaceC0505v4) {
        if (interfaceC0505v4 != null) {
            a(new j(interfaceC0505v4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    void a(Runnable runnable) {
        T7 t7 = this.a;
        if (t7 != null) {
            t7.c(runnable);
        }
    }
}
