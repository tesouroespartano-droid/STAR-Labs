package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0257gc {
    private final Re a;
    private final String b;
    private final U7 c;
    private final String d;

    public C0257gc(Re recordType, String advertiserBundleId, U7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    public final String a() {
        return this.d;
    }

    public final U7 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final Re d() {
        return this.a;
    }

    public final C0229f1 a(InterfaceC0580zb<C0257gc, C0229f1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
