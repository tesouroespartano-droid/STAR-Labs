package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ag;
import com.ironsource.C0374n8;
import com.ironsource.C0421q4;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.InterfaceC0287i8;
import com.ironsource.Td;
import com.ironsource.lg;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a implements InterfaceC0287i8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";
    private Ag a;
    private C0374n8 b = C0374n8.a();
    private Context c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C0065a {
        String a;
        JSONObject b;
        String c;
        String d;

        private C0065a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    public void a(Ag ag) {
        this.a = ag;
    }

    @Override // com.ironsource.InterfaceC0287i8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC0287i8
    public void a(String str, String str2, String str3) {
        a(str, lg.a(str2, str3));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(String str, InterfaceC0255ga interfaceC0255ga) throws Exception {
        a aVar;
        byte b;
        C0065a c0065aA = a(str);
        Td td = new Td();
        try {
            String str2 = c0065aA.a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (!str2.equals(f)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 691453791:
                    if (!str2.equals("sendMessage")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 842351363:
                    if (!str2.equals("loadWithUrl")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1182065477:
                    if (!str2.equals("handleGetViewVisibility")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1491535759:
                    if (!str2.equals(g)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                aVar = this;
                try {
                    this.b.a(aVar, c0065aA.b, this.c, c0065aA.c, c0065aA.d);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    C0421q4.d().a(e);
                    td.b("errMsg", e.getMessage());
                    String strC = aVar.b.c(c0065aA.b);
                    if (!TextUtils.isEmpty(strC)) {
                        td.b("adViewId", strC);
                    }
                    interfaceC0255ga.a(false, c0065aA.d, td);
                    return;
                }
            }
            if (b == 1) {
                this.b.d(c0065aA.b, c0065aA.c, c0065aA.d);
                return;
            }
            if (b == 2) {
                this.b.c(c0065aA.b, c0065aA.c, c0065aA.d);
            } else if (b != 3) {
                if (b != 4) {
                    throw new IllegalArgumentException(String.format(n, c0065aA.a));
                }
                this.b.b(c0065aA.b, c0065aA.c, c0065aA.d);
            } else {
                this.b.a(c0065aA.b, c0065aA.c, c0065aA.d);
            }
        } catch (Exception e3) {
            e = e3;
            aVar = this;
        }
    }

    private C0065a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C0065a c0065a = new C0065a();
        c0065a.a = jSONObject.optString("functionName");
        c0065a.b = jSONObject.optJSONObject("functionParams");
        c0065a.c = jSONObject.optString("success");
        c0065a.d = jSONObject.optString("fail");
        return c0065a;
    }
}
