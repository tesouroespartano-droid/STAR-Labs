package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0526w8 implements H7 {
    @Override // com.ironsource.H7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(F5.Q, F5.R).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
