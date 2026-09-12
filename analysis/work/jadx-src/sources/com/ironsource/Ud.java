package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface Ud {
    void a(Activity activity);

    void a(String str, String str2, int i);

    void a(String str, String str2, String str3, Map<String, String> map, Ec ec);

    void a(String str, String str2, String str3, Map<String, String> map, InterfaceC0581zc interfaceC0581zc);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
