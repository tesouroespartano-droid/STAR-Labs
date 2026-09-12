package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0306j8 {
    private C0357m8 a;

    C0306j8(C0357m8 c0357m8) {
        this.a = c0357m8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
