.class public final Lcom/ironsource/adqualitysdk/sdk/i/cv;
.super Lcom/ironsource/adqualitysdk/sdk/i/cx;
.source ""


# static fields
.field private static ﺙ:I = 0x1

.field private static ﻐ:I = 0x0

.field private static ﻛ:C = '\uce1e'

.field private static ｋ:C = '\uf0cb'

.field private static ﾇ:C = '\ua53d'

.field private static ﾒ:C = '\u3158'


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/cx;-><init>()V

    return-void
.end method

.method private static ﾇ(Ljava/lang/String;I)Ljava/lang/String;
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

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾒ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾇ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻛ:C

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


# virtual methods
.method public final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/co;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 78
    rem-int v1, v0, v0

    .line 51
    const-class v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {p2, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 53
    :try_start_0
    const-class v3, Lcom/ironsource/adqualitysdk/sdk/i/du;

    const/4 v4, 0x1

    invoke-static {p2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ironsource/adqualitysdk/sdk/i/du;

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-le v5, v0, :cond_1

    .line 69
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 v5, v5, 0x15

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr v5, v0

    .line 57
    :try_start_1
    const-class v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {p2, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻛ(Ljava/util/List;ILjava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 63
    invoke-static {p2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾒ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 p2, p2, 0xf

    rem-int/lit16 v5, p2, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr p2, v0

    goto :goto_0

    .line 78
    :cond_0
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    add-int/lit8 v5, v5, 0x75

    rem-int/lit16 v6, v5, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    rem-int/2addr v5, v0

    .line 58
    :try_start_2
    const-class v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {p2, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x3

    if-le v6, v7, :cond_2

    .line 60
    invoke-static {p2, v7}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾒ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, p1

    .line 66
    :cond_2
    :goto_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    move v6, v2

    .line 67
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ge v6, v7, :cond_7

    .line 70
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 v7, v7, 0x5f

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr v7, v0

    if-eqz v7, :cond_3

    .line 68
    :try_start_3
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v4, v2, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 69
    invoke-virtual {v5}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﺙ()Lcom/ironsource/adqualitysdk/sdk/i/dq;

    move-result-object v7

    invoke-virtual {v3, v7, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    .line 68
    :cond_3
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v4, v2, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 69
    invoke-virtual {v5}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﺙ()Lcom/ironsource/adqualitysdk/sdk/i/dq;

    move-result-object v7

    invoke-virtual {v3, v7, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ()Z

    move-result v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v7, :cond_6

    .line 78
    :cond_4
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    add-int/lit8 v7, v7, 0x3f

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    rem-int/2addr v7, v0

    if-eqz v7, :cond_5

    .line 70
    :try_start_4
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const/4 p2, 0x0

    :try_start_5
    invoke-super {p2}, Ljava/lang/Object;->hashCode()I

    throw p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    .line 78
    throw p1

    .line 72
    :cond_6
    :goto_3
    :try_start_6
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_7
    return-object p2

    :catch_0
    move-exception p2

    .line 76
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﮐ()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    const/16 v3, 0x30

    invoke-static {v0, v3, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    add-int/lit8 v0, v0, 0x1d

    const-string v2, "\u4b26\ua41c\u8a68\ub9a2\u60af\u8a92\u01c7\u8b41\uf83d\u2592\uc9e8\u3c26\u6ebe\uf3b6\ub6c2\u6f60\u89ad\u1418\u12ae\u8f5e\u0baa\uc1b7\u36fe\uf2ef\u0122\u4095\u1352\ud6a6"

    invoke-static {v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cn;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final ｋ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/co;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 47
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 v1, v1, 0x41

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/lang/Object;

    const/4 p1, 0x6

    .line 47
    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/lang/Object;

    .line 47
    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    rem-int/2addr p1, v0

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    return-object p2

    :cond_1
    invoke-super {p2}, Ljava/lang/Object;->hashCode()I

    throw p2
.end method

.method public final ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/adqualitysdk/sdk/i/co;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 42
    rem-int v1, v0, v0

    .line 17
    const-class v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {p2, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 19
    :try_start_0
    const-class v3, Lcom/ironsource/adqualitysdk/sdk/i/du;

    const/4 v4, 0x1

    invoke-static {p2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ironsource/adqualitysdk/sdk/i/du;

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v0, :cond_1

    .line 23
    const-class v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {p2, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻛ(Ljava/util/List;ILjava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 24
    const-class v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {p2, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ｋ(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ironsource/adqualitysdk/sdk/i/co;

    .line 25
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v7, 0x3

    if-le v6, v7, :cond_2

    .line 42
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 v4, v4, 0x4f

    rem-int/lit16 v6, v4, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr v4, v0

    .line 26
    :try_start_1
    invoke-static {p2, v7}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾒ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾒ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    :cond_1
    move-object v5, p1

    .line 32
    :cond_2
    :goto_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    move v6, v2

    .line 33
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ge v6, v7, :cond_3

    .line 42
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﺙ:I

    add-int/lit8 v7, v7, 0x45

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﻐ:I

    rem-int/2addr v7, v0

    .line 34
    :try_start_2
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v4, v2, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 35
    invoke-virtual {v5}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﺙ()Lcom/ironsource/adqualitysdk/sdk/i/dq;

    move-result-object v7

    invoke-virtual {v3, v7, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    return-object p2

    :catch_0
    move-exception p2

    .line 40
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﮐ()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v0

    int-to-byte v0, v0

    rsub-int/lit8 v0, v0, 0x20

    const-string v2, "\u4b26\ua41c\u8a68\ub9a2\u60af\u8a92\u01c7\u8b41\uf83d\u2592\uc9e8\u3c26\u6ebe\uf3b6\u62af\u7560\u3eb7\u1a70\u5547\u2d96\uddd0\u403f\u9a93\uc1d1\uec8f\u57e5\u3943\u8e3b\u8f5f\u0a66\uda61\ue814\u81fa\uf66e"

    invoke-static {v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/cv;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cn;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method
