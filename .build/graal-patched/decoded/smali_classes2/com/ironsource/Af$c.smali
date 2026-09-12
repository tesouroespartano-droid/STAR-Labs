.class public final Lcom/ironsource/Af$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;


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

    iput-object p1, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 2
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 3
    const-string v2, "onAdClicked"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdLeftApplication(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdLeftApplication"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

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

.method public onAdLoaded(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 2
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 3
    const-string v2, "onAdLoaded"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdScreenDismissed(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdScreenDismissed"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method public onAdScreenPresented(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Af$c;->a:Lcom/ironsource/Af;

    .line 3
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    sget-object v2, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ironsource/Ef;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    const-string v2, "onAdScreenPresented"

    invoke-static {v0, v2, v1, p1}, Lcom/ironsource/Af;->a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method
