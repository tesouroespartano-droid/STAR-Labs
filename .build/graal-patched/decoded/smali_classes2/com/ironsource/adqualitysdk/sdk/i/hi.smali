.class public final enum Lcom/ironsource/adqualitysdk/sdk/i/hi;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/adqualitysdk/sdk/i/hi;",
        ">;"
    }
.end annotation


# static fields
.field private static ﭖ:I = 0x0

.field private static ﭴ:I = 0x1

.field private static final synthetic ﭸ:[Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static ﮌ:I

.field private static enum ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

.field private static enum ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hi;


# instance fields
.field private final ﻏ:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾒ()V

    .line 4
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v3

    cmpl-float v3, v3, v2

    const/4 v4, 0x2

    rsub-int/lit8 v3, v3, 0x2

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v5

    const/16 v6, 0x8

    shr-int/2addr v5, v6

    add-int/lit16 v5, v5, 0xb6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v7

    cmpl-float v7, v7, v2

    rsub-int/lit8 v7, v7, 0x8

    const-string v8, "\u0007\ufffe\u0005\ufffe\ufffb\ufffe\uffff"

    invoke-static {v8, v3, v5, v1, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v5, -0x1

    invoke-direct {v0, v3, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 5
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v3

    const/4 v5, 0x3

    rsub-int/lit8 v3, v3, 0x3

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v7

    cmpl-float v2, v7, v2

    rsub-int v2, v2, 0xaf

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v7

    const/4 v8, 0x7

    add-int/2addr v7, v8

    const-string v9, "\ufff8\u0000\u0005\ufffb\u0006\u0004"

    invoke-static {v9, v3, v2, v1, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 6
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0xc

    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v7

    add-int/lit16 v7, v7, 0xaf

    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v9, v9, v11

    add-int/lit8 v9, v9, 0xd

    const-string v10, "\u0007\ufff8\ufffa\u0002\ufff8\ufffe\ufffc\u0016\u0005\ufff8\u0004\ufffc"

    invoke-static {v10, v2, v7, v1, v9}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 7
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v2

    shr-int/2addr v2, v6

    add-int/lit8 v2, v2, 0x9

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int v7, v7, 0xb2

    const-string v9, ""

    invoke-static {v9, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v10

    rsub-int/lit8 v10, v10, 0x9

    const-string v13, "\ufff8\ufffd\u0013\u0002\u0003\u000e\ufff5\u0001\ufff5"

    invoke-static {v13, v2, v7, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 8
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    const/16 v2, 0x30

    invoke-static {v9, v2, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v7

    const/4 v10, 0x4

    add-int/2addr v7, v10

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v13

    int-to-byte v13, v13

    rsub-int v13, v13, 0xb3

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v14

    rsub-int/lit8 v14, v14, 0x9

    const-string v15, "\u0011\ufffb\ufff6\ufffb\u0006\u0007\u0000\ufff7\u0005"

    invoke-static {v15, v7, v13, v1, v14}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7, v10, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 9
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v9}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x9

    invoke-static {v9, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    rsub-int v7, v7, 0xb1

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v13

    shr-int/lit8 v13, v13, 0x10

    add-int/2addr v13, v6

    const-string v14, "\ufff9\u0001\ufff5\u0002\u0013\u0004\u0004\ufff5"

    invoke-static {v14, v5, v7, v3, v13}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x5

    invoke-direct {v0, v5, v7, v10}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 10
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v5

    int-to-byte v5, v5

    neg-int v5, v5

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    rsub-int v10, v10, 0xaf

    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v13

    cmp-long v13, v13, v11

    const/4 v14, 0x6

    add-int/2addr v13, v14

    const-string v15, "\ufffb\u000b\ufffa\ufffc\t\u0000"

    invoke-static {v15, v5, v10, v3, v13}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5, v14, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 11
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v15

    cmp-long v5, v15, v11

    neg-int v5, v5

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    add-int/lit16 v7, v7, 0xb0

    invoke-static {v9, v2, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v2

    add-int/lit8 v2, v2, 0xb

    const-string v10, "\ufff8\ufffb\u0003\ufff7\u0004\u0015\ufffa\u0004\ufff7\u0008"

    invoke-static {v10, v5, v7, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v8, v14}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 12
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v2

    neg-int v2, v2

    invoke-static {v9, v1, v1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v1

    rsub-int v1, v1, 0xb1

    invoke-static {v11, v12}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v5

    add-int/lit8 v5, v5, 0xa

    const-string v7, "\ufff7\ufff9\ufffe\u0014\ufffa\u0001\ufff9\u0003\n"

    invoke-static {v7, v2, v1, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v6, v8}, Lcom/ironsource/adqualitysdk/sdk/i/hi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 3
    sget-object v15, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v16, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v17, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v18, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v19, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v20, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v21, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget-object v22, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    move-object/from16 v23, v0

    filled-new-array/range {v15 .. v23}, [Lcom/ironsource/adqualitysdk/sdk/i/hi;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭸ:[Lcom/ironsource/adqualitysdk/sdk/i/hi;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    rem-int/2addr v0, v4

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻏ:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/hi;
    .locals 3

    const/4 v0, 0x2

    .line 3
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    rem-int/2addr v1, v0

    const-class v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public static values()[Lcom/ironsource/adqualitysdk/sdk/i/hi;
    .locals 3

    const/4 v0, 0x2

    .line 3
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    rem-int/2addr v1, v0

    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭸ:[Lcom/ironsource/adqualitysdk/sdk/i/hi;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, [Lcom/ironsource/adqualitysdk/sdk/i/hi;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object v0

    :cond_0
    invoke-virtual {v0}, [Lcom/ironsource/adqualitysdk/sdk/i/hi;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/adqualitysdk/sdk/i/hi;

    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public static ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/hi;
    .locals 4

    const/4 v0, 0x2

    .line 39
    rem-int v1, v0, v0

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    return-object v1

    .line 37
    :pswitch_0
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 39
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    add-int/lit8 v1, v1, 0x67

    :goto_0
    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    rem-int/2addr v1, v0

    return-object p0

    .line 35
    :pswitch_1
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    .line 33
    :pswitch_2
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    .line 31
    :pswitch_3
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 39
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    add-int/lit8 v1, v1, 0x15

    goto :goto_0

    .line 29
    :pswitch_4
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    .line 39
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    add-int/lit8 v2, v2, 0x6f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object p0

    :cond_0
    throw v1

    .line 27
    :pswitch_5
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    .line 25
    :pswitch_6
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    .line 23
    :pswitch_7
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    .line 21
    :pswitch_8
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/hi;

    return-object p0

    :pswitch_data_0
    .packed-switch -0x1
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

.method private static ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;
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

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﮌ:I

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

.method static ﾒ()V
    .locals 1

    const/16 v0, 0x66

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﮌ:I

    return-void
.end method


# virtual methods
.method public final ﻛ()I
    .locals 4

    const/4 v0, 0x2

    .line 48
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻏ:I

    const/16 v3, 0x44

    div-int/lit8 v3, v3, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﻏ:I

    :goto_0
    add-int/lit8 v2, v2, 0x1f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hi;->ﭴ:I

    rem-int/2addr v2, v0

    return v1
.end method
