.class public final Lcom/ironsource/adqualitysdk/sdk/i/fs;
.super Lcom/ironsource/adqualitysdk/sdk/i/fr;
.source ""


# static fields
.field private static ﱟ:I = 0x0

.field private static ﺙ:I = 0x1

.field private static ﾇ:C = '\u0003'

.field private static ﾒ:[C


# instance fields
.field private ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾒ:[C

    return-void

    :array_0
    .array-data 2
        0x69s
        0x66s
        0x20s
        0x28s
        0x29s
        0xas
        0x65s
        0x6cs
        0x73s
    .end array-data
.end method

.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ed;Lcom/ironsource/adqualitysdk/sdk/i/fr;Lcom/ironsource/adqualitysdk/sdk/i/fr;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/fr;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    .line 16
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    .line 17
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    return-void
.end method

.method private static ﾇ(Ljava/lang/String;BI)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 2208
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 2212
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾒ:[C

    .line 2214
    sget-char v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ:C

    .line 2218
    new-array v3, p2, [C

    .line 2221
    rem-int/lit8 v4, p2, 0x2

    if-eqz v4, :cond_1

    add-int/lit8 p2, p2, -0x1

    .line 2224
    aget-char v4, p0, p2

    sub-int/2addr v4, p1

    int-to-char v4, v4

    aput-char v4, v3, p2

    :cond_1
    const/4 v4, 0x1

    if-le p2, v4, :cond_5

    const/4 v5, 0x0

    .line 2229
    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    :goto_0
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    if-ge v5, p2, :cond_5

    .line 2233
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, p0, v5

    sput-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    .line 2234
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v5, p0, v5

    sput-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    .line 2237
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    if-ne v5, v6, :cond_2

    .line 2239
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    sub-int/2addr v6, p1

    int-to-char v6, v6

    aput-char v6, v3, v5

    .line 2240
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    sub-int/2addr v6, p1

    int-to-char v6, v6

    aput-char v6, v3, v5

    goto/16 :goto_1

    .line 2245
    :cond_2
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    div-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    .line 2246
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    .line 2247
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    div-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    .line 2248
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    .line 2251
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    if-ne v5, v6, :cond_3

    .line 2253
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    .line 2254
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    .line 2256
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v6

    .line 2257
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v6, v7

    .line 2259
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 2260
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    goto :goto_1

    .line 2264
    :cond_3
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    if-ne v5, v6, :cond_4

    .line 2266
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    .line 2267
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    .line 2269
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v6

    .line 2270
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v6, v7

    .line 2272
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 2273
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    goto :goto_1

    .line 2281
    :cond_4
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v5, v6

    .line 2282
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v6, v7

    .line 2284
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 2285
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    .line 2229
    :goto_1
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/lit8 v5, v5, 0x2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    goto/16 :goto_0

    .line 2291
    :cond_5
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2292
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x2

    .line 70
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x1

    if-ne p0, p1, :cond_0

    return v1

    :cond_0
    const/4 v3, 0x0

    if-eqz p1, :cond_8

    add-int/lit8 v2, v2, 0x41

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v2, v0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v2, v4, :cond_1

    goto :goto_2

    .line 65
    :cond_1
    check-cast p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;

    .line 67
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    if-eqz v2, :cond_2

    iget-object v4, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 70
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 p1, p1, 0x69

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr p1, v0

    goto :goto_0

    .line 67
    :cond_2
    iget-object v2, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    if-eqz v2, :cond_3

    :goto_0
    return v3

    .line 69
    :cond_3
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v2, :cond_5

    .line 70
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 v4, v4, 0x5b

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr v4, v0

    if-eqz v4, :cond_4

    iget-object v4, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v4, 0x3c

    div-int/2addr v4, v3

    if-nez v2, :cond_6

    goto :goto_1

    .line 69
    :cond_4
    iget-object v4, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v2, :cond_6

    :goto_1
    return v3

    .line 70
    :cond_6
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    iget-object p1, p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    if-nez p1, :cond_8

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 p1, p1, 0x5f

    rem-int/lit16 v2, p1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr p1, v0

    return v1

    :cond_8
    :goto_2
    return v3
.end method

.method public final hashCode()I
    .locals 6

    const/4 v0, 0x2

    .line 77
    rem-int v1, v0, v0

    .line 75
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 77
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 v3, v3, 0x2d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr v3, v0

    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    .line 77
    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v1, v0

    move v1, v2

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 76
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v3, :cond_2

    .line 77
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 v4, v4, 0x53

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr v4, v0

    if-nez v4, :cond_1

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0

    :cond_2
    move v3, v2

    :goto_1
    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v3, :cond_3

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    add-int/lit8 v2, v2, 0x4f

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    rem-int/2addr v2, v0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v1, v2

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    const/4 v0, 0x2

    .line 57
    rem-int v1, v0, v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    const-string v2, ""

    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x53

    int-to-byte v3, v3

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x3

    const-string v7, "\u0001\u0002\u0000\u0005"

    invoke-static {v7, v3, v6}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v6

    cmp-long v3, v6, v4

    const/16 v6, 0x30

    add-int/2addr v3, v6

    int-to-byte v3, v3

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x1

    const-string v8, "Z"

    invoke-static {v8, v3, v7}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    instance-of v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/fj;

    const-string v7, "["

    const-string v8, "\u0088"

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    .line 51
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v10, v3, 0x80

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v3, v0

    .line 38
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x68

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    add-int/lit8 v10, v10, 0x1

    invoke-static {v8, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x51

    int-to-byte v3, v3

    invoke-static {v9, v9}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    invoke-static {v7, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    :goto_0
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v3, :cond_4

    .line 57
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v10, v10, 0x5

    rem-int/lit16 v11, v10, 0x80

    sput v11, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v10, v0

    .line 44
    instance-of v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/fj;

    if-eqz v3, :cond_1

    .line 45
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x18

    add-int/lit8 v3, v3, 0x68

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v10

    cmp-long v10, v10, v4

    invoke-static {v8, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 47
    :cond_1
    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x51

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    rsub-int/lit8 v10, v10, 0x1

    invoke-static {v7, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    :goto_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v10

    cmp-long v3, v10, v4

    rsub-int/lit8 v3, v3, 0x18

    int-to-byte v3, v3

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v10

    const-wide/16 v12, -0x1

    cmp-long v10, v10, v12

    add-int/lit8 v10, v10, 0x3

    const-string v11, "\u0007\u0008\u0006\u0007"

    invoke-static {v11, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    instance-of v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/fj;

    if-eqz v3, :cond_3

    .line 57
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v3, v3, 0x31

    rem-int/lit16 v7, v3, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_2

    const/16 v0, 0x4b

    .line 51
    invoke-static {v2, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v0

    const/16 v2, 0x78

    shl-int v0, v2, v0

    :goto_2
    int-to-byte v0, v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v4

    invoke-static {v8, v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_2
    invoke-static {v2, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x67

    goto :goto_2

    .line 53
    :cond_3
    invoke-static {v9, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x51

    int-to-byte v0, v0

    invoke-static {v9, v9}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v2

    cmp-long v2, v2, v4

    neg-int v2, v2

    invoke-static {v7, v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﾇ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    :goto_3
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;
    .locals 4

    const/4 v0, 0x2

    .line 28
    rem-int v1, v0, v0

    .line 23
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ed;

    invoke-virtual {v1, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 28
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 24
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    .line 1012
    invoke-virtual {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/fr;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object p1

    return-object p1

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    .line 1012
    invoke-virtual {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/fr;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1

    .line 25
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/fr;

    if-eqz v1, :cond_2

    .line 1012
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﱟ:I

    add-int/lit8 v2, v2, 0x39

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/fs;->ﺙ:I

    rem-int/2addr v2, v0

    .line 2012
    invoke-virtual {v1, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/fr;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object p1

    return-object p1

    .line 28
    :cond_2
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/dr;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/dr;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
