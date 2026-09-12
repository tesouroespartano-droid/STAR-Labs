.class final Lcom/ironsource/adqualitysdk/sdk/i/cf$14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﾇ()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/cf;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$14;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﾒ(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/cl;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/ironsource/adqualitysdk/sdk/i/cl;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cf$14;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/cf;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/cf;->ﻐ(Ljava/lang/Object;Lcom/ironsource/adqualitysdk/sdk/i/cl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
