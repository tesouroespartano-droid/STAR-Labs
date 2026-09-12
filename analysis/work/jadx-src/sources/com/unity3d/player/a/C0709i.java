package com.unity3d.player.a;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: renamed from: com.unity3d.player.a.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0709i {
    public final Context a;
    public final AudioManager b;
    public C0707g c;

    public C0709i(Context context) {
        this.a = context;
        this.b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }
}
