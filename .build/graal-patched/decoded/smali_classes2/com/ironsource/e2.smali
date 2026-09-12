.class public final Lcom/ironsource/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Lc;


# instance fields
.field private final a:Lcom/ironsource/V0;

.field private final b:Lcom/ironsource/mediationsdk/e;

.field private c:Z


# direct methods
.method public static synthetic $r8$lambda$9wjjnRqQN6KeBRPk2fYWDj_QLMI(Lcom/ironsource/e2;Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/e2;->a(Lcom/ironsource/e2;Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/mediationsdk/e;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/e2;->a:Lcom/ironsource/V0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/e2;->b:Lcom/ironsource/mediationsdk/e;

    return-void
.end method

.method private static final a(Lcom/ironsource/e2;Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 56
    iget-object p0, p0, Lcom/ironsource/e2;->a:Lcom/ironsource/V0;

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onImpressionSuccess "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 58
    invoke-static {p0, v1, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 59
    invoke-virtual {v0, p0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 62
    invoke-interface {p1, p2}, Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;->onImpressionSuccess(Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V

    return-void
.end method

.method private final a(Lcom/ironsource/fa;Lcom/ironsource/n2;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 38
    invoke-virtual {p2, p3}, Lcom/ironsource/n2;->a(Ljava/lang/String;)Lcom/ironsource/mediationsdk/impressionData/ImpressionData;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 41
    new-instance p3, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/ironsource/fa;->a()Ljava/util/HashSet;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 42
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;

    .line 43
    iget-object v0, p0, Lcom/ironsource/e2;->a:Lcom/ironsource/V0;

    new-instance v1, Lcom/ironsource/e2$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p3, p2}, Lcom/ironsource/e2$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/e2;Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->e(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void

    .line 53
    :cond_1
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object p2, p0, Lcom/ironsource/e2;->a:Lcom/ironsource/V0;

    const/4 p3, 0x2

    const-string v0, "reportImpressionDataToPublisher - no auctionResponseItem or listener"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p3, v1}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcom/ironsource/e2;->a:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/z;Ljava/lang/String;Lcom/ironsource/fa;)V
    .locals 4

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publisherDataHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/e2;->b:Lcom/ironsource/mediationsdk/e;

    .line 2
    invoke-virtual {p1}, Lcom/ironsource/z;->h()Lcom/ironsource/n2;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/z;->r()I

    move-result v2

    .line 4
    invoke-virtual {p1}, Lcom/ironsource/z;->m()Lcom/ironsource/n2;

    move-result-object v3

    .line 5
    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/ironsource/mediationsdk/e;->a(Lcom/ironsource/n2;ILcom/ironsource/n2;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/ironsource/z;->h()Lcom/ironsource/n2;

    move-result-object p1

    .line 14
    invoke-direct {p0, p3, p1, p2}, Lcom/ironsource/e2;->a(Lcom/ironsource/fa;Lcom/ironsource/n2;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/List;Lcom/ironsource/z;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/z;",
            ">;",
            "Lcom/ironsource/z;",
            ")V"
        }
    .end annotation

    const-string v0, "waterfallInstances"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "winnerInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-boolean v0, p0, Lcom/ironsource/e2;->c:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lcom/ironsource/e2;->c:Z

    .line 17
    invoke-virtual {p2}, Lcom/ironsource/z;->h()Lcom/ironsource/n2;

    move-result-object v6

    .line 18
    iget-object v0, p0, Lcom/ironsource/e2;->b:Lcom/ironsource/mediationsdk/e;

    .line 20
    invoke-virtual {p2}, Lcom/ironsource/z;->r()I

    move-result v1

    .line 21
    invoke-virtual {p2}, Lcom/ironsource/z;->m()Lcom/ironsource/n2;

    move-result-object v2

    .line 22
    invoke-virtual {v0, v6, v1, v2}, Lcom/ironsource/mediationsdk/e;->a(Lcom/ironsource/n2;ILcom/ironsource/n2;)V

    .line 26
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/z;

    .line 29
    invoke-virtual {v0}, Lcom/ironsource/z;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    invoke-virtual {v0}, Lcom/ironsource/z;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ironsource/z;->h()Lcom/ironsource/n2;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, p0, Lcom/ironsource/e2;->b:Lcom/ironsource/mediationsdk/e;

    .line 35
    invoke-virtual {p2}, Lcom/ironsource/z;->r()I

    move-result v4

    .line 36
    invoke-virtual {p2}, Lcom/ironsource/z;->m()Lcom/ironsource/n2;

    move-result-object v5

    .line 37
    invoke-virtual/range {v1 .. v6}, Lcom/ironsource/mediationsdk/e;->a(Ljava/util/ArrayList;Ljava/util/concurrent/ConcurrentHashMap;ILcom/ironsource/n2;Lcom/ironsource/n2;)V

    :cond_1
    return-void
.end method
