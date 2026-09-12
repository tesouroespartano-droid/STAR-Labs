.class public final Lcom/ironsource/adqualitysdk/sdk/i/jq;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static ﮐ:I = 0x1

.field private static ﻐ:I = 0x0

.field private static ﾒ:J = 0x44260fd48dc1d71aL


# instance fields
.field private ﻛ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ay$d;",
            ">;"
        }
    .end annotation
.end field

.field private ｋ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field

.field private ﾇ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ｋ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private static ﻐ(Ljava/lang/String;I)Ljava/lang/String;
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

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾒ:J

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

.method private static ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ay$d;)V
    .locals 2

    const/4 v0, 0x2

    .line 59
    rem-int v1, v0, v0

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 p0, p0, 0x5b

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method private ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ay$d;)V
    .locals 2

    const/4 v0, 0x2

    .line 42
    rem-int v1, v0, v0

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻛ:Ljava/lang/ref/WeakReference;

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 p1, p1, 0x47

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final ﻐ()Z
    .locals 5

    const/4 v0, 0x2

    .line 106
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    add-int/lit8 v2, v1, 0x3f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr v2, v0

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾇ:Z

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v4, v1, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3

    :cond_1
    throw v3
.end method

.method public final ｋ(Landroid/webkit/WebChromeClient;)V
    .locals 5

    const/4 v0, 0x2

    .line 99
    rem-int v1, v0, v0

    .line 86
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾒ()Landroid/webkit/WebView;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 99
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 v2, v2, 0x5b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_1

    .line 89
    :try_start_0
    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ki;->ﻐ(Landroid/webkit/WebView;)Landroid/webkit/WebChromeClient;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 90
    instance-of v3, v2, Landroid/webkit/WebChromeClient;

    if-nez v3, :cond_2

    .line 92
    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/hk;

    invoke-direct {v3, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hk;-><init>(Landroid/webkit/WebChromeClient;Landroid/webkit/WebChromeClient;)V

    .line 93
    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ay$d;)V

    .line 94
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr p1, v0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    .line 89
    :cond_1
    :try_start_1
    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ki;->ﻐ(Landroid/webkit/WebView;)Landroid/webkit/WebChromeClient;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 p1, 0x0

    .line 90
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 99
    throw p1

    :goto_0
    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    add-int/lit16 v1, v1, 0x1c14

    const-string v2, "\ud74d\ucb6c\uef5e\u8375\ua73f\u5b20\u7f1f\u13da\u37fa\u2bc5\ucfc1\ue3a5\u878d\ubb84\u5e7f\u7269"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const v2, 0x8b91

    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    sub-int/2addr v2, v3

    const-string v3, "\ud75f\u5cf9\uc04a\u75c6\uf92c\u6eef\u921b\u0788\u8be6\u3f77\ua4d9\u284f\u5db1\uc167\u76a3\ufa00\u6e68\u93f8\u0740\u8cab\u3021\ua592\u2909\u5d5e\uc2ee\u765a\ufbc5\u6f3f\u94b2"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_2
    return-void
.end method

.method public final ｋ(Landroid/webkit/WebViewClient;)V
    .locals 5

    const/4 v0, 0x2

    .line 82
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr v1, v0

    .line 69
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾒ()Landroid/webkit/WebView;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 72
    :try_start_0
    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ki;->ｋ(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    move-result-object v3

    .line 73
    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/hj;

    invoke-direct {v4, v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/hj;-><init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebViewClient;)V

    .line 74
    invoke-direct {p0, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ay$d;)V

    .line 75
    invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    const/4 p1, 0x1

    .line 76
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾇ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 79
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x8

    rsub-int v1, v1, 0x1c13

    const-string v3, "\ud74d\ucb6c\uef5e\u8375\ua73f\u5b20\u7f1f\u13da\u37fa\u2bc5\ucfc1\ue3a5\u878d\ubb84\u5e7f\u7269"

    invoke-static {v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    const v4, 0xebc0

    add-int/2addr v3, v4

    const-string v4, "\ud75f\u3ca9\u00ea\u1436\u786c\u4dff\u51fb\ua538\u8966\u9ea7\ue2f9\uf63f\uda71\u2ff7\u33c3\u0730\u6b68\u709d\u44e1\ua82c\ubc79\u818c\u95e0\uf924\ucd67\ud2ad\u26f4"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 82
    :cond_0
    iput-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﾇ:Z

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    add-int/lit8 p1, p1, 0x2f

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ay$d;
    .locals 4

    const/4 v0, 0x2

    .line 38
    rem-int v1, v0, v0

    .line 35
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻛ:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 38
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 v2, v2, 0xd

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    .line 36
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    const/16 v1, 0x63

    div-int/lit8 v1, v1, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    return-object v0

    :cond_1
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x0

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﾒ()Landroid/webkit/WebView;
    .locals 4

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    add-int/lit8 v1, v1, 0x11

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ｋ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﻐ:I

    add-int/lit8 v2, v2, 0x5d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/jq;->ﮐ:I

    rem-int/2addr v2, v0

    return-object v1
.end method
