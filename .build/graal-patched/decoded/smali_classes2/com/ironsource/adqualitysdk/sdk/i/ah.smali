.class final Lcom/ironsource/adqualitysdk/sdk/i/ah;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﭖ:I = 0x1

.field private static ﭴ:[S = null

.field private static ﭸ:I = 0x0

.field private static ﮌ:[C = null

.field private static ﮐ:I = 0x2b

.field private static ﱟ:[B = null

.field private static ﺙ:I = 0x44a39a7e

.field private static ﻏ:I = -0x182ee6ce


# instance fields
.field private ﱡ:I

.field private ﻐ:J

.field private ﻛ:J

.field private ｋ:J

.field private ﾇ:J

.field private ﾒ:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﱟ:[B

    const/16 v0, 0x23

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﮌ:[C

    return-void

    nop

    :array_0
    .array-data 1
        -0x16t
        0x1dt
        -0x5t
        0x1t
        -0x15t
        -0x11t
        -0x13t
        0x1at
        0x15t
        -0x1bt
        -0x1bt
        0x36t
        -0xdt
        0x13t
        0x1ct
        -0x3t
        0x11t
        0x1et
        -0x18t
        0x14t
        0x5t
        -0x28t
        0x10t
        0x1dt
        -0x28t
        -0xbt
        -0xft
        -0x28t
        0x72t
        -0x73t
        -0x28t
        -0x4bt
        0x4bt
        -0x28t
        0x13t
        -0x12t
        -0x22t
        0x55t
        -0x42t
        0x56t
        0x4bt
        -0x50t
        0x51t
        0x42t
        -0x5bt
    .end array-data

    nop

    :array_1
    .array-data 2
        0x67s
        0xcbs
        0xc3s
        0xc7s
        0xc7s
        0x9cs
        0x9ds
        0xc4s
        0xc5s
        0xcbs
        0xcbs
        0xc5s
        0xc8s
        0xcas
        0xc7s
        0xbfs
        0xc2s
        0xcds
        0xd0s
        0xa3s
        0xa3s
        0xcas
        0xcas
        0xccs
        0xb5s
        0x4bs
        0x95s
        0x39s
        0x73s
        0x6cs
        0x37s
        0x71s
        0x73s
        0x3as
        0x3as
    .end array-data
.end method

.method constructor <init>(I)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾒ:Ljava/lang/Boolean;

    .line 32
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﱡ:I

    .line 34
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object p1

    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ah$2;

    invoke-direct {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ah$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ah;)V

    invoke-virtual {p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    return-void
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ah;)J
    .locals 4

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v2, v1, 0x5

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v2, v0

    iget-wide v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾇ:J

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 p0, v1, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-wide v2

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ah;J)J
    .locals 3

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    iput-wide p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ:J

    add-int/lit8 v2, v2, 0x43

    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v2, v0

    return-wide p1
.end method

.method private static ﻐ(IBIIS)Ljava/lang/String;
    .locals 6

    .line 1200
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 1202
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﮐ:I

    add-int/2addr p2, v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p2, v3, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_2

    .line 1209
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﱟ:[B

    if-eqz p2, :cond_1

    .line 1211
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻏ:I

    add-int/2addr v3, p0

    aget-byte p2, p2, v3

    add-int/2addr p2, v2

    int-to-byte p2, p2

    goto :goto_0

    .line 1217
    :cond_1
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭴ:[S

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻏ:I

    add-int/2addr v3, p0

    aget-short p2, p2, v3

    add-int/2addr p2, v2

    int-to-short p2, p2

    :cond_2
    :goto_0
    if-lez p2, :cond_4

    add-int/2addr p0, p2

    add-int/lit8 p0, p0, -0x2

    .line 1226
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻏ:I

    add-int/2addr p0, v2

    add-int/2addr p0, v4

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    .line 1227
    sput-byte p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    .line 1230
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﺙ:I

    add-int/2addr p3, p0

    int-to-char p0, p3

    sput-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    .line 1231
    sget-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1234
    sget-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    sput-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾇ:C

    .line 1235
    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻛ:I

    :goto_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻛ:I

    if-ge p0, p2, :cond_4

    .line 1238
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﱟ:[B

    if-eqz p0, :cond_3

    .line 1240
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    add-int/lit8 p3, p1, -0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    aget-byte p0, p0, p1

    .line 1241
    sget-char p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾇ:C

    add-int/2addr p0, p4

    int-to-byte p0, p0

    sget-byte p3, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    xor-int/2addr p0, p3

    add-int/2addr p1, p0

    int-to-char p0, p1

    sput-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    goto :goto_2

    .line 1245
    :cond_3
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭴ:[S

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    add-int/lit8 p3, p1, -0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    aget-short p0, p0, p1

    .line 1246
    sget-char p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾇ:C

    add-int/2addr p0, p4

    int-to-short p0, p0

    sget-byte p3, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    xor-int/2addr p0, p3

    add-int/2addr p1, p0

    int-to-char p0, p1

    sput-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    .line 1248
    :goto_2
    sget-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1249
    sget-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾒ:C

    sput-char p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﾇ:C

    .line 1235
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻛ:I

    add-int/2addr p0, v5

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻛ:I

    goto :goto_1

    .line 1253
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1254
    monitor-exit v0

    throw p0
.end method

.method private ﻐ(Lorg/json/JSONObject;)V
    .locals 13

    const-string v0, ""

    const/4 v1, 0x2

    .line 91
    rem-int v2, v1, v1

    const/4 v2, 0x0

    .line 72
    :try_start_0
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    const v4, 0x182ee6e3

    sub-int/2addr v4, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, -0x15

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v5

    shr-int/lit8 v5, v5, 0x18

    add-int/lit8 v5, v5, -0x2c

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    const v7, -0x44a39a0b

    add-int/2addr v6, v7

    const/4 v7, 0x0

    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    move-result v8

    cmpl-float v8, v8, v7

    int-to-short v8, v8

    invoke-static {v4, v3, v5, v6, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 73
    iget v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﱡ:I

    if-eq v3, v5, :cond_1

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾒ(Lorg/json/JSONObject;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    const/16 v5, 0x1b

    .line 78
    filled-new-array {v5, v3, v2, v3}, [I

    move-result-object v5

    const-string v6, "\u0001\u0001\u0000"

    invoke-static {v5, v4, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    iget-wide v8, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ:J

    add-long/2addr v5, v8

    const/16 v8, 0x1e

    .line 79
    filled-new-array {v8, v3, v2, v3}, [I

    move-result-object v3

    const-string v8, "\u0001\u0000\u0001"

    invoke-static {v3, v4, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    iget-wide v8, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ:J

    invoke-virtual {p1, v3, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move v3, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v3, 0x19

    const/16 v5, 0x21

    .line 74
    filled-new-array {v3, v1, v5, v1}, [I

    move-result-object v3

    const-string v5, "\u0000\u0001"

    invoke-static {v3, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    iget-wide v8, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ:J

    add-long/2addr v5, v8

    .line 75
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    const v8, 0x182ee6e6

    add-int/2addr v3, v8

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    add-int/lit8 v8, v8, 0xe

    int-to-byte v8, v8

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v9

    int-to-byte v9, v9

    add-int/lit8 v9, v9, -0x2b

    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    move-result v10

    cmpl-float v10, v10, v7

    const v11, -0x44a39a09

    sub-int/2addr v11, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    int-to-short v10, v10

    invoke-static {v3, v8, v9, v11, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    iget-wide v8, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ:J

    invoke-virtual {p1, v3, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v3, v3, 0x41

    rem-int/lit16 v8, v3, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v3, v1

    move v3, v4

    .line 83
    :goto_1
    :try_start_1
    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ﮐ:Ljava/lang/String;

    invoke-virtual {p1, v8, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 84
    iget-object v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾒ:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_2

    .line 85
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v5

    const-wide/16 v8, 0x0

    cmp-long v5, v5, v8

    const v6, 0x182ee6e9

    add-int/2addr v5, v6

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    add-int/lit8 v0, v0, 0x72

    int-to-byte v0, v0

    const/16 v6, 0x30

    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v6

    rsub-int/lit8 v6, v6, 0x4

    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v10

    cmpl-float v7, v10, v7

    const v10, -0x44a39a0a

    sub-int/2addr v10, v7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    cmp-long v7, v11, v8

    sub-int/2addr v4, v7

    int-to-short v4, v4

    invoke-static {v5, v0, v6, v10, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 88
    :cond_2
    invoke-direct {p0, p1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ(Lorg/json/JSONObject;Z)V

    .line 89
    invoke-direct {p0, p1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ(Lorg/json/JSONObject;Z)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 91
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 p1, p1, 0x1f

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr p1, v1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    const/4 p1, 0x0

    throw p1

    :catch_0
    return-void
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ah;J)J
    .locals 3

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v0

    iput-wide p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾇ:J

    add-int/lit8 v2, v2, 0x57

    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v2, v0

    return-wide p1
.end method

.method private static ﻛ([IZLjava/lang/String;)Ljava/lang/String;
    .locals 12

    if-eqz p2, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    :cond_0
    check-cast p2, [B

    .line 2195
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 2198
    :try_start_0
    aget v2, p0, v1

    const/4 v3, 0x1

    .line 2199
    aget v4, p0, v3

    const/4 v5, 0x2

    .line 2200
    aget v6, p0, v5

    const/4 v7, 0x3

    .line 2201
    aget v7, p0, v7

    .line 2203
    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﮌ:[C

    .line 2204
    new-array v9, v4, [C

    .line 2206
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_3

    .line 2211
    new-array v2, v4, [C

    .line 2214
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    move v8, v1

    :goto_0
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge v10, v4, :cond_2

    .line 2216
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-byte v10, p2, v10

    if-ne v10, v3, :cond_1

    .line 2218
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    add-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    goto :goto_1

    .line 2222
    :cond_1
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    .line 2225
    :goto_1
    sget v8, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v8, v2, v8

    .line 2214
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr v10, v3

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_0

    :cond_2
    move-object v9, v2

    :cond_3
    if-lez v7, :cond_4

    .line 2234
    new-array p2, v4, [C

    .line 2236
    invoke-static {v9, v1, p2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v2, v4, v7

    .line 2237
    invoke-static {p2, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2238
    invoke-static {p2, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    if-eqz p1, :cond_6

    .line 2244
    new-array p1, v4, [C

    .line 2246
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_2
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p2, v4, :cond_5

    .line 2248
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sub-int v2, v4, v2

    sub-int/2addr v2, v3

    aget-char v2, v9, v2

    aput-char v2, p1, p2

    .line 2246
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p2, v3

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_2

    :cond_5
    move-object v9, p1

    :cond_6
    if-lez v6, :cond_7

    .line 2257
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_3
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p1, v4, :cond_7

    .line 2259
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char p2, v9, p2

    aget v1, p0, v5

    sub-int/2addr p2, v1

    int-to-char p2, p2

    aput-char p2, v9, p1

    .line 2257
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p1, v3

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_3

    .line 2263
    :cond_7
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2264
    monitor-exit v0

    throw p0
.end method

.method private ﻛ(Lorg/json/JSONObject;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, ""

    const/4 v3, 0x2

    .line 110
    rem-int v4, v3, v3

    .line 103
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v4, v4, 0x6f

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v4, v3

    const/4 v4, 0x0

    .line 101
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    const v6, 0x182ee6ec

    sub-int v5, v6, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x4a

    int-to-byte v7, v7

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    rsub-int/lit8 v8, v8, -0x2c

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v9

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    const v11, -0x44a39a0b

    sub-int v9, v11, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v12

    cmpl-float v12, v12, v10

    rsub-int/lit8 v12, v12, 0x1

    int-to-short v12, v12

    invoke-static {v5, v7, v8, v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 110
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v5, v5, 0x21

    rem-int/lit16 v7, v5, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v5, v3

    const/4 v7, 0x0

    if-nez v5, :cond_2

    const-wide/16 v8, 0x0

    if-eqz p2, :cond_0

    const v5, 0x182ee6ef

    .line 104
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v12

    sub-int/2addr v5, v12

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v12

    shr-int/lit8 v12, v12, 0x16

    add-int/lit8 v12, v12, -0x14

    int-to-byte v12, v12

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v13

    shr-int/lit8 v13, v13, 0x10

    add-int/lit8 v13, v13, -0x2c

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v14

    add-int/2addr v14, v11

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v15

    shr-int/lit8 v15, v15, 0x10

    int-to-short v15, v15

    invoke-static {v5, v12, v13, v14, v15}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v12

    iget-wide v14, v0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ:J

    goto :goto_0

    .line 106
    :cond_0
    invoke-static {v10, v10}, Landroid/graphics/PointF;->length(FF)F

    move-result v5

    cmpl-float v5, v5, v10

    sub-int v5, v6, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    add-int/lit8 v12, v12, 0x4a

    int-to-byte v12, v12

    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v13

    cmp-long v13, v13, v8

    rsub-int/lit8 v13, v13, -0x2c

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v14

    shr-int/lit8 v14, v14, 0x8

    sub-int v14, v11, v14

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15

    cmp-long v15, v15, v8

    rsub-int/lit8 v15, v15, 0x1

    int-to-short v15, v15

    invoke-static {v5, v12, v13, v14, v15}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v12

    iget-wide v14, v0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ:J

    :goto_0
    add-long/2addr v12, v14

    .line 109
    :try_start_0
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    add-int/2addr v5, v6

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v14

    cmp-long v6, v14, v8

    add-int/lit8 v6, v6, 0x49

    int-to-byte v6, v6

    invoke-static {v2, v2, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v2

    add-int/lit8 v2, v2, -0x2c

    invoke-static {v4, v10, v10}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v8

    cmpl-float v8, v8, v10

    sub-int/2addr v11, v8

    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    int-to-short v4, v4

    invoke-static {v5, v6, v2, v11, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v3

    if-eqz v1, :cond_1

    return-void

    :cond_1
    throw v7

    :catch_0
    return-void

    :cond_2
    throw v7

    :cond_3
    return-void
.end method

.method private static ﻛ(Lorg/json/JSONObject;)Z
    .locals 7

    const/4 v0, 0x2

    .line 97
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 96
    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    move-result v2

    cmpl-float v1, v2, v1

    const v2, 0x182ee6e6

    sub-int/2addr v2, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int/lit8 v1, v1, 0xe

    int-to-byte v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, -0x2c

    const v4, -0x44a39a09

    const/4 v5, 0x0

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v6

    sub-int/2addr v4, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    int-to-short v6, v6

    invoke-static {v2, v1, v3, v4, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/16 v1, 0x1e

    const/4 v3, 0x3

    filled-new-array {v1, v3, v5, v3}, [I

    move-result-object v1

    const-string v3, "\u0001\u0000\u0001"

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    .line 97
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    xor-int/2addr p0, v2

    if-eq p0, v2, :cond_0

    goto :goto_0

    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr p0, v0

    return v5

    :cond_1
    :goto_0
    return v2
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ah;J)J
    .locals 4

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v2, v1, 0x4b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v2, v0

    iput-wide p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ:J

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 p0, v1, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-wide p1

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method private ｋ(Lorg/json/JSONObject;Z)V
    .locals 10

    const-string v0, ""

    const/4 v1, 0x2

    .line 136
    rem-int v2, v1, v1

    const/16 v2, 0x30

    const/4 v3, 0x0

    .line 117
    :try_start_0
    invoke-static {v0, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    const v4, 0x182ee6f1

    sub-int/2addr v4, v2

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v2

    add-int/lit8 v2, v2, 0x50

    int-to-byte v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, -0x2c

    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v8

    cmp-long v8, v8, v5

    const v9, -0x44a39a12

    add-int/2addr v8, v9

    invoke-static {v0, v0, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v0

    int-to-short v0, v0

    invoke-static {v4, v2, v7, v8, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    .line 120
    const-string v0, "\u0000"

    const/16 v2, 0x22

    const/4 v4, 0x1

    const/4 v7, 0x0

    if-eqz p2, :cond_1

    .line 136
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 p2, p2, 0x51

    rem-int/lit16 v8, p2, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr p2, v1

    const-string v8, "\u0001"

    const/16 v9, 0x21

    if-nez p2, :cond_0

    .line 121
    :try_start_1
    filled-new-array {v9, v4, v3, v4}, [I

    move-result-object p2

    invoke-static {p2, v4, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v8, 0x1

    cmp-long p2, v5, v8

    if-lez p2, :cond_2

    goto :goto_0

    :cond_0
    filled-new-array {v9, v4, v3, v4}, [I

    move-result-object p2

    invoke-static {p2, v3, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    cmp-long p2, v8, v5

    if-lez p2, :cond_2

    move-wide v5, v8

    .line 123
    :goto_0
    iget-wide v7, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ:J

    add-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    move-object v7, p2

    goto :goto_1

    .line 126
    :cond_1
    filled-new-array {v2, v4, v3, v3}, [I

    move-result-object p2

    invoke-static {p2, v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    cmp-long p2, v8, v5

    if-lez p2, :cond_2

    .line 128
    iget-wide v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ:J

    add-long/2addr v8, v5

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_1
    if-eqz v7, :cond_4

    .line 122
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 p2, p2, 0x23

    rem-int/lit16 v5, p2, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr p2, v1

    if-eqz p2, :cond_3

    .line 132
    :try_start_2
    filled-new-array {v2, v4, v3, v3}, [I

    move-result-object p2

    invoke-static {p2, v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_3
    filled-new-array {v2, v4, v3, v3}, [I

    move-result-object p2

    invoke-static {p2, v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    :cond_4
    :goto_3
    return-void
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ah;J)J
    .locals 3

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x59

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v0

    iput-wide p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ:J

    if-nez v1, :cond_0

    const/16 p0, 0x44

    div-int/lit8 p0, p0, 0x0

    :cond_0
    add-int/lit8 v2, v2, 0x31

    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_1

    return-wide p1

    :cond_1
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ah;)J
    .locals 5

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    iget-wide v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ:J

    add-int/lit8 v2, v2, 0x7b

    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v2, v0

    return-wide v3
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ah;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 3

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v0

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾒ:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private ﾒ(Lorg/json/JSONObject;)Z
    .locals 9

    const/4 v0, 0x2

    .line 144
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    .line 141
    iget-wide v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾇ:J

    iget-wide v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ:J

    sub-long/2addr v1, v3

    const/16 v3, 0x1b

    const/4 v4, 0x3

    const/4 v5, 0x0

    .line 142
    filled-new-array {v3, v4, v5, v4}, [I

    move-result-object v3

    const-string v4, "\u0001\u0001\u0000"

    const/4 v6, 0x1

    invoke-static {v3, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    const/16 v7, 0x19

    const/16 v8, 0x21

    filled-new-array {v7, v0, v8, v0}, [I

    move-result-object v7

    const-string v8, "\u0000\u0001"

    invoke-static {v7, v5, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v7

    sub-long/2addr v3, v7

    sub-long/2addr v1, v3

    .line 144
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0xa

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 p1, p1, 0x37

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr p1, v0

    return v6

    :cond_0
    return v5
.end method


# virtual methods
.method final ｋ(Lorg/json/JSONObject;)Z
    .locals 10

    const/4 v0, 0x2

    .line 65
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 v1, v1, 0x43

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 57
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ(Lorg/json/JSONObject;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 65
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    rem-int/2addr v1, v0

    .line 57
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﾒ:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 59
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    const v3, 0x182ee6ce

    .line 62
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    add-int/2addr v4, v3

    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x10

    int-to-byte v3, v3

    const/16 v5, 0x30

    invoke-static {v5}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v5

    add-int/lit8 v5, v5, -0x5c

    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    const v7, -0x44a39a29

    add-int/2addr v6, v7

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v7

    int-to-short v7, v7

    invoke-static {v4, v3, v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻐ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x19

    const/16 v5, 0x5a

    filled-new-array {v2, v4, v5, v2}, [I

    move-result-object v4

    const-string v5, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001"

    invoke-static {v4, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 65
    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭖ:I

    add-int/lit8 p1, p1, 0x13

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﭸ:I

    rem-int/2addr p1, v0

    return v2

    .line 57
    :cond_1
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ﻛ(Lorg/json/JSONObject;)Z

    const/4 p1, 0x0

    throw p1
.end method
