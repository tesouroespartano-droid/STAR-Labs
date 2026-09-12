.class final Lcom/ironsource/adqualitysdk/sdk/i/t$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Landroid/app/Application;Landroid/app/Activity;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:I = 0x0

.field private static ﱟ:J = 0x0L

.field private static ﻏ:C = '\udae2'


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

.field private synthetic ﻛ:Ljava/lang/String;

.field private synthetic ｋ:Landroid/app/Activity;

.field private synthetic ﾇ:Landroid/app/Application;

.field final synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;Ljava/lang/String;Landroid/app/Application;Landroid/app/Activity;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻛ:Ljava/lang/String;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾇ:Landroid/app/Application;

    iput-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ｋ:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->toCharArray()[C

    move-result-object p4

    :cond_0
    check-cast p4, [C

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_1
    check-cast p3, [C

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
    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    .line 1126
    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p0, v1

    xor-int/2addr p1, v2

    int-to-char p1, p1

    aput-char p1, p0, v1

    const/4 p1, 0x2

    .line 1128
    aget-char v2, p3, p1

    int-to-char p2, p2

    add-int/2addr v2, p2

    int-to-char p2, v2

    aput-char p2, p3, p1

    .line 1130
    array-length p2, p4

    .line 1131
    new-array v2, p2, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p2, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p1

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p0, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p3, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 1141
    aget-char v4, p0, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p3, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p3, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p0, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p4, v4

    aget-char v3, p0, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﱟ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﮐ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻏ:C

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
    .locals 24

    move-object/from16 v1, p0

    .line 192
    const-string v2, ""

    const-string v3, "\uee68\uee12\u0889\u1a40\uec18\ua975\u8a0c\u8367\ua9bc\ud3a8\u8f1a\ubeba"

    const-string v4, "\ufc58\uec9f\uc2d2\ueb5d"

    const-string v5, "\u0000\u0000\u0000\u0000"

    const/4 v7, 0x1

    :try_start_0
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getUserId()Ljava/lang/String;

    move-result-object v0

    .line 194
    iget-object v8, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getLogLevel()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;)V

    const/4 v8, 0x0

    .line 198
    invoke-static {v8}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x14

    shr-int/lit8 v9, v9, 0x6

    int-to-char v9, v9

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v12

    invoke-static {v4, v9, v12, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\u1983\u0b58\u2734\u7fd6"

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v14

    shr-int/lit8 v14, v14, 0x10

    const v15, 0xd627

    sub-int/2addr v15, v14

    int-to-char v14, v15

    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v16, 0x0

    :try_start_1
    const-string v6, "\u030a\ud4c0\u099f\uaa48\u9556\u469c\ueeae\ua29d\u52a4\uc92e\ucf15\u18d4\u3545\u4c7c\u2c75\ue369\u685d\u6f8a\u4efe\ubc08\ud5f7\uf9c3\u592f\u0a90\u341b\u483e"

    invoke-static {v13, v14, v15, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻛ:Ljava/lang/String;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v6}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻛ(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾇ:Landroid/app/Application;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ(Landroid/content/Context;)Lcom/ironsource/adqualitysdk/sdk/i/ii;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ()V

    .line 202
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isTestMode()Z

    move-result v9

    invoke-static {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/t;Z)V

    .line 203
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isTestMode()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 204
    invoke-static {v2, v2, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v6

    int-to-char v6, v6

    invoke-static {v8, v8, v8}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v9

    invoke-static {v4, v6, v9, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    const-string v9, "\u22e8\u40c6\u47b8\u085a"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v12

    shr-int/lit8 v12, v12, 0x16

    rsub-int v12, v12, 0x5a47

    int-to-char v12, v12

    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    move-result v13

    const-string v14, "\uf0a7\ua776\u84ae\u277e\u95ad\u388d\uf023\u3d87\u9fe8\u3441\u63d3\ueffb\u8fa9\u0358\u7f01\u3f53\udda5\u7d5f\u208c\ub4c5\u5304\uf024\uda26\u0264\u2da0\u7996\uf82e\u6c90\u0de6\u9ebf\u41ec\ub393\u701a\ub09a\u8917\u1553\ue9b4\u752d\u2709\u18ff\u2ab4\uc8fd\u14ca\ud552\u8a10\uca7c\ua343\u9ce8\u9052\u7095\uada8\ue4b6\u1922\u432f\u965e\ube99\ube3d\u4bed\u2ed1\u7638\u4a1b\ua8f8\u0cb9\udc09\u6818\u05c9\uabef\u86e2\u0da3\u31c2\ucb4e\u576c\u77b3\u2de1\u5bcd\u51b7\u27e3\u8955\u55ef\u654e\u541d\u95f4\uc9e5\u6e1c\ud453\udd08\u66b6\uf5b7\ubfaf\uf87d\ubf29\u94b6\u8eef\ud3d4"

    invoke-static {v9, v12, v13, v5, v14}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ｋ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    :cond_0
    :try_start_2
    const-string v6, "\uc63f\u0ecf\uec87\u2b71"

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    int-to-char v9, v9

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    const-string v13, "\uf028\u622a\ufc37\u9ddc\u1b55\uc087\u4869\u4d2b\uc0cc\uade2\uf775\u6f67\u6993\u6f57\ucc95\ua34c\ue91f\u4907\u9719\u5759"

    invoke-static {v6, v9, v12, v5, v13}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    :catchall_0
    :try_start_3
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ｋ:Landroid/app/Activity;

    if-eqz v6, :cond_1

    .line 215
    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾒ(Landroid/app/Activity;)V

    goto :goto_0

    .line 217
    :cond_1
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾇ:Landroid/app/Application;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/jx;->ﾒ(Landroid/app/Application;)V

    .line 220
    :goto_0
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻛ:Ljava/lang/String;

    invoke-virtual {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻐ(Ljava/lang/String;)V

    .line 221
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getInitializationSource()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﾒ(Ljava/lang/String;)V

    .line 222
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getCoppa()Z

    move-result v9

    invoke-virtual {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻐ(Z)V

    .line 223
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getDeviceIdType()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;)V

    .line 224
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v6

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getMetaData()Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ｋ(Ljava/util/Map;)V

    .line 225
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾇ:Landroid/app/Application;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    .line 227
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9, v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;Landroid/content/Context;)Landroid/content/Context;

    .line 229
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/iv;

    invoke-direct {v12, v6}, Lcom/ironsource/adqualitysdk/sdk/i/iv;-><init>(Landroid/content/Context;)V

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/iv;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    .line 231
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/je;

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/an;->ｋ()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ljava/lang/String;

    const/16 v15, 0xc

    new-array v15, v15, [C

    fill-array-data v15, :array_0

    invoke-direct {v14, v15}, Ljava/lang/String;-><init>([C)V

    invoke-direct {v12, v6, v13, v14}, Lcom/ironsource/adqualitysdk/sdk/i/je;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/je;)Lcom/ironsource/adqualitysdk/sdk/i/je;

    .line 234
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object v17

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v19

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    move-result-object v20

    new-instance v9, Lcom/ironsource/adqualitysdk/sdk/i/t$3$2;

    invoke-direct {v9, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    .line 243
    invoke-static {v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Z

    move-result v22

    move-object/from16 v18, v6

    move-object/from16 v21, v9

    .line 234
    invoke-virtual/range {v17 .. v22}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﾒ(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/iv;Lcom/ironsource/adqualitysdk/sdk/i/an;Lcom/ironsource/adqualitysdk/sdk/i/ar$c;Z)V

    move-object/from16 v6, v18

    .line 245
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/iw;

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v13

    iget-object v14, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v14}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    move-result-object v14

    invoke-virtual {v14}, Lcom/ironsource/adqualitysdk/sdk/i/an;->ﻐ()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v6, v13, v14}, Lcom/ironsource/adqualitysdk/sdk/i/iw;-><init>(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/iv;Ljava/lang/String;)V

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iw;

    .line 246
    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ju;->ﾒ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 248
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object v12

    new-instance v13, Lcom/ironsource/adqualitysdk/sdk/i/t$3$4;

    invoke-direct {v13, v1, v9}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    .line 257
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object v12

    new-instance v13, Lcom/ironsource/adqualitysdk/sdk/i/t$3$5;

    invoke-direct {v13, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    invoke-virtual {v12, v13}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    .line 264
    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v12, v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/t;Landroid/content/Context;)V

    .line 266
    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v17, Lcom/ironsource/adqualitysdk/sdk/i/ag;

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v19

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    move-result-object v20

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ｋ:Landroid/app/Activity;

    if-eqz v13, :cond_2

    move/from16 v21, v7

    goto :goto_1

    :cond_2
    move/from16 v21, v8

    :goto_1
    new-instance v13, Lcom/ironsource/adqualitysdk/sdk/i/t$3$3;

    invoke-direct {v13, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    move-object/from16 v18, v6

    move-object/from16 v22, v9

    move-object/from16 v23, v13

    invoke-direct/range {v17 .. v23}, Lcom/ironsource/adqualitysdk/sdk/i/ag;-><init>(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;Lcom/ironsource/adqualitysdk/sdk/i/an;ZLjava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/s;)V

    move-object/from16 v9, v17

    move-object/from16 v6, v18

    move-object/from16 v20, v22

    invoke-static {v12, v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    .line 278
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isUserIdSet()Z

    move-result v9

    if-nez v9, :cond_3

    .line 279
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ao;->ﺙ()V

    .line 281
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﮐ()Ljava/lang/String;

    move-result-object v0

    .line 284
    :cond_3
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 285
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v9

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/t$3$1;

    invoke-direct {v12, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    invoke-virtual {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ai;)V

    .line 293
    :cond_4
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v9

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/t$3$6;

    invoke-direct {v12, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$6;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    invoke-virtual {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/je$b;)V

    .line 300
    new-instance v21, Lcom/ironsource/adqualitysdk/sdk/i/ay;

    invoke-direct/range {v21 .. v21}, Lcom/ironsource/adqualitysdk/sdk/i/ay;-><init>()V

    .line 306
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v17, Lcom/ironsource/adqualitysdk/sdk/i/at;

    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﮐ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/iw;

    move-result-object v18

    iget-object v12, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v19

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;

    invoke-direct {v12, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$10;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    move-object/from16 v22, v12

    invoke-direct/range {v17 .. v22}, Lcom/ironsource/adqualitysdk/sdk/i/at;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/iw;Lcom/ironsource/adqualitysdk/sdk/i/ag;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/ay;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;)V

    move-object/from16 v12, v17

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/at;)Lcom/ironsource/adqualitysdk/sdk/i/at;

    .line 317
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/at;

    move-result-object v9

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;

    invoke-direct {v12, v1}, Lcom/ironsource/adqualitysdk/sdk/i/t$3$9;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V

    invoke-virtual {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdListener;)V

    .line 332
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/aj;

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/at;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/ironsource/adqualitysdk/sdk/i/aj;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/at;)V

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/aj;)Lcom/ironsource/adqualitysdk/sdk/i/aj;

    .line 333
    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    new-instance v12, Lcom/ironsource/adqualitysdk/sdk/i/al;

    iget-object v13, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v13}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/ag;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/ironsource/adqualitysdk/sdk/i/al;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag;)V

    invoke-static {v9, v12}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/i/al;)Lcom/ironsource/adqualitysdk/sdk/i/al;

    .line 335
    invoke-static {v8, v8}, Landroid/view/View;->getDefaultSize(II)I

    move-result v9

    int-to-char v9, v9

    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v12

    invoke-static {v4, v9, v12, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\ud151\ud72f\u01aa\u35ce"

    invoke-static {v8}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v8

    cmpl-float v8, v8, v16

    int-to-char v8, v8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v14

    cmp-long v10, v14, v10

    const v11, -0x5528d030

    add-int/2addr v10, v11

    const-string v11, "\uecd4\u25aa\ucc82\ubb53\uf658\u8959\uce19\u011c\u26fa\uc034\u6e6b\u608f\u9de0\u5bd4\ud0e9\u48af\u09a0\u76c1\u231b\uf76f\u2096\u726d\u28d4\u450b\u35d5\uf88b\u3443\u6863\u6101\u13ef\udc36\ueb4e\u383a"

    invoke-static {v13, v8, v10, v5, v11}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v10, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v10}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    move-result-object v10

    invoke-virtual {v10}, Lcom/ironsource/adqualitysdk/sdk/i/an;->ﻛ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    iget-object v8, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    iget-object v9, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ｋ:Landroid/app/Activity;

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    move-object v9, v6

    :goto_2
    invoke-static {v8, v9, v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/t;Landroid/content/Context;Ljava/lang/String;)V

    .line 338
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0, v6}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Landroid/content/Context;)V

    .line 340
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﭴ(Lcom/ironsource/adqualitysdk/sdk/i/t;)V

    .line 341
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﮌ(Lcom/ironsource/adqualitysdk/sdk/i/t;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    const/16 v16, 0x0

    :goto_3
    move-object v10, v0

    .line 343
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v0

    int-to-char v0, v0

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v2

    cmpl-float v2, v2, v16

    sub-int/2addr v7, v2

    const-string v2, "\ufc6d\udfe3\ud24d\u01ca\u5128\u065d\uc6d8\udab1\u9e1b\u9139\u38d2\u16bd\u0736\u0753\u7d3b\u4b4a\u5a04\u5e09\u6511\ua3e7\u7d29\u721a\u1764\u2d0c\uc63f\u5ed3\u3613\u06cc\u3c8b\u175f\uf0eb\uade8\u7ecd\u1145"

    const-string v6, "\ucb7f\ub702\u3301\ud144"

    invoke-static {v6, v0, v7, v5, v2}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    .line 344
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    int-to-char v0, v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    invoke-static {v4, v0, v2, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v11, 0x1

    invoke-static/range {v8 .. v13}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 345
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    sget-object v2, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;->EXCEPTION_ON_INIT:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;

    invoke-static {v0, v2, v9}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/t;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 2
        0x42s
        0x30s
        0x72s
        0x31s
        0x73s
        0x57s
        0x40s
        0x73s
        0x48s
        0x33s
        0x72s
        0x65s
    .end array-data
.end method
