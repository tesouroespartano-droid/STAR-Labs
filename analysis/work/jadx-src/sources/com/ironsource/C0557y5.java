package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0557y5 {
    public static final C0557y5 a = new C0557y5();

    private C0557y5() {
    }

    static /* synthetic */ IronSourceError a(C0557y5 c0557y5, EnumC0167b8 enumC0167b8, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c0557y5.a(enumC0167b8, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, EnumC0167b8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, EnumC0167b8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, EnumC0167b8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, EnumC0167b8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, EnumC0167b8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, EnumC0167b8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, EnumC0167b8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, EnumC0167b8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, EnumC0167b8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, EnumC0167b8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, EnumC0167b8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, EnumC0167b8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, EnumC0167b8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, EnumC0167b8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, EnumC0167b8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, EnumC0167b8.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, EnumC0167b8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, EnumC0167b8.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, EnumC0167b8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC0167b8 enumC0167b8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC0167b8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC0167b8.c();
        }
        return new IronSourceError(enumC0167b8.b(), strC);
    }

    public final IronSourceError b(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(EnumC0167b8.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(EnumC0167b8.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d(String str) {
        return a(EnumC0167b8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C0557y5 c0557y5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c0557y5.b(str);
    }

    public final IronSourceError c(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC0167b8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C0557y5 c0557y5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c0557y5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(EnumC0167b8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC0167b8 enumC0167b8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC0167b8.c();
        }
        return new IronSourceError(enumC0167b8.b(), str);
    }

    public final IronSourceError a(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC0167b8.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a() {
        return a(this, EnumC0167b8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C0557y5 c0557y5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c0557y5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(EnumC0167b8.ISErrorBannerLoadNoConfig, str);
    }
}
