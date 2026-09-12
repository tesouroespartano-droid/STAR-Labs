.class final Lcom/ironsource/adqualitysdk/sdk/i/at$9;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/at;->ｋ(Landroid/content/Context;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

.field private synthetic ﻛ:Landroid/content/Context;

.field final synthetic ﾇ:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/at;Ljava/lang/Runnable;Landroid/content/Context;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$9;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$9;->ﾇ:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$9;->ﻛ:Landroid/content/Context;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 98
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/at$9$1;

    invoke-direct {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/at$9$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/at$9;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    .line 104
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$9;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/at;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$9;->ﻛ:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/at;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/at;Landroid/content/Context;)V

    return-void
.end method
