.class public final Lcom/ironsource/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/sb;


# instance fields
.field private final a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

.field private final b:Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;

.field private final c:Lcom/ironsource/d1;

.field private final d:Lcom/ironsource/o1;


# direct methods
.method public constructor <init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;)V
    .locals 1

    const-string v0, "adRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publisherListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterConfigProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    .line 3
    iput-object p2, p0, Lcom/ironsource/g3;->b:Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;

    .line 4
    iput-object p3, p0, Lcom/ironsource/g3;->c:Lcom/ironsource/d1;

    .line 5
    iput-object p4, p0, Lcom/ironsource/g3;->d:Lcom/ironsource/o1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    new-instance p4, Lcom/ironsource/n1;

    sget-object p5, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-direct {p4, p5}, Lcom/ironsource/n1;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ironsource/g3;-><init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/ironsource/pb;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getInstanceId()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {}, Lcom/ironsource/sdk/utils/SDKUtils;->getSDKVersion()Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    new-instance v1, Lcom/ironsource/j1;

    .line 6
    const-string v0, "getSDKVersion()"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 7
    invoke-direct/range {v1 .. v9}, Lcom/ironsource/j1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    iget-object v0, p0, Lcom/ironsource/g3;->d:Lcom/ironsource/o1;

    invoke-interface {v0, v1}, Lcom/ironsource/o1;->a(Lcom/ironsource/k1;)Lcom/ironsource/p1;

    move-result-object v8

    .line 13
    :try_start_0
    sget-object v0, Lcom/ironsource/Yb;->e:Lcom/ironsource/Yb$a;

    invoke-virtual {v0}, Lcom/ironsource/Yb$a;->a()Lcom/ironsource/Yb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Yb;->c()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 15
    new-instance v1, Lcom/ironsource/rb;

    .line 16
    iget-object v2, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v2}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getAdm()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v3}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/g3;->c:Lcom/ironsource/d1;

    .line 17
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/ironsource/rb;-><init>(Ljava/lang/String;Lcom/ironsource/md;Lcom/ironsource/d1;Z)V

    .line 19
    invoke-virtual {v1}, Lcom/ironsource/rb;->b()Lcom/ironsource/qb;

    move-result-object v6

    .line 20
    new-instance v0, Lcom/ironsource/e3;

    iget-object v1, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getSize()Lcom/unity3d/ironsourceads/AdSize;

    move-result-object v1

    invoke-direct {v0, v6, v1}, Lcom/ironsource/e3;-><init>(Lcom/ironsource/qb;Lcom/unity3d/ironsourceads/AdSize;)V

    invoke-virtual {v0}, Lcom/ironsource/e3;->a()V

    .line 22
    new-instance v7, Lcom/ironsource/kc;

    invoke-direct {v7}, Lcom/ironsource/kc;-><init>()V

    .line 24
    new-instance v5, Lcom/ironsource/l2;

    .line 25
    iget-object v0, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getAdm()Ljava/lang/String;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v1

    .line 27
    invoke-direct {v5, v0, v1}, Lcom/ironsource/l2;-><init>(Ljava/lang/String;Lcom/ironsource/md;)V

    .line 32
    new-instance v2, Lcom/ironsource/d3;

    .line 33
    iget-object v3, p0, Lcom/ironsource/g3;->a:Lcom/unity3d/ironsourceads/banner/BannerAdRequest;

    .line 34
    invoke-virtual {v3}, Lcom/unity3d/ironsourceads/banner/BannerAdRequest;->getSize()Lcom/unity3d/ironsourceads/AdSize;

    move-result-object v4

    .line 36
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    new-instance v9, Lcom/ironsource/f3;

    .line 41
    sget-object v0, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    .line 42
    iget-object v1, p0, Lcom/ironsource/g3;->b:Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;

    .line 43
    invoke-direct {v9, v0, v1}, Lcom/ironsource/f3;-><init>(Lcom/ironsource/If;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;)V

    .line 48
    new-instance v10, Lcom/ironsource/F2;

    .line 50
    invoke-virtual {v0}, Lcom/ironsource/T7;->c()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    .line 51
    invoke-direct {v10, v8, v0}, Lcom/ironsource/F2;-><init>(Lcom/ironsource/p1;Ljava/util/concurrent/Executor;)V

    const/16 v13, 0x300

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 52
    invoke-direct/range {v2 .. v14}, Lcom/ironsource/d3;-><init>(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/m2;Lcom/ironsource/qb;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/T;Lcom/ironsource/E2;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    .line 71
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 74
    instance-of v1, v0, Lcom/ironsource/ce;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ironsource/ce;

    invoke-virtual {v0}, Lcom/ironsource/ce;->a()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    goto :goto_0

    .line 75
    :cond_0
    sget-object v1, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Unknown error"

    :cond_1
    invoke-virtual {v1, v0}, Lcom/ironsource/y5;->a(Ljava/lang/String;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    .line 77
    :goto_0
    new-instance v1, Lcom/ironsource/x5;

    .line 80
    new-instance v2, Lcom/ironsource/f3;

    .line 81
    sget-object v3, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    .line 82
    iget-object v4, p0, Lcom/ironsource/g3;->b:Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;

    .line 83
    invoke-direct {v2, v3, v4}, Lcom/ironsource/f3;-><init>(Lcom/ironsource/If;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;)V

    .line 84
    invoke-direct {v1, v0, v2, v8}, Lcom/ironsource/x5;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/f3;Lcom/ironsource/p1;)V

    return-object v1
.end method
