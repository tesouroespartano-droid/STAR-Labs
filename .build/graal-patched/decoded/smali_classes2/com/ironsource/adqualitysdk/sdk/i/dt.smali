.class public final Lcom/ironsource/adqualitysdk/sdk/i/dt;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/dt$a;
    }
.end annotation


# static fields
.field private static ﮐ:J = 0x0L

.field private static ﱟ:[C = null

.field private static ﱡ:I = 0x1

.field private static ﻏ:I

.field private static ﻐ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            ">;"
        }
    .end annotation
.end field

.field private static ｋ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private ﻛ:Ljava/lang/String;

.field private ﾇ:I

.field private ﾒ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ()V

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ:Ljava/util/Map;

    .line 154
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ:Ljava/util/Map;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v0, v0, 0x41

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 175
    iput v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 180
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ:Ljava/lang/String;

    .line 181
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    return-void
.end method

.method private ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;"
        }
    .end annotation

    const-string v0, ""

    const/4 v1, 0x2

    .line 638
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v2, :cond_0

    .line 631
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v5, 0xa

    :try_start_1
    div-int/2addr v5, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 638
    throw p1

    :catch_0
    move-exception p1

    goto :goto_1

    .line 631
    :cond_0
    :try_start_2
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 632
    :goto_0
    iget v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    return-object p1

    .line 634
    :cond_1
    invoke-static {v0, v0, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result p1

    rsub-int p1, p1, 0x478

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v0

    shr-int/lit8 v0, v0, 0x18

    add-int/lit8 v0, v0, 0x18

    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x14

    shr-int/lit8 v2, v2, 0x6

    int-to-char v2, v2

    invoke-static {p1, v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 631
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x7b

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v1

    goto :goto_2

    .line 636
    :goto_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    rsub-int v0, v0, 0x490

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v2

    shr-int/lit8 v2, v2, 0x18

    rsub-int/lit8 v2, v2, 0x22

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    int-to-char v3, v3

    invoke-static {v0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 631
    :goto_2
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x17

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_2

    return-object v4

    :cond_2
    invoke-super {v4}, Ljava/lang/Object;->hashCode()I

    throw v4
.end method

.method private 丫(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    .line 626
    rem-int v1, v0, v0

    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v1, p1, :cond_0

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x55

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v0

    const/4 p1, 0x1

    return p1

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private 乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 649
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 643
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 644
    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/adqualitysdk/sdk/i/dy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 643
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 649
    throw p1

    .line 647
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    rsub-int v0, v0, 0x4b2

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v1

    cmpl-float v1, v1, v3

    rsub-int/lit8 v1, v1, 0x25

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    rsub-int/lit8 v3, v3, 0x1

    int-to-char v3, v3

    invoke-static {v0, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-object v2
.end method

.method private 爫(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x2

    .line 489
    rem-int v3, v2, v2

    const/16 v4, 0x30

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    .line 445
    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v8

    .line 446
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v10

    invoke-static {v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v9

    .line 447
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﭖ()Z

    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/16 v11, 0x28

    const/4 v13, 0x0

    const-string v14, ""

    const/4 v15, 0x1

    if-eqz v10, :cond_5

    .line 448
    :try_start_1
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v8

    .line 449
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v10

    .line 450
    invoke-virtual {v10}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/16 v16, 0x0

    :try_start_2
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    move-result v3

    if-eq v3, v11, :cond_1

    const/16 v11, 0x3d

    if-eq v3, v11, :cond_0

    move-wide/from16 v18, v5

    goto :goto_0

    :cond_0
    invoke-static {v7}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    rsub-int v3, v3, 0x316

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    cmp-long v11, v17, v5

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v17
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-wide/from16 v18, v5

    shr-int/lit8 v5, v17, 0x16

    int-to-char v5, v5

    :try_start_3
    invoke-static {v3, v11, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v3, :cond_2

    .line 463
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x43

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v2

    move v12, v7

    goto :goto_1

    :cond_1
    move-wide/from16 v18, v5

    .line 450
    :try_start_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x18

    rsub-int/lit8 v3, v3, 0x6e

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    cmpl-float v5, v5, v13

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v7, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    rsub-int v6, v6, 0x105b

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-eqz v3, :cond_2

    .line 459
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/2addr v3, v15

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v2

    move v12, v15

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v12, -0x1

    :goto_1
    if-eqz v12, :cond_4

    if-eq v12, v15, :cond_3

    .line 456
    :try_start_5
    iget v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr v0, v15

    iput v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 457
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-direct {v0, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/en;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 454
    :cond_3
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ea;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    rsub-int v3, v3, 0x97

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v5

    cmpl-float v5, v5, v13

    invoke-static {v14}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v6

    add-int/lit16 v6, v6, 0xe4b

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v8, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ea;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 452
    :cond_4
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/dz;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-direct {v3, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/en;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    check-cast v3, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-virtual/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    invoke-direct {v2, v3, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dz;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/en;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-wide/from16 v18, v5

    goto/16 :goto_5

    :cond_5
    move-wide/from16 v18, v5

    const/16 v16, 0x0

    .line 458
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾇ()Z

    move-result v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-eqz v3, :cond_7

    .line 463
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v0, v0, 0x15

    rem-int/lit16 v3, v0, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v0, v2

    if-nez v0, :cond_6

    .line 459
    :try_start_6
    invoke-direct {v1, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    :cond_6
    invoke-direct {v1, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-super/range {v16 .. v16}, Ljava/lang/Object;->hashCode()I

    throw v16
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_0
    move-exception v0

    .line 463
    throw v0

    .line 460
    :cond_7
    :try_start_8
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﻏ()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 461
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/dw;

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dw;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 462
    :cond_8
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﮉ()Z

    move-result v3
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    if-eqz v3, :cond_a

    .line 489
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x13

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v2

    if-nez v3, :cond_9

    .line 463
    :try_start_9
    invoke-direct {v1, v8, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    const/16 v2, 0x46

    :try_start_a
    div-int/2addr v2, v7
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    return-object v0

    :catchall_1
    move-exception v0

    .line 489
    throw v0

    .line 463
    :cond_9
    :try_start_b
    invoke-direct {v1, v8, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 464
    :cond_a
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﱟ()Z

    move-result v3

    if-eqz v3, :cond_18

    .line 466
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v5

    const/16 v6, 0x21

    const/4 v10, 0x4

    const/4 v12, 0x3

    if-eq v5, v6, :cond_10

    if-eq v5, v11, :cond_f

    const/16 v6, 0x2d

    if-eq v5, v6, :cond_d

    const/16 v6, 0x5b

    if-eq v5, v6, :cond_c

    const/16 v6, 0x7b

    if-eq v5, v6, :cond_b

    goto/16 :goto_3

    :cond_b
    invoke-static {v7, v7}, Landroid/view/View;->resolveSize(II)I

    move-result v5

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v6

    shr-int/lit8 v6, v6, 0x16

    rsub-int/lit8 v6, v6, 0x1

    invoke-static {v14, v7, v7}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v11

    int-to-char v11, v11

    invoke-static {v5, v6, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_2
    move v3, v2

    goto/16 :goto_4

    :cond_c
    invoke-static {v14}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int v5, v5, 0x314

    invoke-static {v14}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v6

    neg-int v6, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v11

    shr-int/lit8 v11, v11, 0x8

    int-to-char v11, v11

    invoke-static {v5, v6, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v3, v15

    goto/16 :goto_4

    :cond_d
    invoke-static {v7, v7, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    const v6, -0xfffcf4

    sub-int/2addr v6, v5

    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v20

    cmp-long v5, v20, v18

    add-int/2addr v5, v15

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    const v20, 0xee26

    add-int v11, v11, v20

    int-to-char v11, v11

    invoke-static {v6, v5, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eq v3, v15, :cond_e

    goto :goto_3

    :cond_e
    move v3, v10

    goto :goto_4

    :cond_f
    invoke-static {v14, v4, v7, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v5

    add-int/lit8 v5, v5, 0x6f

    invoke-static {v7, v7, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    const v11, 0x1000001

    add-int/2addr v6, v11

    invoke-static {v7, v7, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v11

    add-int/lit16 v11, v11, 0x105b

    int-to-char v11, v11

    invoke-static {v5, v6, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    if-eqz v3, :cond_12

    .line 463
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v3, v3, 0x73

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v2

    move v3, v7

    goto :goto_4

    .line 466
    :cond_10
    :try_start_c
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v5

    shr-int/lit8 v5, v5, 0x8

    add-int/lit16 v5, v5, 0x317

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v20

    cmp-long v6, v20, v18

    invoke-static {v7}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v11

    cmpl-float v11, v11, v13

    const v20, 0x9183

    add-int v11, v11, v20

    int-to-char v11, v11

    invoke-static {v5, v6, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    if-eqz v3, :cond_12

    .line 459
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v2

    if-eqz v3, :cond_11

    goto/16 :goto_2

    :cond_11
    move v3, v12

    goto :goto_4

    :cond_12
    :goto_3
    const/4 v3, -0x1

    :goto_4
    if-eqz v3, :cond_17

    if-eq v3, v15, :cond_16

    if-eq v3, v2, :cond_15

    if-eq v3, v12, :cond_14

    if-eq v3, v10, :cond_13

    .line 480
    :try_start_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit16 v2, v2, 0x32c

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x14

    invoke-static {v7, v7, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    const v6, -0xffc94c

    sub-int/2addr v6, v5

    int-to-char v5, v6

    invoke-static {v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/lang/String;)V

    return-object v16

    .line 478
    :cond_13
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ew;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ff;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v5, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ff;-><init>(Ljava/lang/Integer;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->爫(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    invoke-direct {v2, v3, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ew;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 476
    :cond_14
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ez;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﬤ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    invoke-direct {v3, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ez;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    .line 459
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v3, v3, 0x79

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v2

    return-object v0

    .line 474
    :cond_15
    :try_start_e
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ec;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->סּ(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {v2, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ec;-><init>(Ljava/util/Map;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 472
    :cond_16
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/dv;

    invoke-static {v14, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    add-int/lit16 v3, v3, 0x32b

    invoke-static {v14, v7}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v5

    sub-int/2addr v15, v5

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    cmpl-float v5, v5, v13

    int-to-char v5, v5

    invoke-static {v3, v15, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dv;-><init>(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v0

    return-object v0

    .line 468
    :cond_17
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/eg;

    invoke-virtual/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct {v2, v3, v9}, Lcom/ironsource/adqualitysdk/sdk/i/eg;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 469
    invoke-static {v14, v4, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    add-int/lit16 v3, v3, 0x98

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v5

    sub-int/2addr v15, v5

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v5

    add-int/lit16 v5, v5, 0xe4b

    int-to-char v5, v5

    invoke-static {v3, v15, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v5

    shr-int/lit8 v5, v5, 0x16

    rsub-int v5, v5, 0x318

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v6, v8, v10

    rsub-int/lit8 v6, v6, 0x14

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    int-to-char v8, v8

    invoke-static {v5, v6, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v0, v3, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 484
    :cond_18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v14}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v2

    rsub-int v2, v2, 0x340

    invoke-static {v14}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x12

    invoke-static {v14, v4, v7, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v5

    add-int/2addr v5, v15

    int-to-char v5, v5

    invoke-static {v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    move-wide/from16 v18, v5

    const/16 v16, 0x0

    .line 487
    :goto_5
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v2

    add-int/lit16 v2, v2, 0x321

    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x10

    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v4

    cmp-long v4, v4, v18

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    return-object v16
.end method

.method private ﬤ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 440
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 426
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->爫(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    const/16 v3, 0x4e

    div-int/2addr v3, v2

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->爫(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 427
    :goto_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    .line 428
    :cond_1
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v4

    const/16 v5, 0x2e

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_3

    const/16 v5, 0x5b

    if-eq v4, v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, ""

    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v4

    add-int/lit16 v4, v4, 0x315

    invoke-static {v6, v6}, Landroid/graphics/PointF;->length(FF)F

    move-result v5

    cmpl-float v5, v5, v6

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 426
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v4, v3, 0x15

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v4, v0

    add-int/lit8 v3, v3, 0x31

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v0

    move v3, v7

    goto :goto_2

    .line 428
    :cond_3
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v4

    cmpl-float v4, v4, v6

    rsub-int v4, v4, 0x314

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    :goto_1
    const/4 v3, -0x1

    goto :goto_2

    .line 426
    :cond_5
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v3, v3, 0x19

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v0

    move v3, v2

    :goto_2
    if-eqz v3, :cond_7

    if-eq v3, v7, :cond_6

    .line 436
    iget p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr p1, v7

    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    return-object v1

    .line 433
    :cond_6
    invoke-direct {p0, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    goto/16 :goto_0

    .line 430
    :cond_7
    invoke-direct {p0, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 426
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x65

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v0

    goto/16 :goto_0
.end method

.method private טּ(Ljava/util/List;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 576
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x45

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    .line 570
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v1

    .line 571
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﻐ()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 572
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int v4, v4, 0x417

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x18

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v6

    cmpl-float v6, v6, v3

    const v7, 0xa621

    add-int/2addr v6, v7

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {p0, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 574
    :cond_0
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v1

    .line 575
    const-string v2, ""

    const/4 v4, 0x0

    invoke-static {v2, v2, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v2

    rsub-int v2, v2, 0x42f

    invoke-static {v4, v4}, Landroid/view/View;->resolveSize(II)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v4

    int-to-char v4, v4

    invoke-static {v2, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    move-result v4

    cmpl-float v3, v4, v3

    rsub-int v3, v3, 0x430

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x30

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v5

    rsub-int v5, v5, 0x5ca2

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v2, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    new-instance v2, Landroid/util/Pair;

    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x71

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-object v2
.end method

.method private סּ(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 566
    rem-int v1, v0, v0

    .line 556
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 557
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    rsub-int v2, v2, 0x2fc

    const-string v3, ""

    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dt$3;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/dt$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dt;)V

    invoke-direct {p0, p1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dt$a;)Ljava/util/List;

    move-result-object p1

    .line 563
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 566
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x17

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    .line 563
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 566
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x45

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    .line 563
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    .line 564
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 566
    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 v2, p1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-object v1
.end method

.method private ףּ(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 580
    rem-int v1, v0, v0

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    rsub-int v2, v2, 0x306

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dt$2;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/dt$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dt;)V

    invoke-direct {p0, p1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dt$a;)Ljava/util/List;

    move-result-object p1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0xd

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    const/16 v0, 0x41

    div-int/2addr v0, v1

    :cond_0
    return-object p1
.end method

.method private ﭖ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x2

    .line 403
    rem-int v2, v1, v1

    .line 386
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭸ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 387
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 403
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x77

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v1

    const/4 v4, 0x3

    const/16 v5, 0x5a0

    const/16 v6, 0x560

    const/16 v7, 0x2d

    const/16 v8, 0x2b

    const-string v9, ""

    const/4 v10, 0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    if-nez v3, :cond_0

    .line 388
    iget-object v3, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﾇ()I

    move-result v13

    invoke-static {v3, v13}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v3

    .line 389
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v13

    invoke-virtual {v13}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v14

    const/16 v15, 0x1b

    div-int/2addr v15, v12

    if-eq v14, v8, :cond_4

    if-eq v14, v7, :cond_3

    if-eq v14, v6, :cond_2

    if-eq v14, v5, :cond_1

    goto/16 :goto_0

    .line 388
    :cond_0
    iget-object v3, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﾇ()I

    move-result v13

    invoke-static {v3, v13}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v3

    .line 389
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v13

    invoke-virtual {v13}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v14

    if-eq v14, v8, :cond_4

    if-eq v14, v7, :cond_3

    if-eq v14, v6, :cond_2

    if-eq v14, v5, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {v12, v12}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v5

    rsub-int v5, v5, 0x30f

    invoke-static {v9, v9, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v6

    add-int/2addr v6, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v7

    shr-int/lit8 v7, v7, 0x18

    rsub-int v7, v7, 0x3831

    int-to-char v7, v7

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move v11, v4

    goto/16 :goto_0

    :cond_2
    invoke-static {v12, v12}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    add-int/lit16 v5, v5, 0x30d

    invoke-static {v9, v12, v12}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    const v8, 0x9653

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move v11, v1

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    rsub-int v5, v5, 0x30d

    invoke-static {v9, v9, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v6

    add-int/2addr v6, v10

    const/16 v7, 0x30

    invoke-static {v9, v7, v12, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v7

    const v8, 0xee25

    sub-int/2addr v8, v7

    int-to-char v7, v8

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v6, v5, 0x57

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v6, v1

    add-int/lit8 v5, v5, 0x35

    .line 403
    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v5, v1

    move v11, v10

    goto :goto_0

    .line 389
    :cond_4
    invoke-static {v12, v12}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    rsub-int v5, v5, 0x30b

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x1

    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    int-to-char v7, v7

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eq v5, v10, :cond_5

    goto :goto_0

    :cond_5
    move v11, v12

    :cond_6
    :goto_0
    if-eqz v11, :cond_a

    if-eq v11, v10, :cond_9

    if-eq v11, v1, :cond_8

    if-eq v11, v4, :cond_7

    .line 399
    iget v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr v1, v10

    iput v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    return-object v2

    .line 397
    :cond_7
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/et;

    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-direct {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/et;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/en;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 395
    :cond_8
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ev;

    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-direct {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ev;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/en;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 393
    :cond_9
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ew;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭖ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v4

    invoke-direct {v1, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ew;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 391
    :cond_a
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fc;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭖ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v4

    invoke-direct {v1, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/fc;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    :cond_b
    return-object v2
.end method

.method private ﭴ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 329
    rem-int v1, v0, v0

    .line 328
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit8 v1, v1, 0x2b

    const-string v2, ""

    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    invoke-static {v4, v4}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    rsub-int v5, v5, 0x3cb6

    int-to-char v5, v5

    invoke-static {v1, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v4}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v3

    add-int/lit16 v3, v3, 0x2d6

    invoke-static {v2, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x26

    invoke-static {v4, v4}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v4

    add-int/lit16 v4, v4, 0x3edc

    int-to-char v4, v4

    invoke-static {v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/fk;

    invoke-direct {p1}, Lcom/ironsource/adqualitysdk/sdk/i/fk;-><init>()V

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    return-object p1
.end method

.method private ﭸ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 422
    rem-int v1, v0, v0

    .line 407
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﬤ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 408
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 422
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    const/16 v3, 0x2f

    add-int/2addr v2, v3

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    .line 409
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﾇ()I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v2

    .line 410
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v5

    const/16 v6, 0x25

    const-wide/16 v7, 0x0

    const/4 v9, 0x1

    if-eq v5, v6, :cond_3

    const/16 v6, 0x2a

    const/4 v10, 0x0

    if-eq v5, v6, :cond_1

    if-eq v5, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    add-int/lit16 v3, v3, 0x312

    const/4 v5, 0x0

    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v6

    cmpl-float v5, v6, v5

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v10, v10}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v6

    add-int/lit16 v6, v6, 0x7762

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_0
    move v10, v9

    goto :goto_2

    :cond_1
    invoke-static {v10}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v5

    cmp-long v3, v5, v7

    rsub-int v3, v3, 0x311

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v11

    cmp-long v6, v11, v7

    rsub-int v6, v6, 0x1204

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eq v3, v9, :cond_2

    goto :goto_1

    .line 422
    :cond_2
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_5

    goto :goto_0

    .line 410
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    add-int/lit16 v3, v3, 0x313

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v5

    cmp-long v5, v5, v7

    const-string v6, ""

    const/16 v7, 0x30

    invoke-static {v6, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v6

    add-int/2addr v6, v9

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v10, v0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v10, -0x1

    :cond_5
    :goto_2
    if-eqz v10, :cond_8

    if-eq v10, v9, :cond_7

    if-eq v10, v0, :cond_6

    .line 418
    iget p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr p1, v9

    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    return-object v1

    .line 416
    :cond_6
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ex;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭸ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ex;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 414
    :cond_7
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/er;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭸ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v3, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/er;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    .line 422
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p1

    .line 412
    :cond_8
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fd;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭸ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fd;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    :cond_9
    return-object v1
.end method

.method private ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x2

    .line 382
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x19

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 361
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭖ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 362
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v4

    const/16 v5, 0x25

    div-int/2addr v5, v3

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    .line 361
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭖ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 362
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 363
    :goto_0
    iget-object v4, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﾇ()I

    move-result v5

    invoke-static {v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v4

    .line 364
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v6

    const/16 v7, 0x3c

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, -0x1

    const/16 v13, 0x30

    const/4 v14, 0x3

    const-string v15, ""

    const-wide/16 v16, 0x0

    const/4 v8, 0x1

    if-eq v6, v7, :cond_7

    const/16 v7, 0x3e

    if-eq v6, v7, :cond_6

    const/16 v7, 0x43c

    if-eq v6, v7, :cond_5

    const/16 v7, 0x781

    if-eq v6, v7, :cond_4

    const/16 v7, 0x7a0

    if-eq v6, v7, :cond_3

    const/16 v7, 0x7bf

    if-eq v6, v7, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    add-int/lit16 v6, v6, 0x309

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x2

    invoke-static {v15, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v9

    rsub-int/lit8 v9, v9, -0x1

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move v12, v10

    goto/16 :goto_1

    :cond_3
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v6

    add-int/lit16 v6, v6, 0x301

    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v18

    cmp-long v7, v18, v16

    add-int/2addr v7, v14

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v15

    const-wide/16 v17, -0x1

    cmp-long v9, v15, v17

    add-int/2addr v9, v12

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move v12, v3

    goto/16 :goto_1

    :cond_4
    invoke-static {v15}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v6

    add-int/lit16 v6, v6, 0x307

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x2

    invoke-static {v15, v3}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v9

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move v12, v11

    goto/16 :goto_1

    :cond_5
    invoke-static {v15, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v6

    add-int/lit16 v6, v6, 0x304

    invoke-static {v15, v13, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v7

    add-int/2addr v7, v14

    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x14

    shr-int/lit8 v9, v9, 0x6

    add-int/lit16 v9, v9, 0x467e

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v8

    if-eq v5, v8, :cond_8

    .line 362
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v5, v5, 0x47

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v5, v1

    move v12, v8

    goto :goto_1

    .line 364
    :cond_6
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int v6, v6, 0x306

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x1

    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    move-result v9

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v8

    if-eq v5, v8, :cond_8

    move v12, v14

    goto :goto_1

    :cond_7
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v6

    cmp-long v6, v6, v16

    add-int/lit16 v6, v6, 0x305

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x1

    invoke-static {v15, v13, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v9

    rsub-int v9, v9, 0x94

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 362
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v5, v5, 0x71

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v5, v1

    move v12, v1

    :cond_8
    :goto_1
    if-eqz v12, :cond_f

    if-eq v12, v8, :cond_e

    if-eq v12, v1, :cond_d

    if-eq v12, v14, :cond_b

    if-eq v12, v11, :cond_a

    if-eq v12, v10, :cond_9

    .line 378
    iget v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr v1, v8

    iput v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    return-object v2

    .line 376
    :cond_9
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/es;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct {v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/es;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 374
    :cond_a
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/eu;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct {v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/eu;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 372
    :cond_b
    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ep;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v6

    invoke-direct {v5, v2, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ep;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 362
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v4, v4, 0x47

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v4, v1

    if-nez v4, :cond_c

    const/16 v1, 0x2c

    div-int/2addr v1, v3

    :cond_c
    return-object v2

    .line 370
    :cond_d
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ey;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct {v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ey;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 368
    :cond_e
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fa;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v3

    invoke-direct {v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/fa;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    return-object v1

    .line 366
    :cond_f
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/eq;

    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v5

    invoke-direct {v3, v2, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/eq;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 362
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x75

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v1

    if-eqz v3, :cond_10

    return-object v2

    :cond_10
    const/4 v1, 0x0

    throw v1

    :cond_11
    return-object v2
.end method

.method private ﮌ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fj;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 340
    rem-int v1, v0, v0

    .line 333
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 334
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    .line 335
    :goto_0
    const-string v3, ""

    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int v3, v3, 0x2fc

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x1

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 339
    iget p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 340
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/fj;

    invoke-direct {p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fj;-><init>(Ljava/util/List;)V

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    check-cast p1, Lcom/ironsource/adqualitysdk/sdk/i/fj;

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x2d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    .line 337
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    goto :goto_0
.end method

.method private ﮐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 324
    rem-int v1, v0, v0

    .line 323
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    add-int/lit8 v1, v1, 0x2b

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    rsub-int v4, v4, 0x3cb6

    int-to-char v4, v4

    invoke-static {v1, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const/16 v4, 0x30

    invoke-static {v2, v4, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v2

    add-int/lit16 v2, v2, 0x2b4

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x23

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v5

    shr-int/lit8 v5, v5, 0x8

    const v6, 0xf81d

    add-int/2addr v5, v6

    int-to-char v5, v5

    invoke-static {v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/fm;

    invoke-direct {p1}, Lcom/ironsource/adqualitysdk/sdk/i/fm;-><init>()V

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x21

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0x43

    div-int/2addr v0, v3

    :cond_0
    return-object p1
.end method

.method private ﱟ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 292
    rem-int v1, v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 282
    invoke-static {v1, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v3

    cmpl-float v3, v3, v2

    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    shr-int/lit8 v4, v4, 0x6

    add-int/lit8 v4, v4, 0x1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    rsub-int/lit8 v5, v5, 0x1

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {v4, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v5

    rsub-int v5, v5, 0x190

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x2c

    const v9, 0xbcc7

    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v10

    sub-int/2addr v9, v10

    int-to-char v9, v9

    invoke-static {v5, v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, p1, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮌ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;

    move-result-object v3

    .line 284
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    add-int/lit16 v5, v5, 0x1bc

    invoke-static {v1, v1}, Landroid/view/View;->resolveSize(II)I

    move-result v6

    add-int/lit8 v6, v6, 0x5

    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v9

    add-int/lit16 v9, v9, 0x4f97

    int-to-char v9, v9

    invoke-static {v5, v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v9

    cmp-long v6, v9, v7

    rsub-int v6, v6, 0x1c2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    cmp-long v9, v9, v7

    add-int/lit8 v9, v9, 0x34

    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v10

    int-to-char v10, v10

    invoke-static {v6, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, p1, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x30

    .line 285
    invoke-static {v4, v5, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v6

    add-int/lit8 v6, v6, 0x6f

    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v9

    rsub-int/lit8 v9, v9, 0x1

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v10

    rsub-int v10, v10, 0x105a

    int-to-char v10, v10

    invoke-static {v6, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v9

    cmpl-float v9, v9, v2

    add-int/lit16 v9, v9, 0x1f5

    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v10

    rsub-int/lit8 v10, v10, 0x29

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v11

    cmp-long v11, v11, v7

    add-int/lit8 v11, v11, -0x1

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p1, v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v6

    .line 287
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    add-int/lit16 v10, v10, 0x21f

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    add-int/lit8 v11, v11, 0x1b

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v12

    cmpl-float v2, v12, v2

    int-to-char v2, v2

    invoke-static {v10, v11, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v6, v9, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v6

    invoke-static {v10, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v6

    invoke-direct {v2, v9, v6}, Lcom/ironsource/adqualitysdk/sdk/i/en;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/i/en;

    .line 289
    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v6

    add-int/lit16 v6, v6, 0x97

    invoke-static {v4, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v9

    neg-int v9, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    add-int/lit16 v10, v10, 0xe4b

    int-to-char v10, v10

    invoke-static {v6, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v9

    rsub-int v9, v9, 0x239

    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v10

    cmp-long v10, v10, v7

    add-int/lit8 v10, v10, 0x28

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v11

    shr-int/lit8 v11, v11, 0x18

    rsub-int v11, v11, 0x195b

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p1, v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v9

    cmp-long v6, v9, v7

    rsub-int/lit8 v6, v6, 0x1

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    invoke-static {v5}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v10

    rsub-int/lit8 v10, v10, 0x30

    int-to-char v10, v10

    invoke-static {v6, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v4, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v9

    rsub-int v9, v9, 0x261

    invoke-static {v4, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x2d

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v10

    cmp-long v5, v10, v7

    rsub-int/lit8 v5, v5, 0x1

    int-to-char v5, v5

    invoke-static {v9, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮌ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;

    move-result-object p1

    .line 292
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/ft;

    invoke-direct {v4, v3, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ft;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/fj;Lcom/ironsource/adqualitysdk/sdk/i/fj;Lcom/ironsource/adqualitysdk/sdk/i/en;)V

    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x7d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0xb

    div-int/2addr v0, v1

    :cond_0
    return-object p1
.end method

.method private ﱡ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    .line 313
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    rsub-int/lit8 v2, v2, 0x2b

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    add-int/lit16 v5, v5, 0x3cb6

    int-to-char v5, v5

    invoke-static {v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 314
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fp;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v0

    goto :goto_0

    .line 316
    :cond_0
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fp;

    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fp;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    .line 319
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v0

    move-object v0, v1

    :goto_0
    const/16 v1, 0x30

    .line 318
    const-string v2, ""

    invoke-static {v2, v1, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    add-int/lit8 v1, v1, 0x2c

    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    neg-int v2, v2

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    add-int/lit16 v3, v3, 0x3cb5

    int-to-char v3, v3

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v2

    add-int/lit16 v2, v2, 0x290

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    add-int/lit8 v3, v3, 0x24

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit16 v4, v4, 0x40d4

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v1, v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private ﺙ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 278
    rem-int v1, v0, v0

    const/4 v1, 0x0

    .line 275
    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    rsub-int/lit8 v2, v2, 0x6e

    const-string v4, ""

    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v6

    add-int/lit16 v6, v6, 0x105b

    int-to-char v6, v6

    invoke-static {v2, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    rsub-int v5, v5, 0x137

    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    rsub-int/lit8 v6, v6, 0x2b

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v7

    shr-int/lit8 v7, v7, 0x18

    const v8, 0x998b

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, p1, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 277
    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v5

    rsub-int v5, v5, 0x97

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v6

    cmpl-float v3, v6, v3

    rsub-int/lit8 v3, v3, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v6

    shr-int/lit8 v6, v6, 0x8

    add-int/lit16 v6, v6, 0xe4b

    int-to-char v6, v6

    invoke-static {v5, v3, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v5

    add-int/lit16 v5, v5, 0x161

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x2f

    const v7, 0xf16b

    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v1

    add-int/2addr v1, v7

    int-to-char v1, v1

    invoke-static {v5, v6, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fu;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/fu;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/fr;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﻏ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 308
    rem-int v1, v0, v0

    .line 296
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit8 v1, v1, 0x2b

    const v2, 0x1000001

    const/4 v3, 0x0

    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v2

    add-int/lit16 v2, v2, 0x3cb6

    int-to-char v2, v2

    invoke-static {v1, v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/dt$4;

    invoke-direct {v2, p0}, Lcom/ironsource/adqualitysdk/sdk/i/dt$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dt;)V

    invoke-direct {p0, p1, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dt$a;)Ljava/util/List;

    move-result-object p1

    .line 308
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fx;

    invoke-direct {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/fx;-><init>(Ljava/util/List;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p1
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/dt;Ljava/util/List;)Landroid/util/Pair;
    .locals 3

    const/4 v0, 0x2

    .line 57
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->טּ(Ljava/util/List;)Landroid/util/Pair;

    move-result-object p0

    if-eqz v1, :cond_0

    const/16 p1, 0x44

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-object p0
.end method

.method private ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 540
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    .line 531
    invoke-virtual {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    const/4 v2, 0x0

    .line 532
    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v3

    add-int/lit16 v3, v3, 0x32b

    const-string v4, ""

    invoke-static {v4, v4, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v4, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v5

    add-int/lit16 v5, v5, 0x3bc

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    add-int/lit8 v6, v6, 0x23

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-char v2, v2

    invoke-static {v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p2, v3, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    .line 534
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v5

    invoke-static {v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v3

    const/4 v5, 0x0

    .line 535
    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v6

    cmpl-float v5, v6, v5

    rsub-int v5, v5, 0x316

    const/16 v6, 0x30

    invoke-static {v4, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    neg-int v4, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v6

    shr-int/lit8 v6, v6, 0x8

    int-to-char v6, v6

    invoke-static {v5, v4, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 536
    invoke-virtual {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p2

    .line 537
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/eh;

    invoke-direct {v0, p1, v1, p2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/eh;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 539
    :cond_0
    iget p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 540
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/ej;

    invoke-direct {p2, p1, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ej;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p2, p2, 0x33

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p2, v0

    return-object p1
.end method

.method private ﻐ(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dt$a;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/dt$a<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 618
    rem-int v1, v0, v0

    .line 604
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 606
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    .line 607
    invoke-virtual {v2, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 618
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x5b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v0

    .line 608
    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 609
    invoke-interface {p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt$a;->ﾇ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 610
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    :goto_0
    const-wide/16 v3, 0x0

    .line 611
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v5

    add-int/lit16 v5, v5, 0x460

    const/4 v6, 0x0

    invoke-static {v6}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x1

    invoke-static {v6}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v8

    cmp-long v3, v8, v3

    int-to-char v3, v3

    invoke-static {v5, v7, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 613
    invoke-interface {p3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt$a;->ﾇ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 612
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    goto :goto_0

    .line 615
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result p3

    shr-int/lit8 p3, p3, 0x18

    add-int/lit16 p3, p3, 0x461

    const-string v3, ""

    invoke-static {v3}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x15

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-char v4, v4

    invoke-static {p3, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    move-result p3

    add-int/lit8 p3, p3, 0x14

    shr-int/lit8 p3, p3, 0x6

    add-int/lit16 p3, p3, 0x477

    invoke-static {v6}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    add-int/lit8 v3, v3, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-char v4, v4

    invoke-static {p3, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p2, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x5b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v0

    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x23

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_2

    return-object v1

    :cond_2
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﻐ(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    .line 679
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v1, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method private ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 4

    const/4 v0, 0x2

    .line 508
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x59

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_4

    .line 493
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v3

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v1

    .line 494
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﮐ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 496
    :try_start_0
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ff;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ff;-><init>(Ljava/lang/Integer;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 499
    :catch_0
    :try_start_1
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fi;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fi;-><init>(Ljava/lang/Long;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    .line 503
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﺙ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 504
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fg;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fg;-><init>(Ljava/lang/Double;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 505
    :cond_1
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﱡ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 506
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/fh;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v3, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fh;-><init>(Ljava/lang/Boolean;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    .line 494
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_2

    return-object p1

    :cond_2
    throw v2

    .line 508
    :catch_1
    :cond_3
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fl;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/fl;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 493
    :cond_4
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v1

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    .line 494
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﮐ()Z

    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
.end method

.method private ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 552
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const v2, 0x68b6f7b

    const v3, 0x33c587

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    .line 545
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    const/16 v8, 0x23

    div-int/2addr v8, v6

    if-eq v7, v3, :cond_3

    if-eq v7, v2, :cond_2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    if-eq v7, v3, :cond_3

    if-eq v7, v2, :cond_2

    :cond_1
    :goto_0
    move v0, v5

    goto :goto_1

    :cond_2
    invoke-static {v6, v6, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    add-int/lit16 v0, v0, 0x3e3

    invoke-static {v6, v6, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x5

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v3

    const/4 v7, 0x0

    cmpl-float v3, v3, v7

    int-to-char v3, v3

    invoke-static {v0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v4

    if-eq v0, v4, :cond_1

    move v0, v4

    goto :goto_1

    :cond_3
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v2

    rsub-int v2, v2, 0x3de

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v7

    shr-int/lit8 v7, v7, 0x8

    int-to-char v7, v7

    invoke-static {v2, v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1f

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v0

    move v0, v6

    :goto_1
    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 549
    :cond_4
    const-string v0, ""

    const/16 v1, 0x30

    invoke-static {v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    rsub-int v2, v2, 0x313

    invoke-static {v0, v0, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-static {v0, v1, v6, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v4

    rsub-int/lit8 v4, v4, -0x1

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v6}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v3

    const-wide/16 v7, 0x0

    cmp-long v3, v3, v7

    rsub-int v3, v3, 0x3e7

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v4, v7, v9

    rsub-int/lit8 v4, v4, 0x30

    invoke-static {v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    add-int/lit16 v1, v1, 0x2949

    int-to-char v1, v1

    invoke-static {v3, v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p2, v2, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-static {v0, v0, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v0

    rsub-int v0, v0, 0x3e3

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit8 v2, v2, 0x5

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v3

    int-to-byte v3, v3

    sub-int/2addr v5, v3

    int-to-char v3, v5

    invoke-static {v0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result p1

    invoke-static {v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/en;-><init>(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 547
    :cond_5
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/fn;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/fn;

    move-result-object p1

    return-object p1
.end method

.method private ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x2

    .line 235
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v1

    .line 209
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v2

    .line 210
    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    const/16 v4, 0x2a

    const/16 v5, 0x9

    const/4 v6, -0x1

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x6

    const/16 v11, 0x30

    const-string v12, ""

    const-wide/16 v13, 0x0

    const/4 v15, 0x1

    move/from16 v16, v1

    const/4 v1, 0x0

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x31

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    sub-int/2addr v7, v5

    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v9

    cmp-long v5, v9, v13

    int-to-char v5, v5

    invoke-static {v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eq v2, v15, :cond_0

    goto/16 :goto_0

    .line 235
    :cond_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/lit8 v2, v2, 0x2

    move v5, v8

    goto/16 :goto_1

    .line 210
    :sswitch_1
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v8

    cmp-long v3, v8, v13

    rsub-int/lit8 v3, v3, 0x3b

    invoke-static {v11}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v5

    rsub-int/lit8 v5, v5, 0x35

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    int-to-char v8, v8

    invoke-static {v3, v5, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v15

    if-eq v2, v15, :cond_2

    .line 235
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x3b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/lit8 v2, v2, 0x2

    move v5, v7

    goto/16 :goto_1

    .line 210
    :sswitch_2
    invoke-static {v13, v14}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x4c

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    sub-int/2addr v8, v7

    invoke-static {v12, v11, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v7

    rsub-int/lit8 v7, v7, -0x1

    int-to-char v7, v7

    invoke-static {v3, v8, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eq v2, v15, :cond_1

    goto/16 :goto_0

    .line 235
    :cond_1
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_3

    move v5, v4

    goto/16 :goto_1

    .line 210
    :sswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x49

    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x14

    shr-int/2addr v5, v10

    sub-int/2addr v8, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v5

    shr-int/2addr v5, v9

    add-int/lit16 v5, v5, 0x5291

    int-to-char v5, v5

    invoke-static {v3, v8, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v5, v9

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x2e

    invoke-static {v12, v11, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x2

    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v7

    rsub-int v7, v7, 0x6477

    int-to-char v7, v7

    invoke-static {v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move/from16 v5, v16

    goto/16 :goto_1

    :sswitch_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x18

    rsub-int/lit8 v3, v3, 0x2c

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x2

    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v7

    int-to-char v7, v7

    invoke-static {v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v5, v15

    goto/16 :goto_1

    :sswitch_6
    invoke-static {v13, v14}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v3

    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    add-int/2addr v5, v15

    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v7

    cmp-long v7, v7, v13

    int-to-char v7, v7

    invoke-static {v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 235
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x7d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/lit8 v2, v2, 0x2

    const/4 v5, 0x7

    goto/16 :goto_1

    .line 210
    :sswitch_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x2b

    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v5

    add-int/2addr v5, v15

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v7

    rsub-int v7, v7, 0x3cb6

    int-to-char v7, v7

    invoke-static {v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v5, v1

    goto :goto_1

    :sswitch_8
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x41

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v7

    add-int/2addr v7, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    int-to-char v5, v5

    invoke-static {v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v5, v10

    goto :goto_1

    :sswitch_9
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x18

    add-int/lit8 v3, v3, 0x36

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v5

    shr-int/2addr v5, v9

    add-int/2addr v5, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    add-int/lit16 v7, v7, 0x7146

    int-to-char v7, v7

    invoke-static {v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v5, 0x4

    goto :goto_1

    :cond_2
    :goto_0
    move v5, v6

    :cond_3
    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 232
    iget v2, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr v2, v15

    iput v2, v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 233
    invoke-virtual/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 234
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v5

    cmp-long v3, v5, v13

    add-int/2addr v3, v4

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    add-int/2addr v4, v15

    invoke-static {v11}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v5

    rsub-int v5, v5, 0x3ce6

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v12, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/lit8 v4, v4, 0x4f

    invoke-static {v12, v11, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    add-int/lit8 v1, v1, 0x20

    invoke-static {v12}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v5

    add-int/lit16 v5, v5, 0x55ac

    int-to-char v5, v5

    invoke-static {v4, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, p1

    invoke-direct {v0, v4, v3, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fo;

    invoke-direct {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fo;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 230
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 228
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱟ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    .line 235
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x31

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/lit8 v2, v2, 0x2

    return-object v1

    .line 226
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮌ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;

    move-result-object v1

    return-object v1

    .line 224
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﭴ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    .line 235
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x4b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/lit8 v2, v2, 0x2

    return-object v1

    .line 222
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 220
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 218
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﺙ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 216
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 214
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    .line 212
    :pswitch_9
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/fo;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fo;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v1

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x37b1c2d0 -> :sswitch_9
        -0x21ced359 -> :sswitch_8
        0x3b -> :sswitch_7
        0x7b -> :sswitch_6
        0xd1d -> :sswitch_5
        0x18cc9 -> :sswitch_4
        0x1c1bb -> :sswitch_3
        0x1c727 -> :sswitch_2
        0x59a58ff -> :sswitch_1
        0x6bdcb31 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method private static ﻛ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x2

    .line 675
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const-string v3, ""

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    .line 674
    div-int/2addr v1, v2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/lit16 v4, v4, 0x4d7

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v5

    shr-int/lit8 v5, v5, 0x16

    add-int/lit8 v5, v5, 0x7

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v6

    shr-int/lit8 v6, v6, 0x16

    add-int/lit16 v6, v6, 0x5005

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v3

    .line 675
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit16 v4, v4, 0x4de

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v7

    add-int/lit8 v7, v7, 0x9

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    int-to-char v8, v8

    invoke-static {v4, v7, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result p2

    rsub-int p2, p2, 0x4e6

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    shr-int/lit8 v1, v1, 0x6

    add-int/lit8 v1, v1, 0xe

    const/16 v2, 0x30

    invoke-static {v3, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    rsub-int v2, v2, 0x938

    int-to-char v2, v2

    invoke-static {p2, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    if-eqz p3, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result p2

    shr-int/lit8 p2, p2, 0x10

    add-int/lit16 p2, p2, 0x4f5

    invoke-static {v3}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-char v2, v2

    invoke-static {p2, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 674
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x5

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method private ﻛ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 595
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/dt$1;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/dt$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dt;)V

    invoke-direct {p0, p1, p2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dt$a;)Ljava/util/List;

    move-result-object p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p2, p2, 0x61

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/4 p2, 0x6

    div-int/lit8 p2, p2, 0x0

    :cond_0
    return-object p1
.end method

.method private ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x2

    .line 663
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 662
    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 663
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    const/16 v3, 0x30

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int v5, v5, 0x476

    const/4 v6, 0x0

    invoke-static {v4, v6, v6}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v7

    cmpl-float v7, v7, v6

    add-int/lit8 v7, v7, 0x1

    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x1

    int-to-char v3, v3

    invoke-static {v5, v7, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    rsub-int v1, v1, 0x477

    invoke-static {v6, v6}, Landroid/graphics/PointF;->length(FF)F

    move-result v3

    cmpl-float v3, v3, v6

    add-int/lit8 v3, v3, 0x1

    invoke-static {v2, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v5

    int-to-char v5, v5

    invoke-static {v1, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    rsub-int v3, v3, 0x477

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x1

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v7

    cmpl-float v6, v7, v6

    int-to-char v6, v6

    invoke-static {v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int v1, v1, 0x477

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x1

    invoke-static {v2, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v2

    int-to-char v2, v2

    invoke-static {v1, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/lang/String;)V

    .line 662
    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x53

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-void

    :cond_1
    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    const/4 v0, 0x2

    .line 684
    rem-int/2addr v0, v0

    .line 683
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    rsub-int v2, v2, 0x4f8

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x7

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int v4, v4, 0x60fc

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit16 v2, v2, 0x312

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v4

    add-int/lit16 v4, v4, 0x7762

    int-to-char v4, v4

    invoke-static {v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cn;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 684
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v0

    shr-int/lit8 v0, v0, 0x18

    add-int/lit16 v0, v0, 0x4ff

    const-string v2, ""

    invoke-static {v2, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x1c

    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v2

    add-int/lit16 v2, v2, 0x176b

    int-to-char v2, v2

    invoke-static {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 653
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x6b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, p3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x9

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dt;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 3

    const/4 v0, 0x2

    .line 57
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x59

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->爫(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p0

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p1, p1, 0x4d

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private ｋ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 261
    rem-int v1, v0, v0

    .line 256
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    add-int/lit8 v1, v1, 0x6d

    const-string v2, ""

    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v3

    neg-int v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    add-int/lit16 v4, v4, 0x105a

    int-to-char v4, v4

    invoke-static {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    cmpl-float v4, v4, v5

    rsub-int v4, v4, 0xc8

    const-wide/16 v6, 0x0

    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v8

    rsub-int/lit8 v8, v8, 0x29

    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v9

    rsub-int v9, v9, 0x5c2d

    int-to-char v9, v9

    invoke-static {v4, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v1, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x30

    .line 257
    invoke-static {v2, v1, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v4

    add-int/lit8 v4, v4, 0x2c

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    cmp-long v8, v8, v6

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v9

    add-int/lit16 v9, v9, 0x3cb6

    int-to-char v9, v9

    invoke-static {v4, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Ljava/util/List;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v4

    .line 258
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v8

    .line 259
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v9

    add-int/lit8 v9, v9, 0x2b

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v10

    cmp-long v10, v10, v6

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    rsub-int v11, v11, 0x3cb6

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-static {v2, v1, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    rsub-int v1, v1, 0xf0

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x21

    const v10, 0xca6b

    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v2

    add-int/2addr v2, v10

    int-to-char v2, v2

    invoke-static {v1, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v9, v8, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v1

    rsub-int v1, v1, 0x96

    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v2

    cmpl-float v2, v2, v5

    rsub-int/lit8 v2, v2, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v9

    cmp-long v3, v9, v6

    add-int/lit16 v3, v3, 0xe4a

    int-to-char v3, v3

    invoke-static {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾒ(Ljava/util/List;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 261
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/fq;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    invoke-direct {v2, v4, v8, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/fq;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/fr;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x6f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p1
.end method

.method private ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 658
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    .line 657
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object p1

    .line 658
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x69

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method private static ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 3

    const/4 v0, 0x2

    .line 190
    rem-int v1, v0, v0

    .line 185
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ed;

    if-nez v1, :cond_0

    .line 190
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    .line 188
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ:Ljava/util/Map;

    invoke-interface {v1, p0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p0

    :cond_0
    return-object v1
.end method

.method private static ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 3

    const/4 v0, 0x2

    .line 199
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    .line 194
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-nez v1, :cond_0

    .line 199
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    .line 197
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ:Ljava/util/Map;

    invoke-interface {v1, p0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p0, v1

    .line 199
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x4f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    const/16 v0, 0xf

    div-int/lit8 v0, v0, 0x0

    :cond_1
    return-object p0
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

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱟ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮐ:J

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

.method static ﾇ()V
    .locals 4

    const/16 v0, 0x51b

    new-array v1, v0, [C

    const-string v2, "\u0000{\u0000mD\u0011\u0088\u009c\u00cd4\u0011\u00bfV \u009a\u0098\u00dfN#\u00cfhp\u00ac\u00f1\u00f0\u00dc5\u0003y\u008c\u00be7\u0002\u00b9G,\u008b\u00d0\u00d0\u0008\u0014\u00feYu\u009d\u00a4\u00e1\u0099&Lj\u0083\u00af;\u00f3\u00a58L|\u00df\u00c1Q\u0005\u00f6Jh\u008e\u00a0\u00d2\u0087\u0017\u001c[\u00bd\u00a0$\u00e4\u00a1)Um\u00c9\u00b2N\u00f6\u00e0<\u008d\u0000iD\u0012d\u0011 l\u00ec\u00ed\u0000wD\u001c\u0088\u0081\u00cd0\u0011\u00b5q45W\u00f9\u00da\u00bco`\u00e4\'l\u0000bD\u0006\u0088\u008d\u00cd=\u0011\u00bb\u0000cD\u001b\u0088\u0086\u00cd(\u0011\u00b9V*\u009a\u00cd\u00dfIR\u00e5\u0016\u0097\u00da\u0000\u0000vD\u0015\u0088\u009aU\u00c1\u0011\u00b1\u00dd7\u0098\u0083D\u0015\u0003\u0086\u00cfs\u008a\u00a0v+=\u0083\u00f9\u0003\u00a5p`\u00bd,<\u00eb\u00d4W\u0005\u0012\u0082\u00de|\u0085\u00a4A_\u000c\u00da\u00c8\u0008\u00b4\'s\u00b4?-\u00fa\u008c\u00a6\u0001m\u00fd)y\u0094\u00e6P@\u0010s\u0000iD\u0012\u0088\u00c8\u00cd/\u0011\u00a4V%\u009a\u00cc\u00dfI#\u00cdhq\u00ac\u00e6\u00f0\u00885Py\u0097\u00be0\u0002\u00a3G5\u008b\u00d8\u00d0L\u0014\u00bcYr\u009d\u00e1\u00e1\u00d8&\nj\u008f\u00af8\u00f3\u00a48S|\u00c7\u00c1A\u0005\u00fcJ,\u008e\u00e2\u00d2\u008d\u0017H[\u00bd\u00a0p\u00e4\u00e3)\u0010m\u008b\u000eb\u0000iD\u0012\u0088\u00c8\u00cd/\u0011\u00a4V%\u009a\u00cc\u00dfI#\u00cdhq\u00ac\u00e6\u00f0\u00885Py\u0087\u00be7\u0002\u00a2G$\u008b\u00dd\u00d0\\\u0014\u00f5Y\u007f\u009d\u00ea\u00e1\u00d8&\u001fj\u0088\u00af;\u00f3\u00bd8P|\u00d4\u00c1\u0004\u0005\u00faJi\u008e\u00a0\u00d2\u009d\u0017\u0006[\u00af\u00a09\u00e4\u00a0)]m\u008c\u00b2\u0007\u00f6\u00bc;!\u007f[\u0014\u0093P\u00ee\u009cm\u00d9\u00cf\\H\u00185\u00d4\u00b4\u0091RM\u008d\n\u001e\u00c6\u00f7\u0083v\u007f\u00eb4W\u00f0\u00c3\u00ac\u00bci*%\u00ea\u00e2\u0005^\u008a\u001b\u0001\u00d7\u00ef\u008cjH\u00d6\u0005\u001e\u00c1\u00c8\u00bd\u00b3zb6\u00a8\u00f3\u0015\u00af\u008ad~ \u00f1\u009d}Y\u00d3\u0016F\u00d2\u008e\u008e\u00b8K?\u0007\u00d2\u00fc\u001f\u00b8\u00cau11\u00aa\u00ee)\u00ca\r\u008epB\u00f1\u0007\u0017\u00db\u00d8\u009c@P\u00bd\u0015#\u00e9\u00a2\u00a2\u000bf\u008a:\u00f8\u00ffu\u00b3\u00aft@\u00c8\u00cf\u008dDA\u00aa\u001a/\u00de\u0093\u0093[W\u008a+\u00fd\u00ecc\u00a0\u00abeH9\u00ca\u00f2#\u00b6\u00b3\u000bo\u00cf\u00d4\u0080\\D\u00ccAp\u0005\u001b\u00c9\u0083\u008c*P\u00a0\u00175\u00db\u00c6\u009e_b\u009f)n\u00ed\u00ef\u00b1\u0093t\u001d8\u009e\u00ff4C\u00a0\u00066\u00ca\u00c4\u0091YU\u00a3\u0018|\u00dc\u00f3\u00a0\u0088g\u0006+\u0093\u00ee/\u00b2\u00f7yF=\u00c1\u0080_D\u00a7\u000bd\u00cf\u00f6\u0093\u009fV\u001f\u001a\u00e3\u0099\u00fc\u00dd\u0097\u0011\nT\u00bb\u0088>\u00cf\u00ef\u0003@F\u00d3\u00baJ\u00f1\u00eb5fi\u001a\u00ac\u009e\u00e0\u0001\'\u00a7\u009bg\u00de\u00b8\u0012WI\u00cc\u008db\u00c0\u00f7\u0004kxS\u00bf\u0085\u00f3\u000e6\u00ffj%\u00a1\u00d8\u00e5WX\u00c3\u009c|\u00d3\u00f0\u0017nK\u001b\u008e\u00c3\u00c259\u00a2}o\u00b0\u00d2\u00f4\u0007+\u008co7\u00a2\u00a4\u00f1\u001c\u00b5wy\u00ea<[\u00e0\u00de\u00a7\u000fk\u00a0.3\u00d2\u00aa\u0099\u000b]\u0086\u0001\u00fa\u00c4~\u0088\u00e1OG\u00f3\u0087\u00b6Hz\u00b0!-\u00e5\u0093\u00a8\u0012l\u009b\u0010\u00fa\u00d7h\u009b\u00e5^\u001f\u0002\u00d0\u00c9?\u008d\u00b40:\u00f4\u009f\u00bb\u0003\u007f\u00cb#\u00fd\u00e6f\u00aa\u0097QR\u0015\u00c1\u00d8 \u009c\u00aeC/\u0007\u009a\u00caC\u008e02\u00b3\u00f9&\u00bd\u0094\u00bc\u00b3\u00f8\u00c14Vq\u00bb\u00add\u00ea\u00f7&\u001ec\u009f\u009f\u0002\u00d4\u00be\u0010*LU\u0089\u00c3\u00c5\u0003\u0002\u00f2\u00be~\u00fb\u00f47\u0007l\u00cf\u00a89\u00e5\u00b2!c]\\\u009a\u00c4\u00d6J\u0013\u00e3O`\u0084\u008e\u00c0\u0019}\u0087\u00b9\u007f\u00f6\u00e32.n]\u00ab\u00dc\u00e7r\u001c\u00f3Xf\u0095\u00df\u00d1L\u000e\u009cJ.\u0087\u00e8\u00c3\u0092O\u00f5\u000b\u0083\u00c7\n\u0082\u00a9^.\u0000tD\u0006\u0088\u0091\u00cd|\u0011\u00a3V0\u009a\u00d9\u00dfX#\u00c5hy\u00ac\u00ed\u00f0\u00925\u0004y\u00c4\u00be+\u0002\u00a4G/\u008b\u00c1\u00d0D\u0014\u00f8Y0\u009d\u00e6\u00e1\u009d&Lj\u0086\u00af;\u00f3\u00a48P|\u00df\u00c1S\u0005\u00fdJh\u008e\u00a0\u00d2\u0096\u0017\u0011[\u00fc\u00a01\u00e4\u00e4)[m\u00cd\u00b2T\u00f6\u00f7;`\u007f\\\u00c3\u0083\u0008\u0010L\u00b9\u00918\u00d5\u00a5\u001aY^\u00cd\u00a3r\u00e7\u00e4\u0000cD\u0015\u0088\u009c\u00cd?\u0011\u00b8Vd\u009a\u00d3\u00dfI#\u00d9hc\u00ac\u00e7\u00f0\u008e5\u0014y\u00c4\u00be+\u0002\u00a4G/\u008b\u00c1\u00d0D\u0014\u00f8Y0\u009d\u00e6\u00e1\u009d&Lj\u0086\u00af;\u00f3\u00a48P|\u00df\u00c1S\u0005\u00fdJh\u008e\u00a0\u00d2\u0096\u0017\u0011[\u00fc\u00a01\u00e4\u00e4)\u001fm\u0084\u00b2\u0007\u0000mD\u001d\u0088\u009b\u00cd/\u0011\u00b9V*\u009a\u00df\u00df\u000c#\u00c3hu\u00ac\u00fc\u00f0\u009f5\u0018y\u00c4\u00be.\u0002\u00adG2\u008b\u00dd\u00d0I\u0014\u00feY|\u009d\u00e1\u00e1\u00d8&\u0002j\u0081\u00af9\u00f3\u00ad\u00198]N\u0091\u00c7\u00d4d\u0008\u00e3O?\u0083\u0093\u00c6\u0016:\u0089q.\u00b5\u00be\u00e9\u0087,X`\u00d7\u00a7l\u001b\u00e2^w\u0092\u008b\u00c9S\r\u00a5@.\u0084\u00ff\u00f8\u00c5?Xs\u00d7\u00b6c\u00ea\u00fc!\u0010e\u008e\u00d8\u001b\u001c\u00e3S5\u0097\u00a2\u00cb\u008f\u000eRB\u00a7\u00b9,\u00fd\u00b60D\u0000cD\u0015\u0088\u009c\u00cd?\u0011\u00b8Vd\u009a\u00cb\u00dfX#\u00c1h`\u00ac\u00ed\u00f0\u00915\u0015y\u008a\u00be,\u0002\u00ecG-\u008b\u00c1\u00d0[\u0014\u00e8Y0\u009d\u00e6\u00e1\u009d&Lj\u0083\u00af;\u00f3\u00a58L|\u00df\u00c1Q\u0005\u00f6Jh\u008e\u00a0\u00d2\u00dc\u0017\u0001[\u00b2\u00a0#\u00e4\u00ad)\\m\u00c9\u00b2\u0000\u00f6\u00b3;s\u007f\u0001\u00c3\u00d7\u0008M@\u00a6\u0004\u00c5\u00c8H\u008d\u00fdQv\u0016\u00fe\u00daL\u009f\u008bc\u0000(\u00a1\u00ec(\u00b0Mu\u00c99U\u00fe\u00e2Bl\u0007\u00b4\u00cb\u0013\u0090\u0094T\'\u0019\u00b1\u00dd<\u00a1Hf\u0098*Q\u00ef\u00ee\u00b3xx\u00c8<\u0013\u0081\u0099E8\n\u00b0\u00cet\u0092\u0007W\u0087\u001b/\u00f8\u007f\u00bc\u001bp\u00905 \u00e9\u00a6\u00aeyb\u00d6\'E\u00db\u00dc\u0090}T\u00f0\u0008\u008c\u00cd\u0008\u0081\u0097F1\u00fa\u00f1\u00bf.s\u00c1(Z\u00ec\u00f4\u00a1ae\u00fd\u0019\u00c5\u00de\u0014\u0092\u0093W-\u000b\u00f5\u00c0V\u0084\u00c49M\u00fd\u00ed\u00b21v\u00ba*\u00d2\u00efR>\u00bfz\u00c7\u00b6Z\u00f3\u00f4/eh\u00f6\u00a4\u0011\u00e1\u0095\u001d\\V\u00bb\u0092 \u00ceA\u000b\u00d8G]\u0080\u00e9<uy\u00f2\u00b5\u001c\u00ee\u00d4*3g\u00a4\u00a37\u00dfQ\u0018\u00dcTX\u0091\u00a8\u00cdq\u0006\u008eB\u0008\u00ff\u00d8;3t\u00b9\u00b0(\u00ec@)\u0094e\'\u009e\u00b7\u00da?\u0000}\u00d8\u00a4\u009c\u00d0\u0000|D\u0008\u0000=DIF_\u00027\u0000\u00a9\u0000>\u0000<DI\u0000>DI\u0000+\u00ee\u000b\u0096x\u00d2\u000c8\u001c|h\u0012)wM\u0000%\u0000.\u0000[\u0000=\u0091\u00a2\u0000mD\u001d\u0088\u009b\u00cd/\u0011\u00b9V*\u009a\u00df\u00df\u000c#\u00c3hx\u00ac\u00e7\u00f0\u008f5\u0019y\u008a\u00be?\u0002\u00ecGg\u008b\u009d\u00d0\u000f\u0000]6\u00e1r\u00ae\u00be9\u00fb\u0090\'\u0014`\u0095\u00aco\u00e9\u00ec\u0015q^\u00c4\u009a\u001c\u00c6\'\u0003\u00b4O5\u0088\u009e4\u0019q\u0080\u00bdo\u00e6\u00ee\"\u0008\u0000UD\u001a\u0088\u008d\u00cd$\u0011\u00a0V!\u009a\u00db\u00dfX#\u00c5hp\u00ac\u00a8\u00f0\u00885\u001fy\u008f\u00be=\u0002\u00a2G`\u0000CD\u0015\u0088\u009d\u00cd;\u0011\u00b8V0\u009a\u0098\u00dfI#\u00d8hw\u00ac\u00ed\u00f0\u008c5\u0004y\u008d\u00be7\u0002\u00a2\u0000ED\u000c\u0088\u0098\u00cd9\u0011\u00b3V0\u009a\u00dd\u00dfH#\u0080h}\u00ac\u00ec\u00f0\u00995\u001ey\u0090\u00be1\u0002\u00aaG)\u008b\u00d1\u00d0Z\u0014\u00bcYr\u009d\u00f1\u00e1\u008c&Lj\u0087\u00af;\u00f3\u00bc8\u001c\u0000rD\u0011\u0088\u008e\u00cd0\u0011\u00b5V\'\u009a\u00cc\u00dfE#\u00cfhz\u00ac\u00a8\u00f0\u009f5\u001cy\u0085\u00be+\u0002\u00bfG`\u008b\u00da\u00d0I\u0014\u00f1Yu\u009d\u00f7\u00e1\u00d8&\u001fj\u0088\u00af;\u00f3\u00bd8P|\u00d4\u00c1\u0004\u0005\u00faJi\u008e\u00a0\u00d2\u0092\u0017\u0007[\u00b0\u00a0<\u00e4\u00ab)Om\u00c9\u00b2D\u00f6\u00b4;j\u007f\u0005\u00c3\u00d0\u0008\rL\u00b6\u0091:\u00d5\u00af\u001aW^\u00c9\u00a3h\u00e7\u00f9,kp\u0016\u00b4\u00cc\u00f9G=\u00fc\u0082f\u00c6\u0092\u000b\u001eO\u008d\u0094?\u0000sD\u0001\u0088\u008a\u00cd/\u0011\u00b3V6\u009a\u00d1\u00df\\#\u00d4h4\u00ac\u00fb\u00f0\u00945\u001fy\u0091\u00be4\u0002\u00a8G`\u008b\u00d6\u00d0M\u0014\u00bcYs\u009d\u00e8\u00e1\u0097&\u001fj\u0085\u00af0\u00f3\u00e88K|\u00d9\u00c1P\u0005\u00f0J,\u008e\u00a7\u00d2\u00a9\u0017O\u0000nD\u0001\u0088\u0084\u00cd0\u0000sD\u0001\u0088\u0098\u00cd9\u0011\u00a2);mI\u00a1\u00d0\u00e4q8\u00ea\u007f,\u00b3\u0083\u00f6\u000c\n\u0087A)\u0085\u00ac\u00d9\u00d0\u001c\u0018P\u00ce\u0097u+\u00a4nn\u00a2\u0093\u00f9\u000c=\u00b8p7\u00b4\u00bb\u00c8\u00d5\u000f@C\u0088\u0086~\u00da\u00f9\u0011TU\u0099\u00e8L,\u00bdc!\u00a7\u00bc\u00fb\u00d4>Or\u00f0\u00898\u00cd\u00e5\u0000\u001eD\u0092\u009b\u0007\u00df\u00bf\u0012!V@\u00ea\u00d1!Ce\u00fe\u00a6g\u00e2..\u00bak\u001b\u00b7\u0091\u00f0\u0012<\u00ffyj\u0085\u00a2\u00cee\n\u00deV\u00ac\u0093;\u00df\u00a8\u0018\u001d\u00a4\u00ce\u00e1\u0000-\u00e3v~\u00b2\u009e\u00ffU;\u00c9G\u00ae\u0080n\u0000:\\\u00c8\u0018\u00a5\u00d4%\u0091\u0090MR\n\u008d\u00c6\u007f\u0083\u00f7\u007f\"4\u00c5\u00f0B\u00ac1i\u00a7%*\u00e2\u009e^N\u001b\u0080\u00d7s\u008c\u00aaHX\u0005\u00dd\u00c1J\u00bd6z\u00a165\u00f3\u0093\u00af\u000ed\u00be p\u009d\u00ffY\u001a\u0016\u00cf\u00d2\u0002\u008e K\u00ab\u0007\u0012\u00fc\u0087\u00b8\u0003u\u00ba1o\u00ee\u00e4\u00aaBg\u00cf#\u00ac\u009frT\u00e1\u0010@\u00cd\u00c9\u0000,\u0000lD\u001d\u0088\u009b\u00cd(\u0011\u00f0V7\u009a\u00d0\u00dfC#\u00d5hx\u00ac\u00ec\u00f0\u00dc5\u0015y\u008a\u00be<\u0002\u00ecG7\u008b\u00dd\u00d0\\\u0014\u00f4Y0\u009d\u00a3\u0000\'\u0000UD\u001a\u0088\u008d\u00cd$\u0011\u00a0V!\u009a\u00db\u00dfX#\u00c5hp\u00ac\u00a8\u00f0\u00995\u001ey\u0080\u00bex\u0002\u00a3G&\u008b\u0094\u00d0\\\u0014\u00f3Y{\u009d\u00e1\u00e1\u0096&\u001f\u0000ED\u000c\u0088\u008b\u00cd9\u0011\u00a0V0\u009a\u00d1\u00dfC#\u00ceh4\u00ac\u00ff\u00f0\u00945\u0019y\u0088\u00be=\u0002\u00ecG\'\u008b\u00d1\u00d0\\\u0014\u00e8Yy\u009d\u00ea\u00e1\u009f&Lj\u008e\u00af1\u00f3\u00b08H|\u0090\u00c1P\u0005\u00f7Jg\u008e\u00e5\u00d2\u009a\u0000ED\u000c\u0088\u008b\u00cd9\u0011\u00a0V0\u009a\u00d1\u00dfC#\u00ceh4\u00ac\u00ff\u00f0\u00945\u0019y\u0088\u00be=\u0002\u00ecG0\u008b\u00d1\u00d0M\u0014\u00f7Yy\u009d\u00ea\u00e1\u009f&Lj\u0081\u00af \u00f3\u00e88R|\u00d5\u00c1\\\u0005\u00ecJ,\u008e\u00f4\u00d2\u009b\u0017\u0003[\u00b9\u00a0>P%\u0014\u0010\u00d8\u008b\u009d-A\u00b0\u00063\u00ca\u009d\u0000ED\u000c\u0088\u0098\u00cd9\u0011\u00b3V0\u009a\u00dd\u00dfH#\u0080\t\u0019M/\u0081\u00a4\u00c4\u0011\u0018\u00c9_\u000f\u0093\u00e4\u00d6v*\u00fcaD\u00a5\u00c7\u00f9\u00a0<-p\u00fd\u0000 DY\u0088\u00c8`\u00ac$\u00e9\u00e8f\u00ad\u00d3qI6\u00ca\u00fak\u0017;S~\u009f\u00f1\u00daD\u0006\u00d2AA\u008d\u00b4\u00c8g4\u00ad\u007f\u001e\u00bb\u008a\u00e7\u00fb\"~n\u00eb\u00a9\u0013\u0015\u00c3P^\u009c\u00ba\u00c7c\u0003\u0083N\u0014\u008a\u00cf\u00f6\u00f61u}\u00f9\u00b8P\u00e4\u00d1/$"

    const-string v3, "ISO-8859-1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asCharBuffer()Ljava/nio/CharBuffer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Ljava/nio/CharBuffer;->get([CII)Ljava/nio/CharBuffer;

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱟ:[C

    const-wide v0, -0x57f721ba8327bb8cL

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮐ:J

    return-void
.end method

.method private ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 527
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 512
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v1

    .line 513
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﭖ()Z

    move-result v3

    const-string v4, ""

    const/4 v5, 0x0

    if-nez v3, :cond_0

    .line 514
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    add-int/lit16 v6, v6, 0x361

    invoke-static {v4, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x1c

    invoke-static {v5, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    int-to-char v8, v8

    invoke-static {v6, v7, v8}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 516
    :cond_0
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v8

    .line 518
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v1

    const/16 v3, 0x30

    .line 519
    invoke-static {v4, v3, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v6

    rsub-int v6, v6, 0x304

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    add-int/lit16 v9, v9, 0x95

    int-to-char v9, v9

    invoke-static {v6, v7, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    .line 513
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v6, v2, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v2, v0

    .line 520
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ףּ(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 521
    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x6e

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v6

    cmpl-float v6, v6, v7

    invoke-static {v4, v3, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v7

    add-int/lit16 v7, v7, 0x105c

    int-to-char v7, v7

    invoke-static {v0, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    add-int/lit16 v6, v6, 0x37d

    invoke-static {v4, v5}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/lit8 v4, v4, 0x3f

    const/high16 v7, 0x1000000

    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    add-int/2addr v5, v7

    int-to-char v5, v5

    invoke-static {v6, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p2, v0, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 522
    :cond_1
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v4

    cmpl-float v4, v4, v7

    rsub-int/lit8 v4, v4, 0x6e

    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    move-result v6

    cmpl-float v6, v6, v7

    add-int/lit8 v6, v6, 0x1

    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    move-result v5

    rsub-int v5, v5, 0x105b

    int-to-char v5, v5

    invoke-static {v4, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 523
    iget p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 524
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/ee;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result v1

    invoke-static {v8, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v1

    invoke-direct {p2, p1, v8, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ee;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    .line 513
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 p2, p2, 0x41

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr p2, v0

    if-nez p2, :cond_2

    return-object p1

    :cond_2
    throw v2

    :cond_3
    :goto_0
    move-object v9, v2

    .line 526
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v0

    add-int/lit8 v0, v0, 0x67

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit16 v3, v3, 0xe4b

    int-to-char v3, v3

    invoke-static {v0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 527
    new-instance v6, Lcom/ironsource/adqualitysdk/sdk/i/eb;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ｋ()I

    move-result p2

    invoke-static {v8, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v11

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Lcom/ironsource/adqualitysdk/sdk/i/eb;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    return-object p1

    .line 512
    :cond_4
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object p1

    .line 513
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﭖ()Z

    throw v2
.end method

.method private ﾒ(Ljava/util/List;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 271
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x1

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 266
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v1

    .line 267
    invoke-virtual {v1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 268
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v3

    rsub-int v3, v3, 0x112

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    rsub-int/lit8 v4, v4, 0x25

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit16 v5, v5, 0x411f

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p1, p1, 0x4d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p1, v0

    return-object v1

    :cond_0
    return-object v2

    .line 266
    :cond_1
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object p1

    .line 267
    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    throw v2
.end method

.method private ﾒ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fr;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 252
    rem-int v1, v0, v0

    const/4 v1, 0x0

    .line 240
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x6e

    const/16 v3, 0x30

    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v4

    rsub-int/lit8 v4, v4, 0x31

    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    rsub-int v5, v5, 0x105a

    int-to-char v5, v5

    invoke-static {v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const-string v4, ""

    invoke-static {v4, v3, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v4

    add-int/lit8 v4, v4, 0x70

    const v5, -0xffffd8

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v2

    .line 242
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    rsub-int v4, v4, 0x97

    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v3

    add-int/lit8 v3, v3, -0x2f

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int v5, v5, 0xe4b

    int-to-char v5, v5

    invoke-static {v4, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v4

    cmp-long v4, v4, v7

    rsub-int v4, v4, 0x99

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    rsub-int/lit8 v5, v5, 0x2c

    invoke-static {v1, v6, v6}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v9

    cmpl-float v6, v9, v6

    int-to-char v6, v6

    invoke-static {v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ｋ(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object v3

    .line 245
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 252
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v4, v4, 0x5f

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v4, v0

    .line 246
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->乁(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v4

    const v5, 0x10000c4

    .line 247
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    add-int/2addr v6, v5

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x4

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    add-int/lit16 v1, v1, 0x14f6

    int-to-char v1, v1

    invoke-static {v6, v5, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 248
    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 249
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    .line 252
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v4, v1, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/fs;

    invoke-direct {v0, v2, v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/fs;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/fr;Lcom/ironsource/adqualitysdk/sdk/i/fr;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/fr;)Lcom/ironsource/adqualitysdk/sdk/i/fr;

    move-result-object p1

    return-object p1
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/dt;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    .line 57
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/lang/String;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 p0, p0, 0x79

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method private ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/dy;Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    .line 669
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    .line 668
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 669
    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, p3, p4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/lang/String;)V

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/ed;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 357
    rem-int v1, v0, v0

    .line 344
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮉ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object v1

    .line 345
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->丫(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 346
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﾇ()I

    move-result v3

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dn;->ﻐ(Ljava/lang/String;I)Lcom/ironsource/adqualitysdk/sdk/i/dn;

    move-result-object v2

    .line 347
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ヶ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dy;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dy;->ﾒ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v4

    const/16 v5, 0x4c0

    const/4 v6, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v4, v5, :cond_1

    const/16 v5, 0xf80

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    const-string v4, ""

    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v5

    rsub-int v5, v5, 0x2fe

    const/16 v9, 0x30

    invoke-static {v4, v9, v8, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v10

    add-int/lit8 v10, v10, 0x3

    invoke-static {v4, v9, v8, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v4

    rsub-int/lit8 v4, v4, -0x1

    int-to-char v4, v4

    invoke-static {v5, v10, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 357
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v3, v3, 0x69

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v3, v0

    move v6, v7

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 347
    invoke-static {v8, v4, v4}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v5

    cmpl-float v4, v5, v4

    add-int/lit16 v4, v4, 0x2fd

    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    add-int/2addr v5, v0

    const v9, 0xd882

    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    add-int/2addr v10, v9

    int-to-char v9, v10

    invoke-static {v4, v5, v9}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 357
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v3, v3, 0x3f

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v3, v0

    move v6, v8

    :cond_2
    :goto_0
    if-eqz v6, :cond_4

    if-eq v6, v7, :cond_3

    .line 353
    iget p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    sub-int/2addr p1, v7

    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    return-object v1

    .line 351
    :cond_3
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/fb;

    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v3, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fb;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    .line 357
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x2f

    :goto_1
    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v1, v0

    return-object p1

    .line 349
    :cond_4
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/eo;

    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    invoke-direct {v3, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/eo;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ed;)Lcom/ironsource/adqualitysdk/sdk/i/ed;

    move-result-object p1

    .line 357
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v1, v1, 0x5b

    goto :goto_1

    :cond_5
    return-object v1
.end method

.method public final ﾇ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/fj;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 205
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    add-int/lit8 v1, v1, 0x27

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 203
    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ:I

    .line 204
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    rsub-int/lit8 v2, v2, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v6

    cmp-long v3, v6, v4

    const-string v4, ""

    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v5

    int-to-char v5, v5

    invoke-static {v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x2a

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v5

    int-to-char v5, v5

    invoke-static {v3, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﾇ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻛ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﮌ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/fj;

    move-result-object p1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﻏ:I

    add-int/lit8 v2, v2, 0x47

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dt;->ﱡ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0x1f

    div-int/2addr v0, v1

    :cond_0
    return-object p1
.end method
