.class public final Lcom/ironsource/K9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ud;
.implements Lcom/ironsource/x4;
.implements Lcom/ironsource/w4;
.implements Lcom/ironsource/u4;
.implements Lcom/ironsource/v4;
.implements Lcom/ironsource/Q9;
.implements Lcom/ironsource/Cc;


# static fields
.field private static final m:Ljava/lang/String; = "IronSourceAdsPublisherAgent"

.field private static n:Lcom/ironsource/K9;


# instance fields
.field private a:Lcom/ironsource/sdk/controller/e;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/ironsource/Y4;

.field private e:Lcom/ironsource/dc;

.field private f:Z

.field private g:Lcom/ironsource/g4;

.field private h:Lcom/ironsource/sdk/controller/FeaturesManager;

.field private i:Lcom/ironsource/N8$a;

.field private j:Lcom/ironsource/O$a;

.field private k:Lcom/ironsource/O;

.field private l:Lcom/ironsource/o8;


# direct methods
.method static bridge synthetic -$$Nest$fgeta(Lcom/ironsource/K9;)Lcom/ironsource/sdk/controller/e;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetb(Lcom/ironsource/K9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/K9;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetc(Lcom/ironsource/K9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/K9;->c:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetd(Lcom/ironsource/K9;)Lcom/ironsource/Y4;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    return-object p0
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Lcom/ironsource/K9;->f:Z

    .line 4
    invoke-static {}, Lcom/ironsource/sdk/controller/FeaturesManager;->getInstance()Lcom/ironsource/sdk/controller/FeaturesManager;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/K9;->h:Lcom/ironsource/sdk/controller/FeaturesManager;

    .line 6
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object p2

    invoke-interface {p2}, Lcom/ironsource/I7;->j()Lcom/ironsource/N8$a;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    .line 8
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object p2

    invoke-interface {p2}, Lcom/ironsource/I7;->E()Lcom/ironsource/O$a;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    .line 10
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object p2

    invoke-interface {p2}, Lcom/ironsource/J7;->G()Lcom/ironsource/O;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    .line 12
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object p2

    invoke-interface {p2}, Lcom/ironsource/J7;->t()Lcom/ironsource/o8;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/K9;->l:Lcom/ironsource/o8;

    .line 18
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->c(Landroid/content/Context;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/ironsource/K9;->f:Z

    .line 22
    invoke-static {}, Lcom/ironsource/sdk/controller/FeaturesManager;->getInstance()Lcom/ironsource/sdk/controller/FeaturesManager;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/K9;->h:Lcom/ironsource/sdk/controller/FeaturesManager;

    .line 24
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->j()Lcom/ironsource/N8$a;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    .line 26
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->E()Lcom/ironsource/O$a;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    .line 28
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->G()Lcom/ironsource/O;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    .line 30
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->t()Lcom/ironsource/o8;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/K9;->l:Lcom/ironsource/o8;

    .line 40
    iput-object p1, p0, Lcom/ironsource/K9;->b:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/ironsource/K9;->c:Ljava/lang/String;

    .line 42
    invoke-direct {p0, p3}, Lcom/ironsource/K9;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;I)Lcom/ironsource/K9;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v0, Lcom/ironsource/K9;

    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "IronSourceAdsPublisherAgent"

    const-string v2, "getInstance()"

    invoke-static {v1, v2}, Lcom/ironsource/sdk/utils/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    sget-object v1, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;

    if-nez v1, :cond_0

    .line 12
    new-instance v1, Lcom/ironsource/K9;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/K9;-><init>(Landroid/content/Context;I)V

    sput-object v1, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;

    .line 15
    :cond_0
    sget-object p0, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/ironsource/Q9;
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, Lcom/ironsource/K9;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/ironsource/Q9;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/ironsource/Q9;
    .locals 2

    const-class v0, Lcom/ironsource/K9;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;

    if-nez v1, :cond_0

    .line 3
    sget-object v1, Lcom/ironsource/Sd;->a:Lcom/ironsource/Sd$a;

    invoke-static {v1}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;)V

    .line 5
    new-instance v1, Lcom/ironsource/K9;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/K9;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    sput-object v1, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;

    .line 8
    :cond_0
    sget-object p0, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private a(Lcom/ironsource/X4;)Lcom/ironsource/xc;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/X4;->i()Lcom/ironsource/wc;

    move-result-object p1

    check-cast p1, Lcom/ironsource/xc;

    return-object p1
.end method

.method private a(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 307
    const-string v0, "adm"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 308
    invoke-static {v1}, Lcom/ironsource/sdk/utils/SDKUtils;->decodeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 309
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/ironsource/K9;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v0, Lcom/ironsource/K9;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {p0, v1}, Lcom/ironsource/K9;->a(Landroid/content/Context;I)Lcom/ironsource/K9;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private b(Lcom/ironsource/X4;)Lcom/ironsource/zc;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/X4;->i()Lcom/ironsource/wc;

    move-result-object p1

    check-cast p1, Lcom/ironsource/zc;

    return-object p1
.end method

.method private b(Lcom/ironsource/G9;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/G9;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadOnNewInstance "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IronSourceAdsPublisherAgent"

    invoke-static {v1, v0}, Lcom/ironsource/sdk/utils/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v1, Lcom/ironsource/K9$f;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/K9$f;-><init>(Lcom/ironsource/K9;Lcom/ironsource/G9;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/X4;->i()Lcom/ironsource/wc;

    move-result-object p1

    check-cast p1, Lcom/ironsource/Ec;

    return-object p1
.end method

.method private c(Landroid/content/Context;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ironsource/sdk/utils/SDKUtils;->getNetworkConfiguration()Lorg/json/JSONObject;

    .line 3
    invoke-static {p1}, Lcom/ironsource/X9;->a(Landroid/content/Context;)Lcom/ironsource/X9;

    .line 4
    new-instance v0, Lcom/ironsource/ff;

    .line 7
    invoke-static {}, Lcom/ironsource/sdk/utils/SDKUtils;->getNetworkConfiguration()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "storage"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/ff;-><init>(Lorg/json/JSONObject;)V

    .line 8
    invoke-static {p1, v0}, Lcom/ironsource/sdk/utils/IronSourceStorageUtils;->initializeCacheDirectory(Landroid/content/Context;Lcom/ironsource/ff;)V

    .line 12
    invoke-static {}, Lcom/ironsource/X9;->e()Lcom/ironsource/X9;

    move-result-object v0

    .line 13
    invoke-static {}, Lcom/ironsource/sdk/utils/SDKUtils;->getSDKVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/X9;->d(Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/ironsource/Y4;

    invoke-direct {v0}, Lcom/ironsource/Y4;-><init>()V

    iput-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    .line 16
    new-instance v0, Lcom/ironsource/g4;

    invoke-direct {v0}, Lcom/ironsource/g4;-><init>()V

    iput-object v0, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    .line 19
    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 20
    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/ironsource/g4;->a(Landroid/app/Activity;)V

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ironsource/K9;->h:Lcom/ironsource/sdk/controller/FeaturesManager;

    invoke-virtual {v0}, Lcom/ironsource/sdk/controller/FeaturesManager;->getDebugMode()I

    move-result v6

    .line 26
    new-instance v0, Lcom/ironsource/dc;

    invoke-direct {v0}, Lcom/ironsource/dc;-><init>()V

    iput-object v0, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    .line 27
    new-instance v1, Lcom/ironsource/sdk/controller/e;

    iget-object v3, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    iget-object v4, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    sget-object v5, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    iget-object v0, p0, Lcom/ironsource/K9;->h:Lcom/ironsource/sdk/controller/FeaturesManager;

    .line 34
    invoke-virtual {v0}, Lcom/ironsource/sdk/controller/FeaturesManager;->getDataManagerConfig()Lorg/json/JSONObject;

    move-result-object v7

    iget-object v8, p0, Lcom/ironsource/K9;->b:Ljava/lang/String;

    iget-object v9, p0, Lcom/ironsource/K9;->c:Ljava/lang/String;

    iget-object v10, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lcom/ironsource/sdk/controller/e;-><init>(Landroid/content/Context;Lcom/ironsource/g4;Lcom/ironsource/Y4;Lcom/ironsource/T7;ILorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/dc;)V

    iput-object v1, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    .line 39
    invoke-static {v6}, Lcom/ironsource/sdk/utils/Logger;->enableLogging(I)V

    .line 41
    const-string p1, "IronSourceAdsPublisherAgent"

    const-string v0, "C\'tor"

    invoke-static {p1, v0}, Lcom/ironsource/sdk/utils/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, v2}, Lcom/ironsource/K9;->a(Landroid/content/Context;)V

    .line 45
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1}, Lcom/ironsource/dc;->d()V

    .line 46
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1}, Lcom/ironsource/dc;->e()V

    .line 47
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1, v2}, Lcom/ironsource/dc;->a(Landroid/content/Context;)V

    .line 48
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1}, Lcom/ironsource/dc;->b()V

    .line 49
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1}, Lcom/ironsource/dc;->a()V

    .line 50
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1, v2}, Lcom/ironsource/dc;->b(Landroid/content/Context;)V

    .line 51
    iget-object p1, p0, Lcom/ironsource/K9;->e:Lcom/ironsource/dc;

    invoke-virtual {p1}, Lcom/ironsource/dc;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 54
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 55
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method private c(Lcom/ironsource/G9;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/G9;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 81
    :try_start_0
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    .line 83
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 84
    new-instance v1, Lcom/ironsource/s8;

    invoke-direct {v1}, Lcom/ironsource/s8;-><init>()V

    .line 86
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "callfailreason"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    .line 87
    invoke-virtual {p1}, Lcom/ironsource/G9;->j()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "isbiddinginstance"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    .line 88
    invoke-virtual {p1}, Lcom/ironsource/G9;->m()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "isoneflow"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    .line 89
    invoke-virtual {p1}, Lcom/ironsource/G9;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "demandsourcename"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    .line 91
    invoke-static {p1}, Lcom/ironsource/R9;->a(Lcom/ironsource/G9;)Ljava/lang/String;

    move-result-object v2

    .line 92
    const-string v3, "producttype"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    sget-object v2, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    .line 97
    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v3

    .line 98
    invoke-virtual {v2, v3}, Lcom/ironsource/L;->b(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 99
    const-string v3, "custom_c"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v1

    .line 104
    sget-object v2, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/L;->a(Ljava/lang/String;)Z

    .line 105
    sget-object v2, Lcom/ironsource/Sd;->k:Lcom/ironsource/Sd$a;

    invoke-virtual {v1}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    .line 107
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "loadInAppBiddingAd failed decoding  ADM "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IronSourceAdsPublisherAgent"

    invoke-static {v1, v0}, Lcom/ironsource/sdk/utils/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/G9;Ljava/util/Map;)V

    return-void
.end method

.method private d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;
    .locals 1

    .line 14
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    invoke-virtual {v0, p1, p2}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lcom/ironsource/sdk/controller/e;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    return-object v0
.end method

.method public a(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    .line 34
    :try_start_0
    const-string v1, "IronSourceAdsPublisherAgent"

    const-string v2, "release()"

    invoke-static {v1, v2}, Lcom/ironsource/sdk/utils/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-static {}, Lcom/ironsource/b5;->g()V

    .line 37
    iget-object v1, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    invoke-virtual {v1}, Lcom/ironsource/g4;->b()V

    .line 39
    iget-object v1, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v1, p1}, Lcom/ironsource/sdk/controller/e;->a(Landroid/content/Context;)V

    .line 40
    iget-object p1, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {p1}, Lcom/ironsource/sdk/controller/e;->a()V

    .line 41
    iput-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 43
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 47
    :goto_0
    sput-object v0, Lcom/ironsource/K9;->n:Lcom/ironsource/K9;

    return-void
.end method

.method public a(Landroid/app/Activity;Lcom/ironsource/G9;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/ironsource/G9;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 310
    iget-object v0, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    invoke-virtual {v0, p1}, Lcom/ironsource/g4;->a(Landroid/app/Activity;)V

    .line 311
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "showAd "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IronSourceAdsPublisherAgent"

    invoke-static {v0, p1}, Lcom/ironsource/sdk/utils/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    iget-object p1, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 315
    invoke-virtual {p2}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object p2

    .line 316
    invoke-virtual {p1, v0, p2}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 322
    :cond_0
    iget-object p2, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v0, Lcom/ironsource/K9$g;

    invoke-direct {v0, p0, p1, p3}, Lcom/ironsource/K9$g;-><init>(Lcom/ironsource/K9;Lcom/ironsource/X4;Ljava/util/Map;)V

    invoke-virtual {p2, v0}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 335
    iput-boolean v0, p0, Lcom/ironsource/K9;->f:Z

    .line 336
    iget-object v0, p0, Lcom/ironsource/K9;->l:Lcom/ironsource/o8;

    .line 337
    const-string v1, "enableLifeCycleListeners"

    invoke-interface {v0, v1}, Lcom/ironsource/o8;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    .line 341
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 344
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ironsource/K9;->f:Z

    if-eqz v0, :cond_1

    .line 348
    :try_start_0
    new-instance v0, Lcom/ironsource/i;

    invoke-direct {v0, p0}, Lcom/ironsource/i;-><init>(Lcom/ironsource/Cc;)V

    .line 349
    check-cast p1, Landroid/app/Application;

    .line 350
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 352
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 353
    new-instance v0, Lcom/ironsource/s8;

    invoke-direct {v0}, Lcom/ironsource/s8;-><init>()V

    .line 354
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "generalmessage"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 355
    sget-object p1, Lcom/ironsource/Sd;->u:Lcom/ironsource/Sd$a;

    invoke-virtual {v0}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/ironsource/G9;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/G9;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 278
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "loadStartTime"

    invoke-interface {p2, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    sget-object v2, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lcom/ironsource/L;->a(Ljava/lang/String;J)Z

    .line 280
    new-instance v2, Lcom/ironsource/s8;

    invoke-direct {v2}, Lcom/ironsource/s8;-><init>()V

    .line 283
    invoke-virtual {p1}, Lcom/ironsource/G9;->j()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "isbiddinginstance"

    invoke-virtual {v2, v4, v3}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v3

    .line 284
    invoke-virtual {p1}, Lcom/ironsource/G9;->m()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "isoneflow"

    invoke-virtual {v3, v5, v4}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v3

    .line 285
    invoke-virtual {p1}, Lcom/ironsource/G9;->g()Ljava/lang/String;

    move-result-object v4

    const-string v5, "demandsourcename"

    invoke-virtual {v3, v5, v4}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v3

    .line 286
    invoke-static {p1}, Lcom/ironsource/R9;->a(Lcom/ironsource/G9;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "producttype"

    invoke-virtual {v3, v5, v4}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v3

    .line 287
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "custom_c"

    invoke-virtual {v3, v1, v0}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 289
    sget-object v0, Lcom/ironsource/Sd;->f:Lcom/ironsource/Sd$a;

    invoke-virtual {v2}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadAd "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IronSourceAdsPublisherAgent"

    invoke-static {v1, v0}, Lcom/ironsource/sdk/utils/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    new-instance v0, Lcom/ironsource/N;

    invoke-direct {v0, p1}, Lcom/ironsource/N;-><init>(Lcom/ironsource/G9;)V

    .line 294
    iget-object v1, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    invoke-interface {v1, v0}, Lcom/ironsource/O$a;->a(Lcom/ironsource/N;)V

    .line 295
    iget-object v1, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    sget-object v3, Lcom/ironsource/m0;->a:Lcom/ironsource/m0;

    .line 296
    invoke-virtual {v0}, Lcom/ironsource/N;->c()Ljava/lang/String;

    move-result-object v4

    .line 297
    invoke-interface {v1, v2, v3, v4}, Lcom/ironsource/O$a;->a(Lorg/json/JSONObject;Lcom/ironsource/m0;Ljava/lang/String;)V

    .line 299
    invoke-virtual {p0, p1}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 300
    new-instance v1, Lcom/ironsource/Me;

    invoke-direct {v1, v0}, Lcom/ironsource/Me;-><init>(Lcom/ironsource/N;)V

    .line 301
    iget-object v0, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/N8$a;->a(Lcom/ironsource/Ke;)V

    .line 303
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/G9;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;Ljava/util/Map;)V

    return-void

    .line 306
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/G9;Ljava/util/Map;)V

    return-void
.end method

.method public a(Lcom/ironsource/q8$e;Ljava/lang/String;)V
    .locals 1

    .line 117
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 119
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_0

    .line 120
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 122
    invoke-interface {p1}, Lcom/ironsource/Ec;->a()V

    return-void

    .line 124
    :cond_0
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_1

    .line 125
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 127
    invoke-interface {p1}, Lcom/ironsource/zc;->onInterstitialClick()V

    return-void

    .line 129
    :cond_1
    sget-object v0, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_2

    .line 130
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 132
    invoke-interface {p1}, Lcom/ironsource/xc;->onBannerClick()V

    :cond_2
    return-void
.end method

.method public a(Lcom/ironsource/q8$e;Ljava/lang/String;Lcom/ironsource/Y0;)V
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p2

    if-eqz p2, :cond_2

    const/4 v0, 0x2

    .line 50
    invoke-virtual {p2, v0}, Lcom/ironsource/X4;->b(I)V

    .line 52
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_0

    .line 53
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 55
    invoke-interface {p1, p3}, Lcom/ironsource/Ec;->a(Lcom/ironsource/Y0;)V

    return-void

    .line 57
    :cond_0
    sget-object p3, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne p1, p3, :cond_1

    .line 58
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 60
    invoke-interface {p1}, Lcom/ironsource/zc;->onInterstitialInitSuccess()V

    return-void

    .line 62
    :cond_1
    sget-object p3, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    if-ne p1, p3, :cond_2

    .line 63
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 65
    invoke-interface {p1}, Lcom/ironsource/xc;->onBannerInitSuccess()V

    :cond_2
    return-void
.end method

.method public a(Lcom/ironsource/q8$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/ironsource/s8;

    invoke-direct {v1}, Lcom/ironsource/s8;-><init>()V

    .line 70
    const-string v2, "demandsourcename"

    invoke-virtual {v1, v2, p2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p2

    .line 71
    const-string v1, "producttype"

    invoke-virtual {p2, v1, p1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p2

    .line 72
    const-string v1, "callfailreason"

    invoke-virtual {p2, v1, p3}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p2

    if-eqz v0, :cond_2

    .line 75
    sget-object v1, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    .line 77
    invoke-virtual {v0}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/L;->b(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 78
    const-string v3, "custom_c"

    invoke-virtual {p2, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 81
    invoke-static {v0}, Lcom/ironsource/y8;->a(Lcom/ironsource/X4;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "isbiddinginstance"

    invoke-virtual {p2, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 83
    invoke-virtual {v0}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/L;->a(Ljava/lang/String;)Z

    const/4 v1, 0x3

    .line 85
    invoke-virtual {v0, v1}, Lcom/ironsource/X4;->b(I)V

    .line 87
    sget-object v1, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v1, :cond_0

    .line 88
    invoke-direct {p0, v0}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 90
    invoke-interface {p1, p3}, Lcom/ironsource/Ec;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_0
    sget-object v1, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne p1, v1, :cond_1

    .line 93
    invoke-direct {p0, v0}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 95
    invoke-interface {p1, p3}, Lcom/ironsource/zc;->onInterstitialInitFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 97
    :cond_1
    sget-object v1, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    if-ne p1, v1, :cond_2

    .line 98
    invoke-direct {p0, v0}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 105
    invoke-interface {p1, p3}, Lcom/ironsource/xc;->onBannerLoadFail(Ljava/lang/String;)V

    .line 110
    :cond_2
    :goto_0
    sget-object p1, Lcom/ironsource/Sd;->i:Lcom/ironsource/Sd$a;

    invoke-virtual {p2}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    return-void
.end method

.method public a(Lcom/ironsource/q8$e;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    const-string v0, "Received Event Notification: "

    .line 133
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 135
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    :try_start_0
    const-string v2, "IronSourceAdsPublisherAgent"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " for demand source: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 144
    invoke-virtual {v1}, Lcom/ironsource/X4;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-static {v2, v0}, Lcom/ironsource/sdk/utils/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "demandSourceName"

    if-ne p1, v0, :cond_1

    .line 153
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 155
    invoke-virtual {p4, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 156
    invoke-interface {p1, p3, p4}, Lcom/ironsource/zc;->onInterstitialEventNotificationReceived(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 158
    :cond_1
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_2

    .line 159
    invoke-direct {p0, v1}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 161
    invoke-virtual {p4, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    invoke-interface {p1, p3, p4}, Lcom/ironsource/Ec;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 164
    :cond_2
    sget-object v0, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_3

    .line 165
    invoke-direct {p0, v1}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 168
    invoke-virtual {p4, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 169
    const-string p2, "impressions"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 170
    invoke-interface {p1}, Lcom/ironsource/xc;->onBannerShowSuccess()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 175
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 176
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    .line 111
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    .line 112
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 114
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 116
    invoke-interface {p1, p2}, Lcom/ironsource/Ec;->a(I)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/ironsource/h8;)V
    .locals 1

    .line 272
    sget-object v0, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 274
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {p1}, Lcom/ironsource/X4;->c()Lcom/ironsource/G9;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ironsource/xc;->onBannerLoadSuccess(Lcom/ironsource/G9;Lcom/ironsource/h8;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 219
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 220
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object v1

    .line 222
    new-instance v2, Lcom/ironsource/s8;

    invoke-direct {v2}, Lcom/ironsource/s8;-><init>()V

    .line 224
    const-string v3, "callfailreason"

    invoke-virtual {v2, v3, p2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v3

    .line 225
    const-string v4, "demandsourcename"

    invoke-virtual {v3, v4, p1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    if-eqz v1, :cond_1

    .line 231
    invoke-static {v1, v0}, Lcom/ironsource/y8;->a(Lcom/ironsource/X4;Lcom/ironsource/q8$e;)Lcom/ironsource/q8$e;

    move-result-object p1

    .line 232
    const-string v0, "producttype"

    invoke-virtual {v2, v0, p1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p1

    .line 237
    invoke-virtual {v1}, Lcom/ironsource/X4;->e()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    .line 238
    sget-object v0, Lcom/ironsource/F5;->E:Ljava/lang/Object;

    goto :goto_0

    .line 239
    :cond_0
    sget-object v0, Lcom/ironsource/F5;->F:Ljava/lang/Object;

    .line 240
    :goto_0
    const-string v3, "generalmessage"

    invoke-virtual {p1, v3, v0}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p1

    .line 245
    invoke-static {v1}, Lcom/ironsource/y8;->a(Lcom/ironsource/X4;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v3, "isbiddinginstance"

    invoke-virtual {p1, v3, v0}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p1

    sget-object v0, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    .line 249
    invoke-virtual {v1}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object v3

    .line 250
    invoke-virtual {v0, v3}, Lcom/ironsource/L;->b(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 251
    const-string v4, "custom_c"

    invoke-virtual {p1, v4, v3}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 256
    invoke-virtual {v1}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/L;->a(Ljava/lang/String;)Z

    .line 258
    invoke-direct {p0, v1}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 260
    invoke-interface {p1, p2}, Lcom/ironsource/zc;->onInterstitialLoadFailed(Ljava/lang/String;)V

    .line 264
    :cond_1
    sget-object p1, Lcom/ironsource/Sd;->g:Lcom/ironsource/Sd$a;

    invoke-virtual {v2}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 265
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    invoke-static {p1}, Lcom/ironsource/sdk/utils/SDKUtils;->getProductType(Ljava/lang/String;)Lcom/ironsource/q8$e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 268
    iget-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    .line 269
    invoke-virtual {v0, p1, p2}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 271
    invoke-virtual {p1, p3}, Lcom/ironsource/X4;->c(I)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ironsource/Ec;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ironsource/Ec;",
            ")V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/ironsource/K9;->b:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ironsource/K9;->c:Ljava/lang/String;

    .line 21
    iget-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    sget-object v1, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    .line 22
    invoke-virtual {v0, v1, p3, p4, p5}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;Ljava/util/Map;Lcom/ironsource/wc;)Lcom/ironsource/X4;

    move-result-object p3

    .line 25
    iget-object p4, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance p5, Lcom/ironsource/K9$a;

    invoke-direct {p5, p0, p1, p2, p3}, Lcom/ironsource/K9$a;-><init>(Lcom/ironsource/K9;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/X4;)V

    invoke-virtual {p4, p5}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ironsource/zc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ironsource/zc;",
            ")V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/ironsource/K9;->b:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ironsource/K9;->c:Ljava/lang/String;

    .line 29
    iget-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    sget-object v1, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 30
    invoke-virtual {v0, v1, p3, p4, p5}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;Ljava/util/Map;Lcom/ironsource/wc;)Lcom/ironsource/X4;

    move-result-object p3

    .line 32
    iget-object p4, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance p5, Lcom/ironsource/K9$c;

    invoke-direct {p5, p0, p1, p2, p3}, Lcom/ironsource/K9$c;-><init>(Lcom/ironsource/K9;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/X4;)V

    invoke-virtual {p4, p5}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 6

    .line 177
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 178
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object v1

    .line 180
    new-instance v2, Lcom/ironsource/s8;

    invoke-direct {v2}, Lcom/ironsource/s8;-><init>()V

    .line 181
    const-string v3, "demandsourcename"

    invoke-virtual {v2, v3, p1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p1

    if-eqz v1, :cond_1

    .line 183
    invoke-virtual {v1}, Lcom/ironsource/X4;->c()Lcom/ironsource/G9;

    move-result-object v2

    .line 184
    iget-object v3, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    sget-object v4, Lcom/ironsource/m0;->b:Lcom/ironsource/m0;

    invoke-virtual {v2}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, p2, v4, v5}, Lcom/ironsource/O$a;->a(Lorg/json/JSONObject;Lcom/ironsource/m0;Ljava/lang/String;)V

    .line 185
    invoke-virtual {p0, v2}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 186
    iget-object p2, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    invoke-virtual {v2}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/ironsource/O;->a(Ljava/lang/String;)Lcom/ironsource/N;

    move-result-object p2

    .line 187
    new-instance v2, Lcom/ironsource/Ne;

    invoke-direct {v2, p2}, Lcom/ironsource/Ne;-><init>(Lcom/ironsource/N;)V

    .line 189
    iget-object p2, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    invoke-interface {p2, v2}, Lcom/ironsource/N8$a;->a(Lcom/ironsource/Ke;)V

    .line 195
    :cond_0
    invoke-static {v1, v0}, Lcom/ironsource/y8;->a(Lcom/ironsource/X4;Lcom/ironsource/q8$e;)Lcom/ironsource/q8$e;

    move-result-object p2

    .line 196
    const-string v0, "producttype"

    invoke-virtual {p1, v0, p2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p2

    .line 199
    invoke-static {v1}, Lcom/ironsource/y8;->a(Lcom/ironsource/X4;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v2, "isbiddinginstance"

    invoke-virtual {p2, v2, v0}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object p2

    sget-object v0, Lcom/ironsource/L;->a:Lcom/ironsource/L;

    .line 203
    invoke-virtual {v1}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object v2

    .line 204
    invoke-virtual {v0, v2}, Lcom/ironsource/L;->b(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 205
    const-string v3, "custom_c"

    invoke-virtual {p2, v3, v2}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    .line 210
    invoke-virtual {v1}, Lcom/ironsource/X4;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ironsource/L;->a(Ljava/lang/String;)Z

    .line 212
    invoke-direct {p0, v1}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 214
    invoke-virtual {v1}, Lcom/ironsource/X4;->c()Lcom/ironsource/G9;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/ironsource/zc;->onInterstitialLoadSuccess(Lcom/ironsource/G9;)V

    .line 218
    :cond_1
    sget-object p2, Lcom/ironsource/Sd;->l:Lcom/ironsource/Sd$a;

    invoke-virtual {p1}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/ironsource/x8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v1, Lcom/ironsource/K9$b;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/K9$b;-><init>(Lcom/ironsource/K9;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/ironsource/G9;)Z
    .locals 2

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isAdAvailable "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IronSourceAdsPublisherAgent"

    invoke-static {v1, v0}, Lcom/ironsource/sdk/utils/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    iget-object v0, p0, Lcom/ironsource/K9;->d:Lcom/ironsource/Y4;

    sget-object v1, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 327
    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object p1

    .line 328
    invoke-virtual {v0, v1, p1}, Lcom/ironsource/Y4;->a(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 334
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/X4;->d()Z

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v0, p1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    .line 55
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v0}, Lcom/ironsource/sdk/controller/e;->e()V

    .line 58
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v0, p1}, Lcom/ironsource/sdk/controller/e;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 61
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 62
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/app/Activity;Lcom/ironsource/G9;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/ironsource/G9;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->g()Lcom/ironsource/B7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/t5;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    invoke-virtual {v0, p1}, Lcom/ironsource/g4;->a(Landroid/app/Activity;)V

    .line 42
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/ironsource/K9;->a(Lcom/ironsource/G9;Ljava/util/Map;)V

    return-void
.end method

.method public b(Lcom/ironsource/G9;)V
    .locals 3

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "destroyInstance "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IronSourceAdsPublisherAgent"

    invoke-static {v1, v0}, Lcom/ironsource/sdk/utils/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p1}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    sget-object v1, Lcom/ironsource/m0;->e:Lcom/ironsource/m0;

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ironsource/O$a;->a(Lcom/ironsource/m0;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ironsource/O;->a(Ljava/lang/String;)Lcom/ironsource/N;

    move-result-object v0

    .line 50
    new-instance v1, Lcom/ironsource/Le;

    invoke-direct {v1, v0}, Lcom/ironsource/Le;-><init>(Lcom/ironsource/N;)V

    .line 51
    iget-object v0, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/N8$a;->a(Lcom/ironsource/Ke;)V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v1, Lcom/ironsource/K9$h;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/K9$h;-><init>(Lcom/ironsource/K9;Lcom/ironsource/G9;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lcom/ironsource/q8$e;Ljava/lang/String;)V
    .locals 1

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 10
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_0

    .line 11
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1}, Lcom/ironsource/Ec;->d()V

    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_1

    .line 16
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 18
    invoke-interface {p1}, Lcom/ironsource/zc;->onInterstitialClose()V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 25
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 26
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 28
    invoke-virtual {p1}, Lcom/ironsource/X4;->c()Lcom/ironsource/G9;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    sget-object v2, Lcom/ironsource/m0;->c:Lcom/ironsource/m0;

    invoke-virtual {v0}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/ironsource/O$a;->a(Lcom/ironsource/m0;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0, v0}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 31
    iget-object v1, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    invoke-virtual {v0}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ironsource/O;->a(Ljava/lang/String;)Lcom/ironsource/N;

    move-result-object v0

    .line 32
    new-instance v1, Lcom/ironsource/Pe;

    invoke-direct {v1, v0}, Lcom/ironsource/Pe;-><init>(Lcom/ironsource/N;)V

    .line 34
    iget-object v0, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/N8$a;->a(Lcom/ironsource/Ke;)V

    .line 36
    :cond_0
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 38
    invoke-interface {p1}, Lcom/ironsource/zc;->onInterstitialShowSuccess()V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 19
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    .line 20
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 22
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 24
    invoke-interface {p1, p2}, Lcom/ironsource/Ec;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v0, "demandSourceName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v1, Lcom/ironsource/K9$d;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/K9$d;-><init>(Lcom/ironsource/K9;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ironsource/K9;->g:Lcom/ironsource/g4;

    invoke-virtual {v0, p1}, Lcom/ironsource/g4;->a(Landroid/app/Activity;)V

    .line 114
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v0}, Lcom/ironsource/sdk/controller/e;->g()V

    .line 116
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    invoke-virtual {v0, p1}, Lcom/ironsource/sdk/controller/e;->b(Landroid/content/Context;)V

    return-void
.end method

.method public c(Lcom/ironsource/q8$e;Ljava/lang/String;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 66
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_0

    .line 67
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 69
    invoke-interface {p1}, Lcom/ironsource/zc;->onInterstitialOpen()V

    return-void

    .line 71
    :cond_0
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-ne p1, v0, :cond_1

    .line 72
    invoke-direct {p0, p2}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 74
    invoke-interface {p1}, Lcom/ironsource/Ec;->b()V

    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 58
    sget-object v0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    .line 59
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 61
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->c(Lcom/ironsource/X4;)Lcom/ironsource/Ec;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 63
    invoke-interface {p1}, Lcom/ironsource/Ec;->c()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 75
    sget-object v0, Lcom/ironsource/q8$e;->a:Lcom/ironsource/q8$e;

    .line 76
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 78
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->a(Lcom/ironsource/X4;)Lcom/ironsource/xc;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 80
    invoke-interface {p1, p2}, Lcom/ironsource/xc;->onBannerLoadFail(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Lorg/json/JSONObject;)V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ironsource/K9;->a:Lcom/ironsource/sdk/controller/e;

    new-instance v1, Lcom/ironsource/K9$e;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/K9$e;-><init>(Lcom/ironsource/K9;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/sdk/controller/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lcom/ironsource/G9;)Z
    .locals 1

    .line 117
    invoke-virtual {p1}, Lcom/ironsource/G9;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/G9;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/ironsource/K9;->a(Lcom/ironsource/G9;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/ironsource/X4;->c()Lcom/ironsource/G9;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/ironsource/K9;->j:Lcom/ironsource/O$a;

    sget-object v2, Lcom/ironsource/m0;->d:Lcom/ironsource/m0;

    invoke-virtual {v0}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/ironsource/O$a;->a(Lcom/ironsource/m0;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/ironsource/K9;->c(Lcom/ironsource/G9;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/ironsource/K9;->k:Lcom/ironsource/O;

    invoke-virtual {v0}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ironsource/O;->a(Ljava/lang/String;)Lcom/ironsource/N;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/ironsource/Oe;

    invoke-direct {v1, v0}, Lcom/ironsource/Oe;-><init>(Lcom/ironsource/N;)V

    .line 9
    iget-object v0, p0, Lcom/ironsource/K9;->i:Lcom/ironsource/N8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/N8$a;->a(Lcom/ironsource/Ke;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1, p2}, Lcom/ironsource/zc;->onInterstitialShowFailed(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onInterstitialAdRewarded(Ljava/lang/String;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/ironsource/K9;->d(Lcom/ironsource/q8$e;Ljava/lang/String;)Lcom/ironsource/X4;

    move-result-object v0

    .line 4
    invoke-direct {p0, v0}, Lcom/ironsource/K9;->b(Lcom/ironsource/X4;)Lcom/ironsource/zc;

    move-result-object v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {v1, p1, p2}, Lcom/ironsource/zc;->onInterstitialAdRewarded(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPause(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/K9;->f:Z

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ironsource/K9;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public onResume(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/K9;->f:Z

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ironsource/K9;->c(Landroid/app/Activity;)V

    return-void
.end method
