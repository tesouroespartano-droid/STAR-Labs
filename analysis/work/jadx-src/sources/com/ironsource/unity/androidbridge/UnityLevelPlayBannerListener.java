package com.ironsource.unity.androidbridge;

/* JADX INFO: loaded from: classes2.dex */
public interface UnityLevelPlayBannerListener {
    void onAdClicked(String str);

    void onAdLeftApplication(String str);

    void onAdLoadFailed(String str);

    void onAdLoaded(String str);

    void onAdScreenDismissed(String str);

    void onAdScreenPresented(String str);
}
