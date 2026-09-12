.class final Lcom/ironsource/adqualitysdk/sdk/i/jh$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/jl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jh;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jh;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ(Landroid/view/View;)V
    .locals 2

    .line 60
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 61
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 62
    check-cast p1, Landroid/view/ViewGroup;

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const v1, 0x1020002

    .line 65
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 66
    invoke-static {p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    move-result-object p1

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/ViewGroup;)Landroid/view/View$OnLayoutChangeListener;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/ViewGroup;Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1
    return-void

    .line 71
    :cond_2
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻐ()V

    return-void
.end method

.method public final ﾒ(Landroid/view/View;)V
    .locals 0

    return-void
.end method
