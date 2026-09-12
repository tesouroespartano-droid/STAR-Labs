package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: com.unity3d.player.a.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0704d implements OnBackInvokedCallback {
    public final /* synthetic */ C0723x a;

    public C0704d(C0723x c0723x) {
        this.a = c0723x;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
