.class final Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cz$7;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hc;Landroid/media/MediaPlayer;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:I

.field private synthetic ﻛ:Landroid/media/MediaPlayer;

.field private synthetic ｋ:I

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$7;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hc;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cz$7;Lcom/ironsource/adqualitysdk/sdk/i/hc;Landroid/media/MediaPlayer;II)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$7;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hc;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﻛ:Landroid/media/MediaPlayer;

    iput p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﻐ:I

    iput p5, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ｋ:I

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 5

    .line 376
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$7;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hc$c;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/hc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﻛ:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ﻐ:I

    iget v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$7$5;->ｋ:I

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/hc$c;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hc;Landroid/media/MediaPlayer;II)Z

    return-void
.end method
