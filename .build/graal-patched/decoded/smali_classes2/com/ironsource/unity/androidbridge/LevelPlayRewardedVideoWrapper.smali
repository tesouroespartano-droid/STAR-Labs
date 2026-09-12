.class Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;
.super Ljava/lang/Object;
.source "LevelPlayRewardedVideoWrapper.java"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;
.implements Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;


# instance fields
.field private mUnityLevelPlayManualRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;

.field private mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;


# direct methods
.method static bridge synthetic -$$Nest$fgetmUnityLevelPlayManualRewardedVideoListener(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;)Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayManualRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmUnityLevelPlayRewardedVideoListener(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;)Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    return-object p0
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->setLevelPlayRewardedVideoListener(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;)V

    return-void
.end method


# virtual methods
.method public onAdAvailable(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 46
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$1;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$1;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdClicked(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 108
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->getPlacememtJson(Lcom/ironsource/mediationsdk/model/Placement;)Ljava/lang/String;

    move-result-object p1

    .line 109
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 110
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$5;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Ljava/lang/String;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdClosed(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 140
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$7;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$7;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 170
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$9;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$9;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdOpened(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 79
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$3;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$3;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdReady(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 155
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$8;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$8;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdRewarded(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 124
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->getPlacememtJson(Lcom/ironsource/mediationsdk/model/Placement;)Ljava/lang/String;

    move-result-object p1

    .line 125
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 126
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$6;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Ljava/lang/String;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdShowFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 94
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$4;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onAdUnavailable()V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 60
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$2;

    invoke-direct {v0, p0}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper$2;-><init>(Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setIronSourceManualLoadListener(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 23
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->setLevelPlayRewardedVideoManualListener(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 25
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setLevelPlayRewardedVideoManualListener(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;)V

    .line 26
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->setLevelPlayRewardedVideoListener(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;)V

    return-void
.end method

.method public setLevelPlayManualRewardedVideoListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayManualRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;

    return-void
.end method

.method public setLevelPlayRewardedVideoListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->mUnityLevelPlayRewardedVideoListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;

    return-void
.end method
