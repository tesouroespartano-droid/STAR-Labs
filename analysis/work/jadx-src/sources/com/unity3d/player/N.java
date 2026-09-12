package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C0253g8;
import com.unity3d.player.a.C0706f;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends FrameLayout {
    public final C0706f a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.D c;

    public N(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.D(context);
        this.b = unityPlayerForActivityOrService;
        C0706f c0706f = new C0706f(unityPlayerForActivityOrService);
        this.a = c0706f;
        c0706f.setId(context.getResources().getIdentifier("unitySurfaceView", C0253g8.x, context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0706f);
        c0706f.getHolder().addCallback(new M(this));
        c0706f.setFocusable(true);
        c0706f.setFocusableInTouchMode(true);
        c0706f.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c0706f, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
