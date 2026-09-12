.class final Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/av;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/av;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;Lcom/ironsource/adqualitysdk/sdk/i/av;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 427
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar$a;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ar$a;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 428
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ar$a;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ar;->ﻏ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ar$a$1;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/av;

    invoke-interface {v0}, Lcom/ironsource/adqualitysdk/sdk/i/av;->ｋ()V

    :cond_0
    return-void
.end method
