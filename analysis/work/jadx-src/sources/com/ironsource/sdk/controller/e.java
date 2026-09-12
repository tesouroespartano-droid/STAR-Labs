package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.A4;
import com.ironsource.Ab;
import com.ironsource.C0198d4;
import com.ironsource.C0206dc;
import com.ironsource.C0249g4;
import com.ironsource.C0284i5;
import com.ironsource.C0421q4;
import com.ironsource.C0425q8;
import com.ironsource.C0434r1;
import com.ironsource.C0441r8;
import com.ironsource.C0458s8;
import com.ironsource.C0543x8;
import com.ironsource.C0560y8;
import com.ironsource.C0573z4;
import com.ironsource.Cb;
import com.ironsource.Db;
import com.ironsource.EnumC0184c7;
import com.ironsource.F5;
import com.ironsource.InterfaceC0148a7;
import com.ironsource.InterfaceC0505v4;
import com.ironsource.InterfaceC0522w4;
import com.ironsource.InterfaceC0539x4;
import com.ironsource.L;
import com.ironsource.S3;
import com.ironsource.Sd;
import com.ironsource.T7;
import com.ironsource.X4;
import com.ironsource.Y4;
import com.ironsource.Y5;
import com.ironsource.Z5;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.zg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final T7 g;
    private final zg h;
    private final C0206dc k;
    private final String a = "e";
    private C0425q8.b c = C0425q8.b.None;
    private final S3 e = new S3("NativeCommandExecutor");
    private final S3 f = new S3("ControllerCommandsExecutor");
    private final Map<String, com.ironsource.sdk.controller.l.a> i = new HashMap();
    private final Map<String, com.ironsource.sdk.controller.l.b> j = new HashMap();

    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC0522w4 b;

        a(JSONObject jSONObject, InterfaceC0522w4 interfaceC0522w4) {
            this.a = jSONObject;
            this.b = interfaceC0522w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC0522w4 c;

        b(X4 x4, Map map, InterfaceC0522w4 interfaceC0522w4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC0522w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC0505v4 d;

        c(String str, String str2, X4 x4, InterfaceC0505v4 interfaceC0505v4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC0505v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC0505v4 b;

        d(JSONObject jSONObject, InterfaceC0505v4 interfaceC0505v4) {
            this.a = jSONObject;
            this.b = interfaceC0505v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0067e implements Runnable {
        final /* synthetic */ X4 a;

        RunnableC0067e(X4 x4) {
            this.a = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ X4 a;

        f(X4 x4) {
            this.a = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC0505v4 c;

        g(X4 x4, Map map, InterfaceC0505v4 interfaceC0505v4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC0505v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ com.ironsource.sdk.controller.l.a a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.b != null) {
                if (this.a != null) {
                    eVar.i.put(this.b.f(), this.a);
                }
                e.this.b.a(this.b, this.a);
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ JSONObject a;

        i(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a();
                e.this.b = null;
            }
        }
    }

    class k extends CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(C0198d4.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.a, "Global Controller Timer Tick " + j);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        m(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.a, this.b);
                e.this.b.b();
            } catch (Throwable th) {
                C0421q4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C0198d4.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Tick " + j);
        }
    }

    class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC0539x4 d;

        o(String str, String str2, X4 x4, InterfaceC0539x4 interfaceC0539x4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC0539x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC0539x4 b;

        p(JSONObject jSONObject, InterfaceC0539x4 interfaceC0539x4) {
            this.a = jSONObject;
            this.b = interfaceC0539x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC0522w4 d;

        q(String str, String str2, X4 x4, InterfaceC0522w4 interfaceC0522w4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC0522w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC0522w4 b;

        r(String str, InterfaceC0522w4 interfaceC0522w4) {
            this.a = str;
            this.b = interfaceC0522w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class s implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC0522w4 c;

        s(X4 x4, Map map, InterfaceC0522w4 interfaceC0522w4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC0522w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0543x8.a(Sd.j, new C0458s8().a(F5.v, this.a.f()).a(F5.w, C0560y8.a(this.a, C0425q8.e.Interstitial)).a(F5.x, Boolean.valueOf(C0560y8.a(this.a))).a(F5.I, Long.valueOf(L.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    public e(Context context, C0249g4 c0249g4, Y4 y4, T7 t7, int i2, JSONObject jSONObject, String str, String str2, C0206dc c0206dc) {
        this.k = c0206dc;
        this.g = t7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C0284i5 c0284i5A = C0284i5.a(networkStorageDir, t7, jSONObject);
        this.h = new zg(context, c0249g4, y4, i2, c0284i5A, networkStorageDir);
        a(context, c0249g4, y4, i2, c0284i5A, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C0249g4 c0249g4, Y4 y4, int i2, C0284i5 c0284i5, String str, String str2, String str3) {
        try {
            v vVarB = b(context, c0249g4, y4, i2, c0284i5, str, str2, str3);
            try {
                this.b = vVarB;
                vVarB.b();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C0421q4.d().a(th2);
                d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C0543x8.a(Sd.d, new C0458s8().a(F5.A, str).a());
        this.c = C0425q8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        T7 t7 = this.g;
        if (t7 != null) {
            t7.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C0441r8(1001, str));
    }

    private com.ironsource.sdk.controller.l.a i() {
        return new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f$0.a(aVar);
            }
        };
    }

    private com.ironsource.sdk.controller.l.b j() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Cb cb) {
                this.f$0.a(cb);
            }
        };
    }

    private void l() {
        Logger.i(this.a, "handleReadyState");
        this.c = C0425q8.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C0425q8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C0425q8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C0425q8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C0249g4 c0249g4, Y4 y4, int i2, C0284i5 c0284i5, String str, String str2, String str3) throws Throwable {
        C0543x8.a(Sd.c);
        v vVar = new v(context, y4, c0249g4, this, this.g, i2, c0284i5, str, i(), j(), str2, str3);
        Z5 z5 = new Z5(context, c0284i5, new Y5(this.g.a()), new Db(c0284i5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c0284i5.a(), z5));
        vVar.a(new C0434r1());
        vVar.a(new A4(context, new C0573z4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Cb cb) {
        com.ironsource.sdk.controller.l.b bVar = this.j.get(cb.d());
        if (bVar != null) {
            bVar.a(cb);
        }
    }

    private void a(Runnable runnable, long j2) {
        T7 t7 = this.g;
        if (t7 != null) {
            t7.d(runnable, j2);
        } else {
            Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C0249g4 c0249g4, final Y4 y4, final int i2, final C0284i5 c0284i5, final String str, final String str2, final String str3) {
        int iH = Ab.U().g().h();
        if (iH > 0) {
            C0543x8.a(Sd.B, new C0458s8().a(F5.y, String.valueOf(iH)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(context, c0249g4, y4, i2, c0284i5, str, str2, str3);
            }
        }, iH);
        this.d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.a, "handleControllerLoaded");
        this.c = C0425q8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C0425q8.c.Web.equals(h())) {
            C0543x8.a(Sd.e, new C0458s8().a(F5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.a, "handleControllerFailed ");
        C0458s8 c0458s8 = new C0458s8();
        c0458s8.a(F5.A, str);
        c0458s8.a(F5.y, String.valueOf(this.h.l()));
        C0543x8.a(Sd.o, c0458s8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C0543x8.a(Sd.y, new C0458s8().a(F5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        this.f.a(new s(x4, map, interfaceC0522w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4) {
        this.f.a(new f(x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC0218e7
    public void a(InterfaceC0148a7 interfaceC0148a7) {
        EnumC0184c7 enumC0184c7B = interfaceC0148a7.b();
        if (enumC0184c7B == EnumC0184c7.SendEvent) {
            C0543x8.a(Sd.A, new C0458s8().a(F5.y, interfaceC0148a7.a() + " : strategy: " + enumC0184c7B).a());
            return;
        }
        if (enumC0184c7B == EnumC0184c7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(interfaceC0148a7.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C0543x8.a(Sd.d, new C0458s8().a(F5.A, interfaceC0148a7.a() + " : strategy: " + enumC0184c7B).a());
            C0543x8.a(Sd.A, new C0458s8().a(F5.y, interfaceC0148a7.a() + " : strategy: " + enumC0184c7B).a());
        }
    }

    private void a(C0425q8.e eVar, X4 x4, String str, String str2) {
        Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C0458s8 c0458s8 = new C0458s8();
        c0458s8.a(F5.w, eVar.toString());
        c0458s8.a(F5.v, x4.f());
        C0543x8.a(Sd.b, c0458s8.a());
        this.h.n();
        a();
        b(new m(str, str2));
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0539x4 interfaceC0539x4) {
        if (this.h.a(h(), this.c)) {
            a(C0425q8.e.RewardedVideo, x4, str, str2);
        }
        this.f.a(new o(str, str2, x4, interfaceC0539x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0539x4 interfaceC0539x4) {
        this.f.a(new p(jSONObject, interfaceC0539x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0522w4 interfaceC0522w4) {
        if (this.h.a(h(), this.c)) {
            a(C0425q8.e.Interstitial, x4, str, str2);
        }
        this.f.a(new q(str, str2, x4, interfaceC0522w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0522w4 interfaceC0522w4) {
        Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC0522w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0522w4 interfaceC0522w4) {
        this.f.a(new a(jSONObject, interfaceC0522w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4) {
        this.f.a(new b(x4, map, interfaceC0522w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC0505v4 interfaceC0505v4) {
        if (this.h.a(h(), this.c)) {
            a(C0425q8.e.Banner, x4, str, str2);
        }
        this.f.a(new c(str, str2, x4, interfaceC0505v4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0505v4 interfaceC0505v4) {
        this.f.a(new d(jSONObject, interfaceC0505v4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4) {
        this.f.a(new RunnableC0067e(x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC0505v4 interfaceC0505v4) {
        this.f.a(new g(x4, map, interfaceC0505v4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    public void a(String str, com.ironsource.sdk.controller.l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        S3 s3 = this.f;
        if (s3 != null) {
            s3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
