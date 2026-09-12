package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements InterfaceC0286i7, InterfaceC0286i7.a {
    private final Map<IronSource.AD_UNIT, AtomicBoolean> a = MapsKt.mapOf(TuplesKt.to(IronSource.AD_UNIT.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.to(IronSource.AD_UNIT.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.to(IronSource.AD_UNIT.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC0286i7.a
    public void a(IronSource.AD_UNIT adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC0286i7
    public boolean a(IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
