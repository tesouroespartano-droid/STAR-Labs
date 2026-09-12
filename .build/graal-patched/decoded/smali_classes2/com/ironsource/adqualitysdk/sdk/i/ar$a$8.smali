.class final Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/av;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 456
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)Lcom/ironsource/adqualitysdk/sdk/i/av;

    .line 457
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻏ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$8;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-interface {v0}, Lcom/ironsource/adqualitysdk/sdk/i/av;->ｋ()V

    :cond_0
    return-void
.end method
