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
        // XCore active path disabled: preserve Graal's native Unity lifecycle and do
        // not inject the runtime panel or WebView overlay into the actual game activity.
    }

    @Override public void onActivityStarted(Activity activity) { }
    @Override public void onActivityResumed(Activity activity) { }
    @Override public void onActivityPaused(Activity activity) { }
    @Override public void onActivityStopped(Activity activity) { }
    @Override public void onActivitySaveInstanceState(Activity activity, Bundle state) { }
    @Override public void onActivityDestroyed(Activity activity) { }
}
