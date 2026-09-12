package com.player.render;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.webkit.ProxyConfig;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class ModMenu {
    private static final int ACT_PANEL = 5;
    private static WebMessagePort androidPort;
    private static Context appContext;
    private static String scriptsPath;
    private static boolean started = false;
    private static WebView webView;

    static native void xA(Context context);

    static native void xB(WebView webView2);

    static native int xC(String str);

    static native void xE();

    static native boolean xF();

    static native boolean xG();

    static native boolean xH();

    static native void xI(boolean z);

    static native void xJ(String str);

    static native void xK(String str);

    static native boolean xP(View view, float f, float f2);

    static native void xQ();

    static {
        System.loadLibrary(NotificationCompat.CATEGORY_SERVICE);
        scriptsPath = null;
    }

    public static void yA(final String json) {
        if (androidPort != null && webView != null) {
            webView.post(new Runnable() { // from class: com.player.render.ModMenu$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.androidPort.postMessage(new WebMessage(json));
                }
            });
        }
    }

    public static void yC() {
    }

    public static void yD(final String msg) {
        if (appContext == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.player.render.ModMenu$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(ModMenu.appContext, msg, 0).show();
            }
        });
    }

    public static void yB(final String html) {
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.player.render.ModMenu$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.webView.loadDataWithBaseURL("http://menu.holy/", html, "text/html", "UTF-8", null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setupChannel() {
        if (androidPort != null) {
            try {
                androidPort.close();
            } catch (Exception e) {
            }
        }
        WebMessagePort[] ports = webView.createWebMessageChannel();
        androidPort = ports[0];
        WebMessagePort jsPort = ports[1];
        androidPort.setWebMessageCallback(new AnonymousClass1());
        webView.postWebMessage(new WebMessage("{\"type\":\"init\"}", new WebMessagePort[]{jsPort}), Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES));
        if (xF()) {
            xJ("{\"type\":\"init\"}");
        }
    }

    /* JADX INFO: renamed from: com.player.render.ModMenu$1, reason: invalid class name */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {
        AnonymousClass1() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort port, WebMessage message) {
            String json = message.getData();
            int action = ModMenu.xC(json);
            if (ModMenu.xF()) {
                ModMenu.xJ(json);
            }
            if (action == 5) {
                final boolean open = ModMenu.xG();
                ModMenu.webView.post(new Runnable() { // from class: com.player.render.ModMenu$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModMenu.AnonymousClass1.lambda$onMessage$0(open);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onMessage$0(boolean open) {
            if (open) {
                ModMenu.webView.setFocusable(true);
                ModMenu.webView.setFocusableInTouchMode(true);
                ModMenu.webView.requestFocus();
            } else {
                ModMenu.webView.setFocusable(false);
                ModMenu.webView.setFocusableInTouchMode(false);
                InputMethodManager imm = (InputMethodManager) ModMenu.appContext.getSystemService("input_method");
                if (imm != null) {
                    imm.hideSoftInputFromWindow(ModMenu.webView.getWindowToken(), 0);
                }
            }
        }
    }

    private static void initScriptsDir() {
        try {
            if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
                File dir = new File(Environment.getExternalStorageDirectory(), "xCoreScripts");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                if (dir.exists()) {
                    scriptsPath = dir.getAbsolutePath();
                }
            }
        } catch (Exception e) {
        }
    }

    public static String yE() {
        if (scriptsPath != null) {
            return scriptsPath;
        }
        initScriptsDir();
        return scriptsPath;
    }

    public static void StartMenu(Context context) {
        if (started) {
            return;
        }
        started = true;
        Activity activity = getActivity(context);
        if (activity == null) {
            return;
        }
        appContext = context;
        boolean needsPerm = Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager();
        if (!needsPerm) {
            initScriptsDir();
            xA(context);
        } else {
            xA(context);
            try {
                activity.startActivity(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + context.getPackageName())));
            } catch (Exception e) {
                activity.startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
            }
            new Thread(new Runnable() { // from class: com.player.render.ModMenu$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.lambda$StartMenu$4();
                }
            }).start();
        }
        ViewGroup root = (ViewGroup) activity.getWindow().getDecorView();
        FrameLayout overlay = new FrameLayout(context);
        overlay.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        overlay.setElevation(dp(context, 50));
        overlay.setBackgroundColor(0);
        overlay.setFitsSystemWindows(false);
        float f = context.getResources().getDisplayMetrics().density;
        webView = new WebView(context) { // from class: com.player.render.ModMenu.2
            private boolean _handled = false;

            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent e2) {
                switch (e2.getActionMasked()) {
                    case 0:
                        this._handled = ModMenu.xP(this, e2.getX(), e2.getY());
                        break;
                    case 1:
                    case 3:
                        boolean h = this._handled;
                        this._handled = false;
                        return h && super.onTouchEvent(e2);
                }
                return this._handled && super.onTouchEvent(e2);
            }

            @Override // android.webkit.WebView, android.view.View
            public boolean onCheckIsTextEditor() {
                return ModMenu.xH();
            }

            @Override // android.webkit.WebView, android.view.View
            public InputConnection onCreateInputConnection(EditorInfo out) {
                if (ModMenu.xH()) {
                    return super.onCreateInputConnection(out);
                }
                return null;
            }
        };
        xB(webView);
        webView.addJavascriptInterface(new AnonymousClass3(), "Native");
        xE();
        FrameLayout.LayoutParams wvLp = new FrameLayout.LayoutParams(-1, -1);
        overlay.addView(webView, wvLp);
        webView.setFitsSystemWindows(false);
        root.addView(overlay);
    }

    static /* synthetic */ void lambda$StartMenu$4() {
        while (!Environment.isExternalStorageManager()) {
            try {
                Thread.sleep(1000L);
            } catch (Exception e) {
                return;
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.player.render.ModMenu$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ModMenu.lambda$StartMenu$3();
            }
        });
    }

    static /* synthetic */ void lambda$StartMenu$3() {
        initScriptsDir();
        xQ();
    }

    /* JADX INFO: renamed from: com.player.render.ModMenu$3, reason: invalid class name */
    class AnonymousClass3 {
        AnonymousClass3() {
        }

        @JavascriptInterface
        public void init() {
            ModMenu.webView.post(new Runnable() { // from class: com.player.render.ModMenu$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.setupChannel();
                }
            });
        }

        @JavascriptInterface
        public void showKeyboard() {
            ModMenu.xI(true);
            ModMenu.webView.postDelayed(new Runnable() { // from class: com.player.render.ModMenu$3$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.AnonymousClass3.lambda$showKeyboard$1();
                }
            }, 150L);
        }

        static /* synthetic */ void lambda$showKeyboard$1() {
            ModMenu.webView.requestFocus();
            InputMethodManager imm = (InputMethodManager) ModMenu.appContext.getSystemService("input_method");
            if (imm != null) {
                imm.showSoftInput(ModMenu.webView, 1);
            }
        }

        @JavascriptInterface
        public void hideKeyboard() {
            ModMenu.xI(false);
            ModMenu.webView.post(new Runnable() { // from class: com.player.render.ModMenu$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ModMenu.AnonymousClass3.lambda$hideKeyboard$2();
                }
            });
        }

        static /* synthetic */ void lambda$hideKeyboard$2() {
            InputMethodManager imm = (InputMethodManager) ModMenu.appContext.getSystemService("input_method");
            if (imm != null) {
                imm.hideSoftInputFromWindow(ModMenu.webView.getWindowToken(), 0);
            }
        }
    }

    public static int dp(Context c, int dp) {
        return (int) (dp * c.getResources().getDisplayMetrics().density);
    }

    public static Activity getActivity(Context c) {
        while (c instanceof ContextWrapper) {
            if (c instanceof Activity) {
                return (Activity) c;
            }
            c = ((ContextWrapper) c).getBaseContext();
        }
        return null;
    }
}
