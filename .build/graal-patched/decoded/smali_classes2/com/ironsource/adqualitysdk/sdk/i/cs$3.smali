.class final Lcom/ironsource/adqualitysdk/sdk/i/cs$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/ip;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cs;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dq;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/du;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/du;Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 76
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 77
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cs$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-virtual {p2, v0, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻛ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    return-object p1
.end method
