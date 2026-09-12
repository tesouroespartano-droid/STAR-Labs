package com.unity3d.player.a;

import android.media.Image;
import android.media.ImageReader;
import com.unity3d.player.Camera2Wrapper;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.unity3d.player.a.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0713m implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C0716p a;

    public C0713m(C0716p c0716p) {
        this.a = c0716p;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore = C0716p.D;
        if (semaphore.tryAcquire()) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage != null) {
                Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.a.a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC0719t.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.a.p;
                if (image != null) {
                    image.close();
                }
                this.a.p = imageAcquireNextImage;
            }
            semaphore.release();
        }
    }
}
