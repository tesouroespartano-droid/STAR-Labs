package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0365n extends I5 {
    private final IronSource.AD_UNIT a;
    private final UUID b;
    private final String c;

    public C0365n(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a0) {
        return a(new C0228f0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}
