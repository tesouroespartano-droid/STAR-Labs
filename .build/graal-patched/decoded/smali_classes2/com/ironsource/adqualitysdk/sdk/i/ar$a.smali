.class final Lcom/ironsource/adqualitysdk/sdk/i/ar$a;
.super Lcom/ironsource/adqualitysdk/sdk/i/ar;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static く:I = 0x0

.field private static へ:I = 0x1

.field private static ト:C = '\ud1ac'

.field private static ヮ:C = '\ua8ea'

.field private static ヶ:C = '\u641b'

.field private static 丫:J = 0x5d2722614c8c38cL

.field private static 乁:C = '\ub045'


# instance fields
.field private リ:Z

.field private 爫:Ljava/util/List;

.field private ﬤ:Z

.field private טּ:Z

.field private סּ:I

.field private ףּ:Lcom/ironsource/adqualitysdk/sdk/i/an;

.field private ﭖ:Lcom/ironsource/adqualitysdk/sdk/i/ar$c;

.field private ﭴ:Lcom/ironsource/adqualitysdk/sdk/i/ap;

.field private ﭸ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/av;",
            ">;"
        }
    .end annotation
.end field

.field private ﮉ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/adqualitysdk/sdk/i/av;",
            ">;"
        }
    .end annotation
.end field

.field private ﮌ:Lcom/ironsource/adqualitysdk/sdk/i/av;

.field private ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/ax;

.field private ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/aq;

.field private ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

.field private ﺙ:Landroid/os/Handler;

.field private ﻏ:Lcom/ironsource/adqualitysdk/sdk/i/as;

.field private final ﻐ:I

.field private final ﻛ:I

.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

.field private final ﾇ:I

.field private final ﾒ:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x0

    .line 202
    invoke-direct {p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;-><init>(B)V

    const/16 v1, 0x30

    .line 153
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v2

    const v3, 0xde89

    sub-int/2addr v3, v2

    const-string v2, "\uc3e9\u1dbb\u7f48"

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 154
    const-string v2, ""

    invoke-static {v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v3

    const v4, 0xdd10

    add-int/2addr v3, v4

    const-string v4, "\uc3e9\u1eee\u79f6"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 155
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    const v4, 0x887b

    sub-int/2addr v4, v3

    const-string v3, "\uc3ef\u4b90\ud316\u5a89"

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 156
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v3

    int-to-byte v3, v3

    add-int/lit8 v3, v3, 0x5

    const-string v4, "\u2a85\uf51a\ue217\u9ca2"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 157
    invoke-static {v0, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    const-string v4, "\u86df\u259d\uf672\u69ad"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 158
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v3

    rsub-int v3, v3, 0x2c23

    const-string v4, "\uc3ed\uefdb\u9bbe\u4787"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    const/4 v3, 0x0

    .line 159
    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    move-result v4

    cmpl-float v3, v4, v3

    rsub-int/lit8 v3, v3, 0x4

    const-string v4, "\u2a85\uf51a\ua6bf\ua528"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 160
    invoke-static {v2, v1, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x2

    const-string v2, "\ud5ab\u5304\ua0fd\u00ab"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x8

    rsub-int/lit8 v1, v1, 0x4

    const-string v2, "\u71b8\ucc0c\udb20\uf62d"

    invoke-static {v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 167
    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x18

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 169
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    long-to-int v1, v1

    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ:I

    .line 170
    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xc

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    long-to-int v1, v1

    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ:I

    .line 171
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    long-to-int v1, v1

    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ:I

    .line 172
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    long-to-int v1, v1

    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ:I

    .line 195
    iput v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->סּ:I

    const/4 v1, 0x0

    .line 199
    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->爫:Ljava/util/List;

    .line 200
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->リ:Z

    return-void
.end method

.method private Ύ()Lorg/json/JSONObject;
    .locals 5

    const/4 v0, 0x2

    .line 302
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    .line 295
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    rsub-int v3, v3, 0xce3

    const-string v4, "\uc3fe\ucf0c\uda25\ue54b\uf066\u838a\u8eb9\u9997\ua4f7\ub016\u4331\u4e25\u594d"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﾇ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 298
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 302
    :catch_0
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v3, v3, 0x15

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_1

    const/16 v0, 0x2e

    div-int/2addr v0, v2

    :cond_1
    return-object v1
.end method

.method private Ⅽ()I
    .locals 4

    const/4 v0, 0x2

    .line 533
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const-string v2, "\uc3e1\u9b10\u721e\uc903"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v3

    add-int/lit8 v3, v3, 0x1e

    rsub-int v3, v3, 0x6afb

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    :goto_0
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit16 v3, v3, 0x58ff

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    goto :goto_0

    :goto_1
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0x29

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method private declared-synchronized Ↄ()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 400
    :try_start_0
    rem-int v1, v0, v0

    .line 399
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 400
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;

    invoke-direct {v2, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    rem-int v1, v0, v0

    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    const/16 v0, 0x44

    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method static synthetic ﱟ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)I
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ⅽ()I

    move-result p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method

.method static synthetic ﱡ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Landroid/os/Handler;
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    if-nez v1, :cond_0

    add-int/lit8 v2, v2, 0x49

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method static synthetic ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)I
    .locals 4

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v1, 0x77

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->סּ:I

    iput v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->סּ:I

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->סּ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->סּ:I

    :goto_0
    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 p0, v1, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    return v2
.end method

.method static synthetic ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/av;
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮌ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

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

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->乁:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v11, v9, 0x5

    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ト:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    sub-int/2addr v8, v10

    int-to-char v8, v8

    aput-char v8, v4, v6

    add-int v10, v8, v5

    shl-int/lit8 v11, v8, 0x4

    .line 1122
    sget-char v12, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ヮ:C

    add-int/2addr v11, v12

    xor-int/2addr v10, v11

    ushr-int/lit8 v8, v8, 0x5

    sget-char v11, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ヶ:C

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

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ↄ()V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p0, p0, 0x3f

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p0, v0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method static synthetic ﻐ(Lorg/json/JSONObject;J)V
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-static {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Lorg/json/JSONObject;J)V

    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p0, p0, 0x27

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)Lcom/ironsource/adqualitysdk/sdk/i/av;
    .locals 4

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x79

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮌ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    add-int/lit8 v1, v1, 0x59

    rem-int/lit16 p0, v1, 0x80

    sput p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;
    .locals 4

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x49

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮉ:Ljava/util/List;

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    return-object p0
.end method

.method private static ﻛ(Lorg/json/JSONObject;)Z
    .locals 4

    const/4 v0, 0x2

    .line 660
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x61

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const v1, 0x90c5

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v3

    add-int/2addr v3, v1

    const-string v1, "\uc3f8\u533b\ue267\u71aa\u80ec\u1026"

    invoke-static {v1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0x37

    div-int/2addr v0, v2

    :cond_0
    return p0
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/ar$c;
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭖ:Lcom/ironsource/adqualitysdk/sdk/i/ar$c;

    if-nez v1, :cond_0

    const/16 v0, 0x2e

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method

.method private static ｋ(Lorg/json/JSONObject;)V
    .locals 8

    const/4 v0, 0x2

    .line 664
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x37

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const-wide/16 v2, -0x1

    const v4, 0x90c4

    const-string v5, "\uc3f8\u533b\ue267\u71aa\u80ec\u1026"

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v6

    if-nez v1, :cond_0

    cmp-long v1, v6, v2

    rem-int/2addr v4, v1

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ﾒ(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    goto :goto_1

    :cond_0
    cmp-long v1, v6, v2

    add-int/2addr v1, v4

    invoke-static {v5, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p0, p0, 0x69

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p0, v0

    return-void
.end method

.method private static ﾇ(Ljava/lang/String;I)Ljava/lang/String;
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

    sget-wide v4, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->丫:J

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

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;
    .locals 4

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x63

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭸ:Ljava/util/List;

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/16 v0, 0xe

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object p0
.end method

.method private static ﾇ(Lorg/json/JSONObject;J)V
    .locals 7

    const/4 v0, 0x2

    .line 581
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const-wide/16 v2, 0x0

    const-string v4, "\u8d86\u2a94\u97e0\uc6a2"

    if-eqz v1, :cond_0

    .line 577
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    cmp-long v1, v5, v2

    add-int/lit8 v1, v1, 0x4

    invoke-static {v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    cmp-long v1, v5, v2

    add-int/2addr v1, v0

    invoke-static {v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 579
    :goto_0
    :try_start_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    rsub-int/lit8 v1, v1, 0x3

    invoke-static {v4, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    .line 580
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x2

    div-long/2addr p1, v4

    add-long/2addr v2, p1

    .line 579
    invoke-virtual {p0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 581
    :catch_0
    :cond_1
    sget p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p0, p0, 0x63

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p0, v0

    return-void
.end method

.method private ﾒ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/au;
    .locals 4

    const/4 v0, 0x2

    .line 672
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const/4 v3, 0x0

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    .line 669
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﾇ()Ljava/util/Map;

    move-result-object v0

    .line 670
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/adqualitysdk/sdk/i/au;

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x21

    .line 668
    rem-int/lit16 p1, v2, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    return-object v3

    :cond_1
    throw v3
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Lcom/ironsource/adqualitysdk/sdk/i/je;
    .locals 3

    const/4 v0, 0x2

    .line 129
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method


# virtual methods
.method public final へ()I
    .locals 4

    const/4 v0, 0x2

    .line 529
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x3

    const-string v3, "\uba2f\u8f26\u7191\u4049"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0x4d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    return v1
.end method

.method public final ゥ()I
    .locals 5

    const/4 v0, 0x2

    .line 525
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const-string v2, ""

    const-string v3, "\ueaf3\u7824\u7191\u4049"

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v0

    const/16 v1, 0x34

    invoke-static {v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    const/4 v2, 0x4

    shl-int v1, v2, v1

    invoke-static {v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/16 v4, 0x30

    invoke-static {v2, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ:I

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ト()Lcom/ironsource/adqualitysdk/sdk/i/iv;
    .locals 4

    monitor-enter p0

    const/4 v0, 0x2

    .line 268
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x5f

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    monitor-exit p0

    return-object v2

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public final リ()Z
    .locals 4

    const/4 v0, 0x2

    .line 649
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    const-string v3, "\u71b8\ucc0c\udb20\uf62d"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0x65

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    return v1
.end method

.method public final ヮ()Z
    .locals 4

    const/4 v0, 0x2

    .line 608
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const-string v0, "\u2a85\uf51a\ua6bf\ua528"

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    add-int/lit8 v2, v2, -0x34

    const/4 v3, 0x5

    shl-int v2, v3, v2

    :goto_0
    invoke-static {v0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit8 v2, v2, 0x4

    goto :goto_0
.end method

.method public final ヶ()J
    .locals 5

    const/4 v0, 0x2

    .line 644
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    .line 639
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    const/16 v2, 0x30

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static {v4, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/lit8 v2, v2, 0x26

    const-string v3, "\u06d5\udeb7\u6d0f\uda75\uf28d\u38af\u34cb\u59bb\u6678\u6da7\u0682\u797d\uc4c7\u1722\u1c41\u408b\u0c9d\uafe3\u86a3\u9acb\uc7a2\u71d8\u7b96\u8fcb\u2f4d\ueb1f\u62a7\u177a\u6b64\ub023\ua2b6\u172e\u8d86\u2a94\ud519\u4e75\u09a9\u598a"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﾇ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 641
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 642
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 644
    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v3, v3, 0x4d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v3, v0

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final 丫()I
    .locals 3

    .line 613
    monitor-enter p0

    .line 614
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "\ud5ab\u5304\ua0fd\u00ab"

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    shr-int/lit8 v2, v2, 0x16

    rsub-int/lit8 v2, v2, 0x3

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .line 615
    monitor-exit p0

    throw v0
.end method

.method public final 乁()Ljava/util/List;
    .locals 4

    const/4 v0, 0x2

    .line 603
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 595
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->爫:Ljava/util/List;

    if-nez v1, :cond_0

    .line 596
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int v2, v2, 0x2c23

    const-string v3, "\uc3ed\uefdb\u9bbe\u4787"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$7;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$7;-><init>()V

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ﻐ(Lorg/json/JSONArray;Lcom/ironsource/adqualitysdk/sdk/i/kd$b;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->爫:Ljava/util/List;

    .line 595
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x5

    div-int/lit8 v0, v0, 0x4

    .line 603
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->爫:Ljava/util/List;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 595
    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final 爫()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x2

    .line 627
    rem-int v1, v0, v0

    .line 623
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x43

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 619
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 621
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    add-int/lit16 v3, v3, 0x5134

    const-string v4, "\uc3e8\u92cd\u6182\u3067"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 622
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 627
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 623
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/aw;->ﱡ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/aw;->ﱡ()Ljava/lang/String;

    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2

    :cond_1
    return-object v1

    :cond_2
    return-object v2

    .line 619
    :cond_3
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    throw v2
.end method

.method public final ﬤ()Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x2

    .line 635
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x41

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    .line 631
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 633
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/aw;->ﻏ()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 635
    :cond_0
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized טּ()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 257
    :try_start_0
    rem-int v1, v0, v0

    .line 255
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 256
    iput-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    .line 257
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$2;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    const/16 v0, 0x4e

    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final סּ()I
    .locals 5

    const/4 v0, 0x2

    .line 509
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const-string v2, ""

    const-string v3, "\u2a85\uf51a\ue217\u9ca2"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x1

    invoke-static {v2, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v2

    const/4 v4, 0x5

    shl-int v2, v4, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v2, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x4

    :goto_0
    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0xb

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    return v1
.end method

.method public final ףּ()I
    .locals 4

    const/4 v0, 0x2

    .line 505
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v2

    const v3, 0x887b

    add-int/2addr v2, v3

    const-string v3, "\uc3ef\u4b90\ud316\u5a89"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v2, 0x2d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public final ﭖ()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x2

    .line 587
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const v2, 0xde59

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static {v3, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    add-int/2addr v3, v2

    const-string v2, "\uc3e9\u1dbb\u7f48"

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﭴ()Lcom/ironsource/adqualitysdk/sdk/i/aq;
    .locals 4

    const/4 v0, 0x2

    .line 243
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x49

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/aq;

    const/16 v3, 0x35

    div-int/lit8 v3, v3, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/aq;

    :goto_0
    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﭸ()Lcom/ironsource/adqualitysdk/sdk/i/as;
    .locals 4

    const/4 v0, 0x2

    .line 239
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻏ:Lcom/ironsource/adqualitysdk/sdk/i/as;

    add-int/lit8 v2, v2, 0x21

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    return-object v1
.end method

.method public final ﮉ()Lcom/ironsource/adqualitysdk/sdk/i/ax;
    .locals 4

    const/4 v0, 0x2

    .line 235
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/ax;

    add-int/lit8 v2, v2, 0x3d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    const/16 v0, 0x31

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return-object v1
.end method

.method public final ﮌ()Lcom/ironsource/adqualitysdk/sdk/i/ap;
    .locals 4

    const/4 v0, 0x2

    .line 247
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v1, 0x43

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭴ:Lcom/ironsource/adqualitysdk/sdk/i/ap;

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    return-object v2
.end method

.method public final ﮐ()D
    .locals 5

    const/4 v0, 0x2

    .line 474
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x4

    const-string v3, "\u86df\u259d\uf672\u69ad"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v3, v3, 0x79

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_0

    return-wide v1

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﱟ()D
    .locals 5

    const/4 v0, 0x2

    .line 470
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const v3, 0x9991

    add-int/2addr v2, v3

    const-string v3, "\uc3f8\u5a78\uf0de"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    sget v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v3, v3, 0x23

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v3, v0

    return-wide v1
.end method

.method public final ﱡ()Z
    .locals 4

    const/4 v0, 0x2

    .line 251
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v1, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->טּ:Z

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    return v2

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﺙ()I
    .locals 4

    const/4 v0, 0x2

    .line 501
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 497
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x7280

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 499
    :goto_0
    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/aw;->ﺙ()I

    move-result v1

    .line 498
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    return v1

    :cond_2
    const/16 v0, 0xbb8

    return v0
.end method

.method public final declared-synchronized ﻏ()Z
    .locals 4

    monitor-enter p0

    const/4 v0, 0x2

    .line 287
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v1, 0x6b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    iget-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﬤ:Z

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v2

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ﻐ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 565
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    .line 561
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/au;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 563
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/au;->ﾇ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 565
    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p1, p1, 0x25

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p1, v0

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const/16 p1, 0x29

    div-int/lit8 p1, p1, 0x0

    :cond_1
    return-object v0
.end method

.method public final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V
    .locals 3

    const/4 v0, 0x2

    .line 453
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    .line 452
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 453
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;

    invoke-direct {v2, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 452
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p1, v0

    :cond_0
    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method

.method public final ﻛ(J)V
    .locals 8

    const/4 v0, 0x2

    .line 655
    rem-int v1, v0, v0

    .line 653
    iget-boolean v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->リ:Z

    if-nez v1, :cond_1

    .line 655
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x79

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const/4 v2, 0x1

    const-string v3, "\u06d5\udeb7\u6d0f\uda75\uf28d\u38af\u34cb\u59bb\u6678\u6da7\u0682\u797d\uc4c7\u1722\u1c41\u408b\u0c9d\uafe3\u86a3\u9acb\uc7a2\u71d8\u7b96\u8fcb\u2f4d\ueb1f\u62a7\u177a\u6b64\ub023\ua2b6\u172e\u8d86\u2a94\ud519\u4e75\u09a9\u598a"

    if-eqz v1, :cond_0

    .line 654
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    cmp-long v4, v4, v6

    rsub-int/lit8 v4, v4, 0x5e

    :goto_0
    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﻛ(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    iput-boolean v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->リ:Z

    goto :goto_1

    .line 654
    :cond_0
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    add-int/lit8 v4, v4, 0x24

    goto :goto_0

    .line 655
    :cond_1
    :goto_1
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p1, p1, 0x17

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_2

    const/16 p1, 0x55

    div-int/lit8 p1, p1, 0x0

    :cond_2
    return-void
.end method

.method public final ﻛ(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;Z)V
    .locals 7

    const/4 v0, 0x2

    .line 327
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x65

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/16 v1, 0x1b

    .line 306
    div-int/2addr v1, v2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    .line 307
    :goto_0
    new-instance p3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$4;

    invoke-direct {p3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)V

    .line 316
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ףּ()I

    move-result v1

    int-to-long v3, v1

    .line 307
    invoke-static {p3, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iu;J)V

    .line 319
    :cond_1
    invoke-virtual {p0, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ(Z)V

    .line 320
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 322
    :try_start_0
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/jp;

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ヶ()J

    move-result-wide v3

    invoke-direct {v1, p1, p2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jp;-><init>(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;J)V

    .line 323
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ト()Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﻐ()Z

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jp;->ﻐ(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;

    move-result-object p3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 325
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int v2, v2, 0x5975

    const-string v3, "\uc3de\u9a9c\u710b\ucfbc\ua62c\u7ca0\udb71\ub1d0\u084a\ue6f7\ubd77\u1bec"

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    add-int/lit8 v3, v3, 0x19

    const-string v4, "\u6ba2\u4902\ub593\u5611\udbce\ud057\ueaf3\u7824\uf6c2\u0d91\u5ff3\u0180\u6d0f\uda75\u9c66\u14c6\u0682\u797d\u91e7\u83ee\u0e47\u6962\u86af\u615e\u7191\u4049"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/ironsource/adqualitysdk/sdk/i/n;->ﻐ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    :goto_1
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ト()Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ףּ:Lcom/ironsource/adqualitysdk/sdk/i/an;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    add-int/lit8 v3, v3, 0x3

    const-string v4, "\uea4d\uc7b1\u58f6\u28d1"

    invoke-static {v4, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/an;->ｋ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;

    invoke-direct {v3, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/ao;)V

    invoke-virtual {v1, v2, p3, v3}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ﾇ(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p1, p1, 0x79

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V
    .locals 3

    const/4 v0, 0x2

    .line 438
    rem-int v1, v0, v0

    .line 437
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 438
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$10;

    invoke-direct {v2, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$10;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p1, p1, 0x43

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p1, v0

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p1, p1, 0x61

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)V
    .locals 3

    const/4 v0, 0x2

    .line 291
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->っ()Lcom/ironsource/adqualitysdk/sdk/i/aw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/aw;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)V

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final ﻛ()Z
    .locals 5

    const/4 v0, 0x2

    .line 466
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x2d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const-string v2, "\uc3e9\uc3b9\uc359"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v3

    shl-int/lit8 v3, v3, 0x6a

    const/16 v4, 0x26

    ushr-int v3, v4, v3

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    :goto_0
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x53

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    goto :goto_0

    :goto_1
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v2, 0xf

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    return v1
.end method

.method public final ｋ()Z
    .locals 4

    const/4 v0, 0x2

    .line 513
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x73

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    const v0, 0x8e15

    const-string v2, "\uc3fe\u4dfd\udfc3"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    div-int/lit8 v3, v3, 0x56

    rem-int/2addr v0, v3

    invoke-static {v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    sub-int/2addr v0, v3

    invoke-static {v2, v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    goto :goto_0
.end method

.method public final ﾇ()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/adqualitysdk/sdk/i/au;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 552
    rem-int v1, v0, v0

    .line 537
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 539
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "\uc3e8\udf0e\ufa3d"

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    rsub-int v4, v4, 0x1ce2

    invoke-static {v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 540
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 541
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 542
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$9;

    invoke-direct {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$9;-><init>()V

    invoke-static {v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/kd;->ｋ(Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/kd$a;)Ljava/util/Map;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    :cond_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v2, 0x27

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 550
    const-string v3, ""

    const/4 v4, 0x0

    invoke-static {v3, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v5

    add-int/lit16 v5, v5, 0x5975

    const-string v6, "\uc3de\u9a9c\u710b\ucfbc\ua62c\u7ca0\udb71\ub1d0\u084a\ue6f7\ubd77\u1bec"

    invoke-static {v6, v5}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1f

    const-string v6, "\u6ba2\u4902\ub593\u5611\udbce\ud057\uea4d\uc7b1\ub940\ue1c3\u1c09\u0e45\u5f52\u6957\u6c16\u4712\u370f\ua093\u7ac4\ub583\u0fb2\u11b9\uf731\u270b\u9e03\ubafe\u71b8\ucc0c\udf33\u6d8c\u8d17\u90a9"

    invoke-static {v6, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 552
    :goto_0
    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v2, v2, 0x49

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v2, v0

    if-eqz v2, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method

.method public final ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V
    .locals 3

    const/4 v0, 0x2

    .line 424
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v1, v0

    .line 423
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 424
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;

    invoke-direct {v2, p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p1, p1, 0x57

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p1, v0

    if-eqz p1, :cond_1

    const/16 p1, 0x53

    div-int/lit8 p1, p1, 0x0

    :cond_1
    return-void
.end method

.method public final ﾇ(Lorg/json/JSONObject;)V
    .locals 3

    const/4 v0, 0x2

    .line 395
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    .line 394
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 395
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ↄ()V

    return-void

    .line 394
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 395
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ↄ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ﾇ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x2

    .line 557
    rem-int v1, v0, v0

    .line 556
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾒ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/au;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 557
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    invoke-virtual {p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/au;->ﻛ(Ljava/lang/String;)Z

    move-result p1

    if-nez v1, :cond_0

    const/16 p2, 0x47

    div-int/2addr p2, v2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    :goto_0
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p1, p1, 0x3b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p1, v0

    return v2

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ﾒ(Landroid/content/Context;Lcom/ironsource/adqualitysdk/sdk/i/iv;Lcom/ironsource/adqualitysdk/sdk/i/an;Lcom/ironsource/adqualitysdk/sdk/i/ar$c;Z)V
    .locals 6

    const/4 v0, 0x2

    .line 225
    rem-int v1, v0, v0

    .line 207
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/je;

    const v2, 0xcdbb

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    sub-int/2addr v2, v4

    const-string v4, "\uc3f8\u0e45\u589b\uaade\uf505\uc749\u118f\u63f2\uae3f\uf831\ucaa9\u14f3\u6766\ub197\u83d4\uce57\u184e\u6a82\ub4c7\u8702\ud164\u23be\u6dfd\ub82e\u8a6a\ud4a9\u271b\u7152"

    invoke-static {v4, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const-string v4, ""

    invoke-static {v4, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x14

    const-string v5, "\u61aa\u665d\u094b\udc09\u1567\u0a3e\ub104\u6516\u370f\ua093\u2769\ueafb\u88a1\u44db\u3ed5\uef39\ubee3\ue47a\u3c29\u8808"

    invoke-static {v5, v4}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, p1, v2, v4}, Lcom/ironsource/adqualitysdk/sdk/i/je;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/je;

    .line 208
    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱡ:Lcom/ironsource/adqualitysdk/sdk/i/iv;

    .line 209
    iput-boolean v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﬤ:Z

    .line 210
    iput-boolean p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->טּ:Z

    .line 212
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ףּ:Lcom/ironsource/adqualitysdk/sdk/i/an;

    .line 214
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﺙ:Landroid/os/Handler;

    .line 215
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/aw;

    invoke-direct {p1}, Lcom/ironsource/adqualitysdk/sdk/i/aw;-><init>()V

    .line 216
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/ax;

    invoke-direct {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ax;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/aw;)V

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/ax;

    .line 217
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/as;

    invoke-direct {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/as;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/aw;)V

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻏ:Lcom/ironsource/adqualitysdk/sdk/i/as;

    .line 218
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/aq;

    invoke-direct {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/aq;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/aw;)V

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/aq;

    .line 219
    new-instance p2, Lcom/ironsource/adqualitysdk/sdk/i/ap;

    invoke-direct {p2}, Lcom/ironsource/adqualitysdk/sdk/i/ap;-><init>()V

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭴ:Lcom/ironsource/adqualitysdk/sdk/i/ap;

    .line 220
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->Ύ()Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 221
    invoke-virtual {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/aw;)V

    .line 222
    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭖ:Lcom/ironsource/adqualitysdk/sdk/i/ar$c;

    .line 224
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮉ:Ljava/util/List;

    .line 225
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭸ:Ljava/util/List;

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 p1, p1, 0x3f

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr p1, v0

    return-void
.end method

.method public final declared-synchronized ﾒ(Lorg/json/JSONObject;)V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 279
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x13

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 272
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Lorg/json/JSONObject;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 273
    :cond_0
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ｋ(Lorg/json/JSONObject;)V

    .line 275
    :goto_0
    invoke-super {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﾒ(Lorg/json/JSONObject;)V

    .line 276
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﮐ:Lcom/ironsource/adqualitysdk/sdk/i/ax;

    invoke-virtual {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 277
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻏ:Lcom/ironsource/adqualitysdk/sdk/i/as;

    invoke-virtual {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 278
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﱟ:Lcom/ironsource/adqualitysdk/sdk/i/aq;

    invoke-virtual {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 279
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﭴ:Lcom/ironsource/adqualitysdk/sdk/i/ap;

    invoke-virtual {v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->ﾒ(Lorg/json/JSONObject;)V

    .line 272
    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 p1, p1, 0x29

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr p1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez p1, :cond_1

    .line 279
    monitor-exit p0

    return-void

    .line 272
    :cond_1
    :try_start_1
    invoke-super {v2}, Ljava/lang/Object;->hashCode()I

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_2
    throw p1

    :cond_2
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Lorg/json/JSONObject;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 279
    :try_start_4
    throw p1

    :catchall_2
    move-exception p1

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public final declared-synchronized ﾒ(Z)V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x2

    .line 283
    :try_start_0
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x61

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﬤ:Z

    add-int/lit8 v2, v2, 0x39

    rem-int/lit16 p1, v2, 0x80

    sput p1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ﾒ()Z
    .locals 4

    const/4 v0, 0x2

    .line 521
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$3;->く()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    const v3, 0xff2b

    sub-int/2addr v3, v2

    const-string v2, "\uc3fe\u3cc1\u3db9\u3e6c"

    invoke-static {v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sget v2, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->へ:I

    add-int/lit8 v2, v2, 0x7b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->く:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method
