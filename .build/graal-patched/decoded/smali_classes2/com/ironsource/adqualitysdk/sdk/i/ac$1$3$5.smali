.class final Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﱟ:I = 0x1

.field private static ﱡ:I

.field private static ﻐ:[C

.field private static ﻛ:J


# instance fields
.field private synthetic ｋ:Ljava/lang/Object;

.field private synthetic ﾇ:Ljava/lang/String;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2e

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﻐ:[C

    const-wide v0, -0x48f2f8d259a441beL

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﻛ:J

    return-void

    nop

    :array_0
    .array-data 2
        0x77s
        -0x41ccs
        0x7ce7s
        0x57s
        -0x41d9s
        0x7ce6s
        0x3a90s
        -0x69fs
        -0x48d1s
        0x75fbs
        0x338fs
        -0xd8cs
        -0x4fe6s
        0x6ef5s
        0x2cb8s
        -0x1484s
        -0x56cas
        0x67f9s
        0x25acs
        0x45s
        -0x41d0s
        0x7cf6s
        0x3aa9s
        -0x686s
        -0x4896s
        0x75efs
        0x33bcs
        -0xd8bs
        -0x4fcds
        0x6ee0s
        0x2cbfs
        -0x148as
        -0x56c3s
        0x67bcs
        0x25bds
        -0x1bb4s
        -0x5df5s
        0x60c7s
        0x1e8ds
        -0x22f8s
        -0x6500s
        0x59dfs
        0x1781s
        -0x29a2s
        -0x6bb8s
        0x5294s
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾇ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ｋ:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﾇ(IIC)Ljava/lang/String;
    .locals 9

    .line 1099
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/b;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1102
    :try_start_0
    new-array v1, p1, [C

    const/4 v2, 0x0

    .line 1105
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    :goto_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    if-ge v2, p1, :cond_0

    .line 1107
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﻐ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﻛ:J

    mul-long/2addr v5, v7

    xor-long/2addr v3, v5

    int-to-long v5, p2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 1105
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    goto :goto_0

    .line 1113
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1114
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ﻐ()V
    .locals 10

    const/4 v0, 0x2

    .line 203
    rem-int v1, v0, v0

    .line 192
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const/4 v2, 0x1

    .line 194
    :try_start_0
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ףּ:Ljava/lang/String;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﻐ:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ij;->爫:Ljava/lang/String;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    const-string v5, ""

    invoke-static {v5}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v6

    shr-int/lit8 v6, v6, 0x16

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ﱡ:Ljava/lang/String;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾇ:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 197
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iget-boolean v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﻛ:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    .line 203
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﱟ:I

    add-int/lit8 v3, v3, 0x15

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﱡ:I

    rem-int/2addr v3, v0

    if-eqz v3, :cond_0

    .line 198
    :try_start_1
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ﺙ:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_1

    :cond_0
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ﺙ:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 203
    :cond_1
    :goto_1
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﱡ:I

    add-int/lit8 v2, v2, 0x71

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﱟ:I

    rem-int/2addr v2, v0

    goto :goto_2

    :catch_0
    move-exception v0

    const/4 v3, 0x0

    .line 201
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    add-int/lit8 v4, v4, 0x3

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    rsub-int/lit8 v6, v6, 0x11

    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v7

    cmpl-float v7, v7, v5

    int-to-char v7, v7

    invoke-static {v4, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v3}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x13

    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v7

    cmpl-float v7, v7, v5

    rsub-int/lit8 v7, v7, 0x1b

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v8

    cmpl-float v5, v8, v5

    sub-int/2addr v2, v5

    int-to-char v2, v2

    invoke-static {v3, v7, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    :goto_2
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ｋ:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;->ｋ:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﻛ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
