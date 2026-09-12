.class final Lcom/ironsource/adqualitysdk/sdk/i/co$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/jf;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/co;->ﬤ()Lcom/ironsource/adqualitysdk/sdk/i/jf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/co;)V
    .locals 0

    .line 865
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/jf;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    .line 873
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ij;->Ῡ:Ljava/lang/String;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    const/4 v3, 0x0

    invoke-static {v2, p1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/co;Landroid/app/Activity;Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ｋ(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    .line 868
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/i/ij;->Ῠ:Ljava/lang/String;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$1;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    const/4 v3, 0x0

    invoke-static {v2, p1, v3}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/co;Landroid/app/Activity;Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ｋ(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
