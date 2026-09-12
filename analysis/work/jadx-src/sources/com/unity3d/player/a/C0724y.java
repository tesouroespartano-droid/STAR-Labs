package com.unity3d.player.a;

/* JADX INFO: renamed from: com.unity3d.player.a.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0724y {
    public final Runnable b;
    public C0723x a = null;
    public boolean c = true;

    public C0724y(Runnable runnable) {
        this.b = runnable;
    }

    public void unregisterOnBackPressedCallback() {
        this.a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new C0723x(this.b);
    }
}
