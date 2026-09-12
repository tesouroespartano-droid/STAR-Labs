package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class Yd {
    private final C0276he a;

    public Yd(C0276he sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.a = sdkInitResponse;
    }

    public final K1 a() {
        return this.a.a().b().c();
    }

    public final D1 b() {
        return this.a.a().b().b();
    }

    public final P5 c() {
        return this.a.b();
    }

    public final Ae d() {
        return this.a.c();
    }

    public final C0495ub e() {
        return this.a.a().b().e();
    }

    public final Ae.a f() {
        Ae.a aVarH = this.a.c().h();
        Intrinsics.checkNotNullExpressionValue(aVarH, "sdkInitResponse.fullResponse.origin");
        return aVarH;
    }

    protected final C0276he g() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Yd(Yd sdkConfig) {
        this(sdkConfig.a);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
