.class public Lcom/ironsource/adqualitysdk/sdk/i/if;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﮐ:C = '\u0000'

.field private static ﱡ:C = '\u0000'

.field private static ﺙ:I = 0x1

.field private static ﻏ:I

.field private static final ﻐ:[B

.field private static ﻛ:C

.field private static synthetic ｋ:Z

.field private static ﾇ:C

.field private static final ﾒ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻛ()V

    const/4 v0, 0x2

    .line 92
    rem-int v1, v0, v0

    const/4 v1, 0x1

    .line 39
    sput-boolean v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ:Z

    const/16 v1, 0x40

    .line 55
    new-array v1, v1, [B

    fill-array-data v1, :array_0

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ:[B

    const/16 v1, 0x80

    .line 92
    new-array v1, v1, [B

    fill-array-data v1, :array_1

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾒ:[B

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v1, v0

    return-void

    nop

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    :array_1
    .array-data 1
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x5t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x3et
        -0x9t
        -0x9t
        -0x9t
        0x3ft
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x3dt
        -0x9t
        -0x9t
        -0x9t
        -0x1t
        -0x9t
        -0x9t
        -0x9t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        0x25t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x31t
        0x32t
        0x33t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 13

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1105
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﾇ:Ljava/lang/Object;

    monitor-enter v0

    .line 1107
    :try_start_0
    array-length v1, p0

    new-array v1, v1, [C

    const/4 v2, 0x0

    .line 1109
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    const/4 v3, 0x2

    .line 1110
    new-array v4, v3, [C

    .line 1111
    :goto_0
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    array-length v6, p0

    if-ge v5, v6, :cond_2

    .line 1113
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    aget-char v5, p0, v5

    aput-char v5, v4, v2

    .line 1114
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    aget-char v5, p0, v5

    aput-char v5, v4, v6

    const v5, 0xe370

    move v7, v2

    :goto_1
    const/16 v8, 0x10

    if-ge v7, v8, :cond_1

    .line 1119
    aget-char v8, v4, v6

    aget-char v9, v4, v2

    add-int v10, v9, v5

    shl-int/lit8 v11, v9, 0x4

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﮐ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﱡ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻛ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾇ:C

    add-int/2addr v8, v11

    xor-int/2addr v8, v10

    sub-int/2addr v9, v8

    int-to-char v8, v9

    aput-char v8, v4, v2

    const v8, 0x9e37

    sub-int/2addr v5, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1128
    :cond_1
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    aget-char v7, v4, v2

    aput-char v7, v1, v5

    .line 1129
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    add-int/2addr v5, v6

    aget-char v6, v4, v6

    aput-char v6, v1, v5

    .line 1130
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    add-int/2addr v5, v3

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/k;->ﻐ:I

    goto :goto_0

    .line 1134
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1135
    monitor-exit v0

    throw p0
.end method

.method public static ﻐ(Ljava/lang/String;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ironsource/adqualitysdk/sdk/i/ic;
        }
    .end annotation

    const/4 v0, 0x2

    .line 418
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 v1, v1, 0x47

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 417
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    .line 418
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾇ([BI)[B

    move-result-object p0

    const/16 v0, 0x19

    div-int/lit8 v0, v0, 0x0

    return-object p0

    .line 417
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    .line 418
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾇ([BI)[B

    move-result-object p0

    return-object p0
.end method

.method private static ﻐ([BII[B)[B
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ironsource/adqualitysdk/sdk/i/ic;
        }
    .end annotation

    move/from16 v0, p2

    move-object/from16 v1, p3

    const/4 v2, 0x2

    .line 566
    rem-int v3, v2, v2

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v3, v3, 0x35

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v3, v2

    mul-int/lit8 v3, v0, 0x3

    const/4 v5, 0x4

    .line 502
    div-int/2addr v3, v5

    add-int/2addr v3, v2

    .line 503
    new-array v3, v3, [B

    .line 506
    new-array v6, v5, [B

    add-int/lit8 v4, v4, 0x7b

    .line 522
    rem-int/lit16 v7, v4, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v4, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    const/16 v10, 0x3d

    .line 511
    const-string v11, ""

    const/4 v12, 0x1

    if-ge v7, v0, :cond_c

    .line 512
    aget-byte v13, p0, v7

    and-int/lit8 v13, v13, 0x7f

    int-to-byte v13, v13

    .line 513
    aget-byte v14, v1, v13

    const/4 v15, -0x5

    if-lt v14, v15, :cond_b

    .line 522
    sget v15, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v4, v15, 0x65

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v4, v2

    const/4 v4, -0x1

    if-lt v14, v4, :cond_a

    if-ne v13, v10, :cond_7

    add-int/lit8 v5, v5, 0x73

    .line 540
    rem-int/lit16 v4, v5, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v5, v2

    if-nez v5, :cond_0

    shl-int v5, v0, v7

    add-int/lit8 v13, v0, -0x1

    .line 521
    aget-byte v13, p0, v13

    or-int/lit8 v13, v13, 0x36

    int-to-byte v13, v13

    if-eqz v8, :cond_6

    goto :goto_1

    :cond_0
    sub-int v5, v0, v7

    add-int/lit8 v13, v0, -0x1

    aget-byte v13, p0, v13

    and-int/lit8 v13, v13, 0x7f

    int-to-byte v13, v13

    if-eqz v8, :cond_6

    :goto_1
    if-eq v8, v12, :cond_6

    const/4 v14, 0x3

    if-ne v8, v14, :cond_1

    if-gt v5, v2, :cond_3

    :cond_1
    const/4 v14, 0x4

    if-ne v8, v14, :cond_4

    add-int/lit8 v4, v4, 0x21

    .line 540
    rem-int/lit16 v14, v4, 0x80

    sput v14, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v4, v2

    if-eqz v4, :cond_2

    if-gt v5, v12, :cond_3

    goto :goto_2

    :cond_2
    if-gt v5, v12, :cond_3

    goto :goto_2

    .line 527
    :cond_3
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ic;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    add-int/lit8 v2, v2, 0x40

    const-string v3, "\u2d51\ud038\ue4c0\u52b3\u631a\ud0aa\ue2d9\u4d9b\u381b\ue7b1\u6bbe\u7fbc\u8b34\u4501\u8ec1\u6a89\ua580\u517e\u54cc\ua5bb\ua8ae\u0d12\u4f6c\u9d0a\ua99f\u6526\ub36d\uef64\uf012\u6a2b\uf98b\u6bff\u902f\ueea2\u88c9\uc43d\u662e\u50b7\u9234\u5f9e\ua20b\u1041\ue11c\u70c9\ub5b4\u6449\u8bce\udab7\u718b\u274b\uc680\u7700\u97c8\u2358\u809e\u87e2\u662e\u50b7\ub137\u8da0\ua8ae\u0d12\uf22a\uf8f2"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ic;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    if-eq v13, v10, :cond_c

    const/16 v4, 0xa

    if-ne v13, v4, :cond_5

    goto/16 :goto_5

    .line 531
    :cond_5
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ic;

    const/16 v1, 0x30

    invoke-static {v11, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x26

    const-string v2, "\ua20b\u1041\ue11c\u70c9\ub5b4\u6449\u8bce\udab7\u718b\u274b\uc680\u7700\u97c8\u2358\u215e\ucc15\uefa1\uf76e\u631a\ud0aa\u718b\u274b\ua8fd\u3f6b\u8bce\udab7\u5eb5\u896a\u0bec\u3b4a\ua8fd\u3f6b\u0404\u6fc8\ud4d9\ufd46\u3c6c\u1e26\u6ed3\u1ecc"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ic;-><init>(Ljava/lang/String;)V

    throw v0

    .line 523
    :cond_6
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ic;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int/lit8 v2, v2, 0x28

    const-string v3, "\u631a\ud0aa\u718b\u274b\ua8fd\u3f6b\u8bce\udab7\u2d51\ud038\ue4c0\u52b3\u631a\ud0aa\ue2d9\u4d9b\u381b\ue7b1\u6bbe\u7fbc\u8b34\u4501\u8ec1\u6a89\u1c27\u83a6\uf22a\uf8f2\u381b\ue7b1\u6bbe\u7fbc\u662e\u50b7\ub137\u8da0\ua8ae\u0d12\uf22a\uf8f2"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ic;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    add-int/lit8 v4, v8, 0x1

    .line 537
    aput-byte v13, v6, v8

    const/4 v14, 0x4

    if-ne v4, v14, :cond_9

    add-int/lit8 v15, v15, 0x73

    .line 566
    rem-int/lit16 v4, v15, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v15, v2

    if-eqz v15, :cond_8

    .line 539
    invoke-static {v6, v3, v9, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([B[BI[B)I

    move-result v4

    shl-int/2addr v9, v4

    goto :goto_3

    :cond_8
    invoke-static {v6, v3, v9, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([B[BI[B)I

    move-result v4

    add-int/2addr v9, v4

    :goto_3
    const/4 v8, 0x0

    goto :goto_4

    :cond_9
    move v8, v4

    goto :goto_4

    :cond_a
    const/4 v14, 0x4

    :goto_4
    add-int/lit8 v7, v7, 0x1

    move v5, v14

    goto/16 :goto_0

    .line 544
    :cond_b
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ic;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v11}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x1e

    const-string v4, "\u6530\u152c\u8bce\udab7\u6530\u152c\ua8ae\u0d12\u720b\u30e9\u64a8\u0954\u7f56\ub1f4\u119c\ubfe5\u63aa\u7c0d\u215e\ucc15\u448e\uab6e\ub125\u2e79\ubfb3\uef14\u1c27\u83a6\uf22a\uf8f2"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    add-int/2addr v3, v2

    const-string v2, "\u7100\ue482"

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-byte v2, p0, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit8 v2, v2, 0x9

    const-string v3, "\u54f3\ue7d3\u7eba\u3281\uacd3\u8153\u54cc\ua5bb\uefce\u3023"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ic;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_5
    if-eqz v8, :cond_f

    .line 522
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v4, v4, 0x13

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v4, v2

    if-eqz v4, :cond_d

    if-eq v8, v12, :cond_e

    goto :goto_6

    :cond_d
    if-eq v8, v12, :cond_e

    .line 560
    :goto_6
    aput-byte v10, v6, v8

    .line 561
    invoke-static {v6, v3, v9, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([B[BI[B)I

    move-result v0

    add-int/2addr v9, v0

    .line 566
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v0, v2

    goto :goto_7

    .line 557
    :cond_e
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ic;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v11}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x23

    const-string v4, "\u43b3\u2077\u0404\u6fc8\u328a\u33eb\u6bb7\u6731\u448e\uab6e\u8643\ufee7\u631a\ud0aa\ue2d9\u4d9b\ub199\ua2e1\ued25\u7454\u53dd\ue663\u6bbe\u7fbc\ue136\u0cb4\u809e\u87e2\u662e\u50b7\ub137\u8da0\ua8ae\u0d12\uf22a\uf8f2"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-int/2addr v0, v12

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ic;-><init>(Ljava/lang/String;)V

    throw v1

    .line 564
    :cond_f
    :goto_7
    new-array v0, v9, [B

    const/4 v1, 0x0

    .line 565
    invoke-static {v3, v1, v0, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method static ﻛ()V
    .locals 1

    const/16 v0, 0x1e82

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﮐ:C

    const v0, 0xd38a

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾇ:C

    const/16 v0, 0x150c

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﱡ:C

    const/16 v0, 0x6010

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻛ:C

    return-void
.end method

.method private static ﻛ([BII[B)[B
    .locals 15

    move/from16 v0, p2

    const/4 v1, 0x2

    .line 343
    rem-int v2, v1, v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 v2, v2, 0x11

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v2, v1

    add-int/lit8 v2, v0, 0x2

    .line 299
    div-int/lit8 v2, v2, 0x3

    shl-int/2addr v2, v1

    const v3, 0x7fffffff

    .line 301
    div-int v4, v2, v3

    add-int/2addr v2, v4

    new-array v7, v2, [B

    add-int/lit8 v4, v0, -0x2

    const/4 v10, 0x0

    move v5, v10

    move v8, v5

    move v11, v8

    :goto_0
    const/16 v12, 0xa

    if-ge v5, v4, :cond_1

    .line 343
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v6, v6, 0x2d

    rem-int/lit16 v9, v6, 0x80

    sput v9, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v6, v1

    .line 313
    aget-byte v6, p0, v5

    shl-int/lit8 v6, v6, 0x18

    ushr-int/lit8 v6, v6, 0x8

    add-int/lit8 v9, v5, 0x1

    aget-byte v9, p0, v9

    shl-int/lit8 v9, v9, 0x18

    ushr-int/lit8 v9, v9, 0x10

    or-int/2addr v6, v9

    add-int/lit8 v9, v5, 0x2

    aget-byte v9, p0, v9

    shl-int/lit8 v9, v9, 0x18

    ushr-int/lit8 v9, v9, 0x18

    or-int/2addr v6, v9

    ushr-int/lit8 v9, v6, 0x12

    .line 317
    aget-byte v9, p3, v9

    aput-byte v9, v7, v8

    add-int/lit8 v9, v8, 0x1

    ushr-int/lit8 v13, v6, 0xc

    and-int/lit8 v13, v13, 0x3f

    .line 318
    aget-byte v13, p3, v13

    aput-byte v13, v7, v9

    add-int/lit8 v13, v8, 0x2

    ushr-int/lit8 v14, v6, 0x6

    and-int/lit8 v14, v14, 0x3f

    .line 319
    aget-byte v14, p3, v14

    aput-byte v14, v7, v13

    add-int/lit8 v13, v8, 0x3

    and-int/lit8 v6, v6, 0x3f

    .line 320
    aget-byte v6, p3, v6

    aput-byte v6, v7, v13

    add-int/lit8 v11, v11, 0x4

    if-ne v11, v3, :cond_0

    add-int/lit8 v8, v8, 0x4

    .line 324
    aput-byte v12, v7, v8

    move v8, v9

    move v11, v10

    :cond_0
    add-int/lit8 v5, v5, 0x3

    add-int/lit8 v8, v8, 0x4

    goto :goto_0

    :cond_1
    if-ge v5, v0, :cond_3

    sub-int v6, v0, v5

    move-object v4, p0

    move-object/from16 v9, p3

    .line 331
    invoke-static/range {v4 .. v9}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([BII[BI[B)[B

    add-int/lit8 v11, v11, 0x4

    if-ne v11, v3, :cond_2

    add-int/lit8 p0, v8, 0x4

    .line 336
    aput-byte v12, v7, p0

    add-int/lit8 v8, v8, 0x1

    .line 343
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr p0, v1

    :cond_2
    add-int/lit8 v8, v8, 0x4

    .line 342
    :cond_3
    sget-boolean p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ:Z

    if-nez p0, :cond_6

    .line 343
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 p0, p0, 0x5

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr p0, v1

    if-eqz p0, :cond_4

    const/16 p0, 0x20

    div-int/2addr p0, v10

    if-ne v8, v2, :cond_5

    goto :goto_1

    :cond_4
    if-ne v8, v2, :cond_5

    goto :goto_1

    .line 342
    :cond_5
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_6
    :goto_1
    return-object v7
.end method

.method private static ｋ([B[BI[B)I
    .locals 8

    const/4 v0, 0x2

    .line 404
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v1, v0

    .line 376
    aget-byte v1, p0, v0

    const/16 v3, 0x3d

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v3, :cond_0

    .line 377
    aget-byte v0, p0, v4

    aget-byte v0, p3, v0

    shl-int/lit8 v0, v0, 0x18

    ushr-int/lit8 v0, v0, 0x6

    aget-byte p0, p0, v5

    aget-byte p0, p3, p0

    shl-int/lit8 p0, p0, 0x18

    ushr-int/lit8 p0, p0, 0xc

    or-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x10

    int-to-byte p0, p0

    .line 381
    aput-byte p0, p1, p2

    return v5

    :cond_0
    const/4 v6, 0x3

    .line 383
    aget-byte v7, p0, v6

    if-ne v7, v3, :cond_1

    add-int/lit8 v3, v2, 0x7b

    .line 404
    rem-int/lit16 v6, v3, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v3, v0

    .line 385
    aget-byte v3, p0, v4

    aget-byte v3, p3, v3

    shl-int/lit8 v3, v3, 0x18

    ushr-int/lit8 v3, v3, 0x6

    aget-byte p0, p0, v5

    aget-byte p0, p3, p0

    shl-int/lit8 p0, p0, 0x18

    ushr-int/lit8 p0, p0, 0xc

    or-int/2addr p0, v3

    aget-byte p3, p3, v1

    shl-int/lit8 p3, p3, 0x18

    ushr-int/lit8 p3, p3, 0x12

    or-int/2addr p0, p3

    ushr-int/lit8 p3, p0, 0x10

    int-to-byte p3, p3

    .line 390
    aput-byte p3, p1, p2

    add-int/2addr p2, v5

    ushr-int/lit8 p0, p0, 0x8

    int-to-byte p0, p0

    .line 391
    aput-byte p0, p1, p2

    add-int/lit8 v2, v2, 0x6f

    .line 404
    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v2, v0

    return v0

    .line 395
    :cond_1
    aget-byte v2, p0, v4

    aget-byte v2, p3, v2

    shl-int/lit8 v2, v2, 0x18

    ushr-int/lit8 v2, v2, 0x6

    aget-byte p0, p0, v5

    aget-byte p0, p3, p0

    shl-int/lit8 p0, p0, 0x18

    ushr-int/lit8 p0, p0, 0xc

    or-int/2addr p0, v2

    aget-byte v1, p3, v1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x12

    or-int/2addr p0, v1

    aget-byte p3, p3, v7

    shl-int/lit8 p3, p3, 0x18

    ushr-int/lit8 p3, p3, 0x18

    or-int/2addr p0, p3

    shr-int/lit8 p3, p0, 0x10

    int-to-byte p3, p3

    .line 401
    aput-byte p3, p1, p2

    add-int/lit8 p3, p2, 0x1

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    .line 402
    aput-byte v1, p1, p3

    add-int/2addr p2, v0

    int-to-byte p0, p0

    .line 403
    aput-byte p0, p1, p2

    return v6
.end method

.method private static ｋ([BI[B)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x2

    .line 284
    rem-int v1, v0, v0

    const/4 v1, 0x0

    .line 272
    invoke-static {p0, v1, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻛ([BII[B)[B

    move-result-object p0

    .line 273
    array-length p1, p0

    .line 284
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p0, v1, p1}, Ljava/lang/String;-><init>([BII)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 p0, p0, 0x5d

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x3

    div-int/2addr p0, v1

    :cond_0
    return-object p2
.end method

.method private static ｋ([BII[BI[B)[B
    .locals 6

    const/4 v0, 0x2

    .line 232
    rem-int v1, v0, v0

    const/4 v1, 0x0

    if-lez p2, :cond_0

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 v2, v2, 0x5f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v2, v0

    .line 208
    aget-byte v2, p0, p1

    shl-int/lit8 v2, v2, 0x18

    ushr-int/lit8 v2, v2, 0x8

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-le p2, v3, :cond_1

    .line 232
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/2addr v4, v3

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v4, v0

    add-int/lit8 v4, p1, 0x1

    .line 209
    aget-byte v4, p0, v4

    shl-int/lit8 v4, v4, 0x18

    ushr-int/lit8 v4, v4, 0x10

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    or-int/2addr v2, v4

    if-le p2, v0, :cond_2

    add-int/2addr p1, v0

    .line 210
    aget-byte p0, p0, p1

    shl-int/lit8 p0, p0, 0x18

    ushr-int/lit8 v1, p0, 0x18

    :cond_2
    or-int p0, v2, v1

    const/16 p1, 0x3d

    const/4 v1, 0x3

    if-eq p2, v3, :cond_5

    if-eq p2, v0, :cond_4

    if-eq p2, v1, :cond_3

    return-object p3

    :cond_3
    ushr-int/lit8 p1, p0, 0x12

    .line 214
    aget-byte p1, p5, p1

    aput-byte p1, p3, p4

    add-int/lit8 p1, p4, 0x1

    ushr-int/lit8 p2, p0, 0xc

    and-int/lit8 p2, p2, 0x3f

    .line 215
    aget-byte p2, p5, p2

    aput-byte p2, p3, p1

    add-int/lit8 p1, p4, 0x2

    ushr-int/lit8 p2, p0, 0x6

    and-int/lit8 p2, p2, 0x3f

    .line 216
    aget-byte p2, p5, p2

    aput-byte p2, p3, p1

    add-int/2addr p4, v1

    and-int/lit8 p0, p0, 0x3f

    .line 217
    aget-byte p0, p5, p0

    aput-byte p0, p3, p4

    return-object p3

    :cond_4
    ushr-int/lit8 p2, p0, 0x12

    .line 220
    aget-byte p2, p5, p2

    aput-byte p2, p3, p4

    add-int/lit8 p2, p4, 0x1

    ushr-int/lit8 v2, p0, 0xc

    and-int/lit8 v2, v2, 0x3f

    .line 221
    aget-byte v2, p5, v2

    aput-byte v2, p3, p2

    add-int/lit8 p2, p4, 0x2

    ushr-int/lit8 p0, p0, 0x6

    and-int/lit8 p0, p0, 0x3f

    .line 222
    aget-byte p0, p5, p0

    aput-byte p0, p3, p2

    add-int/2addr p4, v1

    .line 223
    aput-byte p1, p3, p4

    .line 232
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 p0, p0, 0x53

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr p0, v0

    return-object p3

    :cond_5
    ushr-int/lit8 p2, p0, 0x12

    .line 226
    aget-byte p2, p5, p2

    aput-byte p2, p3, p4

    add-int/lit8 p2, p4, 0x1

    ushr-int/lit8 p0, p0, 0xc

    and-int/lit8 p0, p0, 0x3f

    .line 227
    aget-byte p0, p5, p0

    aput-byte p0, p3, p2

    add-int/lit8 p0, p4, 0x2

    .line 228
    aput-byte p1, p3, p0

    add-int/2addr p4, v1

    .line 229
    aput-byte p1, p3, p4

    return-object p3
.end method

.method private static ﾇ([BI)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ironsource/adqualitysdk/sdk/i/ic;
        }
    .end annotation

    const/4 v0, 0x2

    .line 472
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    add-int/lit8 v1, v1, 0xd

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    sget-object v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾒ:[B

    invoke-static {p0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ([BII[B)[B

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    sget-object v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﾒ:[B

    invoke-static {p0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ([BII[B)[B

    move-result-object p0

    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 p1, p1, 0x9

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method public static ﾒ([B)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 245
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻏ:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﺙ:I

    rem-int/2addr v1, v0

    array-length v0, p0

    if-nez v1, :cond_0

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ:[B

    invoke-static {p0, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([BI[B)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x1d

    div-int/lit8 v0, v0, 0x0

    return-object p0

    :cond_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/if;->ﻐ:[B

    invoke-static {p0, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/if;->ｋ([BI[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
