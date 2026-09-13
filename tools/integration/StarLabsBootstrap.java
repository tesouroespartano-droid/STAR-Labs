package com.star.labs.graal;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

public final class StarLabsBootstrap {
    private static final String TAG = "STARLABS";
    private static final String VIEW_TAG = "star-labs-executor";
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";
    private static final int PANEL_HEIGHT_DP = 420;

    private StarLabsBootstrap() { }

    public static void start(Activity activity) {
        Log.i(TAG, "[STARLABS] bootstrap start");
        if (activity == null || !UNITY_ACTIVITY.equals(activity.getClass().getName())) {
            Log.w(TAG, "[STARLABS] activity rejected");
            return;
        }
        ViewGroup root = activity.getWindow().getDecorView() instanceof ViewGroup
                ? (ViewGroup) activity.getWindow().getDecorView() : null;
        if (root == null) {
            Log.w(TAG, "[STARLABS] activity root unavailable");
            return;
        }
        if (root.findViewWithTag(VIEW_TAG) != null) {
            Log.i(TAG, "[STARLABS] ui already initialized");
            return;
        }
        Log.i(TAG, "[STARLABS] activity detected");
        WebView executor = new WebView(activity);
        executor.setTag(VIEW_TAG);
        executor.setBackgroundColor(Color.TRANSPARENT);
        WebSettings settings = executor.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        executor.setWebViewClient(new WebViewClient());
        executor.addJavascriptInterface(new StarLabsWebBridge(activity), "StarLabs");
        executor.loadUrl("file:///android_asset/star_labs.html");

        FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                dp(activity, PANEL_HEIGHT_DP),
                Gravity.TOP);
        layout.leftMargin = dp(activity, 8);
        layout.rightMargin = dp(activity, 8);
        layout.topMargin = dp(activity, 8);
        root.addView(executor, layout);
        Log.i(TAG, "[STARLABS] ui initialized");
        Log.i(TAG, "[STARLABS] executor ready");
    }

    public static void stop(Activity activity) {
        if (activity == null || !(activity.getWindow().getDecorView() instanceof ViewGroup)) return;
        ViewGroup root = (ViewGroup) activity.getWindow().getDecorView();
        View executor = root.findViewWithTag(VIEW_TAG);
        if (executor != null) {
            root.removeView(executor);
            if (executor instanceof WebView) ((WebView) executor).destroy();
            Log.i(TAG, "[STARLABS] executor stopped");
        }
    }

    private static int dp(Activity activity, int value) {
        return (int) (value * activity.getResources().getDisplayMetrics().density + 0.5f);
    }
}