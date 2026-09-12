package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A5 implements InterfaceC0411pb {
    private final RewardedAdRequest a;
    private final Ed b;
    private final InterfaceC0401p1 c;
    private final IronSourceError d;

    public A5(RewardedAdRequest adRequest, Ed adLoadTaskListener, InterfaceC0401p1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0411pb
    public void start() {
        C0506v5 c0506v5 = new C0506v5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c0506v5.a();
        c0506v5.a(this.d);
        this.b.onAdLoadFailed(this.d);
    }
}
