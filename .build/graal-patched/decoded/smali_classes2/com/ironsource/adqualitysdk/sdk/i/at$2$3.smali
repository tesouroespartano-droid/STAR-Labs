.class final Lcom/ironsource/adqualitysdk/sdk/i/at$2$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/at$2;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$2;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/at$2;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$2$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$2;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 285
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$2$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$2;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/at$2;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﺙ(Lcom/ironsource/adqualitysdk/sdk/i/at;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/at$2$3$1;

    invoke-direct {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/at$2$3$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/at$2$3;)V

    .line 291
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->丫()I

    move-result v1

    int-to-long v1, v1

    .line 286
    invoke-static {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iu;J)V

    :cond_0
    return-void
.end method
