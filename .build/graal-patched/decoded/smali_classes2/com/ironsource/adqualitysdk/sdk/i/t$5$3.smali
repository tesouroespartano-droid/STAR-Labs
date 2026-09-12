.class final Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ｋ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t$5;)V
    .locals 0

    .line 448
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 451
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-boolean v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﻛ:Z

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/at;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﾒ:Landroid/content/Context;

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    invoke-direct {v2, p0}, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;)V

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ｋ(Landroid/content/Context;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
