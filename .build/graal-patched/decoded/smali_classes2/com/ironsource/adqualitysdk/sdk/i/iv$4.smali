.class final Lcom/ironsource/adqualitysdk/sdk/i/iv$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/iv;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:I = 0x1

.field private static ﱟ:[S = null

.field private static ﱡ:I = 0x0

.field private static ﺙ:I = 0x15d509cd

.field private static ﻏ:[B = null

.field private static ﻐ:I = 0x52

.field private static ﾇ:I = 0x54e1a81c


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iv$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5a

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻏ:[B

    return-void

    :array_0
    .array-data 1
        -0x44t
        0x38t
        -0x35t
        0x33t
        -0x3at
        0x38t
        0x21t
        -0x29t
        -0x34t
        0x36t
        -0x33t
        0x36t
        0x3at
        0x22t
        -0x24t
        0x1dt
        0x22t
        0x16t
        -0x18t
        0x6t
        -0x41t
        0x43t
        0xft
        -0x10t
        0x9t
        -0x54t
        0x55t
        -0xat
        0x14t
        -0x1t
        -0xat
        0x9t
        -0x58t
        0x48t
        0x5t
        0x6t
        -0x9t
        -0x43t
        0x40t
        0x9t
        -0x2t
        0x4t
        0x4t
        0x6t
        -0xbt
        0x8t
        -0x57t
        0x56t
        -0x5t
        -0xbt
        -0x7t
        -0x5t
        0x15t
        -0x7t
        -0x58t
        0x44t
        -0x46t
        0x57t
        -0x2t
        -0x2dt
        -0x34t
        0x53t
        -0x2t
        -0xft
        0xft
        -0x5t
        -0xdt
        0xct
        -0x53t
        0x4ct
        0x1t
        0x4t
        -0x2t
        0x1t
        -0x13t
        -0x44t
        0x43t
        0x9t
        -0xat
        0xdt
        -0x54t
        0x4et
        0x4t
        -0x55t
        0x44t
        0x6t
        -0xbt
        -0x2t
        0xct
        -0x1at
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/iv;Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iv$a;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V
    .locals 12

    const-string v0, ""

    const/4 v1, 0x2

    .line 109
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱡ:I

    add-int/lit8 v2, v2, 0x6f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﮐ:I

    rem-int/2addr v2, v1

    .line 80
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iv;)Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﻐ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V

    return-void

    :cond_0
    const/16 v2, 0x30

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 86
    :try_start_0
    invoke-interface {p2}, Lcom/ironsource/adqualitysdk/sdk/i/iv$a;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 88
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/iy;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    const v6, -0x54e1a81c

    sub-int/2addr v6, v5

    invoke-static {v0, v2, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x34

    int-to-byte v5, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    add-int/lit8 v7, v7, -0x53

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    const v9, -0x15d5097f

    add-int/2addr v8, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    int-to-short v9, v9

    invoke-static {v6, v5, v7, v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v7

    shr-int/lit8 v7, v7, 0x8

    const v8, -0x54e1a80e

    add-int/2addr v7, v8

    invoke-static {v0, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v8

    rsub-int/lit8 v8, v8, -0x5

    int-to-byte v8, v8

    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v9

    add-int/lit8 v9, v9, -0x52

    const/4 v10, 0x0

    invoke-static {v10, v10}, Landroid/graphics/PointF;->length(FF)F

    move-result v11

    cmpl-float v10, v11, v10

    const v11, -0x15d50986

    sub-int/2addr v11, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    int-to-short v10, v10

    invoke-static {v7, v8, v9, v11, v10}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﱡ(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;

    invoke-direct {v1, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/ir;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void

    .line 99
    :cond_1
    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$3;

    invoke-direct {v5, p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ir;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V

    invoke-static {v5}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱡ:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﮐ:I

    rem-int/2addr p1, v1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    throw v3

    :catch_0
    move-exception p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v5, -0x54e1a7df

    invoke-static {v0, v2, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    add-int/2addr v0, v5

    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    int-to-byte v2, v2

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x53

    const v6, -0x15d50978    # -5.16704E25f

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    sub-int/2addr v6, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-short v4, v4

    invoke-static {v0, v2, v5, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v3, p2}, Lcom/ironsource/adqualitysdk/sdk/i/iz;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ir;Ljava/lang/String;)V

    return-void
.end method

.method private ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V
    .locals 3

    const/4 v0, 0x2

    .line 114
    rem-int v1, v0, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iv;)Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v1

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$1;

    invoke-direct {v2, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/iv$4;Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/is;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﮐ:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱡ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method private static ﾒ(IBIIS)Ljava/lang/String;
    .locals 6

    .line 1200
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 1202
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻐ:I

    add-int/2addr p2, v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p2, v3, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_2

    .line 1209
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻏ:[B

    if-eqz p2, :cond_1

    .line 1211
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾇ:I

    add-int/2addr v3, p0

    aget-byte p2, p2, v3

    add-int/2addr p2, v2

    int-to-byte p2, p2

    goto :goto_0

    .line 1217
    :cond_1
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱟ:[S

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾇ:I

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
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾇ:I

    add-int/2addr p0, v2

    add-int/2addr p0, v4

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    .line 1227
    sput-byte p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    .line 1230
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﺙ:I

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻏ:[B

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱟ:[S

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


# virtual methods
.method public final ﻐ()V
    .locals 3

    const/4 v0, 0x2

    .line 76
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱡ:I

    add-int/lit8 v1, v1, 0x69

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﮐ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iv$a;

    invoke-direct {p0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﮐ:I

    add-int/lit8 v1, v1, 0x4f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/4 v0, 0x6

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-void
.end method
