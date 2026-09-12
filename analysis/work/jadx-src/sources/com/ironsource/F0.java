package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 implements InterfaceC0580zb<E0, C0257gc> {
    @Override // com.ironsource.InterfaceC0580zb
    public C0257gc a(E0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C0257gc(input.e(), input.c(), input.b(), input.a());
    }
}
