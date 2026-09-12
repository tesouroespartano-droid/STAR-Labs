.class public final Lcom/ironsource/Jf;
.super Lcom/ironsource/j3;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/L0;
.implements Lcom/ironsource/x0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Jf$a;
    }
.end annotation


# instance fields
.field private final d:Lcom/ironsource/n0;

.field private final e:Lcom/ironsource/X2;

.field private final f:Lcom/ironsource/l3;

.field private final g:Lcom/ironsource/O2;

.field private h:Lcom/ironsource/Rf;

.field private final i:Lcom/ironsource/w1;

.field private final j:Lcom/ironsource/hg;

.field private final k:Lcom/ironsource/yb;

.field private l:Lcom/ironsource/Jf$a;

.field private m:Lcom/ironsource/Jf$a;

.field private n:Z

.field private o:Z

.field private p:Lcom/ironsource/s0;

.field private q:Lcom/ironsource/mediationsdk/logger/IronSourceError;


# direct methods
.method public static synthetic $r8$lambda$FE8hQzFJf08HBITXpxTAMBxbpjQ(Lcom/ironsource/Jf;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Jf;->b(Lcom/ironsource/Jf;)V

    return-void
.end method

.method public static synthetic $r8$lambda$SIc1qg94N4eeRXA4xP5hGbUVth4(Lcom/ironsource/Jf;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Jf;->a(Lcom/ironsource/Jf;)V

    return-void
.end method

.method public static synthetic $r8$lambda$SuoioKjrjF202L7XrLlxDUqEgl0(Lcom/ironsource/Jf;[Lcom/ironsource/Uc;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Jf;->a(Lcom/ironsource/Jf;[Lcom/ironsource/Uc;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/j3$b;Lcom/ironsource/K2;Lcom/ironsource/l3;Lcom/ironsource/O2;)V
    .locals 3

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdProperties"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerStrategyListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdUnitFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3, p4}, Lcom/ironsource/j3;-><init>(Lcom/ironsource/j3$b;Lcom/ironsource/K2;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Jf;->d:Lcom/ironsource/n0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Jf;->e:Lcom/ironsource/X2;

    .line 6
    iput-object p5, p0, Lcom/ironsource/Jf;->f:Lcom/ironsource/l3;

    .line 7
    iput-object p6, p0, Lcom/ironsource/Jf;->g:Lcom/ironsource/O2;

    .line 16
    sget-object p3, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 18
    invoke-virtual {p0}, Lcom/ironsource/j3;->g()J

    move-result-wide p4

    invoke-virtual {p0}, Lcom/ironsource/j3;->h()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "refresh interval: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p4

    const-string p5, ", auto refresh: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 p5, 0x0

    const/4 v0, 0x2

    .line 19
    invoke-static {p1, p4, p5, v0, p5}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    .line 20
    invoke-virtual {p3, p4}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 38
    new-instance p3, Lcom/ironsource/w1;

    invoke-virtual {p1}, Lcom/ironsource/n0;->b()Lcom/ironsource/lifecycle/b;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ironsource/w1;-><init>(Lcom/ironsource/lifecycle/b;)V

    iput-object p3, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    .line 39
    new-instance p1, Lcom/ironsource/hg;

    invoke-direct {p1, p2}, Lcom/ironsource/hg;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/ironsource/Jf;->j:Lcom/ironsource/hg;

    .line 40
    new-instance p1, Lcom/ironsource/yb;

    invoke-virtual {p0}, Lcom/ironsource/j3;->h()Z

    move-result p2

    const/4 p3, 0x1

    xor-int/2addr p2, p3

    invoke-direct {p1, p2}, Lcom/ironsource/yb;-><init>(Z)V

    iput-object p1, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    .line 42
    new-instance p1, Lcom/ironsource/Jf$a;

    invoke-direct {p1, p0, p6, p3}, Lcom/ironsource/Jf$a;-><init>(Lcom/ironsource/Jf;Lcom/ironsource/O2;Z)V

    iput-object p1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    .line 44
    iput-boolean p3, p0, Lcom/ironsource/Jf;->o:Z

    return-void
.end method

.method private static final a(Lcom/ironsource/Jf;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/Jf;->n:Z

    .line 2
    iget-object v1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v1}, Lcom/ironsource/Jf$a;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/ironsource/Jf;->l()V

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v1}, Lcom/ironsource/Jf$a;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/ironsource/Jf;->i()V

    .line 7
    iget-object v1, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    iget-object v2, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/ironsource/Uc;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    aput-object v2, v3, v0

    invoke-direct {p0, v3}, Lcom/ironsource/Jf;->a([Lcom/ironsource/Uc;)V

    :cond_1
    return-void
.end method

.method private static final a(Lcom/ironsource/Jf;[Lcom/ironsource/Uc;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$triggers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/ironsource/Jf;->h:Lcom/ironsource/Rf;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/Rf;->c()V

    .line 12
    :cond_0
    new-instance v1, Lcom/ironsource/Rf;

    .line 13
    iget-object v2, p0, Lcom/ironsource/Jf;->d:Lcom/ironsource/n0;

    .line 14
    new-instance v3, Lcom/ironsource/Jf$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/ironsource/Jf$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Jf;)V

    .line 16
    invoke-virtual {p0}, Lcom/ironsource/j3;->g()J

    move-result-wide v4

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/ironsource/Rf;-><init>(Lcom/ironsource/n0;Ljava/lang/Runnable;JLjava/util/List;)V

    .line 18
    iput-object v1, p0, Lcom/ironsource/Jf;->h:Lcom/ironsource/Rf;

    return-void
.end method

.method private final varargs a([Lcom/ironsource/Uc;)V
    .locals 2

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/ironsource/Jf;->n:Z

    .line 9
    iget-object v0, p0, Lcom/ironsource/Jf;->d:Lcom/ironsource/n0;

    new-instance v1, Lcom/ironsource/Jf$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/Jf$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Jf;[Lcom/ironsource/Uc;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final b(Lcom/ironsource/Jf;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/ironsource/Jf;->j()V

    return-void
.end method

.method private final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/j3;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/ironsource/Jf$a;

    iget-object v1, p0, Lcom/ironsource/Jf;->g:Lcom/ironsource/O2;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/ironsource/Jf$a;-><init>(Lcom/ironsource/Jf;Lcom/ironsource/O2;Z)V

    iput-object v0, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/Jf$a;->e()V

    :cond_0
    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf;->d:Lcom/ironsource/n0;

    new-instance v1, Lcom/ironsource/Jf$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/ironsource/Jf$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/Jf;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf;->f:Lcom/ironsource/l3;

    iget-object v1, p0, Lcom/ironsource/Jf;->q:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-interface {v0, v1}, Lcom/ironsource/l3;->c(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ironsource/Jf;->p:Lcom/ironsource/s0;

    .line 3
    iput-object v0, p0, Lcom/ironsource/Jf;->q:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    return-void
.end method

.method private final l()V
    .locals 5

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/Jf;->o:Z

    .line 2
    iget-object v1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v1}, Lcom/ironsource/Jf$a;->b()Lcom/ironsource/M2;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/Jf;->e:Lcom/ironsource/X2;

    invoke-virtual {v2}, Lcom/ironsource/X2;->getViewBinder()Lcom/ironsource/eg;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Lcom/ironsource/M2;->a(Lcom/ironsource/eg;Lcom/ironsource/x0;)V

    .line 3
    iget-object v1, p0, Lcom/ironsource/Jf;->f:Lcom/ironsource/l3;

    iget-object v2, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v2}, Lcom/ironsource/Jf$a;->a()Lcom/ironsource/s0;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ironsource/l3;->c(Lcom/ironsource/s0;)V

    .line 4
    iget-object v1, p0, Lcom/ironsource/Jf;->l:Lcom/ironsource/Jf$a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/ironsource/Jf$a;->a(Z)V

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    iput-object v1, p0, Lcom/ironsource/Jf;->l:Lcom/ironsource/Jf$a;

    .line 6
    invoke-direct {p0}, Lcom/ironsource/Jf;->i()V

    .line 7
    iget-object v1, p0, Lcom/ironsource/Jf;->j:Lcom/ironsource/hg;

    iget-object v2, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    iget-object v3, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/ironsource/Uc;

    aput-object v1, v4, v0

    const/4 v0, 0x1

    aput-object v2, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    invoke-direct {p0, v4}, Lcom/ironsource/Jf;->a([Lcom/ironsource/Uc;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 4

    .line 23
    iget-object v0, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/Jf$a;->b(Z)V

    .line 24
    iput-object p1, p0, Lcom/ironsource/Jf;->q:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 25
    iget-boolean p1, p0, Lcom/ironsource/Jf;->o:Z

    const/4 v0, 0x1

    const/4 v2, 0x2

    if-eqz p1, :cond_0

    .line 26
    invoke-direct {p0}, Lcom/ironsource/Jf;->k()V

    .line 27
    iget-object p1, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    iget-object v3, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    new-array v2, v2, [Lcom/ironsource/Uc;

    aput-object p1, v2, v1

    aput-object v3, v2, v0

    invoke-direct {p0, v2}, Lcom/ironsource/Jf;->a([Lcom/ironsource/Uc;)V

    return-void

    .line 28
    :cond_0
    iget-boolean p1, p0, Lcom/ironsource/Jf;->n:Z

    if-eqz p1, :cond_1

    .line 29
    invoke-direct {p0}, Lcom/ironsource/Jf;->k()V

    .line 30
    invoke-direct {p0}, Lcom/ironsource/Jf;->i()V

    .line 31
    iget-object p1, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    iget-object v3, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    new-array v2, v2, [Lcom/ironsource/Uc;

    aput-object p1, v2, v1

    aput-object v3, v2, v0

    invoke-direct {p0, v2}, Lcom/ironsource/Jf;->a([Lcom/ironsource/Uc;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v0, p1}, Lcom/ironsource/Jf$a;->a(Lcom/ironsource/s0;)V

    .line 20
    iget-object p1, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ironsource/Jf$a;->b(Z)V

    .line 21
    iget-boolean p1, p0, Lcom/ironsource/Jf;->n:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/ironsource/Jf;->o:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 22
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/ironsource/Jf;->l()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v0}, Lcom/ironsource/Jf$a;->e()V

    return-void
.end method

.method public b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ironsource/Jf;->f:Lcom/ironsource/l3;

    invoke-interface {v0, p1}, Lcom/ironsource/l3;->e(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf;->i:Lcom/ironsource/w1;

    invoke-virtual {v0}, Lcom/ironsource/w1;->e()V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Jf;->j:Lcom/ironsource/hg;

    invoke-virtual {v0}, Lcom/ironsource/hg;->e()V

    .line 3
    iget-object v0, p0, Lcom/ironsource/Jf;->h:Lcom/ironsource/Rf;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/Rf;->c()V

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/ironsource/Jf;->h:Lcom/ironsource/Rf;

    .line 5
    iget-object v0, p0, Lcom/ironsource/Jf;->l:Lcom/ironsource/Jf$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lcom/ironsource/Jf$a;->a(Z)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/ironsource/Jf;->m:Lcom/ironsource/Jf$a;

    invoke-virtual {v0, v1}, Lcom/ironsource/Jf$a;->a(Z)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/j3;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    invoke-virtual {v0}, Lcom/ironsource/yb;->e()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/j3;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/Jf;->k:Lcom/ironsource/yb;

    invoke-virtual {v0}, Lcom/ironsource/yb;->f()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf;->f:Lcom/ironsource/l3;

    invoke-interface {v0}, Lcom/ironsource/l3;->h()V

    return-void
.end method
