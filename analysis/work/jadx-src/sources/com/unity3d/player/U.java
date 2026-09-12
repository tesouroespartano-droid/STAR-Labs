package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0703c;
import com.unity3d.player.a.AbstractC0719t;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0703c.b;
            if (progressBar != null) {
                if (AbstractC0703c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC0703c.b);
                        viewGroup.removeView(AbstractC0703c.c);
                    }
                    AbstractC0703c.b = null;
                    AbstractC0703c.c = null;
                }
                AbstractC0703c.d = -1;
            }
        } catch (Exception e) {
            AbstractC0719t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
