.class public Lcom/ironsource/mediationsdk/r;
.super Lcom/ironsource/mediationsdk/y;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;
.implements Lcom/ironsource/A3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/mediationsdk/r$b;
    }
.end annotation


# instance fields
.field private h:Lcom/ironsource/mediationsdk/r$b;

.field private i:Lcom/ironsource/oa;

.field private j:Ljava/util/Timer;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/ironsource/mediationsdk/model/Placement;

.field private o:J

.field private p:Ljava/lang/String;

.field private q:Lorg/json/JSONObject;

.field private r:I

.field private s:Ljava/lang/String;

.field private final t:Ljava/lang/Object;

.field private final u:Ljava/lang/Object;

.field private v:J

.field private final w:Lcom/ironsource/M8$a;


# direct methods
.method static bridge synthetic -$$Nest$fgeth(Lcom/ironsource/mediationsdk/r;)Lcom/ironsource/mediationsdk/r$b;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgeti(Lcom/ironsource/mediationsdk/r;)Lcom/ironsource/oa;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$ma(Lcom/ironsource/mediationsdk/r;Lcom/ironsource/mediationsdk/r$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    return-void
.end method

.method static bridge synthetic -$$Nest$mv(Lcom/ironsource/mediationsdk/r;)J
    .locals 2

    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public constructor <init>(Lcom/ironsource/mediationsdk/r;Lcom/ironsource/oa;Lcom/ironsource/mediationsdk/AbstractAdapter;ILjava/lang/String;Lorg/json/JSONObject;ILjava/lang/String;)V
    .locals 8

    .line 39
    iget-object v1, p1, Lcom/ironsource/mediationsdk/r;->l:Ljava/lang/String;

    iget-object v2, p1, Lcom/ironsource/mediationsdk/r;->m:Ljava/lang/String;

    iget-object v0, p1, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    .line 42
    invoke-virtual {v0}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v3

    iget v5, p1, Lcom/ironsource/mediationsdk/r;->k:I

    move-object v0, p0

    move-object v4, p2

    move-object v6, p3

    move v7, p4

    .line 43
    invoke-direct/range {v0 .. v7}, Lcom/ironsource/mediationsdk/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/oa;ILcom/ironsource/mediationsdk/AbstractAdapter;I)V

    .line 51
    iput-object p5, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    .line 52
    iput-object p6, p0, Lcom/ironsource/mediationsdk/r;->q:Lorg/json/JSONObject;

    .line 53
    iput p7, p0, Lcom/ironsource/mediationsdk/r;->r:I

    move-object/from16 p1, p8

    .line 54
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/oa;ILcom/ironsource/mediationsdk/AbstractAdapter;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/b1;

    .line 3
    invoke-virtual {p3}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getRewardedVideoSettings()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-direct {v0, p3, v1, v2}, Lcom/ironsource/b1;-><init>(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 4
    invoke-direct {p0, v0, p6}, Lcom/ironsource/mediationsdk/y;-><init>(Lcom/ironsource/b1;Lcom/ironsource/mediationsdk/AbstractAdapter;)V

    .line 5
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    .line 6
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/ironsource/mediationsdk/r;->u:Ljava/lang/Object;

    .line 27
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object p3

    invoke-interface {p3}, Lcom/ironsource/I7;->h()Lcom/ironsource/M8$a;

    move-result-object p3

    iput-object p3, p0, Lcom/ironsource/mediationsdk/r;->w:Lcom/ironsource/M8$a;

    .line 29
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->l:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/ironsource/mediationsdk/r;->m:Ljava/lang/String;

    .line 31
    iput-object p4, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->j:Ljava/util/Timer;

    .line 33
    iput p5, p0, Lcom/ironsource/mediationsdk/r;->k:I

    .line 34
    iput p7, p0, Lcom/ironsource/mediationsdk/y;->f:I

    .line 35
    sget-object p1, Lcom/ironsource/mediationsdk/r$b;->a:Lcom/ironsource/mediationsdk/r$b;

    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    const-wide/16 p1, 0x0

    .line 36
    iput-wide p1, p0, Lcom/ironsource/mediationsdk/r;->v:J

    .line 37
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->t()V

    :cond_0
    return-void
.end method

.method private C()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getConfigFile()Lcom/ironsource/mediationsdk/config/ConfigFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getPluginType()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->setPluginData(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setCustomParams() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private D()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->u:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/ironsource/mediationsdk/r;->j:Ljava/util/Timer;

    .line 3
    new-instance v2, Lcom/ironsource/mediationsdk/r$a;

    invoke-direct {v2, p0}, Lcom/ironsource/mediationsdk/r$a;-><init>(Lcom/ironsource/mediationsdk/r;)V

    iget v3, p0, Lcom/ironsource/mediationsdk/r;->k:I

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 51
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->u:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->j:Ljava/util/Timer;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/ironsource/mediationsdk/r;->j:Ljava/util/Timer;

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private a(Lcom/ironsource/C5;[[Ljava/lang/Object;Z)V
    .locals 6

    .line 94
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->m()Ljava/util/Map;

    move-result-object v0

    .line 96
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 97
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    const-string v2, "auctionId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->q:Lorg/json/JSONObject;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 101
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->q:Lorg/json/JSONObject;

    const-string v2, "genericParams"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p3, :cond_2

    .line 104
    iget-object p3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_2

    .line 105
    iget-object p3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-virtual {p3}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object p3

    const-string v1, "placement"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    :cond_2
    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/r;->c(Lcom/ironsource/C5;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 109
    invoke-static {}, Lcom/ironsource/Od;->i()Lcom/ironsource/Od;

    move-result-object p3

    iget v1, p0, Lcom/ironsource/mediationsdk/r;->r:I

    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->s:Ljava/lang/String;

    .line 110
    invoke-virtual {p3, v0, v1, v2}, Lcom/ironsource/u3;->a(Ljava/util/Map;ILjava/lang/String;)V

    .line 113
    :cond_3
    iget p3, p0, Lcom/ironsource/mediationsdk/y;->f:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v1, "sessionDepth"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_4

    .line 117
    :try_start_0
    array-length p3, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p3, :cond_4

    aget-object v3, p2, v2

    .line 118
    aget-object v4, v3, v1

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aget-object v3, v3, v5

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p2

    .line 122
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 123
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object p3

    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " smash: RV sendProviderEvent "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x3

    .line 127
    invoke-virtual {p3, v1, p2, v2}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V

    .line 133
    :cond_4
    new-instance p2, Lcom/ironsource/B5;

    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-direct {p2, p1, p3}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 134
    invoke-static {}, Lcom/ironsource/Od;->i()Lcom/ironsource/Od;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    .line 136
    sget-object p2, Lcom/ironsource/C5;->q0:Lcom/ironsource/C5;

    if-ne p1, p2, :cond_5

    .line 141
    iget-object p1, p0, Lcom/ironsource/mediationsdk/r;->w:Lcom/ironsource/M8$a;

    sget-object p2, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {p1, p2}, Lcom/ironsource/M8$a;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    :cond_5
    return-void
.end method

.method private a(Lcom/ironsource/mediationsdk/r$b;)V
    .locals 2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "current state="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", new state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v0

    .line 89
    :try_start_0
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    .line 90
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 91
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private b(Lcom/ironsource/C5;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method private c(Lcom/ironsource/C5;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/C5;->P:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->Q:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->n0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->z0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->A0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->S:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->q0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->o0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->p0:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->T:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->U:Lcom/ironsource/C5;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private t()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isBidder = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldEarlyInit = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/mediationsdk/r$b;->b:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 5
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->C()V

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2, v3, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->initRewardedVideoWithCallback(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 10
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initForBidding exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 12
    new-instance v1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x410

    invoke-direct {v1, v2, v0}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 15
    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/r;->onRewardedVideoInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method private v()J
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/mediationsdk/r;->o:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public A()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->e:Lcom/ironsource/mediationsdk/r$b;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 5
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->isRewardedVideoAvailable(Lorg/json/JSONObject;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "isReadyToShow exception: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 9
    sget-object v1, Lcom/ironsource/C5;->m4:Lcom/ironsource/C5;

    const/16 v3, 0x138a

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "errorCode"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const-string v4, "reason"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [[Ljava/lang/Object;

    aput-object v3, v4, v2

    const/4 v3, 0x1

    aput-object v0, v4, v3

    .line 14
    invoke-virtual {p0, v1, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return v2
.end method

.method public B()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/C5;->M0:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;)V

    return-void
.end method

.method public a(Lcom/ironsource/C5;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 92
    invoke-direct {p0, p1, v0, v1}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;Z)V

    return-void
.end method

.method public a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, p1, p2, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;Z)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/model/Placement;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->E()V

    .line 73
    const-string v0, "showVideo()"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 74
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    .line 75
    sget-object p1, Lcom/ironsource/mediationsdk/r$b;->f:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 76
    sget-object p1, Lcom/ironsource/C5;->o0:Lcom/ironsource/C5;

    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    .line 79
    :try_start_0
    iget-object p1, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {p1, v0, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->showRewardedVideo(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 81
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "showVideo exception: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 83
    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 84
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x40e

    invoke-direct {v0, v1, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 85
    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/r;->onRewardedVideoAdShowFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadVideo() auctionId: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ironsource/mediationsdk/y;->g:Ljava/lang/Long;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->a(Z)V

    .line 7
    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v2

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    .line 9
    sget-object v3, Lcom/ironsource/mediationsdk/r$b;->d:Lcom/ironsource/mediationsdk/r$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eq v0, v3, :cond_0

    :try_start_1
    sget-object v4, Lcom/ironsource/mediationsdk/r$b;->f:Lcom/ironsource/mediationsdk/r$b;

    if-eq v0, v4, :cond_0

    .line 10
    invoke-direct {p0, v3}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v10, p0

    goto/16 :goto_5

    .line 12
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const/4 v2, 0x1

    const/4 v4, 0x2

    if-ne v0, v3, :cond_1

    .line 16
    sget-object p1, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 p2, 0x138b

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "errorCode"

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    new-array v0, v4, [[Ljava/lang/Object;

    aput-object p2, v0, v1

    const-string p2, "reason"

    const-string v1, "load during load"

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    aput-object p2, v0, v2

    .line 20
    invoke-virtual {p0, p1, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 29
    :cond_1
    sget-object v3, Lcom/ironsource/mediationsdk/r$b;->f:Lcom/ironsource/mediationsdk/r$b;

    if-ne v0, v3, :cond_2

    .line 30
    sget-object p1, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 p2, 0x138c

    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "errorCode"

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    new-array v0, v4, [[Ljava/lang/Object;

    aput-object p2, v0, v1

    const-string p2, "reason"

    const-string v1, "load during show"

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    aput-object p2, v0, v2

    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 42
    :cond_2
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->D()V

    .line 43
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/ironsource/mediationsdk/r;->o:J

    .line 44
    sget-object v0, Lcom/ironsource/C5;->P:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;)V

    .line 47
    :try_start_3
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v0, :cond_3

    .line 48
    :try_start_4
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v3, p2, p1, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->loadRewardedVideoForBidding(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v10, p0

    goto :goto_2

    .line 53
    :cond_3
    :try_start_5
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->C()V

    .line 54
    iget-object v5, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v6, p0, Lcom/ironsource/mediationsdk/r;->l:Ljava/lang/String;

    iget-object v7, p0, Lcom/ironsource/mediationsdk/r;->m:Ljava/lang/String;

    iget-object v8, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v10, p0

    move-object v9, p2

    :try_start_6
    invoke-virtual/range {v5 .. v10}, Lcom/ironsource/mediationsdk/AbstractAdapter;->initAndLoadRewardedVideo(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    return-void

    :catchall_2
    move-exception v0

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object v10, p0

    :goto_1
    move-object p1, v0

    .line 57
    :goto_2
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 59
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "loadVideo exception: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x138d

    goto :goto_3

    :cond_4
    const/16 p2, 0x1390

    .line 66
    :goto_3
    sget-object v0, Lcom/ironsource/C5;->m4:Lcom/ironsource/C5;

    .line 69
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v3, "errorCode"

    filled-new-array {v3, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    const-string v3, "reason"

    filled-new-array {v3, p1}, [Ljava/lang/Object;

    move-result-object p1

    new-array v3, v4, [[Ljava/lang/Object;

    aput-object p2, v3, v1

    aput-object p1, v3, v2

    .line 70
    invoke-virtual {p0, v0, v3}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    :catchall_4
    move-exception v0

    move-object v10, p0

    :goto_4
    move-object p1, v0

    .line 71
    :goto_5
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw p1

    :catchall_5
    move-exception v0

    goto :goto_4
.end method

.method public b(Lcom/ironsource/C5;[[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;Z)V

    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/C5;->w0:Lcom/ironsource/C5;

    if-eqz p1, :cond_0

    .line 2
    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    :goto_0
    const-string v1, "status"

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method public collectBiddingData(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/C5;->V:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;)V

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;->getAdUnitData()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/ironsource/ba;->a(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, p1, p2}, Lcom/ironsource/mediationsdk/AbstractAdapter;->collectRewardedVideoBiddingData(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 12
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "collectBiddingData exception: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 14
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public d()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "LWSProgRvSmash"

    return-object v0
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public onRewardedVideoAdClicked()V
    .locals 2

    .line 1
    const-string v0, "onRewardedVideoAdClicked"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-interface {v0, p0, v1}, Lcom/ironsource/oa;->b(Lcom/ironsource/mediationsdk/r;Lcom/ironsource/mediationsdk/model/Placement;)V

    .line 3
    sget-object v0, Lcom/ironsource/C5;->T:Lcom/ironsource/C5;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onRewardedVideoAdClosed()V
    .locals 6

    const-string v0, "adClosed: "

    .line 1
    const-string v1, "onRewardedVideoAdClosed"

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v3, Lcom/ironsource/mediationsdk/r$b;->f:Lcom/ironsource/mediationsdk/r$b;

    if-eq v2, v3, :cond_0

    .line 5
    sget-object v2, Lcom/ironsource/C5;->q0:Lcom/ironsource/C5;

    invoke-direct {p0, v2}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    .line 6
    sget-object v2, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 v3, 0x1391

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "errorCode"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "reason"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [[Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v0, v4, v3

    .line 10
    invoke-virtual {p0, v2, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 15
    monitor-exit v1

    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/r$b;->g:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ironsource/mediationsdk/r;->v:J

    .line 21
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {v0, p0}, Lcom/ironsource/oa;->c(Lcom/ironsource/mediationsdk/r;)V

    return-void

    :catchall_0
    move-exception v0

    .line 22
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onRewardedVideoAdEnded()V
    .locals 1

    .line 1
    const-string v0, "onRewardedVideoAdEnded"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {v0, p0}, Lcom/ironsource/oa;->e(Lcom/ironsource/mediationsdk/r;)V

    .line 3
    sget-object v0, Lcom/ironsource/C5;->s0:Lcom/ironsource/C5;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onRewardedVideoAdOpened()V
    .locals 1

    .line 1
    const-string v0, "onRewardedVideoAdOpened"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {v0, p0}, Lcom/ironsource/oa;->f(Lcom/ironsource/mediationsdk/r;)V

    .line 3
    sget-object v0, Lcom/ironsource/C5;->S:Lcom/ironsource/C5;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onRewardedVideoAdRewarded()V
    .locals 7

    .line 1
    const-string v0, "onRewardedVideoAdRewarded"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-interface {v2, p0, v3}, Lcom/ironsource/oa;->a(Lcom/ironsource/mediationsdk/r;Lcom/ironsource/mediationsdk/model/Placement;)V

    .line 4
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->m()Ljava/util/Map;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "placement"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rewardName"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardAmount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "rewardAmount"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_0
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/p;->l()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 13
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/p;->l()Ljava/lang/String;

    move-result-object v3

    const-string v4, "dynamicUserId"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_1
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 17
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 18
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "custom_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ironsource/mediationsdk/p;->s()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_2
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 23
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    const-string v4, "auctionId"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    :cond_3
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->q:Lorg/json/JSONObject;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_4

    .line 27
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->q:Lorg/json/JSONObject;

    const-string v4, "genericParams"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    :cond_4
    sget-object v3, Lcom/ironsource/C5;->U:Lcom/ironsource/C5;

    invoke-direct {p0, v3}, Lcom/ironsource/mediationsdk/r;->c(Lcom/ironsource/C5;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 31
    invoke-static {}, Lcom/ironsource/Od;->i()Lcom/ironsource/Od;

    move-result-object v4

    iget v5, p0, Lcom/ironsource/mediationsdk/r;->r:I

    iget-object v6, p0, Lcom/ironsource/mediationsdk/r;->s:Ljava/lang/String;

    .line 32
    invoke-virtual {v4, v2, v5, v6}, Lcom/ironsource/u3;->a(Ljava/util/Map;ILjava/lang/String;)V

    .line 35
    :cond_5
    iget v4, p0, Lcom/ironsource/mediationsdk/y;->f:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "sessionDepth"

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    new-instance v4, Lcom/ironsource/B5;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-direct {v4, v3, v5}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 39
    invoke-virtual {v4}, Lcom/ironsource/B5;->d()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v5}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getTransId(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 40
    const-string v3, "transId"

    invoke-virtual {v4, v3, v2}, Lcom/ironsource/B5;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    iget-wide v2, p0, Lcom/ironsource/mediationsdk/r;->v:J

    const-wide/16 v5, 0x0

    cmp-long v5, v2, v5

    if-eqz v5, :cond_6

    sub-long/2addr v0, v2

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onRewardedVideoAdRewarded timeAfterClosed="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 44
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "duration"

    invoke-virtual {v4, v1, v0}, Lcom/ironsource/B5;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    :cond_6
    invoke-static {}, Lcom/ironsource/Od;->i()Lcom/ironsource/Od;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    return-void
.end method

.method public onRewardedVideoAdShowFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 7

    const-string v0, "showFailed: "

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onRewardedVideoAdShowFailed error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/ironsource/C5;->p0:Lcom/ironsource/C5;

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "reason"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x2

    new-array v5, v4, [[Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    .line 6
    invoke-virtual {p0, v1, v5}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 12
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v1

    .line 13
    :try_start_0
    iget-object v3, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v5, Lcom/ironsource/mediationsdk/r$b;->f:Lcom/ironsource/mediationsdk/r$b;

    if-eq v3, v5, :cond_0

    .line 14
    sget-object p1, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 v3, 0x138e

    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "errorCode"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "reason"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    new-array v4, v4, [[Ljava/lang/Object;

    aput-object v3, v4, v6

    aput-object v0, v4, v2

    .line 18
    invoke-virtual {p0, p1, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 24
    monitor-exit v1

    return-void

    .line 26
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/r$b;->g:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 27
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {v0, p1, p0}, Lcom/ironsource/oa;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/r;)V

    return-void

    :catchall_0
    move-exception p1

    .line 30
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onRewardedVideoAdStarted()V
    .locals 1

    .line 1
    const-string v0, "onRewardedVideoAdStarted"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {v0, p0}, Lcom/ironsource/oa;->b(Lcom/ironsource/mediationsdk/r;)V

    .line 3
    sget-object v0, Lcom/ironsource/C5;->r0:Lcom/ironsource/C5;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onRewardedVideoAdVisible()V
    .locals 1

    .line 1
    const-string v0, "onRewardedVideoAdVisible"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/ironsource/C5;->t0:Lcom/ironsource/C5;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->b(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onRewardedVideoAvailabilityChanged(Z)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onRewardedVideoAvailabilityChanged available="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v2, Lcom/ironsource/mediationsdk/r$b;->d:Lcom/ironsource/mediationsdk/r$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    if-eqz p1, :cond_0

    .line 9
    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->e:Lcom/ironsource/mediationsdk/r$b;

    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->c:Lcom/ironsource/mediationsdk/r$b;

    :goto_0
    invoke-direct {p0, v1}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    .line 14
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    .line 23
    sget-object p1, Lcom/ironsource/C5;->u0:Lcom/ironsource/C5;

    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    .line 24
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ext1"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    new-array v1, v3, [[Ljava/lang/Object;

    aput-object v0, v1, v4

    .line 25
    invoke-virtual {p0, p1, v1}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 28
    :cond_2
    sget-object p1, Lcom/ironsource/C5;->v0:Lcom/ironsource/C5;

    const/16 v0, 0x40a

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "errorCode"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 32
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    .line 33
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const-string v5, "ext1"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v5, 0x3

    new-array v5, v5, [[Ljava/lang/Object;

    aput-object v0, v5, v4

    aput-object v1, v5, v3

    const/4 v0, 0x2

    aput-object v2, v5, v0

    .line 34
    invoke-virtual {p0, p1, v5}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 44
    :cond_3
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->E()V

    if-eqz p1, :cond_4

    .line 46
    sget-object v0, Lcom/ironsource/C5;->Q:Lcom/ironsource/C5;

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/ironsource/C5;->n0:Lcom/ironsource/C5;

    .line 47
    :goto_2
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    new-array v2, v3, [[Ljava/lang/Object;

    aput-object v1, v2, v4

    .line 48
    invoke-virtual {p0, v0, v2}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    .line 53
    iget-object p1, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {p1, p0}, Lcom/ironsource/oa;->a(Lcom/ironsource/mediationsdk/r;)V

    return-void

    .line 55
    :cond_5
    iget-object p1, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {p1, p0}, Lcom/ironsource/oa;->d(Lcom/ironsource/mediationsdk/r;)V

    return-void

    :catchall_0
    move-exception p1

    .line 56
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onRewardedVideoInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 9

    const-string v0, "initFailed: "

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onRewardedVideoInitFailed error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->E()V

    .line 4
    sget-object v1, Lcom/ironsource/C5;->n0:Lcom/ironsource/C5;

    const/16 v2, 0x409

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "duration"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x2

    new-array v5, v4, [[Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    .line 8
    invoke-virtual {p0, v1, v5}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 13
    sget-object v1, Lcom/ironsource/C5;->z0:Lcom/ironsource/C5;

    .line 16
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "errorCode"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    const-string v5, "reason"

    filled-new-array {v5, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 18
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v7, "duration"

    filled-new-array {v7, v5}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x3

    new-array v7, v7, [[Ljava/lang/Object;

    aput-object v3, v7, v6

    aput-object p1, v7, v2

    aput-object v5, v7, v4

    .line 19
    invoke-virtual {p0, v1, v7}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 27
    iget-object p1, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter p1

    .line 28
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v3, Lcom/ironsource/mediationsdk/r$b;->b:Lcom/ironsource/mediationsdk/r$b;

    if-eq v1, v3, :cond_0

    .line 29
    sget-object v1, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 v3, 0x1390

    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "errorCode"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "reason"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    new-array v4, v4, [[Ljava/lang/Object;

    aput-object v3, v4, v6

    aput-object v0, v4, v2

    .line 33
    invoke-virtual {p0, v1, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 39
    monitor-exit p1

    return-void

    .line 41
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/r$b;->a:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 42
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    iget-object p1, p0, Lcom/ironsource/mediationsdk/r;->i:Lcom/ironsource/oa;

    invoke-interface {p1, p0}, Lcom/ironsource/oa;->d(Lcom/ironsource/mediationsdk/r;)V

    return-void

    :catchall_0
    move-exception v0

    .line 44
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onRewardedVideoInitSuccess()V
    .locals 6

    const-string v0, "initSuccess: "

    .line 1
    const-string v1, "onRewardedVideoInitSuccess"

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r;->t:Ljava/lang/Object;

    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v3, Lcom/ironsource/mediationsdk/r$b;->b:Lcom/ironsource/mediationsdk/r$b;

    if-eq v2, v3, :cond_0

    .line 5
    sget-object v2, Lcom/ironsource/C5;->g4:Lcom/ironsource/C5;

    const/16 v3, 0x138f

    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "errorCode"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "reason"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [[Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v0, v4, v3

    .line 9
    invoke-virtual {p0, v2, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 15
    monitor-exit v1

    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/r$b;->c:Lcom/ironsource/mediationsdk/r$b;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/mediationsdk/r$b;)V

    .line 18
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    .line 19
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onRewardedVideoLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v0

    const/16 v1, 0x422

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "duration"

    const-string v6, "errorCode"

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/C5;->A0:Lcom/ironsource/C5;

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v6, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v1

    new-array v4, v4, [[Ljava/lang/Object;

    aput-object p1, v4, v3

    aput-object v1, v4, v2

    .line 6
    invoke-virtual {p0, v0, v4}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v0

    const/16 v1, 0x421

    if-ne v0, v1, :cond_1

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/mediationsdk/y;->g:Ljava/lang/Long;

    .line 16
    :cond_1
    sget-object v0, Lcom/ironsource/C5;->z0:Lcom/ironsource/C5;

    .line 19
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v6, v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    const-string v6, "reason"

    filled-new-array {v6, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 21
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/r;->v()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [[Ljava/lang/Object;

    aput-object v1, v6, v3

    aput-object p1, v6, v2

    aput-object v5, v6, v4

    .line 22
    invoke-virtual {p0, v0, v6}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method public onRewardedVideoLoadSuccess()V
    .locals 0

    return-void
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->p:Ljava/lang/String;

    return-object v0
.end method

.method public w()Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getLoadWhileShowSupportState(Lorg/json/JSONObject;)Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception while calling adapter.getLoadWhileShowSupportState() - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/y;->b(Ljava/lang/String;)V

    .line 8
    sget-object v0, Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;->NONE:Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;

    return-object v0
.end method

.method public x()Lcom/ironsource/mediationsdk/model/Placement;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->n:Lcom/ironsource/mediationsdk/model/Placement;

    return-object v0
.end method

.method public y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->e:Lcom/ironsource/mediationsdk/r$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r;->h:Lcom/ironsource/mediationsdk/r$b;

    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->b:Lcom/ironsource/mediationsdk/r$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/ironsource/mediationsdk/r$b;->d:Lcom/ironsource/mediationsdk/r$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
