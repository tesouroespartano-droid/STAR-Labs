.class Lcom/ironsource/adqualitysdk/sdk/i/bc$b;
.super Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/hg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;",
        "Lcom/ironsource/adqualitysdk/sdk/i/hg<",
        "Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;",
        ">;"
    }
.end annotation


# static fields
.field private static ﺙ:I = 0x1

.field private static ﾇ:I = 0x24

.field private static ﾒ:I


# instance fields
.field private ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bc;Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;Lcom/ironsource/adqualitysdk/sdk/i/cl;)V
    .locals 0

    .line 807
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    invoke-direct {p0}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;-><init>()V

    .line 808
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    .line 809
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    return-void
.end method

.method private ﻐ(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V
    .locals 8

    const/4 v0, 0x2

    .line 845
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v1, v0

    .line 842
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    rsub-int/lit8 v3, v3, 0x9

    const-string v4, ""

    const/4 v5, 0x0

    invoke-static {v4, v4, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v4

    add-int/lit16 v4, v4, 0x82

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    rsub-int/lit8 v6, v6, 0x20

    const-string v7, "\u0010\uffe3\u0006\uffee\u0011\u0003\u0006\u0007\u0006\uffe3\u0012\u0012\ufff1\u0012\u0007\u0010\uffe3\u0006\uffee\u0011\u0003\u0006\uffe5\u0003\u000e\u000e\u0004\u0003\u0005\r\uffd0\u0011"

    invoke-static {v7, v3, v4, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    if-eqz v1, :cond_0

    .line 845
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;->onAdLoaded(Ljava/lang/Object;)V

    if-eqz v2, :cond_0

    const/16 p1, 0x32

    div-int/2addr p1, v5

    :cond_0
    return-void
.end method

.method private ﻛ()Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;
    .locals 4

    const/4 v0, 0x2

    .line 814
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    add-int/lit8 v2, v2, 0x75

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v2, v0

    return-object v1
.end method

.method private static ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1120
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    .line 1123
    :try_start_0
    new-array v1, p4, [C

    const/4 v2, 0x0

    .line 1127
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_0
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge v3, p4, :cond_1

    .line 1129
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v3, p0, v3

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    .line 1131
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/e;->ｋ:I

    add-int/2addr v4, p2

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 1132
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    aget-char v4, v1, v3

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾇ:I

    sub-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v1, v3

    .line 1127
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_0

    :cond_1
    if-lez p1, :cond_2

    .line 1138
    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    .line 1140
    new-array p0, p4, [C

    .line 1142
    invoke-static {v1, v2, p0, v2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1143
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p1, p4, p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    invoke-static {p0, v2, v1, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1144
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﻐ:I

    sub-int p2, p4, p2

    invoke-static {p0, p1, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    if-eqz p3, :cond_4

    .line 1150
    new-array p0, p4, [C

    .line 1152
    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    if-ge p1, p4, :cond_3

    .line 1154
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    sub-int p2, p4, p2

    add-int/lit8 p2, p2, -0x1

    aget-char p2, v1, p2

    aput-char p2, p0, p1

    .line 1152
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/e;->ﾇ:I

    goto :goto_1

    :cond_3
    move-object v1, p0

    .line 1160
    :cond_4
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1161
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 8

    const/4 v0, 0x2

    .line 853
    rem-int v1, v0, v0

    .line 850
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    add-int/lit8 v3, v3, 0x6

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit16 v4, v4, 0x83

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x26

    const-string v6, "\u0006\u0011\ufff0\u0011\u0011\uffe2\u0005\u0002\u0010\uffed\u0010\ufff5\u0005\u0006\r\n\u0002\uffe7\u0005\uffe2\u000f\u0010\uffcf\u000c\u0004\u0002\u0003\r\r\u0002\uffe4\u0005\u0002\u0010\uffed\u0005\uffe2\u000f"

    const/4 v7, 0x1

    invoke-static {v6, v3, v4, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 852
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    if-eqz v1, :cond_0

    .line 853
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 p1, p1, 0x71

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr p1, v0

    :cond_0
    return-void
.end method

.method public synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x2

    .line 802
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v1, v0

    check-cast p1, Lcom/google/android/gms/ads/appopen/AppOpenAd;

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public onAppOpenAdFailedToLoad(I)V
    .locals 10

    const/4 v0, 0x2

    .line 829
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    const/16 v2, 0x43

    add-int/2addr v1, v2

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v1, v0

    .line 826
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v4, 0x0

    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    add-int/lit8 v5, v5, 0xa

    const/16 v6, 0x30

    const-string v7, ""

    invoke-static {v7, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v6

    rsub-int v6, v6, 0x82

    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v7

    rsub-int/lit8 v7, v7, 0x2d

    const-string v8, "\uffed\u0005\uffe2\u000f\u0006\u0011\ufff0\u0011\u0011\uffe2\u0005\u0002\u0010\uffed\u0010\ufff5\u0005\u0006\r\n\u0002\uffe7\u0005\uffe2\u000f\u0006\u0011\ufff0\u0011\u0011\uffe2\u000f\u0010\uffcf\u000c\u0004\u0002\u0003\r\r\u0002\uffe4\u0005\u0002\u0010"

    const/4 v9, 0x1

    invoke-static {v8, v5, v6, v9, v7}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, p0, v3, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    if-eqz v1, :cond_0

    .line 829
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    add-int/lit8 v3, v3, 0x3d

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    rem-int/2addr v3, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;->onAppOpenAdFailedToLoad(I)V

    if-eqz v3, :cond_0

    div-int/2addr v2, v4

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public onAppOpenAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 8

    const/4 v0, 0x2

    .line 837
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v1, v0

    .line 834
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    rsub-int/lit8 v3, v3, 0x1e

    const-string v4, ""

    const/16 v5, 0x30

    invoke-static {v4, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    rsub-int v4, v4, 0x84

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x36

    const-string v6, "\u000f\u000f\uffee\u000f\u0004\r\uffe0\u0003\uffe5\u0000\u0008\u000b\u0004\u0003\ufff3\u000e\uffeb\u000e\u0000\u0003\ufff6\u0008\u0013\u0007\uffe4\u0011\u0011\u000e\u0011\uffe0\u000f\u000f\uffee\u000f\u0004\r\uffe0\u0003\uffeb\u000e\u0000\u0003\uffe2\u0000\u000b\u000b\u0001\u0000\u0002\n\uffcd\u000e\r\uffe0"

    const/4 v7, 0x0

    invoke-static {v6, v3, v4, v7, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    if-eqz v1, :cond_0

    .line 837
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v2, v2, 0x71

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;->onAppOpenAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    :cond_0
    return-void
.end method

.method public onAppOpenAdLoaded(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V
    .locals 8

    const/4 v0, 0x2

    .line 821
    rem-int v1, v0, v0

    .line 818
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x3

    const-string v5, ""

    const/16 v6, 0x30

    invoke-static {v5, v6, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    add-int/lit16 v5, v5, 0x84

    const-wide/16 v6, 0x0

    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x26

    const-string v7, "\u0005\u0006\u0005\uffe2\u0011\u0011\ufff0\u0011\u0006\u000f\uffe2\u0005\uffed\u0010\u0002\u0005\uffe4\u0002\r\r\u0003\u0002\u0004\u000c\uffcf\u0010\u000f\uffe2\u0011\u0011\ufff0\u0011\u0006\u000f\uffe2\u0005\uffed\u0010\u0002"

    invoke-static {v7, v4, v5, v3, v6}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻐ:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    if-eqz v1, :cond_0

    .line 821
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v2, v2, 0x55

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;->onAppOpenAdLoaded(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 p1, p1, 0x27

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final synthetic ﻐ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x2

    .line 802
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v1, v1, 0x61

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﻛ()Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﾒ:I

    add-int/lit8 v2, v2, 0x69

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$b;->ﺙ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0x1e

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object v1
.end method
