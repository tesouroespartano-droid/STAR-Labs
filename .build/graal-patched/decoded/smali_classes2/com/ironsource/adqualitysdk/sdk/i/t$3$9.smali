.class final Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final adClosed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭸ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭸ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;->adClosed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    :cond_0
    return-void
.end method

.method public final adDisplayed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭸ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭸ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;->adDisplayed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    :cond_0
    return-void
.end method
