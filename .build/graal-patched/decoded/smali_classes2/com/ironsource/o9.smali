.class public final Lcom/ironsource/o9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/c0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ironsource/c0<",
        "Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/p1;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/ironsource/p1;Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/o9;->a:Lcom/ironsource/p1;

    .line 3
    iput-object p2, p0, Lcom/ironsource/o9;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/ironsource/G9;Lcom/ironsource/W1;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/ironsource/o9;->b(Lcom/ironsource/G9;Lcom/ironsource/W1;)Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/ironsource/G9;Lcom/ironsource/W1;)Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;
    .locals 13

    const-string v0, "adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionDataReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/ironsource/q9;

    .line 3
    new-instance v3, Lcom/ironsource/b0;

    new-instance v0, Lcom/ironsource/qc;

    invoke-direct {v0}, Lcom/ironsource/qc;-><init>()V

    invoke-direct {v3, v0}, Lcom/ironsource/b0;-><init>(Lcom/ironsource/pc;)V

    .line 5
    iget-object v5, p0, Lcom/ironsource/o9;->a:Lcom/ironsource/p1;

    .line 6
    invoke-static {}, Lcom/ironsource/p9;->a()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v10

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    move-object v4, p2

    .line 7
    invoke-direct/range {v1 .. v12}, Lcom/ironsource/q9;-><init>(Lcom/ironsource/G9;Lcom/ironsource/a0;Lcom/ironsource/X1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    new-instance p1, Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;

    invoke-direct {p1, v1}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;-><init>(Lcom/ironsource/q9;)V

    return-object p1
.end method
