.class Lcom/ironsource/unity/androidbridge/BannerAd$1;
.super Ljava/lang/Object;
.source "BannerAd.java"

# interfaces
.implements Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/unity/androidbridge/BannerAd;->setup(Ljava/lang/String;FFZZLcom/ironsource/unity/androidbridge/IUnityBannerAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ironsource/unity/androidbridge/BannerAd;

.field final synthetic val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;


# direct methods
.method constructor <init>(Lcom/ironsource/unity/androidbridge/BannerAd;Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 88
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->this$0:Lcom/ironsource/unity/androidbridge/BannerAd;

    iput-object p2, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 117
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdCollapsed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 129
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdCollapsed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayFailed(Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 111
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdDisplayFailed(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 104
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdDisplayed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdExpanded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 123
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdExpanded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLeftApplication(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 135
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdLeftApplication(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoadFailed(Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 98
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdLoadFailed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/BannerAd$1;->val$bannerListener:Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;

    if-eqz v0, :cond_0

    .line 92
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityBannerAdListener;->onAdLoaded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
