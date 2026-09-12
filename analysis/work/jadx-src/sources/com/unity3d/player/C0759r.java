package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0759r implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0760s a;

    public C0759r(AbstractC0760s abstractC0760s) {
        this.a = abstractC0760s;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0760s abstractC0760s = this.a;
            abstractC0760s.a(abstractC0760s.a(), false);
        }
        return false;
    }
}
