package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class T6 {
    private static final String a = "adunit_data";

    public void a(String str, Object obj) {
        Q6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        Q6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        Q6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        Q6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        Q6.b().c(context);
    }

    public void a(String str, Object obj, P6.a aVar) {
        try {
            String strName = aVar.name();
            Q6 q6B = Q6.b();
            JSONObject jSONObjectOptJSONObject = q6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (jSONObjectOptJSONObject == null) {
                q6B.b(a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                q6B.b(a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                q6B.b(a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C0421q4.d().a(e);
        }
    }

    public void a(String str, P6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            Q6 q6B = Q6.b();
            JSONObject jSONObjectOptJSONObject2 = q6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            q6B.b(a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e) {
            C0421q4.d().a(e);
        }
    }
}
