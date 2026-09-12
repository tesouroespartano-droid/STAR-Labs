.class final Lcom/ironsource/adqualitysdk/sdk/i/ix$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ix;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﱟ:C = '\u0000'

.field private static ﱡ:I = 0x1

.field private static ﺙ:I = 0x0

.field private static ﾇ:J = -0x3650ad23640d9d06L

.field private static ﾒ:I


# instance fields
.field private synthetic ﻐ:Landroid/content/Context;

.field private synthetic ﻛ:Landroid/content/Intent;

.field final synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ix;Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ix;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻛ:Landroid/content/Intent;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ:Landroid/content/Context;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
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

    .line 1123
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1125
    :try_start_0
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    .line 1126
    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p2, v1

    xor-int/2addr p4, v2

    int-to-char p4, p4

    aput-char p4, p2, v1

    const/4 p4, 0x2

    .line 1128
    aget-char v2, p3, p4

    int-to-char p1, p1

    add-int/2addr v2, p1

    int-to-char p1, v2

    aput-char p1, p3, p4

    .line 1130
    array-length p1, p0

    .line 1131
    new-array v2, p1, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p1, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p4

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
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

    .line 1141
    aget-char v4, p2, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p3, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p3, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p2, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p0, v4

    aget-char v3, p2, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﾇ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﾒ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﱟ:C

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


# virtual methods
.method public final ﻐ()V
    .locals 9

    const-string v0, "\u62fa\u9bf2\u52dc\uc9af"

    const/4 v1, 0x2

    .line 112
    rem-int v2, v1, v1

    const/4 v2, 0x0

    .line 80
    :try_start_0
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻛ:Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\ubc69\u84c2\ufc99\u77af\ua4b6\u0246\ub971\u1c2e\ub3d8\u3e95\uc066\u97a6\u11fa\u8a14\udaac\ue30d\u67bf\uf81a\u8651\uad72\ub8a4\ua2ce\u42fb\u2aaa\ud30f\u52b9\u118c\ud0b0\u3578\ued53\uc5a8\ude2d\ue004\u3f46\u2c41\ue9df"

    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    const-string v6, "\u2921\u6261\ua021\ud8ab"

    const-string v7, ""

    invoke-static {v7}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {v4, v5, v6, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v8

    if-eq v3, v8, :cond_2

    .line 81
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾇ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\uc1fd\u9825\uae2d\u381f\ud6ad\u5d51\u9b4e\uefe9\u362c\uebbf\u30fc\uf93b\ua25b\u5987\uc88b\u818b\ubdec\u62b6\u56bd\u4125\u88e2\ub507\u79e0\ub296\u0201\u44c3\ud266"

    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    move-result v5

    const v6, -0x1b250bd3

    add-int/2addr v5, v6

    const-string v6, "\u2de8\udaf4\u5ee4\ua266"

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int v7, v7, 0x665e

    int-to-char v7, v7

    invoke-static {v4, v5, v6, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻛ:Landroid/content/Intent;

    const-string v4, "\u8965\ua5c7\ue4b8\u6133\uc34a\u6e14\ucc77\u94c0\uf581\u1c42\u815b\uc35d\u17f5\udfa8"

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    const-string v6, "\u7341\u45f6\u58e3\u9d1f"

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v7

    shr-int/lit8 v7, v7, 0x8

    add-int/lit16 v7, v7, 0x1f58

    int-to-char v7, v7

    invoke-static {v4, v5, v6, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾇ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\ud83a\ud7fe\u173f\u570f\u382a\ufc42\ue267\u5272\u8c4f\u5dbe\u8471\uf243\u03f2\u3f8c\uff57\u7e16\u2ed2\uc84c\u49cf\ue9c1\ue6ca\u3312\u013a\u9f96\ue081\u9953\ud9d7\u688a\u2874\u69a7\uef10"

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    const v6, -0x346d33e2    # -1.924102E7f

    sub-int/2addr v6, v5

    const-string v5, "\u1eff\u92cc\udecb\u300a"

    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v7

    rsub-int v7, v7, 0xadd

    int-to-char v7, v7

    invoke-static {v4, v6, v5, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$3;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ix$1;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﺙ:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﱡ:I

    rem-int/2addr v0, v1

    return-void

    .line 92
    :cond_0
    :try_start_1
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ix;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ:Landroid/content/Context;

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ix;Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 93
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$5;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ix$1;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void

    .line 101
    :cond_1
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$2;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ix$1;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    :cond_2
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﱡ:I

    add-int/lit8 v0, v0, 0x77

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﺙ:I

    rem-int/2addr v0, v1

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾇ()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v4

    int-to-byte v4, v4

    rsub-int/lit8 v4, v4, -0x1

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v5

    int-to-byte v5, v5

    add-int/lit16 v5, v5, 0x5ce9

    int-to-char v5, v5

    const-string v6, "\uc18e\u8dcd\u9964\u2560\ucd77\uf9fc\u6f14\u9740\u412c\u58d5\ua653\u7001\u55d0\ue7ca\u63fc\u52ff\ua326\u3468"

    const-string v7, "\u8b7e\uac5e\ue865\u875c"

    invoke-static {v6, v4, v7, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ix$1;->ﻐ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method
