.class final Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/iz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->onEventGenerated(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﻐ:I = 0x1

.field private static ﻛ:[C

.field private static ﾒ:I


# instance fields
.field final synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﻛ:[C

    return-void

    :array_0
    .array-data 2
        0x39s
        0x6bs
        0x66s
        0x6es
        0x76s
        0x72s
        0x66s
        0x67s
        0x57s
        0x17s
        0x58s
        0x7fs
        0x77s
        0x7bs
        0x6bs
        0x62s
        0x77s
        0x77s
        0x7as
        0x57s
        0x57s
        0x7es
        0x78s
        0x51s
        0x50s
        0x7as
        0x7es
        0x7cs
        0x7ds
        0x7fs
        0x7as
        0x79s
        0x57s
        0x57s
        0x81s
        0x7as
        0x72s
        0x71s
        0x7as
        0x82s
        0x57s
        0x4es
        0x4es
        0x58s
        0x7fs
        0x69s
        0x22s
        0x54s
        0x69s
        0x69s
        0x6cs
        0x49s
        0x44s
        0x6es
        0x6es
        0x70s
        0x4bs
        0x43s
        0x6as
        0x6es
        0x70s
        0x74s
        0x4bs
        0x4as
        0x71s
        0x69s
        0x6es
        0x4bs
        0x43s
        0x6as
        0x6bs
        0x68s
        0x6es
        0x6cs
        0x69s
        0x6es
        0x61s
        0x39s
        0x2ds
        0x4fs
        0x6cs
        0x70s
        0x6es
        0x6fs
        0x71s
        0x6cs
        0x6bs
        0x49s
        0x4as
        0x71s
        0x5bs
        0x33s
        0x27s
        0x51s
        0x71s
        0x69s
        0x6ds
        0x12s
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$2;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ﾇ([IZLjava/lang/String;)Ljava/lang/String;
    .locals 12

    if-eqz p2, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    :cond_0
    check-cast p2, [B

    .line 1195
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1198
    :try_start_0
    aget v2, p0, v1

    const/4 v3, 0x1

    .line 1199
    aget v4, p0, v3

    const/4 v5, 0x2

    .line 1200
    aget v6, p0, v5

    const/4 v7, 0x3

    .line 1201
    aget v7, p0, v7

    .line 1203
    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﻛ:[C

    .line 1204
    new-array v9, v4, [C

    .line 1206
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_3

    .line 1211
    new-array v2, v4, [C

    .line 1214
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    move v8, v1

    :goto_0
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge v10, v4, :cond_2

    .line 1216
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-byte v10, p2, v10

    if-ne v10, v3, :cond_1

    .line 1218
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    add-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    goto :goto_1

    .line 1222
    :cond_1
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    .line 1225
    :goto_1
    sget v8, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v8, v2, v8

    .line 1214
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr v10, v3

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_0

    :cond_2
    move-object v9, v2

    :cond_3
    if-lez v7, :cond_4

    .line 1234
    new-array p2, v4, [C

    .line 1236
    invoke-static {v9, v1, p2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v2, v4, v7

    .line 1237
    invoke-static {p2, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1238
    invoke-static {p2, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    if-eqz p1, :cond_6

    .line 1244
    new-array p1, v4, [C

    .line 1246
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_2
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p2, v4, :cond_5

    .line 1248
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sub-int v2, v4, v2

    sub-int/2addr v2, v3

    aget-char v2, v9, v2

    aput-char v2, p1, p2

    .line 1246
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p2, v3

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_2

    :cond_5
    move-object v9, p1

    :cond_6
    if-lez v6, :cond_7

    .line 1257
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_3
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p1, v4, :cond_7

    .line 1259
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char p2, v9, p2

    aget v1, p0, v5

    sub-int/2addr p2, v1

    int-to-char p2, p2

    aput-char p2, v9, p1

    .line 1257
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p1, v3

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_3

    .line 1263
    :cond_7
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1264
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)V
    .locals 9

    .line 488
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v0

    .line 489
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ﾇ()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc8

    const/16 v3, 0x9

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lt v0, v2, :cond_1

    const/16 v2, 0x12b

    if-gt v0, v2, :cond_1

    .line 495
    filled-new-array {v5, v3, v5, v5}, [I

    move-result-object v0

    const-string v1, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001"

    invoke-static {v0, v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x25

    const/16 v2, 0xe

    filled-new-array {v3, v1, v2, v5}, [I

    move-result-object v1

    const-string v2, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000"

    invoke-static {v1, v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﾇ:Lorg/json/JSONArray;

    invoke-static {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 513
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﾒ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ae;

    .line 514
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﭖ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/jd;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ae;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ja;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jd;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ja;)V

    goto :goto_0

    .line 516
    :cond_0
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$3;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;Lcom/ironsource/adqualitysdk/sdk/i/ir;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void

    :cond_1
    const/16 v2, 0x193

    if-ne v0, v2, :cond_3

    .line 497
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    monitor-enter v2

    .line 498
    :try_start_0
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ag$2;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﬤ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ironsource/adqualitysdk/sdk/i/je$b;

    .line 499
    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$1;

    invoke-direct {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/je$b;)V

    invoke-static {v5}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    goto :goto_1

    .line 506
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    .line 508
    :cond_3
    filled-new-array {v5, v3, v5, v5}, [I

    move-result-object v2

    const-string v3, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001"

    invoke-static {v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x33

    const/16 v7, 0x1f

    const/16 v8, 0x2e

    filled-new-array {v8, v6, v5, v7}, [I

    move-result-object v6

    const-string v7, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001"

    invoke-static {v6, v4, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v6, 0x61

    const/4 v7, 0x5

    filled-new-array {v6, v4, v7, v4}, [I

    move-result-object v4

    const-string v6, "\u0001"

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾇ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    :goto_2
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$2;

    invoke-direct {v2, p0, p1, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;Lcom/ironsource/adqualitysdk/sdk/i/ir;ILjava/lang/String;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void
.end method

.method public final ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    .line 535
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﻐ:I

    add-int/lit8 p1, p1, 0x63

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;->ﾒ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method
