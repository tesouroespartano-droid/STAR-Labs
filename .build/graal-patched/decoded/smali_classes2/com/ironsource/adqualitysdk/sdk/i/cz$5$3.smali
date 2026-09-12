.class final Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cz$5;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hl;Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Landroid/media/MediaPlayer;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hl;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$5;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cz$5;Lcom/ironsource/adqualitysdk/sdk/i/hl;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$5;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hl;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ﻛ:Landroid/media/MediaPlayer;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 334
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/cz$5;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hl$b;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/hl;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$5$3;->ﻛ:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/hl$b;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hl;Landroid/media/MediaPlayer;)V

    return-void
.end method
