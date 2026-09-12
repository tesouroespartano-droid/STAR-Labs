.class public Lcom/ironsource/adqualitysdk/sdk/i/jp;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﮐ:I = 0x1

.field private static ﱡ:I = 0x0

.field private static ﻐ:J = 0x5b793cfb6cfdf0f7L

.field private static ﾒ:[I


# instance fields
.field private ﻛ:Landroid/content/Context;

.field private ｋ:J

.field private ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ:[I

    return-void

    :array_0
    .array-data 4
        -0x1ae278f8
        0x5798c0e9
        -0x471b30d9
        0x261e4037
        0x2c6dbe7d
        -0x7b04f46
        -0x3a5e9cdf
        -0x35ff9a0c    # -2103677.0f
        -0x25ad2d7c
        -0x44a7f9e8
        -0x460ded52
        0x2239f128
        -0x41e4841c
        -0x7aab1a0a
        -0x579274ab
        -0x6e4032e0
        -0x557d6d50
        0x3215dabb
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;J)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    .line 34
    iput-wide p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ｋ:J

    .line 35
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/gn;

    invoke-direct {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/gn;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1077
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾒ:Ljava/lang/Object;

    monitor-enter v0

    .line 1080
    :try_start_0
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ｋ:I

    .line 1083
    array-length p1, p0

    new-array p1, p1, [C

    const/4 v1, 0x0

    .line 1084
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1086
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    aget-char v2, p0, v2

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/i;->ｋ:I

    mul-int/2addr v3, v4

    xor-int/2addr v2, v3

    int-to-long v2, v2

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ:J

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-char v2, v2

    aput-char v2, p1, v1

    .line 1084
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    goto :goto_0

    .line 1090
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1091
    monitor-exit v0

    throw p0
.end method

.method private static ﾒ([II)Ljava/lang/String;
    .locals 12

    .line 1126
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x4

    .line 1128
    :try_start_0
    new-array v1, v1, [C

    .line 1129
    array-length v2, p0

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    new-array v2, v2, [C

    .line 1130
    sget-object v4, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ:[I

    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    const/4 v5, 0x0

    .line 1132
    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    :goto_0
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    array-length v7, p0

    if-ge v6, v7, :cond_1

    .line 1134
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    aget v6, p0, v6

    const/16 v7, 0x10

    shr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v5

    .line 1135
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    aget v6, p0, v6

    int-to-char v6, v6

    aput-char v6, v1, v3

    .line 1136
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v3

    aget v6, p0, v6

    shr-int/2addr v6, v7

    int-to-char v6, v6

    const/4 v8, 0x2

    aput-char v6, v1, v8

    .line 1137
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v3

    aget v6, p0, v6

    int-to-char v6, v6

    const/4 v9, 0x3

    aput-char v6, v1, v9

    .line 1141
    aget-char v6, v1, v5

    shl-int/2addr v6, v7

    aget-char v10, v1, v3

    add-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1142
    aget-char v6, v1, v8

    shl-int/2addr v6, v7

    aget-char v10, v1, v9

    add-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 1145
    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ([I)V

    move v6, v5

    :goto_1
    if-ge v6, v7, :cond_0

    .line 1150
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    aget v11, v4, v6

    xor-int/2addr v10, v11

    .line 1151
    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    invoke-static {v10}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ(I)I

    move-result v10

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    xor-int/2addr v10, v11

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 1153
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1154
    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    sput v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1155
    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1157
    :cond_0
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1158
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1161
    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    aget v10, v4, v7

    xor-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 1162
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    const/16 v10, 0x11

    aget v10, v4, v10

    xor-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 1165
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 1167
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    ushr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v5

    .line 1168
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    int-to-char v6, v6

    aput-char v6, v1, v3

    .line 1169
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    ushr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v8

    .line 1170
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    int-to-char v6, v6

    aput-char v6, v1, v9

    .line 1173
    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ([I)V

    .line 1176
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    aget-char v7, v1, v5

    aput-char v7, v2, v6

    .line 1177
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v3

    aget-char v7, v1, v3

    aput-char v7, v2, v6

    .line 1178
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v8

    aget-char v7, v1, v8

    aput-char v7, v2, v6

    .line 1179
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v9

    aget-char v7, v1, v9

    aput-char v7, v2, v6

    .line 1132
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v8

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    goto/16 :goto_0

    .line 1181
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2, v5, p1}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1182
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public ﻐ(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 92
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﱡ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﮐ:I

    rem-int/2addr v1, v0

    if-nez p1, :cond_0

    .line 44
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 47
    :cond_0
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ﾒ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    const v1, 0xf847

    const/4 v2, 0x0

    .line 48
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    add-int/2addr v3, v1

    const-string v1, "\uf096\u08c0\t\u1869\u118e\u29ed"

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻛ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﾒ()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 51
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    const v4, 0xaeb8

    add-int/2addr v3, v4

    const-string v4, "\uf09e\u5e3d\uadf7\ufcbf"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    if-eqz p3, :cond_3

    .line 56
    iget-wide v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ｋ:J

    const-wide/16 v5, 0x0

    cmp-long p3, v3, v5

    if-lez p3, :cond_2

    const p3, 0xed37

    .line 57
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    sub-int/2addr p3, v1

    const-string v1, "\uf09b\u1da3\u2aed\u3721"

    invoke-static {v1, p3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    iget-wide v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ｋ:J

    invoke-virtual {p1, p3, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_2
    const p3, 0x5006b216

    const v1, -0x4c80a7fa

    const v3, 0x11e81f3e

    const v4, -0x54707593

    .line 59
    filled-new-array {v3, v4, p3, v1}, [I

    move-result-object p3

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    const/4 v3, 0x6

    shr-int/2addr v1, v3

    rsub-int/lit8 v1, v1, 0x5

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻐ()Z

    move-result v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const p3, -0x2ffc9662

    const v1, 0x18ca054e

    .line 60
    filled-new-array {p3, v1}, [I

    move-result-object p3

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    shr-int/2addr v1, v3

    add-int/lit8 v1, v1, 0x3

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﮐ()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p3

    rsub-int p3, p3, 0x1709

    const-string v1, "\uf082\ue797\ude81"

    invoke-static {v1, p3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﾇ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result p3

    shr-int/lit8 p3, p3, 0x10

    const v1, 0x8243

    sub-int/2addr v1, p3

    const-string p3, "\uf082\u72d7"

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ｋ()Z

    move-result v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const p3, 0x73708975

    const v1, -0x5fc8bc14

    .line 63
    filled-new-array {p3, v1}, [I

    move-result-object p3

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v1

    shr-int/lit8 v1, v1, 0x16

    add-int/2addr v1, v0

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    int-to-double v7, v1

    const-wide v9, 0x414b774000000000L    # 3600000.0

    div-double/2addr v7, v9

    invoke-virtual {p1, p3, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const p3, -0x4eedb3bf

    const v1, 0x775b5719

    const v4, -0x53fcca56

    const v7, -0x77881d9b

    .line 64
    filled-new-array {p3, v1, v4, v7}, [I

    move-result-object p3

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit8 v1, v1, 0x5

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/IronSourceAdQuality;->getSDKVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const p3, -0x6c435aa4

    const v1, 0x245a46fc

    .line 65
    filled-new-array {p3, v1}, [I

    move-result-object p3

    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ju;->ﻐ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result p3

    shr-int/lit8 p3, p3, 0x10

    const v1, 0xc2cf

    sub-int/2addr v1, p3

    const-string p3, "\uf09a\u3257\u750d\ub8ff\ufba7"

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    new-array p3, v3, [I

    fill-array-data p3, :array_0

    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    move-result v1

    rsub-int/lit8 v1, v1, 0xc

    invoke-static {p3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const p3, 0x1762ca12

    const v1, 0x6afbf1e2    # 1.5229132E26f

    const v3, 0x7be1a048

    const v4, -0x34914974    # -1.56443E7f

    .line 69
    filled-new-array {v3, v4, p3, v1}, [I

    move-result-object p3

    const-string v1, ""

    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x9

    invoke-static {p3, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    rsub-int v3, v3, 0x6673

    const-string v4, "\uf096\u96ea\u3c75\uc3dc\u6954\uf0a1\u9621"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const p3, 0x99d7

    .line 70
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    sub-int/2addr p3, v3

    const-string v3, "\uf098\u6953\uc32f"

    invoke-static {v3, p3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﻛ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    iget-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ:Landroid/content/Context;

    invoke-static {p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ju;->ﾇ(Landroid/content/Context;Lorg/json/JSONObject;)V

    .line 74
    iget-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ:Landroid/content/Context;

    invoke-static {p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ｋ(Landroid/content/Context;Lorg/json/JSONObject;)V

    .line 75
    iget-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ:Landroid/content/Context;

    invoke-static {p3, p1, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﻐ(Landroid/content/Context;Lorg/json/JSONObject;Z)V

    .line 76
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾇ(Lorg/json/JSONObject;)V

    .line 77
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ｋ(Lorg/json/JSONObject;)V

    const p3, -0x30b63f2

    const p4, 0xed3e62d

    .line 78
    filled-new-array {p3, p4}, [I

    move-result-object p3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result p4

    shr-int/lit8 p4, p4, 0x8

    add-int/lit8 p4, p4, 0x4

    invoke-static {p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 79
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻛ:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾒ(Landroid/content/Context;Lorg/json/JSONObject;)V

    .line 80
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﻐ(Lorg/json/JSONObject;)V

    .line 83
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    iget-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    invoke-virtual {p3}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻏ()Ljava/util/Map;

    move-result-object p3

    invoke-direct {p2, p3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 84
    const-string p3, "\uf096\u1fbc\u2ed8\u3d25\u4c22\u5b72\u6b84\u7aca\u89d0\u9832\ua74d\ub79d\uc6a1"

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result p4

    shr-int/lit8 p4, p4, 0x18

    const v3, 0xef2f

    sub-int/2addr v3, p4

    invoke-static {p3, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    move-result p3

    if-lez p3, :cond_3

    const p3, -0x9b1c3f9

    const p4, -0xa76a830

    .line 86
    filled-new-array {p4, p3}, [I

    move-result-object p3

    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result p4

    const v2, 0x1000004

    add-int/2addr p4, v2

    invoke-static {p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﱡ:I

    add-int/lit8 p2, p2, 0x17

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﮐ:I

    rem-int/2addr p2, v0

    goto :goto_0

    :catch_0
    move-exception p2

    const/16 p3, 0xe

    .line 89
    new-array p3, p3, [I

    fill-array-data p3, :array_1

    const/16 p4, 0x30

    invoke-static {v1, p4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result p4

    add-int/lit8 p4, p4, 0x1a

    invoke-static {p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾒ([II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v1

    cmp-long p4, v1, v5

    add-int/lit16 p4, p4, 0x4120

    const-string v1, "\uf0b2\ub1a4\u72c7\u33fb\uf401\ub572\u7650\u3774\uf99b\ubab7\u7bd3\u3cfb\ufd5b\ube37\u7f5c\u206c\ue286\ua3e6\u64c1\u25e5\ue617\ua723\u6801\u296a\ueb9c\uaca1\u6dc3\u2eac\uef1f\u9025\u5109\u126d\ud4a1\u95d3\u56fb\u1700"

    invoke-static {v1, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4, p2}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    :cond_3
    :goto_0
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﮐ:I

    add-int/lit8 p2, p2, 0x2d

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﱡ:I

    rem-int/2addr p2, v0

    return-object p1

    :array_0
    .array-data 4
        -0x6b9d941a
        0x6a3a852e
        0x5ae09913
        -0x19691eb6
        -0x31b3d4ea
        0x4dd6cb92
    .end array-data

    :array_1
    .array-data 4
        -0x698894b1
        0x1b9a3c68
        0x4c9a29d3    # 8.082601E7f
        0x28b06b11
        -0x5054cc21
        0x438d9642
        -0x1c4b1456
        0x4b3753fa    # 1.2014586E7f
        -0x44f3bac
        -0x7fcd979b
        -0xdc88291
        -0x78480550
        -0x53fcca56
        -0x77881d9b
    .end array-data
.end method

.method public final ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/ao;
    .locals 4

    const/4 v0, 0x2

    .line 96
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﮐ:I

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﱡ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ao;

    add-int/lit8 v2, v2, 0x5f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﮐ:I

    rem-int/2addr v2, v0

    return-object v1
.end method
