package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0374n8 implements InterfaceC0142a1 {
    private static final String b = "n8";
    private static C0374n8 c;
    private final Map<String, H8> a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    class a implements Runnable {
        final /* synthetic */ C0357m8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(C0357m8 c0357m8, Context context, String str) {
            this.a = c0357m8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0374n8.this.a.put(this.c, new C0270h8(this.a, this.b));
        }
    }

    public static synchronized C0374n8 a() {
        if (c == null) {
            c = new C0374n8();
        }
        return c;
    }

    private C0236f8 b(JSONObject jSONObject) {
        C0236f8 c0236f8 = new C0236f8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c0236f8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C0198d4.i.s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        H8 h8 = this.a.get(string);
        if (h8 != null) {
            h8.c(jSONObject, str, str2);
        }
    }

    private C0236f8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C0198d4.i.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C0236f8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C0421q4.d().a(e);
            return new C0236f8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                String string2 = jSONObject.getString(C0198d4.i.v0);
                if (h8 != null) {
                    h8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                this.a.remove(string);
                if (h8 != null) {
                    h8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC0287i8 interfaceC0287i8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C0236f8 c0236f8B = b(jSONObject);
            if (!this.a.containsKey(string)) {
                C0357m8 c0357m8 = new C0357m8(interfaceC0287i8, context, string, c0236f8B);
                c0357m8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c0357m8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    T7.a.d(new a(c0357m8, context, string));
                    return;
                } else {
                    this.a.put(string, c0357m8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC0142a1
    public H8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                if (h8 != null) {
                    h8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
