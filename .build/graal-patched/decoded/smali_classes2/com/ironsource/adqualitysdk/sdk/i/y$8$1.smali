.class final Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/y$8;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/y$8;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/y$8;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/y$8;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/y;)Lcom/ironsource/adqualitysdk/sdk/i/jg;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$8$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/y$8;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/y$8;->ｋ:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jg;->onActivityResumed(Landroid/app/Activity;)V

    return-void
.end method
