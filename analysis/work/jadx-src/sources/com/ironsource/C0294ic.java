package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0294ic implements Ue<JSONObject>, Se<C0257gc> {
    private final Map<String, C0246g1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC0252g7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(Te mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C0246g1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.Se
    public void a(C0257gc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, C0246g1> map = this.a;
        C0246g1 c0246g1 = map.get(strC);
        if (c0246g1 == null) {
            c0246g1 = new C0246g1();
            map.put(strC, c0246g1);
        }
        c0246g1.a(record.a(new C0274hc()));
    }
}
