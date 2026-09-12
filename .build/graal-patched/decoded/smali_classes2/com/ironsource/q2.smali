.class public final Lcom/ironsource/q2;
.super Lcom/ironsource/og;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuctionWaterfallFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuctionWaterfallFetcher.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/waterfall/fetch/AuctionWaterfallFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"
.end annotation


# instance fields
.field private final e:Lcom/ironsource/V0;

.field private final f:Lcom/ironsource/v0;

.field private final g:Lcom/ironsource/r2;

.field private final h:Lcom/ironsource/Lc;

.field private i:Lcom/ironsource/s2;


# direct methods
.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/og;-><init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    .line 7
    new-instance v0, Lcom/ironsource/r2;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/r2;-><init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V

    iput-object v0, p0, Lcom/ironsource/q2;->g:Lcom/ironsource/r2;

    .line 11
    invoke-virtual {v0}, Lcom/ironsource/r2;->b()Lcom/ironsource/e2;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/q2;->h:Lcom/ironsource/Lc;

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/q2;)Lcom/ironsource/V0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    return-object p0
.end method

.method private final a(Lcom/ironsource/C;Lcom/ironsource/pg;ILjava/lang/String;ILjava/lang/String;J)V
    .locals 8

    .line 83
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 84
    iget-object v1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Auction failed (error "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v0}, Lcom/ironsource/v0;->e()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->n()Z

    move-result v0

    .line 89
    sget-object v1, Lcom/ironsource/Y1;->a:Lcom/ironsource/Y1;

    invoke-virtual {v1, v0}, Lcom/ironsource/Y1;->a(Z)Ljava/lang/String;

    move-result-object v7

    .line 90
    new-instance v2, Lcom/ironsource/k2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p5

    move-object v3, v7

    move-object v7, p6

    invoke-direct/range {v2 .. v7}, Lcom/ironsource/k2;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/n2;ILjava/lang/String;)V

    move-object v7, v3

    .line 92
    iget-object v1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {v1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v1

    .line 93
    new-instance v3, Lcom/ironsource/U1;

    invoke-direct {v3, v2}, Lcom/ironsource/U1;-><init>(Lcom/ironsource/k2;)V

    invoke-virtual {v1, v3}, Lcom/ironsource/D5;->a(Lcom/ironsource/C0;)V

    .line 94
    invoke-virtual {v1}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object v1

    move-wide v2, p7

    invoke-virtual {v1, v2, v3, p3, p4}, Lcom/ironsource/R1;->a(JILjava/lang/String;)V

    if-eqz v0, :cond_0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p5

    move-object v6, p6

    .line 98
    invoke-direct/range {v2 .. v7}, Lcom/ironsource/q2;->a(Lcom/ironsource/C;Lcom/ironsource/pg;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 101
    :cond_0
    invoke-direct {p0, p2}, Lcom/ironsource/q2;->a(Lcom/ironsource/pg;)V

    return-void
.end method

.method private final a(Lcom/ironsource/C;Lcom/ironsource/pg;ILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 158
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "Moving to fallback waterfall"

    invoke-static {v1, v4, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 159
    new-instance v2, Lcom/ironsource/tc;

    iget-object v0, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-direct {v2, v0, v1}, Lcom/ironsource/tc;-><init>(Lcom/ironsource/V0;Lcom/ironsource/v0;)V

    move-object v7, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 160
    invoke-virtual/range {v2 .. v7}, Lcom/ironsource/tc;->a(Lcom/ironsource/pg;ILjava/lang/String;Ljava/lang/String;Lcom/ironsource/C;)V

    return-void
.end method

.method private final a(Lcom/ironsource/C;Lcom/ironsource/pg;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/ironsource/n2;Lorg/json/JSONObject;Lorg/json/JSONObject;IJILjava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/C;",
            "Lcom/ironsource/pg;",
            "Ljava/util/List<",
            "Lcom/ironsource/n2;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/G;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/ironsource/n2;",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            "IJI",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 63
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v1, v2, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 65
    new-instance v2, Lcom/ironsource/k2;

    const-string v7, ""

    move-object v3, p5

    move-object v5, p6

    move-object v4, p7

    move/from16 v6, p9

    invoke-direct/range {v2 .. v7}, Lcom/ironsource/k2;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/n2;ILjava/lang/String;)V

    .line 67
    invoke-static/range {p13 .. p13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_0

    .line 68
    iget-object p5, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {p5}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p5

    invoke-virtual {p5}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object p5

    move/from16 p6, p12

    move-object/from16 p7, p13

    invoke-virtual {p5, p6, p7}, Lcom/ironsource/Sf;->a(ILjava/lang/String;)V

    :cond_0
    move-object/from16 p5, p8

    .line 72
    invoke-direct {p0, p5}, Lcom/ironsource/q2;->a(Lorg/json/JSONObject;)V

    .line 75
    invoke-virtual {p0, p3, p4, v2, p1}, Lcom/ironsource/og;->a(Ljava/util/List;Ljava/util/Map;Lcom/ironsource/k2;Lcom/ironsource/C;)Lcom/ironsource/qg;

    move-result-object p1

    .line 76
    iget-object p3, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {p3}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p3

    new-instance p4, Lcom/ironsource/U1;

    invoke-direct {p4, v2}, Lcom/ironsource/U1;-><init>(Lcom/ironsource/k2;)V

    invoke-virtual {p3, p4}, Lcom/ironsource/D5;->a(Lcom/ironsource/C0;)V

    .line 77
    iget-object p3, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {p3}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object p3

    .line 78
    iget-object p4, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {p4}, Lcom/ironsource/v0;->v()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/ironsource/qg;->c()I

    move-result p5

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    const-string p6, ";wtf="

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    move-wide/from16 p5, p10

    .line 79
    invoke-virtual {p3, p5, p6, p4}, Lcom/ironsource/R1;->a(JLjava/lang/String;)V

    .line 81
    iget-object p3, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {p3}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ironsource/D5;->b()Lcom/ironsource/R1;

    move-result-object p3

    invoke-virtual {p1}, Lcom/ironsource/qg;->d()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/ironsource/R1;->c(Ljava/lang/String;)V

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/ironsource/q2;->a(Lcom/ironsource/qg;Lcom/ironsource/pg;)V

    return-void
.end method

.method private final a(Lcom/ironsource/pg;)V
    .locals 2

    const/16 v0, 0x1fd

    .line 161
    const-string v1, "Mediation No fill"

    invoke-interface {p1, v0, v1}, Lcom/ironsource/pg;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/q2;Lcom/ironsource/C;Lcom/ironsource/pg;ILjava/lang/String;ILjava/lang/String;J)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p8}, Lcom/ironsource/q2;->a(Lcom/ironsource/C;Lcom/ironsource/pg;ILjava/lang/String;ILjava/lang/String;J)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/q2;Lcom/ironsource/C;Lcom/ironsource/pg;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/ironsource/n2;Lorg/json/JSONObject;Lorg/json/JSONObject;IJILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p13}, Lcom/ironsource/q2;->a(Lcom/ironsource/C;Lcom/ironsource/pg;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/ironsource/n2;Lorg/json/JSONObject;Lorg/json/JSONObject;IJILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/q2;Lcom/ironsource/s2;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ironsource/q2;->i:Lcom/ironsource/s2;

    return-void
.end method

.method private final a(Lcom/ironsource/qg;Lcom/ironsource/pg;)V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/V0;->h()Lcom/ironsource/R0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/R0;->a(Lcom/ironsource/qg;)V

    .line 103
    invoke-interface {p2, p1}, Lcom/ironsource/pg;->a(Lcom/ironsource/qg;)V

    return-void
.end method

.method private final a(Lorg/json/JSONObject;)V
    .locals 7

    const-string v0, "bidderExclusive"

    const-string v1, "parallelLoad"

    const-string v2, "failed to update loading configuration for"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-nez p1, :cond_0

    .line 104
    iget-object p1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {p1, v3}, Lcom/ironsource/v0;->b(Z)V

    .line 105
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 106
    iget-object v0, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    .line 109
    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->v()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "loading configuration from auction response is null, using the following: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-static {v0, v1, v5, v4, v5}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void

    .line 119
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 120
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_1

    .line 122
    iget-object v6, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v6, v1}, Lcom/ironsource/v0;->a(I)V

    .line 125
    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 126
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 127
    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v1, v0}, Lcom/ironsource/v0;->a(Z)V

    .line 131
    :cond_2
    const-string v0, "showPriorityEnabled"

    .line 132
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 135
    iget-object v0, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v0, p1}, Lcom/ironsource/v0;->b(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v0, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5, v4, v5}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 145
    :try_start_1
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 146
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 148
    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 151
    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    iget-object p1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    iget-object v1, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v5, v4, v5}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void

    :goto_0
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/q2;->e:Lcom/ironsource/V0;

    iget-object v2, p0, Lcom/ironsource/q2;->f:Lcom/ironsource/v0;

    invoke-virtual {v2}, Lcom/ironsource/v0;->v()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v5, v4, v5}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lcom/ironsource/Lc;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ironsource/q2;->h:Lcom/ironsource/Lc;

    return-object v0
.end method

.method public a(Lcom/ironsource/C;Lcom/ironsource/pg;)V
    .locals 1

    const-string v0, "adInstanceFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waterfallFetcherListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lcom/ironsource/q2$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/q2$a;-><init>(Lcom/ironsource/q2;Lcom/ironsource/C;Lcom/ironsource/pg;)V

    .line 61
    iget-object p1, p0, Lcom/ironsource/q2;->g:Lcom/ironsource/r2;

    invoke-virtual {p1, v0}, Lcom/ironsource/r2;->a(Lcom/ironsource/s2;)V

    .line 62
    iput-object v0, p0, Lcom/ironsource/q2;->i:Lcom/ironsource/s2;

    return-void
.end method
