.class public final Lcom/ironsource/Hb;
.super Lcom/ironsource/m;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Vb;
.implements Lcom/ironsource/L0;
.implements Lcom/ironsource/x0;


# instance fields
.field private final b:Lcom/ironsource/Kb;

.field private final c:Lcom/ironsource/n0;

.field private final d:Lcom/ironsource/Rb;

.field private e:Lcom/ironsource/Tb;

.field private f:Lcom/unity3d/mediation/LevelPlayAdInfo;


# direct methods
.method public constructor <init>(Lcom/ironsource/Kb;Lcom/ironsource/n0;Lcom/ironsource/Rb;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adTools"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAdProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/ironsource/m;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Hb;->b:Lcom/ironsource/Kb;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Hb;->c:Lcom/ironsource/n0;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Hb;->d:Lcom/ironsource/Rb;

    .line 8
    invoke-direct {p0}, Lcom/ironsource/Hb;->p()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/Hb;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    return-void
.end method

.method private final a(Lcom/ironsource/n0;Lcom/ironsource/Rb;)Lcom/ironsource/Tb;
    .locals 2

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 4
    sget-object v0, Lcom/ironsource/Ub;->y:Lcom/ironsource/Ub$a;

    invoke-virtual {p0}, Lcom/ironsource/m;->o()Lcom/ironsource/I8;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/I8;->a()Lcom/ironsource/Ra;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/ironsource/Ub$a;->a(Lcom/ironsource/f0;Lcom/ironsource/Ra;)Lcom/ironsource/Ub;

    move-result-object p2

    .line 5
    new-instance v0, Lcom/ironsource/Tb;

    invoke-direct {v0, p1, p2, p0}, Lcom/ironsource/Tb;-><init>(Lcom/ironsource/n0;Lcom/ironsource/Ub;Lcom/ironsource/Vb;)V

    return-object v0
.end method

.method private final p()Lcom/unity3d/mediation/LevelPlayAdInfo;
    .locals 10

    .line 1
    new-instance v0, Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 2
    iget-object v1, p0, Lcom/ironsource/Hb;->d:Lcom/ironsource/Rb;

    invoke-virtual {v1}, Lcom/ironsource/f0;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "nativeAdProperties.adId.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v2, p0, Lcom/ironsource/Hb;->d:Lcom/ironsource/Rb;

    invoke-virtual {v2}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/ironsource/Hb;->d:Lcom/ironsource/Rb;

    invoke-virtual {v3}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "nativeAdProperties.adFormat.toString()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 5
    invoke-direct/range {v0 .. v9}, Lcom/unity3d/mediation/LevelPlayAdInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;Lcom/ironsource/ob;Lcom/unity3d/mediation/LevelPlayAdSize;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/ironsource/Eb;)V
    .locals 2

    const-string v0, "nativeAdBinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Hb;->e:Lcom/ironsource/Tb;

    if-nez v0, :cond_0

    const-string v0, "nativeAdUnit"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/ironsource/Mb;

    invoke-direct {v1, p1}, Lcom/ironsource/Mb;-><init>(Lcom/ironsource/Eb;)V

    invoke-virtual {v0, v1, p0}, Lcom/ironsource/o0;->a(Lcom/ironsource/I;Lcom/ironsource/x0;)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ironsource/Hb;->b:Lcom/ironsource/Kb;

    invoke-interface {v0, p1}, Lcom/ironsource/Kb;->onNativeAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/s0;->c()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    iput-object p1, p0, Lcom/ironsource/Hb;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 8
    iget-object v0, p0, Lcom/ironsource/Hb;->b:Lcom/ironsource/Kb;

    invoke-interface {v0, p1}, Lcom/ironsource/Kb;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 1
    new-instance p1, Lkotlin/NotImplementedError;

    const-string v0, "An operation is not implemented: Not yet implemented"

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/NotImplementedError;

    const-string v1, "An operation is not implemented: Not yet implemented"

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Hb;->b:Lcom/ironsource/Kb;

    iget-object v1, p0, Lcom/ironsource/Hb;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-interface {v0, v1}, Lcom/ironsource/Kb;->b(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Hb;->p()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/Hb;->f:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 2
    iget-object v0, p0, Lcom/ironsource/Hb;->e:Lcom/ironsource/Tb;

    if-nez v0, :cond_0

    const-string v0, "nativeAdUnit"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Hb;->c:Lcom/ironsource/n0;

    iget-object v1, p0, Lcom/ironsource/Hb;->d:Lcom/ironsource/Rb;

    invoke-direct {p0, v0, v1}, Lcom/ironsource/Hb;->a(Lcom/ironsource/n0;Lcom/ironsource/Rb;)Lcom/ironsource/Tb;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/Hb;->e:Lcom/ironsource/Tb;

    if-nez v0, :cond_0

    .line 2
    const-string v0, "nativeAdUnit"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p0}, Lcom/ironsource/o0;->a(Lcom/ironsource/L0;)V

    return-void
.end method
