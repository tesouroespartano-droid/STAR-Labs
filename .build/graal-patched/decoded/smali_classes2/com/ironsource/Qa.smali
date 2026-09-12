.class public final Lcom/ironsource/Qa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Qa$a;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlayBannerStrategyFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayBannerStrategyFactory.kt\ncom/unity3d/mediation/internal/ads/banner/strategy/LevelPlayBannerStrategyFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"
.end annotation


# static fields
.field public static final a:Lcom/ironsource/Qa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/Qa;

    invoke-direct {v0}, Lcom/ironsource/Qa;-><init>()V

    sput-object v0, Lcom/ironsource/Qa;->a:Lcom/ironsource/Qa;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ironsource/Qa;Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/Qa$a;Lcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Lcom/ironsource/s4;ILjava/lang/Object;)Lcom/ironsource/ta;
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Lcom/ironsource/s4$a;

    invoke-direct {v0}, Lcom/ironsource/s4$a;-><init>()V

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 2
    invoke-virtual/range {v1 .. v8}, Lcom/ironsource/Qa;->a(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/Qa$a;Lcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Lcom/ironsource/s4;)Lcom/ironsource/ta;

    move-result-object p0

    return-object p0
.end method

.method private final a(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/Qa$a;Lcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Z)Lcom/ironsource/ta;
    .locals 7

    .line 50
    new-instance v5, Lcom/ironsource/Pa;

    invoke-direct {v5, p5}, Lcom/ironsource/Pa;-><init>(Lcom/ironsource/ua;)V

    .line 52
    new-instance v3, Lcom/ironsource/j3$b;

    .line 53
    invoke-virtual {p3}, Lcom/ironsource/Qa$a;->d()J

    move-result-wide v0

    .line 54
    invoke-direct {v3, v0, v1, p7}, Lcom/ironsource/j3$b;-><init>(JZ)V

    .line 57
    new-instance v0, Lcom/ironsource/Jf;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ironsource/Jf;-><init>(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/j3$b;Lcom/ironsource/K2;Lcom/ironsource/l3;Lcom/ironsource/O2;)V

    .line 64
    new-instance p1, Lcom/ironsource/wa;

    invoke-direct {p1, v0, p5}, Lcom/ironsource/wa;-><init>(Lcom/ironsource/j3;Lcom/ironsource/ua;)V

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/Qa$a;Lcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Lcom/ironsource/s4;)Lcom/ironsource/ta;
    .locals 14

    move-object/from16 v2, p2

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdProperties"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strategyListener"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdUnitFactory"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeProvider"

    move-object/from16 v11, p7

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->g()Lcom/ironsource/B7;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Lcom/ironsource/t5;->c()Z

    move-result v0

    .line 6
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 7
    invoke-virtual {v3}, Lcom/ironsource/Qa$a;->f()Z

    move-result v5

    invoke-virtual {v3}, Lcom/ironsource/Qa$a;->d()J

    move-result-wide v6

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "Creating banner strategy - useLegacyStrategy: "

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v12, ", isAutoRefreshEnabled: "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v10, ", refreshInterval: "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 20
    invoke-virtual {v3}, Lcom/ironsource/Qa$a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/ironsource/Qa$a;->d()J

    move-result-wide v0

    const-wide/16 v5, 0x0

    cmp-long v0, v0, v5

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v1, p1

    move v7, v0

    move-object v5, v8

    move-object v6, v9

    move-object v0, p0

    .line 21
    invoke-direct/range {v0 .. v7}, Lcom/ironsource/Qa;->a(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/Qa$a;Lcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Z)Lcom/ironsource/ta;

    move-result-object p1

    return-object p1

    .line 29
    :cond_1
    invoke-virtual/range {p3 .. p3}, Lcom/ironsource/Qa$a;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30
    new-instance v0, Lcom/ironsource/xa;

    .line 33
    invoke-virtual/range {p3 .. p3}, Lcom/ironsource/Qa$a;->d()J

    move-result-wide v3

    .line 34
    invoke-virtual/range {p3 .. p3}, Lcom/ironsource/Qa$a;->e()J

    move-result-wide v5

    const/16 v12, 0x80

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    .line 35
    invoke-direct/range {v0 .. v13}, Lcom/ironsource/xa;-><init>(Lcom/ironsource/n0;Lcom/ironsource/X2;JJLcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Lcom/ironsource/if;Lcom/ironsource/s4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    move-object/from16 v2, p2

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    .line 45
    new-instance v0, Lcom/ironsource/Ja;

    invoke-direct {v0, p1, v2, v9}, Lcom/ironsource/Ja;-><init>(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/O2;)V

    .line 49
    invoke-virtual {v0, v8}, Lcom/ironsource/Ja;->a(Lcom/ironsource/ua;)V

    return-object v0
.end method
