package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0164b5 {
    private static C0164b5 h;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final InterfaceC0576z7 g;

    private C0164b5(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        this.g = interfaceC0576z7I;
        this.a = interfaceC0576z7I.q();
        this.b = interfaceC0576z7I.l();
        this.c = interfaceC0576z7I.f();
        this.d = interfaceC0576z7I.i();
        this.e = interfaceC0576z7I.e();
        this.f = interfaceC0576z7I.u(context);
    }

    public static C0164b5 b(Context context) {
        if (h == null) {
            h = new C0164b5(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public int a() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public float a(Context context) {
        return this.g.E(context);
    }

    public String b() {
        return this.f;
    }
}
