.class final Lcom/ironsource/adqualitysdk/sdk/i/bp$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/bp;->ﾇ()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/bp;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/bp;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/bp$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/bp;

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

    .line 201
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/i/bp;->ﮐ()Lcom/hyprmx/android/sdk/core/DependencyHolder;

    move-result-object p1

    return-object p1
.end method
