package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0399p {
    private final Boolean a;

    public C0399p(JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.a = adFormatAuctionSettings.has(C0416q.a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(C0416q.a)) : null;
    }

    public final Boolean a() {
        return this.a;
    }
}
