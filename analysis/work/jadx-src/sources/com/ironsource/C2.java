package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 implements I {
    private final eg a;

    public C2(eg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.a = viewBinder;
    }

    @Override // com.ironsource.I
    public void a(C0554y2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.a);
    }
}
