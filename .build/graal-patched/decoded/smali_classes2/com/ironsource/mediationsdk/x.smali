.class public Lcom/ironsource/mediationsdk/x;
.super Lcom/ironsource/mediationsdk/y;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;
.implements Lcom/ironsource/ef$a;
.implements Lcom/ironsource/A3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/mediationsdk/x$a;
    }
.end annotation


# instance fields
.field private h:Lcom/ironsource/mediationsdk/k;

.field private i:Lcom/ironsource/ef;

.field private j:Lcom/ironsource/mediationsdk/x$a;

.field private k:Lcom/ironsource/jd;

.field private l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

.field private m:Ljava/lang/String;

.field private n:Lorg/json/JSONObject;

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Lcom/ironsource/i3;

.field private final r:Ljava/lang/Object;

.field private s:Lcom/ironsource/k5;

.field private t:Z

.field private u:Z

.field private v:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/ironsource/mediationsdk/k;Lcom/ironsource/jd;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/AbstractAdapter;ILjava/lang/String;Lorg/json/JSONObject;ILjava/lang/String;Z)V
    .locals 3

    .line 2
    new-instance v0, Lcom/ironsource/b1;

    .line 3
    invoke-virtual {p3}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getBannerSettings()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-direct {v0, p3, v1, v2}, Lcom/ironsource/b1;-><init>(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 4
    invoke-direct {p0, v0, p4}, Lcom/ironsource/mediationsdk/y;-><init>(Lcom/ironsource/b1;Lcom/ironsource/mediationsdk/AbstractAdapter;)V

    .line 5
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/ironsource/mediationsdk/x;->r:Ljava/lang/Object;

    .line 45
    sget-object p3, Lcom/ironsource/mediationsdk/x$a;->a:Lcom/ironsource/mediationsdk/x$a;

    iput-object p3, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    .line 46
    iput-object p1, p0, Lcom/ironsource/mediationsdk/x;->h:Lcom/ironsource/mediationsdk/k;

    .line 47
    new-instance p3, Lcom/ironsource/ef;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/k;->e()J

    move-result-wide v0

    invoke-direct {p3, v0, v1}, Lcom/ironsource/ef;-><init>(J)V

    iput-object p3, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    .line 48
    iput-object p2, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    .line 49
    iput p5, p0, Lcom/ironsource/mediationsdk/y;->f:I

    .line 50
    iput-object p6, p0, Lcom/ironsource/mediationsdk/x;->m:Ljava/lang/String;

    .line 51
    iput p8, p0, Lcom/ironsource/mediationsdk/x;->o:I

    .line 52
    iput-object p9, p0, Lcom/ironsource/mediationsdk/x;->p:Ljava/lang/String;

    .line 53
    iput-object p7, p0, Lcom/ironsource/mediationsdk/x;->n:Lorg/json/JSONObject;

    .line 54
    iput-boolean p10, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    .line 58
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 59
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->u()V

    :cond_0
    return-void
.end method

.method constructor <init>(Lcom/ironsource/mediationsdk/k;Lcom/ironsource/jd;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/AbstractAdapter;IZ)V
    .locals 11

    const/4 v8, 0x0

    .line 1
    const-string v9, ""

    const-string v6, ""

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lcom/ironsource/mediationsdk/x;-><init>(Lcom/ironsource/mediationsdk/k;Lcom/ironsource/jd;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/AbstractAdapter;ILjava/lang/String;Lorg/json/JSONObject;ILjava/lang/String;Z)V

    return-void
.end method

.method private A()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 4
    sget-object v0, Lcom/ironsource/mediationsdk/x$a;->b:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;)V

    .line 7
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->F()V

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->h:Lcom/ironsource/mediationsdk/k;

    .line 13
    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/k;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->h:Lcom/ironsource/mediationsdk/k;

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/k;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    .line 14
    invoke-virtual {v0, v1, v2, v3, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->initBannerForBidding(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V

    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->h:Lcom/ironsource/mediationsdk/k;

    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/k;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->h:Lcom/ironsource/mediationsdk/k;

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/k;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2, v3, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->initBanners(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 22
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 23
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while trying to init banner from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    .line 25
    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getProviderName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", exception =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 33
    new-instance v1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x264

    invoke-direct {v1, v3, v2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 35
    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/x;->onBannerInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    .line 37
    sget-object v1, Lcom/ironsource/C5;->N5:Lcom/ironsource/C5;

    const/16 v2, 0x1390

    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "reason"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    .line 42
    invoke-virtual {p0, v1, v3}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private B()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->r:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    sget-object v2, Lcom/ironsource/mediationsdk/x$a;->g:Lcom/ironsource/mediationsdk/x$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private C()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->r:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    sget-object v2, Lcom/ironsource/mediationsdk/x$a;->e:Lcom/ironsource/mediationsdk/x$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private F()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getConfigFile()Lcom/ironsource/mediationsdk/config/ConfigFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getPluginType()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->setPluginData(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 12
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 13
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while trying to set custom params from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    .line 15
    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getProviderName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", exception =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 23
    sget-object v1, Lcom/ironsource/C5;->N5:Lcom/ironsource/C5;

    const/16 v2, 0x1393

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "reason"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    .line 27
    invoke-virtual {p0, v1, v3}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 9

    .line 131
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v0

    const/16 v1, 0x25e

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    const-string v1, "duration"

    if-eqz v0, :cond_2

    .line 136
    iget-boolean v4, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    if-eqz v4, :cond_1

    sget-object v4, Lcom/ironsource/C5;->D2:Lcom/ironsource/C5;

    goto :goto_1

    :cond_1
    sget-object v4, Lcom/ironsource/C5;->C2:Lcom/ironsource/C5;

    :goto_1
    iget-object v5, p0, Lcom/ironsource/mediationsdk/x;->s:Lcom/ironsource/k5;

    .line 138
    invoke-static {v5}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v1, v5}, [Ljava/lang/Object;

    move-result-object v1

    new-array v2, v2, [[Ljava/lang/Object;

    aput-object v1, v2, v3

    .line 139
    invoke-virtual {p0, v4, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_3

    .line 146
    :cond_2
    iget-boolean v4, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    if-eqz v4, :cond_3

    sget-object v4, Lcom/ironsource/C5;->x2:Lcom/ironsource/C5;

    goto :goto_2

    :cond_3
    sget-object v4, Lcom/ironsource/C5;->w2:Lcom/ironsource/C5;

    .line 148
    :goto_2
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "errorCode"

    filled-new-array {v6, v5}, [Ljava/lang/Object;

    move-result-object v5

    .line 149
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "reason"

    filled-new-array {v7, v6}, [Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Lcom/ironsource/mediationsdk/x;->s:Lcom/ironsource/k5;

    .line 150
    invoke-static {v7}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    filled-new-array {v1, v7}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v7, 0x3

    new-array v7, v7, [[Ljava/lang/Object;

    aput-object v5, v7, v3

    aput-object v6, v7, v2

    const/4 v2, 0x2

    aput-object v1, v7, v2

    .line 151
    invoke-virtual {p0, v4, v7}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 161
    :goto_3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v1, :cond_4

    invoke-interface {v1, p1, p0, v0}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/x;Z)V

    :cond_4
    return-void
.end method

.method private a(Lcom/ironsource/mediationsdk/x$a;)V
    .locals 3

    .line 107
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/x;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "state = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->r:Ljava/lang/Object;

    monitor-enter v0

    .line 109
    :try_start_0
    iput-object p1, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    .line 110
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 111
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 6

    .line 45
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 47
    sget-object v0, Lcom/ironsource/mediationsdk/x$a;->c:Lcom/ironsource/mediationsdk/x$a;

    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->d:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 50
    new-instance p2, Lcom/ironsource/k5;

    invoke-direct {p2}, Lcom/ironsource/k5;-><init>()V

    iput-object p2, p0, Lcom/ironsource/mediationsdk/x;->s:Lcom/ironsource/k5;

    .line 53
    iget-boolean p2, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    if-eqz p2, :cond_0

    sget-object p2, Lcom/ironsource/C5;->Z1:Lcom/ironsource/C5;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/ironsource/C5;->T1:Lcom/ironsource/C5;

    :goto_0
    invoke-virtual {p0, p2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 56
    iget-object p2, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    if-eqz p2, :cond_2

    .line 58
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 59
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v5, p0

    move-object v3, p1

    :try_start_1
    invoke-virtual/range {v0 .. v5}, Lcom/ironsource/mediationsdk/AbstractAdapter;->loadBannerForBidding(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V

    return-void

    :cond_1
    move-object v5, p0

    .line 62
    iget-object p1, v5, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object p2, v5, Lcom/ironsource/mediationsdk/y;->d:Lorg/json/JSONObject;

    iget-object v0, v5, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    iget-object v1, v5, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {p1, p2, v0, v1, p0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->loadBanner(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, p0

    :goto_1
    move-object p1, v0

    .line 65
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 66
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception while trying to load banner from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v5, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    .line 68
    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getProviderName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exception =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 70
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {p2, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 76
    new-instance p2, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x25d

    invoke-direct {p2, v1, v0}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 78
    invoke-virtual {p0, p2}, Lcom/ironsource/mediationsdk/x;->onBannerAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    .line 80
    sget-object p2, Lcom/ironsource/C5;->N5:Lcom/ironsource/C5;

    const/16 v0, 0x138d

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "errorCode"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 84
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "reason"

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    .line 85
    invoke-virtual {p0, p2, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move-object v5, p0

    :goto_2
    return-void

    :cond_3
    move-object v5, p0

    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "wrong state - state = "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v5, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->r:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    if-ne v1, p1, :cond_0

    .line 97
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/x;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "set state from \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' to \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 99
    invoke-virtual {p1, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 103
    iput-object p2, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 105
    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 106
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private b(Lcom/ironsource/C5;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/C5;->U1:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->T1:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->Z1:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->a2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->W1:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->B2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->w2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->C2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->D2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->y2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->z2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->A2:Lcom/ironsource/C5;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->X1:Lcom/ironsource/C5;

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

.method private u()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isBidder = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", shouldEarlyInit = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->s()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/x;->u:Z

    .line 8
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->A()V

    return-void
.end method


# virtual methods
.method public D()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v1}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getBannerSettings()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->onBannerViewBound(Lorg/json/JSONObject;)V

    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v1}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getBannerSettings()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->onBannerViewWillBind(Lorg/json/JSONObject;)V

    return-void
.end method

.method public a()V
    .locals 4

    .line 112
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 116
    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->b:Lcom/ironsource/mediationsdk/x$a;

    sget-object v2, Lcom/ironsource/mediationsdk/x$a;->f:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v1, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v1

    const-string v3, "Timed out"

    if-eqz v1, :cond_0

    .line 117
    const-string v1, "init timed out"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 118
    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v1, 0x25f

    invoke-direct {v0, v1, v3}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    goto :goto_0

    .line 120
    :cond_0
    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->d:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v1, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    const-string v1, "load timed out"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 122
    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v1, 0x260

    invoke-direct {v0, v1, v3}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 129
    :goto_0
    invoke-direct {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void

    .line 130
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected state - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/C5;)V
    .locals 1

    const/4 v0, 0x0

    .line 162
    invoke-virtual {p0, p1, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V
    .locals 7

    .line 163
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->m()Ljava/util/Map;

    move-result-object v0

    .line 165
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 166
    const-string v1, "reason"

    const-string v2, "banner is destroyed"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 167
    :cond_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-eqz v1, :cond_1

    .line 169
    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->getSize()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v1

    .line 170
    invoke-static {v0, v1}, Lcom/ironsource/mediationsdk/l;->a(Ljava/util/Map;Lcom/ironsource/mediationsdk/ISBannerSize;)V

    .line 173
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 174
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->m:Ljava/lang/String;

    const-string v2, "auctionId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :cond_2
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->n:Lorg/json/JSONObject;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 178
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->n:Lorg/json/JSONObject;

    const-string v2, "genericParams"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    :cond_3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->q:Lcom/ironsource/i3;

    if-eqz v1, :cond_4

    .line 182
    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "placement"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    :cond_4
    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/x;->b(Lcom/ironsource/C5;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 186
    invoke-static {}, Lcom/ironsource/D9;->i()Lcom/ironsource/D9;

    move-result-object v1

    iget v2, p0, Lcom/ironsource/mediationsdk/x;->o:I

    iget-object v3, p0, Lcom/ironsource/mediationsdk/x;->p:Ljava/lang/String;

    .line 187
    invoke-virtual {v1, v0, v2, v3}, Lcom/ironsource/u3;->a(Ljava/util/Map;ILjava/lang/String;)V

    .line 191
    :cond_5
    iget v1, p0, Lcom/ironsource/mediationsdk/y;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "sessionDepth"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_6

    .line 195
    :try_start_0
    array-length v1, p2

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_6

    aget-object v4, p2, v3

    .line 196
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aget-object v4, v4, v6

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    move-exception p2

    .line 200
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 201
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " smash: BN sendMediationEvent "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 203
    invoke-virtual {v1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 207
    :cond_6
    new-instance p2, Lcom/ironsource/B5;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-direct {p2, p1, v1}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 208
    invoke-static {}, Lcom/ironsource/D9;->i()Lcom/ironsource/D9;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/i3;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lcom/ironsource/mediationsdk/x;->q:Lcom/ironsource/i3;

    .line 3
    iput-object p4, p0, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    .line 6
    invoke-static {p1}, Lcom/ironsource/mediationsdk/l;->c(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z

    move-result p2

    const/4 p4, 0x0

    if-nez p2, :cond_1

    if-nez p1, :cond_0

    .line 7
    const-string p1, "banner is null"

    goto :goto_0

    :cond_0
    const-string p1, "banner is destroyed"

    .line 8
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 9
    iget-object p2, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    new-instance p3, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v0, 0x262

    invoke-direct {p3, v0, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p3, p0, p4}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/x;Z)V

    return-void

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    if-nez p2, :cond_2

    .line 19
    const-string p1, "mAdapter is null"

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 20
    iget-object p2, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    new-instance p3, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v0, 0x263

    invoke-direct {p3, v0, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p3, p0, p4}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/x;Z)V

    return-void

    .line 28
    :cond_2
    iput-object p1, p0, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    .line 31
    iget-object p1, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    invoke-virtual {p1, p0}, Lcom/ironsource/ef;->a(Lcom/ironsource/ef$a;)V

    .line 35
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 36
    iget-object p1, p0, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    invoke-direct {p0, p3, p1}, Lcom/ironsource/mediationsdk/x;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 38
    :cond_3
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 41
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 43
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "exception = "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 44
    new-instance p2, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    const/16 p3, 0x25d

    invoke-direct {p2, p3, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/ironsource/mediationsdk/x;->onBannerAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public collectBiddingData(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/C5;->c2:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

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

    invoke-virtual {v0, v1, p1, p2}, Lcom/ironsource/mediationsdk/AbstractAdapter;->collectBannerBiddingData(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 11
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 12
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception while trying to collectBannerBiddingData from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    .line 14
    invoke-virtual {v1}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getProviderName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exception =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public d()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ProgBannerSmash"

    return-object v0
.end method

.method public onBannerAdClicked()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/C5;->W1:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ironsource/jd;->d(Lcom/ironsource/mediationsdk/x;)V

    :cond_0
    return-void
.end method

.method public onBannerAdLeftApplication()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/C5;->A2:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ironsource/jd;->b(Lcom/ironsource/mediationsdk/x;)V

    :cond_0
    return-void
.end method

.method public onBannerAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/x;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "error = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    invoke-virtual {v0}, Lcom/ironsource/ef;->e()V

    .line 6
    sget-object v0, Lcom/ironsource/mediationsdk/x$a;->d:Lcom/ironsource/mediationsdk/x$a;

    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->f:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_0
    return-void
.end method

.method public onBannerAdLoaded(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    invoke-virtual {v0}, Lcom/ironsource/ef;->e()V

    .line 7
    sget-object v0, Lcom/ironsource/mediationsdk/x$a;->d:Lcom/ironsource/mediationsdk/x$a;

    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->e:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ironsource/C5;->a2:Lcom/ironsource/C5;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ironsource/C5;->U1:Lcom/ironsource/C5;

    :goto_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->s:Lcom/ironsource/k5;

    .line 13
    invoke-static {v1}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    .line 14
    invoke-virtual {p0, v0, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 21
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1, p2}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/x;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    :cond_1
    return-void

    .line 25
    :cond_2
    iget-boolean p1, p0, Lcom/ironsource/mediationsdk/x;->t:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/ironsource/C5;->b2:Lcom/ironsource/C5;

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/ironsource/C5;->V1:Lcom/ironsource/C5;

    .line 26
    :goto_1
    invoke-virtual {p0, p1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    return-void
.end method

.method public onBannerAdScreenDismissed()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/C5;->z2:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ironsource/jd;->e(Lcom/ironsource/mediationsdk/x;)V

    :cond_0
    return-void
.end method

.method public onBannerAdScreenPresented()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/C5;->y2:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ironsource/jd;->c(Lcom/ironsource/mediationsdk/x;)V

    :cond_0
    return-void
.end method

.method public onBannerAdShown()V
    .locals 7

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/ironsource/mediationsdk/x;->C()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    sget-object v0, Lcom/ironsource/C5;->X1:Lcom/ironsource/C5;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {v0, p0}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/x;)V

    :cond_0
    return-void

    .line 11
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "wrong state - mState = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 12
    sget-object v0, Lcom/ironsource/C5;->L5:Lcom/ironsource/C5;

    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Wrong State - "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "reason"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 17
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "ext1"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [[Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    aput-object v3, v5, v1

    const/4 v1, 0x2

    aput-object v4, v5, v1

    .line 18
    invoke-virtual {p0, v0, v5}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method public onBannerInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/x;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "error = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    invoke-virtual {v1}, Lcom/ironsource/ef;->e()V

    .line 7
    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->b:Lcom/ironsource/mediationsdk/x$a;

    sget-object v2, Lcom/ironsource/mediationsdk/x$a;->a:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v1, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p0, v1}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/x;Z)V

    :cond_0
    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "wrong state - mState = "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/mediationsdk/x;->j:Lcom/ironsource/mediationsdk/x$a;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    return-void
.end method

.method public onBannerInitSuccess()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/mediationsdk/x$a;->b:Lcom/ironsource/mediationsdk/x$a;

    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->c:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;Lcom/ironsource/mediationsdk/x$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/x;->u:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 6
    iput-boolean v1, p0, Lcom/ironsource/mediationsdk/x;->u:Z

    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->p()Z

    move-result v0

    if-nez v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/l;->c(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 14
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->l:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-nez v0, :cond_1

    const-string v0, "banner is null"

    goto :goto_0

    :cond_1
    const-string v0, "banner is destroyed"

    .line 15
    :goto_0
    iget-object v2, p0, Lcom/ironsource/mediationsdk/x;->k:Lcom/ironsource/jd;

    new-instance v3, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v4, 0x25d

    invoke-direct {v3, v4, v0}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-interface {v2, v3, p0, v1}, Lcom/ironsource/jd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/x;Z)V

    return-void

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->v:Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/ironsource/mediationsdk/x;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_3
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->i:Lcom/ironsource/ef;

    invoke-virtual {v0}, Lcom/ironsource/f;->d()V

    .line 2
    invoke-super {p0}, Lcom/ironsource/mediationsdk/y;->q()V

    return-void
.end method

.method public t()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    sget-object v1, Lcom/ironsource/C5;->B2:Lcom/ironsource/C5;

    invoke-virtual {p0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;)V

    .line 7
    sget-object v1, Lcom/ironsource/mediationsdk/x$a;->g:Lcom/ironsource/mediationsdk/x$a;

    invoke-direct {p0, v1}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/mediationsdk/x$a;)V

    .line 9
    iget-object v1, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    if-nez v1, :cond_0

    .line 10
    const-string v1, "mAdapter == null"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    return-void

    .line 16
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getBannerSettings()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/AbstractAdapter;->destroyBanner(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 18
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 19
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while trying to destroy banner from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    .line 21
    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/AbstractAdapter;->getProviderName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", exception =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 29
    sget-object v1, Lcom/ironsource/C5;->N5:Lcom/ironsource/C5;

    const/16 v2, 0x1392

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "errorCode"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "reason"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    .line 33
    invoke-virtual {p0, v1, v3}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getAdSourceNameForEvents()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->h()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getAdSourceNameForEvents()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Lcom/ironsource/mediationsdk/AbstractAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->a:Lcom/ironsource/mediationsdk/AbstractAdapter;

    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/x;->m:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/y;->f()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s - "

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/y;->b:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
