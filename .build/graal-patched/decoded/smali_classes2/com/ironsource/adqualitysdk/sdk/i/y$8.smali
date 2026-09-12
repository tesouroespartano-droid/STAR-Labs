.class final Lcom/ironsource/adqualitysdk/sdk/i/y$8;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/y;->onActivityResumed(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

.field final synthetic ｋ:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/y;Landroid/app/Activity;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ｋ:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 4

    .line 175
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ｋ:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/y;Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 176
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;

    invoke-direct {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/y$8;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    .line 182
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/y;Z)Z

    .line 183
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/y;Z)Z

    .line 184
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/y;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ｋ:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ｋ:Landroid/app/Activity;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ｋ(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﾇ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/y;Z)Z

    :cond_2
    return-void
.end method
