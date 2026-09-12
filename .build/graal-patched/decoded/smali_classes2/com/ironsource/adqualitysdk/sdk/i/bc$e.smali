.class Lcom/ironsource/adqualitysdk/sdk/i/bc$e;
.super Lcom/google/android/gms/ads/AdListener;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/hg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/AdListener;",
        "Lcom/ironsource/adqualitysdk/sdk/i/hg<",
        "Lcom/google/android/gms/ads/AdListener;",
        ">;"
    }
.end annotation


# static fields
.field private static ﮐ:Z = true

.field private static ﱡ:I = 0x0

.field private static ﺙ:I = 0x1

.field private static ﻏ:Z = true

.field private static ﻐ:I = 0xf0

.field private static ｋ:[C


# instance fields
.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

.field private ﾇ:Lcom/google/android/gms/ads/AdListener;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ｋ:[C

    return-void

    :array_0
    .array-data 2
        0x131s
        0x154s
        0x13cs
        0x159s
        0x163s
        0x164s
        0x155s
        0x15es
        0x162s
        0x11es
        0x15fs
        0x133s
        0x15cs
        0x136s
        0x151s
        0x144s
        0x147s
        0x158s
        0x135s
        0x156s
        0x160s
        0x153s
        0x13fs
        0x139s
        0x15ds
        0x143s
        0x167s
        0x137s
        0x165s
        0x15bs
    .end array-data
.end method

.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bc;Lcom/google/android/gms/ads/AdListener;Lcom/ironsource/adqualitysdk/sdk/i/cl;)V
    .locals 0

    .line 723
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    .line 724
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    .line 725
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    return-void
.end method

.method private ｋ()Lcom/google/android/gms/ads/AdListener;
    .locals 3

    const/4 v0, 0x2

    .line 730
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-nez v1, :cond_0

    const/4 v1, 0x5

    div-int/lit8 v1, v1, 0x0

    :cond_0
    return-object v0
.end method

.method private static ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
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
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ｋ:[C

    .line 1166
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻐ:I

    .line 1168
    sget-boolean v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻏ:Z

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
    sget-boolean p3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﮐ:Z

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
.method public onAdClosed()V
    .locals 7

    const/4 v0, 0x2

    .line 738
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    .line 735
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static {v3, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x7f

    const-string v5, "\u0082\u0087\u0085\u008b\u008d\u008c\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v6, 0x0

    invoke-static {v6, v3, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_1

    .line 738
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v2, v2, 0x6b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {v6}, Ljava/lang/Object;->hashCode()I

    throw v6

    :cond_1
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 6

    const/4 v0, 0x2

    .line 746
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    .line 743
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x7e

    const-string v4, "\u0082\u008f\u008b\u0083\u008b\u0090\u0082\u0087\u008d\u0084\u008f\u008e\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v5, 0x0

    invoke-static {v5, v3, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    .line 746
    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(I)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 p1, p1, 0x9

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-super {v5}, Ljava/lang/Object;->hashCode()I

    throw v5
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 7

    const/4 v0, 0x2

    .line 754
    rem-int v1, v0, v0

    .line 751
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x7f

    const-string v5, "\u0089\u008b\u0089\u0089\u0093\u0082\u0081\u0092\u0086\u0084\u0091\u0082\u008f\u008b\u0083\u008b\u0090\u0082\u0087\u008d\u0084\u008f\u008e\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v6, 0x0

    invoke-static {v6, v4, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, p0, v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    .line 754
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v2, v2, 0x3b

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 p1, p1, 0x2b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    const/16 p1, 0x29

    div-int/2addr p1, v3

    :cond_1
    return-void
.end method

.method public onAdImpression()V
    .locals 6

    const/4 v0, 0x2

    .line 788
    rem-int v1, v0, v0

    .line 785
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-string v3, ""

    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x7f

    const-string v4, "\u0088\u008b\u0084\u0085\u0085\u0087\u0089\u0095\u0099\u0098\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v5, 0x0

    invoke-static {v5, v3, v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    .line 788
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v2, v2, 0x4f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdImpression()V

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    const/16 v0, 0x60

    div-int/2addr v0, v4

    :cond_1
    return-void
.end method

.method public onAdLeftApplication()V
    .locals 7

    const/4 v0, 0x2

    .line 762
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    const-string v2, "\u0088\u008b\u0084\u0086\u008f\u0096\u0084\u008d\u0095\u0095\u0081\u0086\u0094\u0087\u0083\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 759
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v5

    rem-int/lit8 v5, v5, 0x34

    const/16 v6, 0x3a

    div-int/2addr v6, v5

    invoke-static {v3, v6, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 761
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 759
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x7f

    invoke-static {v3, v5, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 761
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_2

    .line 762
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdLeftApplication()V

    .line 761
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    :cond_2
    return-void
.end method

.method public onAdLoaded()V
    .locals 7

    const/4 v0, 0x2

    .line 780
    rem-int v1, v0, v0

    .line 777
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x7f

    const-string v5, "\u0082\u0087\u0082\u008f\u008b\u0083\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v6, 0x0

    invoke-static {v6, v4, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 779
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    .line 780
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v2, v2, 0x71

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-super {v6}, Ljava/lang/Object;->hashCode()I

    throw v6
.end method

.method public onAdOpened()V
    .locals 8

    const/4 v0, 0x2

    .line 771
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    const-string v3, "\u0082\u0087\u0088\u0087\u0095\u0097\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const-string v4, ""

    const/4 v5, 0x0

    if-nez v1, :cond_1

    .line 768
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/16 v7, 0x8

    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v4

    div-int/2addr v7, v4

    invoke-static {v5, v7, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v6, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 768
    :cond_1
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v6, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x7f

    invoke-static {v5, v4, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v6, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_2

    .line 771
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0xd

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    :cond_2
    return-void
.end method

.method public onAdSwipeGestureClicked()V
    .locals 7

    const/4 v0, 0x2

    .line 797
    rem-int v1, v0, v0

    .line 794
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x7f

    const-string v5, "\u0082\u0087\u009e\u0096\u0084\u008d\u008c\u0087\u0089\u009d\u0086\u0085\u0087\u009c\u0087\u0095\u0084\u009b\u009a\u0082\u0081\u0088\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    const/4 v6, 0x0

    invoke-static {v6, v4, v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ([IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 796
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﾇ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_0

    .line 797
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v2, v2, 0x7d

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdListener;->onAdSwipeGestureClicked()V

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    const/4 v0, 0x3

    div-int/2addr v0, v3

    :cond_1
    return-void
.end method

.method public final synthetic ﻐ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x2

    .line 718
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v1, v1, 0xd

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ｋ()Lcom/google/android/gms/ads/AdListener;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﺙ:I

    add-int/lit8 v2, v2, 0x2d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$e;->ﱡ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method
