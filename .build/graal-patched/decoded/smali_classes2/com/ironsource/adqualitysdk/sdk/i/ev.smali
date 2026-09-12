.class public final Lcom/ironsource/adqualitysdk/sdk/i/ev;
.super Lcom/ironsource/adqualitysdk/sdk/i/ed;
.source ""


# instance fields
.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/en;


# direct methods
.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/en;Lcom/ironsource/adqualitysdk/sdk/i/dn;)V
    .locals 0

    .line 15
    invoke-direct {p0, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/dn;)V

    .line 16
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ev;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/en;

    return-void
.end method


# virtual methods
.method public final ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ev;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-virtual {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/ed;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object p2

    .line 22
    invoke-virtual {p2}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﾒ()Ljava/lang/Number;

    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ev;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/en;

    invoke-virtual {v1}, Lcom/ironsource/adqualitysdk/sdk/i/en;->ﻐ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/ironsource/adqualitysdk/sdk/i/dq;->ﾇ(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p2
.end method
