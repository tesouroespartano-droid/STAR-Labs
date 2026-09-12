package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Bc;
import com.ironsource.C0421q4;
import com.ironsource.C0441r8;
import com.ironsource.C0543x8;
import com.ironsource.C0560y8;
import com.ironsource.G9;
import com.ironsource.H5;
import com.ironsource.K9;
import com.ironsource.Q9;
import com.ironsource.T9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceNetwork {
    static final String a = "IronSourceNetwork";
    private static Q9 b;
    private static List<Bc> c = new ArrayList();
    private static T9 d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            H5 h5A = C0560y8.a(jSONObject);
            if (h5A.a()) {
                C0543x8.a(h5A, C0560y8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Bc bc) {
        T9 t9 = d;
        if (t9 == null) {
            c.add(bc);
        } else if (t9.b()) {
            bc.onSuccess();
        } else {
            bc.onFail(d.a());
        }
    }

    public static synchronized void destroyAd(G9 g9) throws Exception {
        a();
        b.b(g9);
    }

    public static synchronized e getControllerManager() {
        return b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(a, "applicationKey is NULL");
            return;
        }
        if (b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e) {
                C0421q4.d().a(e);
                Logger.e(a, "Failed to init event tracker: " + e.getMessage());
            }
            b = K9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(G9 g9) {
        Q9 q9 = b;
        if (q9 == null) {
            return false;
        }
        return q9.a(g9);
    }

    public static synchronized void loadAd(G9 g9, Map<String, String> map) throws Exception {
        a();
        b.a(g9, map);
    }

    public static synchronized void loadAdView(Activity activity, G9 g9, Map<String, String> map) throws Exception {
        a();
        b.b(activity, g9, map);
    }

    public static void onPause(Activity activity) {
        Q9 q9 = b;
        if (q9 == null) {
            return;
        }
        q9.onPause(activity);
    }

    public static void onResume(Activity activity) {
        Q9 q9 = b;
        if (q9 == null) {
            return;
        }
        q9.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        Q9 q9 = b;
        if (q9 == null) {
            return;
        }
        q9.a(activity);
    }

    public static synchronized void showAd(Activity activity, G9 g9, Map<String, String> map) throws Exception {
        a();
        b.a(activity, g9, map);
    }

    public static synchronized void updateInitFailed(C0441r8 c0441r8) {
        d = new T9(c0441r8);
        Iterator<Bc> it = c.iterator();
        while (it.hasNext()) {
            it.next().onFail(c0441r8);
        }
        c.clear();
    }

    public static synchronized void updateInitSucceeded() {
        d = new T9();
        Iterator<Bc> it = c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
        c.clear();
    }

    private static synchronized void a() throws Exception {
        if (b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
