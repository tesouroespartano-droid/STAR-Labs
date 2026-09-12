.class public final Lcom/ironsource/adqualitysdk/sdk/i/ii;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/ii$c;,
        Lcom/ironsource/adqualitysdk/sdk/i/ii$d;
    }
.end annotation


# static fields
.field private static ףּ:I = 0x1

.field private static ﭖ:Z

.field private static ﭴ:J

.field private static ﭸ:Z

.field private static ﮉ:[C

.field private static ﮌ:I

.field private static ﮐ:[C

.field private static ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ii;

.field private static final ﱡ:Ljava/lang/Object;

.field private static ﺙ:I


# instance fields
.field private final ﻏ:Landroid/os/Handler;

.field private final ﻐ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ii$d;",
            ">;>;"
        }
    .end annotation
.end field

.field private ﻛ:Z

.field private final ｋ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/BroadcastReceiver;",
            "Ljava/util/ArrayList<",
            "Landroid/content/IntentFilter;",
            ">;>;"
        }
    .end annotation
.end field

.field private final ﾇ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ironsource/adqualitysdk/sdk/i/ii$c;",
            ">;"
        }
    .end annotation
.end field

.field private final ﾒ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ()V

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﱡ:Ljava/lang/Object;

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮌ:I

    add-int/lit8 v0, v0, 0x5b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ףּ:I

    rem-int/lit8 v0, v0, 0x2

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    .line 87
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ:Ljava/util/HashMap;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ:Ljava/util/ArrayList;

    .line 119
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ:Landroid/content/Context;

    .line 120
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ii$1;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ii$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ii;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻏ:Landroid/os/Handler;

    return-void
.end method

.method public static ﻐ(Landroid/content/Context;)Lcom/ironsource/adqualitysdk/sdk/i/ii;
    .locals 2

    .line 101
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﱡ:Ljava/lang/Object;

    monitor-enter v0

    .line 102
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ii;

    if-nez v1, :cond_0

    .line 103
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ii;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ii;

    .line 105
    :cond_0
    sget-object p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ii;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 106
    monitor-exit v0

    throw p0
.end method

.method private ﻐ()V
    .locals 3

    .line 199
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    monitor-enter v0

    .line 200
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 201
    invoke-virtual {v1}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/BroadcastReceiver;

    .line 202
    invoke-direct {p0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    .line 204
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ii;)V
    .locals 3

    const/4 v0, 0x2

    .line 46
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮌ:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ףּ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ()V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮌ:I

    add-int/lit8 p0, p0, 0x5f

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ףּ:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method static ｋ()V
    .locals 2

    const/4 v0, 0x1

    sput-boolean v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭸ:Z

    sput-boolean v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭖ:Z

    const/16 v0, 0x29

    sput v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﺙ:I

    const/16 v0, 0x1a

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮐ:[C

    const/16 v0, 0x40

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮉ:[C

    const-wide v0, 0x18a071359341bb4cL

    sput-wide v0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭴ:J

    return-void

    nop

    :array_0
    .array-data 2
        0x75s
        0x98s
        0x8cs
        0x8as
        0x95s
        0x6bs
        0x9bs
        0x8ds
        0x9cs
        0x9ds
        0x76s
        0x97s
        0x90s
        0x8es
        0x7bs
        0x9fs
        0x92s
        0x49s
        0xa2s
        0x99s
        0x91s
        0x96s
        0x8fs
        0x6fs
        0x50s
        0x63s
    .end array-data

    :array_1
    .array-data 2
        0x41s
        -0x44d1s
        0x76ecs
        0x318ds
        -0x12a1s
        -0x57ees
        0x63e8s
        0x1f78s
        -0x25f7s
        -0x6a21s
        0x508cs
        0xc7es
        -0x3850s
        0x20s
        -0x4494s
        0x76des
        0x318ds
        -0x12a4s
        -0x57f8s
        0x63ads
        0x1f66s
        -0x25c0s
        -0x6a3fs
        0x5099s
        0xc30s
        -0x380ds
        -0x7d4cs
        0x3e4ds
        -0x6f0s
        -0x4b1fs
        0x702cs
        0x2b78s
        -0x1937s
        -0x5e6fs
        0x5d48s
        0x18ebs
        -0x2c44s
        -0x70e3s
        0x4a5cs
        0x5c0s
        0x4ae2s
        -0xe54s
        0x3c6fs
        0x7b0es
        -0x5824s
        -0x1d6fs
        -0x43abs
        0x71cs
        -0x3523s
        -0x724cs
        -0x161bs
        0x52b2s
        -0x609ds
        -0x27e6s
        0x4cfs
        0x419bs
        -0x75cas
        -0x95cs
        0x3382s
        0x7c59s
        -0x46f7s
        -0x1a59s
        0x2e6fs
        0x6b22s
    .end array-data
.end method

.method private ｋ(Landroid/content/BroadcastReceiver;)V
    .locals 10

    .line 172
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    monitor-enter v0

    .line 173
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 175
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x0

    move v3, v2

    .line 177
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 178
    invoke-virtual {v1, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/IntentFilter;

    move v5, v2

    .line 179
    :goto_1
    invoke-virtual {v4}, Landroid/content/IntentFilter;->countActions()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 180
    invoke-virtual {v4, v5}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v6

    .line 181
    iget-object v7, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    if-eqz v7, :cond_3

    move v8, v2

    .line 183
    :goto_2
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v9

    if-ge v8, v9, :cond_2

    .line 184
    invoke-virtual {v7, v8}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;

    iget-object v9, v9, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﾒ:Landroid/content/BroadcastReceiver;

    if-ne v9, p1, :cond_1

    .line 185
    invoke-virtual {v7, v8}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v8, v8, -0x1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 189
    :cond_2
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v7

    if-gtz v7, :cond_3

    .line 190
    iget-object v7, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 195
    :cond_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private ﾇ()V
    .locals 9

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    monitor-enter v0

    .line 315
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-gtz v1, :cond_1

    .line 317
    monitor-exit v0

    return-void

    .line 319
    :cond_1
    new-array v2, v1, [Lcom/ironsource/adqualitysdk/sdk/i/ii$c;

    .line 320
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 321
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->clear()V

    .line 322
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 324
    aget-object v4, v2, v3

    move v5, v0

    .line 325
    :goto_1
    iget-object v6, v4, Lcom/ironsource/adqualitysdk/sdk/i/ii$c;->ﻛ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    .line 326
    iget-object v6, v4, Lcom/ironsource/adqualitysdk/sdk/i/ii$c;->ﻛ:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;

    iget-object v6, v6, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﾒ:Landroid/content/BroadcastReceiver;

    iget-object v7, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ:Landroid/content/Context;

    iget-object v8, v4, Lcom/ironsource/adqualitysdk/sdk/i/ii$c;->ｋ:Landroid/content/Intent;

    invoke-virtual {v6, v7, v8}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 322
    monitor-exit v0

    throw v1
.end method

.method private static ﾒ(IIC)Ljava/lang/String;
    .locals 9

    .line 2099
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/b;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 2102
    :try_start_0
    new-array v1, p1, [C

    const/4 v2, 0x0

    .line 2105
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    :goto_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    if-ge v2, p1, :cond_0

    .line 2107
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    sget-object v3, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮉ:[C

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/2addr v4, p0

    aget-char v3, v3, v4

    int-to-long v3, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    int-to-long v5, v5

    sget-wide v7, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭴ:J

    mul-long/2addr v5, v7

    xor-long/2addr v3, v5

    int-to-long v5, p2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 2105
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/b;->ｋ:I

    goto :goto_0

    .line 2113
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2114
    monitor-exit v0

    throw p0
.end method

.method private static ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p3, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p3

    :cond_0
    check-cast p3, [B

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    :cond_1
    check-cast p2, [C

    .line 1163
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾒ:Ljava/lang/Object;

    monitor-enter v0

    .line 1165
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮐ:[C

    .line 1166
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﺙ:I

    .line 1168
    sget-boolean v3, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭖ:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 1171
    array-length p0, p3

    .line 1172
    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p0, p0, [C

    .line 1174
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_0
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p2, v3, :cond_2

    .line 1176
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget-byte v3, p3, v3

    add-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p2

    .line 1174
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p2, p2, 0x1

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_0

    .line 1179
    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0

    return-object p1

    .line 1182
    :cond_3
    sget-boolean p3, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﭸ:Z

    if-eqz p3, :cond_5

    .line 1185
    array-length p0, p2

    .line 1186
    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p0, p0, [C

    .line 1188
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_1
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p3, v3, :cond_4

    .line 1190
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget-char v3, p2, v3

    sub-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p3

    .line 1188
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p3, p3, 0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_1

    .line 1193
    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0

    return-object p1

    .line 1199
    :cond_5
    array-length p2, p0

    .line 1200
    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    new-array p2, p2, [C

    .line 1202
    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    :goto_2
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    if-ge p3, v3, :cond_6

    .line 1204
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ｋ:I

    add-int/lit8 v3, v3, -0x1

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    sub-int/2addr v3, v4

    aget v3, p0, v3

    sub-int/2addr v3, p1

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p2, p3

    .line 1202
    sget p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    add-int/lit8 p3, p3, 0x1

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/m;->ﾇ:I

    goto :goto_2

    .line 1207
    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1209
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized ﻛ()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 110
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ףּ:I

    add-int/lit8 v1, v1, 0x23

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮌ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ﾇ(Landroid/content/Intent;)Z
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    add-int/lit8 v2, v2, 0x7e

    const-string v4, "\u0087\u008e\u008d\u0084\u008c\u0084\u008b\u008a\u0089\u0084\u0083\u0088\u0084\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v5, 0x0

    invoke-static {v5, v2, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v12

    .line 217
    iget-boolean v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z

    const/4 v4, 0x0

    if-nez v2, :cond_0

    return v4

    .line 220
    :cond_0
    iget-object v2, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ｋ:Ljava/util/HashMap;

    monitor-enter v2

    .line 221
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    .line 222
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ:Landroid/content/Context;

    .line 223
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 222
    invoke-virtual {v0, v6}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v8

    .line 224
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v10

    .line 225
    invoke-virtual {v0}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v9

    .line 226
    invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v11

    .line 229
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v6

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_1

    const/4 v14, 0x1

    goto :goto_0

    :cond_1
    move v14, v4

    :goto_0
    if-eqz v14, :cond_2

    .line 230
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v16

    shr-int/lit8 v16, v16, 0x10

    const-wide/16 v17, 0x0

    add-int/lit8 v15, v16, 0x7f

    const-string v13, "\u0092\u008e\u0094\u0093\u008a\u0092\u008d\u008c\u0091\u0090\u0085\u0082\u0089\u008e\u008f"

    invoke-static {v5, v15, v5, v13}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static/range {v17 .. v18}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v13

    add-int/lit8 v13, v13, 0x7f

    const-string v15, "\u0092\u008e\u0096\u008e\u0095\u0083\u0089\u0092"

    invoke-static {v5, v13, v5, v15}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v4, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v13

    cmpl-float v13, v13, v3

    add-int/lit8 v13, v13, 0x7f

    const-string v15, "\u0092\u008a\u008c\u008e\u008a\u008c\u0091\u0092\u0097\u0082\u0092"

    invoke-static {v5, v13, v5, v15}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v12, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    const-wide/16 v17, 0x0

    .line 234
    :goto_1
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ:Ljava/util/HashMap;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/util/ArrayList;

    if-eqz v13, :cond_12

    if-eqz v14, :cond_3

    .line 236
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v3

    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    invoke-static/range {v17 .. v18}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v19

    const/16 v20, -0x1

    rsub-int/lit8 v15, v19, 0xc

    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v19

    rsub-int/lit8 v5, v19, -0x1

    int-to-char v5, v5

    invoke-static {v3, v15, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    move/from16 v16, v3

    const/16 v20, -0x1

    :goto_2
    move v3, v4

    const/4 v5, 0x0

    .line 239
    :goto_3
    invoke-virtual {v13}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    if-ge v3, v6, :cond_f

    .line 240
    invoke-virtual {v13, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;

    if-eqz v14, :cond_4

    .line 241
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v4}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v19

    add-int/lit8 v4, v19, 0x7f

    move/from16 v19, v3

    const-string v3, "\u0092\u0087\u008e\u008a\u0085\u0091\u0097\u0092\u008a\u0089\u008c\u0091\u0084\u008d\u0084\u0092\u008d\u008c\u0091\u0095\u0083\u008a\u0084\u008b"

    move-object/from16 v22, v7

    const/4 v7, 0x0

    invoke-static {v7, v4, v7, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v15, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﾇ:Landroid/content/IntentFilter;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    move/from16 v19, v3

    move-object/from16 v22, v7

    .line 243
    :goto_4
    iget-boolean v3, v15, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﻛ:Z

    const/16 v4, 0x30

    if-eqz v3, :cond_6

    if-eqz v14, :cond_5

    .line 245
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v3

    add-int/lit8 v3, v3, 0x4f

    const-string v4, "\u0088\u008e\u0088\u0088\u0084\u0092\u0093\u0088\u0084\u008e\u0087\u0085\u0084\u0092\u008a\u008e\u008d\u0087\u0084\u008a\u0092\u0089\u0099\u0087\u008e\u008a\u0085\u0091\u0098\u0092\u0092"

    const/4 v7, 0x0

    invoke-static {v7, v3, v7, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move/from16 v4, v20

    move-object/from16 v23, v22

    goto :goto_6

    .line 250
    :cond_6
    iget-object v6, v15, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﾇ:Landroid/content/IntentFilter;

    move-object/from16 v7, v22

    invoke-virtual/range {v6 .. v12}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_a

    if-eqz v14, :cond_7

    .line 253
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v22, v4

    const/4 v4, 0x0

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v21

    add-int/lit8 v4, v21, 0xd

    invoke-static/range {v22 .. v22}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v21

    move-object/from16 v23, v7

    add-int/lit8 v7, v21, -0x15

    move-object/from16 v24, v8

    const-string v8, ""

    move-object/from16 v25, v9

    const/4 v9, 0x0

    invoke-static {v8, v9}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v8

    int-to-char v8, v8

    invoke-static {v4, v7, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 254
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 253
    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_7
    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    :goto_5
    if-nez v5, :cond_8

    .line 256
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 258
    :cond_8
    invoke-virtual {v5, v15}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    .line 259
    iput-boolean v3, v15, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﻛ:Z

    :cond_9
    move/from16 v4, v20

    :goto_6
    const/4 v9, 0x0

    goto/16 :goto_8

    :cond_a
    move/from16 v22, v4

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    if-eqz v14, :cond_9

    const/4 v4, -0x4

    if-eq v3, v4, :cond_e

    const/4 v4, -0x3

    if-eq v3, v4, :cond_d

    const/4 v4, -0x2

    if-eq v3, v4, :cond_c

    move/from16 v4, v20

    if-eq v3, v4, :cond_b

    .line 277
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x32

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v6

    cmpl-float v6, v6, v16

    rsub-int/lit8 v6, v6, 0xf

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v7

    cmpl-float v7, v7, v16

    const v8, 0xe98f

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {v3, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_7

    :cond_b
    const/16 v21, 0x0

    .line 274
    invoke-static/range {v21 .. v21}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x7f

    const-string v6, "\u008e\u0094\u0093\u008a"

    const/4 v7, 0x0

    invoke-static {v7, v3, v7, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_c
    move/from16 v4, v20

    .line 271
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    cmp-long v3, v6, v17

    rsub-int/lit8 v3, v3, 0x2f

    const-string v6, ""

    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x4

    const/16 v21, 0x0

    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->green(I)I

    move-result v7

    const v8, 0xbc31

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {v3, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_d
    move/from16 v4, v20

    .line 265
    const-string v3, ""

    const/4 v9, 0x0

    invoke-static {v3, v9}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    add-int/lit8 v3, v3, 0x28

    invoke-static/range {v22 .. v22}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v6

    rsub-int/lit8 v6, v6, 0x36

    invoke-static {v9}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x14

    shr-int/lit8 v7, v7, 0x6

    rsub-int v7, v7, 0x4a83

    int-to-char v7, v7

    invoke-static {v3, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_e
    move/from16 v4, v20

    .line 268
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v6

    cmp-long v3, v6, v17

    rsub-int v3, v3, 0x80

    const-string v6, "\u0093\u0087\u0082\u008d\u008e\u008a\u0084\u0083"

    const/4 v7, 0x0

    invoke-static {v7, v3, v7, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    .line 280
    :goto_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v17 .. v18}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x7f

    const-string v8, "\u0092\u009a\u0095\u0083\u008a\u0084\u0096\u0092\u008a\u0082\u008c\u0092\u0088\u0091\u0088\u0092\u0087\u008e\u008a\u0085\u0091\u0098\u0092\u0092"

    const/4 v9, 0x0

    invoke-static {v9, v7, v9, v8}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾒ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_8
    add-int/lit8 v3, v19, 0x1

    move/from16 v20, v4

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    const/4 v4, 0x0

    goto/16 :goto_3

    :cond_f
    if-eqz v5, :cond_12

    const/4 v4, 0x0

    .line 286
    :goto_9
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v4, v3, :cond_10

    .line 287
    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;

    const/4 v9, 0x0

    iput-boolean v9, v3, Lcom/ironsource/adqualitysdk/sdk/i/ii$d;->ﻛ:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 289
    :cond_10
    iget-object v3, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﾇ:Ljava/util/ArrayList;

    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/ii$c;

    invoke-direct {v4, v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ii$c;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 290
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻏ:Landroid/os/Handler;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_11

    .line 291
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻏ:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 293
    :cond_11
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v3

    .line 296
    :cond_12
    monitor-exit v2

    const/16 v21, 0x0

    return v21

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public final declared-synchronized ﾒ()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 115
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﮌ:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ףּ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 114
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z

    .line 115
    :goto_0
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻐ()V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 114
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ii;->ﻛ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 115
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
