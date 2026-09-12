package com.ironsource.sdk.controller;

import com.ironsource.C0198d4;
import com.ironsource.C0284i5;
import com.ironsource.C0421q4;
import com.ironsource.C0458s8;
import com.ironsource.C0543x8;
import com.ironsource.C0577z8;
import com.ironsource.F5;
import com.ironsource.Sd;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC0066d d = EnumC0066d.NONE;
    private String e;
    private String f;
    private C0284i5 g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(C0198d4.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0066d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        EnumC0066d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, C0284i5 c0284i5) {
        int iOptInt = jSONObject.optInt(C0198d4.a.j, -1);
        this.b = iOptInt;
        this.c = a(iOptInt);
        this.e = str;
        this.f = str2;
        this.g = c0284i5;
    }

    private c a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C0577z8 c0577z8G = g();
            if (c0577z8G.exists()) {
                C0577z8 c0577z8H = h();
                if (c0577z8H.exists()) {
                    c0577z8H.delete();
                }
                IronSourceStorageUtils.renameFile(c0577z8G.getPath(), c0577z8H.getPath());
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C0577z8 h() {
        return new C0577z8(this.e, "fallback_mobileController.html");
    }

    private C0577z8 i() {
        return new C0577z8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C0458s8 c0458s8A = new C0458s8().a(F5.y, Integer.valueOf(this.b));
        if (this.a > 0) {
            c0458s8A.a(F5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C0543x8.a(Sd.x, c0458s8A.a());
    }

    JSONObject f() throws JSONException {
        return new a();
    }

    C0577z8 g() {
        return new C0577z8(this.e, C0198d4.f);
    }

    boolean k() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new C0577z8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new C0577z8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                C0577z8 c0577z8G = g();
                C0577z8 c0577z8I = i();
                if (!c0577z8I.exists() && !c0577z8G.exists()) {
                    a(new C0577z8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!c0577z8I.exists() && c0577z8G.exists()) {
                    EnumC0066d enumC0066d = EnumC0066d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC0066d;
                    a(enumC0066d);
                    a(new C0577z8(this.e, c0577z8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0066d enumC0066d2 = EnumC0066d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC0066d2;
                    a(enumC0066d2);
                    d();
                    a(new C0577z8(this.e, c0577z8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C0577z8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC0066d enumC0066d3 = EnumC0066d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC0066d3;
                a(enumC0066d3);
                a(new C0577z8(this.e, c0577z8I.getName()));
                return true;
            } catch (Exception e) {
                C0421q4.d().a(e);
            }
        }
        return false;
    }

    boolean m() {
        return this.d != EnumC0066d.NONE;
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0066d enumC0066d = EnumC0066d.CONTROLLER_FROM_SERVER;
        this.d = enumC0066d;
        a(enumC0066d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0066d enumC0066d = EnumC0066d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0066d;
            a(enumC0066d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C0577z8 c0577z8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c0577z8, this.f);
    }

    void a(C0458s8 c0458s8) {
        c0458s8.a(F5.y, Integer.valueOf(this.b));
        C0543x8.a(Sd.v, c0458s8.a());
        this.a = System.currentTimeMillis();
    }

    private void a(EnumC0066d enumC0066d) {
        C0458s8 c0458s8A = new C0458s8().a(F5.y, Integer.valueOf(this.b)).a(F5.z, Integer.valueOf(enumC0066d.b()));
        if (this.a > 0) {
            c0458s8A.a(F5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C0543x8.a(Sd.w, c0458s8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C0421q4.d().a(e);
            return false;
        }
    }
}
