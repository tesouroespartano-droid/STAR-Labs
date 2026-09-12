package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final class Pa implements InterfaceC0335l3, P2 {
    private final InterfaceC0494ua a;

    public Pa(InterfaceC0494ua listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    public void a() {
        this.a.onAdLeftApplication();
    }

    public void b() {
        this.a.n();
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void c(C0450s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.a.onAdLoaded(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void e(IronSourceError ironSourceError) {
        this.a.d(ironSourceError);
    }

    @Override // com.ironsource.J0
    public void g() {
        this.a.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void h() {
        this.a.k();
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit i() {
        a();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit j() {
        c();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ Unit m() {
        b();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC0335l3
    public void c(IronSourceError ironSourceError) {
        this.a.onAdLoadFailed(ironSourceError);
    }

    public void c() {
        this.a.l();
    }
}
