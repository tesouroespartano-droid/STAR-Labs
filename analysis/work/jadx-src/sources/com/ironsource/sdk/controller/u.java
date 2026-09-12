package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C0206dc;
import com.ironsource.C0421q4;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.Pf;
import com.ironsource.Td;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C0206dc a = new C0206dc();
    private Pf c = new Pf();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public u(Context context) {
        this.b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }

    void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        a aVarA = a(str);
        if (e.equals(aVarA.a)) {
            a(aVarA.b, aVarA, interfaceC0255ga);
        } else if (f.equals(aVarA.a)) {
            a(aVarA, interfaceC0255ga);
        } else {
            Logger.i(d, "unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC0255ga interfaceC0255ga) {
        Td td = new Td();
        try {
            this.a.a(jSONObject);
            interfaceC0255ga.a(true, aVar.c, td);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC0255ga.a(false, aVar.d, td);
        }
    }

    private void a(a aVar, InterfaceC0255ga interfaceC0255ga) {
        try {
            JSONObject jSONObjectA = this.c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC0255ga.a(true, aVar.c, jSONObjectA);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            interfaceC0255ga.a(false, aVar.d, e2.getMessage());
        }
    }
}
