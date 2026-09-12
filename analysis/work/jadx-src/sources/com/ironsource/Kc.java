package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class Kc extends AbstractC0210e {
    private final String i = Yc.a;

    Kc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC0210e
    public String a() {
        return Yc.a;
    }

    @Override // com.ironsource.AbstractC0210e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC0210e
    public String a(ArrayList<B5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<B5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }
}
