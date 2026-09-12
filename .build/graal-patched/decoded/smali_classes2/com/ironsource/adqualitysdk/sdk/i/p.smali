.class public final Lcom/ironsource/adqualitysdk/sdk/i/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﮐ:I = 0x0

.field private static ﱡ:I = 0x1

.field private static ﻐ:I

.field private static ﻛ:C

.field private static ｋ:J

.field private static final ﾇ:Landroid/os/Handler;

.field private static final ﾒ:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ()V

    .line 11
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ:Landroid/os/Handler;

    .line 12
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ()Landroid/os/Handler;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ:Landroid/os/Handler;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const/16 v0, 0x5c

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ﻐ()Landroid/os/Handler;
    .locals 4

    const/4 v0, 0x2

    .line 67
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 v1, v1, 0x1

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr v1, v0

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ:Landroid/os/Handler;

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v2, v0

    return-object v1
.end method

.method private static ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->toCharArray()[C

    move-result-object p4

    :cond_0
    check-cast p4, [C

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_1
    check-cast p3, [C

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_2
    check-cast p0, [C

    .line 1123
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1125
    :try_start_0
    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    .line 1126
    invoke-virtual {p4}, [C->clone()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p0, v1

    xor-int/2addr p1, v2

    int-to-char p1, p1

    aput-char p1, p0, v1

    const/4 p1, 0x2

    .line 1128
    aget-char v2, p4, p1

    int-to-char p2, p2

    add-int/2addr v2, p2

    int-to-char p2, v2

    aput-char p2, p4, p1

    .line 1130
    array-length p2, p3

    .line 1131
    new-array v2, p2, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p2, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p1

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p0, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p4, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 1141
    aget-char v4, p0, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p4, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p4, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p0, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p3, v4

    aget-char v3, p0, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ:C

    int-to-long v5, v5

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v2, v1

    .line 1132
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    goto :goto_0

    .line 1154
    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1155
    monitor-exit v0

    throw p0
.end method

.method public static ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iu;J)V
    .locals 4

    const/4 v0, 0x2

    .line 62
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 v1, v1, 0x39

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr v1, v0

    .line 60
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 p0, p0, 0x33

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr p0, v0

    return-void

    :catch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result p0

    shr-int/lit8 p0, p0, 0x8

    int-to-char p0, p0

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    const-string v0, "\udfb8\u4db1\u2087\u26ce\ue27a\u2cf4\u15a0\ubba1\u8fea\ucc5a\u26b1\ua4c2"

    const-string v1, "\ufdda\uf3cb\u5899\ua84d"

    const-string v2, "\ufdc3\u0814\u3812\uabc9"

    invoke-static {v1, p0, p2, v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p1, p1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    int-to-char p2, p2

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const-string v1, "\u7355\u6720\ub997\u755d\ub708\u68d4\u2fde\u4cea\u2328\u03b0\u835a\u9fe3\u56f9\u1d56\u0327\ue21d\uc8c6\u60f2\ub216\ud13a\ucd4a\ucd1c\u5359\u4f32\u56c7\u3feb\uee74\u4fad\ube1d\u02b1\u0e55\u1993\uf88d\u882f\ua094\u879d"

    const-string v3, "\uca87\u4caa\u55ff\udb35"

    invoke-static {v3, p2, v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static ﻛ()V
    .locals 2

    const-wide v0, -0x5436c7edf7eb023dL    # -9.22400888171778E-98

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ:J

    const/4 v0, 0x0

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ:I

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ:C

    return-void
.end method

.method public static ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    .locals 3

    const/4 v0, 0x2

    .line 46
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v1, v0

    .line 43
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ()Z

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;->run()V

    return-void

    .line 44
    :cond_0
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    .line 46
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 p0, p0, 0x17

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method public static ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iu;J)V
    .locals 4

    const/4 v0, 0x2

    .line 38
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 36
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    throw v2

    .line 36
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    .line 38
    throw p0

    :catch_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result p0

    shr-int/lit8 p0, p0, 0x16

    int-to-char p0, p0

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result p1

    shr-int/lit8 p1, p1, 0x10

    const-string p2, "\udfb8\u4db1\u2087\u26ce\ue27a\u2cf4\u15a0\ubba1\u8fea\ucc5a\u26b1\ua4c2"

    const-string v0, "\ufdda\uf3cb\u5899\ua84d"

    const-string v1, "\ufdc3\u0814\u3812\uabc9"

    invoke-static {v0, p0, p1, p2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    rsub-int/lit8 p1, p1, 0x1

    int-to-char p1, p1

    const p2, 0x4e371344    # 7.678733E8f

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    add-int/2addr v2, p2

    const-string p2, "\ue9c0\uc63b\u94d0\u4d8d\udfd0\u5955\uf2ef\u7767\u8ea8\ud5bc\u86b5\u378a\u0b56\u921cE\u8265\ub0e0\u92d6\u7e06\u7030\ucc6b\u4fe3\u24bf\udd27\u33cd\uec8a\u73b6\u796e\ucfc4\u10e5\ua6c6\u7b16\u9d19\u04c2\u139c\u86a1\u7aee"

    const-string v3, "\u4458\u3713\u514e\uc3ec"

    invoke-static {v3, p1, v2, p2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private static ｋ()Landroid/os/Handler;
    .locals 14

    const-string v0, "\udfb8\u4db1\u2087\u26ce\ue27a\u2cf4\u15a0\ubba1\u8fea\ucc5a\u26b1\ua4c2"

    const-string v1, "\ufdda\uf3cb\u5899\ua84d"

    const-string v2, ""

    const-string v3, "\ufdc3\u0814\u3812\uabc9"

    const/4 v4, 0x2

    .line 91
    rem-int v5, v4, v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 76
    :try_start_0
    new-instance v7, Landroid/os/HandlerThread;

    const-string v8, "\u6a81\ud9f5\u461f\u86d5"

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    int-to-char v9, v9

    invoke-static {v2, v2, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v10

    const-string v11, "\udd9b\u63c7\udba1\uc7fc\u75cd\u4d6c\ufd74\u4820\u9331\u605d"

    invoke-static {v8, v9, v10, v11, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move v8, v6

    :goto_0
    const/4 v9, 0x3

    if-ge v8, v9, :cond_0

    .line 81
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 82
    new-instance v9, Landroid/os/Handler;

    invoke-virtual {v7}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object v9

    :catch_0
    const-wide/16 v9, 0x0

    .line 84
    :try_start_2
    invoke-static {v9, v10}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v9

    int-to-char v9, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    invoke-static {v1, v9, v10, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    const-string v10, "\u21f4\u8ab4\udbe6\uaefe"

    invoke-static {v6}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v11

    int-to-char v11, v11

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v12

    const-string v13, "\u5ad8\u78d6\u7665\u950c\u6266\u374b\u7ae4\u9fba\u0adf\u4e2f\u1218\u17cd\u9178\udce5\uff2b\u970d\u7833\u488e\u0dd5\udcdb\u512e\ube39\u9c94\ue1af\u8078\uf0ca\uca80\u20f2\u0b25\ue91b\u3a11\u9344\u113c\u21b0\ue4ef\ud8f2\u5513\u73d8\u3d1b\u9f96\uf4af\u721c\u300e\u6147\u97ec\ubcc2\u0db4\u2444"

    invoke-static {v10, v11, v12, v13, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v5}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 91
    :cond_0
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v0, v4

    goto :goto_1

    :catch_1
    const/16 v4, 0x30

    .line 89
    invoke-static {v2, v4, v6, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v4

    add-int/2addr v4, v5

    int-to-char v4, v4

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v7

    shr-int/lit8 v7, v7, 0x16

    invoke-static {v1, v4, v7, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v6}, Landroid/view/View;->resolveSize(II)I

    move-result v1

    int-to-char v1, v1

    const v4, -0x6854fb9d

    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v4

    const-string v4, "\ud4cd\uff5b\u99ad\ua442\u00b8\uc089\ue3f4\ubdc5\ua5d8\ud105\u55d3\u0934\u8c0c\ue46e\ub334\ua402\u80ff\u77fa\u4a3b\u0b8f\u11a4\uc398\ud77d\u4a85\u8ff4\ud2f3\uc926`\ucf10\u6fad\u6f0d\u36a4\u3d22\u42e1\u7a1e"

    const-string v6, "\u62a6\uab04\u2097\u28d1"

    invoke-static {v6, v1, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    .locals 6

    const/4 v0, 0x2

    .line 30
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr v1, v0

    .line 28
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 p0, p0, 0x43

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0

    :catch_0
    const/4 p0, 0x0

    invoke-static {p0, p0, p0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    int-to-char v0, v0

    invoke-static {p0, p0}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v1

    const-string v2, "\udfb8\u4db1\u2087\u26ce\ue27a\u2cf4\u15a0\ubba1\u8fea\ucc5a\u26b1\ua4c2"

    const-string v3, "\ufdda\uf3cb\u5899\ua84d"

    const-string v4, "\ufdc3\u0814\u3812\uabc9"

    invoke-static {v3, v0, v1, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1008a2b

    invoke-static {p0, p0, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    add-int/2addr v2, v1

    int-to-char v1, v2

    const-string v2, ""

    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    const v3, 0x416b19a4

    add-int/2addr v2, v3

    const-string v3, "\ubaa9\udf1b\uca03\u8fc8\u236d\u1de8\u8fb7\u7aea\ua407\uae05\u3ed5\u9fde\uf73b\u99d2\udd27\u2a06\uba26\u52b5\u8338\u474e\u79c2\u5433\ucf20\u594b\u6c8f\u0cea\u9072\uf564\udab0"

    const-string v5, "\ua3bd\u6b19\u2b41\ub08a"

    invoke-static {v5, v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ﾇ()Landroid/os/Handler;
    .locals 3

    const/4 v0, 0x2

    .line 15
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ:Landroid/os/Handler;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public static ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    .locals 3

    const/4 v0, 0x2

    .line 22
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_2

    .line 19
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eq v1, v2, :cond_0

    .line 20
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;->run()V

    return-void

    .line 22
    :cond_0
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 p0, p0, 0x27

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    div-int/2addr p0, p0

    :cond_1
    return-void

    .line 19
    :cond_2
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ()Z

    const/4 p0, 0x0

    throw p0
.end method

.method public static ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    .locals 6

    const/4 v0, 0x2

    .line 54
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 52
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    add-int/lit8 p0, p0, 0x51

    rem-int/lit16 v2, p0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/16 p0, 0x31

    div-int/2addr p0, v1

    :cond_0
    return-void

    :catch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result p0

    shr-int/lit8 p0, p0, 0x18

    int-to-char p0, p0

    const-string v0, ""

    invoke-static {v0}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    const-string v3, "\udfb8\u4db1\u2087\u26ce\ue27a\u2cf4\u15a0\ubba1\u8fea\ucc5a\u26b1\ua4c2"

    const-string v4, "\ufdda\uf3cb\u5899\ua84d"

    const-string v5, "\ufdc3\u0814\u3812\uabc9"

    invoke-static {v4, p0, v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v0

    int-to-char v0, v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const-string v3, "\u7355\u6720\ub997\u755d\ub708\u68d4\u2fde\u4cea\u2328\u03b0\u835a\u9fe3\u56f9\u1d56\u0327\ue21d\uc8c6\u60f2\ub216\ud13a\ucd4a\ucd1c\u5359\u4f32\u56c7\u3feb\uee74\u4fad\ube1d\u02b1\u0e55\u1993\uf88d\u882f\ua094\u879d"

    const-string v4, "\uca87\u4caa\u55ff\udb35"

    invoke-static {v4, v0, v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻐ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾇ(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ﾒ()Z
    .locals 3

    const/4 v0, 0x2

    .line 71
    rem-int v1, v0, v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v1, v1, 0x6b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x1

    return v0

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﮐ:I

    add-int/lit8 v1, v1, 0x43

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method
