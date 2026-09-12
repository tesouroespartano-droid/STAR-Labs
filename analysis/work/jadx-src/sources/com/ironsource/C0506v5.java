package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0506v5 {
    private final InterfaceC0401p1 a;

    public C0506v5(InterfaceC0401p1 analytics, String adRequestAdId, InterfaceC0362md adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.a = analytics;
        analytics.a(new C0333l1.s(adRequestProviderName.value()), new C0333l1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC0280i1.c.a.a().a(this.a);
    }

    public final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC0280i1.c.a.a(new C0333l1.j(error.getErrorCode()), new C0333l1.k(error.getErrorMessage()), new C0333l1.f(0L)).a(this.a);
    }
}
