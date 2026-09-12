package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class B9 {
    private static final int n = 0;
    private ArrayList<InterstitialPlacement> a;
    private H1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private C0402p2 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private InterstitialPlacement m;

    public B9() {
        this.a = new ArrayList<>();
        this.b = new H1();
        this.g = new C0402p2();
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.a.add(interstitialPlacement);
            if (this.m == null) {
                this.m = interstitialPlacement;
            } else if (interstitialPlacement.isPlacementId(0)) {
                this.m = interstitialPlacement;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public C0402p2 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public H1 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }

    public B9(int i, boolean z, int i2, H1 h1, C0402p2 c0402p2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = h1;
        this.g = c0402p2;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public InterstitialPlacement a(String str) {
        for (InterstitialPlacement interstitialPlacement : this.a) {
            if (interstitialPlacement.getPlacementName().equals(str)) {
                return interstitialPlacement;
            }
        }
        return null;
    }

    public InterstitialPlacement a() {
        for (InterstitialPlacement interstitialPlacement : this.a) {
            if (interstitialPlacement.isDefault()) {
                return interstitialPlacement;
            }
        }
        return this.m;
    }
}
