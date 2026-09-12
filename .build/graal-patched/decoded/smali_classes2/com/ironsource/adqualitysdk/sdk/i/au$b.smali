.class final enum Lcom/ironsource/adqualitysdk/sdk/i/au$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/au;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/adqualitysdk/sdk/i/au$b;",
        ">;"
    }
.end annotation


# static fields
.field private static ﮐ:I = 0x0

.field private static ﱟ:I = 0x1

.field private static ﱡ:I

.field private static ﺙ:C

.field private static ﻏ:J

.field public static final enum ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

.field public static final enum ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

.field public static final enum ｋ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

.field public static final enum ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

.field private static final synthetic ﾒ:[Lcom/ironsource/adqualitysdk/sdk/i/au$b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ｋ()V

    .line 28
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    const v1, -0x16d244b4

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    sub-int/2addr v1, v3

    const v3, 0xde1a

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    sub-int/2addr v3, v4

    int-to-char v3, v3

    const-string v4, "\u034c\ue276\u76c8"

    const-string v5, "\u4cb9\u2dbb\u1ae9\ub2de"

    const-string v6, "\u0000\u0000\u0000\u0000"

    invoke-static {v4, v1, v5, v6, v3}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    .line 29
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    const v3, 0xd92c8d

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    add-int/2addr v4, v3

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    add-int/lit16 v3, v3, 0x6a0

    int-to-char v3, v3

    const-string v5, "\uce2f\u9b4d\ub67d\u71c7\u98ff"

    const-string v9, "\u8d3c\ud92c\ua000\uee06"

    invoke-static {v5, v4, v9, v6, v3}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    .line 30
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    const v4, 0x1fd025a7

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    add-int/2addr v2, v4

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v4

    shr-int/lit8 v4, v4, 0x16

    const v5, 0xd6c0

    sub-int/2addr v5, v4

    int-to-char v4, v5

    const-string v5, "\ucc32\u846f\u7165\ucbe9\ub9b5"

    const-string v9, "\ua752\ud025\uc01f\u4dd6"

    invoke-static {v5, v2, v9, v6, v4}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-direct {v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    .line 31
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    cmp-long v5, v9, v7

    const v7, -0x744dfae9

    add-int/2addr v5, v7

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    const v8, 0xf2e6

    add-int/2addr v7, v8

    int-to-char v7, v7

    const-string v8, "\u4b0a\ud1ad\u82f7\ucc57\udbf1"

    const-string v9, "\u1870\ub205\ue68b\u3cf2"

    invoke-static {v8, v5, v9, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    invoke-direct {v2, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/au$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    .line 27
    filled-new-array {v0, v1, v3, v2}, [Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    move-result-object v0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾒ:[Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﮐ:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱟ:I

    rem-int/2addr v0, v4

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/au$b;
    .locals 4

    const/4 v0, 0x2

    .line 27
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﮐ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱟ:I

    rem-int/2addr v1, v0

    const-class v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    const/4 v3, 0x0

    invoke-static {v2, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    if-eqz v1, :cond_1

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﮐ:I

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3

    :cond_1
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3
.end method

.method public static values()[Lcom/ironsource/adqualitysdk/sdk/i/au$b;
    .locals 5

    const/4 v0, 0x2

    .line 27
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱟ:I

    add-int/lit8 v1, v1, 0x6b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﮐ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾒ:[Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    invoke-virtual {v1}, [Lcom/ironsource/adqualitysdk/sdk/i/au$b;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱟ:I

    add-int/lit8 v3, v3, 0x77

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﮐ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_0

    return-object v1

    :cond_0
    throw v2

    :cond_1
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﾒ:[Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    invoke-virtual {v0}, [Lcom/ironsource/adqualitysdk/sdk/i/au$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/adqualitysdk/sdk/i/au$b;

    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
.end method

.method static ｋ()V
    .locals 2

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﻏ:J

    const v0, -0x42731c5a

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱡ:I

    const/4 v0, 0x0

    sput-char v0, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﺙ:C

    return-void
.end method

.method private static ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
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

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﻏ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﱡ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/au$b;->ﺙ:C

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
