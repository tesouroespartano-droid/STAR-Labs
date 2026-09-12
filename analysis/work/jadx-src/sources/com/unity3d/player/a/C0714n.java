package com.unity3d.player.a;

import android.graphics.SurfaceTexture;
import com.unity3d.player.Camera2Wrapper;

/* JADX INFO: renamed from: com.unity3d.player.a.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0714n implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0716p a;

    public C0714n(C0716p c0716p) {
        this.a = c0716p;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
