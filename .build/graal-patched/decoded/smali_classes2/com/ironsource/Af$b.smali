.class public final Lcom/ironsource/Af$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;
.implements Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Af;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Af;


# direct methods
.method constructor <init>(Lcom/ironsource/Af;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdAvailable(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdAvailable"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdClicked(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    .line 5
    sget-object v3, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v3, p1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/model/Placement;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 6
    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 7
    const-string p2, "onAdClicked"

    invoke-static {v0, p2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdClosed(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdClosed"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdLoadFailed"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdOpened(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdOpened"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdReady(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdReady"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdRewarded(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    .line 5
    sget-object v3, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v3, p1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/model/Placement;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 6
    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 7
    const-string p2, "onAdRewarded"

    invoke-static {v0, p2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdShowFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string p2, "onAdShowFailed"

    invoke-static {v0, p2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdUnavailable()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$b;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 5
    const-string v3, "onAdUnavailable"

    invoke-static {v0, v3, v1, v2}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method
