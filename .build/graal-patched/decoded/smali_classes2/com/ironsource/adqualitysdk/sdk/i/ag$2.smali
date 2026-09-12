.class Lcom/ironsource/adqualitysdk/sdk/i/ag$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/af$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﾇ(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

.field final synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

.field final synthetic ﾇ:Lorg/json/JSONArray;

.field final synthetic ﾒ:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ag;Lorg/json/JSONArray;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﾇ:Lorg/json/JSONArray;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﾒ:Ljava/util/List;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventGenerated(Lorg/json/JSONObject;)V
    .locals 3

    .line 484
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/ah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/ah;->ｋ(Lorg/json/JSONObject;)Z

    .line 485
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->爫(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﮉ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Lcom/ironsource/adqualitysdk/sdk/i/an;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ag$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ag;

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ag;->ﭴ(Lcom/ironsource/adqualitysdk/sdk/i/ag;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/an;->ﻐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;

    invoke-direct {v2, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ag$2$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ag$2;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ﾇ(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/adqualitysdk/sdk/i/iz;)V

    return-void
.end method
