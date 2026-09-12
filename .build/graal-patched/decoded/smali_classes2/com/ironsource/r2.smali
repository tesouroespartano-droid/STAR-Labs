.class public Lcom/ironsource/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/V0;

.field private final b:Lcom/ironsource/v0;

.field private final c:Lcom/ironsource/mediationsdk/e;

.field private final d:Lcom/ironsource/e2;


# direct methods
.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V
    .locals 4

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    .line 7
    new-instance v0, Lcom/ironsource/mediationsdk/e;

    new-instance v1, Lcom/ironsource/mediationsdk/f;

    invoke-virtual {p2}, Lcom/ironsource/v0;->e()Lcom/ironsource/p2;

    move-result-object p2

    invoke-static {}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getSessionId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getSessionId()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p2, v2}, Lcom/ironsource/mediationsdk/f;-><init>(Lcom/ironsource/p2;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/ironsource/mediationsdk/e;-><init>(Lcom/ironsource/mediationsdk/f;)V

    iput-object v0, p0, Lcom/ironsource/r2;->c:Lcom/ironsource/mediationsdk/e;

    .line 8
    new-instance p2, Lcom/ironsource/e2;

    invoke-direct {p2, p1, v0}, Lcom/ironsource/e2;-><init>(Lcom/ironsource/V0;Lcom/ironsource/mediationsdk/e;)V

    iput-object p2, p0, Lcom/ironsource/r2;->d:Lcom/ironsource/e2;

    return-void
.end method

.method private final a(Lcom/ironsource/Q1;I)Lcom/ironsource/mediationsdk/i;
    .locals 2

    .line 12
    new-instance v0, Lcom/ironsource/mediationsdk/i;

    iget-object v1, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/mediationsdk/i;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 13
    invoke-static {}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->isEncryptedResponse()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/i;->b(Z)V

    .line 14
    invoke-virtual {p1}, Lcom/ironsource/Q1;->d()Lcom/ironsource/f2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f2;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/i;->a(Ljava/util/Map;)V

    .line 15
    invoke-virtual {p1}, Lcom/ironsource/Q1;->d()Lcom/ironsource/f2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/f2;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/i;->a(Ljava/util/List;)V

    .line 16
    iget-object p1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/V0;->h()Lcom/ironsource/R0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/i;->a(Lcom/ironsource/mediationsdk/h;)V

    .line 17
    invoke-virtual {v0, p2}, Lcom/ironsource/mediationsdk/i;->a(I)V

    .line 18
    iget-object p1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/V0;->k()Lcom/ironsource/mediationsdk/IronSourceSegment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/i;->a(Lcom/ironsource/mediationsdk/IronSourceSegment;)V

    .line 20
    iget-object p1, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-virtual {p1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/f0;->g()Lcom/ironsource/sf;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/sf;->b()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/i;->e(Z)V

    .line 23
    iget-object p1, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-virtual {p1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/f0;->d()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/i;->a(Ljava/lang/Double;)V

    .line 24
    iget-object p1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/V0;->i()Lcom/ironsource/h2;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Lcom/ironsource/h2;->a(Lcom/ironsource/mediationsdk/i;)V

    :cond_1
    return-object v0
.end method

.method private final a()Ljava/lang/String;
    .locals 3

    .line 26
    iget-object v0, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v1, v2, v1}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 25
    iget-object v0, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final a(Lcom/ironsource/Q1;Lcom/ironsource/s2;)V
    .locals 1

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/Q1;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/ironsource/r2;->b(Lcom/ironsource/Q1;Lcom/ironsource/s2;)V

    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/ironsource/r2$a;

    invoke-direct {v0, p0, p2}, Lcom/ironsource/r2$a;-><init>(Lcom/ironsource/r2;Lcom/ironsource/s2;)V

    .line 11
    invoke-virtual {p1, v0}, Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1$d;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/r2;Lcom/ironsource/Q1;Lcom/ironsource/s2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/r2;->b(Lcom/ironsource/Q1;Lcom/ironsource/s2;)V

    return-void
.end method

.method private final b(Lcom/ironsource/Q1;Lcom/ironsource/s2;)V
    .locals 4

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/Q1;->d()Lcom/ironsource/f2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f2;->c()Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "auction waterfallString = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ironsource/r2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/ironsource/Q1;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 8
    const-string p1, "auction failed - no candidates"

    invoke-direct {p0, p1}, Lcom/ironsource/r2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object p1

    const/16 v0, 0x3ed

    const-string v1, "No candidates available for auctioning"

    invoke-virtual {p1, v0, v1}, Lcom/ironsource/R1;->a(ILjava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-virtual {p1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p1

    invoke-static {p1}, Lcom/ironsource/z0;->e(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result p1

    .line 14
    const-string v0, "no available ad to load"

    invoke-interface {p2, p1, v0}, Lcom/ironsource/s2;->a(ILjava/lang/String;)V

    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object v0

    .line 19
    invoke-virtual {p1}, Lcom/ironsource/Q1;->d()Lcom/ironsource/f2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f2;->c()Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/ironsource/R1;->b(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->f()I

    move-result v0

    .line 24
    new-instance v1, Lcom/ironsource/r2$b;

    invoke-direct {v1, p2, p1}, Lcom/ironsource/r2$b;-><init>(Lcom/ironsource/s2;Lcom/ironsource/Q1;)V

    .line 60
    iget-object p2, p0, Lcom/ironsource/r2;->c:Lcom/ironsource/mediationsdk/e;

    .line 61
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 62
    invoke-direct {p0, p1, v0}, Lcom/ironsource/r2;->a(Lcom/ironsource/Q1;I)Lcom/ironsource/mediationsdk/i;

    move-result-object p1

    .line 63
    invoke-virtual {p2, v2, p1, v1}, Lcom/ironsource/mediationsdk/e;->a(Landroid/content/Context;Lcom/ironsource/mediationsdk/i;Lcom/ironsource/S1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/s2;)V
    .locals 3

    const-string v0, "completionListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-direct {p0}, Lcom/ironsource/r2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f0;->d()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/R1;->a(Ljava/lang/Double;)V

    .line 4
    new-instance v0, Lcom/ironsource/Q1;

    iget-object v1, p0, Lcom/ironsource/r2;->a:Lcom/ironsource/V0;

    iget-object v2, p0, Lcom/ironsource/r2;->b:Lcom/ironsource/v0;

    invoke-direct {v0, v1, v2}, Lcom/ironsource/Q1;-><init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V

    .line 5
    invoke-direct {p0, v0, p1}, Lcom/ironsource/r2;->a(Lcom/ironsource/Q1;Lcom/ironsource/s2;)V

    return-void
.end method

.method public final b()Lcom/ironsource/e2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/r2;->d:Lcom/ironsource/e2;

    return-object v0
.end method
