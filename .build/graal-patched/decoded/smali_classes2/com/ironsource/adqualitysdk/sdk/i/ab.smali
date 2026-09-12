.class public final Lcom/ironsource/adqualitysdk/sdk/i/ab;
.super Lcom/ironsource/adqualitysdk/sdk/i/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/ab$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ironsource/adqualitysdk/sdk/i/v<",
        "Landroid/view/View;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# static fields
.field private static ﭖ:I = 0x1

.field private static ﮉ:I = 0x0

.field private static ﻏ:I = 0x56


# instance fields
.field private final ﮐ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Landroid/view/View$OnLayoutChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

.field private ﱡ:Ljava/lang/Class;

.field private final ﺙ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private ﻐ:Landroid/view/View$OnLayoutChangeListener;

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

.field private final ｋ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ab;",
            ">;"
        }
    .end annotation
.end field

.field private final ﾇ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/webkit/WebView;",
            "Lcom/ironsource/adqualitysdk/sdk/i/ac;",
            ">;"
        }
    .end annotation
.end field

.field private ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/it;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/it;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/v;-><init>()V

    .line 35
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ:Ljava/util/Map;

    .line 41
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    .line 42
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮐ:Ljava/util/Map;

    .line 46
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﺙ:Ljava/util/List;

    .line 50
    invoke-virtual {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/it;)V

    .line 51
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ()V

    return-void
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Lcom/ironsource/adqualitysdk/sdk/i/ab$b;
    .locals 4

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v3, 0x0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, 0x25

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3

    :cond_1
    throw v3
.end method

.method private ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/r;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/ironsource/adqualitysdk/sdk/i/r<",
            "Landroid/webkit/WebView;",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 197
    rem-int v1, v0, v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ab$3;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;)V

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v2, v2, 0x69

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private ﻐ(Landroid/view/View;Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)V
    .locals 12

    const/4 v0, 0x2

    .line 189
    rem-int v1, v0, v0

    .line 162
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 189
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v1, v1, 0x69

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    .line 163
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 189
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    .line 164
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;

    if-nez v1, :cond_0

    .line 166
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0, p2, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﾒ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 168
    :cond_0
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 169
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0, p2, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﾒ(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    :cond_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p1, p1, 0x5d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p1, v0

    return-void

    .line 172
    :cond_2
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 173
    const-class v4, Landroid/webkit/WebView;

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v6

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v7

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v8

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾇ(Landroid/view/View;Ljava/lang/Class;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 174
    instance-of p1, v3, Landroid/webkit/WebView;

    if-eqz p1, :cond_3

    .line 178
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p1, v0

    .line 175
    move-object p1, v3

    check-cast p1, Landroid/webkit/WebView;

    invoke-interface {v9, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    :cond_3
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    goto/16 :goto_2

    .line 189
    :cond_5
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v4, v1, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_7

    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 178
    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﮐ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 179
    new-instance v5, Lcom/ironsource/adqualitysdk/sdk/i/aa;

    invoke-direct {v5}, Lcom/ironsource/adqualitysdk/sdk/i/aa;-><init>()V

    .line 180
    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ:Ljava/util/Map;

    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v6

    .line 182
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﮌ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v7, v2

    goto :goto_1

    :cond_6
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﮌ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v7, v7}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v8

    add-int/2addr v8, v3

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v9

    add-int/lit16 v9, v9, 0x82

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v10

    sub-int/2addr v3, v10

    const-string v10, "\u0000"

    invoke-static {v10, v8, v9, v7, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v7, v3

    .line 183
    :goto_1
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﭖ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v8

    .line 184
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﭴ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v9

    .line 185
    invoke-static {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﮉ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Z

    move-result v10

    .line 181
    invoke-virtual/range {v5 .. v10}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Ljava/lang/String;Ljava/util/List;ZZZ)V

    .line 186
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/r;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/r;)V

    .line 187
    invoke-virtual {v5, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﻐ(Landroid/webkit/WebView;)V

    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ(Ljava/lang/String;)V

    .line 189
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    .line 178
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :cond_8
    :goto_2
    return-void
.end method

.method private ﻐ(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 148
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 149
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-direct {p0, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Landroid/view/View;Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)V

    add-int/lit8 v1, v1, 0x1

    .line 148
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;
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

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻏ:I

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

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/List;
    .locals 4

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v2, v1, 0x67

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﺙ:Ljava/util/List;

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private ﻛ()V
    .locals 3

    const/4 v0, 0x2

    .line 83
    rem-int v1, v0, v0

    .line 60
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ab$4;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;)V

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ:Landroid/view/View$OnLayoutChangeListener;

    .line 70
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ab$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;)V

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

    .line 83
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ji;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/jl;)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method static synthetic ﻛ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    invoke-static/range {p0 .. p6}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 p0, p0, 0x47

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method private static ｋ()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    .line 98
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    add-int/lit8 v2, v2, 0x49

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    return-object v3

    :cond_0
    invoke-super {v3}, Ljava/lang/Object;->hashCode()I

    throw v3
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/util/Map;
    .locals 4

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v2, v1, 0x3f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮐ:Ljava/util/Map;

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Landroid/view/View$OnLayoutChangeListener;
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ:Landroid/view/View$OnLayoutChangeListener;

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static ﾇ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x2

    .line 269
    rem-int v1, v0, v0

    .line 262
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 269
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    const/4 v1, 0x0

    .line 263
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    move-result v5

    cmpl-float v4, v5, v4

    add-int/lit16 v4, v4, 0xa2

    const-string v5, ""

    invoke-static {v5}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v6

    sub-int/2addr v0, v6

    const-string v6, "\u000f\u0011\uffe2"

    invoke-static {v6, v2, v4, v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 264
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x3

    if-gt v2, v4, :cond_0

    return-object p0

    .line 267
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result p0

    shr-int/lit8 p0, p0, 0x10

    sub-int/2addr v3, p0

    invoke-static {v5}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result p0

    add-int/lit16 p0, p0, 0x84

    const/16 v2, 0x30

    invoke-static {v5, v2, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    neg-int v2, v2

    const-string v5, "\u0000"

    invoke-static {v5, v3, p0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 269
    :cond_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p0, p0, 0x51

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p0, v0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static ﾇ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Landroid/view/View;",
            ">(",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            "Ljava/lang/Class<",
            "TE;>;Z",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 157
    rem-int v1, v0, v0

    .line 155
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x3d

    .line 157
    rem-int/lit16 p0, v2, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    move-object v1, p2

    const/4 p2, 0x1

    move-object p0, p1

    move-object p1, v1

    .line 155
    invoke-static/range {p0 .. p6}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾇ(Landroid/view/View;Ljava/lang/Class;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void

    :cond_0
    move-object p0, p1

    move-object v1, p2

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾇ(Landroid/view/View;Ljava/lang/Class;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void

    :cond_1
    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    .line 157
    invoke-static/range {v0 .. v5}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾇ(Landroid/app/Activity;Ljava/lang/Class;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab;)Ljava/lang/Class;
    .locals 4

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v2, v1, 0x67

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱡ:Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x77

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ab;Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x2

    .line 31
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ(Ljava/util/List;)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p0, p0, 0x3f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method private ﾒ(Landroid/view/View;)Z
    .locals 6

    const/4 v0, 0x2

    .line 244
    rem-int v1, v0, v0

    .line 241
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/it;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 244
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr p1, v0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﭸ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ(Landroid/view/View;Ljava/util/List;)Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v5, v1, 0x80

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/it;

    invoke-interface {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/it;->ﾒ(Landroid/view/View;)Z

    move-result p1

    const/4 v1, 0x7

    div-int/2addr v1, v3

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/it;

    invoke-interface {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/it;->ﾒ(Landroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_3
    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p1, p1, 0x9

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_4

    return v3

    :cond_4
    invoke-super {v4}, Ljava/lang/Object;->hashCode()I

    throw v4

    :cond_5
    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p1, p1, 0x15

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_6

    return v2

    :cond_6
    throw v4
.end method

.method private static ﾒ(Landroid/view/View;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    .line 258
    rem-int v1, v0, v0

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v2, v2, 0x11

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_4

    .line 248
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v1

    if-eq v2, v1, :cond_0

    goto :goto_1

    .line 258
    :cond_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v2, v2, 0x1f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v2, v0

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object p0

    .line 250
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 251
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾇ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 252
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 258
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v3, v3, 0x77

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v3, v0

    .line 252
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    .line 258
    :cond_3
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 p1, p1, 0x47

    rem-int/lit16 v3, p1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    const/4 p1, 0x3

    div-int/lit8 p1, p1, 0x5

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0

    :cond_5
    :goto_1
    return v1
.end method


# virtual methods
.method public final ﻛ(Landroid/view/View;)V
    .locals 10

    const/4 v0, 0x2

    .line 143
    rem-int v1, v0, v0

    const/4 v1, 0x0

    .line 104
    :try_start_0
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱡ:Ljava/lang/Class;

    if-nez v2, :cond_0

    .line 105
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    iput-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱡ:Ljava/lang/Class;

    .line 107
    :cond_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jj;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/jj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/jj;->ﾒ()Landroid/app/Activity;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_2

    .line 143
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 p1, p1, 0x23

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    throw p1

    .line 112
    :cond_2
    :try_start_1
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_4

    .line 143
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v3, v3, 0x71

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_3

    .line 113
    :try_start_2
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾒ(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v3

    const/16 v4, 0x1f

    .line 114
    div-int/2addr v4, v1

    if-eqz v3, :cond_4

    goto :goto_0

    .line 113
    :cond_3
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/kh;->ﾒ(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 114
    :goto_0
    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    .line 115
    invoke-static {v4}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_4

    .line 143
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 p1, p1, 0x79

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr p1, v0

    return-void

    .line 120
    :cond_4
    :try_start_3
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;

    invoke-direct {v0, p0, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ab$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ab;Landroid/app/Activity;Landroid/view/View;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 143
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v0

    rsub-int/lit8 v0, v0, 0xb

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int v2, v2, 0xb9

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    add-int/lit8 v3, v3, 0xe

    const-string v4, "\u0014\uffde\u0001\u0010\uffe5\ufffe\u000b\u0001\t\u0002\u000f\ufff3\u0006\u0002"

    invoke-static {v4, v0, v2, v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    const/16 v4, 0x30

    invoke-static {v3, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    rsub-int v4, v4, 0xb6

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x14

    const-string v8, "\u0013\u0013\uffe6\uffc1\u0014\u0014\u0002\r\u0004\uffc1\u0008\u000f\n\u0015\u0015\u0006\u0008\uffc1\u0013\u0010"

    const/4 v9, 0x1

    invoke-static {v8, v3, v4, v9, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-static {v3}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ab$b;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    cmp-long v3, v3, v6

    rsub-int/lit8 v3, v3, 0x3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v4

    shr-int/lit8 v4, v4, 0x18

    rsub-int/lit8 v4, v4, 0x7a

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x3

    const-string v6, "\t\ufffc\ufffc"

    invoke-static {v6, v3, v4, v1, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﾒ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected final synthetic ﾇ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const/4 p1, 0x2

    .line 31
    rem-int v0, p1, p1

    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v0, p1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v1, p1

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ｋ()Ljava/lang/String;

    const/4 p1, 0x0

    throw p1
.end method

.method final ﾇ(Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/it;)V
    .locals 2

    const/4 v0, 0x2

    .line 56
    rem-int v1, v0, v0

    .line 55
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    invoke-direct {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ab$b;-><init>(Lorg/json/JSONObject;)V

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/ab$b;

    .line 56
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/it;

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 p1, p1, 0x27

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method final ﾒ()V
    .locals 4

    const/4 v0, 0x2

    .line 92
    rem-int v1, v0, v0

    const/4 v1, 0x0

    .line 87
    invoke-virtual {p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/v;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/r;)V

    .line 88
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ji;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jl;

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ji;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/jl;)V

    .line 89
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮐ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 90
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮐ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 91
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 92
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    rem-int/2addr v2, v0

    .line 91
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    return-void

    .line 92
    :cond_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﭖ:I

    add-int/lit8 v2, v2, 0xf

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﮉ:I

    rem-int/2addr v2, v0

    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 92
    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ab;->ﻐ:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_0
.end method
