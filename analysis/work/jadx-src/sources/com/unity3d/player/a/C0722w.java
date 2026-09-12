package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: renamed from: com.unity3d.player.a.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0722w extends C0720u {
    public int b;
    public final C0721v c;

    public C0722w(Context context) {
        super(context);
        this.b = 0;
        C0721v c0721v = new C0721v(this);
        this.c = c0721v;
        if (this.a == null) {
            return;
        }
        this.b = super.b();
        this.a.registerDefaultNetworkCallback(c0721v);
    }

    @Override // com.unity3d.player.a.C0720u
    public final int b() {
        return this.b;
    }

    @Override // com.unity3d.player.a.C0720u
    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
