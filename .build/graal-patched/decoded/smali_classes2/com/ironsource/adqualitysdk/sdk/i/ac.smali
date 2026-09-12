.class public abstract Lcom/ironsource/adqualitysdk/sdk/i/ac;
.super Lcom/ironsource/adqualitysdk/sdk/i/v;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/ironsource/adqualitysdk/sdk/i/v<",
        "Landroid/webkit/WebView;",
        "TT;>;",
        "Landroid/view/View$OnLayoutChangeListener;"
    }
.end annotation


# static fields
.field private static ﭖ:C = '\ua1a3'

.field private static ﭴ:I = 0x0

.field private static ﮉ:C = '\uc3c9'

.field private static ﮌ:I = 0x1

.field private static ﱡ:C = '\u2353'

.field private static ﻏ:C = '\u4d5d'


# instance fields
.field private ﮐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/jn;",
            ">;"
        }
    .end annotation
.end field

.field private ﱟ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/webkit/WebView;",
            "Lcom/ironsource/adqualitysdk/sdk/i/jr;",
            ">;"
        }
    .end annotation
.end field

.field private ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/jt;

.field private ﻐ:Z

.field private ﻛ:Ljava/lang/String;

.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

.field private ﾇ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ﾒ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/v;-><init>()V

    .line 42
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮐ:Ljava/util/List;

    return-void
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Lcom/ironsource/adqualitysdk/sdk/i/ay$d;
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    return-object p0
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

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮉ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭖ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻏ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱡ:C

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

.method static synthetic ﻛ(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz v1, :cond_0

    const/16 v1, 0x24

    div-int/lit8 v1, v1, 0x0

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x6f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method private ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ay$d;
    .locals 5

    const/4 v0, 0x2

    .line 85
    rem-int v1, v0, v0

    .line 83
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    .line 82
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, 0x4d

    .line 85
    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    .line 83
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ay$d;

    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3

    :cond_1
    return-object v3
.end method

.method private ｋ(Landroid/webkit/WebView;)V
    .locals 3

    const/4 v0, 0x2

    .line 240
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/jt;

    invoke-virtual {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jt;->ﻐ(Landroid/webkit/WebView;)V

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Z
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    iget-boolean p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ:Z

    if-eqz v1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/jn;
    .locals 4

    const/4 v0, 0x2

    .line 126
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ac;)V

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v2, v2, 0x41

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x21

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ:Ljava/util/List;

    add-int/lit8 v2, v2, 0x17

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v2, v0

    return-object p0
.end method

.method private ﾇ(Landroid/webkit/WebView;)V
    .locals 4

    const/4 v0, 0x2

    .line 235
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x4f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    .line 230
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/jr;

    .line 231
    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ:Z

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v2, v2, 0x25

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_3

    .line 231
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﻛ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 232
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ki;->ﻛ(Landroid/webkit/WebView;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 233
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﾒ()V

    .line 235
    :cond_1
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ(Landroid/webkit/WebView;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_2

    const/4 p1, 0x4

    rem-int/2addr p1, v0

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﻛ()Z

    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac;Landroid/webkit/WebView;)V
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Landroid/webkit/WebView;)V

    if-nez v1, :cond_0

    const/16 p0, 0x8

    div-int/lit8 p0, p0, 0x0

    :cond_0
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p0, p0, 0x9

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method private static ﾒ(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x2

    .line 254
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    const-string v2, "\u7196\u3e54\u8520\u0abd\u1fa9\u89e9"

    if-eqz v1, :cond_0

    .line 247
    :try_start_0
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v1

    int-to-byte v1, v1

    shr-int v1, v0, v1

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 248
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 247
    :cond_0
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v1

    int-to-byte v1, v1

    rsub-int/lit8 v1, v1, 0x4

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 248
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 249
    :goto_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p0, p0, 0x4d

    rem-int/lit16 v2, p0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_1

    return-object v1

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p0, p0, 0x37

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p0, v0

    goto :goto_1

    :catch_0
    move-exception p0

    const/4 v0, 0x0

    .line 252
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x10

    const-string v1, "\uf104\uf265\u67c2\u187f\u0171\u1c23\u4877\u1474\ucfa8\ueed9\ub438\u7b61\ue255\u0493\u7dc3\u6578"

    invoke-static {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    add-int/lit8 v1, v1, 0x12

    const-string v2, "\u02ea\uf2be\u8e85\u861f\ud508\u81ba\ubb5d\u7ef5\u5a14\u5a7c\u7c0b\u1d84\u88ec`\u221b\u1283\u42ab\u63fc"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 254
    :goto_1
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-object p0
.end method

.method private static ﾒ(Lorg/json/JSONObject;Landroid/webkit/WebView;)V
    .locals 4

    const/4 v0, 0x2

    .line 270
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/16 v1, 0x23

    .line 267
    div-int/2addr v1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_3

    .line 269
    :goto_0
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ᖸ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p0, p0, 0x51

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_2

    return-void

    :cond_2
    throw v3

    :catch_0
    :cond_3
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 p0, p0, 0x5

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_4

    return-void

    :cond_4
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3
.end method

.method private ﾒ(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Landroid/webkit/WebView;",
            "TT;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 284
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    .line 283
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ij;->ﮐ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 284
    invoke-super {p0, p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﻛ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p1, p1, 0x41

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    const/16 p1, 0x36

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    const/4 p2, 0x2

    .line 113
    rem-int p3, p2, p2

    const/4 p3, 0x0

    .line 106
    :try_start_0
    instance-of p4, p1, Landroid/webkit/WebView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p4, :cond_1

    .line 113
    sget p4, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p4, p4, 0x13

    rem-int/lit16 p5, p4, 0x80

    sput p5, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p4, p2

    if-nez p4, :cond_0

    .line 107
    :try_start_1
    check-cast p1, Landroid/webkit/WebView;

    .line 108
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    const/16 p5, 0x5e

    div-int/2addr p5, p3

    if-eqz p4, :cond_1

    goto :goto_0

    .line 107
    :cond_0
    check-cast p1, Landroid/webkit/WebView;

    .line 108
    iget-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 109
    :goto_0
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Landroid/webkit/WebView;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 p1, p1, 0x7

    rem-int/lit16 p3, p1, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr p1, p2

    return-void

    :catchall_0
    move-exception p1

    const/16 p2, 0x30

    const-string p4, ""

    invoke-static {p4, p2, p3, p3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result p2

    add-int/lit8 p2, p2, 0x11

    const-string p5, "\uf104\uf265\u67c2\u187f\u0171\u1c23\u4877\u1474\ucfa8\ueed9\ub438\u7b61\ue255\u0493\u7dc3\u6578"

    invoke-static {p5, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-static {p4, p3, p3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p4

    rsub-int/lit8 p4, p4, 0x17

    const-string p5, "\u02ea\uf2be\u8e85\u861f\ud508\u81ba\u7c0b\u1d84\uf49c\uec33\u45cb\ua38a\u0fa9\u91c2\u6329\u900c\u7f8f\u2714\ua098\u9665i\ueef8\u6421\u0313"

    invoke-static {p5, p4}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p4, p1, p3}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ﻐ(Landroid/webkit/WebView;)V
    .locals 4

    const/4 v0, 0x2

    .line 99
    rem-int v1, v0, v0

    .line 91
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x65

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    if-eqz p1, :cond_4

    add-int/lit8 v2, v2, 0x77

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_3

    .line 89
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 99
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    const-string v2, "\uf3c3\u04f2\ud072\uafc2\ue048\u29b3\u7ad6\u1724\uace2\u09c0"

    if-nez v1, :cond_0

    .line 90
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shl-int/lit8 v1, v1, 0x32

    const/16 v3, 0x75

    shr-int v1, v3, v1

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ｋ(Landroid/webkit/WebView;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/jr;

    move-result-object v1

    .line 91
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    if-nez v2, :cond_1

    goto :goto_0

    .line 90
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int/lit8 v1, v1, 0x9

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ｋ(Landroid/webkit/WebView;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/jr;

    move-result-object v1

    .line 91
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    if-nez v2, :cond_1

    .line 92
    :goto_0
    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    .line 91
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v2, v2, 0x7d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v2, v0

    .line 94
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/jn;

    move-result-object v0

    .line 96
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮐ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jn;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Landroid/webkit/WebView;)V

    .line 99
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_2
    return-void

    .line 91
    :cond_3
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1

    :cond_4
    return-void
.end method

.method public final ﻛ()V
    .locals 6

    const/4 v0, 0x2

    .line 71
    rem-int v1, v0, v0

    .line 61
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    .line 63
    invoke-virtual {v2, p0}, Landroid/webkit/WebView;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 64
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/i/jr;

    .line 65
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮐ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ironsource/adqualitysdk/sdk/i/jn;

    .line 66
    invoke-virtual {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jn;)V

    .line 71
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v4, v4, 0x25

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v4, v0

    goto :goto_0

    .line 69
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮐ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/4 v1, 0x0

    .line 70
    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    .line 71
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﱟ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    return-void
.end method

.method public final ﻛ(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Landroid/webkit/WebView;",
            "TT;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 278
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 277
    invoke-static {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Lorg/json/JSONObject;Landroid/webkit/WebView;)V

    .line 278
    invoke-super {p0, p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﾒ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p1, 0x22

    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 277
    :cond_0
    invoke-static {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Lorg/json/JSONObject;Landroid/webkit/WebView;)V

    .line 278
    invoke-super {p0, p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﾒ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 p1, p1, 0x5d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_1

    const/16 p1, 0x33

    div-int/lit8 p1, p1, 0x0

    :cond_1
    return-void
.end method

.method public final synthetic ﻛ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v1, v1, 0xb

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v1, v0

    check-cast p2, Landroid/webkit/WebView;

    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/16 p1, 0x14

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method

.method public final ｋ(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x2

    .line 258
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v2, v1, 0x4d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v2, v0

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻛ:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    rem-int/lit16 p1, v1, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    return-void
.end method

.method public final ｋ(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/webkit/WebView;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 120
    rem-int v1, v0, v0

    if-eqz p1, :cond_2

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 120
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    .line 119
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 120
    invoke-virtual {p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Landroid/webkit/WebView;)V

    goto :goto_0

    :cond_0
    return-void

    .line 119
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final ﾇ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 p1, 0x2

    .line 263
    rem-int v0, p1, p1

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v0, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, p1

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻛ:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v0, p1

    return-object v1
.end method

.method public final ﾒ()Landroid/webkit/WebView;
    .locals 4

    const/4 v0, 0x2

    .line 78
    rem-int v1, v0, v0

    .line 75
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    if-eqz v1, :cond_0

    .line 78
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    add-int/lit8 v2, v2, 0x61

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    rem-int/2addr v2, v0

    .line 76
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ｋ()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0

    .line 78
    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x0

    if-eqz v1, :cond_1

    const/16 v1, 0x32

    div-int/lit8 v1, v1, 0x0

    :cond_1
    return-object v0
.end method

.method abstract ﾒ(Landroid/webkit/WebView;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            ")TT;"
        }
    .end annotation
.end method

.method final ﾒ(Ljava/lang/String;Ljava/util/List;ZZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZ)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 57
    rem-int v1, v0, v0

    .line 53
    iput-boolean p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ:Z

    .line 54
    new-instance p3, Lcom/ironsource/adqualitysdk/sdk/i/jt;

    invoke-direct {p3, p1, p5}, Lcom/ironsource/adqualitysdk/sdk/i/jt;-><init>(Ljava/lang/String;Z)V

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﺙ:Lcom/ironsource/adqualitysdk/sdk/i/jt;

    .line 55
    iput-boolean p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ:Z

    .line 57
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ:Ljava/util/List;

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 p1, p1, 0xf

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final synthetic ﾒ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﮌ:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﭴ:I

    rem-int/2addr v1, v0

    check-cast p2, Landroid/webkit/WebView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻛ(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    div-int/2addr p1, p1

    :cond_0
    return-void
.end method
