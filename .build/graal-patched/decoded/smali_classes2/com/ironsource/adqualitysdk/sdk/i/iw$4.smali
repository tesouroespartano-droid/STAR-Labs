.class final Lcom/ironsource/adqualitysdk/sdk/i/iw$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﮐ:C = '\u0006'

.field private static ﱟ:I = 0x1

.field private static ﺙ:[C

.field private static ﻏ:I


# instance fields
.field private synthetic ﻐ:Ljava/lang/String;

.field private synthetic ﻛ:Ljava/lang/String;

.field final synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/io;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x24

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﺙ:[C

    return-void

    :array_0
    .array-data 2
        0x55s
        0x53s
        0x2ds
        0x41s
        0x43s
        0x49s
        0x52s
        0x65s
        0x6ds
        0x6fs
        0x74s
        0x44s
        0x42s
        0x63s
        0x72s
        0x79s
        0x70s
        0x64s
        0x20s
        0x73s
        0x69s
        0x6es
        0x67s
        0x66s
        0x61s
        0x76s
        0x6cs
        0x68s
        0x2fs
        0x45s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x5bs
    .end array-data
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/iw;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/jc;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻐ:Ljava/lang/String;

    iput-object p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/io;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method

.method private ﻐ(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/jc;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v4, p4

    const-string v5, "\u0007\u0008\t\n\u000b\u0008\u0006\u0011"

    const-string v6, ""

    const/4 v7, 0x2

    .line 161
    rem-int v8, v7, v7

    .line 124
    iget-object v8, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v8}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v8

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v8

    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﻐ()Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_1

    .line 154
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v0, v0, 0x47

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/2addr v0, v7

    if-nez v0, :cond_0

    .line 125
    invoke-direct {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    const/16 v0, 0x25

    div-int/2addr v0, v9

    return-void

    :cond_0
    invoke-direct {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    return-void

    :cond_1
    const-wide/16 v10, 0x0

    .line 130
    :try_start_0
    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/iy;->ｋ(Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/ir;

    move-result-object v8

    const/4 v12, 0x0

    const-wide/16 v13, -0x1

    if-eqz v8, :cond_3

    .line 131
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v15

    move/from16 v16, v7

    const/16 v7, 0xc8

    if-ne v15, v7, :cond_4

    .line 132
    invoke-static {v8}, Lcom/ironsource/adqualitysdk/sdk/i/iy;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)Ljava/lang/String;

    move-result-object v7

    .line 133
    invoke-static {v7}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﾒ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 135
    const-string v8, "\u0001\u0002\u0003\u0004\u0002\u0005\u00b2\u00b2"

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v15

    shr-int/lit8 v15, v15, 0x10

    rsub-int/lit8 v15, v15, 0x69

    int-to-byte v15, v15

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v16
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    cmp-long v16, v16, v10

    move-wide/from16 v17, v10

    add-int/lit8 v10, v16, 0x7

    :try_start_1
    invoke-static {v8, v15, v10}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v8

    invoke-virtual {v8}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 136
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v7

    cmp-long v0, v7, v13

    rsub-int/lit8 v0, v0, 0x50

    int-to-byte v0, v0

    const/16 v7, 0x30

    invoke-static {v6, v7, v9, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v8

    rsub-int/lit8 v8, v8, 0x7

    invoke-static {v5, v0, v8}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\u0006\u0008\u000e\u000f\u0010\u0011\u000b\u0008\u000c\u0017\u0016\u0007\u0014\u001a\u0016\u0017\u0013\u0012\u000f\u0008\u0006\u0014"

    invoke-static {v9}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    add-int/lit8 v11, v11, 0x11

    int-to-byte v11, v11

    invoke-static {v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x16

    invoke-static {v10, v11, v6}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "\u0013\u000c\u000f\u001b\u0006\u001c\u0015\u0016\u0014\u0013\u0015\u0016\u001a\u0019 \u001a\u000c\u0017\u000f\u0019\u001a\u000cs"

    invoke-static {v9}, Landroid/graphics/Color;->green(I)I

    move-result v10

    int-to-byte v10, v10

    invoke-static {v7}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v7

    rsub-int/lit8 v7, v7, 0x47

    invoke-static {v8, v10, v7}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6, v12, v9}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void

    .line 137
    :cond_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 138
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/je;

    move-result-object v6

    invoke-virtual {v6, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ﻐ(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    new-instance v6, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$4;

    invoke-direct {v6, v4, v0, v7}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/io;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void

    :cond_3
    move/from16 v16, v7

    :cond_4
    move-wide/from16 v17, v10

    .line 148
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﻐ()Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v6, 0x1

    if-eq v0, v6, :cond_5

    .line 151
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v6, v0, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/lit8 v0, v0, 0x2

    .line 149
    :try_start_2
    invoke-direct {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    return-void

    .line 150
    :cond_5
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/16 v7, 0x193

    if-eq v0, v7, :cond_9

    .line 161
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v7, v0, 0x80

    sput v7, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_7

    .line 151
    :try_start_3
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v0

    const/16 v7, 0x6234

    if-ne v0, v7, :cond_6

    goto :goto_0

    :cond_6
    return-void

    :cond_7
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/i/ir;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ir$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ir$b;->ｋ()I

    move-result v0

    const/16 v7, 0x194

    if-ne v0, v7, :cond_8

    goto :goto_0

    :cond_8
    return-void

    :cond_9
    :goto_0
    const-string v0, "\t\u0013\u001a\u001d"

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v7

    cmp-long v7, v7, v13

    add-int/lit8 v7, v7, 0x49

    int-to-byte v7, v7

    invoke-static {v9, v9, v9}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v8

    rsub-int/lit8 v8, v8, 0x4

    invoke-static {v0, v7, v8}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    xor-int/2addr v0, v6

    if-eq v0, v6, :cond_c

    .line 151
    sget v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    add-int/lit8 v0, v0, 0x3b

    rem-int/lit16 v6, v0, 0x80

    sput v6, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_a

    .line 153
    :try_start_4
    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/jc;->ｋ()V

    .line 154
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-virtual {v0, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)Ljava/lang/String;

    return-void

    .line 153
    :cond_a
    invoke-virtual {v3}, Lcom/ironsource/adqualitysdk/sdk/i/jc;->ｋ()V

    .line 154
    iget-object v0, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-virtual {v0, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    throw v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    .line 151
    throw v0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-wide/from16 v17, v10

    .line 158
    :goto_1
    iget-object v6, v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v6}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﻐ()Z

    move-result v6

    if-nez v6, :cond_b

    .line 159
    invoke-direct {v1, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    return-void

    .line 161
    :cond_b
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    shr-int/lit8 v3, v3, 0x16

    add-int/lit8 v3, v3, 0x4f

    int-to-byte v3, v3

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x8

    invoke-static {v5, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    cmp-long v5, v5, v17

    rsub-int/lit8 v5, v5, 0x7b

    int-to-byte v5, v5

    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x21

    const-string v7, "\u001a\u0011\u000f\u0008\u000c\u0014\u0013\n\u00ee\u00ee\u0015\u0016\u0017\u0013\r\u0008\t\n\u000b\u0008\u0013\u0000\u0008\u0010\u0015\u0016\u0017\u0013\u0014\u0011\n\t\u009a"

    invoke-static {v7, v5, v6}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2, v0, v9}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_c
    return-void
.end method

.method private ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
    .locals 3

    const/4 v0, 0x2

    .line 179
    rem-int v1, v0, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v1

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;

    invoke-direct {v2, p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/iw$4;Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/is;)V

    sget p1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 p1, p1, 0x1d

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    const/16 p1, 0x1e

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method

.method private static ｋ(Ljava/lang/String;BI)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    .line 1208
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻏ:Ljava/lang/Object;

    monitor-enter v0

    .line 1212
    :try_start_0
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﺙ:[C

    .line 1214
    sget-char v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﮐ:C

    .line 1218
    new-array v3, p2, [C

    .line 1221
    rem-int/lit8 v4, p2, 0x2

    if-eqz v4, :cond_1

    add-int/lit8 p2, p2, -0x1

    .line 1224
    aget-char v4, p0, p2

    sub-int/2addr v4, p1

    int-to-char v4, v4

    aput-char v4, v3, p2

    :cond_1
    const/4 v4, 0x1

    if-le p2, v4, :cond_5

    const/4 v5, 0x0

    .line 1229
    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    :goto_0
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    if-ge v5, p2, :cond_5

    .line 1233
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, p0, v5

    sput-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    .line 1234
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v5, p0, v5

    sput-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    .line 1237
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    if-ne v5, v6, :cond_2

    .line 1239
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    sub-int/2addr v6, p1

    int-to-char v6, v6

    aput-char v6, v3, v5

    .line 1240
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    sget-char v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    sub-int/2addr v6, p1

    int-to-char v6, v6

    aput-char v6, v3, v5

    goto/16 :goto_1

    .line 1245
    :cond_2
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    div-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    .line 1246
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻛ:C

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    .line 1247
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    div-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    .line 1248
    sget-char v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾒ:C

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    .line 1251
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    if-ne v5, v6, :cond_3

    .line 1253
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    .line 1254
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    .line 1256
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v6

    .line 1257
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v6, v7

    .line 1259
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 1260
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    goto :goto_1

    .line 1264
    :cond_3
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    if-ne v5, v6, :cond_4

    .line 1266
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    .line 1267
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v4

    rem-int/2addr v5, v2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    .line 1269
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v5, v6

    .line 1270
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v6, v7

    .line 1272
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 1273
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    goto :goto_1

    .line 1281
    :cond_4
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ｋ:I

    mul-int/2addr v5, v2

    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱟ:I

    add-int/2addr v5, v6

    .line 1282
    sget v6, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﻐ:I

    mul-int/2addr v6, v2

    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﱡ:I

    add-int/2addr v6, v7

    .line 1284
    sget v7, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    aget-char v5, v1, v5

    aput-char v5, v3, v7

    .line 1285
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/2addr v5, v4

    aget-char v6, v1, v6

    aput-char v6, v3, v5

    .line 1229
    :goto_1
    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    add-int/lit8 v5, v5, 0x2

    sput v5, Lcom/ironsource/adqualitysdk/sdk/i/f;->ﾇ:I

    goto/16 :goto_0

    .line 1291
    :cond_5
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1292
    monitor-exit v0

    throw p0
.end method

.method private static ﾒ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 175
    rem-int v1, v0, v0

    .line 167
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 168
    const-string v2, ""

    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x24

    int-to-byte v3, v3

    const/16 v4, 0x30

    const/4 v5, 0x0

    invoke-static {v2, v4, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x2

    const-string v4, "\t\u0013\u0087"

    invoke-static {v4, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 175
    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v1, v1, 0x3d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_0

    const/16 v0, 0x13

    .line 170
    div-int/2addr v0, v5

    :cond_0
    return-object p0

    .line 172
    :cond_1
    invoke-static {v5, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x15

    int-to-byte p0, p0

    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    add-int/2addr v3, v0

    const-string v4, "\u0013\u001a"

    invoke-static {v4, p0, v3}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 173
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int/lit8 v3, v3, 0x7b

    int-to-byte v3, v3

    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    const-string v5, "\u0012\u0019\u001c\u0008"

    invoke-static {v5, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ(Ljava/lang/String;BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 175
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﻛ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jv;->ﻛ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_2

    return-object p0

    :cond_2
    const/4 p0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    throw p0
.end method


# virtual methods
.method public final ﻐ()V
    .locals 5

    const/4 v0, 0x2

    .line 120
    rem-int v1, v0, v0

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    add-int/lit8 v1, v1, 0x1b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    rem-int/2addr v1, v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ:Ljava/lang/String;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻐ:Ljava/lang/String;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/io;

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻐ(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/jc;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    sget v1, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻏ:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﱟ:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    throw v0
.end method
