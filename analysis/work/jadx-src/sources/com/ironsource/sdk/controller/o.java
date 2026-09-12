package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C0421q4;
import com.ironsource.C0513vc;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.Td;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    private static final String c = "o";
    private static final String d = "activate";
    private static final String e = "startSession";
    private static final String f = "finishSession";
    private static final String g = "impressionOccurred";
    private static final String h = "getOmidData";
    private static final String i = "omidFunction";
    private static final String j = "omidParams";
    private static final String k = "success";
    private static final String l = "fail";
    private static final String m = "%s | unsupported OMID API";
    private final Context a;
    private final C0513vc b = new C0513vc();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public o(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        byte b;
        a aVarA = a(str);
        Td td = new Td();
        JSONObject jSONObject = aVarA.b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                td.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (!str2.equals(d)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -984459207:
                    if (!str2.equals(h)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 70701699:
                    if (!str2.equals(f)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1208109646:
                    if (!str2.equals(g)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1850541012:
                    if (!str2.equals(e)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                this.b.a(this.a);
                td = this.b.a();
            } else if (b == 1) {
                this.b.d(aVarA.b);
            } else if (b == 2) {
                this.b.b(aVarA.b);
            } else if (b == 3) {
                this.b.c(aVarA.b);
            } else {
                if (b != 4) {
                    throw new IllegalArgumentException(String.format(m, aVarA.a));
                }
                td = this.b.a();
            }
            interfaceC0255ga.a(true, aVarA.c, td);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            td.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + aVarA.a + " Exception: " + e2.getMessage());
            interfaceC0255ga.a(false, aVarA.d, td);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.a = jSONObject.optString(i);
        aVar.b = jSONObject.optJSONObject(j);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
