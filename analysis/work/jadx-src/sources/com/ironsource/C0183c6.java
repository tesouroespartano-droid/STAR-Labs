package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0183c6 implements InterfaceC0187ca {
    private final Ce a;
    private long b;

    public C0183c6(InterfaceC0339l7 applicationLifecycleService, Ce task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC0187ca
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.InterfaceC0187ca
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC0187ca
    public void c() {
    }

    @Override // com.ironsource.InterfaceC0187ca
    public void d() {
    }
}
