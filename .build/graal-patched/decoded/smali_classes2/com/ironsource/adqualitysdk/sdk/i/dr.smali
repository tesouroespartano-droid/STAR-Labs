.class public final Lcom/ironsource/adqualitysdk/sdk/i/dr;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﱟ:I = 0x1

.field private static ﻏ:I

.field private static ｋ:[C


# instance fields
.field private ﻐ:Z

.field private ﻛ:Ljava/lang/Object;

.field private ﾇ:Z

.field private ﾒ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/16 v1, 0x11

    const/4 v2, 0x0

    aput-char v1, v0, v2

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ｋ:[C

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    return-void
.end method

.method private static ﻛ([IZLjava/lang/String;)Ljava/lang/String;
    .locals 12

    if-eqz p2, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    :cond_0
    check-cast p2, [B

    .line 1195
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1198
    :try_start_0
    aget v2, p0, v1

    const/4 v3, 0x1

    .line 1199
    aget v4, p0, v3

    const/4 v5, 0x2

    .line 1200
    aget v6, p0, v5

    const/4 v7, 0x3

    .line 1201
    aget v7, p0, v7

    .line 1203
    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ｋ:[C

    .line 1204
    new-array v9, v4, [C

    .line 1206
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_3

    .line 1211
    new-array v2, v4, [C

    .line 1214
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    move v8, v1

    :goto_0
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge v10, v4, :cond_2

    .line 1216
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-byte v10, p2, v10

    if-ne v10, v3, :cond_1

    .line 1218
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    add-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    goto :goto_1

    .line 1222
    :cond_1
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    .line 1225
    :goto_1
    sget v8, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v8, v2, v8

    .line 1214
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr v10, v3

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_0

    :cond_2
    move-object v9, v2

    :cond_3
    if-lez v7, :cond_4

    .line 1234
    new-array p2, v4, [C

    .line 1236
    invoke-static {v9, v1, p2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v2, v4, v7

    .line 1237
    invoke-static {p2, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1238
    invoke-static {p2, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    if-eqz p1, :cond_6

    .line 1244
    new-array p1, v4, [C

    .line 1246
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_2
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p2, v4, :cond_5

    .line 1248
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sub-int v2, v4, v2

    sub-int/2addr v2, v3

    aget-char v2, v9, v2

    aput-char v2, p1, p2

    .line 1246
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p2, v3

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_2

    :cond_5
    move-object v9, p1

    :cond_6
    if-lez v6, :cond_7

    .line 1257
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_3
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p1, v4, :cond_7

    .line 1259
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char p2, v9, p2

    aget v1, p0, v5

    sub-int/2addr p2, v1

    int-to-char p2, p2

    aput-char p2, v9, p1

    .line 1257
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p1, v3

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_3

    .line 1263
    :cond_7
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1264
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x2

    .line 87
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    .line 84
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    instance-of v1, v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    filled-new-array {v2, v1, v2, v1}, [I

    move-result-object v3

    const-string v4, "\u0000"

    invoke-static {v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    filled-new-array {v2, v1, v2, v1}, [I

    move-result-object v1

    invoke-static {v1, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ([IZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v3, v3, 0x6d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_1

    const/16 v0, 0x54

    div-int/2addr v0, v2

    :cond_1
    return-object v1
.end method

.method public final ﮐ()Lcom/ironsource/adqualitysdk/sdk/i/dr;
    .locals 4

    const/4 v0, 0x2

    .line 70
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v2, v1, 0x5f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v2, v0

    const/4 v3, 0x1

    .line 69
    iput-boolean v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﾒ:Z

    add-int/lit8 v1, v1, 0x4d

    .line 70
    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method public final ﱟ()Z
    .locals 4

    const/4 v0, 0x2

    .line 74
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v2, v1, 0x3d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v2, v0

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﾇ:Z

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0xb

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return v2
.end method

.method public final ﱡ()Lcom/ironsource/adqualitysdk/sdk/i/dr;
    .locals 3

    const/4 v0, 0x2

    .line 79
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﾇ:Z

    add-int/lit8 v2, v2, 0x45

    .line 79
    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v2, v0

    return-object p0
.end method

.method public final ﻐ()Z
    .locals 7

    const/4 v0, 0x2

    .line 39
    rem-int v1, v0, v0

    .line 21
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 39
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v1, v0

    return v2

    .line 24
    :cond_0
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    .line 25
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 27
    :cond_1
    instance-of v3, v1, Ljava/lang/Integer;

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    .line 39
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v3, v3, 0x31

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v3, v0

    .line 28
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_2

    return v4

    :cond_2
    return v2

    .line 30
    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_5

    .line 31
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v5, 0x0

    cmp-long v0, v0, v5

    if-eqz v0, :cond_4

    return v4

    :cond_4
    return v2

    .line 33
    :cond_5
    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_7

    .line 34
    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const-wide/16 v5, 0x0

    cmpl-double v0, v0, v5

    if-eqz v0, :cond_6

    return v4

    :cond_6
    return v2

    .line 36
    :cond_7
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_9

    .line 39
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v3, v0

    .line 37
    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 39
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v1, v0

    return v4

    :cond_8
    return v2

    :cond_9
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v1, v1, 0x11

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_a

    return v4

    :cond_a
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﻛ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x2

    .line 17
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v2, v1, 0x13

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v2, v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0x32

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object v2
.end method

.method public final ｋ(Z)Lcom/ironsource/adqualitysdk/sdk/i/dr;
    .locals 3

    const/4 v0, 0x2

    .line 61
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 60
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ:Z

    const/16 p1, 0x3a

    .line 61
    div-int/lit8 p1, p1, 0x0

    return-object p0

    .line 60
    :cond_0
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ:Z

    return-object p0
.end method

.method public final ｋ()Z
    .locals 4

    const/4 v0, 0x2

    .line 56
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v2, v1, 0x19

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ:Z

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    rem-int/2addr v1, v0

    return v2

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﾇ()Z
    .locals 4

    const/4 v0, 0x2

    .line 65
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v2, v1, 0x47

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v2, v0

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﾒ:Z

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v1, v0

    return v2
.end method

.method public final ﾒ()Ljava/lang/Number;
    .locals 5

    const/4 v0, 0x2

    .line 52
    rem-int v1, v0, v0

    .line 43
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ:Ljava/lang/Object;

    instance-of v2, v1, Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 52
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v2, v2, 0x4d

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    .line 44
    check-cast v1, Ljava/lang/Integer;

    return-object v1

    :cond_0
    check-cast v1, Ljava/lang/Integer;

    throw v3

    .line 46
    :cond_1
    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_2

    .line 47
    check-cast v1, Ljava/lang/Long;

    .line 44
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    add-int/lit8 v2, v2, 0xb

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    :goto_0
    rem-int/2addr v2, v0

    return-object v1

    .line 49
    :cond_2
    instance-of v2, v1, Ljava/lang/Double;

    if-eqz v2, :cond_3

    .line 50
    check-cast v1, Ljava/lang/Double;

    .line 44
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻏ:I

    add-int/lit8 v2, v2, 0x2d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﱟ:I

    goto :goto_0

    :cond_3
    return-object v3
.end method
