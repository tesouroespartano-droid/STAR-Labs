.class public Lcom/ironsource/adqualitysdk/sdk/i/cq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/cq$b;
    }
.end annotation


# instance fields
.field private ﻐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

.field private ﾇ:I

.field private ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cm;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/cq;)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    return-object p0
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/cq;Lcom/ironsource/adqualitysdk/sdk/i/ia$b;)Lcom/ironsource/adqualitysdk/sdk/i/ia$b;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    return-object p1
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/cq;I)I
    .locals 0

    .line 11
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﾇ:I

    return p1
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/cq;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻐ:Ljava/util/List;

    return-object p1
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/cq;Lcom/ironsource/adqualitysdk/sdk/i/cm;)Lcom/ironsource/adqualitysdk/sdk/i/cm;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cm;

    return-object p1
.end method


# virtual methods
.method public final ﻐ()Lcom/ironsource/adqualitysdk/sdk/i/cm;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/cm;

    return-object v0
.end method

.method public final ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;)Lcom/ironsource/adqualitysdk/sdk/i/ia;
    .locals 3

    .line 19
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia$b;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﻐ:Ljava/util/List;

    iget v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/cq;->ﾇ:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ia$b;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hx;Ljava/util/List;I)Lcom/ironsource/adqualitysdk/sdk/i/ia;

    move-result-object p1

    return-object p1
.end method
