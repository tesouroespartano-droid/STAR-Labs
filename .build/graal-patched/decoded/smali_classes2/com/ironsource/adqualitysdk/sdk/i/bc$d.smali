.class Lcom/ironsource/adqualitysdk/sdk/i/bc$d;
.super Lcom/google/android/gms/ads/FullScreenContentCallback;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/hg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/FullScreenContentCallback;",
        "Lcom/ironsource/adqualitysdk/sdk/i/hg<",
        "Lcom/google/android/gms/ads/FullScreenContentCallback;",
        ">;"
    }
.end annotation


# static fields
.field private static ﱟ:I = 0x1

.field private static ﻛ:J = 0x4ad54b57828843cdL

.field private static ﾇ:I


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

.field private ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

.field private ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bc;Lcom/google/android/gms/ads/FullScreenContentCallback;Lcom/ironsource/adqualitysdk/sdk/i/cl;)V
    .locals 0

    .line 863
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    invoke-direct {p0}, Lcom/google/android/gms/ads/FullScreenContentCallback;-><init>()V

    .line 864
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    .line 865
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

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

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻛ:J

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

.method private ﾒ()Lcom/google/android/gms/ads/FullScreenContentCallback;
    .locals 4

    const/4 v0, 0x2

    .line 870
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v2, v1, 0x4f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v2, v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v1, v0

    return-object v2
.end method


# virtual methods
.method public onAdClicked()V
    .locals 7

    const/4 v0, 0x2

    .line 915
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr v1, v0

    .line 912
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    rsub-int v3, v3, 0x79b2

    const-string v4, "\u438b\u3a09\ub0c3\u2eb2\ua55a\u23db\u9999\u107f\u8e20\u049a\u8364\u7939\uf7ef\u6e44\ue406\u62fc\ud8a9\u574f\ucdde\u4b82\uc275\ub82a\u369a\uad49\u2b3e\ua1aa\u1858\u9608\u0cd0\u8aa4\u0130\uffce\u7584\uec7f\u6a24\ue09b\u5f4d"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_0

    .line 915
    invoke-virtual {v1}, Lcom/google/android/gms/ads/FullScreenContentCallback;->onAdClicked()V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr v1, v0

    :cond_0
    return-void
.end method

.method public onAdDismissedFullScreenContent()V
    .locals 5

    const/4 v0, 0x2

    .line 893
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x59

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr v1, v0

    .line 890
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v3

    const v4, 0xfed6

    sub-int/2addr v4, v3

    const-string v3, "\u438b\ubd6f\ube0f\ubf24\ub8c2\ub99d\ubab5\ub449\ub510\ub62c\ub7e8\ub09f\ub1b7\ub352\uac6a\uad3a\uaec9\uafc9\ua8b2\uaa54\uab6d\ua40c\ua5d6\ua6ff\ua78e\ua11c\ua274\ua30e\u9c08\u9df2\u9ebb\u9fad\u995e\u9a17\u9b2a\u94db\u9582\u96bb\u9043\u914a\u9220\u93ce\u8ce7\u8d83\u8f5a\u8874\u890a\u8ad1\u8bf3\u84a9\u865c\u8776\u8015\u812b\u82f9\u8388"

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 892
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_0

    .line 893
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 v2, v2, 0x35

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/FullScreenContentCallback;->onAdDismissedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .locals 7

    const/4 v0, 0x2

    .line 877
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v1, v0

    const v3, 0xd565

    const-string v4, "\u438b\u96dd\ue96b\uc38e\u160a\u6957\u43e1\u966b\ue880\uc32e\u167c\u68f5\u431f\u9598\ue82e\uc348\u15e9\u683b\u42b6\u95de\ue845\uc2e6\u1502\u6fbd\u42de\u953e\uefe0\uc204\u1480\u6fd8\u425d\u9497\uef04\uc1a4\u14c2\u6f66\u41ad\u943b\uef60\uc1c6\u146a\u6e97\u4119\u944f\ueefd\uc160\u1bb8\u6e25\u414f\u9bfd\uee12\uc0bc\u1b0a\u6e4b\u40ed\u9b0a\uedb0\uc0de\u1b5b"

    if-nez v1, :cond_0

    .line 874
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v5, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v6

    div-int/lit8 v6, v6, 0xd

    div-int/2addr v3, v6

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-virtual {v1, p0, v5, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 874
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/2addr v5, v3

    invoke-static {v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_1

    .line 877
    :goto_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/FullScreenContentCallback;->onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V

    .line 876
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 p1, p1, 0x31

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public onAdImpression()V
    .locals 6

    const/4 v0, 0x2

    .line 904
    rem-int v1, v0, v0

    .line 901
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    const v5, 0xd60f

    sub-int/2addr v5, v4

    const-string v4, "\u438b\u95b7\uefbf\uc18c\u1ba2\u6de5\u47e5\u99c1\uf3d0\uc524\u1f18\u7107\u4b17\u9d7a\uf77a\uc942\u2349\u7571\u4ea2\ua0bc\ufa8d\ucc94\u26e6\u78f7\u52ce\ua494\ufe24\ud036\u2a28\u7c1a\u5646\ua871\u825d\ud450\u2e56\u07b3\u59a2\ub38f\u8598\udfea"

    invoke-static {v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v4, v5}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_1

    .line 904
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v2, v2, 0x49

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v2, v0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/FullScreenContentCallback;->onAdImpression()V

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0

    :cond_1
    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_2

    const/16 v0, 0x3f

    div-int/2addr v0, v3

    :cond_2
    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 5

    const/4 v0, 0x2

    .line 885
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    rem-int/2addr v1, v0

    .line 882
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cl;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    const v4, 0xeb3f

    sub-int/2addr v4, v3

    const-string v3, "\u438b\ua887\u95df\u821c\uef62\udb95\uc0c5\u2d11\u1a50\u0694\u73f8\u5817\u4557\ub18a\u9eda\u8b12\uf049\udca1\uc9c2\u360c\u234d\u0f84\u74c6\u6107\u4e4e\ubac4\ua7c4\u8c06\uf968\ue58a\ud2fc\u3f04\u2442\u10a5\u7df6\u6a34\u5757\u43a3\ua8fb\u9538\u8246\ueeb9\udbe9\uc03d\u2d7c\u19b0\u06dc\u7333\u5873\u44b6\ub1e6\u9e2e\u8b75"

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/bc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hg;Lcom/ironsource/adqualitysdk/sdk/i/cl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 884
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ｋ:Lcom/google/android/gms/ads/FullScreenContentCallback;

    if-eqz v1, :cond_0

    .line 885
    invoke-virtual {v1}, Lcom/google/android/gms/ads/FullScreenContentCallback;->onAdShowedFullScreenContent()V

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v1, v0

    return-void
.end method

.method public final synthetic ﻐ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x2

    .line 858
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ()Lcom/google/android/gms/ads/FullScreenContentCallback;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾇ:I

    add-int/lit8 v2, v2, 0xb

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﱟ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0x9

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object v1

    :cond_1
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/bc$d;->ﾒ()Lcom/google/android/gms/ads/FullScreenContentCallback;

    const/4 v0, 0x0

    throw v0
.end method
