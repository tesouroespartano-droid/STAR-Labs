package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class R9 {
    static String a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        return jSONObject.optBoolean("rewarded") ? a + jSONObject.optString("name") : jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(G9 g9) {
        if (g9.i()) {
            return C0425q8.e.Banner.toString();
        }
        if (g9.n()) {
            return C0425q8.e.RewardedVideo.toString();
        }
        return C0425q8.e.Interstitial.toString();
    }
}
