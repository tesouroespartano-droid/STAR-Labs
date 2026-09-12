package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C0421q4;
import com.ironsource.C1;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.Td;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";
    private Context a;

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public q(Context context) {
        this.a = context;
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

    public void b(JSONObject jSONObject, a aVar, InterfaceC0255ga interfaceC0255ga) {
        Td td = new Td();
        try {
            String string = jSONObject.getString(f);
            td.b(f, string);
            if (C1.d(this.a, string)) {
                td.b("status", String.valueOf(C1.c(this.a, string)));
                interfaceC0255ga.a(true, aVar.c, td);
            } else {
                td.b("status", l);
                interfaceC0255ga.a(false, aVar.d, td);
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            td.b("errMsg", e2.getMessage());
            interfaceC0255ga.a(false, aVar.d, td);
        }
    }

    void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        a aVarA = a(str);
        if (c.equals(aVarA.a)) {
            a(aVarA.b, aVarA, interfaceC0255ga);
        } else if (d.equals(aVarA.a)) {
            b(aVarA.b, aVarA, interfaceC0255ga);
        } else {
            Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC0255ga interfaceC0255ga) {
        Td td = new Td();
        try {
            td.a(e, C1.a(this.a, jSONObject.getJSONArray(e)));
            interfaceC0255ga.a(true, aVar.c, td);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            td.b("errMsg", e2.getMessage());
            interfaceC0255ga.a(false, aVar.d, td);
        }
    }
}
