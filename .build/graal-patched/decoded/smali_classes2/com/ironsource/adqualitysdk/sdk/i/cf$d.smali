.class Lcom/ironsource/adqualitysdk/sdk/i/cf$d;
.super Lcom/unity3d/services/core/webview/WebViewApp;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/hg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/unity3d/services/core/webview/WebViewApp;",
        "Lcom/ironsource/adqualitysdk/sdk/i/hg<",
        "Lcom/unity3d/services/core/webview/WebViewApp;",
        ">;"
    }
.end annotation


# static fields
.field private static ﮐ:C = '\u4c90'

.field private static ﱟ:I = 0x0

.field private static ﱡ:C = '\uad13'

.field private static ﺙ:I = 0x1

.field private static ﻏ:C = '\uc873'

.field private static ﻛ:C = '\ue141'

.field private static ﾒ:J = -0x660cc85417cb5abL


# instance fields
.field private ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

.field private ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cf;Lcom/unity3d/services/core/webview/WebViewApp;Lcom/ironsource/adqualitysdk/sdk/i/cl;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    invoke-direct {p0}, Lcom/unity3d/services/core/webview/WebViewApp;-><init>()V

    .line 454
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 455
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    return-void
.end method

.method private ﾇ()Lcom/unity3d/services/core/webview/WebViewApp;
    .locals 3

    const/4 v0, 0x2

    .line 460
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x2d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private static ﾇ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1073
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    .line 1076
    :try_start_0
    sget-wide v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ:J

    invoke-static {v1, v2, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﻛ(J[CI)[C

    move-result-object p0

    const/4 p1, 0x4

    .line 1081
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1083
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    sub-int/2addr v1, p1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ﾇ:I

    .line 1084
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

    sget-wide v6, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ:J

    mul-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-char v2, v2

    aput-char v2, p0, v1

    .line 1081
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/h;->ｋ:I

    goto :goto_0

    .line 1088
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

    .line 1089
    monitor-exit v0

    throw p0
.end method

.method private static ﾒ(Ljava/lang/String;I)Ljava/lang/String;
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

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱡ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﮐ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻛ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻏ:C

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
.method public addCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V
    .locals 6

    const/4 v0, 0x2

    .line 604
    rem-int v1, v0, v0

    .line 601
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-string v3, ""

    const/16 v4, 0x30

    const/4 v5, 0x0

    invoke-static {v3, v4, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x15

    const-string v4, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u0d26\u7577\uf528\uc9fc\u7c95\u0d73\ubd48\u4667\u8b4a\uc9fd\uf9ab\u2477"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 604
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->addCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 p1, p1, 0x69

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public getCallback(Ljava/lang/String;)Lcom/unity3d/services/core/webview/bridge/NativeCallback;
    .locals 5

    const/4 v0, 0x2

    .line 622
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    .line 617
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x14

    shr-int/lit8 v3, v3, 0x6

    rsub-int/lit8 v3, v3, 0x1

    const-string v4, "\uadf8\uadaf\u9a2b\ud01b\u843a\u10f2\u20bf\ufe16\u84c5\ue9e7\u39b3\u28ad\uff20\u06a6\u6346\u117f\ud661\u5c0e\u94df\u7a25\u08c4\u75e2\ubda2\ua491\u633f\u82b9"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 622
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v3, v3, 0x2d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_0

    .line 620
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->getCallback(Ljava/lang/String;)Lcom/unity3d/services/core/webview/bridge/NativeCallback;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->getCallback(Ljava/lang/String;)Lcom/unity3d/services/core/webview/bridge/NativeCallback;

    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    .line 622
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 p1, p1, 0x5f

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    throw v2
.end method

.method public getConfiguration()Lcom/unity3d/services/core/configuration/Configuration;
    .locals 7

    const/4 v0, 0x2

    .line 562
    rem-int v1, v0, v0

    .line 560
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    const-string v2, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u5525\u7675\u18ba\u45ca\u792f\ub753\u3df3\u6e8e\ufde3\u3643\u8f36\u7fdc\u5662\u613a\u3bd9\u9467\u2732\u3d92"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 557
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/16 v5, 0x2c

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    shr-int/2addr v5, v6

    invoke-static {v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_2

    goto :goto_0

    .line 557
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1b

    invoke-static {v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_2

    .line 562
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 560
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->getConfiguration()Lcom/unity3d/services/core/configuration/Configuration;

    move-result-object v0

    const/4 v1, 0x3

    div-int/2addr v1, v3

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->getConfiguration()Lcom/unity3d/services/core/configuration/Configuration;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;
    .locals 6

    const/4 v0, 0x2

    .line 632
    rem-int v1, v0, v0

    .line 627
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-string v3, ""

    invoke-static {v3}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v3

    neg-int v3, v3

    const-string v4, "\u5656\u5601\u9c08\ud638\udef8\u4a30\ub2e5\u6c4c\u7f6b\uefc4\u6371\ubaf7\u048e\u0085\u3984\u8325\u2dcf\u5a2d\uce1b\ue86c\uf374\u73c2\ue770\u36f9\u9886\u8490\ubdc2\u1f23\ua1e8\ude37\u5235\u647f\u774d\uf7cc\u6b6c\ub2ef\u1c86\u088d\u01f1\u9b15\u25c6\u2224"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 632
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v3, v3, 0x5b

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_0

    .line 630
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;

    throw v2

    :cond_1
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_2

    const/16 v0, 0x8

    div-int/2addr v0, v4

    :cond_2
    return-object v2
.end method

.method public getWebAppFailureCode()I
    .locals 6

    const/4 v0, 0x2

    .line 511
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    const-string v2, ""

    const-string v3, "\uef7b\uef2c\u5a22\u1012\u56d8\uc210\u2a31\uf498\uc646\u29ee\ueb51\u2223\ubda3\uc6af\ub1a4\u1bf1\u94e2\u9c07\u4629\u70af\u4a49\ub5c6\u6f52\uae0e\u2199\u42ba\u35ff\u87fe\u18f6\u181d\uda1f\ufc85\uce58\u31e7\ue34b"

    const/4 v4, 0x0

    if-nez v1, :cond_0

    .line 506
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    neg-int v2, v2

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v5, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 506
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    neg-int v2, v2

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v5, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 509
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureCode()I

    move-result v1

    .line 508
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x4f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    return v1

    :cond_1
    return v4
.end method

.method public getWebAppFailureMessage()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x2

    .line 502
    rem-int v1, v0, v0

    .line 500
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    .line 497
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    add-int/lit8 v4, v4, 0x23

    const-string v5, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u5525\u7675\u18ba\u45ca\uf010\ucd3a\u07ba\ubbf3\u40dd\u94a9\u8a9d\u1512\ubbdc\uaf69\u8f36\u7fdc\u9a0f\u223c\ub556\u8607\ubb63\uffdb\u7485\uc52f"

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 502
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v3, v3, 0x5f

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v3, v0

    if-eqz v3, :cond_0

    .line 500
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureMessage()Ljava/lang/String;

    throw v2

    :cond_1
    return-object v2
.end method

.method public getWebView()Lcom/unity3d/services/core/webview/WebView;
    .locals 6

    const/4 v0, 0x2

    .line 545
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const-string v3, "\ue2dc\ue28b\u0b6f\u415f\ube88\u2a40\u176b\uc9c2\ucbe1\u78a3\u0301\u1f79\ub004\u97e2\u59f4\u26ab\u9945\ucd4a\uae79\u4df5\u47ee\ue49c\u871b\u9341\u2c0f"

    if-nez v1, :cond_0

    .line 540
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v5

    rem-int/lit8 v5, v5, 0x53

    invoke-static {v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 540
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x1

    invoke-static {v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 543
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebView()Lcom/unity3d/services/core/webview/WebView;

    move-result-object v1

    .line 542
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x1

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    return-object v1

    .line 545
    :cond_1
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x4f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x0

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)Z
    .locals 6

    const/4 v0, 0x2

    .line 597
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x43

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    const-string v2, "\ud78f\ud7d8\uedf0\ua7c0\uebec\u7f24\u68c6\ub66f\ufeb2\u9e3c\u5665\u60d4\u8557\u717d\u0c90\u5908\uac1d\u2bd7\ufb25\u3256\u72ba\u0216\ud277\uece5\u1947\uf56b\u88c3\uc506\u201c"

    if-eqz v1, :cond_0

    .line 592
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v4

    neg-int v4, v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object p1, v5, v4

    invoke-virtual {v1, p0, v3, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 592
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v4

    neg-int v4, v4

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 595
    :goto_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)Z

    move-result p1

    return p1

    .line 594
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 p1, p1, 0x75

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr p1, v0

    const/4 v0, 0x0

    if-nez p1, :cond_2

    const/16 p1, 0x17

    div-int/2addr p1, v0

    :cond_2
    return v0
.end method

.method public varargs invokeMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x2

    .line 588
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    .line 583
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const-string v5, "\u64fb\u64ac\uc69a\u8caa\uaf4f\u3b87\u92ec\u4c45\u4dc6\ub556\u12c6\u9afe\u3623\u5a17\u4833\ua322\u1f69\u00bd\ubf86\uc87c\uc1ce\u2972\u96d0\u16d7\uaa37\ude0c\ucc65"

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    filled-new-array {p1, p2, p3, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, p0, v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 586
    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    move-result p1

    .line 588
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 p2, p2, 0x5b

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr p2, v0

    return p1

    :cond_0
    return v3
.end method

.method public isWebAppInitialized()Z
    .locals 6

    const/4 v0, 0x2

    .line 536
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    .line 531
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x1

    const-string v5, "\uf071\uf026\u96d1\udce1\u1c57\u889f\uf060\u2ec9\ud94c\ue51d\ua1de\uf872\ua2a9\u0a5c\ufb2b\uc1ae\u8bfe\u50d7\u0c94\uaaf9\u5560\u7904\u25dd\u7466\u3ebb\u8e41\u7f6d\u5daa\u07e8\ud4f0\u909c\u26ed\ud158\ufd14"

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 536
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x4d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    .line 534
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->isWebAppInitialized()Z

    move-result v0

    return v0

    :cond_0
    return v3
.end method

.method public isWebAppLoaded()Z
    .locals 6

    const/4 v0, 0x2

    .line 477
    rem-int v1, v0, v0

    .line 475
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    .line 472
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    const-string v4, "\uc8fa\uc8ad\uf741\ubd71\ue763\u73ab\u0c95\ud23c\ue1c7\u848d\u5aea\u0487\u9a22\u6bcc\u001f\u3d5b\ub375\u3147\uf7a0\u560c\u6deb\u1894\udee9\u8896\u0631\uefd9\u8449\ua153\u3f66"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 477
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x63

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    .line 475
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->isWebAppLoaded()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->isWebAppLoaded()Z

    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0

    :cond_1
    return v4
.end method

.method public removeCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V
    .locals 6

    const/4 v0, 0x2

    .line 612
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    const-string v2, ""

    const-string v3, "\uadc9\uad9e\u7c78\u3648\u2304\ub7cc\uf1fd\u2f54\u84f4\u0fb4\u9e8d\uf9ef\uff11\ue0f5\uc478\uc028\ud650\uba44\u33cd\uab70\u08fc\u939e\u1a9f\u75de\u6301\u64e3\u402b\u5c3d\u5a5a"

    if-eqz v1, :cond_1

    .line 609
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    neg-int v2, v2

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 609
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/16 v5, 0x30

    invoke-static {v2, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    neg-int v2, v2

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_2

    .line 612
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->removeCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V

    .line 611
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 p1, p1, 0x31

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr p1, v0

    :cond_2
    return-void
.end method

.method public resetWebViewAppInitialization()V
    .locals 6

    const/4 v0, 0x2

    .line 526
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x4f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    const-string v2, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\ue01e\ue80a\ub556\u8607\u18ba\u45ca\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\ub368\ud954\u1aff\u3db1\u3967\ua4d5\u236f\"\u34c5\ud1b5\u0efc\u73f6\u8e47\ucf35"

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 523
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x32

    invoke-static {v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 523
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x28

    invoke-static {v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_2

    .line 526
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->resetWebViewAppInitialization()V

    :cond_2
    return-void
.end method

.method public varargs sendEvent(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x2

    .line 579
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    .line 574
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    rsub-int/lit8 v3, v3, 0x14

    const-string v4, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u3de1\u2000\ue4b9\u68f9\u1610\u9bad\u22e6\ufde3\ub5a4\u6a21"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    filled-new-array {p1, p2, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 579
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v2, v2, 0x6b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v2, v0

    .line 577
    invoke-virtual {v1, p1, p2, p3}, Lcom/unity3d/services/core/webview/WebViewApp;->sendEvent(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setConfiguration(Lcom/unity3d/services/core/configuration/Configuration;)V
    .locals 6

    const/4 v0, 0x2

    .line 569
    rem-int v1, v0, v0

    .line 566
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-string v3, ""

    const/16 v4, 0x30

    const/4 v5, 0x0

    invoke-static {v3, v4, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    add-int/lit8 v3, v3, 0x1c

    const-string v4, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u3de1\u2000\u18ba\u45ca\u792f\ub753\u3df3\u6e8e\ufde3\u3643\u8f36\u7fdc\u5662\u613a\u3bd9\u9467\u2732\u3d92"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 569
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x65

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setConfiguration(Lcom/unity3d/services/core/configuration/Configuration;)V

    if-eqz v2, :cond_0

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 p1, p1, 0x37

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr p1, v0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public setWebAppFailureCode(I)V
    .locals 5

    const/4 v0, 0x2

    .line 492
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    const-string v2, "\ud87b\ud82c\ue29f\ua8af\u3000\ua4c8\u4cc7\u926e\uf146\u9153\u8d89\u44d5\u8aa3\u7e12\ud77c\u7d13\ua3e2\u24ba\u20f1\u1659\u7d49\u0d7b\u098a\uc8f8\u1699\ufa07\u5327\ue108\u2ff6\ua0a0\ubcc7\u9a73\uf958\u895a\u8593"

    if-nez v1, :cond_0

    .line 489
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v4

    ushr-int/lit8 v4, v4, 0x23

    rsub-int/lit8 v4, v4, 0x1

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 489
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x1

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_1

    .line 492
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppFailureCode(I)V

    .line 491
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 p1, p1, 0x19

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public setWebAppFailureMessage(Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x2

    .line 484
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x45

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    const-string v2, "\uf010\ucd3a\u7a8b\u782d\u17eb\u3404\u9982\ub542\u40dd\u94a9\u3de1\u2000\u18ba\u45ca\uf010\ucd3a\u07ba\ubbf3\u40dd\u94a9\u8a9d\u1512\ubbdc\uaf69\u8f36\u7fdc\u9a0f\u223c\ub556\u8607\ubb63\uffdb\u7485\uc52f"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 481
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v3

    mul-int/lit8 v3, v3, 0x67

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v5, v3, [Ljava/lang/Object;

    aput-object p1, v5, v3

    invoke-virtual {v1, p0, v4, v2, v5}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 481
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x22

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_2

    .line 484
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppFailureMessage(Ljava/lang/String;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 p1, p1, 0x3

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr p1, v0

    :cond_2
    return-void
.end method

.method public setWebAppInitialized(Z)V
    .locals 7

    const/4 v0, 0x2

    .line 518
    rem-int v1, v0, v0

    .line 515
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const-string v4, "\uc343\uc314\u111f\u5b2f\ud422\u40ea\uf035\u2e9c\uea7e\u62d3\u69ab\uf827\u919b\u8d92\u335e\uc1e1\ub8da\ud73a\uc4d3\uaaab\u6671\ufefb\ueda8\u740a\u0dae\u0988\ub705\u5de2\u34d2\u5333\u58ec\u26ab\ue275\u7adb\u61b0"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 518
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x1f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppInitialized(Z)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 p1, p1, 0x75

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public setWebAppLoaded(Z)V
    .locals 5

    const/4 v0, 0x2

    .line 467
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x33

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    .line 464
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x1

    const-string v4, "\u0b05\u0b52\u3e04\u7434\ubf3a\u2bf2\ucffc\u1155\u2238\u4dc8\u02b3\uc7ee\u59dd\ua289\u5846\ufe28\u709c\uf821\uafcb\u9562\uae37\ud1e0\u86b0\u4bc3\uc5ed\u2692\udc15\u623b\ufc98\u7c2d"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 467
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v2, v2, 0x3d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppLoaded(Z)V

    if-eqz v2, :cond_0

    const/16 p1, 0x24

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method

.method public setWebView(Lcom/unity3d/services/core/webview/WebView;)V
    .locals 5

    const/4 v0, 0x2

    .line 552
    rem-int v1, v0, v0

    .line 549
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const-string v4, "\u3f3a\u3f6d\u46bd\u0c8d\ub603\u22cb\u42d9\u9c70\u1607\u3571\u0b8a\u4acb\u6de2\uda30\u517f\u730d\u44a3\u8098\ua6f2\u1847\u9a08\ua94e\u8f90\uc6f3\uf1e9"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﻐ:Lcom/unity3d/services/core/webview/WebViewApp;

    if-eqz v1, :cond_0

    .line 552
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x21

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebView(Lcom/unity3d/services/core/webview/WebView;)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 p1, p1, 0xd

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final synthetic ﻐ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x2

    .line 448
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﾇ()Lcom/unity3d/services/core/webview/WebViewApp;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﺙ:I

    add-int/lit8 v2, v2, 0x45

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$d;->ﱟ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    const/16 v0, 0x4d

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object v1
.end method
