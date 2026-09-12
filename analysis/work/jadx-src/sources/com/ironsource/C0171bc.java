package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0171bc implements InterfaceC0153ac {
    @Override // com.ironsource.InterfaceC0153ac
    public void a(G9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}
