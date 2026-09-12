package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class V2 {
    private static final int p = 0;
    private H1 a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList<C0282i3> e;
    private C0282i3 f;
    private int g;
    private int h;
    private C0402p2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public V2() {
        this.a = new H1();
        this.e = new ArrayList<>();
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public C0402p2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public H1 g() {
        return this.a;
    }

    public int h() {
        return this.g;
    }

    public C0282i3 i() {
        for (C0282i3 c0282i3 : this.e) {
            if (c0282i3.isDefault()) {
                return c0282i3;
            }
        }
        C0282i3 c0282i4 = this.f;
        return c0282i4 != null ? c0282i4 : new C0371n5();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + '}';
    }

    public void a(C0282i3 c0282i3) {
        if (c0282i3 != null) {
            this.e.add(c0282i3);
            if (this.f == null) {
                this.f = c0282i3;
            } else if (c0282i3.isPlacementId(0)) {
                this.f = c0282i3;
            }
        }
    }

    public V2(int i, long j, boolean z, H1 h1, int i2, C0402p2 c0402p2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.a = h1;
        this.g = i2;
        this.h = i3;
        this.i = c0402p2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public C0282i3 a(String str) {
        for (C0282i3 c0282i3 : this.e) {
            if (c0282i3.getPlacementName().equals(str)) {
                return c0282i3;
            }
        }
        return null;
    }
}
