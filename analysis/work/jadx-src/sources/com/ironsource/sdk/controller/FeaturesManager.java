package com.ironsource.sdk.controller;

import com.ironsource.Ab;
import com.ironsource.C0166b7;
import com.ironsource.C0198d4;
import com.ironsource.C0421q4;
import com.ironsource.He;
import com.ironsource.InterfaceC0391o8;
import com.ironsource.Q3;
import com.ironsource.R3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FeaturesManager {
    private static volatile FeaturesManager d = null;
    private static final String e = "debugMode";
    private Map<String, ?> a;
    private final ArrayList<String> b = new a();
    private InterfaceC0391o8 c = Ab.U().t();

    class a extends ArrayList<String> {
        a() {
            add(C0198d4.d.f);
            add(C0198d4.d.e);
            add(C0198d4.d.g);
            add(C0198d4.d.h);
            add(C0198d4.d.i);
            add(C0198d4.d.j);
            add(C0198d4.d.k);
            add(C0198d4.d.l);
            add(C0198d4.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (d == null) {
            synchronized (FeaturesManager.class) {
                if (d == null) {
                    d = new FeaturesManager();
                }
            }
        }
        return d;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C0198d4.a.d) ? networkConfiguration.optJSONObject(C0198d4.a.d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.a.containsKey("debugMode")) {
                num = (Integer) this.a.get("debugMode");
            }
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Q3 getFeatureFlagCatchUrlError() {
        return new Q3(SDKUtils.getNetworkConfiguration().optJSONObject(Q3.a.c));
    }

    public R3 getFeatureFlagClickCheck() {
        return new R3(SDKUtils.getNetworkConfiguration());
    }

    public C0166b7 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.c.a(C0198d4.a.r);
        return jSONObjectA instanceof JSONObject ? new C0166b7(jSONObjectA) : new C0166b7(null);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(C0198d4.a.f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C0198d4.a.e, 0);
        }
        return 0;
    }

    public He getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new He(networkConfiguration.has(C0198d4.a.s) ? networkConfiguration.optJSONObject(C0198d4.a.s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.c.c(C0198d4.a.u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.a = map;
    }
}
