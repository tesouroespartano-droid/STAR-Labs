package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0766y;

/* JADX INFO: loaded from: classes2.dex */
public final class G implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C0766y a;

    public G(C0766y c0766y) {
        this.a = c0766y;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
