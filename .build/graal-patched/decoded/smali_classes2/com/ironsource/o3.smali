.class public abstract Lcom/ironsource/o3;
.super Lcom/ironsource/s3;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "Listener::Lcom/ironsource/I0;",
        ">",
        "Lcom/ironsource/s3<",
        "T",
        "Listener;",
        ">;",
        "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdInteractionListener;"
    }
.end annotation


# direct methods
.method static bridge synthetic -$$Nest$mP(Lcom/ironsource/o3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/o3;->P()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mQ(Lcom/ironsource/o3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/o3;->Q()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mR(Lcom/ironsource/o3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/o3;->R()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mS(Lcom/ironsource/o3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/o3;->S()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mT(Lcom/ironsource/o3;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/o3;->T()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mb(Lcom/ironsource/o3;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ironsource/o3;->b(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/b1;Lcom/ironsource/n2;Lcom/ironsource/I0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/hd;",
            "Lcom/ironsource/l0;",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "**>;",
            "Lcom/ironsource/b1;",
            "Lcom/ironsource/n2;",
            "T",
            "Listener;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/ironsource/s3;-><init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/b1;Lcom/ironsource/n2;Lcom/ironsource/Q0;)V

    return-void
.end method

.method private P()V
    .locals 8

    const-string v0, "true|"

    const-string v1, "unexpected ad closed - state = "

    const-string v2, "otherInstanceAvailable = "

    const-string v3, "unexpected ad closed for "

    .line 1
    sget-object v4, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/s3;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    iget-object v5, p0, Lcom/ironsource/s3;->q:Ljava/lang/Object;

    monitor-enter v5

    .line 4
    :try_start_0
    iget-object v6, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    sget-object v7, Lcom/ironsource/s3$h;->f:Lcom/ironsource/s3$h;

    if-ne v6, v7, :cond_3

    .line 6
    sget-object v1, Lcom/ironsource/s3$h;->a:Lcom/ironsource/s3$h;

    invoke-virtual {p0, v1}, Lcom/ironsource/s3;->a(Lcom/ironsource/s3$h;)V

    .line 9
    iget-object v1, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v1, :cond_2

    .line 10
    const-string v1, ""

    .line 11
    iget-object v3, p0, Lcom/ironsource/s3;->a:Lcom/ironsource/l0;

    invoke-virtual {v3}, Lcom/ironsource/l0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v3

    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    if-ne v3, v4, :cond_1

    .line 12
    iget-object v1, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v1, Lcom/ironsource/I0;

    invoke-interface {v1}, Lcom/ironsource/I0;->f()Ljava/lang/String;

    move-result-object v1

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "false"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/M;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v0, Lcom/ironsource/I0;

    invoke-interface {v0, p0}, Lcom/ironsource/I0;->a(Lcom/ironsource/o3;)V

    return-void

    .line 30
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lcom/ironsource/s3;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " - state = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-virtual {v4, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_4

    .line 35
    iget-object v0, v0, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/Sf;->l(Ljava/lang/String;)V

    .line 37
    :cond_4
    monitor-exit v5

    return-void

    :catchall_0
    move-exception v0

    .line 39
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private Q()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/s3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->d(Ljava/lang/String;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v0, Lcom/ironsource/I0;

    invoke-interface {v0, p0}, Lcom/ironsource/I0;->c(Lcom/ironsource/o3;)V

    return-void
.end method

.method private R()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/s3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->l(Ljava/lang/String;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v0, Lcom/ironsource/I0;

    invoke-interface {v0, p0}, Lcom/ironsource/I0;->b(Lcom/ironsource/o3;)V

    return-void
.end method

.method private S()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/s3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->i(Ljava/lang/String;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast v0, Lcom/ironsource/I0;

    invoke-interface {v0, p0}, Lcom/ironsource/I0;->d(Lcom/ironsource/o3;)V

    return-void
.end method

.method private T()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/s3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static a(Lcom/ironsource/s3$h;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 39
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    .line 44
    const-string p1, "unexpected show failed, state - %s, error - %d %s"

    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private b(ILjava/lang/String;)V
    .locals 3

    .line 3
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    sget-object v2, Lcom/ironsource/s3$h;->f:Lcom/ironsource/s3$h;

    if-ne v1, v2, :cond_1

    .line 6
    sget-object v0, Lcom/ironsource/s3$h;->g:Lcom/ironsource/s3$h;

    invoke-virtual {p0, v0}, Lcom/ironsource/s3;->a(Lcom/ironsource/s3$h;)V

    .line 8
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    .line 10
    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    .line 11
    const-string v2, ""

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/ironsource/M;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_0
    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 17
    iget-object p1, p0, Lcom/ironsource/s3;->b:Lcom/ironsource/Q0;

    check-cast p1, Lcom/ironsource/I0;

    invoke-interface {p1, v0, p0}, Lcom/ironsource/I0;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/o3;)V

    return-void

    .line 19
    :cond_1
    invoke-static {v1, p1, p2}, Lcom/ironsource/o3;->a(Lcom/ironsource/s3$h;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 21
    iget-object p2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz p2, :cond_2

    .line 22
    iget-object p2, p2, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {p2, p1}, Lcom/ironsource/Sf;->t(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public B()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/s3;->k:Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/ironsource/s3;->y()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/s3;->c:Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;

    instance-of v2, v0, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;

    if-eqz v2, :cond_1

    .line 9
    check-cast v0, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;

    iget-object v2, p0, Lcom/ironsource/s3;->k:Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;

    invoke-interface {v0, v2}, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;->isAdAvailable(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;)Z

    move-result v0

    return v0

    .line 11
    :cond_1
    const-string v0, "isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"

    .line 13
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0, v0}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 14
    iget-object v2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v2, :cond_2

    .line 15
    iget-object v2, v2, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {v2, v0}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 20
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "isReadyToShow - exception = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " - state = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 22
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0, v0}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 23
    iget-object v2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v2, :cond_2

    .line 24
    iget-object v2, v2, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {v2, v0}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return v1
.end method

.method public a(Landroid/app/Activity;Lcom/ironsource/mediationsdk/model/Placement;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "placementName = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 7
    :try_start_0
    iput-object p2, p0, Lcom/ironsource/s3;->g:Lcom/ironsource/mediationsdk/model/Placement;

    .line 10
    sget-object p2, Lcom/ironsource/s3$h;->f:Lcom/ironsource/s3$h;

    invoke-virtual {p0, p2}, Lcom/ironsource/s3;->a(Lcom/ironsource/s3$h;)V

    .line 13
    iget-object p2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    iget-object p2, p2, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {p0}, Lcom/ironsource/s3;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Lcom/ironsource/M;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/ironsource/s3;->c:Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;

    instance-of p2, p1, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;

    if-eqz p2, :cond_0

    .line 17
    check-cast p1, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;

    iget-object p2, p0, Lcom/ironsource/s3;->k:Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;

    invoke-interface {p1, p2, p0}, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterAdFullScreenInterface;->showAd(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;)V

    return-void

    .line 19
    :cond_0
    const-string p1, "showAd - adapter not instance of AdapterAdFullScreenInterface"

    .line 20
    invoke-virtual {p0, p1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 21
    iget-object p2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz p2, :cond_2

    .line 22
    iget-object p2, p2, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {p2, p1}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 27
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 28
    sget-object p2, Lcom/ironsource/s3$h;->g:Lcom/ironsource/s3$h;

    invoke-virtual {p0, p2}, Lcom/ironsource/s3;->a(Lcom/ironsource/s3$h;)V

    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "showAd - exception = "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " - state = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Lcom/ironsource/s3;->e:Lcom/ironsource/s3$h;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0, p1}, Lcom/ironsource/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 33
    iget-object p2, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz p2, :cond_1

    .line 34
    iget-object p2, p2, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {p2, p1}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V

    .line 38
    :cond_1
    iget-object p2, p0, Lcom/ironsource/s3;->a:Lcom/ironsource/l0;

    invoke-virtual {p2}, Lcom/ironsource/l0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p2

    invoke-static {p2}, Lcom/ironsource/z0;->h(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result p2

    invoke-virtual {p0, p2, p1}, Lcom/ironsource/o3;->onAdShowFailed(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/s3;->d:Lcom/ironsource/D0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {v0, p1}, Lcom/ironsource/M;->a(Z)V

    :cond_0
    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/o3;->P()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$a;

    invoke-direct {v1, p0}, Lcom/ironsource/o3$a;-><init>(Lcom/ironsource/o3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdEnded()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/o3;->Q()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$c;

    invoke-direct {v1, p0}, Lcom/ironsource/o3$c;-><init>(Lcom/ironsource/o3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdShowFailed(ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/ironsource/o3;->b(ILjava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$f;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/o3$f;-><init>(Lcom/ironsource/o3;ILjava/lang/String;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdShowSuccess()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/o3;->R()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$e;

    invoke-direct {v1, p0}, Lcom/ironsource/o3$e;-><init>(Lcom/ironsource/o3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdStarted()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/o3;->S()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$b;

    invoke-direct {v1, p0}, Lcom/ironsource/o3$b;-><init>(Lcom/ironsource/o3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdVisible()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/hd;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/o3;->T()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/s3;->u()Lcom/ironsource/hd;

    move-result-object v0

    new-instance v1, Lcom/ironsource/o3$d;

    invoke-direct {v1, p0}, Lcom/ironsource/o3$d;-><init>(Lcom/ironsource/o3;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/ironsource/hd;->a(Ljava/lang/Runnable;)V

    return-void
.end method
