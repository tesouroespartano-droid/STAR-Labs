package com.star.labs.graal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class StarLabsLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";
    private static final String TAG = "star-labs-overlay";

    @Override
    public void onActivityCreated(Activity activity, Bundle state) {
        if (UNITY_ACTIVITY.equals(activity.getClass().getName())) {
            attachRuntimePanel(activity);
        }
    }

    private static void attachRuntimePanel(Activity activity) {
        if (!(activity.getWindow().getDecorView() instanceof ViewGroup)) {
            return;
        }
        ViewGroup root = (ViewGroup) activity.getWindow().getDecorView();
        if (root.findViewWithTag(TAG) != null) {
            return;
        }
        WebView panel = new WebView(activity);
        panel.setTag(TAG);
        WebSettings settings = panel.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        panel.setWebViewClient(new WebViewClient());
        panel.loadUrl("file:///android_asset/star_labs.html");
        root.addView(panel, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override public void onActivityStarted(Activity activity) { }
    @Override public void onActivityResumed(Activity activity) { }
    @Override public void onActivityPaused(Activity activity) { }
    @Override public void onActivityStopped(Activity activity) { }
    @Override public void onActivitySaveInstanceState(Activity activity, Bundle state) { }
    @Override public void onActivityDestroyed(Activity activity) { }
}
