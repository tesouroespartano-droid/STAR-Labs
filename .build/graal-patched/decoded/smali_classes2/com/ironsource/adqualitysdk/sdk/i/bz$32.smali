.class final Lcom/ironsource/adqualitysdk/sdk/i/bz$32;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bz;->ﾇ()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/bz;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bz;)V
    .locals 0

    .line 642
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bz$32;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/bz;

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

    .line 645
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/pubnative/lite/sdk/vpaid/models/vpaid/CreativeParams;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/bz;->ｋ(Lnet/pubnative/lite/sdk/vpaid/models/vpaid/CreativeParams;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
