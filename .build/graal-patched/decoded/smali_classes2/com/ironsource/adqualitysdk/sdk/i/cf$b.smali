.class public final Lcom/ironsource/adqualitysdk/sdk/i/cf$b;
.super Lcom/ironsource/adqualitysdk/sdk/i/bg;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static ﻐ:J = 0x90d2ed8ff7e63bdL

.field private static ｋ:I = 0x0

.field private static ﾇ:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 644
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/bg;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static ﾒ(Ljava/lang/String;I)Ljava/lang/String;
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

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﻐ:J

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
.method public final ﻛ(Ljava/lang/String;)Ljava/lang/Class;
    .locals 6

    const/4 v0, 0x2

    .line 666
    rem-int v1, v0, v0

    .line 658
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    const-string v2, ""

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x8

    add-int/lit16 v1, v1, 0x77f3

    const-string v2, "\u63de\u1421\u8c36\u044a\ubc04\u346c\uac66\u246c\udc5c\u5405\ucca7\u44e2\ufcaa\u748f\uec85\u64f6\u1ce4\u94fd\u0cce\u84c7\u3d6f\ub533\u2d3b\ua51b\u5d5b\ud567\u4d77\uc569\u7d47\uf553\u6db3\ue5fe\u9d9c\u158a\u8dae\u05ea\ubdf8\u35d6\uadee\u25db\ude31\u563f\uce15\u4605\ufe0d\u7673"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 666
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾇ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    move v5, v4

    goto :goto_1

    :sswitch_1
    const/16 v1, 0x30

    .line 658
    invoke-static {v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    add-int/lit16 v1, v1, 0x67be

    const-string v2, "\u63de\u046f\uacaa\u54a4\ufd3c\u6562\u0dba\ub5e2\u5e2c\uc62b\u6ebb\u168c\ubf12\u2741\ucf99\u77d8\u1804\u8053\u2892\ud0c9\u7957\ue15e\u89e2\u3228\uda6b\u42ad\ueafd\u9321\u3b3f\ua396\u4bfa\uec30\u9473\u3c85\ua4d5\u4d3c\uf540\u9d89\u05c4"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v5, v3

    goto :goto_1

    :sswitch_2
    invoke-static {v5}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    rsub-int v1, v1, 0x1693

    const-string v2, "\u63ff\u754f\u4ef5\u206a\u3994\u1310\ue499\ufdd1\ud740\ua8e1"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 666
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾇ:I

    rem-int/2addr p1, v0

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 p1, v1, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    rem-int/2addr v1, v0

    move v5, v0

    goto :goto_1

    :sswitch_3
    const v1, 0xbfb8

    .line 658
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v1, v2

    const-string v2, "\u63fc\udc60\u1c9a\u5cf8\u9d30\udd54\u1daa\u5dd1\u9e01\ude55\u1ef1\u5f27\u9f65\udfa1"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    :goto_0
    const/4 v5, -0x1

    :cond_2
    :goto_1
    if-eqz v5, :cond_4

    if-eq v5, v4, :cond_4

    if-eq v5, v0, :cond_3

    if-eq v5, v3, :cond_3

    const/4 p1, 0x0

    return-object p1

    .line 664
    :cond_3
    const-class p1, Lcom/unity3d/services/banners/BannerView;

    return-object p1

    .line 661
    :cond_4
    const-class p1, Lcom/unity3d/services/ads/adunit/AdUnitActivity;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xf077c96 -> :sswitch_3
        0x39549411 -> :sswitch_2
        0x3f9c6a13 -> :sswitch_1
        0x5b4461a4 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ｋ()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x2

    .line 653
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾇ:I

    rem-int/2addr v1, v0

    .line 649
    invoke-static {}, Lcom/unity3d/ads/UnityAds;->getVersion()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 651
    const-string v3, ""

    invoke-static {v3}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v3

    const v4, 0xf743

    add-int/2addr v3, v4

    const-string v4, "\u6390"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾒ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    aget-object v1, v1, v3

    .line 653
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾇ:I

    add-int/lit8 v3, v3, 0x5f

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_0

    return-object v1

    :cond_0
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :cond_1
    return-object v2
.end method

.method final ﾇ()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/bg$c;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 671
    rem-int v1, v0, v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ﾇ:I

    add-int/lit8 v2, v2, 0x61

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/cf$b;->ｋ:I

    rem-int/2addr v2, v0

    return-object v1
.end method
