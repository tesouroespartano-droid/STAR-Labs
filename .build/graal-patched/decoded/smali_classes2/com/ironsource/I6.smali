.class public final Lcom/ironsource/I6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/K6;


# instance fields
.field private final a:Lcom/ironsource/E6;

.field private final b:Lcom/ironsource/s6;


# direct methods
.method public constructor <init>(Lcom/ironsource/E6;Lcom/ironsource/s6;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    .line 3
    iput-object p2, p0, Lcom/ironsource/I6;->b:Lcom/ironsource/s6;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    new-instance v1, Lcom/ironsource/F6;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/ironsource/F6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;Z)V

    invoke-virtual {v0, v1}, Lcom/ironsource/E6;->a(Lcom/ironsource/K6;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->d()Lcom/ironsource/w6;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/w6;->a()V

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/I6;->b:Lcom/ironsource/s6;

    iget-object v1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1, v1}, Lcom/ironsource/s6;->a(Landroid/app/Activity;Lcom/ironsource/s6$a;)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    const-string v0, "load failed after ad unit is already loaded"

    invoke-virtual {p1, v0}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 3

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->d()Lcom/ironsource/w6;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ironsource/w6;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    .line 7
    iget-object p1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {p1}, Lcom/ironsource/E6;->b()Lcom/ironsource/t6;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->c()Lcom/ironsource/v6;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/ironsource/t6;->a(ZLcom/ironsource/v6;)Lcom/ironsource/s6;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    .line 9
    new-instance v1, Lcom/ironsource/H6;

    iget-object v2, p0, Lcom/ironsource/I6;->b:Lcom/ironsource/s6;

    invoke-direct {v1, v0, v2, p1}, Lcom/ironsource/H6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;Lcom/ironsource/s6;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/ironsource/E6;->a(Lcom/ironsource/K6;)V

    .line 12
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {p1, v0}, Lcom/ironsource/s6;->a(Lcom/ironsource/s6$b;)V

    return-void
.end method

.method public b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 7

    .line 2
    sget-object v0, Lcom/ironsource/e5;->a:Lcom/ironsource/e5;

    invoke-virtual {v0, p1}, Lcom/ironsource/e5;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v2, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    new-instance v1, Lcom/ironsource/F6;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/ironsource/F6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v1}, Lcom/ironsource/E6;->a(Lcom/ironsource/K6;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->d()Lcom/ironsource/w6;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ironsource/w6;->b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public b(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->d()Lcom/ironsource/w6;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ironsource/w6;->onAdInfoChanged(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public c(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    const-string v0, "Ad unit is already loaded"

    invoke-virtual {p1, v0}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public loadAd()V
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    new-instance v0, Lcom/ironsource/F6;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/ironsource/F6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v0}, Lcom/ironsource/E6;->a(Lcom/ironsource/K6;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/I6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->loadAd()V

    return-void
.end method
