.class final Lcom/ironsource/adqualitysdk/sdk/i/cz$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/im;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cz;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dq;)Lcom/ironsource/adqualitysdk/sdk/i/im;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Ljava/util/List;

.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/du;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dq;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/du;Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻐ:Ljava/util/List;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ｋ()V
    .locals 5

    .line 79
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻐ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻐ:Ljava/util/List;

    invoke-virtual {v0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    .line 81
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cz$2;->ﻐ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method
