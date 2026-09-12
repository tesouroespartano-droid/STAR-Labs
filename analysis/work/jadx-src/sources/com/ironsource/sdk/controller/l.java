package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C0425q8;
import com.ironsource.Cb;
import com.ironsource.InterfaceC0505v4;
import com.ironsource.InterfaceC0522w4;
import com.ironsource.InterfaceC0539x4;
import com.ironsource.X4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(Cb cb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(X4 x4);

    void a(X4 x4, Map<String, String> map, InterfaceC0505v4 interfaceC0505v4);

    void a(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC0522w4 interfaceC0522w4);

    void a(String str, String str2, X4 x4, InterfaceC0505v4 interfaceC0505v4);

    void a(String str, String str2, X4 x4, InterfaceC0522w4 interfaceC0522w4);

    void a(String str, String str2, X4 x4, InterfaceC0539x4 interfaceC0539x4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC0505v4 interfaceC0505v4);

    void a(JSONObject jSONObject, InterfaceC0522w4 interfaceC0522w4);

    void a(JSONObject jSONObject, InterfaceC0539x4 interfaceC0539x4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(X4 x4);

    void b(X4 x4, Map<String, String> map, InterfaceC0522w4 interfaceC0522w4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C0425q8.c h();
}
