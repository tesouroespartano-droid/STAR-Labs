.class final Lcom/ironsource/adqualitysdk/sdk/i/w$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/w;->ﻛ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﻏ:I = 0x1

.field private static ﻐ:I

.field private static ﾇ:J

.field private static ﾒ:[C


# instance fields
.field private synthetic ﻛ:Ljava/lang/Object;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2a

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾒ:[C

    const-wide v0, 0x5144036939cf3ddbL    # 3.0374423969407177E83

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾇ:J

    return-void

    nop

    :array_0
    .array-data 2
        0x24fes
        0x1916s
        0x5f62s
        -0x62bbs
        -0x2c59s
        0x119cs
        0x57e8s
        -0x6be0s
        -0x35fbs
        0x865s
        0x4e77s
        -0x734bs
        -0x3d4cs
        0xc6s
        0x452cs
        -0x44f7s
        -0x69cs
        0x3f56s
        0x7dacs
        0x78b3s
        0x455fs
        0x332s
        -0x3ef8s
        -0x7018s
        0x4d91s
        0xbbds
        -0x379bs
        -0x69f2s
        0x542as
        0x1216s
        -0x2f2ds
        -0x612ds
        0x5c90s
        0x1963s
        -0x18aas
        -0x5aces
        0x633es
        0x21f8s
        -0x102as
        -0x527cs
        0x6a66s
        0x2841s
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/w;Ljava/lang/Object;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻛ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ﾒ(IIC)Ljava/lang/String;
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

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾒ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾇ:J

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
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    const/4 p1, 0x2

    .line 110
    rem-int p2, p1, p1

    const/4 p2, 0x0

    .line 99
    :try_start_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    iget-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻛ:Ljava/lang/Object;

    invoke-virtual {p4, p5, p3}, Lcom/ironsource/adqualitysdk/sdk/i/w;->ｋ(Ljava/lang/Object;Ljava/util/List;)V

    .line 101
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    .line 102
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    iget-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻛ:Ljava/lang/Object;

    invoke-virtual {p4, p5}, Lcom/ironsource/adqualitysdk/sdk/i/w;->ﻛ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p4, :cond_0

    .line 110
    sget p5, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻐ:I

    add-int/lit8 p5, p5, 0x27

    rem-int/lit16 p6, p5, 0x80

    sput p6, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻏ:I

    rem-int/2addr p5, p1

    .line 103
    :try_start_1
    iget-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    invoke-static {p5}, Lcom/ironsource/adqualitysdk/sdk/i/w;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/w;)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    move-result-object p5

    invoke-static {p5}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﮐ(Lcom/ironsource/adqualitysdk/sdk/i/w$c;)Z

    move-result p5

    if-nez p5, :cond_0

    .line 104
    invoke-virtual {p4, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 106
    :cond_0
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    iget-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻛ:Ljava/lang/Object;

    invoke-static {p4, p5, p3}, Lcom/ironsource/adqualitysdk/sdk/i/w;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/w;Ljava/lang/Object;Ljava/util/List;)V

    .line 107
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/w;

    new-instance p5, Lorg/json/JSONObject;

    invoke-direct {p5}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    iget-object p6, p0, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻛ:Ljava/lang/Object;

    invoke-virtual {p4, p5, p3, p6}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ｋ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :cond_1
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻐ:I

    add-int/lit8 p2, p2, 0x17

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﻏ:I

    rem-int/2addr p2, p1

    return-void

    :catchall_0
    move-exception p1

    const-string p3, ""

    invoke-static {p3, p3, p2, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result p4

    invoke-static {p3, p2, p2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p3

    rsub-int/lit8 p3, p3, 0x13

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result p5

    shr-int/lit8 p5, p5, 0x10

    add-int/lit16 p5, p5, 0x24b8

    int-to-char p5, p5

    invoke-static {p4, p3, p5}, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾒ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result p4

    shr-int/lit8 p4, p4, 0x8

    add-int/lit8 p4, p4, 0x13

    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p5

    rsub-int/lit8 p5, p5, 0x17

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result p6

    shr-int/lit8 p6, p6, 0x8

    rsub-int p6, p6, 0x78f6

    int-to-char p6, p6

    invoke-static {p4, p5, p6}, Lcom/ironsource/adqualitysdk/sdk/i/w$3;->ﾒ(IIC)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method
