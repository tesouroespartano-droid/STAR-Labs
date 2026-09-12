.class public final Lcom/ironsource/C6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/D6;
.implements Lcom/ironsource/v6;


# instance fields
.field private final a:Lcom/ironsource/y6;

.field private final b:Lcom/ironsource/s6;

.field private c:Lcom/ironsource/s6;


# direct methods
.method public constructor <init>(Lcom/ironsource/y6;Lcom/ironsource/s6;Lcom/ironsource/s6;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    .line 3
    iput-object p2, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    .line 4
    iput-object p3, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    .line 7
    invoke-virtual {p2, p0}, Lcom/ironsource/s6;->a(Lcom/ironsource/v6;)V

    return-void
.end method

.method static synthetic a(Lcom/ironsource/C6;Lcom/ironsource/mediationsdk/logger/IronSourceError;ILjava/lang/Object;)Lcom/ironsource/D6;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 22
    :cond_0
    invoke-direct {p0, p1}, Lcom/ironsource/C6;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Lcom/ironsource/D6;

    move-result-object p0

    return-object p0
.end method

.method private final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Lcom/ironsource/D6;
    .locals 11

    .line 23
    sget-object v0, Lcom/ironsource/e5;->a:Lcom/ironsource/e5;

    invoke-virtual {v0, p1}, Lcom/ironsource/e5;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 24
    new-instance p1, Lcom/ironsource/A6;

    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    iget-object v1, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    iget-object v2, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    const/4 v3, 0x1

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ironsource/A6;-><init>(Lcom/ironsource/y6;Lcom/ironsource/s6;Lcom/ironsource/s6;Z)V

    return-object p1

    .line 27
    :cond_0
    iget-object v6, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    if-nez v6, :cond_1

    new-instance p1, Lcom/ironsource/z6;

    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-direct {p1, v0}, Lcom/ironsource/z6;-><init>(Lcom/ironsource/y6;)V

    return-object p1

    .line 29
    :cond_1
    invoke-virtual {v6}, Lcom/ironsource/s6;->e()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 30
    new-instance v4, Lcom/ironsource/A6;

    iget-object v5, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/ironsource/A6;-><init>(Lcom/ironsource/y6;Lcom/ironsource/s6;Lcom/ironsource/s6;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    .line 31
    :cond_2
    new-instance p1, Lcom/ironsource/B6;

    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v6, v1}, Lcom/ironsource/B6;-><init>(Lcom/ironsource/y6;Lcom/ironsource/s6;Z)V

    return-object p1
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string v0, "show called while showing"

    invoke-virtual {p1, v0}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s6;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string v0, "ad expired while current ad is showing"

    invoke-virtual {p1, v0}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string p2, "progressive show failed while showing current ad"

    invoke-virtual {p1, p2}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_0
    invoke-direct {p0, p2}, Lcom/ironsource/C6;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)Lcom/ironsource/D6;

    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {v0, p1}, Lcom/ironsource/y6;->a(Lcom/ironsource/D6;)V

    .line 15
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {p1}, Lcom/ironsource/y6;->d()Lcom/ironsource/w6;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ironsource/w6;->b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public a(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string p2, "progressive show success while showing current ad"

    invoke-virtual {p1, p2}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {p1}, Lcom/ironsource/y6;->d()Lcom/ironsource/w6;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ironsource/w6;->a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public a(Lcom/unity3d/mediation/rewarded/LevelPlayReward;)V
    .locals 1

    const-string v0, "reward"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {v0}, Lcom/ironsource/y6;->c()Lcom/ironsource/v6;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ironsource/v6;->a(Lcom/unity3d/mediation/rewarded/LevelPlayReward;)V

    return-void
.end method

.method public b(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    const-string p2, "adUnit"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/ironsource/C6;->c:Lcom/ironsource/s6;

    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string p2, "load failed while current ad is showing"

    invoke-virtual {p1, p2}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p2, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    if-ne p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string p2, "load success while current ad is showing"

    invoke-virtual {p1, p2}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p2, p0, Lcom/ironsource/C6;->b:Lcom/ironsource/s6;

    if-ne p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string p2, "ad info changed while current ad is showing"

    invoke-virtual {p1, p2}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {v0}, Lcom/ironsource/y6;->c()Lcom/ironsource/v6;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J0;->g()V

    return-void
.end method

.method public loadAd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    const-string v1, "load called while showing"

    invoke-virtual {v0, v1}, Lcom/ironsource/y6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onClosed()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lcom/ironsource/C6;->a(Lcom/ironsource/C6;Lcom/ironsource/mediationsdk/logger/IronSourceError;ILjava/lang/Object;)Lcom/ironsource/D6;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {v1, v0}, Lcom/ironsource/y6;->a(Lcom/ironsource/D6;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/C6;->a:Lcom/ironsource/y6;

    invoke-virtual {v0}, Lcom/ironsource/y6;->c()Lcom/ironsource/v6;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/v6;->onClosed()V

    return-void
.end method
