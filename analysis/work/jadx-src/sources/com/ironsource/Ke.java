package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ke {
    private final N a;

    public Ke(N n) {
        this.a = n;
    }

    public final N a() {
        return this.a;
    }

    public abstract Re b();

    public final C0483u a(InterfaceC0580zb<Ke, C0483u> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
