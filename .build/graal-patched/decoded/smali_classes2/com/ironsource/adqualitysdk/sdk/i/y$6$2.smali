.class final Lcom/ironsource/adqualitysdk/sdk/i/y$6$2;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/y$6;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y$6;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/y$6;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$6$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y$6;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$6$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y$6;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/y$6;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/y;)Lcom/ironsource/adqualitysdk/sdk/i/jg;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$6$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y$6;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/y$6;->ﻛ:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jg;->onActivityStopped(Landroid/app/Activity;)V

    return-void
.end method
