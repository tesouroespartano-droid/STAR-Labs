.class final Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:I = 0x1

.field private static ﱡ:I = 0x0

.field private static ﻏ:C = '\u1abc'

.field private static ﻐ:C = '\ufcd1'

.field private static ﾇ:C = '\u72d1'

.field private static ﾒ:C = '\u694a'


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

.field private synthetic ｋ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;Z)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iput-boolean p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ｋ:Z

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 13

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1105
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﾇ:Ljava/lang/Object;

    monitor-enter v0

    .line 1107
    :try_start_0
    array-length v1, p0

    new-array v1, v1, [C

    const/4 v2, 0x0

    .line 1109
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    const/4 v3, 0x2

    .line 1110
    new-array v4, v3, [C

    .line 1111
    :goto_0
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    array-length v6, p0

    if-ge v5, v6, :cond_2

    .line 1113
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    aget-char v5, p0, v5

    aput-char v5, v4, v2

    .line 1114
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    aget-char v5, p0, v5

    aput-char v5, v4, v6

    const v5, 0xe370

    move v7, v2

    :goto_1
    const/16 v8, 0x10

    if-ge v7, v8, :cond_1

    .line 1119
    aget-char v8, v4, v6

    aget-char v9, v4, v2

    add-int v10, v9, v5

    shl-int/lit8 v11, v9, 0x4

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﾇ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻏ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﾒ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻐ:C

    add-int/2addr v8, v11

    xor-int/2addr v8, v10

    sub-int/2addr v9, v8

    int-to-char v8, v9

    aput-char v8, v4, v2

    const v8, 0x9e37

    sub-int/2addr v5, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1128
    :cond_1
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    aget-char v7, v4, v2

    aput-char v7, v1, v5

    .line 1129
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    add-int/2addr v5, v6

    aget-char v6, v4, v6

    aput-char v6, v1, v5

    .line 1130
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    add-int/2addr v5, v3

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    goto :goto_0

    .line 1134
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1135
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ﻐ()V
    .locals 7

    const/4 v0, 0x2

    .line 467
    rem-int v1, v0, v0

    .line 465
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    add-int/lit8 v2, v2, 0x6

    const-string v3, "\u38a1\u6081\u5630\ub217\u8d09\ubed0\ub358\u65aa"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-boolean v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ｋ:Z

    if-eqz v3, :cond_1

    .line 467
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﱡ:I

    add-int/lit8 v3, v3, 0x3d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﮐ:I

    rem-int/2addr v3, v0

    .line 465
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﾇ:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 467
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﱡ:I

    add-int/lit8 v3, v3, 0x41

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﮐ:I

    rem-int/2addr v3, v0

    .line 465
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﾇ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x4

    const-string v4, "\u295a\u3f1a\udd7c\u80f5"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    .line 467
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﱡ:I

    add-int/lit8 v4, v4, 0x53

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﮐ:I

    rem-int/2addr v4, v0

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 465
    :goto_0
    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/at;

    move-result-object v4

    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/gn;

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/gn;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v5, v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v5, v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v5, v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v5, v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v5}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Landroid/content/Context;

    iget-boolean v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ｋ:Z

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/js;->ﾒ(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/at;ZLcom/ironsource/adqualitysdk/sdk/i/ao;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻐ(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 466
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-boolean v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﻐ:Z

    if-eqz v1, :cond_2

    .line 467
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﱡ:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﮐ:I

    rem-int/2addr v1, v0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻐ()V

    :cond_2
    return-void
.end method
