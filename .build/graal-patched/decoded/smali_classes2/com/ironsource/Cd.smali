.class public final Lcom/ironsource/Cd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/pb;
.implements Lcom/ironsource/e6;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRewardedAdLoadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewardedAdLoadTask.kt\ncom/unity3d/ironsourceads/internal/load/rewarded/RewardedAdLoadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

.field private final b:Lcom/ironsource/qb;

.field private final c:Lcom/ironsource/T;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ironsource/T<",
            "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/ironsource/m2;

.field private final e:Lcom/ironsource/jc;

.field private final f:Lcom/ironsource/p1;

.field private final g:Lcom/ironsource/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ironsource/c0<",
            "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/ironsource/Kf$c;

.field private final i:Ljava/util/concurrent/Executor;

.field private j:Lcom/ironsource/k5;

.field private k:Lcom/ironsource/Kf;

.field private l:Lcom/ironsource/W1;

.field private m:Z


# direct methods
.method public static synthetic $r8$lambda$6RWZYAd06TS5aqUunGEktTBTZLQ(Lcom/ironsource/Cd;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Cd;->a(Lcom/ironsource/Cd;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$m5Nef9NQE8SwrwvblDEOOm5zTHI(Lcom/ironsource/Cd;Lcom/ironsource/G9;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Cd;->a(Lcom/ironsource/Cd;Lcom/ironsource/G9;)V

    return-void
.end method

.method public constructor <init>(Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;Lcom/ironsource/qb;Lcom/ironsource/T;Lcom/ironsource/m2;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/c0;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;",
            "Lcom/ironsource/qb;",
            "Lcom/ironsource/T<",
            "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;",
            ">;",
            "Lcom/ironsource/m2;",
            "Lcom/ironsource/jc;",
            "Lcom/ironsource/p1;",
            "Lcom/ironsource/c0<",
            "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;",
            ">;",
            "Lcom/ironsource/Kf$c;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    const-string v0, "adRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadTaskConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adLoadTaskListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionResponseFetcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkLoadApi"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adObjectFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskFinishedExecutor"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Cd;->c:Lcom/ironsource/T;

    .line 5
    iput-object p4, p0, Lcom/ironsource/Cd;->d:Lcom/ironsource/m2;

    .line 6
    iput-object p5, p0, Lcom/ironsource/Cd;->e:Lcom/ironsource/jc;

    .line 7
    iput-object p6, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    .line 8
    iput-object p7, p0, Lcom/ironsource/Cd;->g:Lcom/ironsource/c0;

    .line 9
    iput-object p8, p0, Lcom/ironsource/Cd;->h:Lcom/ironsource/Kf$c;

    .line 10
    iput-object p9, p0, Lcom/ironsource/Cd;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;Lcom/ironsource/qb;Lcom/ironsource/T;Lcom/ironsource/m2;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/c0;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 11
    new-instance v1, Lcom/ironsource/Kf$d;

    invoke-direct {v1}, Lcom/ironsource/Kf$d;-><init>()V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    .line 12
    sget-object v0, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    invoke-virtual {v0}, Lcom/ironsource/T7;->c()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    move-object v11, v0

    goto :goto_1

    :cond_1
    move-object/from16 v11, p9

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 13
    invoke-direct/range {v2 .. v11}, Lcom/ironsource/Cd;-><init>(Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;Lcom/ironsource/qb;Lcom/ironsource/T;Lcom/ironsource/m2;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/c0;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private final a(Landroid/os/Bundle;)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_1

    .line 17
    :cond_0
    sget-object v0, Lcom/ironsource/T5;->a:Lcom/ironsource/T5;

    invoke-virtual {v0, p1}, Lcom/ironsource/T5;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p1

    .line 18
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

    .line 19
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 20
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

    .line 21
    iget-object v2, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    invoke-interface {v1, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private static final a(Lcom/ironsource/Cd;Lcom/ironsource/G9;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/ironsource/Cd;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/ironsource/Cd;->m:Z

    .line 7
    iget-object v0, p0, Lcom/ironsource/Cd;->k:Lcom/ironsource/Kf;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ironsource/Kf;->cancel()V

    .line 10
    :cond_1
    new-instance v0, Lcom/ironsource/l1$f;

    iget-object v1, p0, Lcom/ironsource/Cd;->j:Lcom/ironsource/k5;

    if-nez v1, :cond_2

    const-string v1, "taskStartedTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    invoke-static {v1}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/l1$f;-><init>(J)V

    .line 11
    sget-object v1, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    invoke-virtual {v1, v0}, Lcom/ironsource/i1$c$a;->a(Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 13
    iget-object v0, p0, Lcom/ironsource/Cd;->l:Lcom/ironsource/W1;

    if-eqz v0, :cond_3

    const-string v1, "onAdInstanceLoadSuccess"

    invoke-virtual {v0, v1}, Lcom/ironsource/W1;->c(Ljava/lang/String;)V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/ironsource/Cd;->g:Lcom/ironsource/c0;

    iget-object v1, p0, Lcom/ironsource/Cd;->l:Lcom/ironsource/W1;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Lcom/ironsource/c0;->a(Lcom/ironsource/G9;Lcom/ironsource/W1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/unity3d/ironsourceads/rewarded/RewardedAd;

    .line 16
    iget-object p0, p0, Lcom/ironsource/Cd;->c:Lcom/ironsource/T;

    invoke-interface {p0, p1}, Lcom/ironsource/T;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/Cd;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-boolean v0, p0, Lcom/ironsource/Cd;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lcom/ironsource/Cd;->m:Z

    .line 29
    iget-object v0, p0, Lcom/ironsource/Cd;->k:Lcom/ironsource/Kf;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ironsource/Kf;->cancel()V

    .line 31
    :cond_1
    sget-object v0, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    .line 32
    new-instance v1, Lcom/ironsource/l1$j;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ironsource/l1$j;-><init>(I)V

    .line 33
    new-instance v2, Lcom/ironsource/l1$k;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ironsource/l1$k;-><init>(Ljava/lang/String;)V

    .line 34
    new-instance v3, Lcom/ironsource/l1$f;

    .line 35
    iget-object v4, p0, Lcom/ironsource/Cd;->j:Lcom/ironsource/k5;

    if-nez v4, :cond_2

    const-string v4, "taskStartedTime"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2
    invoke-static {v4}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v4

    .line 36
    invoke-direct {v3, v4, v5}, Lcom/ironsource/l1$f;-><init>(J)V

    .line 37
    invoke-virtual {v0, v1, v2, v3}, Lcom/ironsource/i1$c$a;->a(Lcom/ironsource/l1$j;Lcom/ironsource/l1$k;Lcom/ironsource/l1$f;)Lcom/ironsource/i1;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 44
    iget-object v0, p0, Lcom/ironsource/Cd;->l:Lcom/ironsource/W1;

    if-eqz v0, :cond_3

    const-string v1, "onAdInstanceLoadFail"

    invoke-virtual {v0, v1}, Lcom/ironsource/W1;->a(Ljava/lang/String;)V

    .line 46
    :cond_3
    iget-object p0, p0, Lcom/ironsource/Cd;->c:Lcom/ironsource/T;

    invoke-interface {p0, p1}, Lcom/ironsource/T;->onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/G9;)V
    .locals 2

    const-string v0, "adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Cd;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ironsource/Cd$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/Cd$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Cd;Lcom/ironsource/G9;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/ironsource/Cd;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ironsource/Cd$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/Cd$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Cd;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {v0, p1}, Lcom/ironsource/y5;->c(Ljava/lang/String;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Cd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public start()V
    .locals 9

    .line 1
    new-instance v0, Lcom/ironsource/k5;

    invoke-direct {v0}, Lcom/ironsource/k5;-><init>()V

    iput-object v0, p0, Lcom/ironsource/Cd;->j:Lcom/ironsource/k5;

    .line 3
    iget-object v0, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    .line 4
    new-instance v1, Lcom/ironsource/l1$s;

    iget-object v2, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v2}, Lcom/ironsource/qb;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ironsource/l1$s;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v2, Lcom/ironsource/l1$n;

    iget-object v3, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v3}, Lcom/ironsource/qb;->g()Lcom/ironsource/l9;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/l9;->b()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ironsource/l1$n;-><init>(I)V

    .line 6
    new-instance v3, Lcom/ironsource/l1$b;

    iget-object v4, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v4}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getAdId$mediationsdk_release()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/ironsource/l1$b;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/ironsource/m1;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v2, 0x2

    aput-object v3, v4, v2

    .line 7
    invoke-interface {v0, v4}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 11
    sget-object v0, Lcom/ironsource/i1$c;->a:Lcom/ironsource/i1$c$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$c$a;->a()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    invoke-interface {v0, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 13
    iget-object v0, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getExtraParams()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ironsource/Cd;->a(Landroid/os/Bundle;)V

    .line 15
    iget-object v0, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v0}, Lcom/ironsource/qb;->h()J

    move-result-wide v2

    .line 17
    iget-object v0, p0, Lcom/ironsource/Cd;->h:Lcom/ironsource/Kf$c;

    .line 18
    new-instance v4, Lcom/ironsource/Kf$b;

    invoke-direct {v4}, Lcom/ironsource/Kf$b;-><init>()V

    invoke-virtual {v4, v2, v3}, Lcom/ironsource/Kf$b;->b(J)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    invoke-interface {v0, v4}, Lcom/ironsource/Kf$c;->a(Lcom/ironsource/Kf$b;)Lcom/ironsource/Kf;

    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/ironsource/Cd;->k:Lcom/ironsource/Kf;

    if-eqz v0, :cond_0

    .line 25
    new-instance v2, Lcom/ironsource/Cd$a;

    invoke-direct {v2, p0}, Lcom/ironsource/Cd$a;-><init>(Lcom/ironsource/Cd;)V

    .line 26
    invoke-interface {v0, v2}, Lcom/ironsource/Kf;->a(Lcom/ironsource/Kf$a;)V

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Cd;->d:Lcom/ironsource/m2;

    invoke-interface {v0}, Lcom/ironsource/m2;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/ironsource/c8;

    invoke-virtual {v2}, Lcom/ironsource/c8;->a()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/Cd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    const/4 v0, 0x0

    .line 36
    :goto_0
    check-cast v0, Lcom/ironsource/j2;

    if-nez v0, :cond_2

    return-void

    .line 41
    :cond_2
    iget-object v2, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    .line 42
    invoke-virtual {v0}, Lcom/ironsource/j2;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Lcom/ironsource/l1$d;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$d;-><init>(Ljava/lang/String;)V

    new-array v3, v1, [Lcom/ironsource/m1;

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 43
    :cond_3
    invoke-virtual {v0}, Lcom/ironsource/j2;->f()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_4

    new-instance v4, Lcom/ironsource/l1$m;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$m;-><init>(Lorg/json/JSONObject;)V

    new-array v3, v1, [Lcom/ironsource/m1;

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 44
    :cond_4
    invoke-virtual {v0}, Lcom/ironsource/j2;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 45
    new-instance v4, Lcom/ironsource/l1$g;

    invoke-direct {v4, v3}, Lcom/ironsource/l1$g;-><init>(Ljava/lang/String;)V

    new-array v3, v1, [Lcom/ironsource/m1;

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 49
    :cond_5
    iget-object v2, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v2}, Lcom/ironsource/qb;->g()Lcom/ironsource/l9;

    move-result-object v2

    .line 50
    new-instance v3, Lcom/ironsource/d6;

    invoke-direct {v3}, Lcom/ironsource/d6;-><init>()V

    .line 51
    invoke-virtual {v3, p0}, Lcom/ironsource/d6;->a(Lcom/ironsource/e6;)V

    .line 53
    new-instance v4, Lcom/ironsource/cc;

    invoke-direct {v4}, Lcom/ironsource/cc;-><init>()V

    invoke-virtual {v4}, Lcom/ironsource/cc;->a()Ljava/util/Map;

    move-result-object v4

    .line 54
    sget-object v6, Lcom/ironsource/T5;->a:Lcom/ironsource/T5;

    iget-object v7, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v7}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getExtraParams()Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/ironsource/T5;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object v6

    .line 56
    new-instance v7, Lcom/ironsource/H9;

    iget-object v8, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v8}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v8

    invoke-interface {v8}, Lcom/ironsource/md;->value()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v3}, Lcom/ironsource/H9;-><init>(Ljava/lang/String;Lcom/ironsource/wc;)V

    .line 57
    sget-object v3, Lcom/ironsource/l9;->d:Lcom/ironsource/l9;

    invoke-virtual {v2, v3}, Lcom/ironsource/l9;->b(Lcom/ironsource/l9;)Z

    move-result v3

    invoke-virtual {v7, v3}, Lcom/ironsource/H9;->a(Z)Lcom/ironsource/H9;

    move-result-object v3

    .line 58
    iget-object v7, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v7}, Lcom/ironsource/qb;->i()Z

    move-result v7

    invoke-virtual {v3, v7}, Lcom/ironsource/H9;->b(Z)Lcom/ironsource/H9;

    move-result-object v3

    .line 59
    invoke-virtual {v3}, Lcom/ironsource/H9;->c()Lcom/ironsource/H9;

    move-result-object v3

    .line 60
    iget-object v7, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v7}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getAdId$mediationsdk_release()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/ironsource/H9;->a(Ljava/lang/String;)Lcom/ironsource/H9;

    move-result-object v3

    .line 61
    invoke-static {v4, v6}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ironsource/H9;->a(Ljava/util/Map;)Lcom/ironsource/H9;

    move-result-object v3

    .line 62
    invoke-virtual {v3}, Lcom/ironsource/H9;->a()Lcom/ironsource/G9;

    move-result-object v3

    .line 64
    iget-object v4, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    new-instance v6, Lcom/ironsource/l1$b;

    invoke-virtual {v3}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v7

    const-string v8, "adInstance.id"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7}, Lcom/ironsource/l1$b;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lcom/ironsource/m1;

    aput-object v6, v1, v5

    invoke-interface {v4, v1}, Lcom/ironsource/p1;->a([Lcom/ironsource/m1;)V

    .line 66
    new-instance v1, Lcom/ironsource/lc;

    iget-object v4, p0, Lcom/ironsource/Cd;->b:Lcom/ironsource/qb;

    invoke-virtual {v4}, Lcom/ironsource/qb;->j()Z

    move-result v4

    invoke-direct {v1, v0, v4}, Lcom/ironsource/lc;-><init>(Lcom/ironsource/j2;Z)V

    .line 69
    new-instance v4, Lcom/ironsource/k9;

    .line 70
    iget-object v5, p0, Lcom/ironsource/Cd;->a:Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;

    invoke-virtual {v5}, Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;->getInstanceId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ironsource/l9;->b()I

    move-result v2

    invoke-virtual {v0}, Lcom/ironsource/j2;->a()Ljava/lang/String;

    move-result-object v6

    .line 71
    invoke-direct {v4, v5, v2, v6}, Lcom/ironsource/k9;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 75
    new-instance v2, Lcom/ironsource/W1;

    .line 76
    new-instance v5, Lcom/ironsource/mediationsdk/d;

    invoke-direct {v5}, Lcom/ironsource/mediationsdk/d;-><init>()V

    invoke-virtual {v0}, Lcom/ironsource/j2;->c()Lcom/ironsource/d2;

    move-result-object v0

    .line 77
    invoke-direct {v2, v4, v5, v0}, Lcom/ironsource/W1;-><init>(Lcom/ironsource/k9;Lcom/ironsource/mediationsdk/d;Lcom/ironsource/d2;)V

    .line 78
    iput-object v2, p0, Lcom/ironsource/Cd;->l:Lcom/ironsource/W1;

    .line 82
    sget-object v0, Lcom/ironsource/i1$d;->a:Lcom/ironsource/i1$d$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$d$a;->c()Lcom/ironsource/i1$b;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/Cd;->f:Lcom/ironsource/p1;

    invoke-virtual {v0, v2}, Lcom/ironsource/i1$b;->a(Lcom/ironsource/p1;)V

    .line 84
    iget-object v0, p0, Lcom/ironsource/Cd;->e:Lcom/ironsource/jc;

    const-string v2, "adInstance"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3, v1}, Lcom/ironsource/jc;->a(Lcom/ironsource/G9;Lcom/ironsource/lc;)V

    return-void
.end method
