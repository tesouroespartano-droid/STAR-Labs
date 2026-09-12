package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0540x5 implements InterfaceC0411pb {
    private final IronSourceError a;
    private final C0231f3 b;
    private final InterfaceC0401p1 c;

    public C0540x5(IronSourceError error, C0231f3 adLoadTaskListener, InterfaceC0401p1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC0411pb
    public void start() {
        InterfaceC0280i1.c.a aVar = InterfaceC0280i1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C0333l1.j(this.a.getErrorCode()), new C0333l1.k(this.a.getErrorMessage()), new C0333l1.f(0L)).a(this.c);
        this.b.onAdLoadFailed(this.a);
    }
}
