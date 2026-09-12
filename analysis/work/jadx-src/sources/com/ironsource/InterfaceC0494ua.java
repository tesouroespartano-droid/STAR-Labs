package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0494ua {
    void d(IronSourceError ironSourceError);

    void k();

    void l();

    void n();

    void onAdClicked();

    void onAdLeftApplication();

    void onAdLoadFailed(IronSourceError ironSourceError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
