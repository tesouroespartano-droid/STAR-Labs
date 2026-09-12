package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 {
    private final long a;

    public H0(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H0) && this.a == ((H0) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.a + ")";
    }

    public final H0 a(long j) {
        return new H0(j);
    }

    public static /* synthetic */ H0 a(H0 h0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = h0.a;
        }
        return h0.a(j);
    }
}
