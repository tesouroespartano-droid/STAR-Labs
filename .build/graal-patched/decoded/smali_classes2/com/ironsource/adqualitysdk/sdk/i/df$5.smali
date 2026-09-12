.class final Lcom/ironsource/adqualitysdk/sdk/i/df$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/hx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/df;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cq;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

.field private synthetic ﾇ:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cq;Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cq;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﾇ:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
    .locals 4

    .line 140
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/cq;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/cm;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/df$5;->ﾇ:Ljava/util/List;

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/cm;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hr;Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Z

    move-result p1

    return p1
.end method
