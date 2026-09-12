.class public final Lcom/ironsource/q9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/f6;


# instance fields
.field private a:Lcom/ironsource/G9;

.field private b:Lcom/ironsource/a0;

.field private c:Lcom/ironsource/X1;

.field private d:Lcom/ironsource/p1;

.field private e:Lcom/ironsource/ac;

.field private f:Lcom/ironsource/If;

.field private g:Lcom/ironsource/M8;

.field private h:Lcom/ironsource/M8$a;

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/q9;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

.field private k:Lcom/ironsource/r9;


# direct methods
.method public static synthetic $r8$lambda$6q84l9qL9ks9HHly89liDEAqB9Q(Lcom/ironsource/q9;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/q9;->d(Lcom/ironsource/q9;)V

    return-void
.end method

.method public static synthetic $r8$lambda$MA6BMCBOLYcYQ1ry-5lgQUr4JFk(Lcom/ironsource/q9;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/q9;->a(Lcom/ironsource/q9;)V

    return-void
.end method

.method public static synthetic $r8$lambda$VU_rxGxYscjlhQdJlXnlsUHhACU(Lcom/ironsource/q9;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/q9;->a(Lcom/ironsource/q9;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$WlNXEIj3dCVR2zVZzLibFvNTCGQ(Lcom/ironsource/q9;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/q9;->c(Lcom/ironsource/q9;)V

    return-void
.end method

.method public static synthetic $r8$lambda$nN6_nwk3NkBqRzlSP-kPRWY2IOc(Lcom/ironsource/q9;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/q9;->b(Lcom/ironsource/q9;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/G9;Lcom/ironsource/a0;Lcom/ironsource/X1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/G9;",
            "Lcom/ironsource/a0;",
            "Lcom/ironsource/X1;",
            "Lcom/ironsource/p1;",
            "Lcom/ironsource/ac;",
            "Lcom/ironsource/If;",
            "Lcom/ironsource/M8;",
            "Lcom/ironsource/M8$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/q9;",
            ">;)V"
        }
    .end annotation

    const-string v0, "adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adNetworkShow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionDataReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkDestroyAPI"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDepthService"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDepthServiceEditor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retainer"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    .line 4
    iput-object p2, p0, Lcom/ironsource/q9;->b:Lcom/ironsource/a0;

    .line 5
    iput-object p3, p0, Lcom/ironsource/q9;->c:Lcom/ironsource/X1;

    .line 6
    iput-object p4, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    .line 7
    iput-object p5, p0, Lcom/ironsource/q9;->e:Lcom/ironsource/ac;

    .line 8
    iput-object p6, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    .line 9
    iput-object p7, p0, Lcom/ironsource/q9;->g:Lcom/ironsource/M8;

    .line 11
    iput-object p8, p0, Lcom/ironsource/q9;->h:Lcom/ironsource/M8$a;

    .line 13
    iput-object p9, p0, Lcom/ironsource/q9;->i:Ljava/util/Map;

    .line 16
    new-instance p2, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    invoke-virtual {p1}, Lcom/ironsource/G9;->f()Ljava/lang/String;

    move-result-object p1

    const-string p3, "adInstance.instanceId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-virtual {p3}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object p3

    const-string p4, "adInstance.id"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1, p3}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    .line 20
    new-instance p1, Lcom/ironsource/d6;

    invoke-direct {p1}, Lcom/ironsource/d6;-><init>()V

    .line 21
    iget-object p2, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-virtual {p2, p1}, Lcom/ironsource/G9;->a(Lcom/ironsource/wc;)V

    .line 22
    invoke-virtual {p1, p0}, Lcom/ironsource/d6;->a(Lcom/ironsource/f6;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/G9;Lcom/ironsource/a0;Lcom/ironsource/X1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 23
    new-instance v1, Lcom/ironsource/bc;

    invoke-direct {v1}, Lcom/ironsource/bc;-><init>()V

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    .line 24
    sget-object v1, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 26
    sget-object v1, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v1}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/J7;->s()Lcom/ironsource/M8;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    .line 28
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->h()Lcom/ironsource/M8$a;

    move-result-object v0

    move-object v10, v0

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v11, p9

    .line 29
    invoke-direct/range {v2 .. v11}, Lcom/ironsource/q9;-><init>(Lcom/ironsource/G9;Lcom/ironsource/a0;Lcom/ironsource/X1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;Ljava/util/Map;)V

    return-void
.end method

.method private final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 4

    .line 11
    iget-object v0, p0, Lcom/ironsource/q9;->i:Ljava/util/Map;

    iget-object v1, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;->getAdId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    .line 13
    new-instance v1, Lcom/ironsource/l1$j;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ironsource/l1$j;-><init>(I)V

    .line 14
    new-instance v2, Lcom/ironsource/l1$k;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ironsource/l1$k;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/ironsource/i1$a$a;->a(Lcom/ironsource/l1$j;Lcom/ironsource/l1$k;)Lcom/ironsource/i1;

    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 19
    iget-object v0, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/q9$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/q9$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/q9;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/q9;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/ironsource/i1$d;->a:Lcom/ironsource/i1$d$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$d$a;->b()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 23
    iget-object v0, p0, Lcom/ironsource/q9;->e:Lcom/ironsource/ac;

    iget-object p0, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-interface {v0, p0}, Lcom/ironsource/ac;->a(Lcom/ironsource/G9;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/q9;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object p0, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lcom/ironsource/r9;->onAdInstanceDidFailedToShow(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_0
    return-void
.end method

.method private static final b(Lcom/ironsource/q9;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p0, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/ironsource/r9;->onAdInstanceDidClick()V

    :cond_0
    return-void
.end method

.method private static final c(Lcom/ironsource/q9;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p0, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/ironsource/r9;->onAdInstanceDidDismiss()V

    :cond_0
    return-void
.end method

.method private static final d(Lcom/ironsource/q9;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object p0, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/ironsource/r9;->onAdInstanceDidShow()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 21
    iget-object v0, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/q9$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/ironsource/q9$$ExternalSyntheticLambda3;-><init>(Lcom/ironsource/q9;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/ironsource/If;->a(Lcom/ironsource/If;Ljava/lang/Runnable;JILjava/lang/Object;)V

    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/q9;->i:Ljava/util/Map;

    iget-object v1, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;->getAdId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/ironsource/q9;->b:Lcom/ironsource/a0;

    iget-object v1, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-interface {v0, v1}, Lcom/ironsource/a0;->a(Lcom/ironsource/G9;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    sget-object p1, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {p1}, Lcom/ironsource/y5;->t()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ironsource/q9;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/ironsource/m1;

    invoke-virtual {v0, v1}, Lcom/ironsource/i1$a$a;->d([Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 9
    iget-object v0, p0, Lcom/ironsource/q9;->b:Lcom/ironsource/a0;

    iget-object v1, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-interface {v0, p1, v1}, Lcom/ironsource/a0;->a(Landroid/app/Activity;Lcom/ironsource/G9;)V

    return-void
.end method

.method public final a(Lcom/ironsource/r9;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    return-void
.end method

.method public final a(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 10
    sget-object v0, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    new-instance v1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/y5;->c(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ironsource/q9;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public final b()Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    return-object v0
.end method

.method public final c()Lcom/ironsource/r9;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/q9;->k:Lcom/ironsource/r9;

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/q9;->b:Lcom/ironsource/a0;

    iget-object v1, p0, Lcom/ironsource/q9;->a:Lcom/ironsource/G9;

    invoke-interface {v0, v1}, Lcom/ironsource/a0;->a(Lcom/ironsource/G9;)Z

    move-result v0

    .line 2
    sget-object v1, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    invoke-virtual {v1, v0}, Lcom/ironsource/i1$a$a;->a(Z)Lcom/ironsource/i1;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v1, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    return v0
.end method

.method protected final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/q9;->a()V

    return-void
.end method

.method public onAdInstanceDidBecomeVisible()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/ironsource/m1;

    invoke-virtual {v0, v1}, Lcom/ironsource/i1$a$a;->f([Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    return-void
.end method

.method public onAdInstanceDidClick()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$a$a;->a()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/q9$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/ironsource/q9$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/q9;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdInstanceDidDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/q9;->i:Ljava/util/Map;

    iget-object v1, p0, Lcom/ironsource/q9;->j:Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;

    invoke-virtual {v1}, Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;->getAdId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/ironsource/m1;

    invoke-virtual {v0, v1}, Lcom/ironsource/i1$a$a;->a([Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/q9$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/ironsource/q9$$ExternalSyntheticLambda4;-><init>(Lcom/ironsource/q9;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdInstanceDidReward(Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public onAdInstanceDidShow()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/q9;->g:Lcom/ironsource/M8;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v1}, Lcom/ironsource/M8;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result v0

    .line 2
    sget-object v2, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    new-instance v3, Lcom/ironsource/l1$w;

    invoke-direct {v3, v0}, Lcom/ironsource/l1$w;-><init>(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/ironsource/m1;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    invoke-virtual {v2, v0}, Lcom/ironsource/i1$a$a;->b([Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/ironsource/q9;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/q9;->h:Lcom/ironsource/M8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/M8$a;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/q9;->c:Lcom/ironsource/X1;

    const-string v1, "onAdInstanceDidShow"

    invoke-interface {v0, v1}, Lcom/ironsource/X1;->b(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/q9;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/q9$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/ironsource/q9$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/q9;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method
