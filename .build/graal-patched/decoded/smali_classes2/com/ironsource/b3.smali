.class public final Lcom/ironsource/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/N0;

.field private final b:Lcom/ironsource/H0;

.field private final c:Lcom/ironsource/G2;

.field private final d:Lkotlin/Lazy;

.field private final e:Lkotlin/Lazy;

.field private final f:Z

.field private final g:Z

.field private final h:Z


# direct methods
.method public constructor <init>(Lcom/ironsource/N0;Lcom/ironsource/H0;Lcom/ironsource/G2;)V
    .locals 4

    const-string v0, "loadingData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactionData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/b3;->a:Lcom/ironsource/N0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/b3;->b:Lcom/ironsource/H0;

    .line 4
    iput-object p3, p0, Lcom/ironsource/b3;->c:Lcom/ironsource/G2;

    .line 6
    new-instance p3, Lcom/ironsource/b3$a;

    invoke-direct {p3, p0}, Lcom/ironsource/b3$a;-><init>(Lcom/ironsource/b3;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lcom/ironsource/b3;->d:Lkotlin/Lazy;

    .line 13
    new-instance p3, Lcom/ironsource/b3$b;

    invoke-direct {p3, p0}, Lcom/ironsource/b3$b;-><init>(Lcom/ironsource/b3;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lcom/ironsource/b3;->e:Lkotlin/Lazy;

    .line 74
    invoke-virtual {p1}, Lcom/ironsource/N0;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iput-boolean p3, p0, Lcom/ironsource/b3;->f:Z

    .line 76
    invoke-virtual {p2}, Lcom/ironsource/H0;->b()J

    move-result-wide p2

    cmp-long p2, p2, v2

    if-lez p2, :cond_1

    move p2, v0

    goto :goto_1

    :cond_1
    move p2, v1

    :goto_1
    iput-boolean p2, p0, Lcom/ironsource/b3;->g:Z

    .line 79
    invoke-virtual {p1}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object p1

    sget-object p2, Lcom/ironsource/N0$a;->c:Lcom/ironsource/N0$a;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/ironsource/b3;->h:Z

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/b3;)Lcom/ironsource/G2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/b3;->c:Lcom/ironsource/G2;

    return-object p0
.end method

.method private final a(J)V
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/ironsource/b3;->h:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ironsource/b3;->f:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/b3;->c()Lcom/ironsource/kb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ironsource/kb;->a(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final b(J)V
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/ironsource/b3;->h:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ironsource/b3;->g:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/b3;->d()Lcom/ironsource/kb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ironsource/kb;->a(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final c()Lcom/ironsource/kb;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b3;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/kb;

    return-object v0
.end method

.method private final d()Lcom/ironsource/kb;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b3;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/kb;

    return-object v0
.end method

.method private final f()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/b3;->h:Z

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/b3;->c()Lcom/ironsource/kb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/kb;->b()V

    return-void
.end method

.method private final g()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/b3;->h:Z

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/b3;->d()Lcom/ironsource/kb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/kb;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 3
    invoke-direct {p0}, Lcom/ironsource/b3;->f()V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 2
    invoke-direct {p0}, Lcom/ironsource/b3;->g()V

    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 2
    iget-object v0, p0, Lcom/ironsource/b3;->b:Lcom/ironsource/H0;

    invoke-virtual {v0}, Lcom/ironsource/H0;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/ironsource/b3;->b(J)V

    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/b3;->f:Z

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "banner reload interval is disabled"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 7
    iget-object v0, p0, Lcom/ironsource/b3;->a:Lcom/ironsource/N0;

    invoke-virtual {v0}, Lcom/ironsource/N0;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/ironsource/b3;->a(J)V

    return-void
.end method
