.class public final Lcom/ironsource/hf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Tc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/hf$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:J

.field private c:J

.field private d:J

.field private e:J

.field private final f:Lcom/ironsource/hf$b;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/Runnable;J)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/hf;->a:Landroid/os/Handler;

    .line 4
    iput-wide p3, p0, Lcom/ironsource/hf;->b:J

    .line 16
    new-instance p1, Lcom/ironsource/hf$b;

    invoke-direct {p1, p2}, Lcom/ironsource/hf$b;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lcom/ironsource/hf;->f:Lcom/ironsource/hf$b;

    .line 23
    invoke-direct {p0}, Lcom/ironsource/hf;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ironsource/hf;->e:J

    .line 24
    invoke-virtual {p0}, Lcom/ironsource/hf;->b()Lcom/ironsource/hf$a;

    return-void
.end method

.method private final c()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private final d()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ironsource/hf;->b:J

    iget-wide v2, p0, Lcom/ironsource/hf;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public a()Lcom/ironsource/hf$a;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/hf;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/hf;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ironsource/hf;->e:J

    .line 3
    iget-wide v2, p0, Lcom/ironsource/hf;->c:J

    iget-wide v4, p0, Lcom/ironsource/hf;->d:J

    sub-long/2addr v0, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/ironsource/hf;->c:J

    .line 4
    iget-object v0, p0, Lcom/ironsource/hf;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ironsource/hf;->f:Lcom/ironsource/hf$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    :cond_0
    new-instance v0, Lcom/ironsource/hf$a;

    invoke-direct {p0}, Lcom/ironsource/hf;->d()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/ironsource/hf;->c:J

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ironsource/hf$a;-><init>(JJ)V

    return-object v0
.end method

.method public b()Lcom/ironsource/hf$a;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/hf;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/hf;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ironsource/hf;->d:J

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/ironsource/hf;->e:J

    .line 4
    iget-object v0, p0, Lcom/ironsource/hf;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ironsource/hf;->f:Lcom/ironsource/hf$b;

    invoke-direct {p0}, Lcom/ironsource/hf;->d()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 6
    :cond_0
    new-instance v0, Lcom/ironsource/hf$a;

    invoke-direct {p0}, Lcom/ironsource/hf;->d()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/ironsource/hf;->c:J

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ironsource/hf$a;-><init>(JJ)V

    return-object v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ironsource/hf;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
