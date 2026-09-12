package com.unity3d.scar.adapter.v2100.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ScarBannerAdListener extends ScarAdListener {
    private final AdListener _adListener = new AdListener() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.1
        public void onAdClicked() {
            super.onAdClicked();
            ScarBannerAdListener.this._adListenerWrapper.onAdClicked();
        }

        public void onAdClosed() {
            super.onAdClosed();
            ScarBannerAdListener.this._adListenerWrapper.onAdClosed();
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            ScarBannerAdListener.this._scarBannerAd.removeAdView();
            ScarBannerAdListener.this._adListenerWrapper.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        public void onAdImpression() {
            super.onAdImpression();
            ScarBannerAdListener.this._adListenerWrapper.onAdImpression();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            ScarBannerAdListener.this._adListenerWrapper.onAdLoaded();
        }

        public void onAdOpened() {
            super.onAdOpened();
            ScarBannerAdListener.this._adListenerWrapper.onAdOpened();
        }
    };
    private final IScarBannerAdListenerWrapper _adListenerWrapper;
    private final ScarBannerAd _scarBannerAd;

    public ScarBannerAdListener(IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper, ScarBannerAd scarBannerAd) {
        this._adListenerWrapper = iScarBannerAdListenerWrapper;
        this._scarBannerAd = scarBannerAd;
    }

    public AdListener getAdListener() {
        return this._adListener;
    }
}
