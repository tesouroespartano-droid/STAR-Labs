.class public final Lcom/ironsource/Ra;
.super Lcom/ironsource/Yd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Ra$a;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlayConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayConfig.kt\ncom/unity3d/mediation/internal/LevelPlayConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1549#2:196\n1620#2,3:197\n1603#2,9:200\n1855#2:209\n1856#2:211\n1612#2:212\n1549#2:213\n1620#2,3:214\n1#3:210\n*S KotlinDebug\n*F\n+ 1 LevelPlayConfig.kt\ncom/unity3d/mediation/internal/LevelPlayConfig\n*L\n25#1:196\n25#1:197,3\n37#1:200,9\n37#1:209\n37#1:211\n37#1:212\n83#1:213\n83#1:214,3\n37#1:210\n*E\n"
.end annotation


# direct methods
.method public constructor <init>(Lcom/ironsource/Yd;)V
    .locals 1

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/ironsource/Yd;-><init>(Lcom/ironsource/Yd;)V

    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Lcom/ironsource/x6$c;
    .locals 3

    .line 24
    sget-object v0, Lcom/unity3d/mediation/LevelPlay$AdFormat;->REWARDED:Lcom/unity3d/mediation/LevelPlay$AdFormat;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/V3;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/s;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 29
    invoke-virtual {p1}, Lcom/ironsource/s;->a()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ironsource/s$d;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/ironsource/s$d;->g()Lcom/ironsource/kd;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/ironsource/kd;->a()Lcom/ironsource/x6$c;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p1, :cond_2

    .line 30
    invoke-virtual {p1}, Lcom/ironsource/s;->b()Lcom/ironsource/s$d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ironsource/s$d;->g()Lcom/ironsource/kd;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ironsource/kd;->a()Lcom/ironsource/x6$c;

    move-result-object v1

    :cond_2
    if-nez p2, :cond_3

    move-object p2, v1

    :cond_3
    if-eqz p2, :cond_4

    return-object p2

    :cond_4
    if-eqz v0, :cond_5

    .line 37
    sget-object p1, Lcom/ironsource/x6$c;->c:Lcom/ironsource/x6$c;

    return-object p1

    .line 38
    :cond_5
    sget-object p1, Lcom/ironsource/x6$c;->b:Lcom/ironsource/x6$c;

    return-object p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/ironsource/Qa$a;
    .locals 9

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->c()Lcom/ironsource/U2;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/ironsource/U2;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/U2$b;

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p1}, Lcom/ironsource/U2$b;->c()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ironsource/U2;->b()Lcom/ironsource/U2$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/U2$b;->c()I

    move-result v1

    :goto_0
    if-eqz p1, :cond_1

    .line 13
    invoke-virtual {p1}, Lcom/ironsource/U2$b;->e()Z

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/ironsource/U2;->b()Lcom/ironsource/U2$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/U2$b;->e()Z

    move-result v2

    :goto_1
    move v4, v2

    if-eqz p1, :cond_2

    .line 15
    invoke-virtual {p1}, Lcom/ironsource/U2$b;->d()J

    move-result-wide v2

    goto :goto_2

    .line 16
    :cond_2
    invoke-virtual {v0}, Lcom/ironsource/U2;->b()Lcom/ironsource/U2$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/U2$b;->d()J

    move-result-wide v2

    :goto_2
    move-wide v7, v2

    .line 18
    new-instance v3, Lcom/ironsource/Qa$a;

    int-to-long v5, v1

    invoke-direct/range {v3 .. v8}, Lcom/ironsource/Qa$a;-><init>(ZJJ)V

    return-object v3
.end method

.method public final a(Lcom/ironsource/jb;)Lcom/ironsource/t0;
    .locals 2

    const-string v0, "tools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lcom/ironsource/t0;

    .line 22
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/V3;->a()Ljava/util/Map;

    move-result-object v1

    .line 23
    invoke-direct {v0, p1, v1}, Lcom/ironsource/t0;-><init>(Lcom/ironsource/jb;Ljava/util/Map;)V

    return-object v0
.end method

.method public final a(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/mediation/LevelPlay$AdFormat;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/he;->d()Lcom/ironsource/nd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/nd;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/nd$a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ironsource/nd$a;->a()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 20
    :cond_1
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adFormat"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/he;->d()Lcom/ironsource/nd;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/nd;->a()Ljava/util/Map;

    move-result-object v0

    .line 4
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ironsource/nd$a;

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p2}, Lcom/ironsource/nd$a;->a()Ljava/util/Map;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 8
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/unity3d/mediation/LevelPlay$AdFormat;)J
    .locals 4

    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/ironsource/V3;->a()Ljava/util/Map;

    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/s;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p1}, Lcom/ironsource/s;->b()Lcom/ironsource/s$d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Lcom/ironsource/s$d;->d()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x3c

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    .line 20
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    :cond_1
    return-wide v0
.end method

.method public final b(Lcom/ironsource/jb;)Lcom/ironsource/bd;
    .locals 2

    const-string v0, "tools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/ironsource/bd;

    .line 4
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/V3;->a()Ljava/util/Map;

    move-result-object v1

    .line 5
    invoke-direct {v0, p1, v1}, Lcom/ironsource/bd;-><init>(Lcom/ironsource/jb;Ljava/util/Map;)V

    return-object v0
.end method

.method public final b(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Lcom/ironsource/x6$a;
    .locals 1

    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/Ra;->a(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Lcom/ironsource/x6$c;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/ironsource/x6$a;

    invoke-direct {p2, p1}, Lcom/ironsource/x6$a;-><init>(Lcom/ironsource/x6$c;)V

    return-object p2
.end method

.method public final c(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/Placement;
    .locals 7

    .line 359
    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    sget-object v0, Lcom/ironsource/Ra$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    const-string v2, " configurations"

    const-string v3, "Error getting "

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 401
    invoke-virtual {p0}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U3;->e()Lcom/ironsource/Fb;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 403
    invoke-virtual {v0, p2}, Lcom/ironsource/Fb;->a(Ljava/lang/String;)Lcom/ironsource/Qb;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/Fb;->e()Lcom/ironsource/Qb;

    move-result-object p2

    :cond_0
    if-eqz p2, :cond_1

    .line 404
    new-instance p1, Lcom/ironsource/mediationsdk/model/Placement;

    invoke-direct {p1, p2}, Lcom/ironsource/mediationsdk/model/Placement;-><init>(Lcom/ironsource/mediationsdk/model/BasePlacement;)V

    return-object p1

    .line 408
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 400
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 409
    :cond_3
    invoke-virtual {p0}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U3;->c()Lcom/ironsource/V2;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 410
    invoke-virtual {v0, p2}, Lcom/ironsource/V2;->a(Ljava/lang/String;)Lcom/ironsource/i3;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {v0}, Lcom/ironsource/V2;->i()Lcom/ironsource/i3;

    move-result-object p1

    const-string p2, "config.defaultBannerPlacement"

    goto :goto_0

    :cond_4
    const-string p2, "config.getBannerPlacemen\u2026ig.defaultBannerPlacement"

    :goto_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    new-instance p2, Lcom/ironsource/mediationsdk/model/Placement;

    invoke-direct {p2, p1}, Lcom/ironsource/mediationsdk/model/Placement;-><init>(Lcom/ironsource/mediationsdk/model/BasePlacement;)V

    return-object p2

    .line 415
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 416
    :cond_6
    invoke-virtual {p0}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/U3;->d()Lcom/ironsource/B9;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 417
    invoke-virtual {p1, p2}, Lcom/ironsource/B9;->a(Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/InterstitialPlacement;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string p2, "getInterstitialPlacement(placementName)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    new-instance p2, Lcom/ironsource/mediationsdk/model/Placement;

    invoke-direct {p2, p1}, Lcom/ironsource/mediationsdk/model/Placement;-><init>(Lcom/ironsource/mediationsdk/model/BasePlacement;)V

    return-object p2

    :cond_7
    return-object v2

    .line 419
    :cond_8
    invoke-virtual {p0}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/U3;->f()Lcom/ironsource/Md;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 420
    invoke-virtual {p1, p2}, Lcom/ironsource/Md;->a(Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/Placement;

    move-result-object p1

    if-eqz p1, :cond_9

    const-string p2, "getRewardedVideoPlacement(placementName)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    new-instance v0, Lcom/ironsource/mediationsdk/model/Placement;

    .line 422
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementId()I

    move-result v1

    .line 423
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v2

    .line 424
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/BasePlacement;->isDefault()Z

    move-result v3

    .line 425
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardName()Ljava/lang/String;

    move-result-object v4

    .line 426
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardAmount()I

    move-result v5

    .line 427
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementAvailabilitySettings()Lcom/ironsource/Zc;

    move-result-object v6

    .line 428
    invoke-direct/range {v0 .. v6}, Lcom/ironsource/mediationsdk/model/Placement;-><init>(ILjava/lang/String;ZLjava/lang/String;ILcom/ironsource/Zc;)V

    return-object v0

    :cond_9
    return-object v2
.end method

.method public final c(Lcom/ironsource/jb;)Lcom/ironsource/wd;
    .locals 4

    const-string v0, "tools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->a()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/unity3d/mediation/LevelPlay$AdFormat;->REWARDED:Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/s;

    .line 430
    new-instance v1, Lcom/ironsource/wd;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 431
    invoke-virtual {v0}, Lcom/ironsource/s;->a()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ironsource/s;->c()Ljava/util/Map;

    move-result-object v2

    .line 432
    :cond_1
    invoke-direct {v1, p1, v3, v2}, Lcom/ironsource/wd;-><init>(Lcom/ironsource/jb;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public final c(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/mediation/LevelPlay$AdFormat;",
            ")",
            "Ljava/util/List<",
            "Lcom/ironsource/nc;",
            ">;"
        }
    .end annotation

    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/he;->d()Lcom/ironsource/nd;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/nd;->a()Ljava/util/Map;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/nd$a;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/nd$a;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 180
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 182
    check-cast v2, Ljava/lang/String;

    .line 183
    invoke-virtual {p0, p1, v2}, Lcom/ironsource/Ra;->d(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 356
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 357
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 358
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/mediation/LevelPlay$AdFormat;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ironsource/nc;",
            ">;"
        }
    .end annotation

    const-string v0, "adFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/he;->d()Lcom/ironsource/nd;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/nd;->a()Ljava/util/Map;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/nd$a;

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p1}, Lcom/ironsource/nd$a;->a()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 8
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/nd$b;

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/ironsource/nd$b;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 173
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 183
    check-cast v0, Ljava/lang/String;

    .line 184
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/he;->e()Lcom/ironsource/pd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/pd;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/nc;

    if-eqz v0, :cond_0

    .line 354
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2

    .line 355
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/unity3d/mediation/LevelPlayAdSize;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/V3;->c()Lcom/ironsource/U2;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/U2;->b()Lcom/ironsource/U2$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/U2$b;->a()Ljava/util/List;

    move-result-object v0

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 138
    check-cast v2, Ljava/lang/String;

    .line 139
    sget-object v3, Lcom/unity3d/mediation/LevelPlayAdSize;->Companion:Lcom/unity3d/mediation/LevelPlayAdSize$Companion;

    invoke-virtual {v3, v2}, Lcom/unity3d/mediation/LevelPlayAdSize$Companion;->createAdSize$mediationsdk_release(Ljava/lang/String;)Lcom/unity3d/mediation/LevelPlayAdSize;

    move-result-object v2

    .line 271
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final i()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->c()Lcom/ironsource/U2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U2;->b()Lcom/ironsource/U2$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U2$b;->b()F

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U3;->a()Lcom/ironsource/mediationsdk/adquality/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/adquality/a;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Yd;->g()Lcom/ironsource/he;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->b()Lcom/ironsource/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/z1;->d()Z

    move-result v0

    return v0
.end method
