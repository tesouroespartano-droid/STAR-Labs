package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0284i5 implements A7 {
    private static final int e = 5;
    private static C0284i5 f;
    private HandlerC0267h5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C0284i5(String str, T7 t7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC0267h5(t7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C0284i5 a(String str, T7 t7, JSONObject jSONObject) {
        if (f == null) {
            f = new C0284i5(str, t7, jSONObject);
        }
        return f;
    }

    private Thread b(C0577z8 c0577z8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.b.optBoolean(C0232f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C0233f5(c0577z8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), zOptBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC0267h5 handlerC0267h5 = this.a;
        if (handlerC0267h5 != null) {
            handlerC0267h5.a();
            this.a = null;
        }
    }

    @Override // com.ironsource.A7
    public void a(Dc dc) {
        this.a.a(dc);
    }

    private Thread a(C0233f5 c0233f5, Handler handler) {
        return new Thread(new RunnableC0209df(c0233f5, handler));
    }

    @Override // com.ironsource.A7
    public void a(C0577z8 c0577z8, String str, int i, int i2, Handler handler) {
        b(c0577z8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.A7
    public void a(C0577z8 c0577z8, String str, int i, int i2) {
        b(c0577z8, str, i, i2, this.a).start();
    }

    @Override // com.ironsource.A7
    public void a(C0577z8 c0577z8, String str) {
        int iOptInt = this.b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.b.optBoolean(C0232f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C0233f5(c0577z8, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.a);
        this.c = threadA;
        threadA.start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, C0232f4.D);
    }

    public String a() {
        return this.d;
    }
}
