.class final Lcom/ironsource/adqualitysdk/sdk/i/jb$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jb;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 4

    .line 128
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Ljava/util/HashMap;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/i/im;

    .line 131
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 1142
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﮐ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Landroid/view/Choreographer$FrameCallback;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1143
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/jb$1$1;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jb$1$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jb;Landroid/view/Choreographer$FrameCallback;)Landroid/view/Choreographer$FrameCallback;

    .line 1154
    :cond_1
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﮐ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Landroid/view/Choreographer$FrameCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void

    .line 135
    :cond_2
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jb;Landroid/view/Choreographer$FrameCallback;)Landroid/view/Choreographer$FrameCallback;

    return-void
.end method
