package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Md {
    private static final int o = 0;
    private ArrayList<Placement> a;
    private H1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Placement l;
    private C0402p2 m;
    private boolean n;

    public Md() {
        this.a = new ArrayList<>();
        this.b = new H1();
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.a.add(placement);
            if (this.l == null) {
                this.l = placement;
            } else if (placement.isPlacementId(0)) {
                this.l = placement;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public ArrayList<Placement> e() {
        return this.a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public C0402p2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public H1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }

    public Md(int i, boolean z, int i2, int i3, H1 h1, C0402p2 c0402p2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = h1;
        this.f = i3;
        this.m = c0402p2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public Placement a(String str) {
        for (Placement placement : this.a) {
            if (placement.getPlacementName().equals(str)) {
                return placement;
            }
        }
        return null;
    }

    public Placement a() {
        for (Placement placement : this.a) {
            if (placement.isDefault()) {
                return placement;
            }
        }
        return this.l;
    }
}
