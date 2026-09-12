package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.AbstractC0760s;
import com.unity3d.player.C0766y;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends EditText {
    public final /* synthetic */ AbstractC0760s a;
    public final /* synthetic */ C0766y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0766y c0766y, Context context, AbstractC0760s abstractC0760s) {
        super(context);
        this.b = c0766y;
        this.a = abstractC0760s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C0724y c0724y;
        C0723x c0723x;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (c0724y = this.b.h.e) != null && (c0723x = c0724y.a) != null && (runnable = c0723x.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0760s abstractC0760s = this.a;
            abstractC0760s.a(abstractC0760s.a(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC0760s abstractC0760s2 = this.a;
            abstractC0760s2.a(abstractC0760s2.a(), true);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.e();
        }
    }
}
