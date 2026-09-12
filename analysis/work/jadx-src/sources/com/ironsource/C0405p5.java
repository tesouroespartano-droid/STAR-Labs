package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0405p5 implements InterfaceC0580zb<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.InterfaceC0580zb
    public com.ironsource.mediationsdk.d.a a(String input) throws JSONException {
        Intrinsics.checkNotNullParameter(input, "input");
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
