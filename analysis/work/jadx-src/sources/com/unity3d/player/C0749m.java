package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC0705e;
import com.unity3d.player.a.C0704d;
import com.unity3d.player.a.C0724y;

/* JADX INFO: renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0749m extends C0724y {
    public C0704d d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C0749m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static C0724y a(Object obj, int i, Runnable runnable) {
        C0724y c0724y;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            c0724y = new C0749m(AbstractC0705e.a(obj), i, runnable);
        } else {
            c0724y = new C0724y(runnable);
        }
        c0724y.registerOnBackPressedCallback();
        return c0724y;
    }

    @Override // com.unity3d.player.a.C0724y
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C0704d c0704d = new C0704d(this.a);
            this.d = c0704d;
            AbstractC0705e.a(this.e, this.f, c0704d);
        }
    }

    @Override // com.unity3d.player.a.C0724y
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0705e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
