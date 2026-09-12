.class public final Lcom/ironsource/n6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/r6;


# instance fields
.field private final a:Lcom/ironsource/Ta;

.field private b:Lcom/unity3d/mediation/LevelPlayAdInfo;

.field private final c:Lcom/ironsource/s4;

.field private final d:J


# direct methods
.method public static synthetic $r8$lambda$-Gm-G7-2OFv5F4tu8JCDx4p0vgs(Lcom/ironsource/n6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/n6;->a(Lcom/ironsource/n6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/Ta;Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/ironsource/s4;)V
    .locals 1

    const-string v0, "adInternal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    .line 3
    iput-object p2, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 4
    iput-object p3, p0, Lcom/ironsource/n6;->c:Lcom/ironsource/s4;

    .line 6
    invoke-interface {p3}, Lcom/ironsource/s4;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ironsource/n6;->d:J

    return-void
.end method

.method private static final a(Lcom/ironsource/n6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object p0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {p0}, Lcom/ironsource/Ta;->k()Lcom/ironsource/Ua;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lcom/ironsource/Ua;->onAdInfoChanged(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method private final d()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->c:Lcom/ironsource/s4;

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/n6;->d:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 6
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v1}, Lcom/ironsource/Ta;->f()Lcom/ironsource/n0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "onAdExpired"

    invoke-static {v1, v4, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    sget-object v1, Lcom/ironsource/j6$a;->c:Lcom/ironsource/j6$a;

    invoke-virtual {v0, v1}, Lcom/ironsource/Ta;->a(Lcom/ironsource/j6$a;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v0}, Lcom/ironsource/Ta;->f()Lcom/ironsource/n0;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v1}, Lcom/ironsource/Ta;->d()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/ironsource/n0;->a(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/Placement;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/unity3d/mediation/LevelPlayAdInfo;

    iget-object v2, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-direct {v1, v2, p2}, Lcom/unity3d/mediation/LevelPlayAdInfo;-><init>(Lcom/unity3d/mediation/LevelPlayAdInfo;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 4
    iget-object p2, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    new-instance v2, Lcom/ironsource/p6;

    invoke-direct {v2, p2, v1}, Lcom/ironsource/p6;-><init>(Lcom/ironsource/Ta;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    invoke-virtual {p2, v2}, Lcom/ironsource/Ta;->a(Lcom/ironsource/r6;)V

    .line 5
    iget-object p2, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {p2}, Lcom/ironsource/Ta;->c()Lcom/ironsource/g6;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/ironsource/g6;->a(Landroid/app/Activity;Lcom/ironsource/mediationsdk/model/Placement;)V

    return-void
.end method

.method public a(Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    .line 10
    invoke-virtual {p1}, Lcom/unity3d/mediation/LevelPlayAdError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAdDisplayFailed on loaded state with error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()Lcom/unity3d/mediation/LevelPlayAdInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    return-object v0
.end method

.method public c()Lcom/ironsource/i0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v0}, Lcom/ironsource/Ta;->l()Lcom/ironsource/J7;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Lcom/ironsource/J7;->f()Lcom/ironsource/r7;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v1}, Lcom/ironsource/Ta;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ironsource/r7;->a(Ljava/lang/String;)Lcom/ironsource/N3;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/N3;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    sget-object v1, Lcom/ironsource/i0$a;->c:Lcom/ironsource/i0$a$a;

    invoke-virtual {v0}, Lcom/ironsource/N3;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/i0$a$a;->a(Ljava/lang/String;)Lcom/ironsource/i0$a;

    move-result-object v0

    return-object v0

    .line 7
    :cond_0
    sget-object v0, Lcom/ironsource/i0$b;->a:Lcom/ironsource/i0$b;

    return-object v0
.end method

.method public loadAd()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ironsource/n6;->d()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v2}, Lcom/ironsource/Ta;->f()Lcom/ironsource/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ironsource/Sf;->a(Ljava/lang/Long;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    iget-object v1, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-virtual {v0, v1}, Lcom/ironsource/Ta;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public onAdClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    const-string v1, "onAdClicked on loaded state"

    invoke-virtual {v0, v1}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    const-string v1, "onAdClosed on loaded state"

    invoke-virtual {v0, v1}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onAdDisplayed(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    const-string v0, "onAdDisplayed on loaded state"

    invoke-virtual {p1, v0}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onAdInfoChanged(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 5

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    invoke-virtual {v0}, Lcom/ironsource/Ta;->f()Lcom/ironsource/n0;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onAdInfoChanged adInfo: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v3}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    invoke-virtual {v1, v2, p1}, Lcom/ironsource/Sf;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    .line 4
    iput-object p1, p0, Lcom/ironsource/n6;->b:Lcom/unity3d/mediation/LevelPlayAdInfo;

    .line 5
    new-instance v1, Lcom/ironsource/n6$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/n6$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/n6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdLoadFailed(Lcom/unity3d/mediation/LevelPlayAdError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    .line 2
    invoke-virtual {p1}, Lcom/unity3d/mediation/LevelPlayAdError;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAdLoadFailed on loaded state with error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/n6;->a:Lcom/ironsource/Ta;

    const-string v0, "onAdLoaded on loaded state"

    invoke-virtual {p1, v0}, Lcom/ironsource/Ta;->a(Ljava/lang/String;)V

    return-void
.end method
