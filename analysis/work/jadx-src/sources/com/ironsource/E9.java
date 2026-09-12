package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class E9 implements InterfaceC0307j9 {
    private final C0160b1 a;
    private final B9 b;

    public E9(C0160b1 adapterConfig, B9 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC0178c1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC0466t
    public long b() {
        return this.b.e();
    }

    @Override // com.ironsource.InterfaceC0178c1
    public String c() {
        String strF = this.a.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC0178c1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC0178c1
    public String e() {
        String strA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC0178c1
    public EnumC0341l9 f() {
        return EnumC0341l9.b.a(this.a.d());
    }
}
