.class public final Lcom/ironsource/cb;
.super Lcom/ironsource/qa;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Kb;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlayNativeAdInternal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayNativeAdInternal.kt\ncom/unity3d/mediation/internal/ads/LevelPlayNativeAdInternal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation


# instance fields
.field private final d:Ljava/util/UUID;

.field private final e:Lcom/ironsource/ab;

.field private f:Lcom/ironsource/Hb;

.field private g:Ljava/lang/String;

.field private h:Lcom/ironsource/mediationsdk/model/Placement;

.field private i:Lcom/ironsource/eb;

.field private j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

.field private k:Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;


# direct methods
.method public static synthetic $r8$lambda$127VNO9vaCkeDcfAtYdR6Rtyrro(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/cb;->b(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public static synthetic $r8$lambda$J1QHARd7iD2T4vprnFWWQDdEcXI(Lcom/ironsource/cb;Lcom/ironsource/eb;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/cb;->a(Lcom/ironsource/cb;Lcom/ironsource/eb;)V

    return-void
.end method

.method public static synthetic $r8$lambda$KlwkiH3LhbfIYHCahM3aQFUSY6U(Lcom/ironsource/cb;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/cb;->b(Lcom/ironsource/cb;)V

    return-void
.end method

.method public static synthetic $r8$lambda$SC528MBmJhj_nrJZJ3mUWnGIZVc(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/cb;->a(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public static synthetic $r8$lambda$qxusLzlT5O3WIt2TzA7pp1kvlL8(Lcom/ironsource/cb;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/cb;->a(Lcom/ironsource/cb;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$t7t-nipOEtQgVO8ZfcixhP9sMjE(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/cb;->a(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$xdTw8b1DDKyGcUTx_UC3-I86aCg(Lcom/ironsource/cb;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/cb;->a(Lcom/ironsource/cb;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Lcom/ironsource/ab;)V
    .locals 3

    const-string v0, "adId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/ironsource/n0;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->NATIVE_AD:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v2, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-direct {v0, v1, v2}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/D0$b;)V

    invoke-direct {p0, v0}, Lcom/ironsource/qa;-><init>(Lcom/ironsource/n0;)V

    .line 4
    iput-object p1, p0, Lcom/ironsource/cb;->d:Ljava/util/UUID;

    .line 5
    iput-object p2, p0, Lcom/ironsource/cb;->e:Lcom/ironsource/ab;

    .line 11
    const-string p2, ""

    iput-object p2, p0, Lcom/ironsource/cb;->g:Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Lcom/ironsource/qa;->a()Lcom/ironsource/n0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p2

    new-instance v0, Lcom/ironsource/n;

    invoke-virtual {p0}, Lcom/ironsource/qa;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/ironsource/n;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/ironsource/D5;->a(Lcom/ironsource/C0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lcom/ironsource/ab;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 1
    sget-object p1, Lcom/ironsource/x7;->a:Lcom/ironsource/x7;

    invoke-virtual {p1}, Lcom/ironsource/x7;->a()Ljava/util/UUID;

    move-result-object p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ironsource/cb;-><init>(Ljava/util/UUID;Lcom/ironsource/ab;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/cb;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/cb;->f:Lcom/ironsource/Hb;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "nativeAdController"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/ironsource/Hb;->q()V

    .line 4
    iput-object v1, p0, Lcom/ironsource/cb;->i:Lcom/ironsource/eb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 7
    sget-object p0, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v0, "destroyNativeAd()"

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/cb;Lcom/ironsource/eb;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iput-object p1, p0, Lcom/ironsource/cb;->i:Lcom/ironsource/eb;

    return-void
.end method

.method private static final a(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$levelPlayError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/ironsource/cb;->i:Lcom/ironsource/eb;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/ironsource/cb;->e:Lcom/ironsource/ab;

    invoke-interface {v0, p0, p1}, Lcom/ironsource/eb;->a(Lcom/ironsource/ab;Lcom/unity3d/mediation/LevelPlayAdError;)V

    :cond_0
    return-void
.end method

.method private static final a(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/ironsource/cb;->i:Lcom/ironsource/eb;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/ironsource/cb;->e:Lcom/ironsource/ab;

    invoke-interface {v0, p0, p1}, Lcom/ironsource/eb;->c(Lcom/ironsource/ab;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method private static final a(Lcom/ironsource/cb;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$placementName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lcom/ironsource/cb;->g:Ljava/lang/String;

    return-void
.end method

.method private static final b(Lcom/ironsource/cb;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/qa;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/qa;->a()Lcom/ironsource/n0;

    move-result-object p0

    const-string v2, "Native ad load already called"

    const/4 v3, 0x2

    invoke-static {p0, v2, v1, v3, v1}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/ironsource/cb;->d()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 11
    :cond_1
    iget-object p0, p0, Lcom/ironsource/cb;->f:Lcom/ironsource/Hb;

    if-nez p0, :cond_2

    const-string p0, "nativeAdController"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, p0

    :goto_0
    invoke-virtual {v1}, Lcom/ironsource/Hb;->r()V

    return-void
.end method

.method private static final b(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/ironsource/cb;->i:Lcom/ironsource/eb;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/ironsource/cb;->e:Lcom/ironsource/ab;

    invoke-interface {v0, p0, p1}, Lcom/ironsource/eb;->b(Lcom/ironsource/ab;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method private final e()Lcom/ironsource/Hb;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/qa;->a()Lcom/ironsource/n0;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/cb;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ironsource/n0;->c(Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/Placement;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/cb;->h:Lcom/ironsource/mediationsdk/model/Placement;

    .line 4
    new-instance v0, Lcom/ironsource/Rb;

    .line 5
    iget-object v1, p0, Lcom/ironsource/cb;->d:Ljava/util/UUID;

    .line 6
    invoke-virtual {p0}, Lcom/ironsource/qa;->b()Ljava/lang/String;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/ironsource/cb;->h:Lcom/ironsource/mediationsdk/model/Placement;

    if-nez v3, :cond_0

    const-string v3, "placement"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 8
    :cond_0
    invoke-direct {v0, v1, v2, v3}, Lcom/ironsource/Rb;-><init>(Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;)V

    .line 13
    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Lcom/ironsource/f0;)V

    .line 15
    new-instance v1, Lcom/ironsource/Hb;

    invoke-virtual {p0}, Lcom/ironsource/qa;->a()Lcom/ironsource/n0;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lcom/ironsource/Hb;-><init>(Lcom/ironsource/Kb;Lcom/ironsource/n0;Lcom/ironsource/Rb;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lcom/ironsource/eb;)V
    .locals 1

    .line 8
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/cb$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/cb;Lcom/ironsource/eb;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 2

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    .line 11
    new-instance v0, Lcom/ironsource/Eb;

    invoke-direct {v0}, Lcom/ironsource/Eb;-><init>()V

    .line 12
    iget-object v1, p0, Lcom/ironsource/cb;->f:Lcom/ironsource/Hb;

    if-nez v1, :cond_0

    const-string v1, "nativeAdController"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1, v0}, Lcom/ironsource/Hb;->a(Lcom/ironsource/Eb;)V

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/Eb;->a()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    .line 14
    invoke-virtual {v0}, Lcom/ironsource/Eb;->b()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/cb;->k:Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;

    .line 15
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/cb$$ExternalSyntheticLambda5;-><init>(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/cb$$ExternalSyntheticLambda4;-><init>(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "placementName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/cb$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/cb;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ironsource/cb;->e()Lcom/ironsource/Hb;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/cb;->f:Lcom/ironsource/Hb;

    const/4 v0, 0x1

    return v0
.end method

.method public final f()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/ironsource/cb$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/cb;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g()Ljava/util/UUID;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->d:Ljava/util/UUID;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;->getAdvertiser()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;->getBody()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Lcom/ironsource/bb$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;->getIcon()Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/ironsource/bb$a;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;->getUri()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/ironsource/bb$a;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->k:Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/cb;->j:Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/cb$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/ironsource/cb$$ExternalSyntheticLambda3;-><init>(Lcom/ironsource/cb;)V

    invoke-virtual {p0, v0}, Lcom/ironsource/qa;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onNativeAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/unity3d/mediation/LevelPlayAdError;

    iget-object v1, p0, Lcom/ironsource/cb;->d:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "adId.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ironsource/qa;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/unity3d/mediation/LevelPlayAdError;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/ironsource/cb$$ExternalSyntheticLambda6;

    invoke-direct {p1, p0, v0}, Lcom/ironsource/cb$$ExternalSyntheticLambda6;-><init>(Lcom/ironsource/cb;Lcom/unity3d/mediation/LevelPlayAdError;)V

    invoke-virtual {p0, p1}, Lcom/ironsource/qa;->b(Ljava/lang/Runnable;)V

    return-void
.end method
