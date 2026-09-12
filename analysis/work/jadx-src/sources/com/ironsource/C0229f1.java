package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0229f1 {
    private final Re a;
    private final U7 b;
    private final String c;
    private final long d;

    public C0229f1(Re recordType, U7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    public final String a() {
        return this.c;
    }

    public final U7 b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(C0376na.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)));
    }

    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to(C0376na.b, this.c), TuplesKt.to(C0376na.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)), TuplesKt.to("rt", Integer.valueOf(this.a.ordinal())));
    }

    public final Re e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
