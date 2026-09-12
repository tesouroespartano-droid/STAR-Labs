.class final Lcom/ironsource/adqualitysdk/sdk/i/ag$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/iz;
.implements Lcom/ironsource/adqualitysdk/sdk/i/jd$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﮌ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V
    .locals 0

    .line 407
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)V
    .locals 0

    .line 1440
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V

    .line 1441
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V

    return-void
.end method

.method public final ｋ(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ja;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_6

    .line 411
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 416
    :cond_0
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    .line 417
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ja;

    .line 418
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ae;

    invoke-direct {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ae;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ja;)V

    invoke-interface {v0, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 421
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 422
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ae;

    :goto_1
    if-eqz v1, :cond_4

    .line 425
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ag;Lcom/ironsource/adqualitysdk/sdk/i/ae;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 426
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ae;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 427
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﮌ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﾇ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ae;->ﾇ(Ljava/lang/String;)V

    .line 429
    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 431
    :cond_3
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﭖ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/jd;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ae;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ja;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jd;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ja;)V

    .line 424
    :goto_2
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ae;

    goto :goto_1

    .line 435
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 437
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v0, p1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ag;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V

    :cond_5
    return-void

    .line 412
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 452
    :catch_0
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V

    return-void
.end method

.method public final ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V
    .locals 0

    .line 1446
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V

    return-void
.end method
