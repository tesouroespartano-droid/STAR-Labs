.class public final Lcom/ironsource/x9;
.super Lcom/ironsource/U;
.source "SourceFile"


# instance fields
.field private final s:Ljava/lang/String;

.field private final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lcom/ironsource/B9;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/B9;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "configs"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v4

    const-string v2, "configs.interstitialAuctionSettings"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/B9;->c()I

    move-result v5

    .line 6
    invoke-virtual {v0}, Lcom/ironsource/B9;->d()I

    move-result v6

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/B9;->f()Z

    move-result v7

    .line 8
    invoke-virtual {v0}, Lcom/ironsource/B9;->b()I

    move-result v8

    .line 10
    new-instance v9, Lcom/ironsource/N0;

    .line 11
    sget-object v10, Lcom/ironsource/N0$a;->a:Lcom/ironsource/N0$a;

    .line 12
    invoke-virtual {v0}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/p2;->j()J

    move-result-wide v11

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/p2;->b()J

    move-result-wide v13

    const-wide/16 v15, -0x1

    .line 14
    invoke-direct/range {v9 .. v16}, Lcom/ironsource/N0;-><init>(Lcom/ironsource/N0$a;JJJ)V

    .line 19
    new-instance v11, Lcom/ironsource/H0;

    const-wide/16 v2, -0x1

    invoke-direct {v11, v2, v3}, Lcom/ironsource/H0;-><init>(J)V

    .line 20
    invoke-virtual {v0}, Lcom/ironsource/B9;->h()J

    move-result-wide v12

    .line 21
    invoke-virtual {v0}, Lcom/ironsource/B9;->k()Z

    move-result v14

    .line 22
    invoke-virtual {v0}, Lcom/ironsource/B9;->m()Z

    move-result v15

    .line 23
    invoke-virtual {v0}, Lcom/ironsource/B9;->l()Z

    move-result v16

    const v18, 0x8000

    const/16 v19, 0x0

    move-object v10, v9

    const/4 v9, -0x1

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .line 24
    invoke-direct/range {v0 .. v19}, Lcom/ironsource/U;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/p2;IIZIILcom/ironsource/N0;Lcom/ironsource/H0;JZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    iput-object v2, v0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    .line 26
    iput-object v3, v0, Lcom/ironsource/x9;->t:Ljava/util/List;

    move-object/from16 v1, p3

    .line 27
    iput-object v1, v0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    return-void
.end method

.method public static synthetic a(Lcom/ironsource/x9;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;ILjava/lang/Object;)Lcom/ironsource/x9;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 2
    iget-object p1, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/ironsource/x9;->a(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)Lcom/ironsource/x9;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)Lcom/ironsource/x9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/B9;",
            ")",
            "Lcom/ironsource/x9;"
        }
    .end annotation

    .line 1
    const-string v0, "configs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ironsource/x9;

    invoke-direct {v0, p1, p2, p3}, Lcom/ironsource/x9;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/ironsource/x9;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ironsource/x9;

    iget-object v1, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    iget-object v3, p1, Lcom/ironsource/x9;->s:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    iget-object v3, p1, Lcom/ironsource/x9;->t:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    iget-object p1, p1, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->s:Ljava/lang/String;

    iget-object v1, p0, Lcom/ironsource/x9;->t:Ljava/util/List;

    iget-object v2, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "InterstitialAdManagerData(userId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", providerList="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", configs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/ironsource/B9;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    return-object v0
.end method

.method public final v()Lcom/ironsource/B9;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/x9;->u:Lcom/ironsource/B9;

    return-object v0
.end method
