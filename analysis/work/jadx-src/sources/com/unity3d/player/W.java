package com.unity3d.player;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    @Override // java.lang.Runnable
    public final void run() {
        View currentFocus;
        Activity activity = this.a.getActivity();
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (!inputMethodManager.isActive() || (currentFocus = activity.getCurrentFocus()) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public W(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }
}
