package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.P6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IronSource {

    @Deprecated
    public enum AD_UNIT {
        REWARDED_VIDEO(P6.F0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");

        private String a;

        AD_UNIT(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    @Deprecated
    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.m().b(impressionDataListener);
    }

    @Deprecated
    public static void clearRewardedVideoServerParameters() {
        p.m().c();
    }

    @Deprecated
    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return p.m().b(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.m().a(activity, iSBannerSize);
    }

    @Deprecated
    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.m().a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.m().e(str);
    }

    @Deprecated
    public static String getAdvertiserId(Context context) {
        return p.m().b(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return p.m().a(context);
    }

    @Deprecated
    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return p.m().f(str);
    }

    @Deprecated
    public static Placement getRewardedVideoPlacementInfo(String str) {
        return p.m().i(str);
    }

    @Deprecated
    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    @Deprecated
    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        p.m().a(context, str, ad_unitArr);
    }

    @Deprecated
    public static boolean isBannerPlacementCapped(String str) {
        return p.m().q(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.m().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.m().j(str);
    }

    @Deprecated
    public static boolean isInterstitialPlacementCapped(String str) {
        return p.m().r(str);
    }

    @Deprecated
    public static boolean isInterstitialReady() {
        return p.m().G();
    }

    @Deprecated
    public static boolean isRewardedVideoAvailable() {
        return p.m().L();
    }

    @Deprecated
    public static boolean isRewardedVideoPlacementCapped(String str) {
        return p.m().s(str);
    }

    @Deprecated
    public static void launchTestSuite(Context context) {
        IronLog.API.info("");
        p.m().c(context);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.m().b(ironSourceBannerLayout);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.m().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        p.m().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        p.m().a(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        p.m().b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        p.m().b(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        p.m().a(activity, str, str2);
    }

    @Deprecated
    public static void loadInterstitial() {
        p.m().Q();
    }

    @Deprecated
    public static void loadRewardedVideo() {
        p.m().R();
    }

    @Deprecated
    public static void onPause(Activity activity) {
        p.m().a(activity);
    }

    @Deprecated
    public static void onResume(Activity activity) {
        p.m().b(activity);
    }

    @Deprecated
    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.m().a(impressionDataListener);
    }

    @Deprecated
    public static void removeInterstitialListener() {
        p.m().d();
    }

    @Deprecated
    public static void removeRewardedVideoListener() {
        p.m().b();
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        p.m().a(str, jSONObject);
    }

    @Deprecated
    public static void setAdaptersDebug(boolean z) {
        p.m().a(z);
    }

    @Deprecated
    public static void setConsent(boolean z) {
        IronLog.API.info("consent = " + z);
        p.m().b(z);
    }

    @Deprecated
    public static boolean setDynamicUserId(String str) {
        IronLog.API.info("dynamicUserId: " + str);
        return p.m().b(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.m().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.m().a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        p.m().a(levelPlayInterstitialListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        p.m().a(levelPlayRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        p.m().a(levelPlayRewardedVideoManualListener);
    }

    @Deprecated
    public static void setLogListener(LogListener logListener) {
        p.m().a(logListener);
    }

    public static void setMediationType(String str) {
        p.m().g(str);
    }

    @Deprecated
    public static void setMetaData(String str, String str2) {
        IronLog.API.info("key = " + str + ", value = " + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        p.m().a(str, arrayList);
    }

    @Deprecated
    public static void setNetworkData(String str, JSONObject jSONObject) {
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        p.m().b(str, jSONObject);
    }

    @Deprecated
    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        p.m().a(map);
    }

    @Deprecated
    public static void setSegment(IronSourceSegment ironSourceSegment) {
        IronLog.API.info("");
        p.m().a(ironSourceSegment);
    }

    @Deprecated
    public static void setSegmentListener(SegmentListener segmentListener) {
        p.m().a(segmentListener);
    }

    @Deprecated
    public static void setUserId(String str) {
        p.m().t(str);
    }

    @Deprecated
    public static void setWaterfallConfiguration(WaterfallConfiguration waterfallConfiguration, AD_UNIT ad_unit) {
        p.m().a(ad_unit, waterfallConfiguration);
    }

    @Deprecated
    public static void shouldTrackNetworkState(Context context, boolean z) {
        p.m().a(context, z);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.m().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.m().a(str);
    }

    @Deprecated
    public static void showInterstitial() {
        p.m().c((Activity) null);
    }

    @Deprecated
    public static void showRewardedVideo() {
        p.m().d((Activity) null);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        p.m().a(ironSourceBannerLayout, str);
    }

    @Deprecated
    public static void showInterstitial(Activity activity) {
        p.m().c(activity);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity) {
        p.m().d(activity);
    }

    @Deprecated
    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        p.m().a(context, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(String str) {
        p.m().c(null, str);
    }

    @Deprecated
    public static void showRewardedVideo(String str) {
        p.m().f(null, str);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        p.m().a(context, str, false, initializationListener, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(Activity activity, String str) {
        p.m().c(activity, str);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity, String str) {
        p.m().f(activity, str);
    }

    @Deprecated
    public static void setMetaData(String str, List<String> list) {
        IronLog.API.info("key = " + str + ", values = " + list);
        p.m().a(str, list);
    }
}
