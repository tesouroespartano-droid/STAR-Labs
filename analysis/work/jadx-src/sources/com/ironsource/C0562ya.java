package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0562ya {
    private final long a;
    private final long b;
    private final boolean c;

    public C0562ya(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0562ya)) {
            return false;
        }
        C0562ya c0562ya = (C0562ya) obj;
        return this.a == c0562ya.a && this.b == c0562ya.b && this.c == c0562ya.c;
    }

    public final boolean f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.a + ", visibilityCheckerInterval=" + this.b + ", isAutoRefreshEnabled=" + this.c + ")";
    }

    public final C0562ya a(long j, long j2, boolean z) {
        return new C0562ya(j, j2, z);
    }

    public static /* synthetic */ C0562ya a(C0562ya c0562ya, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c0562ya.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = c0562ya.b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = c0562ya.c;
        }
        return c0562ya.a(j3, j4, z);
    }
}
