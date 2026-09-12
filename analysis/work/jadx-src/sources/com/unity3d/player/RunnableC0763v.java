package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0763v implements Runnable {
    public final /* synthetic */ C0765x a;

    public RunnableC0763v(C0765x c0765x) {
        this.a = c0765x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.e();
    }
}
