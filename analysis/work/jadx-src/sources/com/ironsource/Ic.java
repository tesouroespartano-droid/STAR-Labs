package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class Ic {
    private final boolean a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Ic() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ic)) {
            return false;
        }
        Ic ic = (Ic) obj;
        return this.a == ic.a && this.b == ic.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ")";
    }

    public Ic(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final Ic a(boolean z, int i) {
        return new Ic(z, i);
    }

    public static /* synthetic */ Ic a(Ic ic, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ic.a;
        }
        if ((i2 & 2) != 0) {
            i = ic.b;
        }
        return ic.a(z, i);
    }

    public /* synthetic */ Ic(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }
}
