package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public L(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
        unityAccessibilityDelegate.e.addCaptioningChangeListener(this);
        onEnabledChanged(unityAccessibilityDelegate.e.isEnabled());
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        UnityPlayer unityPlayer = this.a.a;
        Objects.requireNonNull(unityPlayer);
        this.a.a.invokeOnMainThread((Runnable) new K(unityPlayer, z));
    }

    public void cleanup() {
        this.a.e.removeCaptioningChangeListener(this);
    }
}
