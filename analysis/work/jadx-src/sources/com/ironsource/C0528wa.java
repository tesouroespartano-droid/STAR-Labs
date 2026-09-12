package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0528wa implements InterfaceC0477ta {
    private final AbstractC0301j3 a;
    private final InterfaceC0494ua b;

    public C0528wa(AbstractC0301j3 legacyStrategy, InterfaceC0494ua listener) {
        Intrinsics.checkNotNullParameter(legacyStrategy, "legacyStrategy");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = legacyStrategy;
        this.b = listener;
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void a(InterfaceC0494ua listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void b() {
        this.a.b();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void c() {
        this.a.c();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void d() {
        this.a.d();
    }

    @Override // com.ironsource.InterfaceC0477ta
    public void e() {
        this.a.e();
    }
}
