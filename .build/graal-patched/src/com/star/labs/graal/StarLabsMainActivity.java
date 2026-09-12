package com.star.labs.graal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class StarLabsMainActivity extends Activity {
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/star_labs.html");
        setContentView(webView);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            try {
                Intent launch = new Intent(Intent.ACTION_MAIN);
                launch.setClassName(getPackageName(), UNITY_ACTIVITY);
                launch.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(launch);
            } catch (Exception ignored) {
                // Graceful fallback if the original Unity activity is not present.
            }
        }, 350);
    }
}
