.class public final Lcom/ironsource/w2;
.super Lcom/ironsource/m;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/P2;
.implements Lcom/ironsource/l3;
.implements Lcom/ironsource/m7;


# instance fields
.field private final b:Lcom/ironsource/n0;

.field private final c:Lcom/ironsource/K2;

.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/x2;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/unity3d/mediation/LevelPlayAdInfo;

.field private f:Lcom/unity3d/mediation/LevelPlayAdInfo;

.field private final g:Lcom/ironsource/j3;


# direct methods
.method public static synthetic $r8$lambda$mufXQJloY0H5pQbtvYL442jp-Yo(Lcom/ironsource/w2;Z)Lcom/ironsource/M2;
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/w2;->a(Lcom/ironsource/w2;Z)Lcom/ironsource/M2;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/ironsource/x2;Lcom/ironsource/n0;Lcom/ironsource/K2;Lcom/ironsource/X2;)V
    .locals 7

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adTools"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerViewContainer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/ironsource/m;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/ironsource/w2;->b:Lcom/ironsource/n0;

    .line 3
    iput-object p3, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    .line 8
    invoke-direct {p0}, Lcom/ironsource/w2;->r()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 9
    invoke-direct {p0}, Lcom/ironsource/w2;->r()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/w2;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 12
    sget-object v0, Lcom/ironsource/j3;->c:Lcom/ironsource/j3$a;

    .line 15
    invoke-direct {p0}, Lcom/ironsource/w2;->q()Lcom/ironsource/j3$b;

    move-result-object v3

    .line 18
    invoke-direct {p0}, Lcom/ironsource/w2;->p()Lcom/ironsource/O2;

    move-result-object v6

    move-object v5, p0

    move-object v1, p2

    move-object v4, p3

    move-object v2, p4

    .line 19
    invoke-virtual/range {v0 .. v6}, Lcom/ironsource/j3$a;->a(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/j3$b;Lcom/ironsource/K2;Lcom/ironsource/l3;Lcom/ironsource/O2;)Lcom/ironsource/j3;

    move-result-object p1

    iput-object p1, v5, Lcom/ironsource/w2;->g:Lcom/ironsource/j3;

    return-void
.end method

.method private final a(Lcom/ironsource/n0;Lcom/ironsource/K2;Z)Lcom/ironsource/M2;
    .locals 2

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 4
    sget-object v0, Lcom/ironsource/N2;->z:Lcom/ironsource/N2$a;

    .line 5
    invoke-virtual {p0}, Lcom/ironsource/m;->o()Lcom/ironsource/I8;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/I8;->a()Lcom/ironsource/Ra;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p2, v1, p3}, Lcom/ironsource/N2$a;->a(Lcom/ironsource/K2;Lcom/ironsource/Ra;Z)Lcom/ironsource/N2;

    move-result-object p2

    .line 8
    new-instance p3, Lcom/ironsource/M2;

    invoke-direct {p3, p1, p2, p0}, Lcom/ironsource/M2;-><init>(Lcom/ironsource/n0;Lcom/ironsource/N2;Lcom/ironsource/P2;)V

    return-object p3
.end method

.method private static final a(Lcom/ironsource/w2;Z)Lcom/ironsource/M2;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->b:Lcom/ironsource/n0;

    iget-object v1, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-direct {p0, v0, v1, p1}, Lcom/ironsource/w2;->a(Lcom/ironsource/n0;Lcom/ironsource/K2;Z)Lcom/ironsource/M2;

    move-result-object p0

    return-object p0
.end method

.method private final p()Lcom/ironsource/O2;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/w2$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/ironsource/w2$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/w2;)V

    return-object v0
.end method

.method private final q()Lcom/ironsource/j3$b;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->b:Lcom/ironsource/n0;

    iget-object v1, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v1}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/n0;->d(Ljava/lang/String;)Lcom/ironsource/Qa$a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v1}, Lcom/ironsource/K2;->j()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ironsource/Qa$a;->d()J

    move-result-wide v1

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v3}, Lcom/ironsource/K2;->i()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/ironsource/Qa$a;->f()Z

    move-result v0

    .line 5
    :goto_1
    new-instance v3, Lcom/ironsource/j3$b;

    invoke-direct {v3, v1, v2, v0}, Lcom/ironsource/j3$b;-><init>(JZ)V

    return-object v3
.end method

.method private final r()Lcom/unity3d/mediation/LevelPlayAdInfo;
    .locals 10

    .line 1
    new-instance v0, Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 2
    iget-object v1, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v1}, Lcom/ironsource/f0;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bannerAdProperties.adId.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v2, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v2}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v3}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "bannerAdProperties.adFormat.toString()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 5
    invoke-direct/range {v0 .. v9}, Lcom/unity3d/mediation/LevelPlayAdInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;Lcom/ironsource/ob;Lcom/unity3d/mediation/LevelPlayAdSize;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->g:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->g:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->c()V

    return-void
.end method

.method public c(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 4

    .line 5
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lcom/unity3d/mediation/LevelPlayAdError;

    .line 9
    iget-object v2, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v2}, Lcom/ironsource/f0;->b()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bannerAdProperties.adId.toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v3}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-direct {v1, p1, v2, v3}, Lcom/unity3d/mediation/LevelPlayAdError;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-interface {v0, v1}, Lcom/ironsource/x2;->a(Lcom/unity3d/mediation/LevelPlayAdError;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/ironsource/s0;)V
    .locals 2

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/ironsource/s0;->c()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/ironsource/w2;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 4
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/ironsource/x2;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;Z)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->g:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->d()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->g:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->e()V

    return-void
.end method

.method public e(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 6
    new-instance v2, Lcom/unity3d/mediation/LevelPlayAdError;

    .line 7
    iget-object v3, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v3}, Lcom/ironsource/f0;->b()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "bannerAdProperties.adId.toString()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ironsource/w2;->c:Lcom/ironsource/K2;

    invoke-virtual {v4}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-direct {v2, p1, v3, v4}, Lcom/unity3d/mediation/LevelPlayAdError;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-interface {v0, v1, v2}, Lcom/ironsource/x2;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/unity3d/mediation/LevelPlayAdError;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/x2;->d(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    iput-object v0, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 2
    invoke-direct {p0}, Lcom/ironsource/w2;->r()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/w2;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 3
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/x2;->b(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic i()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/w2;->s()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic j()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/w2;->u()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic m()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/w2;->t()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/x2;->e(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/x2;->c(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w2;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/x2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/w2;->e:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/x2;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method
