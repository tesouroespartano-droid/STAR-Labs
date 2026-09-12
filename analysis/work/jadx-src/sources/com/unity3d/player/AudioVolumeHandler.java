package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C0707g;
import com.unity3d.player.a.C0709i;
import com.unity3d.player.a.InterfaceC0708h;

/* JADX INFO: loaded from: classes2.dex */
public class AudioVolumeHandler implements InterfaceC0708h {
    public C0709i a;

    @Override // com.unity3d.player.a.InterfaceC0708h
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0709i c0709i = new C0709i(context);
        this.a = c0709i;
        c0709i.c = new C0707g(new Handler(Looper.getMainLooper()), c0709i.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0709i.c);
    }
}
