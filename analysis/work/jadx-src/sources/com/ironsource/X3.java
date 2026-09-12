package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X3 implements InterfaceC0491u7 {
    private InterfaceC0474t7 a;

    protected X3(JSONObject jSONObject, Context context) {
        this.a = a(jSONObject, context);
        Logger.i("X3", "created ConnectivityAdapter with strategy " + this.a.getClass().getSimpleName());
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    @Override // com.ironsource.InterfaceC0491u7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC0491u7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.a.b(context);
    }

    @Override // com.ironsource.InterfaceC0491u7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.a.a(context);
    }

    public void b() {
        this.a.a();
    }

    private InterfaceC0474t7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C0198d4.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (C1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new Xb(this);
        }
        return new BroadcastReceiverStrategy(this);
    }
}
