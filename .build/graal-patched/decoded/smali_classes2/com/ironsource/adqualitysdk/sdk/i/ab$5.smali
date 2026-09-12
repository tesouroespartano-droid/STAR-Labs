.class final Lcom/ironsource/adqualitysdk/sdk/i/ab$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/jl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ(Landroid/view/View;)V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Landroid/view/View$OnLayoutChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 74
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Landroid/view/View$OnLayoutChangeListener;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ﾒ(Landroid/view/View;)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Landroid/view/View$OnLayoutChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 80
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
