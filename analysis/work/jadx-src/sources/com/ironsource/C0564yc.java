package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0564yc implements InterfaceC0547xc {
    private B2 a;
    private WeakReference<D2> b = new WeakReference<>(null);

    public final void a(B2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerClick() {
        D2 d2 = this.b.get();
        if (d2 != null) {
            d2.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        B2 b2 = this.a;
        if (b2 != null) {
            b2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerLoadSuccess(G9 adInstance, C0270h8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        B2 b2 = this.a;
        if (b2 != null) {
            b2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.InterfaceC0547xc
    public void onBannerShowSuccess() {
        D2 d2 = this.b.get();
        if (d2 != null) {
            d2.onBannerShowSuccess();
        }
    }

    public final void a(D2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
