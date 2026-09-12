.class public Lcom/ironsource/r3;
.super Lcom/ironsource/o3;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdRewardListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "Listener::Lcom/ironsource/U0;",
        ">",
        "Lcom/ironsource/o3<",
        "T",
        "Listener;",
        ">;",
        "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdRewardListener;"
    }
.end annotation


# instance fields
.field private r:Lcom/ironsource/k5;


# direct methods
.method static bridge synthetic -$$Nest$mU(Lcom/ironsource/r3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/r3;->U()V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/b1;Lcom/ironsource/n2;Lcom/ironsource/U0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/hd;",
            "Lcom/ironsource/l0;",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "*",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdRewardListener;",
            ">;",
            "Lcom/ironsource/b1;",
            "Lcom/ironsource/n2;",
            "T",
            "Listener;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/ironsource/o3;-><init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/b1;Lcom/ironsource/n2;Lcom/ironsource/I0;)V

    return-void
.end method

.method private U()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/ironsource/s3;->g:Lcom/ironsource/mediationsdk/model/Placement;

    if-eqz v0, :cond_2

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "placement name = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_1

    .line 6
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 7
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "custom_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 11
    invoke-interface {v10, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 17
    invoke-virtual {p0}, Lcom/ironsource/s3;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v6, v0}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getTransId(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 18
    iget-object v0, p0, Lcom/ironsource/r3;->r:Lcom/ironsource/k5;

    invoke-static {v0}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v8

    .line 19
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    iget-object v1, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    .line 20
    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/ironsource/s3;->g:Lcom/ironsource/mediationsdk/model/Placement;

    .line 21
    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardName()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/ironsource/s3;->g:Lcom/ironsource/mediationsdk/model/Placement;

    .line 22
    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardAmount()I

    move-result v4

    .line 27
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->l()Ljava/lang/String;

    move-result-object v11

    .line 28
    invoke-virtual/range {v1 .. v11}, Lcom/ironsource/M;->a(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;JLjava/util/Map;Ljava/lang/String;)V

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v0, Lcom/ironsource/U0;

    iget-object v1, p0, Lcom/ironsource/s3;->g:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-interface {v0, p0, v1}, Lcom/ironsource/U0;->a(Lcom/ironsource/r3;Lcom/ironsource/mediationsdk/model/Placement;)V

    return-void

    .line 42
    :cond_2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "placement is null "

    invoke-virtual {p0, v1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_3

    .line 44
    iget-object v0, v0, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mCurrentPlacement is null state = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/k5;

    invoke-direct {v0}, Lcom/ironsource/k5;-><init>()V

    iput-object v0, p0, Lcom/ironsource/r3;->r:Lcom/ironsource/k5;

    .line 2
    invoke-super {p0}, Lcom/ironsource/o3;->onAdClosed()V

    return-void
.end method

.method public onAdOpened()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/ironsource/r3;->r:Lcom/ironsource/k5;

    .line 2
    invoke-super {p0}, Lcom/ironsource/s3;->onAdOpened()V

    return-void
.end method

.method public onAdRewarded()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/r3;->U()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/r3$a;

    invoke-direct {v1, p0}, Lcom/ironsource/r3$a;-><init>(Lcom/ironsource/r3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method
