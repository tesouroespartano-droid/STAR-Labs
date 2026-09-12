.class final Lcom/ironsource/adqualitysdk/sdk/i/ji$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/jl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ji;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jl;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ji;Lcom/ironsource/adqualitysdk/sdk/i/jl;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ji$4;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ji;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ji$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ji$4;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ji;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ji;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 75
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ji$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

    invoke-interface {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jl;->ﻐ(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method
