package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface LevelPlayInterstitialListener {
    @Deprecated
    void onAdClicked(AdInfo adInfo);

    @Deprecated
    void onAdClosed(AdInfo adInfo);

    @Deprecated
    void onAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onAdOpened(AdInfo adInfo);

    @Deprecated
    void onAdReady(AdInfo adInfo);

    @Deprecated
    void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);

    @Deprecated
    void onAdShowSucceeded(AdInfo adInfo);
}
