.class Lcom/ironsource/unity/androidbridge/InterstitialAd$1;
.super Ljava/lang/Object;
.source "InterstitialAd.java"

# interfaces
.implements Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/unity/androidbridge/InterstitialAd;->setupInterstitialListener(Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ironsource/unity/androidbridge/InterstitialAd;

.field final synthetic val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;


# direct methods
.method constructor <init>(Lcom/ironsource/unity/androidbridge/InterstitialAd;Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->this$0:Lcom/ironsource/unity/androidbridge/InterstitialAd;

    iput-object p2, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 60
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdClosed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 53
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdClosed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayFailed(Lcom/unity3d/mediation/LevelPlayAdError;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 67
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p1

    .line 68
    invoke-static {p2}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p2

    .line 67
    invoke-interface {v0, p1, p2}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdDisplayFailed(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdDisplayed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 46
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdDisplayed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdInfoChanged(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdInfoChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoadFailed(Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 39
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adErrorToString(Lcom/unity3d/mediation/LevelPlayAdError;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdLoadFailed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/InterstitialAd$1;->val$interstitialAdListener:Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;

    if-eqz v0, :cond_0

    .line 32
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/LevelPlayUtils;->adInfoToString(Lcom/unity3d/mediation/LevelPlayAdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ironsource/unity/androidbridge/IUnityInterstitialAdListener;->onAdLoaded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
