package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class M6 {
    public static final String b = "userId";
    public static final String c = "appKey";
    private static M6 d;
    private final JSONObject a = new JSONObject();

    private M6() {
    }

    public static synchronized M6 a() {
        if (d == null) {
            d = new M6();
        }
        return d;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Ab.U().g().f()) {
            return new JSONObject(this.a.toString());
        }
        return this.a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (Exception e) {
            C0421q4.d().a(e);
        }
    }

    public synchronized String a(String str) {
        return this.a.optString(str);
    }
}
