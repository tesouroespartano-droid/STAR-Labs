.class public final Lcom/ironsource/adqualitysdk/sdk/i/ds;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﭖ:J = 0x0L

.field private static ﭴ:I = 0x0

.field private static ﮉ:I = 0x1

.field private static ﮌ:J

.field private static ﮐ:[C

.field private static final ﱟ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final ﱡ:Ljava/util/regex/Pattern;

.field private static final ﺙ:Ljava/util/regex/Pattern;

.field private static final ﻏ:Ljava/util/regex/Pattern;

.field private static final ﻐ:Ljava/util/regex/Pattern;

.field private static final ﻛ:Ljava/util/regex/Pattern;

.field private static final ｋ:Ljava/util/regex/Pattern;

.field private static final ﾇ:Ljava/util/regex/Pattern;

.field private static final ﾒ:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾇ()V

    .line 17
    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v2

    const/4 v3, 0x1

    rsub-int/lit8 v2, v2, 0x1

    const-string v4, "\ud690\ud6ce\u9c23\u850a\u2315\u23ba\ufbb1\u1dd0\u2b5e\u2143\uf9a9\u181b\u2ddc\u26a9\uff15\u1a4e\u2fed\u2487\uf286\u1498\u206d\u2a44\uf090\u1680\u222d\u2ff6\uf60b\u112c\u2482"

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻐ:Ljava/util/regex/Pattern;

    .line 18
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x1

    const-string v4, "\ud0e6\ud0b8\u78e3\u1f24\uc7ac\uc85f\u61d6\uf627\u2d68\uc59e\u63f6\uf386\u2bf2\uc26d\u6538\uf1d2\u29a7\uc043\u68f8\uff1e"

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾇ:Ljava/util/regex/Pattern;

    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    add-int/lit8 v2, v2, 0x2c

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x10

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int v5, v5, 0x5e94

    int-to-char v5, v5

    invoke-static {v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾒ:Ljava/util/regex/Pattern;

    .line 20
    invoke-static {v0}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x3b

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0xe

    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    int-to-char v5, v5

    invoke-static {v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ:Ljava/util/regex/Pattern;

    .line 21
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    add-int/lit8 v2, v2, 0x4b

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    const/4 v5, 0x7

    add-int/2addr v4, v5

    const/16 v6, 0x30

    invoke-static {v0, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    add-int/lit16 v7, v7, 0x74d5

    int-to-char v7, v7

    invoke-static {v2, v4, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ:Ljava/util/regex/Pattern;

    .line 22
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    neg-int v2, v2

    const-string v4, "\u2578\u2526\u6371\u8d61\udc47\u5368\uf3da\u6d02\ud8b6\ude11\uf1c2\u68c9\ude34\ud9fb\uf77e\u6a9c\udc05\udbd5\ufaed\u644a\ud385\ud516\uf8fb\u6652\ud1c5\ud0a4\ufe60\u618d\ud71d\ud2fe\ufc2f\u6339\ucaf7\ucc44\ue3c6\u7d28\uc8ab"

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﱡ:Ljava/util/regex/Pattern;

    const/4 v2, 0x0

    .line 23
    invoke-static {v1, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v4

    cmpl-float v2, v4, v2

    add-int/2addr v2, v3

    const-string v4, "\u02ed\u02b3\u3fc3\uc79b\u8088\u6a43\ub967"

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻏ:Ljava/util/regex/Pattern;

    .line 24
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v2, v7, v9

    add-int/lit8 v2, v2, 0x53

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x8

    const/4 v7, 0x5

    rsub-int/lit8 v4, v4, 0x5

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    rsub-int v8, v8, 0x67fd

    int-to-char v8, v8

    invoke-static {v2, v4, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﺙ:Ljava/util/regex/Pattern;

    .line 29
    new-array v2, v5, [Ljava/lang/String;

    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x1

    const-string v5, "\u47c1\u47a8\ucd05\u60cc\u720e\u086f"

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    const/4 v5, 0x6

    shr-int/2addr v4, v5

    add-int/2addr v4, v3

    const-string v8, "\u7052\u7037\uc4b2\ub369\u7bb3\uf87c\ucdc0\uc65e"

    invoke-static {v8, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v4

    add-int/lit8 v4, v4, 0x57

    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v11

    cmp-long v8, v11, v9

    const/4 v9, 0x4

    add-int/2addr v8, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    rsub-int v10, v10, 0x4a7c

    int-to-char v10, v10

    invoke-static {v4, v8, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x2

    aput-object v4, v2, v8

    invoke-static {v0, v6, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v4

    add-int/lit8 v4, v4, 0x5c

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    add-int/2addr v6, v5

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    rsub-int v10, v10, 0x3163

    int-to-char v10, v10

    invoke-static {v4, v6, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x3

    aput-object v4, v2, v6

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v4

    add-int/2addr v4, v3

    const-string v3, "\u7ddc\u7daf\ue81c\uf047\u5704\u9d8b\u8eed\ua3a9\u801a"

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v9

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    add-int/lit8 v3, v3, 0x61

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/2addr v4, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    int-to-char v6, v6

    invoke-static {v3, v4, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v0, v1, v1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v3

    add-int/lit8 v3, v3, 0x64

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v0

    add-int/2addr v0, v7

    const/high16 v4, 0x1000000

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    add-int/2addr v6, v4

    int-to-char v4, v6

    invoke-static {v3, v0, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v5

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﱟ:Ljava/util/List;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    rem-int/2addr v0, v8

    if-eqz v0, :cond_0

    const/16 v0, 0x2f

    div-int/2addr v0, v1

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 160
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    rem-int/2addr v1, v0

    .line 156
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 157
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 158
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->end()I

    move-result p0

    invoke-virtual {p1, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 160
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    add-int/lit8 p1, p1, 0x5

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    const/16 p1, 0x4e

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static ｋ(IIC)Ljava/lang/String;
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

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮐ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮌ:J

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

.method private static ｋ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 2073
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    .line 2076
    :try_start_0
    sget-wide v1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭖ:J

    invoke-static {v1, v2, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﻛ(J[CI)[C

    move-result-object p0

    const/4 p1, 0x4

    .line 2081
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 2083
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    sub-int/2addr v1, p1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﾇ:I

    .line 2084
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    aget-char v2, p0, v2

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    rem-int/2addr v3, p1

    aget-char v3, p0, v3

    xor-int/2addr v2, v3

    int-to-long v2, v2

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﾇ:I

    int-to-long v4, v4

    sget-wide v6, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭖ:J

    mul-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-char v2, v2

    aput-char v2, p0, v1

    .line 2081
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    goto :goto_0

    .line 2088
    :cond_1
    new-instance v1, Ljava/lang/String;

    array-length v2, p0

    sub-int/2addr v2, p1

    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    .line 2089
    monitor-exit v0

    throw p0
.end method

.method private static ﾇ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 152
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    add-int/lit8 v1, v1, 0x6f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method public static ﾇ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/dy;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x2

    .line 148
    rem-int v4, v3, v3

    .line 33
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    .line 35
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v6, v8, :cond_18

    add-int/lit8 v8, v6, 0x1

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x1

    if-ge v8, v9, :cond_0

    .line 128
    sget v9, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    add-int/lit8 v9, v9, 0x33

    rem-int/lit16 v11, v9, 0x80

    sput v11, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    rem-int/2addr v9, v3

    move v9, v10

    goto :goto_1

    :cond_0
    move v9, v5

    :goto_1
    if-eqz v9, :cond_1

    .line 39
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    goto :goto_2

    :cond_1
    move v9, v5

    .line 41
    :goto_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0xa

    if-eq v11, v12, :cond_17

    const/16 v12, 0x25

    if-eq v11, v12, :cond_15

    const/16 v12, 0x5b

    if-eq v11, v12, :cond_15

    const/16 v12, 0x5d

    if-eq v11, v12, :cond_15

    const/16 v12, 0x7b

    if-eq v11, v12, :cond_15

    const/16 v12, 0x7d

    if-eq v11, v12, :cond_15

    const/16 v12, 0x21

    const/16 v14, 0x2d

    const-wide/16 v16, 0x0

    move/from16 v18, v3

    const-string v3, ""

    if-eq v11, v12, :cond_12

    const/16 v12, 0x22

    const-string v13, "\ub2ac\ub2e0\ua2d9\u4527\u1dd1\u74cf\u3b85\u4aed\u4f6a\u1fd7"

    if-eq v11, v12, :cond_10

    packed-switch v11, :pswitch_data_0

    packed-switch v11, :pswitch_data_1

    .line 106
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v9

    if-eqz v9, :cond_2

    goto/16 :goto_c

    .line 109
    :cond_2
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 110
    sget-object v11, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﱡ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 111
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 112
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 113
    sget-object v11, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻐ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 114
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    xor-int/2addr v12, v10

    if-eq v12, v10, :cond_3

    goto/16 :goto_5

    .line 148
    :cond_3
    sget v12, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    add-int/lit8 v12, v12, 0x39

    const/16 v21, 0x0

    rem-int/lit16 v15, v12, 0x80

    sput v15, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    rem-int/lit8 v12, v12, 0x2

    if-nez v12, :cond_4

    const/high16 v12, 0x3f800000    # 1.0f

    .line 115
    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    cmpl-float v12, v12, v15

    rsub-int/lit8 v12, v12, 0x71

    invoke-static {v5, v10, v5, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v15

    add-int/lit8 v15, v15, 0x4

    const/16 v19, 0x43e9

    invoke-static {v3, v14, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    shl-int v3, v19, v3

    int-to-char v3, v3

    invoke-static {v12, v15, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_4
    const/4 v12, 0x0

    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    move-result v14

    cmpl-float v14, v14, v12

    rsub-int/lit8 v12, v14, 0x9

    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v14

    add-int/lit8 v14, v14, 0x4

    const/16 v15, 0x30

    invoke-static {v3, v15, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    rsub-int v3, v3, 0x152

    int-to-char v3, v3

    invoke-static {v12, v14, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {v5, v5}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v14

    cmp-long v3, v14, v16

    neg-int v3, v3

    const-string v12, "\ufc19\ufc7f\uadfc\u1cfe\u12f0\u931f\u6248\uad2b\u01c8"

    invoke-static {v12, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eq v3, v10, :cond_6

    .line 117
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﱟ:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 118
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    goto :goto_6

    .line 116
    :cond_6
    :goto_4
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    goto :goto_6

    :cond_7
    :goto_5
    const/16 v21, 0x0

    .line 122
    :cond_8
    :goto_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 123
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 124
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 126
    :cond_9
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v10

    if-eq v3, v10, :cond_b

    .line 115
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    add-int/lit8 v3, v3, 0x2f

    rem-int/lit16 v9, v3, 0x80

    sput v9, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_a

    .line 127
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 128
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_7

    .line 127
    :cond_a
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 128
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    throw v21

    .line 130
    :cond_b
    :goto_7
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 131
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 132
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﺙ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 134
    :cond_c
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 135
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    .line 136
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻏ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 138
    :cond_d
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    .line 139
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    invoke-direct {v3, v9, v11, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v3

    goto/16 :goto_a

    .line 142
    :cond_e
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v5}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v9

    sub-int/2addr v10, v9

    invoke-static {v13, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    add-int/lit8 v10, v10, 0xd

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v11

    cmp-long v11, v11, v16

    add-int/lit8 v11, v11, 0x11

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    const v13, 0xe556

    add-int/2addr v12, v13

    int-to-char v12, v12

    invoke-static {v10, v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, 0x1f

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v11

    const/16 v20, 0x0

    cmpl-float v11, v11, v20

    rsub-int/lit8 v11, v11, 0xe

    const v12, 0x9a61

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v13

    add-int/2addr v13, v12

    int-to-char v12, v13

    invoke-static {v10, v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v5, v5}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v9

    cmp-long v9, v9, v16

    add-int/lit8 v9, v9, 0x6

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    cmp-long v10, v10, v16

    add-int/lit8 v10, v10, 0x3

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v9, v21

    invoke-static {v3, v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/cn;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_c

    .line 91
    :pswitch_0
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾒ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 92
    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾇ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 93
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    if-ne v8, v10, :cond_f

    .line 94
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 95
    new-instance v9, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v10, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v10, v8, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 97
    :cond_f
    new-instance v8, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-direct {v8, v9, v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :goto_8
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    goto/16 :goto_9

    .line 80
    :cond_10
    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾇ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﻛ(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_11

    .line 82
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v11

    add-int/2addr v11, v10

    invoke-static {v13, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    sub-int/2addr v10, v12

    const-string v12, "\ub3c4\ub381\ucb22\u5871\u743d\u73bd\u26d9\u4d95\u4e02\u7623\u248f\u4827\u48de\u7184\u225a\u4a7c\u4abf\u738b\u2ff4\u44aa\u4566\u7d76\u2db5\u46cd\u4760\u78b2\u2b5b\u4156\u418c\u7ae8\u2910\u43ab\u5c5c\u6412\u36d8\u5de0\u5e44"

    invoke-static {v12, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v3}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v10

    rsub-int/lit8 v10, v10, 0x4

    invoke-static/range {v16 .. v17}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v11

    rsub-int/lit8 v11, v11, 0x3

    invoke-static {v3, v3, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    int-to-char v3, v3

    invoke-static {v10, v11, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v9, v3, v6}, Lcom/ironsource/adqualitysdk/sdk/i/cn;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_c

    .line 86
    :cond_11
    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﾇ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 87
    new-instance v8, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-direct {v8, v9, v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    :goto_9
    add-int/lit8 v3, v3, 0x2

    :goto_a
    add-int/2addr v6, v3

    goto/16 :goto_d

    :cond_12
    :pswitch_1
    const/16 v11, 0x3d

    if-ne v9, v11, :cond_13

    .line 47
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    invoke-static {v5}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v12

    const/16 v20, 0x0

    cmpl-float v12, v12, v20

    add-int/2addr v12, v10

    const v10, 0xcc63

    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    move-result v13

    add-int/2addr v13, v10

    int-to-char v10, v13

    invoke-static {v11, v12, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v3, v8, v9, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_13
    :pswitch_2
    const/16 v11, 0x2b

    if-ne v9, v11, :cond_14

    .line 53
    new-instance v8, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    add-int/2addr v11, v10

    const/16 v15, 0x30

    invoke-static {v3, v15, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    add-int/lit8 v3, v3, 0x3

    invoke-static {v5, v5}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v12

    cmp-long v10, v12, v16

    const v12, 0xaab9

    sub-int/2addr v12, v10

    int-to-char v10, v12

    invoke-static {v11, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v9, v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v6, v6, 0x2

    goto :goto_d

    :cond_14
    :pswitch_3
    if-ne v9, v14, :cond_16

    .line 59
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    invoke-static {v5, v5}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v9

    cmp-long v9, v9, v16

    rsub-int/lit8 v9, v9, 0x2

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v10

    shr-int/lit8 v10, v10, 0x8

    add-int/lit8 v10, v10, 0x2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    const v12, 0x9c24

    add-int/2addr v11, v12

    int-to-char v11, v11

    invoke-static {v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ｋ(IIC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v3, v8, v9, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    move/from16 v18, v3

    .line 76
    :cond_16
    :pswitch_4
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/dy;

    sget-object v9, Lcom/ironsource/adqualitysdk/sdk/i/dy$c;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/dy$c;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v9, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/dy;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dy$c;Ljava/lang/String;I)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_c
    move v6, v8

    :goto_d
    move/from16 v3, v18

    goto/16 :goto_0

    :cond_17
    move/from16 v18, v3

    add-int/lit8 v7, v7, 0x1

    .line 115
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭴ:I

    add-int/lit8 v3, v3, 0x1f

    rem-int/lit16 v6, v3, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮉ:I

    rem-int/lit8 v3, v3, 0x2

    goto :goto_c

    :cond_18
    return-object v4

    :pswitch_data_0
    .packed-switch 0x27
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method static ﾇ()V
    .locals 2

    const/16 v0, 0x69

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮐ:[C

    const-wide v0, 0x30266225f5d48d08L    # 9.66533718980872E-77

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﮌ:J

    const-wide v0, -0x370a20fd60a74093L    # -3.048391133154472E43

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ds;->ﭖ:J

    return-void

    :array_0
    .array-data 2
        -0x33a2s
        -0x556fs
        0x2799s
        -0x63f7s
        0x1101s
        0x20s
        -0x729fs
        0x1a7es
        -0x58c8s
        0x127s
        -0x73d7s
        0x1b36s
        -0x59d2s
        -0x1afds
        0x6830s
        -0xccs
        0x422bs
        -0x2eebs
        0x2411s
        -0x54ffs
        0x3e00s
        -0x7281s
        0x1064s
        0x6763s
        -0x1596s
        0x7916s
        -0x33a3s
        0x534es
        -0x59b1s
        0x35a4s
        -0x4702s
        -0x65bfs
        0x1708s
        -0x7ffbs
        0x3d59s
        -0x51cfs
        0x5b26s
        -0x2bdes
        0x4130s
        -0xdabs
        0x6f40s
        0x185es
        -0x6aa9s
        0x621s
        0x5ecas
        -0x2c45s
        0x44acs
        -0x64ds
        0x6a8es
        -0x6020s
        0x10f8s
        -0x7a75s
        0x36a8s
        -0x5479s
        -0x2366s
        0x51ebs
        -0x3d57s
        0x77d5s
        -0x1732s
        0x1dcbs
        0x5es
        -0x72ads
        0x1a20s
        -0x58cbs
        0x3419s
        -0x3e8bs
        0x4e1bs
        -0x249cs
        0x686es
        -0xaeds
        -0x7da0s
        0xf75s
        -0x63a7s
        0x2935s
        -0x49a5s
        0x748as
        -0x679s
        0x6ef4s
        -0x2c1fs
        0x40cds
        -0x4a5fs
        0x3acfs
        0x67a3s
        -0x1557s
        0x7d91s
        -0x3f47s
        0x53a1s
        0x4a12s
        -0x38ffs
        0x5000s
        -0x12f8s
        0x3111s
        -0x43f2s
        0x2b07s
        -0x69f2s
        0x531s
        -0xfdbs
        0x74s
        -0x7286s
        0x1a69s
        0x63s
        -0x7297s
        0x1a64s
        -0x5885s
        0x3448s
    .end array-data
.end method
