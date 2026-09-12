.class public final Lcom/ironsource/z9;
.super Lcom/ironsource/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/z9$a;
    }
.end annotation


# static fields
.field public static final z:Lcom/ironsource/z9$a;


# instance fields
.field private final t:Lcom/ironsource/f0;

.field private final u:Z

.field private final v:Lcom/ironsource/u0;

.field private final w:Lcom/ironsource/B9;

.field private final x:Ljava/lang/String;

.field private final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/z9$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/z9$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/z9;->z:Lcom/ironsource/z9$a;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/f0;ZLcom/ironsource/u0;Lcom/ironsource/B9;)V
    .locals 21

    move-object/from16 v1, p1

    move-object/from16 v0, p3

    move-object/from16 v2, p4

    const-string v3, "adProperties"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "adUnitCommonData"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "configs"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v0}, Lcom/ironsource/u0;->f()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/u0;->d()Ljava/util/List;

    move-result-object v4

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/u0;->e()Lcom/ironsource/fa;

    move-result-object v5

    .line 4
    invoke-virtual {v2}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v6

    const-string v7, "configs.interstitialAuctionSettings"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Lcom/ironsource/B9;->c()I

    move-result v7

    .line 6
    invoke-virtual {v2}, Lcom/ironsource/B9;->d()I

    move-result v8

    .line 7
    invoke-virtual {v2}, Lcom/ironsource/B9;->f()Z

    move-result v9

    .line 8
    invoke-virtual {v2}, Lcom/ironsource/B9;->b()I

    move-result v10

    .line 10
    new-instance v11, Lcom/ironsource/N0;

    .line 11
    sget-object v12, Lcom/ironsource/N0$a;->a:Lcom/ironsource/N0$a;

    .line 12
    invoke-virtual {v2}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v13

    invoke-virtual {v13}, Lcom/ironsource/p2;->j()J

    move-result-wide v13

    .line 13
    invoke-virtual {v2}, Lcom/ironsource/B9;->g()Lcom/ironsource/p2;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ironsource/p2;->b()J

    move-result-wide v15

    const-wide/16 v17, -0x1

    .line 14
    invoke-direct/range {v11 .. v18}, Lcom/ironsource/N0;-><init>(Lcom/ironsource/N0$a;JJJ)V

    .line 19
    invoke-virtual {v2}, Lcom/ironsource/B9;->h()J

    move-result-wide v13

    .line 20
    invoke-virtual {v2}, Lcom/ironsource/B9;->k()Z

    move-result v15

    .line 21
    invoke-virtual {v2}, Lcom/ironsource/B9;->m()Z

    move-result v16

    .line 22
    invoke-virtual {v2}, Lcom/ironsource/B9;->l()Z

    move-result v17

    const/high16 v19, 0x10000

    const/16 v20, 0x0

    move-object v12, v11

    const/4 v11, -0x1

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p2

    .line 23
    invoke-direct/range {v0 .. v20}, Lcom/ironsource/v0;-><init>(Lcom/ironsource/f0;ZLjava/lang/String;Ljava/util/List;Lcom/ironsource/fa;Lcom/ironsource/p2;IIZIILcom/ironsource/N0;JZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    iput-object v1, v0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    .line 25
    iput-boolean v2, v0, Lcom/ironsource/z9;->u:Z

    move-object/from16 v1, p3

    .line 26
    iput-object v1, v0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    move-object/from16 v2, p4

    .line 27
    iput-object v2, v0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    .line 51
    const-string v1, "IS"

    iput-object v1, v0, Lcom/ironsource/z9;->x:Ljava/lang/String;

    .line 52
    const-string v1, "MADU_IS"

    iput-object v1, v0, Lcom/ironsource/z9;->y:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/ironsource/z9;Lcom/ironsource/f0;ZLcom/ironsource/u0;Lcom/ironsource/B9;ILjava/lang/Object;)Lcom/ironsource/z9;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 2
    iget-object p1, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/ironsource/z9;->u:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ironsource/z9;->a(Lcom/ironsource/f0;ZLcom/ironsource/u0;Lcom/ironsource/B9;)Lcom/ironsource/z9;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()Lcom/ironsource/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    return-object v0
.end method

.method public final B()Lcom/ironsource/B9;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    return-object v0
.end method

.method public final a(Lcom/ironsource/f0;ZLcom/ironsource/u0;Lcom/ironsource/B9;)Lcom/ironsource/z9;
    .locals 1

    .line 1
    const-string v0, "adProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitCommonData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ironsource/z9;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ironsource/z9;-><init>(Lcom/ironsource/f0;ZLcom/ironsource/u0;Lcom/ironsource/B9;)V

    return-object v0
.end method

.method public b()Lcom/ironsource/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    return-object v0
.end method

.method public b(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Lorg/json/JSONObject;
    .locals 1

    const-string v0, "providerSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getInterstitialSettings()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "providerSettings.interstitialSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->x:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/ironsource/z9;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ironsource/z9;

    iget-object v1, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    iget-object v3, p1, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/ironsource/z9;->u:Z

    iget-boolean v3, p1, Lcom/ironsource/z9;->u:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    iget-object v3, p1, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    iget-object p1, p1, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ironsource/z9;->u:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    invoke-virtual {v1}, Lcom/ironsource/u0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->y:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    iget-boolean v1, p0, Lcom/ironsource/z9;->u:Z

    iget-object v2, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    iget-object v3, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "InterstitialAdUnitData(adProperties="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", isPublisherLoad="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", adUnitCommonData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", configs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/z9;->u:Z

    return v0
.end method

.method public final w()Lcom/ironsource/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->t:Lcom/ironsource/f0;

    return-object v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/z9;->u:Z

    return v0
.end method

.method public final y()Lcom/ironsource/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->v:Lcom/ironsource/u0;

    return-object v0
.end method

.method public final z()Lcom/ironsource/B9;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z9;->w:Lcom/ironsource/B9;

    return-object v0
.end method
