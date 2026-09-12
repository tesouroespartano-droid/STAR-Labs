package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0560y8 {
    public static C0509v8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C0509v8.a aVar = new C0509v8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    public static H5 a(JSONObject jSONObject) {
        return new H5.a(jSONObject.optString(F5.r)).b().b(jSONObject.optBoolean("enabled")).a(new C0526w8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", F5.L));
        arrayList.add(new Pair<>(F5.M, F5.N));
        return arrayList;
    }

    public static boolean a(X4 x4) {
        if (x4 == null || x4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(x4.g().get("inAppBidding"));
    }

    public static C0425q8.e a(X4 x4, C0425q8.e eVar) {
        if (x4 == null || x4.g() == null || x4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(x4.g().get("rewarded"))) {
            return C0425q8.e.RewardedVideo;
        }
        return C0425q8.e.Interstitial;
    }
}
