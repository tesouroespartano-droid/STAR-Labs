.class final Lcom/ironsource/adqualitysdk/sdk/i/y$2$2;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/y$2;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y$2;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/y$2;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$2$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y$2;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$2$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y$2;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/y$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/y;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/y;)Lcom/ironsource/adqualitysdk/sdk/i/jg;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/y$2$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/y$2;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/y$2;->ﾇ:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jg;->onActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method
