.class Lcom/ironsource/unity/androidbridge/RewardedAd$1;
.super Ljava/lang/Object;
.source "RewardedAd.java"

# interfaces
.implements Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/unity/androidbridge/RewardedAd;->setupRewardedListener(Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ironsource/unity/androidbridge/RewardedAd;

.field final synthetic val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;


# direct methods
.method constructor <init>(Lcom/ironsource/unity/androidbridge/RewardedAd;Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->this$0:Lcom/ironsource/unity/androidbridge/RewardedAd;

    iput-object p2, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 86
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdClosed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 72
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdClosed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayFailed(Lcom/unity3d/mediation/LevelPlayAdError;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 65
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdDisplayFailed(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 50
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdDisplayed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdInfoChanged(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 79
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdInfoChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoadFailed(Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 43
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdLoadFailed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 36
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdLoaded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdRewarded(Lcom/unity3d/mediation/rewarded/LevelPlayReward;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/RewardedAd$1;->val$rewardedAdListener:Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;

    if-eqz v0, :cond_0

    .line 58
    invoke-static {p2}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/unity3d/mediation/rewarded/LevelPlayReward;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/unity3d/mediation/rewarded/LevelPlayReward;->getAmount()I

    move-result p1

    invoke-interface {v0, p2, v1, p1}, Lcom/ironsource/unity/androidbridge/IUnityRewardedAdListener;->onAdRewarded(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
