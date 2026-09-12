package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jq {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2885 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2886 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2887 = 4910629849279878938L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WeakReference<ay.d> f2888;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakReference<WebView> f2889;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2890;

    public jq(WebView webView) {
        this.f2889 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m2684() {
        int i = 2 % 2;
        int i2 = f2885 + 17;
        f2886 = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = this.f2889.get();
        int i4 = f2886 + 93;
        f2885 = i4 % 128;
        int i5 = i4 % 2;
        return webView;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ay.d m2683() {
        int i = 2 % 2;
        WeakReference<ay.d> weakReference = this.f2888;
        if (weakReference != null) {
            int i2 = f2886 + 13;
            f2885 = i2 % 128;
            if (i2 % 2 != 0) {
                return weakReference.get();
            }
            ay.d dVar = weakReference.get();
            int i3 = 99 / 0;
            return dVar;
        }
        int i4 = f2886 + 47;
        f2885 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2679(ay.d dVar) {
        int i = 2 % 2;
        this.f2888 = new WeakReference<>(dVar);
        int i2 = f2886 + 71;
        f2885 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2678(ay.d dVar) {
        int i = 2 % 2;
        new WeakReference(dVar);
        int i2 = f2886 + 91;
        f2885 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2682(WebViewClient webViewClient) {
        int i = 2 % 2;
        int i2 = f2885 + 41;
        f2886 = i2 % 128;
        int i3 = i2 % 2;
        WebView webViewM2684 = m2684();
        if (webViewM2684 != null) {
            try {
                hj hjVar = new hj(ki.m2852(webViewM2684), webViewClient);
                m2679(hjVar);
                webViewM2684.setWebViewClient(hjVar);
                this.f2890 = true;
                return;
            } catch (Exception e) {
                jz.m2766(m2677("흍쭬\uef5e荵ꜿ嬠缟Ꮪ㟺⯅쿁\ue3a5融뮄广物", 7187 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2677("흟㲩êᐶ硬䷿击ꔸ襦麧\ue2f9\uf63f\uda71⿷㏃ܰ歨炝䓡꠬뱹膌闠襤쵧튭⛴", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60352).intern(), (Throwable) e, false);
            }
        }
        this.f2890 = false;
        int i4 = f2885 + 47;
        f2886 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2681(WebChromeClient webChromeClient) {
        int i = 2 % 2;
        WebView webViewM2684 = m2684();
        if (webViewM2684 != null) {
            int i2 = f2886 + 91;
            f2885 = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    WebChromeClient webChromeClientM2843 = ki.m2843(webViewM2684);
                    if (webChromeClientM2843 == null || (webChromeClientM2843 instanceof WebChromeClient)) {
                        return;
                    }
                    hk hkVar = new hk(webChromeClientM2843, webChromeClient);
                    m2678(hkVar);
                    webViewM2684.setWebChromeClient(hkVar);
                    int i3 = f2885 + 89;
                    f2886 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                ki.m2843(webViewM2684);
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception e) {
                jz.m2766(m2677("흍쭬\uef5e荵ꜿ嬠缟Ꮪ㟺⯅쿁\ue3a5融뮄广物", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7188).intern(), m2677("흟峹쁊痆郎滯鈛ވ详㽷ꓙ⡏嶱셧皣切湨鏸݀貫〡ꖒ⤉嵞싮癚\ufbc5漿钲", 35729 - View.getDefaultSize(0, 0)).intern(), (Throwable) e, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2680() {
        int i = 2 % 2;
        int i2 = f2885;
        int i3 = i2 + 63;
        f2886 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.f2890;
        int i4 = i2 + 61;
        f2886 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2677(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2887);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
