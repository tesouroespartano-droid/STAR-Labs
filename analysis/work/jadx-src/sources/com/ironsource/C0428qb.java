package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0428qb {
    private final EnumC0341l9 a;
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public C0428qb(EnumC0341l9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final EnumC0341l9 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428qb)) {
            return false;
        }
        C0428qb c0428qb = (C0428qb) obj;
        return this.a == c0428qb.a && Intrinsics.areEqual(this.b, c0428qb.b) && this.c == c0428qb.c && this.d == c0428qb.d && this.e == c0428qb.e;
    }

    public final String f() {
        return this.b;
    }

    public final EnumC0341l9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.e;
        return i + (z2 ? 1 : z2);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final C0428qb a(EnumC0341l9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new C0428qb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ C0428qb a(C0428qb c0428qb, EnumC0341l9 enumC0341l9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC0341l9 = c0428qb.a;
        }
        if ((i & 2) != 0) {
            str = c0428qb.b;
        }
        if ((i & 4) != 0) {
            j = c0428qb.c;
        }
        if ((i & 8) != 0) {
            z = c0428qb.d;
        }
        if ((i & 16) != 0) {
            z2 = c0428qb.e;
        }
        long j2 = j;
        return c0428qb.a(enumC0341l9, str, j2, z, z2);
    }

    public /* synthetic */ C0428qb(EnumC0341l9 enumC0341l9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC0341l9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
