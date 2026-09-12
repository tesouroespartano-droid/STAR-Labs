package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Xf {
    private final InterfaceC0454s4 a;

    public Xf(InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long jA = this.a.a();
        return j2 <= 0 || j <= 0 || jA < j || jA - j > j2;
    }
}
