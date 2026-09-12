.class final Lcom/ironsource/adqualitysdk/sdk/i/ay$1;
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
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bb$e;

.field private synthetic ﾇ:Ljava/lang/String;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ay;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ay;Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/i/bb$e;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ay;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﾇ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bb$e;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ay;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﾇ:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ay;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ay;Ljava/lang/String;)Lcom/ironsource/adqualitysdk/sdk/i/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ay$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/bb$e;

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/bb;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/bb$e;)V

    :cond_0
    return-void
.end method
