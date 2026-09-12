.class final Lcom/ironsource/adqualitysdk/sdk/i/co$9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/it;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/co;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/co;Lcom/ironsource/adqualitysdk/sdk/i/du;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$9;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$9;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﾒ(Landroid/view/View;)Z
    .locals 3

    .line 295
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$9;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$9;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/co;)Lcom/ironsource/adqualitysdk/sdk/i/dq;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$9;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    move-result-object p1

    .line 296
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/dr;->ﻐ()Z

    move-result p1

    return p1
.end method
