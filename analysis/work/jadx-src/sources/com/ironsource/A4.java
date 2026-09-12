package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class A4 {
    private static final String c = "A4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C0573z4 b;

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public A4(Context context, C0573z4 c0573z4) {
        this.a = context;
        this.b = c0573z4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC0255ga interfaceC0255ga) {
        Td td = new Td();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC0556y4.a(jSONObject.optString("source")), jSONObject.optString(C0198d4.i.W), jSONObject.optString("data"));
        interfaceC0255ga.a(true, aVar.c, td);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    public void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        byte b;
        a aVarA = a(str);
        try {
            String str2 = aVarA.a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(d)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(e)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                b(this.a, aVarA, interfaceC0255ga);
            } else {
                if (b == 1) {
                    a(this.a, aVarA, interfaceC0255ga);
                    return;
                }
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e2) {
            a(aVarA, interfaceC0255ga, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC0255ga interfaceC0255ga) {
        Td td = new Td();
        JSONObject jSONObject = aVar.b;
        td.b("data", this.b.a(context, EnumC0556y4.a(jSONObject.optString("source")), jSONObject.optString(C0198d4.i.W)));
        interfaceC0255ga.a(true, aVar.c, td);
    }

    private void a(a aVar, InterfaceC0255ga interfaceC0255ga, Exception exc) {
        C0421q4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        Td td = new Td();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        td.b("error", message);
        interfaceC0255ga.a(false, aVar.d, td);
    }
}
