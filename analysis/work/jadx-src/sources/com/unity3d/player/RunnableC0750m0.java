package com.unity3d.player;

import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0750m0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0750m0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EditText editText;
        AbstractC0760s abstractC0760s = this.b.mSoftInput;
        if (abstractC0760s == null || (str = this.a) == null || (editText = abstractC0760s.c) == null) {
            return;
        }
        editText.setText(str);
        abstractC0760s.c.setSelection(str.length());
    }
}
