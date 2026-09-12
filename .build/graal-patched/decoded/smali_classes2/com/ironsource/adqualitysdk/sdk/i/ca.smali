.class public final Lcom/ironsource/adqualitysdk/sdk/i/ca;
.super Lcom/ironsource/adqualitysdk/sdk/i/bg;
.source ""


# static fields
.field private static ﮐ:C = '\u0000'

.field private static ﱟ:I = 0x0

.field private static ﱡ:I = 0x1

.field private static ﺙ:I = 0x0

.field private static ﻐ:Z = true

.field private static ﻛ:I = 0xaf

.field private static ｋ:[C = null

.field private static ﾇ:J = 0x0L

.field private static ﾒ:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x29

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ｋ:[C

    const-wide v0, 0x12787d8b672bba91L

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾇ:J

    const/4 v0, 0x0

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﺙ:I

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﮐ:C

    return-void

    :array_0
    .array-data 2
        0x105s
        0xf4s
        0x101s
        0x102s
        0xf8s
        0xfes
        0xfds
        0x10ds
        0x10bs
        0x113s
        0x10as
        0xdds
        0x10cs
        0xdas
        0xd3s
        0xfcs
        0x128s
        0x103s
        0x110s
        0x121s
        0x116s
        0x114s
        0x123s
        0xf2s
        0x11es
        0x11ds
        0x115s
        0x118s
        0x122s
        0xf0s
        0x112s
        0x125s
        0x11cs
        0xf3s
        0x124s
        0xf1s
        0x11bs
        0x126s
        0xffs
        0x129s
        0xfbs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/bg;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static ｋ(Lcom/my/target/ads/Reward;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 125
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/my/target/ads/Reward;->type:Ljava/lang/String;

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method static synthetic ﾒ(Lcom/my/target/ads/Reward;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 25
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ｋ(Lcom/my/target/ads/Reward;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ｋ(Lcom/my/target/ads/Reward;)Ljava/lang/String;

    const/4 p0, 0x0

    throw p0
.end method

.method private static ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
    .locals 7

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_0
    check-cast p3, [C

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    :cond_1
    check-cast p2, [C

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_2
    check-cast p0, [C

    .line 2123
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 2125
    :try_start_0
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    .line 2126
    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    .line 2127
    aget-char v2, p2, v1

    xor-int/2addr p4, v2

    int-to-char p4, p4

    aput-char p4, p2, v1

    const/4 p4, 0x2

    .line 2128
    aget-char v2, p3, p4

    int-to-char p1, p1

    add-int/2addr v2, p1

    int-to-char p1, v2

    aput-char p1, p3, p4

    .line 2130
    array-length p1, p0

    .line 2131
    new-array v2, p1, [C

    .line 2132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p1, :cond_3

    .line 2134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p4

    rem-int/lit8 v1, v1, 0x4

    .line 2135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 2138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p2, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p3, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 2141
    aget-char v4, p2, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p3, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p3, v3

    .line 2144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p2, v3

    .line 2147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p0, v4

    aget-char v3, p2, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾇ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﺙ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﮐ:C

    int-to-long v5, v5

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v2, v1

    .line 2132
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    goto :goto_0

    .line 2154
    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2155
    monitor-exit v0

    throw p0
.end method

.method private static ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p3, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p3

    :cond_0
    check-cast p3, [B

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    :cond_1
    check-cast p2, [C

    .line 1163
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾒ:Ljava/lang/Object;

    monitor-enter v0

    .line 1165
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ｋ:[C

    .line 1166
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﻛ:I

    .line 1168
    sget-boolean v3, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﻐ:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 1171
    array-length p0, p3

    .line 1172
    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p0, p0, [C

    .line 1174
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_0
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p2, v3, :cond_2

    .line 1176
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget-byte v3, p3, v3

    add-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p2

    .line 1174
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p2, p2, 0x1

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_0

    .line 1179
    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0

    return-object p1

    .line 1182
    :cond_3
    sget-boolean p3, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ:Z

    if-eqz p3, :cond_5

    .line 1185
    array-length p0, p2

    .line 1186
    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p0, p0, [C

    .line 1188
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_1
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p3, v3, :cond_4

    .line 1190
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget-char v3, p2, v3

    sub-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p3

    .line 1188
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p3, p3, 0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_1

    .line 1193
    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0

    return-object p1

    .line 1199
    :cond_5
    array-length p2, p0

    .line 1200
    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p2, p2, [C

    .line 1202
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_2
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p3, v3, :cond_6

    .line 1204
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget v3, p0, v3

    sub-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p2, p3

    .line 1202
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p3, p3, 0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_2

    .line 1207
    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1209
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method final ﻛ(Ljava/lang/String;)Ljava/lang/Class;
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x2

    .line 109
    rem-int v2, v1, v1

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x6

    const/4 v5, 0x3

    const/16 v6, 0x8

    const/4 v7, -0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    const/16 v11, 0x10

    const-string v12, ""

    const-string v13, "\uba91\u672b\u7d8b\u1278"

    const/4 v14, 0x0

    const/4 v15, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v1

    shr-int/2addr v1, v6

    add-int/lit8 v1, v1, 0x7f

    const-string v2, "\u0095\u009c\u009b\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090"

    invoke-static {v15, v1, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v1, v14

    goto/16 :goto_4

    :sswitch_1
    invoke-static {v14, v14, v14, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const v3, 0xbd77

    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v5

    sub-int/2addr v3, v5

    int-to-char v3, v3

    const-string v5, "\u8748\u7cf5\u0099\u7028\ucb04\u3521"

    const-string v6, "\u59a0\u68ea\u7813\u1ebd"

    invoke-static {v5, v2, v6, v13, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v0, v1

    move v1, v4

    goto/16 :goto_4

    .line 68
    :sswitch_2
    invoke-static {v14, v14}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v2

    cmp-long v2, v2, v8

    rsub-int/lit8 v2, v2, 0x7e

    const-string v3, "\u0096\u00a8\u009c\u0084\u008a\u009e"

    invoke-static {v15, v2, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eq v0, v10, :cond_0

    goto/16 :goto_3

    .line 109
    :cond_0
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v0, v0, 0x35

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v0, v1

    const/16 v1, 0x12

    goto/16 :goto_4

    .line 68
    :sswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v1

    shr-int/2addr v1, v6

    add-int/lit8 v1, v1, 0x7f

    const-string v2, "\u0091\u0097\u009c\u00a0\u009c\u0097\u009f\u009e\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090"

    invoke-static {v15, v1, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_0
    move v1, v5

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/2addr v1, v11

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    cmp-long v2, v2, v8

    add-int/2addr v2, v7

    int-to-char v2, v2

    const-string v3, "\u55f2\ua4ad\ub5d2\u8aeb\u7dc9\ub685\ufb2f\u3e27\u9502\u9d71\ue06e\uded9"

    const-string v4, "\u1790\udfb4\u432a\ubfc7"

    invoke-static {v3, v1, v4, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0x11

    goto/16 :goto_4

    :sswitch_5
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v1

    shr-int/2addr v1, v11

    rsub-int/lit8 v1, v1, 0x7f

    const-string v2, "\u0093\u0097\u0093\u00a2\u0096\u0095\u0093\u00a1\u0085"

    invoke-static {v15, v1, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v1, v6

    goto/16 :goto_4

    :sswitch_6
    const v2, -0x7449629

    invoke-static {v12}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v2

    shr-int/2addr v2, v11

    int-to-char v2, v2

    const-string v6, "\ucef9\uc917\u0d17\ud7e6\ucd4e\u9333\u2fac\u8c35\u2446\u529b\uc154\u20e8\u9d19\uddee\u1d75\u3889\u684e\u95c7\uc386\u2cf0\u258f\u56b8\u2978\uce78\u2f96\u7de7\ud994\udca1\u043e\ua9c0\ua32a\u70c5\u3982\ue518\u4ed4\u1a53\uefef"

    const-string v8, "\ud65e\ubb69\uc2f8\u61db"

    invoke-static {v6, v4, v8, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v0, v0, 0x19

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v0, v1

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    move v1, v3

    goto/16 :goto_4

    .line 68
    :sswitch_7
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    shr-int/lit8 v2, v2, 0x16

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v4, v4, v8

    const v5, 0xa3f4

    add-int/2addr v4, v5

    int-to-char v4, v4

    const-string v5, "\u48f8\ud788\ua04a\ud60e\uf5c2\u6af1\u9fe7\u8573\uc6ab\u4567\u21a1\uc52b\u0954\u0e42"

    const-string v6, "\u5617\u7ff4\uf502\u56a3"

    invoke-static {v5, v2, v6, v13, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v2, v0, 0x5b

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v2, v1

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x5

    :goto_2
    add-int/lit8 v0, v0, 0x4f

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v0, v1

    goto :goto_1

    :sswitch_8
    const/16 v2, 0x30

    .line 68
    invoke-static {v12, v2, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/lit16 v2, v2, 0x80

    const-string v3, "\u009d\u00a1\u0093\u0094\u0093\u00a7\u00a1\u0099\u0097\u009d\u00a3\u0098"

    invoke-static {v15, v2, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v0, v1

    if-eqz v0, :cond_3

    const/16 v1, 0x18

    goto/16 :goto_4

    :cond_3
    move v1, v11

    goto/16 :goto_4

    .line 68
    :sswitch_9
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v8

    add-int/lit8 v2, v2, 0x7e

    const-string v3, "\u008a\u009e\u00a5\u0093\u009c\u0097\u009c\u0097\u009d\u0094\u0096\u0097\u009a\u0085\u0096\u009d\u0093\u00a4"

    invoke-static {v15, v2, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_4

    const/16 v1, 0x2d

    goto/16 :goto_4

    :cond_4
    const/16 v1, 0xa

    goto/16 :goto_4

    .line 68
    :sswitch_a
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v8

    add-int/2addr v2, v7

    invoke-static {v14, v14, v14}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v3

    add-int/lit16 v3, v3, 0x1367

    int-to-char v3, v3

    const-string v4, "\ud0da\u669d\u9959\u2ba1\u2c78\uf6e9\u691f\uc839\uaeba\uf4c8\ucf7f\u438c\ua023\u7418"

    const-string v5, "\u4b37\u21a8\u679a\ubd13"

    invoke-static {v4, v2, v5, v13, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 109
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v0, v0, 0x19

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_5

    const/16 v1, 0x4c

    goto/16 :goto_4

    :cond_5
    const/16 v1, 0xb

    goto/16 :goto_4

    .line 68
    :sswitch_b
    invoke-static {v12}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x7e

    const-string v2, "\u0094\u0096\u009a\u0096\u0097\u009d\u009c\u00a9\u00a6\u0096\u009c\u0081\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090"

    invoke-static {v15, v1, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0x13

    goto/16 :goto_4

    :sswitch_c
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v1

    shr-int/2addr v1, v11

    invoke-static {v14}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    add-int/lit16 v2, v2, 0x2739

    int-to-char v2, v2

    const-string v3, "\u96c7\u7d23\u5f4f\u3156\u425b\u976a\ud9e4\ue011\u49a0\uee74\u3942\ua5e5\uecbc\u3cd4\u1cfa\u3487\u2600\ub5aa"

    const-string v4, "\u10ca\u1cf6\u39fc\uc327"

    invoke-static {v3, v1, v4, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0xf

    goto/16 :goto_4

    :sswitch_d
    invoke-static {v14, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v2

    shr-int/2addr v2, v11

    int-to-char v2, v2

    const-string v3, "\ubd72\u3094\u32ce\u2a27\uaf9f\u958a\u7ed4\ua685\ua74d\u21e2\uaf89\u1f0d\uaa44\udd11\u8dba\u6cee\u86cf\u6b34\u7486\u4217\ue23b\u883b"

    const-string v4, "\u38af\u1872\ub2d4\u892c"

    invoke-static {v3, v1, v4, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v10

    if-eq v0, v10, :cond_9

    const/16 v1, 0xc

    goto/16 :goto_4

    :sswitch_e
    invoke-static {v12, v12, v14, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x7f

    const-string v3, "\u008a\u009e\u008a\u0096\u008a\u0094\u0093\u00a6\u0096\u0083"

    invoke-static {v15, v2, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eq v0, v10, :cond_6

    goto/16 :goto_3

    .line 109
    :cond_6
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v0, v1

    if-eqz v0, :cond_7

    const/16 v1, 0x48

    goto/16 :goto_4

    :cond_7
    const/16 v1, 0xe

    goto/16 :goto_4

    :sswitch_f
    const v1, 0x28cb5671

    .line 68
    invoke-static {v14, v14}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v2

    shr-int/2addr v2, v11

    int-to-char v2, v2

    const-string v3, "\u5d11\ub691\u75a2\u2b81\u90c3\u6696\udf06\u064a\u8b8f"

    const-string v4, "\u7160\ucb56\u2128\ubba9"

    invoke-static {v3, v1, v4, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v1, 0x7

    goto/16 :goto_4

    :sswitch_10
    const v1, 0x2f01dccc

    invoke-static {v14}, Landroid/graphics/Color;->red(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v1

    add-int/lit16 v1, v1, 0x3451

    int-to-char v1, v1

    const-string v3, "\u009e\u796b\uf35e\u47f6\u606f\u1b80\uce36\u5867\uff3e\u6372\u3eb2\u0df9\ud8be\ub712\u32d5"

    const-string v4, "\uccb2\u01dc\u512f\u3f34"

    invoke-static {v3, v2, v4, v13, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v1, v10

    goto :goto_4

    :sswitch_11
    invoke-static {v14}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x14

    shr-int/2addr v2, v4

    rsub-int/lit8 v2, v2, 0x7f

    const-string v3, "\u009a\u0099\u009c\u009d\u0094\u0096\u0081\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090"

    invoke-static {v15, v2, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    .line 109
    :cond_8
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/2addr v0, v5

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v0, v1

    goto :goto_4

    .line 68
    :sswitch_12
    invoke-static {v12}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v10

    const v2, 0xe9e3

    invoke-static {v12}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v3, v2

    int-to-char v2, v3

    const-string v3, "\u116d\ub8ec\u2c77\u8264\ub305\u027a"

    const-string v4, "\uc94c\ud608\ue36d\uc9e9"

    invoke-static {v3, v1, v4, v13, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0xd

    goto :goto_4

    :sswitch_13
    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    move-result v2

    cmpl-float v1, v2, v1

    rsub-int/lit8 v1, v1, 0x7f

    const-string v2, "\u0093\u0097\u0093\u00a2\u0099\u009c\u008a\u00a3\u009e"

    invoke-static {v15, v1, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0x9

    goto :goto_4

    :cond_9
    :goto_3
    move v1, v7

    :goto_4
    packed-switch v1, :pswitch_data_0

    return-object v15

    .line 107
    :pswitch_0
    const-class v0, Lcom/my/target/ads/MyTargetView$MyTargetViewListener;

    return-object v0

    .line 105
    :pswitch_1
    const-class v0, Lcom/my/target/ads/MyTargetView$AdSize;

    return-object v0

    .line 103
    :pswitch_2
    const-class v0, Lcom/my/target/ads/MyTargetView;

    return-object v0

    .line 101
    :pswitch_3
    const-class v0, Lcom/my/target/common/CustomParams;

    return-object v0

    .line 99
    :pswitch_4
    const-class v0, Lcom/my/target/ads/RewardedAd$RewardedAdListener;

    return-object v0

    .line 97
    :pswitch_5
    const-class v0, Lcom/my/target/ads/RewardedAd;

    return-object v0

    .line 95
    :pswitch_6
    const-class v0, Lcom/my/target/ads/Reward;

    return-object v0

    .line 93
    :pswitch_7
    const-class v0, Lcom/my/target/ads/InterstitialAd$InterstitialAdListener;

    return-object v0

    .line 91
    :pswitch_8
    const-class v0, Lcom/my/target/ads/InterstitialAd;

    return-object v0

    .line 89
    :pswitch_9
    const-class v0, Lcom/my/target/ads/BaseInterstitialAd;

    return-object v0

    .line 87
    :pswitch_a
    const-class v0, Lcom/my/target/common/models/AudioData;

    return-object v0

    .line 85
    :pswitch_b
    const-class v0, Lcom/my/target/common/models/ImageData;

    return-object v0

    .line 83
    :pswitch_c
    const-class v0, Lcom/my/target/common/models/VideoData;

    return-object v0

    .line 81
    :pswitch_d
    const-class v0, Lcom/my/target/common/BaseAd;

    return-object v0

    .line 79
    :pswitch_e
    const-class v0, Lcom/my/target/common/MyTargetActivity$ActivityEngine;

    return-object v0

    .line 77
    :pswitch_f
    const-class v0, Lcom/my/target/common/MyTargetActivity;

    return-object v0

    .line 74
    :pswitch_10
    const-class v0, Lcom/my/target/common/MyTargetVersion;

    return-object v0

    .line 72
    :pswitch_11
    const-class v0, Lcom/my/target/common/MyTargetManager;

    return-object v0

    .line 70
    :pswitch_12
    const-class v0, Lcom/my/target/common/MyTargetConfig;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d5dbb80 -> :sswitch_13
        -0x6e4bc4b1 -> :sswitch_12
        -0x69450065 -> :sswitch_11
        -0x4c710d90 -> :sswitch_10
        -0x39221d5b -> :sswitch_f
        -0x24589b0f -> :sswitch_e
        -0x1db9b59d -> :sswitch_d
        -0x1778f33b -> :sswitch_c
        0x3e84d96 -> :sswitch_b
        0x1315208f -> :sswitch_a
        0x192621c0 -> :sswitch_9
        0x1abdac77 -> :sswitch_8
        0x1d0ade51 -> :sswitch_7
        0x2075e847 -> :sswitch_6
        0x43130785 -> :sswitch_5
        0x445b06c2 -> :sswitch_4
        0x544268ac -> :sswitch_3
        0x749382e4 -> :sswitch_2
        0x762c8af4 -> :sswitch_1
        0x79a0bc1f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ｋ()Ljava/lang/String;
    .locals 6

    const-string v0, ""

    const/4 v1, 0x2

    .line 63
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    add-int/lit8 v2, v2, 0x9

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    rem-int/2addr v2, v1

    const-string v1, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 56
    :try_start_0
    const-class v2, Lcom/my/target/common/MyTargetVersion;

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v5

    cmpl-float v3, v5, v3

    mul-int/lit16 v3, v3, 0x41d

    invoke-static {v4, v3, v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    return-object v1

    :cond_0
    const-class v2, Lcom/my/target/common/MyTargetVersion;

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v5

    cmpl-float v3, v5, v3

    rsub-int v3, v3, 0x80

    invoke-static {v4, v3, v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 59
    :catch_0
    :try_start_1
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hw;

    move-result-object v1

    const-class v2, Lcom/my/target/common/MyTargetVersion;

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x7f

    const-string v3, "\u008f\u008a\u0089\u008e\u008d\u008c\u008a\u0089\u008b\u008a\u0089\u0088"

    invoke-static {v4, v0, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    return-object v4
.end method

.method final ﾇ()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/bg$c;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 121
    rem-int v1, v0, v0

    .line 114
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 115
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const v3, -0x7b2dcba0

    sub-int/2addr v3, v2

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    rsub-int v2, v2, 0x3029

    int-to-char v2, v2

    const-string v4, "\u9318\u303b\u8a6c\uf7a7\u076c\u8881\uf497\ud5d1\u5d5b\u0f68\u2201\ue033\u2c98"

    const-string v5, "\u5f73\ud234\u2984\u6030"

    const-string v6, "\uba91\u672b\u7d8b\u1278"

    invoke-static {v4, v3, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﾒ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ca$1;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ca$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ca;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱟ:I

    add-int/lit8 v2, v2, 0x17

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ca;->ﱡ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method
