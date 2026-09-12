.class public final Lcom/ironsource/Ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private final b:Lcom/ironsource/M2;

.field private final c:Lcom/ironsource/M2;

.field private final d:J

.field private e:Lcom/ironsource/fb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ironsource/fb<",
            "Lcom/unity3d/mediation/LevelPlayAdInfo;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/ironsource/if$a;


# direct methods
.method public static synthetic $r8$lambda$5OEzBvnjWrtEiEpbdHBlX2Pl-OY(Lcom/ironsource/Ea;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Ea;->a(Lcom/ironsource/Ea;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/M2;J)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadingAdUnit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    .line 5
    iput-wide p4, p0, Lcom/ironsource/Ea;->d:J

    .line 11
    invoke-direct {p0}, Lcom/ironsource/Ea;->g()V

    return-void
.end method

.method private static final a(Lcom/ironsource/Ea;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Lcom/ironsource/Ea;->f()V

    return-void
.end method

.method private final a(Lcom/ironsource/fb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/fb<",
            "Lcom/unity3d/mediation/LevelPlayAdInfo;",
            ">;)V"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ironsource/Ea;->e:Lcom/ironsource/fb;

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    invoke-static {p1}, Lcom/ironsource/Fa;->a(Lcom/ironsource/fb;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received excessive load "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " while reloading"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/ironsource/Ea;->e:Lcom/ironsource/fb;

    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 9

    .line 8
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/Ea;->d:J

    sub-long/2addr v0, v2

    .line 9
    new-instance v3, Lcom/ironsource/s0;

    iget-object v2, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    invoke-direct {v3, v2, p1}, Lcom/ironsource/s0;-><init>(Lcom/ironsource/o0;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    .line 10
    iget-object v2, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 12
    iget-object v4, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    .line 13
    iget-object v5, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    .line 15
    new-instance v6, Lcom/ironsource/k3$c;

    .line 16
    sget-object p1, Lcom/ironsource/k3$d$h;->a:Lcom/ironsource/k3$d$h;

    .line 17
    invoke-direct {v6, v0, v1, p1}, Lcom/ironsource/k3$c;-><init>(JLcom/ironsource/k3$d;)V

    .line 20
    iget-wide v0, p0, Lcom/ironsource/Ea;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v7, 0x0

    .line 21
    invoke-virtual/range {v2 .. v8}, Lcom/ironsource/xa;->a(Lcom/ironsource/s0;Lcom/ironsource/M2;Lcom/ironsource/M2;Lcom/ironsource/k3;ZLjava/lang/Long;)V

    return-void
.end method

.method private final b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/Ea;->d:J

    sub-long/2addr v0, v2

    .line 3
    iget-object v2, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 5
    iget-object v4, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    .line 7
    new-instance v5, Lcom/ironsource/k3$c;

    .line 8
    sget-object v3, Lcom/ironsource/k3$d$g;->a:Lcom/ironsource/k3$d$g;

    .line 9
    invoke-direct {v5, v0, v1, v3}, Lcom/ironsource/k3$c;-><init>(JLcom/ironsource/k3$d;)V

    .line 13
    iget-wide v0, p0, Lcom/ironsource/Ea;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, p1

    .line 14
    invoke-virtual/range {v2 .. v8}, Lcom/ironsource/xa;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/M2;Lcom/ironsource/k3;ZZLjava/lang/Long;)V

    return-void
.end method

.method private final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ea;->e:Lcom/ironsource/fb;

    if-nez v0, :cond_0

    .line 3
    iget-object v2, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 4
    new-instance v1, Lcom/ironsource/Ga;

    .line 6
    iget-object v3, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    .line 7
    iget-object v4, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    .line 8
    iget-wide v5, p0, Lcom/ironsource/Ea;->d:J

    .line 9
    invoke-direct/range {v1 .. v6}, Lcom/ironsource/Ga;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/M2;J)V

    .line 10
    invoke-virtual {v2, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void

    .line 19
    :cond_0
    instance-of v1, v0, Lcom/ironsource/fb$b;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/ironsource/fb$b;

    invoke-virtual {v0}, Lcom/ironsource/fb$b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-direct {p0, v0}, Lcom/ironsource/Ea;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void

    .line 20
    :cond_1
    instance-of v1, v0, Lcom/ironsource/fb$a;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/ironsource/fb$a;

    invoke-virtual {v0}, Lcom/ironsource/fb$a;->b()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ironsource/Ea;->b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_2
    return-void
.end method

.method private final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->o()Lcom/ironsource/if;

    move-result-object v0

    new-instance v1, Lcom/ironsource/Ea$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/ironsource/Ea$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Ea;)V

    .line 3
    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v2, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    invoke-virtual {v2}, Lcom/ironsource/xa;->l()J

    move-result-wide v2

    sget-object v4, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v2, v3, v4}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v2

    .line 4
    invoke-interface {v0, v1, v2, v3}, Lcom/ironsource/if;->a(Ljava/lang/Runnable;J)Lcom/ironsource/if$a;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/ironsource/Ea;->f:Lcom/ironsource/if$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/4 v0, 0x0

    const-string v1, "Unknown error"

    invoke-direct {p1, v0, v1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 7
    :cond_0
    new-instance v0, Lcom/ironsource/fb$a;

    invoke-direct {v0, p1}, Lcom/ironsource/fb$a;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-direct {p0, v0}, Lcom/ironsource/Ea;->a(Lcom/ironsource/fb;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 3

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/ironsource/s0;->c()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Lcom/ironsource/fb$b;

    invoke-direct {v0, p1}, Lcom/ironsource/fb$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/ironsource/Ea;->a(Lcom/ironsource/fb;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Lcom/ironsource/fb$a;

    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/4 v1, 0x0

    const-string v2, "Missing ad info"

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/ironsource/fb$a;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-direct {p0, p1}, Lcom/ironsource/Ea;->a(Lcom/ironsource/fb;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    const-string v1, "Loading an ad while reloading"

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ea;->f:Lcom/ironsource/if$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/if$a;->a()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ea;->f:Lcom/ironsource/if$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/if$a;->a()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 3
    new-instance v1, Lcom/ironsource/Da;

    iget-object v2, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    invoke-direct {v1, v0, v2}, Lcom/ironsource/Da;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public e()V
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/ironsource/Ea;->a:Lcom/ironsource/xa;

    .line 2
    new-instance v0, Lcom/ironsource/Ea;

    .line 4
    iget-object v2, p0, Lcom/ironsource/Ea;->b:Lcom/ironsource/M2;

    .line 5
    iget-object v3, p0, Lcom/ironsource/Ea;->c:Lcom/ironsource/M2;

    .line 6
    invoke-virtual {v1}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v4

    invoke-interface {v4}, Lcom/ironsource/s4;->a()J

    move-result-wide v4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/ironsource/Ea;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/M2;J)V

    .line 8
    invoke-virtual {v1, v0}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method
