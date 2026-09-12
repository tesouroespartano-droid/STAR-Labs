.class final Lcom/ironsource/adqualitysdk/sdk/i/t$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭸ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t;)V
    .locals 0

    .line 649
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 652
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->爫(Lcom/ironsource/adqualitysdk/sdk/i/t;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;

    if-eqz v1, :cond_0

    .line 654
    invoke-interface {v1}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;->adQualitySdkInitSuccess()V

    goto :goto_0

    .line 657
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->爫(Lcom/ironsource/adqualitysdk/sdk/i/t;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method
