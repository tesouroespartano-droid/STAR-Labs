package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface D6 {
    void a(Activity activity);

    void a(C0456s6 c0456s6);

    void a(C0456s6 c0456s6, IronSourceError ironSourceError);

    void a(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C0456s6 c0456s6, IronSourceError ironSourceError);

    void b(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C0456s6 c0456s6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
