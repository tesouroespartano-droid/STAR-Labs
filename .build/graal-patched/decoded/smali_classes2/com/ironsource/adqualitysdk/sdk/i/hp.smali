.class public Lcom/ironsource/adqualitysdk/sdk/i/hp;
.super Lcom/ironsource/adqualitysdk/sdk/i/ho;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/adqualitysdk/sdk/i/hp$b;
    }
.end annotation


# instance fields
.field private ﮐ:I

.field private ﱡ:Z

.field private ﻏ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field private ﾇ:Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻏ:Ljava/util/List;

    .line 1027
    invoke-super {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ()V

    const/4 v0, 0x0

    .line 1028
    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾇ:Ljava/lang/Class;

    const/4 v0, 0x0

    .line 1029
    iput v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﮐ:I

    const/4 v0, 0x1

    .line 1030
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ:Z

    .line 1031
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻏ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾇ:Ljava/lang/Class;

    return-object p1
.end method

.method static synthetic ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/hp;)Ljava/util/List;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻏ:Ljava/util/List;

    return-object p0
.end method

.method static synthetic ｋ(Lcom/ironsource/adqualitysdk/sdk/i/hp;Z)Z
    .locals 0

    .line 14
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ:Z

    return p1
.end method

.method static synthetic ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/hp;I)I
    .locals 0

    .line 14
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﮐ:I

    return p1
.end method


# virtual methods
.method public final ﮐ()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﮐ:I

    return v0
.end method

.method public final ﱟ()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ:Z

    return v0
.end method

.method public final ﱡ()Ljava/lang/Class;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾇ:Ljava/lang/Class;

    return-object v0
.end method

.method public final ﺙ()Ljava/util/List;
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
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻏ:Ljava/util/List;

    return-object v0
.end method

.method protected final ﻐ()V
    .locals 1

    .line 27
    invoke-super {p0}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﻐ()V

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾇ:Ljava/lang/Class;

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﮐ:I

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ:Z

    .line 31
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﻏ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ﾒ(Ljava/lang/Class;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﾇ:Ljava/lang/Class;

    return-void
.end method
