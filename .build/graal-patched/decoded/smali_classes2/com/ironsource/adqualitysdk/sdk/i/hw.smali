.class public final Lcom/ironsource/adqualitysdk/sdk/i/hw;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﱟ:I = 0x1

.field private static ﻐ:J

.field private static ｋ:I

.field private static ﾇ:[C

.field private static ﾒ:I


# instance fields
.field private ﻛ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ia$e;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ht;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x91

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ:[C

    const-wide v0, 0x44f9a7c65106c33L

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ:J

    const/16 v0, 0x77

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ:I

    return-void

    nop

    :array_0
    .array-data 2
        0x4fs
        0x6c51s
        -0x27f4s
        0x44fcs
        -0x4f51s
        0x1c8bs
        -0x768cs
        -0xaf4s
        0x61f6s
        -0x3251s
        0x399bs
        -0x59bds
        0x20s
        0x6c47s
        -0x27e1s
        0x44e9s
        -0x4f57s
        0x1cdfs
        -0x76acs
        -0xae9s
        0x61f7s
        -0x325as
        0x39des
        0x66s
        0x6c5cs
        -0x27eds
        0x44f7s
        -0x4f58s
        0x1cdfs
        -0x76acs
        -0xae9s
        0x61f7s
        -0x325as
        0x39des
        -0x59bfs
        0x1205s
        0x7ee3s
        -0x155es
        0x56dds
        -0x3ca7s
        0x2f0ds
        -0x644as
        -0x1c9ds
        -0x70b2s
        0x3as
        0x6c13s
        -0x27eas
        0x44f8s
        -0x4f48s
        0x1c97s
        -0x76ees
        -0xaf8s
        0x61f1s
        -0x3248s
        0x398ds
        0x66s
        0x6c5cs
        -0x27eds
        0x44f7s
        -0x4f58s
        0x1cdfs
        -0x76a5s
        -0xaf5s
        0x61b8s
        -0x4776s
        -0x2b59s
        0x60ads
        -0x3a2s
        -0x67f2s
        -0xbc4s
        0x4072s
        -0x2327s
        0x28cas
        -0x7b10s
        0x1127s
        0x6d6bs
        -0x664s
        0x558bs
        -0x5e09s
        0x3e3fs
        -0x75dcs
        0x45s
        0x6c4bs
        -0x27eas
        0x44fcs
        -0x4f51s
        0x1c8bs
        -0x76a9s
        -0xaffs
        0x61b8s
        -0x3278s
        0x3991s
        -0x59a3s
        0x1208s
        0x7ef2s
        -0x1557s
        0x5689s
        -0x3ca7s
        0x2f0cs
        -0x6408s
        0x7e9s
        0x7393s
        -0x1fa3s
        0x4c42s
        -0x4728s
        0x24a9s
        -0x6f75s
        -0x2fes
        0x6941s
        -0x2a1as
        0x41a2s
        -0x5267s
        0x1a48s
        -0x79f7s
        -0xd1bs
        0x5ea3s
        -0x3563s
        0x370cs
        -0x2f1es
        -0x431as
        0x8b3s
        -0x6bafs
        0x6019s
        -0x3388s
        0x59f2s
        0x25a7s
        -0x4eb5s
        0x1d18s
        -0x16d0s
        0x76f8s
        -0x3d5cs
        -0x51f0s
        0x3a22s
        -0x79c8s
        0x13fds
        -0x5fs
        0x4b52s
        -0x28e6s
        -0x5ce3s
        0x30e1s
        -0x6360s
        0x685es
        -0xbf5s
        0x3as
        0x6c13s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 4

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v0

    shr-int/lit8 v0, v0, 0x8

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit8 v1, v1, 0xc

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    add-int/lit8 v2, v2, -0x1

    int-to-char v2, v2

    invoke-static {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ:Ljava/util/Map;

    return-void
.end method

.method private ﻐ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ht;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ht;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 112
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x69

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 106
    :try_start_0
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﻛ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 107
    invoke-static {p1, v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1

    const/4 v3, 0x1

    .line 108
    invoke-direct {p0, p1, p2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/ht;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p2, p2, 0x77

    rem-int/lit16 v2, p2, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p2, v0

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    throw v1

    :catch_0
    move-exception p1

    .line 110
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result p2

    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    add-int/lit8 v0, v0, 0xc

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    add-int/lit8 v3, v3, -0x1

    int-to-char v3, v3

    invoke-static {p2, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    rsub-int/lit8 v0, v0, 0x19

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit16 v3, v3, 0xd6

    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v4

    add-int/lit8 v4, v4, 0x23

    const-string v5, "\n\u000f\u0008\uffc1\ufff0\u0003\u000b\u0006\u0004\u0015\uffe7\n\u0006\r\u0005\uffc1\u0007\u0013\u0010\u000e\uffc1\u0011\u0002\u0015\t\uffe6\u0013\u0013\u0010\u0013\uffc1\u0008\u0006\u0015\u0015"

    invoke-static {v5, v0, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method private static ﻐ(Ljava/lang/Object;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 321
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v2, v1, 0x7d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    const/4 v2, 0x0

    if-eqz p0, :cond_4

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    .line 313
    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    .line 314
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hz;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hz;-><init>(Ljava/util/Collection;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)V

    return-object v0

    .line 315
    :cond_0
    instance-of v1, p0, Ljava/util/Map;

    if-eqz v1, :cond_2

    .line 316
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/hz;

    check-cast p0, Ljava/util/Map;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hz;-><init>(Ljava/util/Map;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)V

    .line 321
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0x1f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_1

    const/16 p0, 0x41

    div-int/lit8 p0, p0, 0x0

    :cond_1
    return-object v1

    .line 317
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 318
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/hz;

    new-instance v3, Ljava/util/ArrayList;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v1, v3, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hz;-><init>(Ljava/util/Collection;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)V

    .line 321
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0x6f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_3

    return-object v1

    :cond_3
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :cond_4
    return-object v2
.end method

.method private static ﻐ(Ljava/lang/Object;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 155
    rem-int v1, v0, v0

    .line 147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    .line 145
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 148
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 147
    const-class v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 155
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v2, v2, 0x11

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    .line 148
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x30

    div-int/lit8 v3, v3, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 150
    :cond_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 148
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v3, v3, 0x37

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v3, v0

    .line 153
    :goto_1
    invoke-static {v1, p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p2

    move-object p0, v2

    goto :goto_0

    .line 148
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Field;

    .line 147
    const-class p1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0

    :cond_3
    return-object p2
.end method

.method private static ﻐ(IIC)Ljava/lang/String;
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

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ:J

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

.method public static ﻐ(Ljava/lang/Class;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hp;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 59
    rem-int v1, v0, v0

    .line 50
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/hm;

    move-result-object v2

    invoke-virtual {v2, p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hm;->ｋ(Ljava/lang/Class;Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/util/List;

    move-result-object v2

    .line 53
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v3, v0

    if-eqz v3, :cond_0

    const/4 v3, 0x5

    div-int/2addr v3, v0

    .line 53
    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    .line 59
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v3, v3, 0x15

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v3, v0

    if-eqz v3, :cond_1

    .line 53
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    .line 54
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v3, v3, 0x6f

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v3, v0

    goto :goto_0

    :cond_1
    :try_start_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    return-object v1

    .line 57
    :catchall_0
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result p1

    int-to-byte p1, p1

    const/4 v0, 0x1

    add-int/2addr p1, v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int/lit8 v2, v2, 0xc

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v5

    add-int/2addr v5, v0

    int-to-char v5, v5

    invoke-static {p1, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v5

    shr-int/lit8 v5, v5, 0x18

    add-int/lit8 v5, v5, 0xc

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static {v6, v7}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v8

    add-int/lit16 v8, v8, 0xd6

    invoke-static {v7, v7, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v9

    rsub-int/lit8 v9, v9, 0xe

    const-string v10, "\u000f\n\u0015\u0015\u0006\u0008\uffc1\u0013\u0010\u0013\u0013\uffe6\uffc1\u0008"

    invoke-static {v10, v5, v8, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v2

    int-to-byte v2, v2

    rsub-int/lit8 v2, v2, 0xb

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v5

    rsub-int/lit8 v5, v5, 0xb

    const/16 v8, 0x30

    invoke-static {v6, v8, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v6

    rsub-int/lit8 v6, v6, -0x1

    int-to-char v6, v6

    invoke-static {v2, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v5

    cmp-long p2, v5, v3

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v2

    add-int/lit16 v2, v2, 0xd5

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x6

    const-string v4, "\uffc2\u0015\u0015\u0003\u000e\u0005"

    invoke-static {v4, p2, v2, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static ﻐ(Ljava/lang/Object;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x2

    .line 285
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ(Ljava/lang/Object;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, v0, v0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ(Ljava/lang/Object;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 9

    const/4 v0, 0x2

    .line 380
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    const/16 v2, 0x30

    const-string v3, ""

    const/4 v4, 0x0

    if-nez v1, :cond_0

    const/16 v1, 0x21

    .line 377
    div-int/2addr v1, v4

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 378
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v1

    rsub-int/lit8 v1, v1, 0xc

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    int-to-char v5, v5

    invoke-static {v0, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v4, v4}, Landroid/view/View;->resolveSize(II)I

    move-result v1

    rsub-int v1, v1, 0x8f

    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v1, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    rsub-int/lit8 p2, p2, 0x6

    const v1, 0x10000c8

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    add-int/2addr v5, v1

    invoke-static {v3, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    add-int/lit8 v1, v1, 0x9

    const-string v2, "%\u0010\u001b$\u0014\uffcf\uffdb\uffcf"

    invoke-static {v2, p2, v5, v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-interface {p0}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﻐ()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﱡ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 380
    :cond_1
    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p0

    rsub-int/lit8 p0, p0, -0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    add-int/lit8 v1, v1, 0xb

    invoke-static {v3, v2, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    rsub-int/lit8 v2, v2, -0x1

    int-to-char v2, v2

    invoke-static {p0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    move-result v1

    add-int/lit16 v1, v1, 0x8f

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x1

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-char v3, v3

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﱡ(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0x7d

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_2

    const/16 p0, 0x55

    div-int/2addr p0, v4

    :cond_2
    return-void
.end method

.method private static ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
    .locals 3

    const/4 v0, 0x2

    .line 262
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x5

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    .line 260
    :try_start_0
    invoke-interface {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hx;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p1, p1, 0x7b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method private static ﻛ(Ljava/lang/Object;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    .line 270
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    if-eqz p0, :cond_0

    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/kc;->ｋ(Ljava/lang/Class;Ljava/util/List;)Z

    move-result p0

    .line 270
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p1, v0

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x5

    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    const/4 p0, 0x0

    return p0
.end method

.method private ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/ht;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ht;",
            "I)",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 137
    rem-int v1, v0, v0

    .line 116
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﻛ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p3, v1, :cond_4

    .line 137
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 117
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﻛ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 118
    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﻐ()Ljava/lang/Object;

    move-result-object v3

    .line 119
    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_0

    .line 121
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result p1

    shr-int/lit8 p1, p1, 0x10

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result p2

    shr-int/lit8 p2, p2, 0x10

    rsub-int/lit8 p2, p2, 0xc

    const/16 p3, 0x30

    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {v0, p3, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    int-to-char p3, p3

    invoke-static {p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p3

    rsub-int/lit8 p3, p3, 0x50

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int/lit8 v1, v1, 0x25

    invoke-static {v0}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v0

    rsub-int/lit8 v0, v0, -0x1

    int-to-char v0, v0

    invoke-static {p3, v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 124
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :catch_0
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 126
    :try_start_0
    invoke-static {v3, v5, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v6

    .line 127
    invoke-static {v5, v1, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_1

    .line 120
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v6, v6, 0x6b

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v6, v0

    add-int/lit8 v6, p3, 0x1

    .line 129
    :try_start_1
    invoke-direct {p0, v5, p2, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/ht;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p2, p2, 0x2f

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p2, v0

    return-object p1

    :cond_2
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p1, p1, 0x79

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p1, v0

    return-object v2

    .line 117
    :cond_3
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﻛ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 118
    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﻐ()Ljava/lang/Object;

    move-result-object p1

    .line 119
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;)Ljava/util/List;

    .line 120
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :cond_4
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p2, p2, 0xf

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p2, v0

    return-object p1
.end method

.method private ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/hy;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 7

    const/4 v0, 0x2

    .line 236
    rem-int v1, v0, v0

    .line 199
    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﻐ()Ljava/lang/Object;

    move-result-object v1

    .line 200
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_c

    .line 236
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v2, v2, 0x13

    rem-int/lit16 v5, v2, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_b

    .line 201
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﺙ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eq v2, v3, :cond_c

    .line 204
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ｋ(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 215
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v5, v2, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    .line 205
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/hx;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 220
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p3, p3, 0xb

    rem-int/lit16 v2, p3, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p3, v0

    if-nez p3, :cond_1

    .line 206
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 207
    invoke-virtual {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)V

    .line 208
    invoke-virtual {p2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ｋ(Ljava/lang/Object;)V

    :cond_0
    return-object p1

    .line 206
    :cond_1
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ()Z

    invoke-super {v4}, Ljava/lang/Object;->hashCode()I

    throw v4

    .line 211
    :cond_2
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 212
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 213
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v5

    invoke-virtual {v5, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻐ(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 220
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v5, v5, 0x53

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v5, v0

    .line 214
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻛ()Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Ljava/lang/Object;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 206
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v4, v1, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_3

    .line 215
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    div-int/lit8 p3, p3, 0x0

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    add-int/2addr p3, v3

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1

    return-object p1

    .line 216
    :cond_4
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻛ()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Ljava/lang/Object;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/2addr p3, v3

    .line 217
    invoke-direct {p0, v1, p2, p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1

    return-object p1

    .line 219
    :cond_5
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﾇ()Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v1, :cond_7

    .line 201
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v2, v2, 0x69

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_6

    .line 220
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-super {v4}, Ljava/lang/Object;->hashCode()I

    throw v4

    .line 222
    :cond_7
    :goto_0
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v2

    invoke-static {v1, v2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ia;I)Ljava/util/List;

    move-result-object v2

    .line 223
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ht;

    move-result-object v3

    if-eqz v2, :cond_a

    .line 225
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    return-object v4

    .line 206
    :cond_8
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v4, v4, 0x4b

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v4, v0

    .line 225
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 226
    invoke-static {v1, v4, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v4

    .line 227
    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﾇ()V

    .line 228
    invoke-direct {p0, v4, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/hy;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 229
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ()Z

    move-result v5

    if-nez v5, :cond_9

    return-object v4

    .line 232
    :cond_9
    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﾒ()V

    goto :goto_1

    :cond_a
    return-object v4

    .line 201
    :cond_b
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﺙ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    throw v4

    :cond_c
    return-object v4
.end method

.method private ｋ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x2

    .line 362
    rem-int v1, v0, v0

    :goto_0
    if-eqz p2, :cond_3

    .line 354
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    .line 345
    const-class v1, Ljava/lang/Object;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 354
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    .line 346
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 347
    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    const/4 v6, 0x1

    .line 348
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 350
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 352
    invoke-static {p3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 353
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_1

    .line 362
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v6, v6, 0x3

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v6, v0

    if-eqz v6, :cond_0

    const/16 v6, 0x22

    .line 354
    :try_start_1
    div-int/2addr v6, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 362
    throw p1

    :cond_0
    :goto_2
    return-object v5

    :catch_0
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 354
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v5, v5, 0x2b

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v5, v0

    goto :goto_1

    .line 360
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p2

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private static ｋ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ia;I)Ljava/util/List;
    .locals 3

    const/4 v0, 0x2

    .line 289
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0xb

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﱟ(I)Z

    move-result v1

    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻛ(I)Z

    move-result v2

    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﾒ(I)Z

    move-result p1

    invoke-static {p0, v1, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ(Ljava/lang/Object;ZZZ)Ljava/util/List;

    move-result-object p0

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p1, p1, 0x3f

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method private ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hy<",
            "TT;>;I",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 194
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    .line 162
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ｋ()I

    move-result v1

    const/4 v2, 0x0

    if-eq p3, v1, :cond_4

    if-eqz p1, :cond_4

    .line 164
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 194
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    if-lez p3, :cond_0

    .line 164
    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 169
    :cond_0
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 173
    :try_start_0
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hn;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 174
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hn;

    move-result-object v3

    invoke-interface {v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hn;->ﻐ(Ljava/lang/Object;)[Ljava/lang/reflect/Field;

    move-result-object v3

    goto :goto_0

    .line 176
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object v4

    invoke-virtual {v4, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﾇ(I)I

    move-result v4

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ(Ljava/lang/Class;I)[Ljava/lang/reflect/Field;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v4, v4, 0x47

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v4, v0

    .line 178
    :goto_0
    :try_start_1
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ht;

    move-result-object v4

    .line 181
    array-length v5, v3

    move v6, v1

    :goto_1
    if-ge v6, v5, :cond_4

    aget-object v7, v3, v6

    const/4 v8, 0x1

    .line 182
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 183
    invoke-virtual {v4, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ﻐ(Ljava/lang/reflect/Field;)V

    .line 184
    invoke-static {v7, p1, p4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v8

    .line 185
    invoke-direct {p0, v8, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/hy;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v8, :cond_3

    .line 194
    sget v9, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v9, v9, 0x4f

    rem-int/lit16 v10, v9, 0x80

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v9, v0

    if-eqz v9, :cond_2

    :try_start_2
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ()Z

    move-result v9

    const/16 v10, 0xe

    div-int/2addr v10, v1

    if-nez v9, :cond_3

    return-object v8

    .line 186
    :cond_2
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ()Z

    move-result v9

    if-nez v9, :cond_3

    return-object v8

    .line 189
    :cond_3
    invoke-virtual {v4, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ht;->ｋ(Ljava/lang/reflect/Field;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 192
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result p2

    shr-int/lit8 p2, p2, 0x10

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result p3

    shr-int/lit8 p3, p3, 0x10

    rsub-int/lit8 p3, p3, 0xc

    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p4

    int-to-char p4, p4

    invoke-static {p2, p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result p3

    shr-int/lit8 p3, p3, 0x10

    add-int/lit8 p3, p3, 0x76

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result p4

    add-int/lit8 p4, p4, 0x19

    const-string v0, ""

    const/16 v3, 0x30

    invoke-static {v0, v3, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    const v1, 0xd0a8

    add-int/2addr v0, v1

    int-to-char v0, v0

    invoke-static {p3, p4, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v2
.end method

.method private static ﾇ(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 308
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/hz;

    invoke-direct {v1, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hz;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hr;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p0, p0, 0x4b

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p0, v0

    return-object v1
.end method

.method public static ﾇ(Ljava/lang/Class;Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hp;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hp;",
            "TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 42
    rem-int v1, v0, v0

    .line 36
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 34
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/hm;

    move-result-object v1

    invoke-virtual {v1, p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hm;->ﾇ(Ljava/lang/Class;Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/16 v4, 0x41

    .line 35
    div-int/2addr v4, v3

    if-eqz v1, :cond_2

    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/hm;

    move-result-object v1

    invoke-virtual {v1, p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hm;->ﾇ(Ljava/lang/Class;Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 42
    :goto_0
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p3, p3, 0x5d

    rem-int/lit16 v4, p3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p3, v0

    if-eqz p3, :cond_1

    .line 36
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/16 p3, 0x36

    div-int/2addr p3, v3

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    .line 42
    :cond_2
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0xd

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_3

    return-object p3

    :cond_3
    throw v2

    .line 40
    :catchall_0
    const-string p1, ""

    invoke-static {p1, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p3

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v0

    rsub-int/lit8 v0, v0, 0xc

    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    move-result v1

    int-to-char v1, v1

    invoke-static {p3, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    add-int/lit16 v3, v3, 0xd6

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0xe

    const-string v5, "\u000f\n\u0015\u0015\u0006\u0008\uffc1\u0013\u0010\u0013\u0013\uffe6\uffc1\u0008"

    const/4 v6, 0x1

    invoke-static {v5, v1, v3, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    rsub-int/lit8 v0, v0, 0xc

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int/lit8 v1, v1, 0xb

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    int-to-char v3, v3

    invoke-static {v0, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result p2

    shr-int/lit8 p2, p2, 0x10

    add-int/2addr p2, v6

    invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result p1

    rsub-int p1, p1, 0xd5

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    rsub-int/lit8 v0, v0, 0x6

    const-string v1, "\uffc2\u0015\u0015\u0003\u000e\u0005"

    invoke-static {v1, p2, p1, v6, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private static ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;
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

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ:I

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

.method private static ﾇ(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 8

    const/4 v0, 0x2

    .line 373
    rem-int v1, v0, v0

    .line 366
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 367
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p0

    .line 368
    array-length v2, p0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, p0, v4

    .line 369
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_0

    goto :goto_1

    .line 373
    :cond_0
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v6, v6, 0x17

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v6, v0

    .line 370
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v5, v5, 0x5

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v5, v0

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array p0, v3, [Ljava/lang/reflect/Field;

    invoke-interface {v1, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/reflect/Field;

    return-object p0
.end method

.method private static ﾒ(Ljava/lang/Object;ZZZ)Ljava/util/List;
    .locals 3

    const/4 v0, 0x2

    .line 304
    rem-int v1, v0, v0

    if-eqz p0, :cond_5

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    .line 295
    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 296
    new-instance p1, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1

    .line 297
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    goto :goto_1

    .line 304
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p1, p1, 0x35

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_2

    const/16 p1, 0x45

    div-int/lit8 p1, p1, 0x0

    if-eqz p3, :cond_3

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    .line 298
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 304
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 p2, p0, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    return-object p1

    .line 299
    :cond_3
    :goto_1
    instance-of p1, p0, Ljava/util/Map;

    if-eqz p1, :cond_5

    .line 304
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 p3, p1, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_4

    const/16 p1, 0x63

    div-int/lit8 p1, p1, 0x0

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_4
    if-eqz p2, :cond_5

    .line 300
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 301
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p1

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method private static ﾒ(Ljava/lang/Class;I)[Ljava/lang/reflect/Field;
    .locals 5

    const/4 v0, 0x2

    .line 281
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x65

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v1, v0

    .line 274
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-eqz p0, :cond_1

    if-eq v2, p1, :cond_1

    .line 276
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 275
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v3, v3, 0x27

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v3, v0

    .line 278
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/kc;->ｋ([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;

    move-result-object v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 275
    :cond_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p0, p0, 0x73

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_2

    return-object v1

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final ﻐ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 325
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p2, p2, 0x35

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p2, v0

    return-object p1
.end method

.method public final ﻛ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 329
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 v1, v1, 0x73

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, p1, v1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x39

    div-int/lit8 p2, p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, p1, v1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p2, p2, 0xd

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p2, v0

    if-nez p2, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public final ﻛ(Ljava/lang/Object;Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    .line 341
    rem-int v1, v0, v0

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    .line 334
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 335
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 341
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v2, v2, 0x23

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v2, v0

    goto :goto_0

    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p1, v0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ｋ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ia;)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ia;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x2

    .line 93
    rem-int v4, v3, v3

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v4, v4, 0x2b

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr v4, v3

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﻐ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/ia$e;

    move-result-object v6

    .line 75
    iget-object v7, v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ironsource/adqualitysdk/sdk/i/ht;

    const-wide/16 v8, 0x0

    const-wide/16 v10, -0x1

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v7, :cond_1

    .line 77
    invoke-direct {v0, v1, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ht;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 78
    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/hx;

    move-result-object v15

    invoke-static {v15, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z

    move-result v15

    if-eqz v15, :cond_0

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x17

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    add-int/lit8 v6, v6, 0x13

    invoke-static {v14, v14}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v10

    int-to-char v10, v10

    invoke-static {v3, v6, v10}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v4

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v14}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v3

    cmpl-float v3, v3, v13

    add-int/lit8 v3, v3, 0x2a

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v4

    cmp-long v4, v4, v8

    add-int/2addr v4, v12

    const v5, 0xe30f

    invoke-static {v14}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v6

    add-int/2addr v6, v5

    int-to-char v5, v6

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v7

    .line 82
    :cond_0
    invoke-static {v14}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v15

    cmp-long v15, v15, v10

    add-int/lit8 v15, v15, 0xb

    invoke-static {v14}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v16

    add-int/lit8 v16, v16, 0x14

    move/from16 v17, v3

    shr-int/lit8 v3, v16, 0x6

    int-to-char v3, v3

    invoke-static {v7, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v14, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    add-int/lit8 v15, v15, 0x2c

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v16

    shr-int/lit8 v16, v16, 0x10

    move-wide/from16 v18, v8

    add-int/lit8 v8, v16, 0xb

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v20

    cmp-long v9, v20, v10

    rsub-int/lit8 v9, v9, 0x1

    int-to-char v9, v9

    invoke-static {v15, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v3, v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ:Ljava/util/Map;

    invoke-interface {v3, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move/from16 v17, v3

    move-wide/from16 v18, v8

    .line 85
    :goto_0
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/hy;

    invoke-direct {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ia;)V

    const/4 v2, 0x0

    .line 86
    invoke-direct {v0, v1, v3, v14, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object v7

    .line 87
    const-string v8, "\u0012\r\uffc4\u0017\u0018\u0007\t\u000e\u0006\u0013\uffc4\u0018\t\u0017\uffc4"

    const/16 v9, 0x30

    const-string v15, ""

    if-eqz v7, :cond_3

    .line 88
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v15, v14, v14}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v16

    move-wide/from16 v20, v10

    add-int/lit8 v10, v16, 0x37

    const v11, 0x1000009

    invoke-static {v14, v14, v14}, Landroid/graphics/Color;->rgb(III)I

    move-result v14

    add-int/2addr v14, v11

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    int-to-char v11, v11

    invoke-static {v10, v14, v11}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sub-long/2addr v13, v4

    invoke-virtual {v10, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v15}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x41

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    add-int/lit8 v10, v10, 0x4

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v13

    cmp-long v11, v13, v20

    const v13, 0xb8e8

    sub-int/2addr v13, v11

    int-to-char v11, v13

    invoke-static {v5, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0xb

    invoke-static {v15, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v9

    add-int/lit16 v9, v9, 0xd4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, 0xf

    invoke-static {v8, v5, v9, v12, v10}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v1, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ht;

    move-result-object v3

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    return-object v7

    :cond_2
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    .line 92
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    cmp-long v7, v10, v18

    rsub-int/lit8 v7, v7, 0x45

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v10

    cmpl-float v10, v10, v13

    add-int/lit8 v10, v10, 0xd

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v11

    cmpl-float v11, v11, v13

    const v16, 0x9860

    sub-int v11, v16, v11

    int-to-char v11, v11

    invoke-static {v7, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v4

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x40

    invoke-static {v15, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v6

    add-int/lit8 v6, v6, 0x5

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    const v10, 0xb8e7

    sub-int/2addr v10, v7

    int-to-char v7, v10

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v14, v14, v14, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    rsub-int/lit8 v4, v4, 0xb

    invoke-static {v14, v13, v13}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v5

    cmpl-float v5, v5, v13

    rsub-int v5, v5, 0xd3

    invoke-static {v9}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v6

    rsub-int/lit8 v6, v6, 0x3f

    invoke-static {v8, v4, v5, v12, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_4

    return-object v2

    :cond_4
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
.end method

.method public final ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hx;Lcom/ironsource/adqualitysdk/sdk/i/hn;Ljava/util/List;I)Lcom/ironsource/adqualitysdk/sdk/i/hr;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hx;",
            "Lcom/ironsource/adqualitysdk/sdk/i/hn;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 68
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    invoke-direct {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ｋ(Z)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    move-result-object v1

    invoke-virtual {v1, p2, p3, p4, p5}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Lcom/ironsource/adqualitysdk/sdk/i/hn;Ljava/util/List;I)Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ｋ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ia;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    move-result-object p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p2, p2, 0x5b

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p2, v0

    return-object p1
.end method

.method public final ﾇ(Ljava/lang/Object;Ljava/util/List;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 255
    rem-int v1, v0, v0

    .line 240
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/hw$2;

    invoke-direct {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hw$2;-><init>()V

    .line 246
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;-><init>()V

    const/4 v3, 0x1

    .line 247
    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﾒ(Z)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    move-result-object v2

    .line 248
    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﻐ(Z)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    move-result-object v2

    .line 249
    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﾇ(Z)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    move-result-object v2

    const/4 v3, -0x1

    .line 250
    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    move-result-object v2

    .line 251
    invoke-virtual {v2, v1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Ljava/util/List;I)Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object p2

    .line 252
    new-instance p3, Lcom/ironsource/adqualitysdk/sdk/i/hy;

    invoke-direct {p3, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ia;)V

    .line 253
    invoke-virtual {p3}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hy;

    const/4 p2, 0x0

    const/4 v1, 0x0

    .line 254
    invoke-direct {p0, p1, p3, p2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    .line 255
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p3}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﺙ()Ljava/util/Set;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    add-int/lit8 p2, p2, 0x45

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    rem-int/2addr p2, v0

    return-object p1
.end method

.method public final ﾒ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/ia;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ia;",
            ")",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 101
    rem-int v1, v0, v0

    .line 98
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/hy;

    invoke-direct {v1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ia;)V

    .line 99
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hy;

    const/4 p2, 0x0

    const/4 v2, 0x0

    .line 100
    invoke-direct {p0, p1, v1, v2, p2}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾇ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/hy;ILcom/ironsource/adqualitysdk/sdk/i/hr;)Lcom/ironsource/adqualitysdk/sdk/i/hr;

    .line 101
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﱟ()Ljava/util/Set;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﱟ:I

    add-int/lit8 p2, p2, 0x19

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﾒ:I

    rem-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/16 p2, 0x5d

    div-int/2addr p2, v2

    :cond_0
    return-object p1
.end method
