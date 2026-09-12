package com.star.labs.graal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = "STAR_LABS";
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);

        TextView status = new TextView(this);
        status.setText("STAR Labs launcher\nBooting Graal Classic");
        status.setPadding(32, 32, 32, 32);
        root.addView(status);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/star_labs.html");
        root.addView(webView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
        );

        setContentView(root);

        Intent launchGraal = new Intent(Intent.ACTION_MAIN);
        launchGraal.setClassName(getPackageName(), UNITY_ACTIVITY);
        launchGraal.addCategory(Intent.CATEGORY_DEFAULT);
        try {
            Log.i(TAG, "Starting Unity activity: " + UNITY_ACTIVITY);
            startActivity(launchGraal);
        } catch (Exception e) {
            Log.w(TAG, "Unity activity not found, falling back to browser", e);
            Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://example.com"));
            startActivity(browser);
        }
    }
}
