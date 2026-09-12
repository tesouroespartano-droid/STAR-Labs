package com.unity3d.player;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 implements Runnable {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    public L0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        com.unity3d.player.a.D d = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c != null && c.getParent() != null) {
            frameLayout.removeView(d.b);
        }
        this.a.m_PersistentUnitySurface.b = null;
    }
}
