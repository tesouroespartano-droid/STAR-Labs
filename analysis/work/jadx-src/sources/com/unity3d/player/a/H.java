package com.unity3d.player.a;

import android.view.ViewTreeObserver;
import com.unity3d.player.C0766y;

/* JADX INFO: loaded from: classes2.dex */
public final class H implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C0766y a;

    public H(C0766y c0766y) {
        this.a = c0766y;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }
}
