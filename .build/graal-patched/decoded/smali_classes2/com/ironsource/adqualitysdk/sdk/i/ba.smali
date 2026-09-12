.class public final Lcom/ironsource/adqualitysdk/sdk/i/ba;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﭖ:I = 0x1

.field private static ﮉ:I

.field private static ﮐ:[S

.field private static ﱟ:C

.field private static ﱡ:[B

.field private static ﺙ:J

.field private static ﻏ:I

.field private static ﻐ:I

.field private static ﻛ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static ｋ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/adqualitysdk/sdk/i/gk;",
            ">;>;"
        }
    .end annotation
.end field

.field private static ﾇ:I

.field private static ﾒ:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻏ()V

    const/4 v0, 0x3

    .line 47
    new-array v0, v0, [Ljava/lang/String;

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    const v2, 0x638fb125

    sub-int/2addr v2, v1

    const/16 v1, 0x30

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static {v4, v1, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    rsub-int/lit8 v1, v1, -0x1

    int-to-byte v1, v1

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v3

    add-int/lit8 v3, v3, -0x6

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    const v6, 0x2e56e70

    sub-int/2addr v6, v5

    const/4 v5, 0x0

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    int-to-short v5, v5

    invoke-static {v2, v1, v3, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    const v2, -0x34240d1e    # -2.8829124E7f

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    int-to-char v1, v1

    const-string v3, "\uaed3\u0296\uc61f\u3a3c\udf1b$\u664c\u4590\ud82e\u3bb8\ue5e3"

    const-string v5, "\ue288\udbf2\ua8cb\u210e"

    const-string v6, "\u0000\u0000\u0000\u0000"

    invoke-static {v3, v2, v5, v6, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long v1, v1, v7

    const v2, 0x75c261d7

    add-int/2addr v1, v2

    const v2, 0x9dc1

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-char v2, v2

    const-string v3, "\ue091\u8647\ub1d6\ua323\u397a\u6d8f\u3bef\u8f3c\u9d00\ub662\u0673\uf33f\u8726\u1224\u434e"

    const-string v5, "\ud860\uc261\uc175\u479d"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ:Ljava/util/List;

    .line 51
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 52
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v1

    cmp-long v1, v1, v7

    const v2, -0xc6c9de6

    add-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v7

    const v3, 0xe469

    sub-int/2addr v3, v2

    int-to-char v2, v3

    const-string v3, "\u68aa\u30d6\u3f0e\ueaf8\uf6db"

    const-string v5, "\u1b92\u9362\u68f3\u75e4"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/fw;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/fw;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb133

    const/4 v2, 0x0

    .line 53
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    add-int/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v1

    int-to-byte v1, v1

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x6

    const v5, 0x2e56e6f

    const/16 v7, 0x30

    invoke-static {v4, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    sub-int/2addr v5, v7

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    rsub-int/lit8 v7, v7, 0x1

    int-to-short v7, v7

    invoke-static {v2, v1, v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gc;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gc;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 54
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-char v2, v2

    const-string v3, "\u1550\ued0a\u7cf2\u222a\u70a4\u7f53\u6d5d\u62a6"

    const-string v5, "\u0c4e\uc783\u9b72\uf55b"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/fy;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/fy;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x4584dab3

    const/4 v2, 0x0

    .line 55
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    int-to-char v2, v2

    const-string v3, "\u97b2\u3e9d\uacb1\udd0c\u5a7f\ufc45\u1615\u0ff0\uf678"

    const-string v5, "\ub3b0\u84da\uae45\ucb0a"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gf$e;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gf$e;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gf$c;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gf$c;-><init>()V

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long v1, v1, v7

    add-int/lit8 v1, v1, -0x1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    int-to-char v2, v2

    const-string v3, "\u586f\u45c1\ua2b0\ue562\u47e8\u781f\u731b\u072e\u2b79\udcad"

    const-string v5, "\u7a6d\uc949\u62aa\u7459"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gd;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gd;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 57
    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    rsub-int/lit8 v2, v2, 0x1

    int-to-char v2, v2

    const-string v3, "\uad2d\u3678\u7a9d\ue93d\u65d1\u7306\uc31d\ueaca\u1536\u7b9c"

    const-string v5, "\u236c\ub226\u4e3c\u60f0"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gh;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gh;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v1

    cmp-long v1, v1, v7

    const v2, 0x638fb13b

    add-int/2addr v1, v2

    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v2

    int-to-byte v2, v2

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x6

    const v5, 0x2e56e75

    const/4 v7, 0x0

    invoke-static {v7, v7}, Landroid/view/View;->resolveSize(II)I

    move-result v7

    add-int/2addr v7, v5

    const/16 v5, 0x30

    const/4 v8, 0x0

    invoke-static {v4, v5, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-short v5, v5

    invoke-static {v1, v2, v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gg;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gg;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, -0x13201d5

    .line 59
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v2

    const-wide/16 v7, -0x1

    cmp-long v2, v2, v7

    rsub-int/lit8 v2, v2, 0x1

    int-to-char v2, v2

    const-string v3, "\u510f\uf99c\u8a32\u962e\u90af\u97ca\u76e3"

    const-string v5, "\u2cad\ucdfe\u4dfe\u8dc8"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ge;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ge;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb144

    const/4 v2, 0x0

    .line 60
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v1

    rsub-int/lit8 v1, v1, -0x1

    int-to-byte v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, -0x6

    const v5, 0x2e56e76

    const/16 v7, 0x30

    const/4 v8, 0x0

    invoke-static {v4, v7, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v7

    add-int/2addr v7, v5

    const/16 v5, 0x30

    invoke-static {v4, v5, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-short v5, v5

    invoke-static {v2, v1, v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gi;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gi;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x30

    .line 61
    invoke-static {v4, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    rsub-int/lit8 v1, v1, -0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int v2, v2, 0x1e44

    int-to-char v2, v2

    const-string v3, "\ue545\ucbbc\ud08e\u67f2\u3d7c\u96d9"

    const-string v5, "\u7cdf\uc1c5\u44f9\u701e"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gm;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gm;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 62
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    const v2, 0x937d

    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-char v2, v2

    const-string v3, "\u6e56\u07b4\ua9b6\u744d\u2e02\u54cc"

    const-string v5, "\u3be6\ue85c\u7d22\uf493"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gl;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gl;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, -0x32eedea6

    const/16 v2, 0x30

    .line 63
    invoke-static {v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    add-int/2addr v2, v1

    const/16 v1, 0x30

    const/4 v3, 0x0

    invoke-static {v4, v1, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    rsub-int/lit8 v1, v1, -0x1

    int-to-char v1, v1

    const-string v3, "\ud0e8\ud0a9\u527c\ud56b\uff46\u01e7\udb22\udc9c\u6c2f\u1523\u64d5"

    const-string v5, "\u5955\u1121\u32cd\u5668"

    invoke-static {v3, v2, v5, v6, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gj;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gj;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb14a

    const/4 v2, 0x0

    .line 64
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-byte v2, v2

    const/4 v3, 0x0

    invoke-static {v5, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v3

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    rsub-int/lit8 v3, v3, -0x6

    const v5, 0x2e56e78

    const/4 v7, 0x0

    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    sub-int/2addr v5, v7

    const/4 v7, 0x0

    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v7

    cmp-long v7, v7, v9

    int-to-short v7, v7

    invoke-static {v1, v2, v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/go;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/go;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 65
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/16 v2, 0x30

    invoke-static {v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    rsub-int v2, v2, 0x5710

    int-to-char v2, v2

    const-string v3, "\u5a8e\u6fb6\ua096\u5761"

    const-string v5, "\ua188\ua3ed\u1122\u2d57"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gr;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gr;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long v1, v1, v7

    const v2, -0x3590f3bf

    add-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    int-to-char v2, v2

    const-string v3, "\u93ac\u077f\u972b\u054a\u2ff0\uf639\ua14d\uc8ce\uf0f1"

    const-string v5, "\u42fe\u6f0c\uc9ca\u0bb4"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gn$e;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gn$e;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gn$d;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gn$d;-><init>()V

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 67
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v2

    add-int/lit16 v2, v2, 0x70f8

    int-to-char v2, v2

    const-string v3, "\u014b\u54c0\u0aa6\u731e\uc736\u4279"

    const-string v5, "\u7ae7\ub22a\uf851\ua570"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gq;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gq;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb154

    .line 68
    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v1, v2

    const/high16 v2, 0x1000000

    const/4 v3, 0x0

    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    add-int/2addr v3, v2

    int-to-byte v2, v3

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x6

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    const v7, 0x2e56e7c

    sub-int/2addr v7, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    int-to-short v5, v5

    invoke-static {v1, v2, v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gp;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gp;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, -0x7c53e340

    .line 69
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v1, v2

    const v2, 0xb0d3

    const/16 v3, 0x30

    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v3

    sub-int/2addr v2, v3

    int-to-char v2, v2

    const-string v3, "\ua4b9\u8330\u9126\u37f7\u287b"

    const-string v5, "\uc1cb\uac1c\ua383\ua0b0"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gt;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gt;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gt$b;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gt$b;-><init>()V

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb15d

    .line 70
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    rsub-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    const/4 v3, 0x0

    invoke-static {v4, v4, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x6

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v5

    const/4 v7, 0x0

    cmpl-float v5, v5, v7

    const v7, 0x2e56e7e

    add-int/2addr v5, v7

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v7

    rsub-int/lit8 v7, v7, -0x1

    int-to-short v7, v7

    invoke-static {v2, v1, v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gv;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gv;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x30

    .line 71
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    shr-int/lit8 v2, v2, 0x16

    const v3, 0xc31e    # 6.9995E-41f

    add-int/2addr v2, v3

    int-to-char v2, v2

    const-string v3, "\u9723\u4a54\u9d26\u8d7e\u1326\u23eb"

    const-string v5, "\ue0be\u16dc\u1eee\u5ac3"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gw;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gw;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb164

    const/16 v2, 0x30

    const/4 v3, 0x0

    .line 72
    invoke-static {v4, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-byte v2, v2

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v3

    add-int/lit8 v3, v3, -0x6

    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    move-result v5

    const v7, 0x2e56e82

    sub-int/2addr v7, v5

    const/4 v5, 0x0

    invoke-static {v5}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v5

    const/4 v8, 0x0

    cmpl-float v5, v5, v8

    int-to-short v5, v5

    invoke-static {v1, v2, v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gs;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gs;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 73
    invoke-static {v2, v1, v1}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const v2, 0x638fb171

    sub-int/2addr v2, v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    cmp-long v1, v7, v9

    add-int/lit8 v1, v1, -0x1

    int-to-byte v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, -0x6

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v7

    cmp-long v5, v7, v9

    const v7, 0x2e56e82

    add-int/2addr v5, v7

    const/16 v7, 0x30

    invoke-static {v4, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    int-to-short v7, v7

    invoke-static {v2, v1, v3, v5, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gu;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gu;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x638fb177

    const/4 v2, 0x0

    .line 74
    invoke-static {v4, v4, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x6

    const/16 v5, 0x30

    invoke-static {v4, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v5

    const v7, 0x2e56e82

    sub-int/2addr v7, v5

    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-short v5, v5

    invoke-static {v2, v1, v3, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gz;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gz;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x30

    .line 75
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v1

    rsub-int/lit8 v1, v1, 0x30

    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    rsub-int/lit8 v2, v2, -0x1

    int-to-char v2, v2

    const-string v3, "\u2921\u5f03\u2cc9\uc649\ub563\ufee9\ueb31\u2111"

    const-string v5, "\uc3d3\u787c\ub39a\u4167"

    invoke-static {v3, v1, v5, v6, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gy;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gy;-><init>()V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gy$e;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gy$e;-><init>()V

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 76
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    shr-int/lit8 v1, v1, 0x6

    const v2, 0x638fb17e

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v1, v1}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    int-to-byte v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, -0x6

    const v5, 0x2e56e84

    const/16 v6, 0x30

    invoke-static {v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    sub-int/2addr v5, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-short v4, v4

    invoke-static {v2, v1, v3, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gx$c;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gx$c;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/gx$b;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/gx$b;-><init>()V

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    const v2, 0x638fb184

    sub-int/2addr v2, v1

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v1

    int-to-byte v1, v1

    add-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    rsub-int/lit8 v3, v3, -0x6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v4

    shr-int/lit8 v4, v4, 0x8

    const v5, 0x2e56e88

    sub-int/2addr v5, v4

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v4

    int-to-byte v4, v4

    add-int/lit8 v4, v4, 0x1

    int-to-short v4, v4

    invoke-static {v2, v1, v3, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/hb;

    invoke-direct {v3}, Lcom/ironsource/adqualitysdk/sdk/i/hb;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ｋ:Ljava/util/Map;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    add-int/lit8 v0, v0, 0x5b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    rem-int/lit8 v0, v0, 0x2

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static ﻏ()V
    .locals 2

    const v0, -0x638fb116

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾇ:I

    const/4 v0, 0x5

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻐ:I

    const v0, -0x2e56e2f

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ:I

    const/16 v0, 0x74

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﱡ:[B

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﺙ:J

    const/4 v0, 0x0

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻏ:I

    const v0, 0x8bf9

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﱟ:C

    return-void

    nop

    :array_0
    .array-data 1
        0xat
        -0x1t
        -0xdt
        0x11t
        -0x7t
        0x15t
        -0x26t
        0x5t
        0xbt
        -0x3t
        0xbt
        -0x14t
        0x24t
        -0x13t
        0x23t
        0x9t
        0x7t
        0x3t
        -0xbt
        0x1ft
        -0xft
        -0x1t
        -0xdt
        0x11t
        -0x7t
        0x15t
        0x2t
        -0x13t
        0x23t
        0x4t
        0x3t
        0x2ft
        -0x2dt
        -0x1t
        -0xbt
        0x19t
        -0xct
        0x2ct
        0x3t
        -0x4t
        0x0t
        0xdt
        -0x3t
        0x2t
        0x2t
        0x1bt
        0x1t
        0x23t
        -0x24t
        -0x11t
        0xdt
        0x23t
        0x5t
        0x2t
        -0xft
        -0x3t
        0x6t
        0x1ct
        -0x1bt
        -0x1t
        -0x3t
        0x29t
        0x3t
        0xft
        -0x2t
        -0xbt
        0x11t
        0xdt
        -0x25t
        0x2ct
        0x4t
        -0x11t
        0xdt
        -0xbt
        0x13t
        0x13t
        -0x14t
        -0x13t
        0x25t
        0x7t
        -0x8t
        -0x2t
        -0x4t
        0xet
        -0x12t
        0x36t
        -0x31t
        0xdt
        -0xbt
        -0x5t
        0x22t
        0x1t
        0xat
        0x5t
        -0x6t
        0xft
        0xdt
        0x2t
        0x6t
        0x9t
        0x2t
        -0xbt
        0x9t
        0x11t
        0x1t
        -0x7t
        0x5t
        -0x7t
        -0x7t
        0x1ft
        0x1t
        0x13t
        0x1t
        -0xat
        0xdt
        0x8t
    .end array-data
.end method

.method static ﻐ()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/gk;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 100
    rem-int v1, v0, v0

    .line 86
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ｋ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 87
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 88
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 89
    sget-object v4, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ｋ:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_0

    .line 91
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 92
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 100
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    add-int/lit8 v6, v6, 0xd

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    rem-int/2addr v6, v0

    .line 92
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ironsource/adqualitysdk/sdk/i/gk;

    .line 93
    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/gk;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 100
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v7, v7, 0x63

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v7, v0

    .line 94
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 97
    :cond_2
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method static ﻛ()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x2

    .line 104
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    add-int/lit8 v1, v1, 0x33

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    rem-int/2addr v1, v0

    const v1, 0x638fb115

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v4

    sub-int/2addr v1, v4

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    rsub-int/lit8 v4, v4, 0x1

    int-to-byte v4, v4

    const/4 v5, 0x0

    const-string v6, ""

    invoke-static {v6, v5}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v5

    add-int/lit8 v5, v5, -0x6

    const v7, 0x2e56e6f

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v2

    sub-int/2addr v7, v2

    invoke-static {v6}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    int-to-short v2, v2

    invoke-static {v1, v4, v5, v7, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    add-int/lit8 v2, v2, 0x45

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    rem-int/2addr v2, v0

    return-object v1
.end method

.method private static ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
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

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﺙ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻏ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﱟ:C

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

.method private static varargs ﻛ([Lcom/ironsource/adqualitysdk/sdk/i/gk;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/ironsource/adqualitysdk/sdk/i/gk;",
            ")",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/adqualitysdk/sdk/i/gk;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 82
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    add-int/lit8 v1, v1, 0x69

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method public static ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/gk;)Z
    .locals 4

    const/4 v0, 0x2

    .line 133
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 124
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/Prode;->ﻛ()Z

    move-result v1

    const/16 v3, 0x36

    div-int/2addr v3, v2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/Prode;->ﻛ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 125
    :goto_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/gk;->ｋ()Ljava/lang/Class;

    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/gk;->ﾇ()Ljava/lang/String;

    move-result-object p0

    .line 128
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    :goto_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 p0, p0, 0x47

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    throw p0

    :catchall_0
    return v2
.end method

.method static ｋ()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/gk;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 116
    rem-int v1, v0, v0

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/ironsource/adqualitysdk/sdk/i/gk;

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/fz;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/fz;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/gb;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/gb;-><init>()V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/fv;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/fv;-><init>()V

    aput-object v2, v1, v0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v2, v2, 0x67

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v2, v0

    return-object v1
.end method

.method static ﾇ()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 108
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻛ:Ljava/util/List;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method static ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/gk;
    .locals 4

    const/4 v0, 0x2

    .line 112
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ga;

    invoke-direct {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ga;-><init>()V

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮉ:I

    add-int/lit8 v2, v2, 0x6b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﭖ:I

    rem-int/2addr v2, v0

    return-object v1
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
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﻐ:I

    add-int/2addr p2, v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p2, v3, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_2

    .line 1209
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﱡ:[B

    if-eqz p2, :cond_1

    .line 1211
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾇ:I

    add-int/2addr v3, p0

    aget-byte p2, p2, v3

    add-int/2addr p2, v2

    int-to-byte p2, p2

    goto :goto_0

    .line 1217
    :cond_1
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮐ:[S

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾇ:I

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
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾇ:I

    add-int/2addr p0, v2

    add-int/2addr p0, v4

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    .line 1227
    sput-byte p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    .line 1230
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﾒ:I

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﱡ:[B

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/ba;->ﮐ:[S

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
