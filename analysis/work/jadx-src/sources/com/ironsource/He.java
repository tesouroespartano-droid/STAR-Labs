package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class He {
    private Ie a;

    public He(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = Ie.b.a(config.optInt(C0198d4.a.t, Ie.CurrentlyLoadedAds.b()));
    }

    public final Ie a() {
        return this.a;
    }
}
