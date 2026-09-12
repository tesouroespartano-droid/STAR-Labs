.class final Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﺙ:I = 0x1

.field private static ﻐ:J = -0x4d5fd95f4d78b022L

.field private static ﻛ:I

.field private static ｋ:I

.field private static ﾇ:C


# instance fields
.field final synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﾒ(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    :cond_2
    check-cast p1, [C

    .line 1123
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1125
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [C

    .line 1126
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p1, v1

    xor-int/2addr p0, v2

    int-to-char p0, p0

    aput-char p0, p1, v1

    const/4 p0, 0x2

    .line 1128
    aget-char v2, p2, p0

    int-to-char p4, p4

    add-int/2addr v2, p4

    int-to-char p4, v2

    aput-char p4, p2, p0

    .line 1130
    array-length p4, p3

    .line 1131
    new-array v2, p4, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p4, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p0

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p1, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p2, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 1141
    aget-char v4, p1, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p2, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p2, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p1, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p3, v4

    aget-char v3, p1, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﻐ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﻛ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾇ:C

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


# virtual methods
.method public final ﻐ()V
    .locals 7

    const/4 v0, 0x2

    .line 455
    rem-int v1, v0, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/t$5;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭖ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/je;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const v3, 0xdf3c

    add-int/2addr v2, v3

    int-to-char v2, v2

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const-string v4, "\u857c\uce94\u3c2a\ucbdf"

    const-string v5, "\u4fde\ub287\u26a0\ub2a0"

    const-string v6, "\ufc96\u3bb0\uc55c\u8e23\ue07f\ub1cc\u85ca\u9ca1\u62a5\ufff8\u6050\uffb9\u1eda\u1a86"

    invoke-static {v2, v4, v5, v6, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﾒ(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;)V

    invoke-virtual {v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﻛ(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/je$d;)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ﺙ:I

    add-int/lit8 v1, v1, 0x6f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/t$5$3$4;->ｋ:I

    rem-int/2addr v1, v0

    return-void
.end method
