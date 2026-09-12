package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0765x extends AbstractC0760s {
    public boolean h;
    public Handler i;
    public RunnableC0763v j;

    @Override // com.unity3d.player.AbstractC0760s
    public final boolean c() {
        return false;
    }

    public C0765x(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }

    @Override // com.unity3d.player.AbstractC0760s
    public final void d() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new RunnableC0763v(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.AbstractC0760s
    public final void b() {
        RunnableC0763v runnableC0763v;
        Handler handler = this.i;
        if (handler != null && (runnableC0763v = this.j) != null) {
            handler.removeCallbacks(runnableC0763v);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC0760s
    public EditText createEditText(AbstractC0760s abstractC0760s) {
        return new C0764w(this.a, abstractC0760s);
    }

    @Override // com.unity3d.player.AbstractC0760s
    public final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }
}
