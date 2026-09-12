.class public final Lcom/ironsource/adqualitysdk/sdk/i/ch;
.super Lcom/ironsource/adqualitysdk/sdk/i/bg;
.source ""


# static fields
.field private static ﻏ:I = 0x1

.field private static ﻐ:I = 0x0

.field private static ﻛ:I = 0x0

.field private static ｋ:C = '\u2cab'

.field private static ﾇ:J

.field private static ﾒ:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ:[I

    return-void

    :array_0
    .array-data 4
        0x2a81306f
        -0x1f2c1319
        -0x6db94af6
        -0x18fb404f
        0x35b13db8
        -0x2f8b8d42
        -0x720632e9
        -0x472c6a48
        0x4ceba35f    # 1.23542264E8f
        -0x61df0950
        -0x767f72f
        -0x50aea720
        0x1793a06
        0x5b794bc0
        0x7c54ef3f
        -0x48589896
        0x45e3151f
        0x78138d4e
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/bg;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static ﻐ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;
    .locals 3

    const/4 v0, 0x2

    .line 225
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/AdPayload$AdUnit;->getTemplateSettings()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0x52

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method

.method static synthetic ﻐ(Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ(Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;)Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﻐ(Lcom/vungle/ads/internal/model/AppNode;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0xb

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ｋ(Lcom/vungle/ads/internal/model/AppNode;)Ljava/lang/String;

    move-result-object p0

    if-nez v1, :cond_0

    const/16 v1, 0x3f

    div-int/lit8 v1, v1, 0x0

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method static synthetic ﻐ(Lcom/vungle/ads/internal/model/Placement;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ(Lcom/vungle/ads/internal/model/Placement;)Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method private static ﻐ([II)Ljava/lang/String;
    .locals 12

    .line 2126
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﻛ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x4

    .line 2128
    :try_start_0
    new-array v1, v1, [C

    .line 2129
    array-length v2, p0

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    new-array v2, v2, [C

    .line 2130
    sget-object v4, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ:[I

    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    const/4 v5, 0x0

    .line 2132
    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    :goto_0
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    array-length v7, p0

    if-ge v6, v7, :cond_1

    .line 2134
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    aget v6, p0, v6

    const/16 v7, 0x10

    shr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v5

    .line 2135
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    aget v6, p0, v6

    int-to-char v6, v6

    aput-char v6, v1, v3

    .line 2136
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v3

    aget v6, p0, v6

    shr-int/2addr v6, v7

    int-to-char v6, v6

    const/4 v8, 0x2

    aput-char v6, v1, v8

    .line 2137
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v3

    aget v6, p0, v6

    int-to-char v6, v6

    const/4 v9, 0x3

    aput-char v6, v1, v9

    .line 2141
    aget-char v6, v1, v5

    shl-int/2addr v6, v7

    aget-char v10, v1, v3

    add-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2142
    aget-char v6, v1, v8

    shl-int/2addr v6, v7

    aget-char v10, v1, v9

    add-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 2145
    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ([I)V

    move v6, v5

    :goto_1
    if-ge v6, v7, :cond_0

    .line 2150
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    aget v11, v4, v6

    xor-int/2addr v10, v11

    .line 2151
    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    invoke-static {v10}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ(I)I

    move-result v10

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    xor-int/2addr v10, v11

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 2153
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2154
    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    sput v11, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2155
    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 2157
    :cond_0
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2158
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2161
    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    aget v10, v4, v7

    xor-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 2162
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    const/16 v10, 0x11

    aget v10, v4, v10

    xor-int/2addr v6, v10

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    .line 2165
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    .line 2167
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    ushr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v5

    .line 2168
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ:I

    int-to-char v6, v6

    aput-char v6, v1, v3

    .line 2169
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    ushr-int/2addr v6, v7

    int-to-char v6, v6

    aput-char v6, v1, v8

    .line 2170
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾒ:I

    int-to-char v6, v6

    aput-char v6, v1, v9

    .line 2173
    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/c;->ﾇ([I)V

    .line 2176
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    aget-char v7, v1, v5

    aput-char v7, v2, v6

    .line 2177
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v3

    aget-char v7, v1, v3

    aput-char v7, v2, v6

    .line 2178
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v8

    aget-char v7, v1, v8

    aput-char v7, v2, v6

    .line 2179
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    shl-int/2addr v6, v3

    add-int/2addr v6, v9

    aget-char v7, v1, v9

    aput-char v7, v2, v6

    .line 2132
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    add-int/2addr v6, v8

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/c;->ｋ:I

    goto/16 :goto_0

    .line 2181
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2, v5, p1}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 2182
    monitor-exit v0

    throw p0
.end method

.method static synthetic ﻛ(Lcom/vungle/ads/internal/model/Placement;)Z
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x45

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Lcom/vungle/ads/internal/model/Placement;)Z

    move-result p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    return p0
.end method

.method static synthetic ｋ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;

    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method private static ｋ(Lcom/vungle/ads/internal/model/AppNode;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 209
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x69

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/AppNode;->getAppId()Ljava/lang/String;

    move-result-object p0

    if-eqz v1, :cond_0

    const/16 v1, 0x52

    div-int/lit8 v1, v1, 0x0

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﾇ(Lcom/vungle/ads/internal/model/AdPayload;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ(Lcom/vungle/ads/internal/model/AdPayload;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method static synthetic ﾇ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 34
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-static {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾒ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Ljava/lang/String;

    move-result-object p0

    if-nez v1, :cond_0

    const/16 v0, 0x3d

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method

.method private static ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;
    .locals 7

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_0
    check-cast p3, [C

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    :cond_1
    check-cast p2, [C

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
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    .line 1126
    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p2, v1

    xor-int/2addr p4, v2

    int-to-char p4, p4

    aput-char p4, p2, v1

    const/4 p4, 0x2

    .line 1128
    aget-char v2, p3, p4

    int-to-char p1, p1

    add-int/2addr v2, p1

    int-to-char p1, v2

    aput-char p1, p3, p4

    .line 1130
    array-length p1, p0

    .line 1131
    new-array v2, p1, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p1, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p4

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p2, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p3, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 1141
    aget-char v4, p2, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p3, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p3, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p2, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p0, v4

    aget-char v3, p2, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ｋ:C

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

.method private static ﾇ(Lcom/vungle/ads/internal/model/Placement;)Z
    .locals 3

    const/4 v0, 0x2

    .line 229
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/Placement;->isRewardedVideo()Z

    move-result p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x27

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    const/16 v0, 0x50

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return p0
.end method

.method private static ﾒ(Lcom/vungle/ads/internal/model/AdPayload;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;
    .locals 3

    const/4 v0, 0x2

    .line 205
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/AdPayload;->adUnit()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method private static ﾒ(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 217
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/AdPayload$AdUnit;->getCampaign()Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x77

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method private static ﾒ(Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 213
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;->getUrl()Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static ﾒ(Lcom/vungle/ads/internal/model/Placement;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 221
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/Placement;->getReferenceId()Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0x3c

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method


# virtual methods
.method final ﻛ(Ljava/lang/String;)Ljava/lang/Class;
    .locals 18

    move-object/from16 v0, p1

    const/4 v1, 0x2

    .line 153
    rem-int v2, v1, v1

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    const/16 v3, 0x14

    const/4 v5, -0x1

    const/16 v6, 0x30

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xa

    const-wide/16 v10, 0x0

    const/16 v12, 0x8

    const/16 v13, 0x10

    const/4 v14, 0x6

    const-string v15, "\u0000\u0000\u0000\u0000"

    move/from16 v16, v1

    const-string v1, ""

    const/16 v17, 0x16

    const/4 v4, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const v1, -0x69fa07cc

    const v2, 0x46b7e5dc

    const v3, 0x21c248f2

    const v4, 0x3bfefe5f

    filled-new-array {v3, v4, v1, v2}, [I

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    shr-int/2addr v2, v13

    add-int/2addr v2, v14

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0xb

    goto/16 :goto_3

    :sswitch_1
    new-array v1, v12, [I

    fill-array-data v1, :array_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    shr-int/lit8 v2, v2, 0x16

    rsub-int/lit8 v2, v2, 0xf

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0x1a

    goto/16 :goto_3

    :sswitch_2
    new-array v2, v12, [I

    fill-array-data v2, :array_1

    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x11

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0xd

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v1

    shr-int/2addr v1, v13

    const v2, 0x4ac3d23

    sub-int/2addr v2, v1

    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    int-to-char v1, v1

    const-string v3, "\uc552\ub88a\u48ad\u0876\uf2db\u213d\u0361\uefe4\u72b2"

    const-string v4, "\u234d\uac3d\u1304\uc4b0"

    invoke-static {v3, v2, v4, v15, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v3, 0x4

    goto/16 :goto_3

    .line 98
    :sswitch_4
    new-array v1, v12, [I

    fill-array-data v1, :array_2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    shr-int/lit8 v2, v2, 0x16

    sub-int/2addr v13, v2

    invoke-static {v1, v13}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v3, 0x7

    goto/16 :goto_3

    :sswitch_5
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v2

    invoke-static {v1, v6, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/2addr v1, v8

    int-to-char v1, v1

    const-string v3, "\ue98c\u57d1\uf430\ub113\uc0a3\uc255\u940a\u1e95\u878f\u15e5\u1694\u93dc\u218e\u2ad5\u86eb\u29bc\u9d3e\ub171\u54aa\uc034"

    const-string v4, "\u0e1d\u90b0\u701f\ueac2"

    invoke-static {v3, v2, v4, v15, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v3, v13

    goto/16 :goto_3

    :sswitch_6
    new-array v1, v12, [I

    fill-array-data v1, :array_3

    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v2

    cmp-long v2, v2, v10

    rsub-int/lit8 v2, v2, 0xf

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0x1b

    goto/16 :goto_3

    :sswitch_7
    new-array v1, v12, [I

    fill-array-data v1, :array_4

    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    move-result v2

    add-int/lit8 v2, v2, 0xe

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0x17

    goto/16 :goto_3

    :sswitch_8
    new-array v2, v3, [I

    fill-array-data v2, :array_5

    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x25

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v0, v0, 0x75

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/lit8 v0, v0, 0x2

    move v3, v8

    goto/16 :goto_3

    .line 98
    :sswitch_9
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v2

    cmp-long v2, v2, v10

    rsub-int/lit8 v2, v2, -0x1

    invoke-static {v1, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    add-int/2addr v1, v8

    int-to-char v1, v1

    const-string v3, "\u8027\ua165\uccc2\uce10\u00fd\ua866\uc69d\u4f31\u6af9\ue88f"

    const-string v4, "\u6bb3\u99d4\u2359\u98d2"

    invoke-static {v3, v2, v4, v15, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x43

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    const/16 v3, 0x9

    goto/16 :goto_3

    .line 98
    :sswitch_a
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v1

    cmpl-float v1, v1, v7

    const v2, 0x7e90d112

    add-int/2addr v1, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v10

    add-int/2addr v2, v5

    int-to-char v2, v2

    const-string v3, "\ua9e1\uf2cc\u5ab6\u2277\ubb59\uf08f\ub16c"

    const-string v4, "\u13a3\u90d1\u127e\ubd83"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x5

    goto/16 :goto_3

    :sswitch_b
    const v2, 0x480cbe98    # 144122.38f

    const v3, 0x742db404

    const v7, -0x1bb51555

    const v8, 0x76710f13

    .line 98
    filled-new-array {v7, v8, v2, v3}, [I

    move-result-object v2

    invoke-static {v1, v6, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    sub-int/2addr v14, v1

    invoke-static {v2, v14}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move/from16 v3, v16

    goto/16 :goto_3

    :sswitch_c
    new-array v2, v14, [I

    fill-array-data v2, :array_6

    invoke-static {v1, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v1

    sub-int/2addr v9, v1

    invoke-static {v2, v9}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    const/4 v3, 0x3

    goto/16 :goto_3

    :sswitch_d
    new-array v1, v12, [I

    fill-array-data v1, :array_7

    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    move-result v2

    cmpl-float v2, v2, v7

    rsub-int/lit8 v2, v2, 0xe

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0xc

    goto/16 :goto_3

    :sswitch_e
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v1

    cmp-long v1, v1, v10

    add-int/2addr v1, v8

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v2

    shr-int/2addr v2, v13

    const v3, 0xaaf4

    sub-int/2addr v3, v2

    int-to-char v2, v3

    const-string v3, "\u0d8e\u7c28\u763a\ubb9d\u788d\ud18e\u4963\uf3d0\u63e5\u52e9\u709e\ucdc4\ua51f\u61f1"

    const-string v4, "\ucb62\u1b83\uf4cd\u45aa"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0x11

    goto/16 :goto_3

    :sswitch_f
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v1

    shr-int/2addr v1, v13

    invoke-static {v4}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v2

    add-int/2addr v2, v3

    shr-int/2addr v2, v14

    int-to-char v2, v2

    const-string v3, "\u7e8c\uc569\ue622\udfcc\u4700\u4189\udadd\ua02d\u7ab0\u36c2\ud415\ue721"

    const-string v4, "\uf3fd\uc38d\u3214\u7348"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v3, v12

    goto/16 :goto_3

    :sswitch_10
    new-array v1, v9, [I

    fill-array-data v1, :array_8

    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    sub-int/2addr v3, v2

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0xe

    goto/16 :goto_3

    :sswitch_11
    new-array v2, v9, [I

    fill-array-data v2, :array_9

    invoke-static {v1, v6, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/lit8 v1, v1, 0x13

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x65

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    goto/16 :goto_1

    :cond_1
    move/from16 v3, v17

    goto/16 :goto_3

    .line 98
    :sswitch_12
    invoke-static {v1, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    cmp-long v2, v2, v10

    add-int/lit16 v2, v2, 0x5b73

    int-to-char v2, v2

    const-string v3, "\u332d\u3c84\u47ef\u93f9\ua500\uf2a9\ub884\u2552\u4eba\u380b\ubf97\u68d3\uac7e\u987c"

    const-string v4, "\u8053\uca12\u7469\u465b"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v3, 0x13

    goto/16 :goto_3

    :sswitch_13
    const v1, -0x33852579    # -6.5759772E7f

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v1

    int-to-char v1, v1

    const-string v4, "\u8519\u4518\u30e6\u48c9\u2b7d\uce8e\u7258\u3c37\u5c0a"

    const-string v6, "\u8772\u7ada\u00cc\u565c"

    invoke-static {v4, v2, v6, v15, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :sswitch_14
    const/16 v2, 0xc

    new-array v2, v2, [I

    fill-array-data v2, :array_a

    invoke-static {v1, v1, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    rsub-int/lit8 v4, v1, 0x16

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    const/16 v3, 0x50

    goto/16 :goto_3

    :cond_2
    const/16 v3, 0x12

    goto/16 :goto_3

    .line 98
    :sswitch_15
    new-array v1, v14, [I

    fill-array-data v1, :array_b

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    add-int/2addr v2, v9

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    const/16 v3, 0x15

    goto/16 :goto_3

    :sswitch_16
    new-array v1, v14, [I

    fill-array-data v1, :array_c

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v2

    shr-int/2addr v2, v12

    add-int/lit8 v2, v2, 0x9

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x41

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_3

    const/16 v3, 0x36

    goto/16 :goto_3

    :cond_3
    const/16 v3, 0x19

    goto/16 :goto_3

    .line 98
    :sswitch_17
    new-array v2, v14, [I

    fill-array-data v2, :array_d

    invoke-static {v1, v6, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    rsub-int/lit8 v1, v1, 0xb

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v0, v0, 0x2

    const/16 v3, 0xf

    goto/16 :goto_3

    .line 98
    :sswitch_18
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v1

    shr-int/2addr v1, v13

    const v2, -0x3e96cb9d

    add-int/2addr v1, v2

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    rsub-int v2, v2, 0x58b

    int-to-char v2, v2

    const-string v3, "\u498c\uce8d\u81fe\ub34e\u28a1\u98c6\u27dc\u54b3\u5038\u702b\ua1c6\u76e9\ue901\u410f\u6c0f\u2bc9\u431d\uc4db\u76fa\u5307\u0a54\uea7c\u9688\u1b7d\uffa0\ua014\ubc30\u5b00\uccaa\uc2bf\ube01\ucd63\u33ec\ua1a4\uf965\u68ee\u3134\u12b3\ubbc6\ub349\u2368"

    const-string v4, "\u63f9\u6934\u8bc1\u7405"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/lit8 v0, v0, 0x2

    const/16 v3, 0x18

    goto :goto_3

    .line 98
    :sswitch_19
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v1

    shr-int/2addr v1, v13

    const v2, -0x540f18c7

    sub-int/2addr v2, v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    cmp-long v1, v3, v10

    add-int/2addr v1, v5

    int-to-char v1, v1

    const-string v3, "\uf377\uc38b\ueaa3\u982e\u6d83\ubfd8\u2483\u939e\uc0ab\uabd9\u6663\u61db\uecb8\ud658\uf01d\u42d5\u9a42\u9442\u00a5\u0e7c\u2412\uea7a\u8a6c\uce2a\u02cd"

    const-string v4, "\u390a\uf0e7\u0eab\u0854"

    invoke-static {v3, v2, v4, v15, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v3, v9

    goto :goto_3

    :sswitch_1a
    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v2

    cmpl-float v2, v2, v7

    sub-int/2addr v8, v2

    int-to-char v2, v8

    const-string v3, "\u6c43\u6b2c\u72ff\uef8d\u0197\ucb27\u4db9\uc684"

    const-string v4, "\u8528\u889d\u28d0\u64e0"

    invoke-static {v3, v1, v4, v15, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v3, v14

    goto :goto_3

    :sswitch_1b
    new-array v2, v14, [I

    fill-array-data v2, :array_e

    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v9

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v5

    :goto_3
    packed-switch v3, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    .line 151
    :pswitch_0
    const-class v0, Lcom/vungle/ads/internal/ui/VungleWebClient;

    return-object v0

    .line 149
    :pswitch_1
    const-class v0, Lcom/vungle/ads/internal/network/VungleApiClient;

    return-object v0

    .line 147
    :pswitch_2
    const-class v0, Lcom/vungle/ads/VungleAds;

    return-object v0

    .line 145
    :pswitch_3
    const-class v0, Lcom/vungle/ads/internal/ui/VungleActivity;

    return-object v0

    .line 142
    :pswitch_4
    const-class v0, Lcom/vungle/ads/RewardedAdListener;

    return-object v0

    .line 140
    :pswitch_5
    const-class v0, Lcom/vungle/ads/RewardedAd;

    .line 153
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_5

    return-object v0

    :cond_5
    const/4 v0, 0x0

    throw v0

    .line 138
    :pswitch_6
    const-class v0, Lcom/vungle/ads/internal/model/Placement;

    return-object v0

    .line 136
    :pswitch_7
    const-class v0, Lcom/vungle/ads/internal/presenter/MRAIDPresenter;

    return-object v0

    .line 134
    :pswitch_8
    const-class v0, Lcom/vungle/ads/InterstitialAdListener;

    return-object v0

    .line 132
    :pswitch_9
    const-class v0, Lcom/vungle/ads/InterstitialAd;

    return-object v0

    .line 130
    :pswitch_a
    const-class v0, Lcom/vungle/ads/FullscreenAdListener;

    return-object v0

    .line 128
    :pswitch_b
    const-class v0, Lcom/vungle/ads/FullscreenAd;

    return-object v0

    .line 126
    :pswitch_c
    const-class v0, Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;

    return-object v0

    .line 124
    :pswitch_d
    const-class v0, Lcom/vungle/ads/BaseFullscreenAd;

    return-object v0

    .line 122
    :pswitch_e
    const-class v0, Lcom/vungle/ads/BaseAdListener;

    return-object v0

    .line 120
    :pswitch_f
    const-class v0, Lcom/vungle/ads/BaseAd;

    return-object v0

    .line 118
    :pswitch_10
    const-class v0, Lcom/vungle/ads/BannerView;

    return-object v0

    .line 115
    :pswitch_11
    const-class v0, Lcom/vungle/ads/BannerAdSize;

    return-object v0

    .line 113
    :pswitch_12
    const-class v0, Lcom/vungle/ads/BannerAdListener;

    return-object v0

    .line 111
    :pswitch_13
    const-class v0, Lcom/vungle/ads/BannerAd;

    return-object v0

    .line 109
    :pswitch_14
    const-class v0, Lcom/vungle/ads/internal/model/AppNode;

    return-object v0

    .line 107
    :pswitch_15
    const-class v0, Lcom/vungle/ads/internal/model/AdPayload;

    return-object v0

    .line 105
    :pswitch_16
    const-class v0, Lcom/vungle/ads/internal/AdInternal;

    return-object v0

    .line 103
    :pswitch_17
    const-class v0, Lcom/vungle/ads/internal/model/AdAsset;

    return-object v0

    .line 101
    :pswitch_18
    const-class v0, Lcom/vungle/ads/internal/ui/AdActivity;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d78938e -> :sswitch_1b
        -0x6ac32f71 -> :sswitch_1a
        -0x5d0a2941 -> :sswitch_19
        -0x5910ad29 -> :sswitch_18
        -0x55952aa2 -> :sswitch_17
        -0x4647c161 -> :sswitch_16
        -0x24589b0f -> :sswitch_15
        -0x1db9b59d -> :sswitch_14
        -0x1dafcd3b -> :sswitch_13
        -0x1cffe0ef -> :sswitch_12
        -0x1778f33b -> :sswitch_11
        -0x29c4b4a -> :sswitch_10
        0x125b4530 -> :sswitch_f
        0x1315208f -> :sswitch_e
        0x13537fc8 -> :sswitch_d
        0x173b4020 -> :sswitch_c
        0x1ce3a46d -> :sswitch_b
        0x33e33ba3 -> :sswitch_a
        0x39549411 -> :sswitch_9
        0x3afff849 -> :sswitch_8
        0x47de8a80 -> :sswitch_7
        0x480132ee -> :sswitch_6
        0x55fdc032 -> :sswitch_5
        0x59bdfa63 -> :sswitch_4
        0x6daa2fcb -> :sswitch_3
        0x6e7c6ecf -> :sswitch_2
        0x73183534 -> :sswitch_1
        0x762c8af4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        -0x7e2aa8f0
        0x4474f4ff
        -0xb4cac3f
        0x51e56edd
        -0xbb3ddca
        -0x33c48c0c    # -4.9139664E7f
        -0x5e83b6d0
        -0xcc27195
    .end array-data

    :array_1
    .array-data 4
        0x21c248f2
        0x3bfefe5f
        0xec5a699
        -0x134bc742
        0xfcf439a
        -0x4e5c31cf
        0x4b3e46f
        0x75e75296
    .end array-data

    :array_2
    .array-data 4
        0x303051b4
        -0xb15807e
        0x22f1ef8a
        0x3aa84c71
        0x418fd98f
        0x723dd09
        0xee71955
        0x460caea4
    .end array-data

    :array_3
    .array-data 4
        -0x7e2aa8f0
        0x4474f4ff
        0x323631a2
        0x769418af
        -0x27e7724a
        -0x2ba54c16
        -0x5e83b6d0
        -0xcc27195
    .end array-data

    :array_4
    .array-data 4
        -0x7e2aa8f0
        0x4474f4ff
        0x36e86d9a
        0x735134a
        -0x151e8f16
        -0x661a2b1e
        0x9d41535
        -0x6c7672e6
    .end array-data

    :array_5
    .array-data 4
        -0xcec1b81
        -0x1f15dae
        -0x3a006baa
        -0x5f885ff3
        0xe615ec
        0x58613ce5
        0x4d0b3b23    # 1.4599429E8f
        0x1862bce1
        -0xc224c41
        -0x44db8c9c
        -0x23d91e8f
        -0x3ed603ec
        -0x7bcb81fa
        -0xbb4c899
        -0x3b942b2
        0x7754dfc7
        -0x3bda2ccc    # -663.30005f
        -0x5a28435d
        -0xdeb9955
        -0x79b38ac9
    .end array-data

    :array_6
    .array-data 4
        0x3733f619
        0x7c55af03
        0x36246bd0
        0x34f4460c
        -0x10903468
        -0x1025b02d
    .end array-data

    :array_7
    .array-data 4
        0x21c248f2
        0x3bfefe5f
        -0x1deb690e
        0x986ce68
        -0x1626c056
        -0x4ad7004a
        -0x56c9440a
        0x26acd718
    .end array-data

    :array_8
    .array-data 4
        -0x3b7beb4e
        -0x7d281f02
        -0x6e082e6f
        0x3a854650
        -0x5a7a9979
        -0x3b2d727f
        0x2d4eb760
        0x392a5210
        0x50498d94
        -0x1dda3c17
    .end array-data

    :array_9
    .array-data 4
        -0x40dd199e
        -0x47da881
        0x56b06cc0
        0x56125d65
        -0x1deb690e
        0x986ce68
        -0x1626c056
        -0x4ad7004a
        -0x56c9440a
        0x26acd718
    .end array-data

    :array_a
    .array-data 4
        -0x78962b90
        0x585fa800    # 9.836506E14f
        0x6000dd7b
        -0x65c9dbfa
        0x65dbe599
        -0x33ed970e    # -3.838049E7f
        -0x1deb690e
        0x986ce68
        -0x1626c056
        -0x4ad7004a
        -0x56c9440a
        0x26acd718
    .end array-data

    :array_b
    .array-data 4
        -0x40dd199e
        -0x47da881
        0x56b06cc0
        0x56125d65
        -0x69fa07cc
        0x46b7e5dc
    .end array-data

    :array_c
    .array-data 4
        -0x7e2aa8f0
        0x4474f4ff
        -0x44207106
        -0x791d14f8
        0x7783fa2c
        0x7765c50e
    .end array-data

    :array_d
    .array-data 4
        0xec5a699
        -0x134bc742
        0xfcf439a
        -0x4e5c31cf
        0x4b3e46f
        0x75e75296
    .end array-data

    :array_e
    .array-data 4
        -0x443ed672
        -0x527c4df2
        -0x151e8f16
        -0x661a2b1e
        0x9d41535
        -0x6c7672e6
    .end array-data
.end method

.method final ｋ()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x2

    .line 84
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v1, v0

    .line 80
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/bg;->ﾒ()Ljava/lang/String;

    move-result-object v1

    .line 81
    const-string v2, "\u2e05"

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    const v5, 0x1b0627e2

    add-int/2addr v4, v5

    const-string v5, "\ue2dd\u0627\u6c1b\u3620"

    const-string v6, "\u0000\u0000\u0000\u0000"

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v7

    rsub-int v7, v7, 0x206c

    int-to-char v7, v7

    invoke-static {v2, v4, v5, v6, v7}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v2, v2, 0x7d

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0x2c

    div-int/2addr v0, v3

    :cond_0
    return-object v1

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method final ﾇ()Ljava/util/Map;
    .locals 11
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

    .line 201
    rem-int v1, v0, v0

    .line 158
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x6

    .line 159
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    add-int/lit8 v4, v4, 0x9

    invoke-static {v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/ironsource/adqualitysdk/sdk/i/ch$3;

    invoke-direct {v4, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const-string v4, ""

    invoke-static {v4, v3}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v5

    int-to-char v5, v5

    const-string v6, "\u2dd8\u3e02\ue972\uc015\u7342\u6bb4\u9907\u4a47"

    const-string v7, "\u242e\u44d8\u0421\uc588"

    const-string v8, "\u0000\u0000\u0000\u0000"

    invoke-static {v6, v2, v7, v8, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ch$4;

    invoke-direct {v5, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v5

    const-wide/16 v9, 0x0

    cmp-long v5, v5, v9

    add-int/lit16 v5, v5, 0x49f8

    int-to-char v5, v5

    const-string v6, "\ud8fe\u4475\u83c0\uf77d\u9763\u3182\u120c\ua2d5\uef01\u9454\u388c\uefba\u388a\ud9f4\ubdcc\ub927\uda67\u50ee\u534e\u390a\u65ac\uff0b\u2bda\u23d8\u3abd\u65ee"

    const-string v7, "\u11d0\u26ef\uf82d\ue049"

    invoke-static {v6, v2, v7, v8, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ch$2;

    invoke-direct {v5, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const v5, -0x13cc963e

    add-int/2addr v2, v5

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    rsub-int/lit8 v5, v5, 0x1

    int-to-char v5, v5

    const-string v6, "\ue532\u9e3f\uaa21\u260e\udcff\u6666\u1100\u7c3d\ubbb0\u2ec4\ud1aa"

    const-string v7, "\uc294\u3369\u13ec\u47ae"

    invoke-static {v6, v2, v7, v8, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ch$5;

    invoke-direct {v5, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x8

    .line 183
    new-array v5, v2, [I

    fill-array-data v5, :array_1

    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v6

    cmp-long v6, v6, v9

    rsub-int/lit8 v6, v6, 0xe

    invoke-static {v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/ironsource/adqualitysdk/sdk/i/ch$1;

    invoke-direct {v6, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0xa

    .line 189
    new-array v5, v5, [I

    fill-array-data v5, :array_2

    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/ch$7;

    invoke-direct {v5, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$7;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    new-array v2, v2, [I

    fill-array-data v2, :array_3

    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0xf

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻐ([II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ch$9;

    invoke-direct {v3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ch$9;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ch;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    add-int/lit8 v2, v2, 0x75

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0

    nop

    :array_0
    .array-data 4
        -0x49538169
        0x1a5b63e3
        -0x371e7d80    # -461844.0f
        -0x7e496375
        -0x6c8cc5a
        -0x4e7363e2
    .end array-data

    :array_1
    .array-data 4
        0x5d792c4b
        0x46906063
        0x2d4eb760
        0x392a5210
        0x50498d94
        -0x1dda3c17
        0x3af63e49
        -0x8f8215a
    .end array-data

    :array_2
    .array-data 4
        0x25fa1f8d
        0xb0e3c93
        -0x2e0d650b
        -0x3fa3377
        0x56733c4e
        0x7e79119e
        0x65540f2e
        0x70571801
        -0x51b9e451
        -0x2d448c22
    .end array-data

    :array_3
    .array-data 4
        -0x8633ee
        0x386a33d0
        -0x6ffabe07
        0x28e3aac1
        0x5998f809
        -0x3b446167
        0x2f5573b6
        0x3e93dd8d
    .end array-data
.end method

.method public final ﾒ()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x2

    .line 93
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻛ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﻏ:I

    rem-int/2addr v1, v0

    const-string v0, "\u0000\u0000\u0000\u0000"

    const-string v2, "\uf1ba\uff87\u877d\u2c0d"

    const-string v3, ""

    const/4 v4, -0x1

    const-string v5, "\u96f6\u01c6\ue7e8\u2b2a\u2a55\ub864\ubd62\u31ee\ue83d\u61ff\u86c1\u92a0\u05ea\uaced"

    if-nez v1, :cond_0

    .line 90
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hw;

    move-result-object v1

    const-class v6, Lcom/vungle/ads/BuildConfig;

    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v3

    rem-int/2addr v4, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    ushr-int/lit8 v3, v3, 0x1e

    const/16 v7, 0x253b

    ushr-int v3, v7, v3

    int-to-char v3, v3

    invoke-static {v5, v4, v2, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v6, v0}, Lcom/ironsource/adqualitysdk/sdk/i/hw;->ﻐ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/hu;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hw;

    move-result-object v1

    const-class v6, Lcom/vungle/ads/BuildConfig;

    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v3

    sub-int/2addr v4, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int v3, v3, 0xd87

    int-to-char v3, v3

    invoke-static {v5, v4, v2, v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ch;->ﾇ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method
