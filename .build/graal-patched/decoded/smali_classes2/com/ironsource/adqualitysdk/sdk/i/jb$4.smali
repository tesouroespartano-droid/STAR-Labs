.class final Lcom/ironsource/adqualitysdk/sdk/i/jb$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﻛ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jb;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Lcom/ironsource/adqualitysdk/sdk/i/jf;

    move-result-object v0

    if-nez v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$1;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/jb$4;)V

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/jb;Lcom/ironsource/adqualitysdk/sdk/i/jf;)Lcom/ironsource/adqualitysdk/sdk/i/jf;

    .line 66
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/jb$4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
