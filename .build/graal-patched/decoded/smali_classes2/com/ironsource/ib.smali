.class public final Lcom/ironsource/ib;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlaySDKInternal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlaySDKInternal.kt\ncom/unity3d/mediation/internal/LevelPlaySDKInternal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,288:1\n1855#2,2:289\n37#3,2:291\n*S KotlinDebug\n*F\n+ 1 LevelPlaySDKInternal.kt\ncom/unity3d/mediation/internal/LevelPlaySDKInternal\n*L\n70#1:289,2\n88#1:291,2\n*E\n"
.end annotation


# static fields
.field public static final a:Lcom/ironsource/ib;

.field private static final b:Lcom/ironsource/jb;


# direct methods
.method public static synthetic $r8$lambda$jaQAvCPTX8_s7BHvbmKLo7fxQNA(Lcom/ironsource/ae;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ib;->a(Lcom/ironsource/ae;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public static synthetic $r8$lambda$liTJ36WuBzmBDd51LiswTj-VZeo(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/ib;->b(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public static synthetic $r8$lambda$rG-NmdjCvMbG8dHFlE7Qryz-V3Y(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/Ra;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/Ra;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ironsource/ib;

    invoke-direct {v0}, Lcom/ironsource/ib;-><init>()V

    sput-object v0, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    .line 1
    new-instance v0, Lcom/ironsource/jb;

    invoke-direct {v0}, Lcom/ironsource/jb;-><init>()V

    sput-object v0, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lcom/ironsource/jb;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    return-object v0
.end method

.method private final a(Lcom/unity3d/mediation/segment/LevelPlaySegment;)Lcom/ironsource/mediationsdk/IronSourceSegment;
    .locals 3

    .line 9
    new-instance v0, Lcom/ironsource/mediationsdk/IronSourceSegment;

    invoke-direct {v0}, Lcom/ironsource/mediationsdk/IronSourceSegment;-><init>()V

    .line 10
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->getLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setLevel(I)V

    .line 11
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->getIapTotal()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setIAPTotal(D)V

    .line 12
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->isPaying()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setIsPaying(Z)V

    .line 13
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->getUserCreationDate()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setUserCreationDate(J)V

    .line 14
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->getSegmentName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setSegmentName(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Lcom/unity3d/mediation/segment/LevelPlaySegment;->getCustoms$mediationsdk_release()Ljava/util/ArrayList;

    move-result-object p1

    .line 234
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    .line 235
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setCustom(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final a(JLkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 299
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->e()Lcom/ironsource/I8;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I8;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 302
    sget-object v0, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    invoke-virtual {v0, p3, p1, p2}, Lcom/ironsource/jb;->a(Lkotlin/jvm/functions/Function0;J)V

    return-void

    .line 306
    :cond_0
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final a(Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 7

    .line 307
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->D()Lcom/ironsource/I8$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I8$a;->d()V

    .line 309
    invoke-static {p2}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v2

    .line 310
    sget-object v1, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    .line 311
    invoke-virtual {p1}, Lcom/ironsource/Yd;->f()Lcom/ironsource/Ae$a;

    move-result-object v4

    move-wide v5, p3

    .line 312
    invoke-virtual/range {v1 .. v6}, Lcom/ironsource/jb;->a(JLcom/ironsource/Ae$a;J)V

    .line 315
    new-instance p2, Lcom/ironsource/ib$$ExternalSyntheticLambda1;

    invoke-direct {p2, p5, p1}, Lcom/ironsource/ib$$ExternalSyntheticLambda1;-><init>(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/Ra;)V

    invoke-virtual {v1, p2}, Lcom/ironsource/jb;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ae;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 3

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LevelPlayInitListener.LevelPlayInitError() error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 397
    new-instance v0, Lcom/unity3d/mediation/LevelPlayInitError;

    invoke-direct {v0, p0}, Lcom/unity3d/mediation/LevelPlayInitError;-><init>(Lcom/ironsource/ae;)V

    invoke-interface {p1, v0}, Lcom/unity3d/mediation/LevelPlayInitListener;->onInitFailed(Lcom/unity3d/mediation/LevelPlayInitError;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/ironsource/ib;Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/ironsource/ib;->a(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/ib;Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    .line 4
    invoke-direct/range {p0 .. p5}, Lcom/ironsource/ib;->a(Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/ib;Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/ib;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method private static final a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/Ra;)V
    .locals 2

    const-string v0, "$levelPlayConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "LevelPlayInitListener.onInitSuccess()"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 318
    new-instance v0, Lcom/unity3d/mediation/LevelPlayConfiguration;

    .line 319
    invoke-virtual {p1}, Lcom/ironsource/Ra;->j()Z

    move-result p1

    .line 320
    invoke-direct {v0, p1}, Lcom/unity3d/mediation/LevelPlayConfiguration;-><init>(Z)V

    .line 321
    invoke-interface {p0, v0}, Lcom/unity3d/mediation/LevelPlayInitListener;->onInitSuccess(Lcom/unity3d/mediation/LevelPlayConfiguration;)V

    :cond_0
    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 2

    .line 393
    invoke-static {p2}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v0

    .line 394
    sget-object p2, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    invoke-virtual {p2, p3, v0, v1}, Lcom/ironsource/jb;->a(Lcom/ironsource/ae;J)V

    .line 395
    new-instance v0, Lcom/ironsource/ib$$ExternalSyntheticLambda0;

    invoke-direct {v0, p3, p1}, Lcom/ironsource/ib$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/ae;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    invoke-virtual {p2, v0}, Lcom/ironsource/jb;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Ra;)V
    .locals 12

    .line 322
    sget-object v0, Lcom/unity3d/mediation/LevelPlay$AdFormat;->REWARDED:Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-direct {p0, p1, v0}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 323
    invoke-virtual {p2}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/U3;->f()Lcom/ironsource/Md;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 325
    sget-object v1, Lcom/ironsource/Gd;->z:Lcom/ironsource/Gd$a;

    .line 326
    new-instance v3, Lcom/ironsource/f0;

    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v5, Lcom/ironsource/x7;->a:Lcom/ironsource/x7;

    invoke-virtual {v5}, Lcom/ironsource/x7;->a()Ljava/util/UUID;

    move-result-object v5

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/ironsource/f0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/sf;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 327
    invoke-virtual {v1, v3, p2, v2}, Lcom/ironsource/Gd$a;->a(Lcom/ironsource/f0;Lcom/ironsource/Ra;Z)Lcom/ironsource/Gd;

    move-result-object v1

    .line 331
    invoke-virtual {p2, v0}, Lcom/ironsource/Ra;->c(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/util/List;

    move-result-object v3

    .line 332
    new-instance v5, Lcom/ironsource/ld;

    .line 333
    new-instance v6, Lcom/ironsource/V0;

    .line 334
    new-instance v7, Lcom/ironsource/n0;

    sget-object v8, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-direct {v7, v4, v8}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/D0$b;)V

    .line 335
    invoke-direct {v6, v7, v1, v8}, Lcom/ironsource/V0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/v0;Lcom/ironsource/D0$b;)V

    .line 336
    invoke-direct {v5, v6, v0, v3, v1}, Lcom/ironsource/ld;-><init>(Lcom/ironsource/V0;Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/util/List;Lcom/ironsource/v0;)V

    .line 344
    invoke-virtual {v5}, Lcom/ironsource/ld;->a()V

    .line 348
    :cond_0
    sget-object v0, Lcom/unity3d/mediation/LevelPlay$AdFormat;->INTERSTITIAL:Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-direct {p0, p1, v0}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 349
    invoke-virtual {p2}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/U3;->d()Lcom/ironsource/B9;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 351
    sget-object v1, Lcom/ironsource/z9;->z:Lcom/ironsource/z9$a;

    .line 352
    new-instance v3, Lcom/ironsource/f0;

    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v5, Lcom/ironsource/x7;->a:Lcom/ironsource/x7;

    invoke-virtual {v5}, Lcom/ironsource/x7;->a()Ljava/util/UUID;

    move-result-object v5

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/ironsource/f0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/sf;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 353
    invoke-virtual {v1, v3, p2, v2}, Lcom/ironsource/z9$a;->a(Lcom/ironsource/f0;Lcom/ironsource/Ra;Z)Lcom/ironsource/z9;

    move-result-object v1

    .line 357
    invoke-virtual {p2, v0}, Lcom/ironsource/Ra;->c(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/util/List;

    move-result-object v3

    .line 358
    new-instance v5, Lcom/ironsource/ld;

    .line 359
    new-instance v6, Lcom/ironsource/V0;

    .line 360
    new-instance v7, Lcom/ironsource/n0;

    sget-object v8, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-direct {v7, v4, v8}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/D0$b;)V

    .line 361
    invoke-direct {v6, v7, v1, v8}, Lcom/ironsource/V0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/v0;Lcom/ironsource/D0$b;)V

    .line 362
    invoke-direct {v5, v6, v0, v3, v1}, Lcom/ironsource/ld;-><init>(Lcom/ironsource/V0;Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/util/List;Lcom/ironsource/v0;)V

    .line 370
    invoke-virtual {v5}, Lcom/ironsource/ld;->a()V

    .line 374
    :cond_1
    sget-object v0, Lcom/unity3d/mediation/LevelPlay$AdFormat;->BANNER:Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-direct {p0, p1, v0}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 375
    invoke-virtual {p2}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/U3;->c()Lcom/ironsource/V2;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 377
    sget-object p1, Lcom/ironsource/N2;->z:Lcom/ironsource/N2$a;

    new-instance v1, Lcom/ironsource/K2;

    invoke-direct {v1}, Lcom/ironsource/K2;-><init>()V

    invoke-virtual {p1, v1, p2, v2}, Lcom/ironsource/N2$a;->a(Lcom/ironsource/K2;Lcom/ironsource/Ra;Z)Lcom/ironsource/N2;

    move-result-object p1

    .line 378
    invoke-virtual {p2, v0}, Lcom/ironsource/Ra;->c(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/util/List;

    move-result-object p2

    .line 379
    new-instance v1, Lcom/ironsource/ld;

    .line 380
    new-instance v2, Lcom/ironsource/V0;

    .line 381
    new-instance v3, Lcom/ironsource/n0;

    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    sget-object v5, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-direct {v3, v4, v5}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/D0$b;)V

    .line 382
    invoke-direct {v2, v3, p1, v5}, Lcom/ironsource/V0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/v0;Lcom/ironsource/D0$b;)V

    .line 383
    invoke-direct {v1, v2, v0, p2, p1}, Lcom/ironsource/ld;-><init>(Lcom/ironsource/V0;Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/util/List;Lcom/ironsource/v0;)V

    .line 391
    invoke-virtual {v1}, Lcom/ironsource/ld;->a()V

    :cond_2
    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 9

    .line 236
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/I7;->D()Lcom/ironsource/I8$a;

    move-result-object v1

    .line 238
    new-instance v3, Lcom/ironsource/Ra;

    invoke-direct {v3, p2}, Lcom/ironsource/Ra;-><init>(Lcom/ironsource/Yd;)V

    .line 240
    invoke-virtual {v3}, Lcom/ironsource/Ra;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 241
    sget-object v2, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    invoke-virtual {v2, p3}, Lcom/ironsource/jb;->a(Landroid/content/Context;)V

    .line 245
    :cond_0
    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v2

    invoke-interface {v2}, Lcom/ironsource/I7;->a()Lcom/ironsource/L7$a;

    move-result-object v2

    .line 247
    sget-object v4, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    invoke-virtual {v3, v4}, Lcom/ironsource/Ra;->b(Lcom/ironsource/jb;)Lcom/ironsource/bd;

    move-result-object v5

    .line 248
    invoke-virtual {v5, v2}, Lcom/ironsource/bd;->a(Lcom/ironsource/L7$a;)V

    .line 250
    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v2

    invoke-interface {v2}, Lcom/ironsource/I7;->l()Lcom/ironsource/r7$a;

    move-result-object v2

    .line 252
    invoke-virtual {v3, v4}, Lcom/ironsource/Ra;->a(Lcom/ironsource/jb;)Lcom/ironsource/t0;

    move-result-object v5

    .line 253
    invoke-virtual {v5, v2}, Lcom/ironsource/t0;->a(Lcom/ironsource/r7$a;)V

    .line 255
    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v2

    invoke-interface {v2}, Lcom/ironsource/I7;->v()Lcom/ironsource/Q7$a;

    move-result-object v2

    .line 256
    invoke-virtual {v3, v4}, Lcom/ironsource/Ra;->c(Lcom/ironsource/jb;)Lcom/ironsource/wd;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/ironsource/wd;->a(Lcom/ironsource/Q7$a;)V

    .line 259
    sget-object v8, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    invoke-direct {v8, p1, v3}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Ra;)V

    .line 262
    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object p1

    invoke-interface {p1}, Lcom/ironsource/J7;->g()Lcom/ironsource/B7;

    move-result-object p1

    invoke-interface {p1}, Lcom/ironsource/t5;->e()J

    move-result-wide v5

    .line 263
    new-instance v2, Lcom/ironsource/ib$b;

    move-object v4, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, Lcom/ironsource/ib$b;-><init>(Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V

    invoke-direct {v8, v5, v6, v2}, Lcom/ironsource/ib;->a(JLkotlin/jvm/functions/Function0;)V

    .line 264
    invoke-interface {v1, v3}, Lcom/ironsource/I8$a;->a(Lcom/ironsource/Yd;)V

    .line 296
    invoke-virtual {p2}, Lcom/ironsource/Yd;->a()Lcom/ironsource/K1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/K1;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 297
    new-instance v0, Lcom/ironsource/sd;

    sget-object p1, Lcom/ironsource/environment/thread/IronSourceThreadManager;->INSTANCE:Lcom/ironsource/environment/thread/IronSourceThreadManager;

    invoke-virtual {p1}, Lcom/ironsource/environment/thread/IronSourceThreadManager;->getThreadPoolExecutor()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v4

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/ironsource/sd;-><init>(Lcom/ironsource/D7;Lkotlin/jvm/functions/Function0;Lcom/ironsource/J7;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 298
    invoke-virtual {v0, p3}, Lcom/ironsource/sd;->c(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method private final a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z
    .locals 0

    .line 392
    invoke-virtual {p1}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getLegacyAdFormats()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private static final b(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$initRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    invoke-direct {v0, p0, p1, p2}, Lcom/ironsource/ib;->c(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method private final c(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 3
    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getAppKey()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getUserId()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getLegacyAdFormats()Ljava/util/List;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "LevelPlay.init() appkey: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ", userId: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", legacyAdFormats: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/ironsource/k5;

    invoke-direct {v0}, Lcom/ironsource/k5;-><init>()V

    .line 15
    sget-object v1, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getLegacyAdFormats()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 219
    new-array v3, v3, [Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 220
    check-cast v2, [Lcom/unity3d/mediation/LevelPlay$AdFormat;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-virtual {v1, v2}, Lcom/ironsource/jb;->a([Lcom/unity3d/mediation/LevelPlay$AdFormat;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toMutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 221
    new-instance v2, Lcom/ironsource/ge;

    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getAppKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/unity3d/mediation/LevelPlayInitRequest;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4, v1}, Lcom/ironsource/ge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 222
    sget-object v1, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    .line 225
    new-instance v3, Lcom/ironsource/ib$a;

    invoke-direct {v3, p2, p1, v0, p3}, Lcom/ironsource/ib$a;-><init>(Lcom/unity3d/mediation/LevelPlayInitRequest;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    .line 226
    invoke-virtual {v1, p1, v2, v3}, Lcom/ironsource/ne;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Lcom/ironsource/ib;->b:Lcom/ironsource/jb;

    new-instance v1, Lcom/ironsource/ib$$ExternalSyntheticLambda2;

    invoke-direct {v1, p1, p2, p3}, Lcom/ironsource/ib$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/ironsource/Va;

    invoke-direct {v0, p1}, Lcom/ironsource/Va;-><init>(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V

    .line 8
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/p;->b(Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 399
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/ironsource/mediationsdk/p;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final b(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/ironsource/Va;

    invoke-direct {v0, p1}, Lcom/ironsource/Va;-><init>(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V

    .line 4
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object p1

    .line 5
    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/p;->a(Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;)V

    return-void
.end method

.method public final b(Lcom/unity3d/mediation/segment/LevelPlaySegment;)V
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/segment/LevelPlaySegment;)Lcom/ironsource/mediationsdk/IronSourceSegment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/p;->a(Lcom/ironsource/mediationsdk/IronSourceSegment;)V

    return-void
.end method
