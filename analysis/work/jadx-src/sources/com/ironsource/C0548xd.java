package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0548xd implements InterfaceC0177c0<RewardedAd> {
    private final InterfaceC0401p1 a;
    private final Executor b;

    public C0548xd(InterfaceC0401p1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC0177c0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(G9 adInstance, W1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new Ad(adInstance, new C0159b0(new C0429qc()), auctionDataReporter, this.a, null, null, null, null, C0565yd.a, 240, null));
    }
}
