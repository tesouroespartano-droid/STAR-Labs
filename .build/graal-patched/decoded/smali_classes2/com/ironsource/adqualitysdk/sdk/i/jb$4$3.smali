.class final Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb$4;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jb$4;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb$4;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 69
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/jj;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/jj;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb$4;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/jb$4;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Lcom/ironsource/adqualitysdk/sdk/i/jf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jj;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jg;)V

    .line 70
    new-instance v0, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3$4;

    invoke-direct {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3$4;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/jb$4$3;)V

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void
.end method
