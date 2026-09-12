package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0308ja implements InterfaceC0583ze<JSONObject> {
    private final InterfaceC0583ze<String> a;

    public C0308ja(InterfaceC0583ze<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a = serverResponse;
    }

    @Override // com.ironsource.InterfaceC0583ze
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.a.a());
    }
}
