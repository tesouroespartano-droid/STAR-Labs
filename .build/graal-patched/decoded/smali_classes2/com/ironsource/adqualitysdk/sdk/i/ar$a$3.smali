.class final Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/iz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:I = 0x0

.field private static ﱟ:I = 0x1

.field private static ﱡ:J = 0x0L

.field private static ﻛ:[C = null

.field private static ﾒ:I = 0x18


# instance fields
.field final synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

.field final synthetic ｋ:Landroid/content/Context;

.field final synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x48

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻛ:[C

    const-wide v0, -0x4e85e44faba3514aL    # -2.3642711218829096E-70

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱡ:J

    return-void

    nop

    :array_0
    .array-data 2
        0x53s
        -0x513ds
        0x5d0fs
        0xc41s
        -0x4543s
        0x69fds
        0x1837s
        -0x3964s
        0x75c5s
        0x240as
        -0x2c90s
        -0x7e55s
        0x30a8s
        -0x20b4s
        -0x726fs
        0x3cc9s
        -0x14fbs
        -0x6581s
        0x48bas
        -0x819s
        -0x59a4s
        0x54ces
        0x3c7s
        -0x4dcbs
        0x617es
        0xfa0s
        -0x41ebs
        0x6d55s
        0x1bd2s
        0x6cs
        -0x512bs
        0x5d18s
        0xc51s
        0x6755s
        -0x361cs
        0x3a39s
        0x29acs
        -0x78e3s
        0x2f4es
        -0x7e07s
        0x31f9s
        -0x6088s
        0x6ca2s
        0x3df1s
        -0x74eas
        0x5812s
        0x2988s
        -0x8d9s
        0x447es
        0x15a9s
        -0x1d37s
        -0x5000s
        0x153s
        -0x115es
        -0x43c6s
        0xd73s
        -0x254fs
        -0x543bs
        0x7904s
        -0x39a5s
        -0x685cs
        0x6531s
        0x3277s
        -0x7c78s
        0x50cas
        0x3e13s
        -0x7059s
        0x5caes
        0x2a3es
        -0x4afs
        0x4887s
        0x19d8s
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ:Landroid/content/Context;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1120
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1123
    :try_start_0
    new-array v1, p4, [C

    const/4 v2, 0x0

    .line 1127
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_0
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge v3, p4, :cond_1

    .line 1129
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v3, p0, v3

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    .line 1131
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    add-int/2addr v4, p2

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 1132
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v4, v1, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾒ:I

    sub-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 1127
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_0

    :cond_1
    if-lez p1, :cond_2

    .line 1138
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    .line 1140
    new-array p0, p4, [C

    .line 1142
    invoke-static {v1, v2, p0, v2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1143
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p1, p4, p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    invoke-static {p0, v2, v1, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1144
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p2, p4, p2

    invoke-static {p0, p1, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    if-eqz p3, :cond_4

    .line 1150
    new-array p0, p4, [C

    .line 1152
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge p1, p4, :cond_3

    .line 1154
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sub-int p2, p4, p2

    add-int/lit8 p2, p2, -0x1

    aget-char p2, v1, p2

    aput-char p2, p0, p1

    .line 1152
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_1

    :cond_3
    move-object v1, p0

    .line 1160
    :cond_4
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1161
    monitor-exit v0

    throw p0
.end method

.method private ﻐ(I)V
    .locals 4

    .line 378
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    monitor-enter v0

    .line 379
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 380
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3$2;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;)V

    int-to-long v2, p1

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iu;J)V

    .line 387
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private static ｋ(IIC)Ljava/lang/String;
    .locals 9

    .line 2099
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/b;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 2102
    :try_start_0
    new-array v1, p1, [C

    const/4 v2, 0x0

    .line 2105
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    :goto_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    if-ge v2, p1, :cond_0

    .line 2107
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻛ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱡ:J

    mul-long/2addr v5, v7

    xor-long/2addr v3, v5

    int-to-long v5, p2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 2105
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    goto :goto_0

    .line 2113
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2114
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)V
    .locals 14

    const-string v0, "\uffed\u0002\u0004\u0001\t\n\uffde\u0000\u000f\n\u0008\u0000"

    const/4 v1, 0x2

    .line 363
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱟ:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﮐ:I

    rem-int/2addr v2, v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 331
    :try_start_0
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v7

    .line 332
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v8

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ﾇ()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xc8

    if-lt v7, v9, :cond_2

    const/16 v9, 0x12b

    if-le v7, v9, :cond_0

    goto/16 :goto_0

    .line 339
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﾒ()Lorg/json/JSONObject;

    move-result-object v7

    .line 340
    const-string v8, "\u0001\ufff9\u0008"

    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v9

    cmpl-float v9, v9, v5

    add-int/lit8 v9, v9, 0x3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v10

    shr-int/lit8 v10, v10, 0x18

    rsub-int v10, v10, 0x83

    invoke-static {v6}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v11

    cmpl-float v11, v11, v5

    add-int/lit8 v11, v11, 0x3

    invoke-static {v8, v9, v10, v4, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 341
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/t;

    move-result-object v8

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ()V

    .line 344
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v8

    shr-int/lit8 v8, v8, 0x8

    rsub-int/lit8 v8, v8, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    rsub-int/lit8 v9, v9, 0x7d

    invoke-static {v6, v6}, Landroid/view/View;->getDefaultSize(II)I

    move-result v10

    add-int/lit8 v10, v10, 0xc

    invoke-static {v0, v8, v9, v4, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v9

    cmpl-float v9, v9, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, 0x1d

    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v11

    add-int/lit8 v11, v11, 0x14

    shr-int/lit8 v11, v11, 0x6

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v7}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 347
    invoke-static {v7}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ﾒ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v8

    .line 348
    iget-object v9, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v10

    add-int/lit8 v10, v10, 0x1d

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    rsub-int/lit8 v11, v11, 0x4

    invoke-static {v6}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v12

    int-to-char v12, v12

    invoke-static {v10, v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(J)V

    .line 349
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x14

    shr-int/lit8 v9, v9, 0x6

    add-int/lit8 v9, v9, 0x21

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, 0x3

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v11

    cmpl-float v11, v11, v5

    rsub-int v11, v11, 0x6727

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 351
    iget-object v9, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/je;

    move-result-object v9

    const-string v10, "\u000b\u0003\u0006\u0004\uffcb\u0000\ufffe\u0000\u0005\u0002\u000f\u0000\u000c"

    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v11

    const v12, 0x100000a

    add-int/2addr v11, v12

    invoke-static {v6, v6, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v12

    rsub-int/lit8 v12, v12, 0x7b

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v13

    shr-int/lit8 v13, v13, 0x8

    add-int/lit8 v13, v13, 0xd

    invoke-static {v10, v11, v12, v6, v13}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v8, v11}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﾒ(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/je$b;)V

    .line 353
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v8

    add-int/lit8 v8, v8, 0x24

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v9

    cmpl-float v9, v9, v5

    add-int/2addr v9, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v10

    cmp-long v10, v10, v2

    rsub-int v10, v10, 0x29d9

    int-to-char v10, v10

    invoke-static {v8, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jv;->ﻛ()J

    move-result-wide v9

    invoke-virtual {v7, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 354
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v8

    const v9, -0xffffda

    sub-int/2addr v9, v8

    invoke-static {v6, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    add-int/2addr v8, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit16 v1, v1, 0x2f3b

    int-to-char v1, v1

    invoke-static {v9, v8, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jv;->ﾒ()J

    move-result-wide v8

    invoke-virtual {v7, v1, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 355
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ｋ()J

    move-result-wide v8

    invoke-static {v7, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Lorg/json/JSONObject;J)V

    .line 357
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-virtual {p1, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    goto :goto_1

    .line 335
    :cond_2
    :goto_0
    invoke-virtual {p0, p1, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 363
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱟ:I

    add-int/lit8 p1, p1, 0x1d

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﮐ:I

    rem-int/2addr p1, v1

    return-void

    :catch_0
    move-exception p1

    .line 359
    invoke-static {v6, v6}, Landroid/view/View;->getDefaultSize(II)I

    move-result v1

    add-int/2addr v1, v4

    const-string v7, ""

    const/16 v8, 0x30

    invoke-static {v7, v8, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v9

    add-int/lit8 v9, v9, 0x7e

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v2

    add-int/lit8 v2, v2, 0xd

    invoke-static {v0, v1, v9, v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    cmpl-float v1, v1, v5

    add-int/lit8 v1, v1, 0x28

    invoke-static {v6, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v2

    add-int/lit8 v2, v2, 0x20

    invoke-static {v7, v8, v6, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    rsub-int v3, v3, 0x31bb

    int-to-char v3, v3

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ｋ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ﾇ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 362
    :goto_1
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V

    .line 363
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(I)V

    return-void
.end method

.method public final ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V
    .locals 7

    const/4 p2, 0x2

    .line 373
    rem-int v0, p2, p2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱟ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﮐ:I

    rem-int/2addr v1, p2

    if-nez v1, :cond_0

    .line 368
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result p1

    goto :goto_0

    .line 373
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    throw v0

    :cond_1
    const/4 p1, -0x1

    .line 369
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/graphics/PointF;->length(FF)F

    move-result v3

    cmpl-float v2, v3, v2

    add-int/lit8 v2, v2, 0x1a

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x76

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v5

    shr-int/lit8 v5, v5, 0x18

    rsub-int/lit8 v5, v5, 0x22

    const-string v6, "\u0016\u0016\u000b\u0010\t\uffc2\u0005\u0011\u0010\u0008\u000b\t\uffc2\u0008\u0014\u0011\u000f\uffc2\u0015\u0007\u0014\u0018\u0007\u0014\uffdc\uffc2\uffe7\u0014\u0014\u0011\u0014\uffc2\t\u0007"

    invoke-static {v6, v2, v4, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 370
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x7d

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0xc

    const-string v6, "\uffed\u0002\u0004\u0001\t\n\uffde\u0000\u000f\n\u0008\u0000"

    invoke-static {v6, v2, v4, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ｋ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x193

    if-eq p1, v1, :cond_2

    .line 372
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)I

    move-result p1

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 373
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ゥ()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﻐ(I)V

    :cond_2
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﱟ:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;->ﮐ:I

    rem-int/2addr p1, p2

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method
