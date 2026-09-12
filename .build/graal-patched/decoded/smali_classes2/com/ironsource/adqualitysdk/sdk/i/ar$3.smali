.class public Lcom/ironsource/adqualitysdk/sdk/i/ar$3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# instance fields
.field private ﻐ:Lorg/json/JSONObject;

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/aw;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1005
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized く()Lorg/json/JSONObject;
    .locals 1

    monitor-enter p0

    .line 1015
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﻐ:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;
    .locals 1

    .line 1019
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/aw;

    return-object v0
.end method

.method public final ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/aw;)V
    .locals 0

    .line 1023
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/aw;

    return-void
.end method

.method public declared-synchronized ﾒ(Lorg/json/JSONObject;)V
    .locals 0

    monitor-enter p0

    .line 1011
    :try_start_0
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﻐ:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1012
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
