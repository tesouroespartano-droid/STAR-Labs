package com.star.labs.graal;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;
import org.json.JSONObject;

public final class StarLabsWebBridge {
    private static final String PREFS = "star_labs_state";
    private final SharedPreferences preferences;
    private final StarLabsRuntimeHost runtimeHost = new StarLabsRuntimeHost();

    public StarLabsWebBridge(Context context) {
        preferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    @JavascriptInterface
    public String loadSettings() {
        return preferences.getString("settings", "{}");
    }

    @JavascriptInterface
    public void saveSettings(String settings) {
        preferences.edit().putString("settings", settings == null ? "{}" : settings).apply();
    }

    @JavascriptInterface
    public void saveScript(String name, String source) {
        preferences.edit().putString("script:" + name, source == null ? "" : source).apply();
    }

    @JavascriptInterface
    public String loadScript(String name) {
        return preferences.getString("script:" + name, "");
    }

    @JavascriptInterface
    public String runtimeStatus() {
        try {
            JSONObject result = new JSONObject();
            result.put("state", "ready");
            result.put("message", "STAR Labs GS2 runtime host ready in-process");
            return result.toString();
        } catch (Exception error) {
            return "{\"state\":\"unavailable\"}";
        }
    }

    @JavascriptInterface
    public String runScript(String source) {
        StarLabsRuntimeHost.Result result = runtimeHost.run(source);
        try {
            JSONObject response = new JSONObject();
            response.put("state", result.success ? "ready" : "error");
            response.put("success", result.success);
            response.put("code", result.code);
            response.put("message", result.message);
            response.put("output", result.output);
            return response.toString();
        } catch (Exception error) {
            return "{\"state\":\"error\",\"code\":\"ANDROID_RESULT_SERIALIZATION\"}";
        }
    }
}