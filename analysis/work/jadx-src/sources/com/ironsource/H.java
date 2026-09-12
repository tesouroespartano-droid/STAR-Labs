package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class H {
    private C0400p0.a a;

    public H(C0400p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.a = performance;
    }

    public final C0400p0.a a() {
        return this.a;
    }

    public final C0400p0.a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.a == ((H) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.a + ")";
    }

    public final H a(C0400p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new H(performance);
    }

    public final void b(C0400p0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.a = aVar;
    }

    public static /* synthetic */ H a(H h, C0400p0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = h.a;
        }
        return h.a(aVar);
    }
}
