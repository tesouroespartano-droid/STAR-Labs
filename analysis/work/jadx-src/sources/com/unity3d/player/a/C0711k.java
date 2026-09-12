package com.unity3d.player.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: com.unity3d.player.a.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0711k extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0716p a;

    public C0711k(C0716p c0716p) {
        this.a = c0716p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0716p c0716p = this.a;
        if (c0716p.b == null) {
            return;
        }
        synchronized (c0716p.s) {
            C0716p c0716p2 = this.a;
            c0716p2.r = cameraCaptureSession;
            try {
                c0716p2.q = c0716p2.b.createCaptureRequest(1);
                C0716p c0716p3 = this.a;
                c0716p3.q.addTarget(c0716p3.v);
                C0716p c0716p4 = this.a;
                c0716p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0716p4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                AbstractC0719t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC0719t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC0719t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
