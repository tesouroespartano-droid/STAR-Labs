.class final Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ↄ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 403
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ(Z)V

    .line 405
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/adqualitysdk/sdk/i/av;->ｋ()V

    .line 409
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/av;

    .line 410
    invoke-interface {v1}, Lcom/ironsource/adqualitysdk/sdk/i/av;->ｋ()V

    goto :goto_0

    .line 412
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 414
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/av;

    .line 415
    invoke-interface {v1}, Lcom/ironsource/adqualitysdk/sdk/i/av;->ｋ()V

    goto :goto_1

    :cond_2
    return-void
.end method
