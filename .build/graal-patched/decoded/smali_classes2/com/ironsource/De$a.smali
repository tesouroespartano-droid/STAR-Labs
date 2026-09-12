.class final Lcom/ironsource/De$a;
.super Lcom/ironsource/Ce;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/De;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/De;


# direct methods
.method public constructor <init>(Lcom/ironsource/De;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/De$a;->b:Lcom/ironsource/De;

    invoke-direct {p0}, Lcom/ironsource/Ce;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getMediationAdditionalData(Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 3
    :try_start_0
    const-string v1, "duration"

    invoke-virtual {p0}, Lcom/ironsource/Ce;->a()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 6
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 8
    :goto_0
    new-instance v1, Lcom/ironsource/B5;

    sget-object v2, Lcom/ironsource/C5;->f:Lcom/ironsource/C5;

    invoke-direct {v1, v2, v0}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 9
    sget-object v0, Lcom/ironsource/Wc;->P:Lcom/ironsource/Wc;

    invoke-virtual {v0, v1}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    return-void
.end method
