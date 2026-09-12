.class final Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;


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

    .line 306
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final adQualitySdkInitFailed(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    return-void
.end method

.method public final adQualitySdkInitSuccess()V
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/t;)V

    return-void
.end method
