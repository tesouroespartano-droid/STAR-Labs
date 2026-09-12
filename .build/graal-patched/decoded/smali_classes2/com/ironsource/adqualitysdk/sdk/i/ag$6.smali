.class Lcom/ironsource/adqualitysdk/sdk/i/ag$6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/af$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﾇ(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

.field final synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iu;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ag;Lcom/ironsource/adqualitysdk/sdk/i/iu;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$6;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$6;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventGenerated(Lorg/json/JSONObject;)V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$6;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/ah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ(Lorg/json/JSONObject;)Z

    .line 235
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$6;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/ag$6$5;

    invoke-direct {v1, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ag$6$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$6;)V

    invoke-static {v0, p1, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/ag;Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void
.end method
