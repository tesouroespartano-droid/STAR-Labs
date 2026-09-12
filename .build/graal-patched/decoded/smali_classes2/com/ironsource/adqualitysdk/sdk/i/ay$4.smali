.class final Lcom/ironsource/adqualitysdk/sdk/i/ay$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Z

.field private synthetic ﻛ:Ljava/lang/String;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ay;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ay;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/cp;Z)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ay;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﻛ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    iput-boolean p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﻐ:Z

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ay;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﻛ:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ay;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ay;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cp;

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/bb;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/cp;)V

    :cond_0
    return-void
.end method
