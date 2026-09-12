.class public final Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
.super Lcom/ironsource/adqualitysdk/sdk/i/ho$c;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/ci;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/hv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static ﱡ:I = 0x0

.field private static ﺙ:I = 0x1

.field private static ﻐ:C = '\uf6a7'

.field private static ﻛ:J = 0x0L

.field private static ﾇ:I = 0x2e

.field private static ﾒ:I


# instance fields
.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho$c;-><init>()V

    .line 70
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hv;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    return-void
.end method

.method private ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 120
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    .line 119
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hv;I)I

    .line 120
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr p1, v0

    return-object p0
.end method

.method private ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hv;
    .locals 4

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0xb

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    add-int/lit8 v2, v2, 0x27

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private ﻛ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 95
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iget v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    and-int/2addr p1, v1

    :goto_0
    iput p1, v0, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iget v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻛ:I

    or-int/2addr p1, v1

    goto :goto_0
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

    .line 1123
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1125
    :try_start_0
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    .line 1126
    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p2, v1

    xor-int/2addr p4, v2

    int-to-char p4, p4

    aput-char p4, p2, v1

    const/4 p4, 0x2

    .line 1128
    aget-char v2, p3, p4

    int-to-char p1, p1

    add-int/2addr v2, p1

    int-to-char p1, v2

    aput-char p1, p3, p4

    .line 1130
    array-length p1, p0

    .line 1131
    new-array v2, p1, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p1, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p4

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
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

    .line 1141
    aget-char v4, p2, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p3, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p3, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p2, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p0, v4

    aget-char v3, p2, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾒ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻐ:C

    int-to-long v5, v5

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v2, v1

    .line 1132
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    goto :goto_0

    .line 1154
    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1155
    monitor-exit v0

    throw p0
.end method

.method private ｋ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 80
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 79
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;I)I

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;I)I

    const/4 p1, 0x0

    .line 80
    throw p1
.end method

.method private ｋ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 75
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 74
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Ljava/lang/Class;)Ljava/lang/Class;

    .line 75
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 p1, p1, 0xd

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    .line 74
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Ljava/lang/Class;)Ljava/lang/Class;

    .line 75
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
.end method

.method private static ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 2120
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 2123
    :try_start_0
    new-array v1, p4, [C

    const/4 v2, 0x0

    .line 2127
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_0
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge v3, p4, :cond_1

    .line 2129
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v3, p0, v3

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    .line 2131
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    add-int/2addr v4, p2

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 2132
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v4, v1, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾇ:I

    sub-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 2127
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_0

    :cond_1
    if-lez p1, :cond_2

    .line 2138
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    .line 2140
    new-array p0, p4, [C

    .line 2142
    invoke-static {v1, v2, p0, v2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2143
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p1, p4, p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    invoke-static {p0, v2, v1, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2144
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p2, p4, p2

    invoke-static {p0, p1, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    if-eqz p3, :cond_4

    .line 2150
    new-array p0, p4, [C

    .line 2152
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge p1, p4, :cond_3

    .line 2154
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sub-int p2, p4, p2

    add-int/lit8 p2, p2, -0x1

    aget-char p2, v1, p2

    aput-char p2, p0, p1

    .line 2152
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_1

    :cond_3
    move-object v1, p0

    .line 2160
    :cond_4
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2161
    monitor-exit v0

    throw p0
.end method

.method private ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 125
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 124
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ()V

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ()V

    const/4 v0, 0x0

    .line 125
    throw v0
.end method

.method private ﾇ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 90
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    .line 89
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iget v1, v0, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ:I

    or-int/2addr p1, v1

    iput p1, v0, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ:I

    return-object p0
.end method

.method private ﾇ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 110
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    .line 109
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hv;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 p1, p1, 0x3f

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﾇ(Z)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 85
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    rem-int/2addr v1, v0

    .line 84
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Z)Z

    .line 85
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 p1, p1, 0x3

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private ﾒ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;)",
            "Lcom/ironsource/adqualitysdk/sdk/i/hv$a;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 115
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    .line 114
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    invoke-static {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Ljava/util/List;)Ljava/util/List;

    .line 115
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 p1, p1, 0x3b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﾒ(ZI)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    .locals 3

    const/4 v0, 0x2

    .line 105
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 103
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iput-boolean p1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ｋ:Z

    .line 104
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iput p2, p1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ:I

    const/16 p1, 0x11

    .line 105
    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 103
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iput-boolean p1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ｋ:Z

    .line 104
    iget-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hv;

    iput p2, p1, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ:I

    .line 105
    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    add-int/lit8 p1, p1, 0x57

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_1

    return-object p0

    :cond_1
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method


# virtual methods
.method public final ﻐ(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/cl;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/ironsource/adqualitysdk/sdk/i/cl;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x2

    .line 171
    rem-int v4, v3, v3

    .line 134
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    const/4 v5, 0x5

    const/16 v6, 0x30

    const-wide/16 v7, 0x0

    const/4 v9, -0x1

    const-string v10, "\u0000\u0000\u0000\u0000"

    const-string v11, ""

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    invoke-static {v14}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v4

    invoke-static {v14}, Landroid/graphics/Color;->red(I)I

    move-result v5

    add-int/lit16 v5, v5, 0x5a3f

    int-to-char v5, v5

    const-string v6, "\uefec\uc31b\ud3bb\u8333\uc0f0\u2626\ua3a3\u61fa\ua564\ue12b\udaae\u0b2d\u5fd5\u642b\u068f\u1e8d\uef28\uaa5c"

    const-string v7, "\u8176\uac7d\u3f84\u205a"

    invoke-static {v6, v4, v7, v10, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 171
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v4, v4, 0x37

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v4, v3

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v5, v13

    goto/16 :goto_4

    .line 134
    :sswitch_1
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v4

    cmpl-float v4, v4, v12

    const v5, 0x1fd2cd8d

    add-int/2addr v4, v5

    invoke-static {v11, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-char v5, v5

    const-string v6, "\u8ac0\uf0fb\ud83e\u9b17\u1a65\u5135\uc854\u2512\u4a79\uad97\u28b1\ud76e\ub64c\uab7e\u5ef9\u9cd3\u04d6\ue831\u5bb0\u7380\uc156"

    const-string v7, "\u8d48\ud2cd\u411f\u9240"

    invoke-static {v6, v4, v7, v10, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 171
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v4, v4, 0xd

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v4, v3

    const/4 v5, 0x6

    goto/16 :goto_4

    .line 134
    :sswitch_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    cmp-long v4, v4, v7

    const v5, -0x205fdf4a

    sub-int/2addr v5, v4

    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    move-result v4

    cmpl-float v4, v4, v12

    add-int/lit16 v4, v4, 0x66c1

    int-to-char v4, v4

    const-string v6, "\ucee0\u987e\u9a08\u872d\u0198\u7972\uc53c\u9494\u05d1\u861d\u3ece\uee4d\uac30\u3ced\u805d\u38e5\u019d\u4949\u7839"

    const-string v7, "\ub551\ua020\uc1df\uca66"

    invoke-static {v6, v5, v7, v10, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    move v5, v14

    goto/16 :goto_4

    :sswitch_3
    invoke-static {v14, v12, v12}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v4

    cmpl-float v4, v4, v12

    rsub-int/lit8 v4, v4, 0x1

    invoke-static {v11}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v6

    rsub-int v6, v6, 0x93

    invoke-static {v14}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x15

    const-string v8, "\u0000\ufffc\uffff\uffff\uffe8\n\uffff\u0004\u0001\u0004\u0000\r\u000e\uffef\n\uffe4\t\ufffe\u0007\u0010\uffff"

    invoke-static {v8, v4, v6, v14, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eq v4, v13, :cond_4

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x12

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    cmp-long v5, v5, v7

    rsub-int v5, v5, 0x97

    invoke-static {v11, v14}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x12

    const-string v7, "\u000b\u000b\ufff9\u0004\ufffb\n\ufffd\u0008\r\uffeb\u0006\uffe1\u0000\ufffb\n\ufff9\ufffd\u000b"

    invoke-static {v7, v4, v5, v13, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v5, 0x7

    goto/16 :goto_4

    :sswitch_5
    invoke-static {v14, v14}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    invoke-static {v11, v6, v14}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-char v5, v5

    const-string v6, "\u4c5e\uc8c6\u41a3\uc66f\ua6b3\u9039\u4414\ubab5\ud97b\ufb48\u1ff3\ud7ec\u770a\uf74d\u6bd9\uac38\u3652\u2a7e\u9fb0\u63a9\u770d\u8821\u7d29\ue72a"

    const-string v7, "\u1381\u854e\u9cd0\u096b"

    invoke-static {v6, v4, v7, v10, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 171
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v4, v4, 0xd

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v4, v3

    const/4 v5, 0x4

    goto/16 :goto_4

    .line 134
    :sswitch_6
    invoke-static {v11, v6, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x11

    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v5

    add-int/lit8 v5, v5, 0x65

    invoke-static {v14, v14}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v6

    add-int/lit8 v6, v6, 0x15

    const-string v7, "\uffe7\u000e\u0006\ufffb\ufffe\u000b\uffe8\uffff\uffe9\ufffa\u000b\ufffa\u0006\ufffe\r\ufffe\u000b\u000c\u000c\ufffe\r"

    invoke-static {v7, v4, v5, v14, v6}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v5, v3

    goto/16 :goto_4

    :sswitch_7
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/2addr v4, v3

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v6

    int-to-byte v6, v6

    rsub-int v6, v6, 0x9a

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v7

    cmpl-float v7, v7, v12

    sub-int/2addr v5, v7

    const-string v7, "\ufff8\u0007\u0005\ufff8\u0006"

    invoke-static {v7, v4, v6, v14, v5}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    .line 171
    :cond_1
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    add-int/lit8 v4, v4, 0x3b

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﱡ:I

    rem-int/2addr v4, v3

    if-eqz v4, :cond_2

    const/16 v4, 0x4e

    goto :goto_2

    :cond_2
    const/16 v4, 0x9

    :goto_2
    add-int/lit8 v5, v5, 0x1

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﺙ:I

    rem-int/2addr v5, v3

    move v5, v4

    goto/16 :goto_4

    .line 134
    :sswitch_8
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v4

    cmpl-float v4, v4, v12

    const v5, -0x51c7988e

    sub-int/2addr v5, v4

    invoke-static {v14}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v4

    rsub-int v4, v4, 0x2eee

    int-to-char v4, v4

    const-string v6, "\u82a7\u0da8\u20ca\u6dd5\u21a3"

    const-string v7, "\u723b\u3867\uefae\uc72e"

    invoke-static {v6, v5, v7, v10, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v5, 0xa

    goto :goto_4

    :sswitch_9
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v4

    const/4 v5, 0x3

    add-int/2addr v4, v5

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v15

    cmp-long v6, v15, v7

    rsub-int v6, v6, 0x98

    invoke-static {v11}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0xc

    const-string v8, "\u0000\u0002\n\n\ufffb\u0006\uffff\u000b\ufffc\uffe4\u0007"

    invoke-static {v8, v4, v6, v13, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_4

    :sswitch_a
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v4

    const/16 v5, 0x8

    shr-int/2addr v4, v5

    rsub-int/lit8 v4, v4, 0x13

    invoke-static {v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v6

    add-int/lit16 v6, v6, 0x94

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x15

    const-string v8, "\ufffe\uffec\uffff\u000e\u000f\u000c\u0008\uffee\u0013\n\uffff\uffee\t\uffe3\u0001\u0008\t\u000c\uffff\ufffb\ufffe"

    invoke-static {v8, v4, v6, v14, v7}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v13

    if-eq v4, v13, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    move v5, v9

    :cond_4
    :goto_4
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_0

    .line 169
    :pswitch_0
    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/hv;

    move-result-object v1

    return-object v1

    .line 167
    :pswitch_1
    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 164
    :pswitch_2
    const-class v1, Ljava/lang/Class;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 165
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾇ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 157
    :pswitch_3
    const-class v1, Ljava/lang/Boolean;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 159
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v13, :cond_5

    .line 160
    const-class v3, Ljava/lang/Integer;

    invoke-static {v2, v13, v3}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    .line 162
    :cond_5
    invoke-direct {v0, v1, v9}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾒ(ZI)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 154
    :pswitch_4
    const-class v1, Ljava/lang/Integer;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 155
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻛ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 151
    :pswitch_5
    const-class v1, Ljava/lang/Integer;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 152
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾇ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 148
    :pswitch_6
    const-class v1, Ljava/lang/Boolean;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 149
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾇ(Z)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 145
    :pswitch_7
    const-class v1, Ljava/lang/Integer;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 146
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 142
    :pswitch_8
    const-class v1, Ljava/lang/Integer;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 143
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﻐ(I)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 139
    :pswitch_9
    const-class v1, Ljava/util/List;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 140
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ﾒ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    .line 136
    :pswitch_a
    const-class v1, Ljava/lang/Class;

    invoke-static {v2, v14, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 137
    invoke-direct {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/hv$a;->ｋ(Ljava/lang/Class;)Lcom/ironsource/adqualitysdk/sdk/i/hv$a;

    move-result-object v1

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7869fea8 -> :sswitch_a
        -0x23cf5ecd -> :sswitch_9
        0x59bc66e -> :sswitch_8
        0x6761d4f -> :sswitch_7
        0x7e7f90c -> :sswitch_6
        0xbf4c4a8 -> :sswitch_5
        0x1711abaa -> :sswitch_4
        0x175cef12 -> :sswitch_3
        0x177bc480 -> :sswitch_2
        0x54d47844 -> :sswitch_1
        0x69b7b3ed -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
