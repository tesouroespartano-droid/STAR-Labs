.class final Lcom/ironsource/adqualitysdk/sdk/i/jh$9;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﾒ(Landroid/view/MotionEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:[B = null

.field private static ﱟ:I = 0x0

.field private static ﱡ:I = 0x1

.field private static ﻏ:[S = null

.field private static ﻐ:I = -0x36c6a38b

.field private static ﾇ:I = 0x3

.field private static ﾒ:I = -0x64f965f2


# instance fields
.field private synthetic ﻛ:Landroid/view/MotionEvent;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5e

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﮐ:[B

    return-void

    :array_0
    .array-data 1
        0x17t
        -0x61t
        0x47t
        0x4et
        -0x67t
        -0x70t
        -0x51t
        0x3ct
        -0x70t
        0x4at
        -0x6ct
        0x4ct
        -0x64t
        -0x69t
        -0x60t
        0x39t
        -0x68t
        0x33t
        -0x65t
        -0x5at
        0x35t
        -0x6at
        0x42t
        0x4et
        -0x62t
        0x78t
        0x2et
        -0x6ct
        0x41t
        0x20t
        -0x17t
        0x2et
        -0x34t
        0x2ct
        -0x1et
        -0x1et
        0x2dt
        -0x24t
        -0x21t
        -0x15t
        -0x64t
        -0x76t
        -0x18t
        0x31t
        0x36t
        -0x1ft
        -0x16t
        -0x63t
        0x75t
        0x30t
        -0x58t
        -0x75t
        0x38t
        -0x1ft
        -0x58t
        0x7bt
        0x38t
        0x48t
        -0x16t
        -0x1dt
        -0x23t
        0x39t
        0x2ct
        -0x73t
        -0x75t
        -0x1ft
        -0x1at
        0x48t
        -0x32t
        -0x5et
        0x77t
        -0x1et
        0x49t
        -0x1ft
        -0x2ct
        -0x1t
        0x66t
        -0x2t
        0xdt
        -0x7dt
        -0x26t
        -0x7et
        -0x7bt
        -0x1et
        -0x17t
        0x39t
        0x2et
        -0x7dt
        0x37t
        0x1at
        0x7dt
        -0x15t
        -0x80t
        -0x65t
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/MotionEvent;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻛ:Landroid/view/MotionEvent;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ｋ(IBIIS)Ljava/lang/String;
    .locals 6

    .line 1200
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 1202
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﾇ:I

    add-int/2addr p2, v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p2, v3, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_2

    .line 1209
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﮐ:[B

    if-eqz p2, :cond_1

    .line 1211
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﾒ:I

    add-int/2addr v3, p0

    aget-byte p2, p2, v3

    add-int/2addr p2, v2

    int-to-byte p2, p2

    goto :goto_0

    .line 1217
    :cond_1
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻏ:[S

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﾒ:I

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
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﾒ:I

    add-int/2addr p0, v2

    add-int/2addr p0, v4

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    .line 1227
    sput-byte p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    .line 1230
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻐ:I

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﮐ:[B

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻏ:[S

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
    .locals 18

    move-object/from16 v1, p0

    const/4 v0, 0x2

    .line 233
    rem-int v2, v0, v0

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﱟ:I

    add-int/lit8 v2, v2, 0xf

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﱡ:I

    rem-int/2addr v2, v0

    const/16 v3, 0x30

    const v4, 0x64f965f2

    const/4 v5, 0x0

    const-string v6, ""

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_2

    .line 222
    :try_start_0
    iget-object v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻛ:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 223
    iget-object v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻛ:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v12

    .line 224
    invoke-static {v11, v12}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾒ(II)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 225
    new-instance v10, Lcom/ironsource/adqualitysdk/sdk/i/ih;

    .line 226
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jv;->ﻛ()J

    move-result-wide v13

    .line 227
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jv;->ﾒ()J

    move-result-wide v15

    invoke-direct/range {v10 .. v16}, Lcom/ironsource/adqualitysdk/sdk/i/ih;-><init>(IIJJ)V

    .line 228
    iget-object v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-static {v2, v10}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jh;Lcom/ironsource/adqualitysdk/sdk/i/ih;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﱡ:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﱟ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    throw v5

    .line 230
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    add-int/2addr v0, v4

    invoke-static {v9}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x2d

    int-to-byte v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, -0x4

    invoke-static {v9}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v10

    const v13, 0x36c6a3d2

    sub-int/2addr v13, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, -0x70

    int-to-short v10, v10

    invoke-static {v0, v2, v5, v13, v10}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    invoke-static {v9, v5, v5}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v10

    cmpl-float v10, v10, v5

    const v13, 0x64f9660c

    sub-int/2addr v13, v10

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v10

    cmpl-float v10, v10, v5

    rsub-int/lit8 v10, v10, 0x54

    int-to-byte v10, v10

    invoke-static {v9, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v14

    add-int/lit8 v14, v14, -0x4

    invoke-static {v6, v3, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v15

    const v16, 0x36c6a3de

    sub-int v15, v16, v15

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    shr-int/lit8 v16, v16, 0x10

    move/from16 v17, v4

    rsub-int/lit8 v4, v16, 0x74

    int-to-short v4, v4

    :try_start_2
    invoke-static {v13, v10, v14, v15, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v9}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    const v10, 0x64f9663d

    sub-int/2addr v10, v4

    invoke-static {v9, v9}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v4

    add-int/lit8 v4, v4, -0x3a

    int-to-byte v4, v4

    invoke-static {v9, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v11

    add-int/lit8 v11, v11, -0x4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v13

    shr-int/lit8 v13, v13, 0x8

    const v14, 0x36c6a3b7

    sub-int/2addr v14, v13

    invoke-static {v9}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v13

    cmpl-float v13, v13, v5

    rsub-int/lit8 v13, v13, -0x34

    int-to-short v13, v13

    invoke-static {v10, v4, v11, v14, v13}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v4

    cmpl-float v4, v4, v5

    const v10, 0x64f9663e

    add-int/2addr v4, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v10

    cmpl-float v5, v10, v5

    add-int/lit8 v5, v5, 0x29

    int-to-byte v5, v5

    invoke-static {v9}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v10

    cmp-long v10, v10, v7

    add-int/lit8 v10, v10, -0x4

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v11

    cmp-long v11, v11, v7

    const v12, 0x36c6a409

    sub-int/2addr v12, v11

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v13

    cmp-long v11, v13, v7

    add-int/lit8 v11, v11, 0x7

    int-to-short v11, v11

    invoke-static {v4, v5, v10, v12, v11}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    move/from16 v17, v4

    goto :goto_0

    :cond_2
    move/from16 v17, v4

    .line 222
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻛ:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 223
    iget-object v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ﻛ:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 224
    invoke-static {v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾒ(II)Z

    invoke-super {v5}, Ljava/lang/Object;->hashCode()I

    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 233
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int v2, v2, v17

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v4

    cmp-long v4, v4, v7

    rsub-int/lit8 v4, v4, 0x2e

    int-to-byte v4, v4

    invoke-static {v6, v9, v9}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x4

    const v10, 0x36c6a3d3

    invoke-static {v9}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v11

    add-int/2addr v11, v10

    const v10, 0xffff90

    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v12

    add-int/2addr v12, v10

    int-to-short v10, v12

    invoke-static {v2, v4, v5, v11, v10}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const v4, 0x64f96640

    invoke-static {v9, v9}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v6, v3, v9, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    rsub-int/lit8 v3, v3, -0x36

    int-to-byte v3, v3

    invoke-static {v9}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v4

    rsub-int/lit8 v4, v4, -0x4

    const v6, 0x36c6a3d0

    invoke-static {v9, v9}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v10

    sub-int/2addr v6, v10

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v10

    cmp-long v7, v10, v7

    add-int/lit8 v7, v7, 0x4a

    int-to-short v7, v7

    invoke-static {v5, v3, v4, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/jh$9;->ｋ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method
