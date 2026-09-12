package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0444rb implements U5<C0428qb> {
    private final String a;
    private final InterfaceC0362md b;
    private final InterfaceC0195d1 c;
    private final boolean d;

    public C0444rb(String adm, InterfaceC0362md providerName, InterfaceC0195d1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.U5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0428qb a() throws Exception {
        InterfaceC0307j9 interfaceC0307j9A = this.c.a(this.b);
        new S(this.a, interfaceC0307j9A, this.d).a();
        if (interfaceC0307j9A != null) {
            return new C0428qb(interfaceC0307j9A.f(), interfaceC0307j9A.e(), interfaceC0307j9A.b(), interfaceC0307j9A.d(), false, 16, null);
        }
        return null;
    }
}
