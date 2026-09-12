.class public final Lcom/ironsource/adqualitysdk/sdk/i/jy;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﭖ:J = 0x0L

.field private static ﭴ:[S = null

.field private static ﭸ:I = 0x0

.field private static ﮌ:I = 0x1

.field private static ﮐ:[B = null

.field private static ﱟ:Ljava/lang/reflect/Field; = null

.field private static ﱡ:I = -0x358f995d

.field private static ﺙ:I = 0x58

.field private static ﻏ:I = -0x1fe316bf

.field private static ﻐ:Ljava/lang/reflect/Field;

.field private static ﻛ:Ljava/lang/reflect/Field;

.field private static ｋ:Ljava/lang/Class;

.field private static ﾇ:Ljava/lang/reflect/Field;

.field private static ﾒ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xcd

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮐ:[B

    const-wide v0, -0x2dfcc4fe01fb031aL    # -1.195471759352499E87

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭖ:J

    return-void

    nop

    :array_0
    .array-data 1
        -0x3at
        -0x4t
        0x3t
        0x24t
        -0x29t
        0xdt
        -0x2t
        0x6t
        -0xdt
        0xdt
        0x14t
        -0x2at
        0x8t
        0xbt
        -0xat
        0x5t
        0x12t
        0x29t
        -0x49t
        0x12t
        -0x4t
        -0xdt
        0x48t
        -0x36t
        -0x5t
        -0x6t
        -0x3t
        0xet
        -0xat
        0xdt
        -0x4et
        0x8t
        -0x9t
        0x14t
        -0x5t
        0x1t
        0x21t
        -0x30t
        0xft
        -0x2t
        -0x4dt
        0x2t
        -0xbt
        0xdt
        -0x13t
        0x1t
        0x5t
        0x25t
        -0x2bt
        0xft
        -0x2t
        -0x35t
        -0x1at
        -0x39t
        -0x4t
        0x12t
        -0x4t
        -0xdt
        0x56t
        -0x52t
        0xdt
        -0x2t
        0x6t
        -0xdt
        0xdt
        0x14t
        -0x2at
        0x8t
        0xbt
        -0xat
        0x5t
        0x12t
        0x37t
        -0x47t
        -0x7t
        0x5t
        -0xbt
        0x0t
        0xft
        -0x2t
        0x47t
        -0x52t
        0x3t
        -0x3t
        0x0t
        0x2dt
        -0x48t
        0xdt
        -0x9t
        0x9t
        -0xft
        0x1t
        0xat
        0x1dt
        -0x1ct
        0x5t
        -0x12t
        0x6t
        0x1bt
        -0x1at
        0x1ft
        -0x1et
        -0x41t
        0xdt
        -0x14t
        0x18t
        -0xbt
        0x1ct
        -0x11t
        -0x8t
        0x5t
        -0x1t
        0x18t
        -0x27t
        0xft
        -0x2t
        0x47t
        -0x4et
        0x5t
        0x49t
        -0x52t
        0x3t
        -0x3t
        0x0t
        0xdt
        -0x35t
        0xdt
        -0x9t
        0x9t
        -0xft
        0x1t
        0xat
        0x1dt
        -0x23t
        0x9t
        -0x8t
        0x25t
        -0x18t
        -0x8t
        0x5t
        -0x1t
        0x18t
        -0x21t
        0x1ft
        -0x16t
        0x2t
        0x2t
        -0xbt
        -0x4t
        0xbt
        -0xdt
        0x52t
        -0x4et
        0x5t
        0x49t
        -0x52t
        0x3t
        -0x3t
        0x0t
        0xdt
        -0x31t
        0xdt
        -0x9t
        0x9t
        -0xft
        0x1t
        0xat
        0x1dt
        -0x18t
        -0x1t
        -0xdt
        0x11t
        -0xft
        0xbt
        -0xdt
        0x22t
        -0x11t
        -0x8t
        0x5t
        -0x1t
        0x18t
        -0x21t
        0x1ft
        -0x16t
        0x2t
        0x2t
        -0xbt
        -0x4t
        0xbt
        -0xdt
        0x52t
        -0x4et
        0x5t
        0x49t
        -0x52t
        0x3t
        -0x3t
        0x0t
        0xdt
        -0x52t
        -0x4t
        0x12t
        -0x4t
        0x13t
        -0x17t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ﻐ(Landroid/view/View;)Landroid/view/View$OnTouchListener;
    .locals 10

    const/4 v0, 0x0

    .line 136
    :try_start_0
    const-class v1, Landroid/view/View;

    .line 138
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    .line 142
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 144
    const-class v2, Lcom/ironsource/adqualitysdk/sdk/i/jv;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :try_start_1
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﱟ:Ljava/lang/reflect/Field;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    .line 146
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    const v5, 0x1fe31715

    sub-int/2addr v5, v4

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-byte v3, v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v4, v6, v8

    rsub-int/lit8 v4, v4, -0x58

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    const v7, 0x358f99ca

    add-int/2addr v6, v7

    const-string v7, ""

    const-string v8, ""

    invoke-static {v7, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v7

    int-to-short v7, v7

    invoke-static {v5, v3, v4, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﱟ:Ljava/lang/reflect/Field;

    .line 148
    :cond_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    :try_start_2
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﱟ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View$OnTouchListener;

    return-object p0

    :catchall_0
    move-exception p0

    .line 148
    monitor-exit v2

    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-object v0
.end method

.method private static ﻛ(Landroid/view/View;)Ljava/lang/Object;
    .locals 4

    .line 231
    :try_start_0
    const-class v0, Lcom/ironsource/adqualitysdk/sdk/i/jv;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    :try_start_1
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻐ:Ljava/lang/reflect/Field;

    if-nez v1, :cond_0

    .line 233
    const-class v1, Landroid/view/View;

    const-string v2, "\uf658\uf635\uce88\u3222\u8e82\u7727\ufce5\u05b4\u0a24\uc239\u6388\ue00b\u111a\ud67d\u6e10\ud7a0\u2cff"

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻐ:Ljava/lang/reflect/Field;

    .line 235
    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    :try_start_2
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻐ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 235
    monitor-exit v0

    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static ﻛ(IBIIS)Ljava/lang/String;
    .locals 6

    .line 1200
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 1202
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﺙ:I

    add-int/2addr p2, v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p2, v3, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_2

    .line 1209
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮐ:[B

    if-eqz p2, :cond_1

    .line 1211
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻏ:I

    add-int/2addr v3, p0

    aget-byte p2, p2, v3

    add-int/2addr p2, v2

    int-to-byte p2, p2

    goto :goto_0

    .line 1217
    :cond_1
    sget-object p2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭴ:[S

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻏ:I

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
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻏ:I

    add-int/2addr p0, v2

    add-int/2addr p0, v4

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/l;->ﻐ:I

    .line 1227
    sput-byte p1, Lcom/ironsource/adqualitysdk/sdk/i/l;->ｋ:B

    .line 1230
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﱡ:I

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮐ:[B

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
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭴ:[S

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

.method public static ﻛ()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 101
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr v1, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const/16 v3, 0x30

    const-wide/16 v4, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x6f

    if-ge v1, v8, :cond_2

    .line 85
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 86
    :cond_0
    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v0

    cmp-long v0, v0, v4

    const v1, 0x1fe316bf

    sub-int/2addr v1, v0

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v8

    cmp-long v0, v8, v4

    rsub-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v8, v8, -0x59

    invoke-static {v6, v7, v7}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v9

    const v10, 0x358f99be

    add-int/2addr v9, v10

    invoke-static {v7}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v10

    const/4 v11, 0x0

    cmpl-float v10, v10, v11

    int-to-short v10, v10

    invoke-static {v1, v0, v8, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 87
    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v1

    const v8, 0x1fe316de

    add-int/2addr v1, v8

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v8

    shr-int/lit8 v8, v8, 0x16

    int-to-byte v8, v8

    invoke-static {v6, v3, v7, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v9

    rsub-int/lit8 v9, v9, -0x5a

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v10

    cmp-long v10, v10, v4

    const v11, 0x358f99c3

    add-int/2addr v10, v11

    invoke-static {v7, v7, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v11

    int-to-short v11, v11

    invoke-static {v1, v8, v9, v10, v11}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    new-array v8, v7, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    .line 89
    :cond_1
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 101
    :cond_2
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v8, v1, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr v1, v0

    .line 92
    :try_start_1
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    if-nez v0, :cond_4

    .line 93
    :cond_3
    const-string v0, "\uaec7\uaea6\u4c0d\ub085\uc11c\u38b4\u67b6\u5d30\u9176\u4092\u2c1c\u7b12\u4981\u54fa\u2185\u4ce3\u7421\u677c\u15e1\u4062\u60c3\u7bac\u0947\u5429\u6f5e\u0e35\u7ab9\u29bb\u1b32\u0281\u6e07\u3d58\u0780\u16e9\u6389\u0ec0"

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 94
    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    invoke-static {v7, v7}, Landroid/view/View;->resolveSize(II)I

    move-result v1

    const v8, 0x1fe316e7

    sub-int/2addr v8, v1

    invoke-static {v7, v7}, Landroid/view/View;->getDefaultSize(II)I

    move-result v1

    int-to-byte v1, v1

    invoke-static {v7}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    add-int/lit8 v9, v9, -0x59

    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v10

    const v11, 0x358f99c4

    sub-int/2addr v11, v10

    invoke-static {v6}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    int-to-short v10, v10

    invoke-static {v8, v1, v9, v11, v10}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    new-array v8, v7, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    .line 96
    :cond_4
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ:Ljava/lang/Class;

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    .line 99
    :goto_0
    invoke-static {v7}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    shr-int/lit8 v1, v1, 0x6

    const-string v2, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v8, 0x1fe316f3

    invoke-static {v6, v3, v7, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    add-int/2addr v3, v8

    invoke-static {v7, v7}, Landroid/view/View;->getDefaultSize(II)I

    move-result v6

    int-to-byte v6, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, -0x59

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v8

    cmp-long v4, v8, v4

    const v5, 0x358f99a1

    add-int/2addr v4, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    int-to-short v5, v5

    invoke-static {v3, v6, v7, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﱡ(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private static ﻛ(Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    .line 226
    rem-int v1, v0, v0

    .line 216
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 217
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    const v3, 0x1fe31785

    add-int/2addr v1, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v4

    int-to-byte v4, v4

    add-int/lit8 v4, v4, -0x58

    const-string v5, ""

    invoke-static {v5}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v5

    const v6, 0x358f99cb

    add-int/2addr v5, v6

    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    move-result v6

    int-to-short v6, v6

    invoke-static {v1, v3, v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    .line 218
    sput-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 220
    :cond_0
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 221
    instance-of v1, p0, Ljava/util/List;

    if-eqz v1, :cond_2

    .line 226
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x13

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_1

    .line 222
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0

    :cond_1
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 p0, 0x0

    throw p0

    .line 223
    :cond_2
    instance-of p0, p0, [Landroid/view/View;

    if-eqz p0, :cond_3

    .line 224
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/view/View;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 226
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p1, p1, 0x15

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p1, v0

    return-object p0

    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p1, p1, 0x19

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_4

    const/16 p1, 0x54

    div-int/2addr p1, v2

    :cond_4
    return-object p0
.end method

.method public static ｋ(Landroid/view/View;)Landroid/view/View$OnClickListener;
    .locals 7

    const/4 v0, 0x0

    .line 107
    :try_start_0
    const-class v1, Landroid/view/View;

    .line 109
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    .line 113
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 115
    const-class v2, Lcom/ironsource/adqualitysdk/sdk/i/jv;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :try_start_1
    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ:Ljava/lang/reflect/Field;

    if-nez v3, :cond_1

    .line 117
    const-string v3, "\u6892\u68ff\u99a6\u650f\udee7\u2745\u07fa\u9b66\uf10b\u9518\u33e0\u1b2a\u8fee\u8170\u3e68\u2c9d\ub23f\ub2cf\u0a16\u2003"

    const-string v4, ""

    const/16 v5, 0x30

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ:Ljava/lang/reflect/Field;

    .line 119
    :cond_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    :try_start_2
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View$OnClickListener;

    return-object p0

    :catchall_0
    move-exception p0

    .line 119
    monitor-exit v2

    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-object v0
.end method

.method public static ｋ(Landroid/view/View;Lcom/ironsource/adqualitysdk/sdk/i/hf$e;)V
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 127
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v1

    .line 128
    instance-of v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/hf;

    if-nez v2, :cond_0

    .line 129
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/hf;

    invoke-direct {v2, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hf;-><init>(Landroid/view/View$OnClickListener;Lcom/ironsource/adqualitysdk/sdk/i/hf$e;)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x77

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    return-void

    .line 127
    :cond_1
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ｋ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object p0

    .line 128
    instance-of p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hf;

    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method public static ｋ(Landroid/view/View;Lcom/ironsource/adqualitysdk/sdk/i/hh$e;)V
    .locals 4

    const/4 v0, 0x2

    .line 256
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 254
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻐ(Landroid/view/View;)Landroid/view/View$OnTouchListener;

    move-result-object v1

    .line 255
    instance-of v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/hh;

    const/16 v3, 0x22

    div-int/lit8 v3, v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    .line 254
    :cond_0
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻐ(Landroid/view/View;)Landroid/view/View$OnTouchListener;

    move-result-object v1

    .line 255
    instance-of v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/hh;

    if-nez v2, :cond_1

    .line 256
    :goto_0
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/hh;

    invoke-direct {v2, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hh;-><init>(Landroid/view/View$OnTouchListener;Lcom/ironsource/adqualitysdk/sdk/i/hh$e;)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x51

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    :cond_1
    return-void
.end method

.method public static ﾇ(Landroid/widget/VideoView;)Landroid/media/MediaPlayer;
    .locals 7

    const/4 v0, 0x2

    .line 164
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr v1, v0

    .line 157
    :try_start_0
    const-class v1, Landroid/widget/VideoView;

    const-string v2, "\ufb3e\ufb53\ubeff\u4254\u0ada\uf373\u209e\u08cf\ud648\ub24b\ue7ee\u3c6e\u1c6f\ua63b\uea43\u0bd8"

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 159
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 164
    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p0, p0, 0x75

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p0, v0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 162
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    rsub-int/lit8 v0, v0, 0x1

    const-string v1, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    invoke-static {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const v3, 0x1fe31726

    add-int/2addr v2, v3

    invoke-static {v1, v1}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, -0x59

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    const v6, 0x358f99c2

    sub-int/2addr v6, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v5

    shr-int/lit8 v5, v5, 0x8

    int-to-short v5, v5

    invoke-static {v2, v3, v4, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static ﾇ(Ljava/lang/String;I)Ljava/lang/String;
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
    sget-wide v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭖ:J

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

    sget-wide v6, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭖ:J

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

.method public static ﾇ(Landroid/media/MediaPlayer;Lcom/ironsource/adqualitysdk/sdk/i/hc$c;)V
    .locals 6

    const/4 v0, 0x2

    .line 175
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr v1, v0

    const-string v2, "\u18a3\u18ce\u58ee\ua447\ubcc8\u456a\ucd30\ueb55\u3bcb\u545f\u51c3\ud1cd\ufffa\u4022\u5c40\ue64c\uc205\u738c\u682e"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 169
    :try_start_0
    const-class v1, Landroid/media/MediaPlayer;

    const/4 v4, 0x1

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 170
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaPlayer$OnInfoListener;

    .line 171
    instance-of v4, v2, Lcom/ironsource/adqualitysdk/sdk/i/hc;

    if-nez v4, :cond_1

    goto :goto_0

    .line 169
    :cond_0
    const-class v1, Landroid/media/MediaPlayer;

    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 170
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaPlayer$OnInfoListener;

    .line 171
    instance-of v4, v2, Lcom/ironsource/adqualitysdk/sdk/i/hc;

    if-nez v4, :cond_1

    .line 172
    :goto_0
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/hc;

    invoke-direct {v4, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hc;-><init>(Landroid/media/MediaPlayer$OnInfoListener;Lcom/ironsource/adqualitysdk/sdk/i/hc$c;)V

    invoke-virtual {v1, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x4f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    :cond_1
    return-void

    :catch_0
    move-exception p0

    const-string p1, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v0

    invoke-static {p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    const v1, 0x1fe3173c

    sub-int/2addr v1, v0

    const/16 v0, 0x30

    invoke-static {v0}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v0

    add-int/lit8 v0, v0, -0x30

    int-to-byte v0, v0

    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    rsub-int/lit8 v2, v2, -0x59

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v4

    shr-int/lit8 v4, v4, 0x18

    const v5, 0x358f99c2

    sub-int/2addr v5, v4

    const-string v4, ""

    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v4

    int-to-short v4, v4

    invoke-static {v1, v0, v2, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public static ﾇ(Landroid/media/MediaPlayer;Lcom/ironsource/adqualitysdk/sdk/i/hd$d;)V
    .locals 5

    const/4 v0, 0x2

    .line 187
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v1, v1, 0x33

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v1, v0

    const-string v2, "\u9622\u964f\u2872\ud4db\u81fe\u785c\u7ae5\u65d5\u8c14\u24c8\u6cea\u6632\u7177\u30b9\u616b\u5199\u4c84\u0339\u5503\u5d1d\u5836\u1ff8\u49bc\u4963\u57a8"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 181
    :try_start_0
    const-class v1, Landroid/media/MediaPlayer;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 182
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaPlayer$OnCompletionListener;

    .line 183
    instance-of v4, v2, Lcom/ironsource/adqualitysdk/sdk/i/hd;

    if-nez v4, :cond_1

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    .line 181
    :cond_0
    const-class v1, Landroid/media/MediaPlayer;

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 182
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaPlayer$OnCompletionListener;

    .line 183
    instance-of v4, v2, Lcom/ironsource/adqualitysdk/sdk/i/hd;

    if-nez v4, :cond_1

    .line 184
    :goto_0
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/hd;

    invoke-direct {v4, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hd;-><init>(Landroid/media/MediaPlayer$OnCompletionListener;Lcom/ironsource/adqualitysdk/sdk/i/hd$d;)V

    invoke-virtual {v1, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x17

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    :cond_1
    return-void

    :goto_1
    const-string p1, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    const-string v0, ""

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    const-string v1, "\uea06\uea63\u2d8c\ud118\u934f\u6af1\ud827\u19ec\u2efa\u2146\u7e42\uc4de\u0d16\u357c\u73d6\uf368\u30a2\u06d7\u47b8\uffe5\u2429\u1a30\u5b2e\ueb8d\u2b9a\u6faf\u28ea\u9613\u5ff9\u6303\u3c63\u82d4\u434b\u7762\u31d2\ub14f\u76a8\u48f2\u05aa\ubdfb\u7a2a\u5c43\u1905\ua995\u6984"

    invoke-static {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method private static ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 4

    const/4 v0, 0x2

    .line 250
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 244
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 p1, 0x1

    .line 245
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 v2, p1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    throw v1

    :catch_0
    move-exception p0

    .line 248
    const-string p1, ""

    const/16 v0, 0x30

    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result p1

    rsub-int/lit8 p1, p1, -0x1

    const-string v0, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    const-string v3, "\ud52b\ud54e\uf20c\u0e98\u8045\u79fb\u4044\u26c1\ub699\ufec6\u6d48\u5cbd\u323b\ueae9\u60dc\u6b0f\u0fa7\ud953\u54b2\u678f\u1b2a\uc5ac\u480c\u73ef\u1495\ub02f\u3be4\u0e5f\u60df"

    invoke-static {v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-object v1
.end method

.method public static ﾒ(Landroid/media/MediaPlayer;Lcom/ironsource/adqualitysdk/sdk/i/he$c;)V
    .locals 7

    const-string v0, ""

    const/4 v1, 0x2

    .line 199
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v2, v2, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v2, v1

    .line 193
    :try_start_0
    const-class v2, Landroid/media/MediaPlayer;

    const-string v3, "\ud190\ud1fd\ue836\u149f\ubcbb\u4519\u7d08\u227a\u8bea\ue484\u51af\u61c1\u36d2\uf0ec\u5c23\u5644\u0b31\uc342\u685b\u5af5\u1f9e\udfbc\u74e5"

    const/16 v4, 0x30

    invoke-static {v0, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    rsub-int/lit8 v4, v4, -0x1

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 194
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/MediaPlayer$OnPreparedListener;

    .line 195
    instance-of v4, v3, Lcom/ironsource/adqualitysdk/sdk/i/he;

    if-nez v4, :cond_0

    .line 196
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/he;

    invoke-direct {v4, v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/he;-><init>(Landroid/media/MediaPlayer$OnPreparedListener;Lcom/ironsource/adqualitysdk/sdk/i/he$c;)V

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p0, p0, 0x47

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p0, v1

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0

    :catch_0
    move-exception p0

    const-string p1, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static {p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    const v2, 0x1fe3175e

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    int-to-byte v3, v3

    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    rsub-int/lit8 v0, v0, -0x59

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    const v5, 0x358f99c2

    add-int/2addr v4, v5

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    int-to-short v5, v5

    invoke-static {v2, v3, v0, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﻛ(IBIIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public static ﾒ(Landroid/media/MediaPlayer;Lcom/ironsource/adqualitysdk/sdk/i/hl$b;)V
    .locals 5

    const/4 v0, 0x2

    .line 211
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 205
    :try_start_0
    const-class v2, Landroid/media/MediaPlayer;

    const-string v3, "\u6357\u633a\u0bef\uf746\u04f9\ufd5b\ue27f\u90aa\u149e\u075d\ue9f6\ufe97\u8408\u133d\ue475\uc910\ub9fa\u209c\ud008\uc5a8\uad5e\u3c73\ucca1\ud1e9\ua2c1\u49fd\ubf4f"

    const-string v4, ""

    invoke-static {v4, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾒ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 206
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/MediaPlayer$OnSeekCompleteListener;

    .line 207
    instance-of v4, v3, Lcom/ironsource/adqualitysdk/sdk/i/hl;

    if-nez v4, :cond_0

    .line 208
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/hl;

    invoke-direct {v4, v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hl;-><init>(Landroid/media/MediaPlayer$OnSeekCompleteListener;Lcom/ironsource/adqualitysdk/sdk/i/hl$b;)V

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    add-int/lit8 p0, p0, 0x73

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    rem-int/2addr p0, v0

    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﭸ:I

    add-int/lit8 p0, p0, 0x49

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﮌ:I

    rem-int/2addr p0, v0

    return-void

    :catch_0
    move-exception p0

    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/graphics/PointF;->length(FF)F

    move-result v0

    cmpl-float p1, v0, p1

    const-string v0, "\ub37b\ub33a\u0e73\uf2fb\u2b2f\ud287\u8e8f\u408c\u784f\u02ec\uc62f\u9250\u543f\u1684\ucbbf\ua5de"

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\ufa1e\ufa7b\u9454\u68c0\ub498\u4d26\ufd91\u09f4\u0b4c\u989e\u5995\ue168\u1d0e\u8ca4\u5401\ud6de\u20ba\ubf0f\u606f\uda53\u3431\ua3e8\u7ce7\uce3b\u3b83\ud675\u0f1f\ub389\u4fe3\udac6\u1ba8\ua76b\u5342\uceab\u1620\u94ff\u66ad\uf112\u2271\u9850\u6a23\ue58c"

    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    invoke-static {v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jy;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method
