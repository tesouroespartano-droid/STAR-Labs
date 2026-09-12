.class public final Lcom/ironsource/v9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/sb;


# instance fields
.field private final a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

.field private final b:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;

.field private final c:Lcom/ironsource/d1;

.field private final d:Lcom/ironsource/o1;


# direct methods
.method public constructor <init>(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;)V
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
    iput-object p1, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    .line 3
    iput-object p2, p0, Lcom/ironsource/v9;->b:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;

    .line 4
    iput-object p3, p0, Lcom/ironsource/v9;->c:Lcom/ironsource/d1;

    .line 5
    iput-object p4, p0, Lcom/ironsource/v9;->d:Lcom/ironsource/o1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    new-instance p4, Lcom/ironsource/n1;

    sget-object p5, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-direct {p4, p5}, Lcom/ironsource/n1;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ironsource/v9;-><init>(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;Lcom/ironsource/d1;Lcom/ironsource/o1;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/ironsource/pb;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;->getInstanceId()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {}, Lcom/ironsource/sdk/utils/SDKUtils;->getSDKVersion()Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

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
    iget-object v0, p0, Lcom/ironsource/v9;->d:Lcom/ironsource/o1;

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
    iget-object v2, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    invoke-virtual {v2}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;->getAdm()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    invoke-virtual {v3}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/v9;->c:Lcom/ironsource/d1;

    .line 17
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/ironsource/rb;-><init>(Ljava/lang/String;Lcom/ironsource/md;Lcom/ironsource/d1;Z)V

    .line 19
    invoke-virtual {v1}, Lcom/ironsource/rb;->b()Lcom/ironsource/qb;

    move-result-object v4

    .line 21
    new-instance v0, Lcom/ironsource/t9;

    invoke-direct {v0, v4}, Lcom/ironsource/t9;-><init>(Lcom/ironsource/qb;)V

    invoke-virtual {v0}, Lcom/ironsource/t9;->a()V

    .line 23
    new-instance v7, Lcom/ironsource/kc;

    invoke-direct {v7}, Lcom/ironsource/kc;-><init>()V

    .line 25
    new-instance v6, Lcom/ironsource/l2;

    .line 26
    iget-object v0, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    invoke-virtual {v0}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;->getAdm()Ljava/lang/String;

    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;->getProviderName$mediationsdk_release()Lcom/ironsource/md;

    move-result-object v1

    .line 28
    invoke-direct {v6, v0, v1}, Lcom/ironsource/l2;-><init>(Ljava/lang/String;Lcom/ironsource/md;)V

    .line 34
    iget-object v3, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    .line 36
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    new-instance v5, Lcom/ironsource/u9;

    .line 41
    sget-object v0, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    .line 42
    iget-object v1, p0, Lcom/ironsource/v9;->b:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;

    .line 43
    invoke-direct {v5, v0, v1}, Lcom/ironsource/u9;-><init>(Lcom/ironsource/If;Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;)V

    .line 48
    new-instance v9, Lcom/ironsource/o9;

    .line 50
    invoke-virtual {v0}, Lcom/ironsource/T7;->c()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    .line 51
    invoke-direct {v9, v8, v0}, Lcom/ironsource/o9;-><init>(Lcom/ironsource/p1;Ljava/util/concurrent/Executor;)V

    .line 52
    new-instance v2, Lcom/ironsource/s9;

    const/16 v12, 0x180

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/ironsource/s9;-><init>(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/ironsource/qb;Lcom/ironsource/T;Lcom/ironsource/m2;Lcom/ironsource/jc;Lcom/ironsource/p1;Lcom/ironsource/c0;Lcom/ironsource/Kf$c;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    .line 70
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 73
    instance-of v1, v0, Lcom/ironsource/ce;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ironsource/ce;

    invoke-virtual {v0}, Lcom/ironsource/ce;->a()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    goto :goto_0

    .line 74
    :cond_0
    sget-object v1, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "unknown error"

    :cond_1
    invoke-virtual {v1, v0}, Lcom/ironsource/y5;->b(Ljava/lang/String;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v0

    .line 77
    :goto_0
    iget-object v1, p0, Lcom/ironsource/v9;->a:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;

    .line 80
    new-instance v2, Lcom/ironsource/u9;

    .line 81
    sget-object v3, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    .line 82
    iget-object v4, p0, Lcom/ironsource/v9;->b:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;

    .line 83
    invoke-direct {v2, v3, v4}, Lcom/ironsource/u9;-><init>(Lcom/ironsource/If;Lcom/unity3d/ironsourceads/interstitial/InterstitialAdLoaderListener;)V

    .line 84
    new-instance v3, Lcom/ironsource/z5;

    invoke-direct {v3, v1, v2, v8, v0}, Lcom/ironsource/z5;-><init>(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/ironsource/u9;Lcom/ironsource/p1;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-object v3
.end method
