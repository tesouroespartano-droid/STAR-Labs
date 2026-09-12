.class final Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﻛ:I = 0x1

.field private static ｋ:J = 0x6a5223c25c820abeL

.field private static ﾇ:I


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/at$8;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private static ﾇ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1077
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾒ:Ljava/lang/Object;

    monitor-enter v0

    .line 1080
    :try_start_0
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ｋ:I

    .line 1083
    array-length p1, p0

    new-array p1, p1, [C

    const/4 v1, 0x0

    .line 1084
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1086
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    aget-char v2, p0, v2

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/i;->ｋ:I

    mul-int/2addr v3, v4

    xor-int/2addr v2, v3

    int-to-long v2, v2

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ｋ:J

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-char v2, v2

    aput-char v2, p1, v1

    .line 1084
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/i;->ﾇ:I

    goto :goto_0

    .line 1090
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1091
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ﻐ()V
    .locals 10

    const/4 v0, 0x2

    .line 502
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻛ:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ:I

    rem-int/2addr v1, v0

    .line 491
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾒ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 492
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Lcom/ironsource/adqualitysdk/sdk/i/ay;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾒ()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/bb$e;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bb$e;

    .line 1040
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;

    invoke-direct {v4, v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ay;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/bb$e;)V

    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    .line 493
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v2, v2, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/at;Lcom/ironsource/adqualitysdk/sdk/i/cp;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    .line 495
    :try_start_0
    const-string v3, "\u0adf\u6ddb\uc4eb"

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v4

    int-to-byte v4, v4

    add-int/lit16 v4, v4, 0x6714

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ:I

    add-int/lit8 v3, v3, 0x17

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻛ:I

    rem-int/2addr v3, v0

    .line 498
    :catch_0
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v4, v4, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v4}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾒ()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Lcom/ironsource/adqualitysdk/sdk/i/ay;

    move-result-object v1

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾒ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ay;->ﻛ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 500
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Ljava/util/Map;

    move-result-object v1

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v3, v3, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾒ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;

    move-result-object v1

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;->AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﾇ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    const v7, 0xc757

    sub-int/2addr v7, v6

    const-string v6, "\u0a9e\ucd9a\u8474\u5cd0\u17c2\uee7b\ua6d1\u79ad\u3075\u08d8\uc3b7\u9a6d\u528a"

    invoke-static {v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﺙ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const v6, 0x87c5

    const-string v7, ""

    invoke-static {v7, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v8

    add-int/2addr v8, v6

    const-string v6, "\u0a9e\u8d09\u0551\u9d80\u15df\uac0e\u2452\ubcb8\u34e5\ucf73\u475f\udfa6\u57ed\uefd2\u6614\ufe54\u76ce\u0ed8\u8100\u194a\u91fa\u29e1\ua035\u387f\ub0b5\u48ea\uc0d3\u5b17\ud312"

    invoke-static {v6, v8}, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at$8;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/at$8;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/cp;->ﻏ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v6, 0x30

    invoke-static {v7, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v6

    const v7, 0xc7e0

    sub-int/2addr v7, v6

    const-string v6, "\u0a9e\ucd30\u850e\u5d3d\u1554\uedbe\ua58f\u7dfc\u35c4"

    invoke-static {v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;->adQualitySdkInitFailed(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    .line 502
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v1

    add-int/lit16 v1, v1, 0x4ac3

    const-string v2, "\u0afd\u4012\u9f56\uea99\u21d7\u7f12\uca58\u0184\u5cd4\uaa28\ue141\u3cb1\u8bfb\uc13e\u1c71\u6ba1"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v4 .. v9}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﾇ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/at$8$1;->ﻛ:I

    rem-int/2addr v1, v0

    :cond_0
    return-void
.end method
