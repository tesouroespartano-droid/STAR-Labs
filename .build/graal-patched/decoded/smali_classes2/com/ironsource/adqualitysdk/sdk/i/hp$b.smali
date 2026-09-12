.class public final Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
.super Lcom/ironsource/adqualitysdk/sdk/i/ho$c;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/ci;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/hp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static ﺙ:I = 0x1

.field private static ﻐ:I = 0x0

.field private static ﻛ:I = 0x0

.field private static ｋ:C = '\u5f38'

.field private static ﾒ:J


# instance fields
.field private ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho$c;-><init>()V

    .line 64
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    return-void
.end method

.method private ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 109
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 108
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻐ()V

    .line 109
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr v1, v0

    return-object p0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻐ()V

    const/4 v0, 0x0

    .line 109
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method private ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 74
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 73
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/hp;I)I

    .line 74
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x4f

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, v0

    return-object p0

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/hp;I)I

    const/4 p1, 0x0

    .line 74
    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﻛ(Z)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 79
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x65

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 78
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Z)Z

    .line 79
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 p1, p1, 0x6b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr p1, v0

    return-object p0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Z)Z

    const/4 p1, 0x0

    .line 79
    throw p1
.end method

.method private ﾇ(ZI)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 99
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr v1, v0

    .line 97
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    iput-boolean p1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ｋ:Z

    .line 98
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    iput p2, p1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ:I

    .line 99
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 p1, p1, 0x43

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method private static ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
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

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾒ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻐ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ:C

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

.method private ﾒ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 104
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 103
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 p1, 0x47

    .line 104
    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 103
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x67

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, v0

    return-object p0
.end method


# virtual methods
.method public final ﻐ(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/cl;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/ironsource/adqualitysdk/sdk/i/cl;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p3, 0x2

    .line 149
    rem-int v0, p3, p3

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/16 v2, 0x8

    const/4 v3, 0x6

    const-wide/16 v4, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v10, "\u0000\u0000\u0000\u0000"

    const/4 v11, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    invoke-static {v8, v8}, Landroid/graphics/PointF;->length(FF)F

    move-result v0

    cmpl-float v0, v0, v8

    const v1, -0x6a8b8172

    add-int/2addr v0, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v1

    shr-int/2addr v1, v2

    int-to-char v1, v1

    const-string v2, "\u86b8\u99fb\ud7ac\uc789\u386d\uad1f\u9104\u11cc\uab6d\u92ac\u18e2\u7271\u8b94\uc1b3\uf76c\uaae8\u0204\u35bc\u906a\u9aab\u91ee"

    const-string v3, "\u8ef6\u747e\ua195\u9a71"

    invoke-static {v2, v0, v3, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 149
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x43

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, p3

    if-eqz p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x4

    goto/16 :goto_2

    :sswitch_1
    const v0, -0x24000a2d

    .line 118
    invoke-static {v11}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    const v2, 0xcc73

    add-int/2addr v0, v2

    int-to-char v0, v0

    const-string v2, "\uf82b\u7219\u7752\u4072\ua7b7\ucb93\u4d1a\uaf51\u9844\u2cfd\u0908\u559b\u7f1f\u6eca\ufc57"

    const-string v4, "\ud274\ufff5\u73db\u56cc"

    invoke-static {v2, v1, v4, v10, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v1, v3

    goto/16 :goto_2

    :sswitch_2
    const v0, -0xe710475

    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    sub-int/2addr v0, v2

    const/high16 v2, 0x1000000

    invoke-static {v11, v11, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    add-int/2addr v3, v2

    int-to-char v2, v3

    const-string v3, "\u2872\u108f\ubcc2\ue30f\u78c4\u6719\ue94f\u15f1\ua3e4\u838c\u7478\ua2f1\uadd8\u7ca1\u01e7\u78c2\ud5cf\u704c\u3583\u3c23\ua7c9"

    const-string v4, "\u8bb9\u8efb\u2df1\ueb49"

    invoke-static {v3, v0, v4, v10, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 149
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, p3

    if-eqz p1, :cond_5

    goto :goto_0

    .line 118
    :sswitch_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    cmp-long v0, v0, v4

    rsub-int/lit8 v0, v0, 0x1

    invoke-static {v11}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    shr-int/2addr v1, v3

    add-int/lit16 v1, v1, 0x2e21

    int-to-char v1, v1

    const-string v2, "\ue610\uc9fb\u9022\ub910\ub003\ue148\u9fd3\u40b5\uee5c\u674b\ueb34\uc4ba\u65fd\u2d07\u29fb\u20f4\u6fbe\uf529"

    const-string v3, "\u5d15\u7b5e\u212c\ue32e"

    invoke-static {v2, v0, v3, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_0
    move v1, v7

    goto/16 :goto_2

    :sswitch_4
    const v0, -0x2dd7b675

    invoke-static {v11, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v1

    cmpl-float v1, v1, v8

    add-int/lit16 v1, v1, 0x5250

    int-to-char v1, v1

    const-string v2, "\u0c34\u8b2a\uc567\ub072\ucce1"

    const-string v3, "\u8b53\u2849\u51d2\u3d52"

    invoke-static {v2, v0, v3, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v1, 0x7

    goto/16 :goto_2

    :sswitch_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    const v1, 0x4ec70ae7    # 1.6696902E9f

    add-int/2addr v0, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    const v3, 0xe1be

    sub-int/2addr v3, v1

    int-to-char v1, v3

    const-string v3, "\ued0e\ue80b\u686e\ub8a9\ub189"

    const-string v4, "\ue748\uc70a\ube4e\u67e1"

    invoke-static {v3, v0, v4, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eq p1, v9, :cond_1

    goto/16 :goto_1

    .line 149
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x13

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, p3

    if-eqz p1, :cond_2

    const/16 p1, 0x19

    move v1, p1

    goto/16 :goto_2

    :cond_2
    move v1, v2

    goto/16 :goto_2

    .line 118
    :sswitch_6
    invoke-static {v11}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    shr-int/lit8 v1, v1, 0x16

    int-to-char v1, v1

    const-string v2, "\ub37f\u074c\udc81\u25b2\u9f6c\ua64b\u3bd2\u417a\u4df2\u3161"

    const-string v3, "\u74c3\u4e8b\u947e\u1026"

    invoke-static {v2, v0, v3, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v1, v9

    goto :goto_2

    :sswitch_7
    const-string v0, ""

    const/16 v1, 0x30

    invoke-static {v0, v1, v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    const v1, 0x4ca39fc

    add-int/2addr v0, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v1

    cmp-long v1, v1, v4

    const v2, 0xaa69

    sub-int/2addr v2, v1

    int-to-char v1, v2

    const-string v2, "\ud137\u32f8\u54d7\u88b3\udf30\ud7ef\ua7a9\uf0b4\u2037\u43bc\u1c82\u8477\u971d"

    const-string v3, "\ufb62\uca39\u6804\u0faa"

    invoke-static {v2, v0, v3, v10, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v9

    if-eq p1, v9, :cond_4

    .line 149
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 p1, p1, 0x11

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr p1, p3

    move v1, v11

    goto :goto_2

    .line 118
    :sswitch_8
    invoke-static {v11, v11}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v0

    const v2, 0xab4d

    invoke-static {v11}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    add-int/2addr v3, v2

    int-to-char v2, v3

    const-string v3, "\u9d5b\u6229\u801f\ue098\u1b92\u6bfe\u5810\ufddb\u6f5f\ueded\uf35a\u68c5\u9570\u8f94\uc71c\ue135\ue69e\ub475"

    const-string v4, "\u6e8b\u8c56\u4da5\uc0ab"

    invoke-static {v3, v0, v4, v10, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 149
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 p1, p1, 0x7b

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr p1, p3

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, p3

    goto :goto_2

    :cond_4
    :goto_1
    move v1, v6

    :cond_5
    :goto_2
    const/4 p1, 0x0

    packed-switch v1, :pswitch_data_0

    return-object p1

    .line 147
    :pswitch_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hp;

    move-result-object p2

    .line 149
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v0, v0, 0x31

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v0, p3

    if-nez v0, :cond_6

    return-object p2

    :cond_6
    throw p1

    .line 145
    :pswitch_1
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 142
    :pswitch_2
    const-class p1, Ljava/lang/Class;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 143
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾒ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 135
    :pswitch_3
    const-class p1, Ljava/lang/Boolean;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 137
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-le p3, v9, :cond_7

    .line 138
    const-class p3, Ljava/lang/Integer;

    invoke-static {p2, v9, p3}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 140
    :cond_7
    invoke-direct {p0, p1, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(ZI)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 132
    :pswitch_4
    const-class p1, Ljava/lang/Integer;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 133
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 129
    :pswitch_5
    const-class p1, Ljava/lang/Integer;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 130
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾒ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 126
    :pswitch_6
    const-class p1, Ljava/lang/Boolean;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 127
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ(Z)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 123
    :pswitch_7
    const-class p1, Ljava/lang/Integer;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 124
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    .line 120
    :pswitch_8
    const-class p1, Ljava/lang/Class;

    invoke-static {p2, v11, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 121
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x5051e628 -> :sswitch_8
        -0x370d8f50 -> :sswitch_7
        -0xce80ae8 -> :sswitch_6
        0x59bc66e -> :sswitch_5
        0x6761d4f -> :sswitch_4
        0x1711abaa -> :sswitch_3
        0x175cef12 -> :sswitch_2
        0x3f9fecc8 -> :sswitch_1
        0x54d47844 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final ﻛ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 89
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 88
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    iget v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    and-int/2addr p1, v2

    :goto_0
    iput p1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    iget v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    or-int/2addr p1, v2

    goto :goto_0

    .line 89
    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x33

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method public final ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hp;
    .locals 3

    const/4 v0, 0x2

    .line 113
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x2d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﾇ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 69
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 68
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Ljava/lang/Class;)Ljava/lang/Class;

    .line 69
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 p1, p1, 0x75

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr p1, v0

    return-object p0

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Ljava/lang/Class;)Ljava/lang/Class;

    const/4 p1, 0x0

    .line 69
    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public final ﾒ(I)Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    .locals 3

    const/4 v0, 0x2

    .line 84
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    rem-int/2addr v1, v0

    .line 83
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    iget v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ:I

    or-int/2addr p1, v2

    iput p1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ:I

    .line 84
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﻛ:I

    add-int/lit8 p1, p1, 0x2f

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hp$b;->ﺙ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method
