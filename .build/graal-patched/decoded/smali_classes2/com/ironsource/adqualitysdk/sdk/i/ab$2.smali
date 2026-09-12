.class final Lcom/ironsource/adqualitysdk/sdk/i/ab$2;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Landroid/view/View;

.field private synthetic ﻛ:Landroid/app/Activity;

.field final synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻛ:Landroid/app/Activity;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻐ:Landroid/view/View;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 8

    .line 123
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 124
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻛ:Landroid/app/Activity;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻐ:Landroid/view/View;

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/lang/Class;

    move-result-object v3

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v4

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v5

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/List;

    move-result-object v7

    invoke-static/range {v1 .. v7}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 125
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻐ:Landroid/view/View;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v2

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v3

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﻐ(Landroid/view/View;Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﻐ:Landroid/view/View;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    move-result-object v1

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 131
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ab$2$4;

    invoke-direct {v1, p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$2$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ab$2;Ljava/util/List;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void

    .line 138
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ab;

    invoke-static {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab;Ljava/util/List;)V

    return-void
.end method
