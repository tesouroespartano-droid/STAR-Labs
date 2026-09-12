package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0186c9 {
    public static final C0186c9 a = new C0186c9();

    private C0186c9() {
    }

    @JvmStatic
    public static final JSONObject a() throws JSONException {
        new P9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectPut = new JSONObject().put("data", IronSourceAES.encode(C0388o5.b().c(), new C0168b9().a().toString()));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return jSONObjectPut;
    }
}
