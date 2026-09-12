package com.unity3d.player;

import android.telephony.PhoneStateListener;

/* JADX INFO: renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0740h0 extends PhoneStateListener {
    public final /* synthetic */ UnityPlayer a;

    public C0740h0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.a.nativeMuteMasterAudio(i == 1);
    }
}
