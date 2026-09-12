.class public final Lcom/ironsource/adqualitysdk/sdk/i/y$d;
.super Lcom/ironsource/adqualitysdk/sdk/i/w$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# static fields
.field private static ﭖ:I = 0x0

.field private static ﭴ:I = 0x1

.field private static ﱟ:[C = null

.field private static ﱡ:C = '\u0000'

.field private static ﺙ:J = 0x0L

.field private static ﻏ:I = 0x3b5a0d40


# instance fields
.field private ﮐ:Z

.field private ﻐ:Z

.field private ﻛ:Ljava/lang/String;

.field private ﾇ:Ljava/lang/String;

.field private ﾒ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5d

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﱟ:[C

    return-void

    :array_0
    .array-data 2
        0x3cs
        0x70s
        0x67s
        0x65s
        0x6bs
        0x61s
        0x5as
        0x69s
        0x67s
        0x57s
        0x60s
        0x73s
        0x6as
        0x66s
        0x57s
        0x5ds
        0x6es
        0x67s
        0x5fs
        0x5cs
        0x63s
        0x6es
        0x35s
        0x6es
        0x63s
        0x61s
        0x5cs
        0x5bs
        0x6cs
        0x67s
        0x64s
        0x6bs
        0x32s
        0x6bs
        0x61s
        0x5es
        0x6fs
        0x73s
        0x76s
        0x70s
        0x67s
        0x5ds
        0xd1s
        0xe0s
        0xd9s
        0xd1s
        0xces
        0xd5s
        0xd0s
        0xd0s
        0xdes
        0xe6s
        0xe0s
        0xdfs
        0xdcs
        0x62s
        0xc3s
        0xbbs
        0xa4s
        0xads
        0xc5s
        0xc2s
        0xb8s
        0xa4s
        0xads
        0x40s
        0x7fs
        0x77s
        0x64s
        0x6cs
        0x7bs
        0x7bs
        0x79s
        0x77s
        0x79s
        0x73s
        0x69s
        0x69s
        0x6es
        0x67s
        0x6as
        0x72s
        0x79s
        0x80s
        0x34s
        0x6bs
        0x6es
        0x5fs
        0x5es
        0x5fs
        0x5fs
        0x71s
        0x73s
    .end array-data
.end method

.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/y;Lorg/json/JSONObject;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 329
    invoke-direct {v0}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;-><init>()V

    const/4 v2, 0x0

    .line 325
    iput-boolean v2, v0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﮐ:Z

    .line 330
    const-string v3, ""

    const/16 v4, 0x30

    invoke-static {v3, v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    const v6, 0xdd66

    add-int/2addr v5, v6

    int-to-char v5, v5

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v6

    int-to-byte v6, v6

    const/4 v7, 0x1

    add-int/2addr v6, v7

    const-string v8, "\u907e\u3f03\u65c9\u2add"

    const-string v9, "\u9a19\u6b61\uf50d\uef20\ue150\u59d5\uf278\ucb7b\u0f38\u1507\udc62\u1702\ube2c\u8f5f"

    const-string v10, "\u0000\u0000\u0000\u0000"

    invoke-static {v8, v5, v6, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/y$d;

    const/16 v5, 0x16

    .line 331
    filled-new-array {v2, v5, v2, v2}, [I

    move-result-object v6

    const-string v8, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000"

    invoke-static {v7, v8, v6}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/y$d;

    .line 332
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    int-to-char v6, v6

    const v8, -0x6bb797f6

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v9

    sub-int/2addr v8, v9

    const-string v9, "\u7a2e\u148f\u1760\u91af\u6eea\u2a88\u33db\u4fda\u2f67"

    const-string v11, "\u0a0a\u4868\ub494\u33bc"

    invoke-static {v11, v6, v8, v9, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    const/4 v8, -0x1

    invoke-virtual {v1, v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-direct {v0, v6}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(I)Lcom/ironsource/adqualitysdk/sdk/i/y$d;

    .line 333
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v6

    add-int/lit16 v6, v6, 0x2257

    int-to-char v6, v6

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v8

    const-wide/16 v11, -0x1

    cmp-long v8, v8, v11

    const v9, 0x1529ba9

    sub-int/2addr v9, v8

    const-string v8, "\ub07a\ucf49\uffbd\u0619\u1f44\u7833\u3879\ue547\u5170\ub574\uc531\ub26e\ude1c\u7044\u56c8\u1d25\u295d"

    const-string v13, "\ua8a3\u529b\u5701\u7722"

    invoke-static {v13, v6, v9, v8, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    invoke-direct {v0, v6}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﮐ(Z)Lcom/ironsource/adqualitysdk/sdk/i/y$d;

    .line 334
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v8

    const-wide/16 v13, 0x0

    cmp-long v6, v8, v13

    const v8, 0x97fc

    add-int/2addr v6, v8

    int-to-char v6, v6

    const v8, -0x302a3b12

    invoke-static {v3, v2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v9

    add-int/2addr v9, v8

    const-string v8, "\ua3ef\ufd82\u011b\u90c2\u7b46\u7100\u7a1e\uac31\u4109\u23f9\u9599\u8c84\u4c34\u9253\u8f6c\ua252\u6705\ue47b\uecc3"

    const-string v15, "\uee00\ud5c4\ufbcf\u8c97"

    invoke-static {v15, v6, v9, v8, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    invoke-direct {v0, v6}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﱡ(Z)Lcom/ironsource/adqualitysdk/sdk/i/y$d;

    const/16 v6, 0xa

    .line 335
    filled-new-array {v5, v6, v2, v2}, [I

    move-result-object v8

    const-string v9, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001"

    invoke-static {v2, v9, v8}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ｋ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const/16 v8, 0x20

    const/16 v15, 0x9

    move-wide/from16 v16, v11

    const/4 v11, 0x6

    .line 336
    filled-new-array {v8, v15, v2, v11}, [I

    move-result-object v12

    move-wide/from16 v18, v13

    const-string v13, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001"

    invoke-static {v7, v13, v12}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    filled-new-array {v8, v15, v2, v11}, [I

    move-result-object v8

    invoke-static {v7, v13, v8}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v11

    cmp-long v11, v11, v16

    add-int/lit16 v11, v11, 0xfed

    int-to-char v11, v11

    const v12, -0x799b3a7

    invoke-static {v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v3

    sub-int/2addr v12, v3

    const-string v3, "\u390c"

    const-string v13, "\u5a3f\u664c\ueef8\ue70f"

    invoke-static {v13, v11, v12, v3, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ｋ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const/16 v3, 0xe

    const/16 v8, 0x72

    const/16 v11, 0x29

    const/16 v12, 0xb

    .line 337
    filled-new-array {v11, v3, v8, v12}, [I

    move-result-object v3

    const-string v8, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000"

    invoke-static {v7, v8, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﾇ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    .line 338
    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v3

    rsub-int v3, v3, 0x6c85

    int-to-char v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    const v11, 0x3f924196

    sub-int/2addr v11, v8

    const-string v8, "\ue737\u9353\u342c\u047e\uaff6\ue0bd\u7600\u12f4\u9b0a\u0f61\udcbf\ub95e\u11e4"

    const-string v13, "\u9687\u9241\u853f\ucc6c"

    invoke-static {v13, v3, v11, v8, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ｋ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    .line 339
    filled-new-array {v5, v6, v2, v2}, [I

    move-result-object v3

    invoke-static {v2, v9, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const-string v5, "\u8628\u29e2\u90a4\uf7bf\udf1c\u5dc6\u97a2\u255d\ud5d8\u723f\u58ef\ud50a\u8924\uc204\u7ec6\u2f7c"

    const-string v8, "\u08f0\uc209\ue1ac\u5389"

    if-eqz v3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    cmp-long v3, v13, v18

    const v9, 0x89e2

    sub-int/2addr v9, v3

    int-to-char v3, v9

    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v9

    invoke-static {v8, v3, v9, v5, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const v3, 0xc58c

    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v9

    add-int/2addr v9, v3

    int-to-char v3, v9

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v9

    const-string v11, "\ua606\u0c22\u72db\ub856\u9c0f\u98e0\u7950\u2303\u686f\u4779\ud047\u2da1\uba5f\u6f5c\ud6a6\uf739\u0aaf\u6a0d"

    const-string v13, "\uf5ce\u9fbd\u8c1f\uc8c5"

    invoke-static {v13, v3, v9, v11, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v7, v2

    :cond_2
    :goto_1
    invoke-virtual {v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﻐ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    .line 340
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    const v7, 0x89e1

    sub-int/2addr v7, v3

    int-to-char v3, v7

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    invoke-static {v8, v3, v7, v5, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﻛ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const/16 v3, 0x37

    const/16 v5, 0x4f

    .line 341
    filled-new-array {v3, v6, v5, v6}, [I

    move-result-object v3

    const-string v5, "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001"

    invoke-static {v2, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﱟ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const/16 v3, 0x41

    const/16 v5, 0x13

    .line 342
    filled-new-array {v3, v5, v12, v2}, [I

    move-result-object v3

    const-string v5, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000"

    invoke-static {v2, v5, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﾒ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    .line 343
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v3

    add-int/lit16 v3, v3, 0xc6b

    int-to-char v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v4

    shr-int/lit8 v4, v4, 0x8

    const v5, 0x758e205e

    sub-int/2addr v5, v4

    const-string v4, "\u21a3\u9e81\u94de\ua442\ub318\u5ce5\u8867\u0b18\u0cd2\u15f4\u793d\u6b86\u39d0\u9d0f\u3dca\u7069\ud9f4"

    const-string v6, "\u5e1b\u8e20\u9b75\u1e0c"

    invoke-static {v6, v3, v5, v4, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﻏ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const/16 v3, 0x54

    .line 344
    filled-new-array {v3, v15, v2, v2}, [I

    move-result-object v3

    const-string v4, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001"

    invoke-static {v2, v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﺙ(Z)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    const v3, 0x100e9d8

    .line 345
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    add-int/2addr v2, v3

    int-to-char v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    const v4, 0x7bb2d43d

    add-int/2addr v3, v4

    const-string v4, "\uc1fa\ue88c\u00d8\ub29a\u894c\u3cc4\uefa2\ue55a\ub0c8\ufe98\ua18b\u3a0d\u5938"

    const-string v5, "\u3de8\ub2d4\ud87b\uf3e9"

    invoke-static {v5, v2, v3, v4, v10}, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ﾒ(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/w$c;->ﻐ(Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/w$c;

    return-void
.end method

.method private ﮐ(Z)Lcom/ironsource/adqualitysdk/sdk/i/y$d;
    .locals 4

    const/4 v0, 0x2

    .line 365
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    add-int/lit8 v2, v1, 0x6b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v2, v0

    .line 364
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻐ:Z

    add-int/lit8 v1, v1, 0x73

    .line 365
    rem-int/lit16 p1, v1, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method private ﱡ(Z)Lcom/ironsource/adqualitysdk/sdk/i/y$d;
    .locals 3

    const/4 v0, 0x2

    .line 370
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    add-int/lit8 v1, v1, 0x21

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v1, v0

    .line 369
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﮐ:Z

    add-int/lit8 v2, v2, 0x57

    .line 370
    rem-int/lit16 p1, v2, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v2, v0

    return-object p0
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/y$d;)Z
    .locals 3

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v1, v0

    iget-boolean p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﮐ:Z

    if-eqz v1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private ﻛ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/y$d;
    .locals 3

    const/4 v0, 0x2

    .line 355
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 354
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ:Ljava/lang/String;

    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 355
    throw p1
.end method

.method private static ﻛ(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->toCharArray()[C

    move-result-object p4

    :cond_0
    check-cast p4, [C

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_1
    check-cast p3, [C

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
    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    .line 1126
    invoke-virtual {p4}, [C->clone()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [C

    const/4 v1, 0x0

    .line 1127
    aget-char v2, p0, v1

    xor-int/2addr p1, v2

    int-to-char p1, p1

    aput-char p1, p0, v1

    const/4 p1, 0x2

    .line 1128
    aget-char v2, p4, p1

    int-to-char p2, p2

    add-int/2addr v2, p2

    int-to-char p2, v2

    aput-char p2, p4, p1

    .line 1130
    array-length p2, p3

    .line 1131
    new-array v2, p2, [C

    .line 1132
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    :goto_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    if-ge v1, p2, :cond_3

    .line 1134
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/2addr v1, p1

    rem-int/lit8 v1, v1, 0x4

    .line 1135
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit8 v3, v3, 0x4

    .line 1138
    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    rem-int/lit8 v4, v4, 0x4

    aget-char v4, p0, v4

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v5, p4, v1

    add-int/2addr v4, v5

    const v5, 0xffff

    rem-int/2addr v4, v5

    int-to-char v4, v4

    sput-char v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    .line 1141
    aget-char v4, p0, v3

    mul-int/lit16 v4, v4, 0x7fce

    aget-char v1, p4, v1

    add-int/2addr v4, v1

    div-int/2addr v4, v5

    int-to-char v1, v4

    aput-char v1, p4, v3

    .line 1144
    sget-char v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ﻐ:C

    aput-char v1, p0, v3

    .line 1147
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    sget v4, Lcom/ironsource/adqualitysdk/sdk/i/g;->ｋ:I

    aget-char v4, p3, v4

    aget-char v3, p0, v3

    xor-int/2addr v3, v4

    int-to-long v3, v3

    sget-wide v5, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﺙ:J

    xor-long/2addr v3, v5

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻏ:I

    int-to-long v5, v5

    xor-long/2addr v3, v5

    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﱡ:C

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

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/y$d;)Z
    .locals 4

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    add-int/lit8 v2, v1, 0x79

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v2, v0

    iget-boolean p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻐ:Z

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    const/16 v0, 0x61

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return p0
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/y$d;)I
    .locals 3

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v1, v0

    iget p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾒ:I

    add-int/lit8 v2, v2, 0x1

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method private ﾇ(I)Lcom/ironsource/adqualitysdk/sdk/i/y$d;
    .locals 3

    const/4 v0, 0x2

    .line 360
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 359
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾒ:I

    return-object p0

    :cond_0
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾒ:I

    const/4 p1, 0x0

    .line 360
    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method private ﾇ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/y$d;
    .locals 3

    const/4 v0, 0x2

    .line 350
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 349
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ:Ljava/lang/String;

    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 350
    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/y$d;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﾇ:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v0, 0x3

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method

.method private static ﾇ(ZLjava/lang/String;[I)Ljava/lang/String;
    .locals 12

    if-eqz p1, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    :cond_0
    check-cast p1, [B

    .line 1195
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﻐ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1198
    :try_start_0
    aget v2, p2, v1

    const/4 v3, 0x1

    .line 1199
    aget v4, p2, v3

    const/4 v5, 0x2

    .line 1200
    aget v6, p2, v5

    const/4 v7, 0x3

    .line 1201
    aget v7, p2, v7

    .line 1203
    sget-object v8, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﱟ:[C

    .line 1204
    new-array v9, v4, [C

    .line 1206
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p1, :cond_3

    .line 1211
    new-array v2, v4, [C

    .line 1214
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    move v8, v1

    :goto_0
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge v10, v4, :cond_2

    .line 1216
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-byte v10, p1, v10

    if-ne v10, v3, :cond_1

    .line 1218
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    add-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    goto :goto_1

    .line 1222
    :cond_1
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v11, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v11, v9, v11

    shl-int/2addr v11, v3

    sub-int/2addr v11, v8

    int-to-char v8, v11

    aput-char v8, v2, v10

    .line 1225
    :goto_1
    sget v8, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char v8, v2, v8

    .line 1214
    sget v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr v10, v3

    sput v10, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_0

    :cond_2
    move-object v9, v2

    :cond_3
    if-lez v7, :cond_4

    .line 1234
    new-array p1, v4, [C

    .line 1236
    invoke-static {v9, v1, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v2, v4, v7

    .line 1237
    invoke-static {p1, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1238
    invoke-static {p1, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    if-eqz p0, :cond_6

    .line 1244
    new-array p0, v4, [C

    .line 1246
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_2
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p1, v4, :cond_5

    .line 1248
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sub-int v2, v4, v2

    sub-int/2addr v2, v3

    aget-char v2, v9, v2

    aput-char v2, p0, p1

    .line 1246
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p1, v3

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_2

    :cond_5
    move-object v9, p0

    :cond_6
    if-lez v6, :cond_7

    .line 1257
    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    :goto_3
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    if-ge p0, v4, :cond_7

    .line 1259
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    aget-char p1, v9, p1

    aget v1, p2, v5

    sub-int/2addr p1, v1

    int-to-char p1, p1

    aput-char p1, v9, p0

    .line 1257
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    add-int/2addr p0, v3

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/j;->ﾒ:I

    goto :goto_3

    .line 1263
    :cond_7
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1264
    monitor-exit v0

    throw p0
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/y$d;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    .line 319
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭴ:I

    add-int/lit8 v2, v1, 0x5

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﻛ:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/y$d;->ﭖ:I

    rem-int/2addr v1, v0

    return-object p0
.end method
