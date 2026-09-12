.class Lcom/ironsource/adqualitysdk/sdk/i/t$3$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/ai;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/t$3;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventReceived(Lorg/json/JSONObject;)V
    .locals 3

    .line 288
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/t$3$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/t$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/t$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/t;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/t;->ﻏ(Lcom/ironsource/adqualitysdk/sdk/i/t;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ij;->Ṿ:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 1026
    invoke-static {v0, v1, p1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/in;->ｋ(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;[Ljava/lang/Object;)V

    return-void
.end method
