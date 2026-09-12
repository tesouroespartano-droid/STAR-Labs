package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Fb {
    public static final a m = new a(null);
    private static final int n = 0;
    private final boolean a;
    private H1 b;
    private int c;
    private long d;
    private boolean e;
    private final ArrayList<Qb> f;
    private Qb g;
    private int h;
    private C0402p2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Fb(int i, long j, boolean z, H1 events, C0402p2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.a = z4;
        this.f = new ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = events;
        this.h = i2;
        this.i = auctionSettings;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(H1 h1) {
        Intrinsics.checkNotNullParameter(h1, "<set-?>");
        this.b = h1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final C0402p2 d() {
        return this.i;
    }

    public final Qb e() {
        for (Qb qb : this.f) {
            if (qb.isDefault()) {
                return qb;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final H1 g() {
        return this.b;
    }

    public final long h() {
        return this.j;
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.a;
    }

    public final boolean k() {
        return this.l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(C0402p2 c0402p2) {
        Intrinsics.checkNotNullParameter(c0402p2, "<set-?>");
        this.i = c0402p2;
    }

    public final void a(Qb qb) {
        if (qb != null) {
            this.f.add(qb);
            if (this.g == null) {
                this.g = qb;
            } else if (qb.getPlacementId() == 0) {
                this.g = qb;
            }
        }
    }

    public final Qb a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        for (Qb qb : this.f) {
            if (Intrinsics.areEqual(qb.getPlacementName(), placementName)) {
                return qb;
            }
        }
        return null;
    }
}
