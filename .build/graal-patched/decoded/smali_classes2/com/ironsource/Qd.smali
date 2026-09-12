.class public Lcom/ironsource/Qd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/ironsource/p2;

.field private b:Lcom/ironsource/Rd;

.field private c:Ljava/util/Timer;


# direct methods
.method static bridge synthetic -$$Nest$fgetb(Lcom/ironsource/Qd;)Lcom/ironsource/Rd;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/Qd;->b:Lcom/ironsource/Rd;

    return-object p0
.end method

.method public constructor <init>(Lcom/ironsource/p2;Lcom/ironsource/Rd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Qd;->a:Lcom/ironsource/p2;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Qd;->b:Lcom/ironsource/Rd;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/ironsource/Qd;->c:Ljava/util/Timer;

    return-void
.end method

.method private d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Qd;->c:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ironsource/Qd;->c:Ljava/util/Timer;

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/ironsource/Qd;->d()V

    .line 2
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/ironsource/Qd;->c:Ljava/util/Timer;

    .line 3
    new-instance v1, Lcom/ironsource/Qd$b;

    invoke-direct {v1, p0}, Lcom/ironsource/Qd$b;-><init>(Lcom/ironsource/Qd;)V

    iget-object v2, p0, Lcom/ironsource/Qd;->a:Lcom/ironsource/p2;

    .line 10
    invoke-virtual {v2}, Lcom/ironsource/p2;->b()J

    move-result-wide v2

    .line 11
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/ironsource/Qd;->d()V

    .line 3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iget-object v0, p0, Lcom/ironsource/Qd;->b:Lcom/ironsource/Rd;

    invoke-interface {v0}, Lcom/ironsource/Rd;->b()V

    return-void

    :catchall_0
    move-exception v0

    .line 5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/ironsource/Qd;->d()V

    .line 2
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/ironsource/Qd;->c:Ljava/util/Timer;

    .line 3
    new-instance v1, Lcom/ironsource/Qd$a;

    invoke-direct {v1, p0}, Lcom/ironsource/Qd$a;-><init>(Lcom/ironsource/Qd;)V

    iget-object v2, p0, Lcom/ironsource/Qd;->a:Lcom/ironsource/p2;

    .line 10
    invoke-virtual {v2}, Lcom/ironsource/p2;->j()J

    move-result-wide v2

    .line 11
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
