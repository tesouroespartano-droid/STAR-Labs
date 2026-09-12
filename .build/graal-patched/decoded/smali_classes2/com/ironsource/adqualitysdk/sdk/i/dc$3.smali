.class final Lcom/ironsource/adqualitysdk/sdk/i/dc$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/dc;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/dq;)Lcom/ironsource/adqualitysdk/sdk/i/iu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

.field private synthetic ﻛ:Ljava/util/List;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/ironsource/adqualitysdk/sdk/i/du;Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻛ:Ljava/util/List;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iput-object p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 5

    .line 37
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻛ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 38
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/du;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/dq;

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iget-object v4, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻛ:Ljava/util/List;

    invoke-virtual {v0, v2, v3, v4}, Lcom/ironsource/adqualitysdk/sdk/i/du;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/dq;Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/util/List;)Lcom/ironsource/adqualitysdk/sdk/i/dr;

    .line 39
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/dc$3;->ﻛ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method
