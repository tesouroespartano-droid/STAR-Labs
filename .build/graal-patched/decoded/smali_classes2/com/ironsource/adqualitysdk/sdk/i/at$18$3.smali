.class final Lcom/ironsource/adqualitysdk/sdk/i/at$18$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/at$18;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$18;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/at$18;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$18$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$18;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$18$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$18;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/at$18;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$18$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$18;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/at$18;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/at;)V

    :cond_0
    return-void
.end method
