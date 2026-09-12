package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0766y;
import com.unity3d.player.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class I implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C0766y a;

    public I(C0766y c0766y) {
        this.a = c0766y;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F0 f0 = this.a.f;
        if (f0 != null) {
            f0.a();
        }
    }
}
