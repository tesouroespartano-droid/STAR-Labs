.class final Lcom/ironsource/adqualitysdk/sdk/i/jh$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﾒ(Landroid/view/ViewGroup;)Landroid/view/View$OnLayoutChangeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static ﻐ:I = 0xb7

.field private static ｋ:I = 0x1

.field private static ﾇ:I


# instance fields
.field private synthetic ﻛ:Landroid/view/ViewGroup;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jh;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/ViewGroup;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﻛ:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    sget v5, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﻐ:I

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
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 2

    const/4 p1, 0x2

    .line 140
    rem-int p2, p1, p1

    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾇ:I

    add-int/lit8 p2, p2, 0x2b

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ｋ:I

    rem-int/2addr p2, p1

    if-eqz p2, :cond_1

    .line 136
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/t;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ()Z

    move-result p2

    if-nez p2, :cond_0

    .line 138
    :try_start_0
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    iget-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﻛ:Landroid/view/ViewGroup;

    invoke-static {p2, p3, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/ViewGroup;Landroid/view/View$OnLayoutChangeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    sget p2, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ｋ:I

    add-int/lit8 p2, p2, 0x61

    rem-int/lit16 p3, p2, 0x80

    sput p3, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾇ:I

    rem-int/2addr p2, p1

    return-void

    :catchall_0
    move-exception p1

    .line 140
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result p2

    const/4 p3, 0x0

    cmpl-float p2, p2, p3

    rsub-int/lit8 p2, p2, 0x4

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide p3

    const-wide/16 p5, 0x0

    cmp-long p3, p3, p5

    rsub-int p3, p3, 0x11e

    invoke-static {p5, p6}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result p4

    rsub-int/lit8 p4, p4, 0x1a

    const-string p7, "\ufffc\t\u0006\uffe1\uffff\ufffd\u0003\u0010\u000c\uffff\uffed\u000c\uffff\u0008\uffff\u000e\r\u0003\uffe6\u0002\ufffd\u000f\t\uffee\u0006\ufffb"

    const/4 p8, 0x1

    invoke-static {p7, p2, p3, p8, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result p3

    shr-int/lit8 p3, p3, 0x10

    rsub-int/lit8 p3, p3, 0x14

    const/4 p4, 0x0

    invoke-static {p4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v0

    cmp-long p5, v0, p5

    add-int/lit16 p5, p5, 0x118

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result p6

    shr-int/lit8 p6, p6, 0x18

    rsub-int/lit8 p6, p6, 0x17

    const-string p7, "\u0000\u0007\uffe2\u0013\u0014\u000e\u0018\u0000\uffeb\r\u000e\uffbf\r\u0008\uffbf\u0011\u000e\u0011\u0011\uffe4\u0004\u0006\r"

    invoke-static {p7, p3, p5, p8, p6}, Lcom/ironsource/adqualitysdk/sdk/i/jh$2;->ﾒ(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, p1, p4}, Lcom/ironsource/adqualitysdk/sdk/i/jz;->ｋ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_0
    return-void

    .line 136
    :cond_1
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻐ()Z

    const/4 p1, 0x0

    invoke-super {p1}, Ljava/lang/Object;->hashCode()I

    throw p1
.end method
