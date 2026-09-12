package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0179c2 {
    private final P6.a a;
    private final ArrayList<String> b = new ArrayList<>(new C0143a2().a());
    private final R6 c = new R6();

    public C0179c2(P6.a aVar) {
        this.a = aVar;
    }

    public final JSONObject a() {
        P6.a aVar = this.a;
        JSONObject jSONObjectA = aVar != null ? this.c.a(this.b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = S6.b(jSONObject.optJSONObject(P6.u));
        if (jSONObjectB != null) {
            jSONObject.put(P6.u, jSONObjectB);
        }
        return jSONObject;
    }
}
