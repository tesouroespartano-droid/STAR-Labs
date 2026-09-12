package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0346le {
    private final C0155ae a;
    private final C0276he b;

    public C0346le(C0155ae error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
        this.b = null;
    }

    public final C0155ae a() {
        return this.a;
    }

    public final C0276he b() {
        return this.b;
    }

    public final boolean c() {
        C0276he c0276he;
        if (this.a == null && (c0276he = this.b) != null) {
            return c0276he.c().p();
        }
        return false;
    }

    public C0346le(C0276he sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.b = sdkInitResponse;
        this.a = null;
    }
}
