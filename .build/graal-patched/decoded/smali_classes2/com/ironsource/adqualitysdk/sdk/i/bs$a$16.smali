.class final Lcom/ironsource/adqualitysdk/sdk/i/bs$a$16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bs$a;->ﾇ()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/bs$a;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bs$a;)V
    .locals 0

    .line 901
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bs$a$16;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/bs$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﾒ(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/cl;)Ljava/lang/Object;
    .locals 0
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

    const/4 p2, 0x0

    .line 904
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mbridge/msdk/out/RewardInfo;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/bs$a;->ﻐ(Lcom/mbridge/msdk/out/RewardInfo;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
