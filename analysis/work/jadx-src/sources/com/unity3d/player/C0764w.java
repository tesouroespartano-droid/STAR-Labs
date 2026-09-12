package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0764w extends EditText {
    public final /* synthetic */ AbstractC0760s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0764w(Context context, AbstractC0760s abstractC0760s) {
        super(context);
        this.a = abstractC0760s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC0760s abstractC0760s = this.a;
                abstractC0760s.a(abstractC0760s.a(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0760s abstractC0760s2 = this.a;
            abstractC0760s2.a(abstractC0760s2.a(), false);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC0760s abstractC0760s = this.a;
            abstractC0760s.a(abstractC0760s.a(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
