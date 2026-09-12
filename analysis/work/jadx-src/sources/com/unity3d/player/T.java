package com.unity3d.player;

import com.unity3d.player.a.AbstractC0703c;
import com.unity3d.player.a.AbstractC0719t;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayer b;

    public T(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.b;
            AbstractC0703c.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a);
        } catch (Exception e) {
            AbstractC0719t.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
