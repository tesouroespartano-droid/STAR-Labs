.class public Lcom/ironsource/unity/androidbridge/RewardedAd;
.super Ljava/lang/Object;
.source "RewardedAd.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/unity/androidbridge/RewardedAd$ConfigBuilder;
    }
.end annotation


# instance fields
.field mActivity:Landroid/app/Activity;

.field mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mActivity:Landroid/app/Activity;

    .line 20
    new-instance v0, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    invoke-direct {v0, p1}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    .line 21
    invoke-direct {p0, p2}, Lcom/ironsource/unity/androidbridge/RewardedAd;->setupRewardedListener(Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd$Config;Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    sget-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mActivity:Landroid/app/Activity;

    .line 27
    new-instance v0, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    invoke-direct {v0, p1, p2}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;-><init>(Ljava/lang/String;Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd$Config;)V

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    .line 28
    invoke-direct {p0, p3}, Lcom/ironsource/unity/androidbridge/RewardedAd;->setupRewardedListener(Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V

    return-void
.end method

.method public static isPlacementCapped(Ljava/lang/String;)Z
    .locals 0

    .line 105
    invoke-static {p0}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->isPlacementCapped(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private setupRewardedListener(Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    new-instance v1, Lcom/ironsource/unity/androidbridge/RewardedAd$1;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/unity/androidbridge/RewardedAd$1;-><init>(Lcom/ironsource/unity/androidbridge/RewardedAd;Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V

    invoke-virtual {v0, v1}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->setListener(Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;)V

    return-void
.end method


# virtual methods
.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    invoke-virtual {v0}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->getAdId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAdReady()Z
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    invoke-virtual {v0}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->isAdReady()Z

    move-result v0

    return v0
.end method

.method public loadAd()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    invoke-virtual {v0}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->loadAd()V

    return-void
.end method

.method public showAd(Ljava/lang/String;)V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mRewardedAd:Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;

    iget-object v1, p0, Lcom/ironsource/unity/androidbridge/RewardedAd;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;->showAd(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
