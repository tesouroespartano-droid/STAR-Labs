.class public final Lcom/ironsource/I2;
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

.field private final u:Lcom/ironsource/V2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/V2;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "configs"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v4

    const-string v2, "configs.bannerAuctionSettings"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/V2;->a()I

    move-result v5

    .line 6
    invoke-virtual {v0}, Lcom/ironsource/V2;->b()J

    move-result-wide v2

    const/16 v6, 0x3e8

    int-to-long v6, v6

    div-long/2addr v2, v6

    long-to-int v6, v2

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/V2;->c()Z

    move-result v7

    .line 8
    invoke-virtual {v0}, Lcom/ironsource/V2;->f()I

    move-result v8

    .line 10
    invoke-static {v0}, Lcom/ironsource/J2;->a(Lcom/ironsource/V2;)Lcom/ironsource/N0;

    move-result-object v10

    .line 11
    new-instance v11, Lcom/ironsource/H0;

    invoke-virtual {v0}, Lcom/ironsource/V2;->j()J

    move-result-wide v2

    invoke-direct {v11, v2, v3}, Lcom/ironsource/H0;-><init>(J)V

    .line 12
    invoke-virtual {v0}, Lcom/ironsource/V2;->e()J

    move-result-wide v12

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/V2;->l()Z

    move-result v14

    .line 14
    invoke-virtual {v0}, Lcom/ironsource/V2;->n()Z

    move-result v15

    .line 15
    invoke-virtual {v0}, Lcom/ironsource/V2;->m()Z

    move-result v16

    const v18, 0x8000

    const/16 v19, 0x0

    const/4 v9, -0x1

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .line 16
    invoke-direct/range {v0 .. v19}, Lcom/ironsource/U;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/p2;IIZIILcom/ironsource/N0;Lcom/ironsource/H0;JZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    iput-object v2, v0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    .line 18
    iput-object v3, v0, Lcom/ironsource/I2;->t:Ljava/util/List;

    move-object/from16 v1, p3

    .line 19
    iput-object v1, v0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    return-void
.end method

.method public static synthetic a(Lcom/ironsource/I2;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;ILjava/lang/Object;)Lcom/ironsource/I2;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 2
    iget-object p1, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/ironsource/I2;->a(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;)Lcom/ironsource/I2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;)Lcom/ironsource/I2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/V2;",
            ")",
            "Lcom/ironsource/I2;"
        }
    .end annotation

    .line 1
    const-string v0, "configs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ironsource/I2;

    invoke-direct {v0, p1, p2, p3}, Lcom/ironsource/I2;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/ironsource/I2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ironsource/I2;

    iget-object v1, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    iget-object v3, p1, Lcom/ironsource/I2;->s:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    iget-object v3, p1, Lcom/ironsource/I2;->t:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    iget-object p1, p1, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

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
    iget-object v0, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

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
    iget-object v0, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/I2;->s:Ljava/lang/String;

    iget-object v1, p0, Lcom/ironsource/I2;->t:Ljava/util/List;

    iget-object v2, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "BannerAdManagerData(userId="

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

.method public final u()Lcom/ironsource/V2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    return-object v0
.end method

.method public final v()Lcom/ironsource/V2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/I2;->u:Lcom/ironsource/V2;

    return-object v0
.end method
