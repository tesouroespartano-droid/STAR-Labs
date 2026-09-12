.class final Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cz$1;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/he;Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/he;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cz$1;

.field private synthetic ﾇ:Landroid/media/MediaPlayer;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cz$1;Lcom/ironsource/adqualitysdk/sdk/i/he;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cz$1;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/he;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ﾇ:Landroid/media/MediaPlayer;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 355
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cz$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/he$c;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/he;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$1$4;->ﾇ:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/he$c;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/he;Landroid/media/MediaPlayer;)V

    return-void
.end method
