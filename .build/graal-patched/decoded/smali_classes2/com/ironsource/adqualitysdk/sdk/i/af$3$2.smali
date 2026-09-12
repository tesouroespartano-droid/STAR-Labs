.class final Lcom/ironsource/adqualitysdk/sdk/i/af$3$2;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/af$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/af$3;

.field private synthetic ﾒ:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/af$3;Lorg/json/JSONObject;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/af$3$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/af$3;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/af$3$2;->ﾒ:Lorg/json/JSONObject;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/af$3$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/af$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/af$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/af$c;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/af$3$2;->ﾒ:Lorg/json/JSONObject;

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/af$c;->onEventGenerated(Lorg/json/JSONObject;)V

    return-void
.end method
