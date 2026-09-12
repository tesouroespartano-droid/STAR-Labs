package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class hu {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static hu f2392;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final hm f2393 = new hm();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final hw f2394 = new hw();

    private hu() {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized hu m2296() {
        if (f2392 == null) {
            f2392 = new hu();
        }
        return f2392;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final hm m2298() {
        return this.f2393;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final hw m2297() {
        return this.f2394;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized void m2295() {
        f2392 = null;
    }
}
