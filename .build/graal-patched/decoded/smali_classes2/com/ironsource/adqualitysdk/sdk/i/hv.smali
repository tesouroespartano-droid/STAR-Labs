.class public Lcom/ironsource/adqualitysdk/sdk/i/hv;
.super Lcom/ironsource/adqualitysdk/sdk/i/ho;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/hv$a;
    }
.end annotation


# instance fields
.field private ﮐ:I

.field private ﱟ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field private ﱡ:Z

.field private ﺙ:Ljava/lang/Class;

.field private ﻏ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field private ﾇ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱟ:Ljava/util/List;

    .line 21
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻐ()V

    return-void
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;I)I
    .locals 0

    .line 10
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﾇ:I

    return p1
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﺙ:Ljava/lang/Class;

    return-object p1
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻏ:Ljava/util/List;

    return-object p1
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hv;I)I
    .locals 0

    .line 10
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﮐ:I

    return p1
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hv;)Ljava/util/List;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱟ:Ljava/util/List;

    return-object p0
.end method

.method static synthetic ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hv;Z)Z
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱡ:Z

    return p1
.end method


# virtual methods
.method public final ﮌ()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﮐ:I

    return v0
.end method

.method public final ﮐ()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﾇ:I

    return v0
.end method

.method public final ﱟ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱟ:Ljava/util/List;

    return-object v0
.end method

.method public final ﱡ()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱡ:Z

    return v0
.end method

.method public final ﺙ()Ljava/lang/Class;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﺙ:Ljava/lang/Class;

    return-object v0
.end method

.method public final ﻏ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻏ:Ljava/util/List;

    return-object v0
.end method

.method protected final ﻐ()V
    .locals 2

    .line 25
    invoke-super {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ()V

    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﺙ:Ljava/lang/Class;

    const/4 v1, 0x0

    .line 27
    iput v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﾇ:I

    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱡ:Z

    .line 29
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﱟ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 30
    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﻏ:Ljava/util/List;

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hv;->ﮐ:I

    return-void
.end method
