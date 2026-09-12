.class public final Lcom/ironsource/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/pb;
.implements Lcom/ironsource/B2;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBannerLoadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerLoadTask.kt\ncom/unity3d/ironsourceads/internal/load/banners/BannerLoadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

.field private final b:Lcom/unity3d/ironsourceads/AdSize;

.field private final c:Lcom/ironsource/m2;

.field private final d:Lcom/ironsource/qb;

.field private final e:Lcom/ironsource/jc;

.field private final f:Lcom/ironsource/p1;

.field private final g:Lcom/ironsource/T;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ironsource/T<",
            "Lcom/unity3d/ironsourceads/banner/BannerAdView;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/ironsource/E2;

.field private final i:Lcom/ironsource/Kf$c;

.field private final j:Ljava/util/concurrent/Executor;

.field private k:Lcom/ironsource/k5;

.field private l:Lcom/ironsource/Kf;

.field private m:Lcom/ironsource/W1;

.field private n:Z


# direct methods
.method public static synthetic $r8$lambda$--yhSemxKvI_LAbzSdlgen6Xnm0(Lcom/ironsource/d3;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/d3;->a(Lcom/ironsource/d3;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$xDeyje81YzPJD9v-a1MSLeQwdRM(Lcom/ironsource/d3;Lcom/ironsource/G9;Lcom/ironsource/h8;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/d3;->a(Lcom/ironsource/d3;Lcom/ironsource/G9;Lcom/ironsource/h8;)V

    return-void
.end method

.method public constructor <init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/m2;Lcom/ironsource/qb;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/T;Lcom/ironsource/E2;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;",
            "Lcom/unity3d/ironsourceads/AdSize;",
            "Lcom/ironsource/m2;",
            "Lcom/ironsource/qb;",
            "Lcom/ironsource/jc;",
            "Lcom/ironsource/p1;",
            "Lcom/ironsource/T<",
            "Lcom/unity3d/ironsourceads/banner/BannerAdView;",
            ">;",
            "Lcom/ironsource/E2;",
            "Lcom/ironsource/Kf$c;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    const-string v0, "adRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionResponseFetcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadTaskConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkLoadApi"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adLoadTaskListener"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adLayoutFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerFactory"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskFinishedExecutor"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    .line 3
    iput-object p2, p0, Lcom/ironsource/d3;->b:Lcom/unity3d/ironsourceads/AdSize;

    .line 4
    iput-object p3, p0, Lcom/ironsource/d3;->c:Lcom/ironsource/m2;

    .line 5
    iput-object p4, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    .line 6
    iput-object p5, p0, Lcom/ironsource/d3;->e:Lcom/ironsource/jc;

    .line 7
    iput-object p6, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    .line 8
    iput-object p7, p0, Lcom/ironsource/d3;->g:Lcom/ironsource/T;

    .line 9
    iput-object p8, p0, Lcom/ironsource/d3;->h:Lcom/ironsource/E2;

    .line 10
    iput-object p9, p0, Lcom/ironsource/d3;->i:Lcom/ironsource/Kf$c;

    .line 11
    iput-object p10, p0, Lcom/ironsource/d3;->j:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/m2;Lcom/ironsource/qb;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/T;Lcom/ironsource/E2;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 12
    new-instance v1, Lcom/ironsource/Kf$d;

    invoke-direct {v1}, Lcom/ironsource/Kf$d;-><init>()V

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object/from16 v11, p9

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    .line 13
    sget-object v0, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    invoke-virtual {v0}, Lcom/ironsource/T7;->c()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    move-object v12, v0

    goto :goto_1

    :cond_1
    move-object/from16 v12, p10

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    .line 14
    invoke-direct/range {v2 .. v12}, Lcom/ironsource/d3;-><init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/m2;Lcom/ironsource/qb;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/T;Lcom/ironsource/E2;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private final a(Landroid/os/Bundle;)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    sget-object v0, Lcom/ironsource/T5;->a:Lcom/ironsource/T5;

    invoke-virtual {v0, p1}, Lcom/ironsource/T5;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 4
    sget-object v3, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    new-instance v4, Lcom/ironsource/l1$l;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/ironsource/l1$l;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lcom/ironsource/i1$c$a;->a(Lcom/ironsource/l1$l;)Lcom/ironsource/i1;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    invoke-interface {v1, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private static final a(Lcom/ironsource/d3;Lcom/ironsource/G9;Lcom/ironsource/h8;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lcom/ironsource/d3;->n:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/ironsource/d3;->n:Z

    .line 11
    iget-object v0, p0, Lcom/ironsource/d3;->l:Lcom/ironsource/Kf;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ironsource/Kf;->cancel()V

    .line 14
    :cond_1
    new-instance v0, Lcom/ironsource/l1$f;

    iget-object v1, p0, Lcom/ironsource/d3;->k:Lcom/ironsource/k5;

    if-nez v1, :cond_2

    const-string v1, "taskStartedTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    invoke-static {v1}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/l1$f;-><init>(J)V

    .line 15
    sget-object v1, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    invoke-virtual {v1, v0}, Lcom/ironsource/i1$c$a;->a(Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 17
    iget-object v0, p0, Lcom/ironsource/d3;->m:Lcom/ironsource/W1;

    if-eqz v0, :cond_3

    const-string v1, "onBannerLoadSuccess"

    invoke-virtual {v0, v1}, Lcom/ironsource/W1;->c(Ljava/lang/String;)V

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/ironsource/d3;->h:Lcom/ironsource/E2;

    iget-object v1, p0, Lcom/ironsource/d3;->m:Lcom/ironsource/W1;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/ironsource/E2;->a(Lcom/ironsource/G9;Lcom/ironsource/h8;Lcom/ironsource/W1;)Lcom/unity3d/ironsourceads/banner/BannerAdView;

    move-result-object p1

    .line 20
    iget-object p0, p0, Lcom/ironsource/d3;->g:Lcom/ironsource/T;

    invoke-interface {p0, p1}, Lcom/ironsource/T;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/d3;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-boolean v0, p0, Lcom/ironsource/d3;->n:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/ironsource/d3;->n:Z

    .line 27
    iget-object v0, p0, Lcom/ironsource/d3;->l:Lcom/ironsource/Kf;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ironsource/Kf;->cancel()V

    .line 29
    :cond_1
    sget-object v0, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    .line 30
    new-instance v1, Lcom/ironsource/l1$j;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ironsource/l1$j;-><init>(I)V

    .line 31
    new-instance v2, Lcom/ironsource/l1$k;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ironsource/l1$k;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance v3, Lcom/ironsource/l1$f;

    .line 33
    iget-object v4, p0, Lcom/ironsource/d3;->k:Lcom/ironsource/k5;

    if-nez v4, :cond_2

    const-string v4, "taskStartedTime"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2
    invoke-static {v4}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v4

    .line 34
    invoke-direct {v3, v4, v5}, Lcom/ironsource/l1$f;-><init>(J)V

    .line 35
    invoke-virtual {v0, v1, v2, v3}, Lcom/ironsource/i1$c$a;->a(Lcom/ironsource/l1$j;Lcom/ironsource/l1$k;Lcom/ironsource/l1$f;)Lcom/ironsource/i1;

    move-result-object v0

    .line 40
    iget-object v1, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 42
    iget-object v0, p0, Lcom/ironsource/d3;->m:Lcom/ironsource/W1;

    if-eqz v0, :cond_3

    const-string v1, "onBannerLoadFail"

    invoke-virtual {v0, v1}, Lcom/ironsource/W1;->a(Ljava/lang/String;)V

    .line 44
    :cond_3
    iget-object p0, p0, Lcom/ironsource/d3;->g:Lcom/ironsource/T;

    invoke-interface {p0, p1}, Lcom/ironsource/T;->onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/ironsource/d3;->j:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ironsource/d3$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/d3$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/d3;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onBannerLoadFail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {v0, p1}, Lcom/ironsource/y5;->c(Ljava/lang/String;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/d3;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public onBannerLoadSuccess(Lcom/ironsource/G9;Lcom/ironsource/h8;)V
    .locals 2

    const-string v0, "adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/d3;->j:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ironsource/d3$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/d3$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/d3;Lcom/ironsource/G9;Lcom/ironsource/h8;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public start()V
    .locals 8

    .line 1
    new-instance v0, Lcom/ironsource/k5;

    invoke-direct {v0}, Lcom/ironsource/k5;-><init>()V

    iput-object v0, p0, Lcom/ironsource/d3;->k:Lcom/ironsource/k5;

    .line 3
    iget-object v0, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    .line 4
    new-instance v1, Lcom/ironsource/l1$s;

    iget-object v2, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v2}, Lcom/ironsource/qb;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ironsource/l1$s;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v2, Lcom/ironsource/l1$n;

    iget-object v3, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v3}, Lcom/ironsource/qb;->g()Lcom/ironsource/l9;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/l9;->b()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ironsource/l1$n;-><init>(I)V

    .line 6
    new-instance v3, Lcom/ironsource/l1$c;

    iget-object v4, p0, Lcom/ironsource/d3;->b:Lcom/unity3d/ironsourceads/AdSize;

    invoke-direct {v3, v4}, Lcom/ironsource/l1$c;-><init>(Lcom/unity3d/ironsourceads/AdSize;)V

    .line 7
    new-instance v4, Lcom/ironsource/l1$b;

    iget-object v5, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v5}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getAdId$mediationsdk_release()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/ironsource/l1$b;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x4

    new-array v5, v5, [Lcom/ironsource/m1;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v2, 0x2

    aput-object v3, v5, v2

    const/4 v2, 0x3

    aput-object v4, v5, v2

    .line 8
    invoke-interface {v0, v5}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 13
    sget-object v0, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$c$a;->a()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 15
    iget-object v0, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getExtraParams()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ironsource/d3;->a(Landroid/os/Bundle;)V

    .line 17
    iget-object v0, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v0}, Lcom/ironsource/qb;->h()J

    move-result-wide v2

    .line 19
    iget-object v0, p0, Lcom/ironsource/d3;->i:Lcom/ironsource/Kf$c;

    .line 20
    new-instance v4, Lcom/ironsource/Kf$b;

    invoke-direct {v4}, Lcom/ironsource/Kf$b;-><init>()V

    invoke-virtual {v4, v2, v3}, Lcom/ironsource/Kf$b;->b(J)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    invoke-interface {v0, v4}, Lcom/ironsource/Kf$c;->a(Lcom/ironsource/Kf$b;)Lcom/ironsource/Kf;

    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/ironsource/d3;->l:Lcom/ironsource/Kf;

    if-eqz v0, :cond_0

    .line 28
    new-instance v2, Lcom/ironsource/d3$a;

    invoke-direct {v2, p0}, Lcom/ironsource/d3$a;-><init>(Lcom/ironsource/d3;)V

    .line 29
    invoke-interface {v0, v2}, Lcom/ironsource/Kf;->a(Lcom/ironsource/Kf$a;)V

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/ironsource/d3;->c:Lcom/ironsource/m2;

    invoke-interface {v0}, Lcom/ironsource/m2;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    const-string v0, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/ironsource/c8;

    invoke-virtual {v2}, Lcom/ironsource/c8;->a()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/d3;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    const/4 v0, 0x0

    .line 39
    :goto_0
    check-cast v0, Lcom/ironsource/j2;

    if-nez v0, :cond_2

    return-void

    .line 44
    :cond_2
    iget-object v2, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    .line 45
    invoke-virtual {v0}, Lcom/ironsource/j2;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Lcom/ironsource/l1$d;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$d;-><init>(Ljava/lang/String;)V

    new-array v3, v1, [Lcom/ironsource/m1;

    aput-object v4, v3, v6

    invoke-interface {v2, v3}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 46
    :cond_3
    invoke-virtual {v0}, Lcom/ironsource/j2;->f()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_4

    new-instance v4, Lcom/ironsource/l1$m;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$m;-><init>(Lorg/json/JSONObject;)V

    new-array v3, v1, [Lcom/ironsource/m1;

    aput-object v4, v3, v6

    invoke-interface {v2, v3}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 47
    :cond_4
    invoke-virtual {v0}, Lcom/ironsource/j2;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 48
    new-instance v4, Lcom/ironsource/l1$g;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$g;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lcom/ironsource/m1;

    aput-object v4, v1, v6

    invoke-interface {v2, v1}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 52
    :cond_5
    iget-object v1, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v1}, Lcom/ironsource/qb;->g()Lcom/ironsource/l9;

    move-result-object v1

    .line 53
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 55
    new-instance v3, Lcom/ironsource/f8;

    .line 56
    iget-object v4, p0, Lcom/ironsource/d3;->b:Lcom/unity3d/ironsourceads/AdSize;

    invoke-virtual {v4}, Lcom/unity3d/ironsourceads/AdSize;->getWidth()I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/mediationsdk/AdapterUtils;->dpToPixels(Landroid/content/Context;I)I

    move-result v4

    .line 57
    iget-object v5, p0, Lcom/ironsource/d3;->b:Lcom/unity3d/ironsourceads/AdSize;

    invoke-virtual {v5}, Lcom/unity3d/ironsourceads/AdSize;->getHeight()I

    move-result v5

    invoke-static {v2, v5}, Lcom/ironsource/mediationsdk/AdapterUtils;->dpToPixels(Landroid/content/Context;I)I

    move-result v2

    .line 58
    iget-object v5, p0, Lcom/ironsource/d3;->b:Lcom/unity3d/ironsourceads/AdSize;

    invoke-virtual {v5}, Lcom/unity3d/ironsourceads/AdSize;->getSizeDescription()Ljava/lang/String;

    move-result-object v5

    .line 59
    invoke-direct {v3, v4, v2, v5}, Lcom/ironsource/f8;-><init>(IILjava/lang/String;)V

    .line 64
    new-instance v2, Lcom/ironsource/yc;

    invoke-direct {v2}, Lcom/ironsource/yc;-><init>()V

    .line 65
    invoke-virtual {v2, p0}, Lcom/ironsource/yc;->a(Lcom/ironsource/B2;)V

    .line 67
    new-instance v4, Lcom/ironsource/cc;

    invoke-direct {v4}, Lcom/ironsource/cc;-><init>()V

    invoke-virtual {v4}, Lcom/ironsource/cc;->a()Ljava/util/Map;

    move-result-object v4

    .line 68
    sget-object v5, Lcom/ironsource/T5;->a:Lcom/ironsource/T5;

    iget-object v6, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v6}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getExtraParams()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/ironsource/T5;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object v5

    .line 70
    new-instance v6, Lcom/ironsource/H9;

    iget-object v7, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v7}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v7

    invoke-interface {v7}, Lcom/ironsource/md;->value()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v2}, Lcom/ironsource/H9;-><init>(Ljava/lang/String;Lcom/ironsource/wc;)V

    .line 71
    sget-object v2, Lcom/ironsource/l9;->d:Lcom/ironsource/l9;

    invoke-virtual {v1, v2}, Lcom/ironsource/l9;->b(Lcom/ironsource/l9;)Z

    move-result v2

    invoke-virtual {v6, v2}, Lcom/ironsource/H9;->a(Z)Lcom/ironsource/H9;

    move-result-object v2

    .line 72
    invoke-virtual {v2, v3}, Lcom/ironsource/H9;->a(Lcom/ironsource/f8;)Lcom/ironsource/H9;

    move-result-object v2

    .line 73
    iget-object v3, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v3}, Lcom/ironsource/qb;->i()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ironsource/H9;->b(Z)Lcom/ironsource/H9;

    move-result-object v2

    .line 74
    iget-object v3, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v3}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getAdId$mediationsdk_release()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/H9;->a(Ljava/lang/String;)Lcom/ironsource/H9;

    move-result-object v2

    .line 75
    invoke-static {v4, v5}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/H9;->a(Ljava/util/Map;)Lcom/ironsource/H9;

    move-result-object v2

    .line 76
    invoke-virtual {v2}, Lcom/ironsource/H9;->a()Lcom/ironsource/G9;

    move-result-object v2

    .line 78
    new-instance v3, Lcom/ironsource/lc;

    iget-object v4, p0, Lcom/ironsource/d3;->d:Lcom/ironsource/qb;

    invoke-virtual {v4}, Lcom/ironsource/qb;->j()Z

    move-result v4

    invoke-direct {v3, v0, v4}, Lcom/ironsource/lc;-><init>(Lcom/ironsource/j2;Z)V

    .line 81
    new-instance v4, Lcom/ironsource/k9;

    .line 82
    iget-object v5, p0, Lcom/ironsource/d3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v5}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getInstanceId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/ironsource/l9;->b()I

    move-result v1

    invoke-virtual {v0}, Lcom/ironsource/j2;->a()Ljava/lang/String;

    move-result-object v6

    .line 83
    invoke-direct {v4, v5, v1, v6}, Lcom/ironsource/k9;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 87
    new-instance v1, Lcom/ironsource/W1;

    .line 88
    new-instance v5, Lcom/ironsource/mediationsdk/d;

    invoke-direct {v5}, Lcom/ironsource/mediationsdk/d;-><init>()V

    invoke-virtual {v0}, Lcom/ironsource/j2;->c()Lcom/ironsource/d2;

    move-result-object v0

    .line 89
    invoke-direct {v1, v4, v5, v0}, Lcom/ironsource/W1;-><init>(Lcom/ironsource/k9;Lcom/ironsource/mediationsdk/d;Lcom/ironsource/d2;)V

    .line 90
    iput-object v1, p0, Lcom/ironsource/d3;->m:Lcom/ironsource/W1;

    .line 94
    sget-object v0, Lcom/ironsource/i1$d;->a:Lcom/ironsource/i1$d$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$d$a;->c()Lcom/ironsource/i1$b;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/d3;->f:Lcom/ironsource/p1;

    invoke-virtual {v0, v1}, Lcom/ironsource/i1$b;->a(Lcom/ironsource/p1;)V

    .line 96
    iget-object v0, p0, Lcom/ironsource/d3;->e:Lcom/ironsource/jc;

    const-string v1, "adInstance"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2, v3}, Lcom/ironsource/jc;->a(Lcom/ironsource/G9;Lcom/ironsource/lc;)V

    return-void
.end method
