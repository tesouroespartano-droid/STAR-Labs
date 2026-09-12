.class final Lcom/ironsource/adqualitysdk/sdk/i/co$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/cl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/co;->טּ()Lcom/ironsource/adqualitysdk/sdk/i/cl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/co;)V
    .locals 0

    .line 1022
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1025
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2, p2}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/lang/String;ZZLjava/util/List;)V

    .line 2031
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    new-instance v3, Lcom/ironsource/adqualitysdk/sdk/i/co$3$1;

    invoke-direct {v3, p0, p1, v2, p2}, Lcom/ironsource/adqualitysdk/sdk/i/co$3$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/co$3;Ljava/lang/String;ZLjava/util/List;)V

    invoke-static {v0, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Lcom/ironsource/adqualitysdk/sdk/i/il;Z)V

    .line 3031
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/co$3$1;

    invoke-direct {v2, p0, p1, v1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/co$3$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/co$3;Ljava/lang/String;ZLjava/util/List;)V

    invoke-static {v0, v2, v1}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Lcom/ironsource/adqualitysdk/sdk/i/il;Z)V

    return-void
.end method
