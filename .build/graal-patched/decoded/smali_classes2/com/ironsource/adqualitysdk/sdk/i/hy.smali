.class public final Lcom/ironsource/adqualitysdk/sdk/i/hy;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private ﱟ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ">;"
        }
    .end annotation
.end field

.field private ﻐ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia;

.field private ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ht;

.field private ﾇ:Z

.field private ﾒ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ia;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia;

    .line 17
    new-instance p1, Lcom/ironsource/adqualitysdk/sdk/i/ht;

    invoke-direct {p1}, Lcom/ironsource/adqualitysdk/sdk/i/ht;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ht;

    .line 18
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ:Ljava/util/Set;

    .line 19
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ:Ljava/util/Set;

    .line 20
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﱟ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ﱟ()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ironsource/adqualitysdk/sdk/i/hr;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﱟ:Ljava/util/Set;

    return-object v0
.end method

.method public final ﺙ()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ:Ljava/util/Set;

    return-object v0
.end method

.method public final ﻐ()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻐ:Ljava/util/Set;

    return-object v0
.end method

.method public final ﻛ()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ:Z

    return v0
.end method

.method public final ｋ()Lcom/ironsource/adqualitysdk/sdk/i/hy;
    .locals 1

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾇ:Z

    return-object p0
.end method

.method public final ｋ(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﾒ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ﾇ()Lcom/ironsource/adqualitysdk/sdk/i/ht;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/ht;

    return-object v0
.end method

.method public final ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﱟ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ﾒ()Lcom/ironsource/adqualitysdk/sdk/i/ia;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hy;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ia;

    return-object v0
.end method
