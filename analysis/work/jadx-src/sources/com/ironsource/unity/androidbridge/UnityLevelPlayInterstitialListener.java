package com.ironsource.unity.androidbridge;

/* JADX INFO: loaded from: classes2.dex */
public interface UnityLevelPlayInterstitialListener {
    void onAdClicked(String str);

    void onAdClosed(String str);

    void onAdLoadFailed(String str);

    void onAdOpened(String str);

    void onAdReady(String str);

    void onAdShowFailed(String str, String str2);

    void onAdShowSucceeded(String str);
}
