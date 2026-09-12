package com.unity3d.player.a;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: renamed from: com.unity3d.player.a.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0712l extends CameraDevice.StateCallback {
    public final /* synthetic */ C0716p a;

    public C0712l(C0716p c0716p) {
        this.a = c0716p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0716p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0716p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC0719t.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0716p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC0719t.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.a.a(cameraDevice);
        C0716p.D.release();
    }
}
