.class final Lcom/ironsource/adqualitysdk/sdk/i/bv$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bv;->ﾇ()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bv;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bv;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bv$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/bv;

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

    .line 66
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljp/maio/sdk/android/MaioAdsListenerInterface;

    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/i/bv;->ｋ(Ljp/maio/sdk/android/MaioAdsListenerInterface;)V

    const/4 p1, 0x0

    return-object p1
.end method
