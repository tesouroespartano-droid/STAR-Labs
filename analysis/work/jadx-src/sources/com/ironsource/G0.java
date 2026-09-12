package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 implements Ue<JSONObject>, Se<E0> {
    private final Map<String, C0294ic> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC0252g7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(Te mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C0294ic> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(StringsKt.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), jSONObjectA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.Se
    public void a(E0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strD = record.d();
        Map<String, C0294ic> map = this.a;
        C0294ic c0294ic = map.get(strD);
        if (c0294ic == null) {
            c0294ic = new C0294ic();
            map.put(strD, c0294ic);
        }
        c0294ic.a(record.a(new F0()));
    }
}
