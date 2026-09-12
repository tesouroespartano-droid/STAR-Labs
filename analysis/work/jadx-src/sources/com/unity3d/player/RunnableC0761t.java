package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0761t implements Runnable {
    public final /* synthetic */ DialogC0762u a;

    public RunnableC0761t(DialogC0762u dialogC0762u) {
        this.a = dialogC0762u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0766y c0766y = this.a.d;
        c0766y.a(c0766y.a(), true);
    }
}
