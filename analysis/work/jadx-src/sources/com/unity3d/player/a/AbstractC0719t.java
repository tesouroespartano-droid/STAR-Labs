package com.unity3d.player.a;

import android.util.Log;

/* JADX INFO: renamed from: com.unity3d.player.a.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0719t {
    public static boolean a;

    public static void Log(int i, String str) {
        if (a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
