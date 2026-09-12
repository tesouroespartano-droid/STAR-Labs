package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.Ab;
import com.ironsource.C0198d4;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.InterfaceC0576z7;
import com.ironsource.Td;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";
    private Context a;
    private final InterfaceC0576z7 b = Ab.U().i();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public i(Context context) {
        this.a = context;
    }

    void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        a aVarA = a(str);
        if (d.equals(aVarA.a)) {
            interfaceC0255ga.a(true, aVarA.c, a());
        } else {
            Logger.i(c, "unhandled API request " + str);
        }
    }

    private Td a() {
        Td td = new Td();
        td.b(SDKUtils.encodeString(C0198d4.j.i0), SDKUtils.encodeString(String.valueOf(this.b.j())));
        td.b(SDKUtils.encodeString(C0198d4.j.j0), SDKUtils.encodeString(String.valueOf(this.b.q(this.a))));
        td.b(SDKUtils.encodeString(C0198d4.j.k0), SDKUtils.encodeString(String.valueOf(this.b.C(this.a))));
        td.b(SDKUtils.encodeString(C0198d4.j.l0), SDKUtils.encodeString(String.valueOf(this.b.D(this.a))));
        td.b(SDKUtils.encodeString(C0198d4.j.m0), SDKUtils.encodeString(String.valueOf(this.b.e(this.a))));
        td.b(SDKUtils.encodeString(C0198d4.j.n0), SDKUtils.encodeString(String.valueOf(this.b.h(this.a))));
        return td;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.a = jSONObject.optString(e);
        aVar.b = jSONObject.optJSONObject(f);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
