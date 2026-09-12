.class public final Lcom/ironsource/Ja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ta;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlayBannerSingleAdUnitStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayBannerSingleAdUnitStrategy.kt\ncom/unity3d/mediation/internal/ads/banner/strategy/bannerSingleAdUnitStrategy/LevelPlayBannerSingleAdUnitStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/n0;

.field private final b:Lcom/ironsource/X2;

.field private final c:Lcom/ironsource/O2;

.field private d:Lcom/ironsource/ua;

.field private e:Lcom/ironsource/Oa;

.field private f:Lcom/ironsource/M2;

.field private final g:Lcom/ironsource/L0;

.field private final h:Lcom/ironsource/x0;

.field private final i:Lcom/ironsource/P2;


# direct methods
.method public constructor <init>(Lcom/ironsource/n0;Lcom/ironsource/X2;Lcom/ironsource/O2;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdUnitFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ja;->a:Lcom/ironsource/n0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ja;->b:Lcom/ironsource/X2;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Ja;->c:Lcom/ironsource/O2;

    .line 9
    new-instance p1, Lcom/ironsource/Ka;

    invoke-direct {p1, p0}, Lcom/ironsource/Ka;-><init>(Lcom/ironsource/Ja;)V

    iput-object p1, p0, Lcom/ironsource/Ja;->e:Lcom/ironsource/Oa;

    .line 13
    new-instance p1, Lcom/ironsource/Ja$b;

    invoke-direct {p1, p0}, Lcom/ironsource/Ja$b;-><init>(Lcom/ironsource/Ja;)V

    iput-object p1, p0, Lcom/ironsource/Ja;->g:Lcom/ironsource/L0;

    .line 24
    new-instance p1, Lcom/ironsource/Ja$c;

    invoke-direct {p1, p0}, Lcom/ironsource/Ja$c;-><init>(Lcom/ironsource/Ja;)V

    iput-object p1, p0, Lcom/ironsource/Ja;->h:Lcom/ironsource/x0;

    .line 35
    new-instance p1, Lcom/ironsource/Ja$a;

    invoke-direct {p1, p0}, Lcom/ironsource/Ja$a;-><init>(Lcom/ironsource/Ja;)V

    iput-object p1, p0, Lcom/ironsource/Ja;->i:Lcom/ironsource/P2;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->a:Lcom/ironsource/n0;

    return-object v0
.end method

.method public final a(Lcom/ironsource/M2;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ironsource/Ja;->f:Lcom/ironsource/M2;

    return-void
.end method

.method public final a(Lcom/ironsource/Oa;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ja;->e:Lcom/ironsource/Oa;

    return-void
.end method

.method public final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ironsource/Ja;->d:Lcom/ironsource/ua;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ironsource/ua;->onAdLoadFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/ironsource/s0;Lcom/ironsource/M2;)V
    .locals 2

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/Ja;->b:Lcom/ironsource/X2;

    invoke-virtual {v0}, Lcom/ironsource/X2;->getViewBinder()Lcom/ironsource/eg;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Ja;->h:Lcom/ironsource/x0;

    invoke-virtual {p2, v0, v1}, Lcom/ironsource/M2;->a(Lcom/ironsource/eg;Lcom/ironsource/x0;)V

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/s0;->c()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/ironsource/Ja;->d:Lcom/ironsource/ua;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/ironsource/ua;->onAdLoaded(Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/ironsource/ua;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iput-object p1, p0, Lcom/ironsource/Ja;->d:Lcom/ironsource/ua;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/Ja;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Banner Single Ad Unit Strategy - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/Sf;->f(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ja;->e:Lcom/ironsource/Oa;

    invoke-interface {v0}, Lcom/ironsource/Oa;->b()V

    return-void
.end method

.method public final b(Lcom/ironsource/ua;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Ja;->d:Lcom/ironsource/ua;

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->e:Lcom/ironsource/Oa;

    invoke-interface {v0}, Lcom/ironsource/Oa;->c()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public final f()Lcom/ironsource/P2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->i:Lcom/ironsource/P2;

    return-object v0
.end method

.method public final g()Lcom/ironsource/L0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->g:Lcom/ironsource/L0;

    return-object v0
.end method

.method public final h()Lcom/ironsource/x0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->h:Lcom/ironsource/x0;

    return-object v0
.end method

.method public final i()Lcom/ironsource/O2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->c:Lcom/ironsource/O2;

    return-object v0
.end method

.method public final j()Lcom/ironsource/X2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->b:Lcom/ironsource/X2;

    return-object v0
.end method

.method public final k()Lcom/ironsource/M2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->f:Lcom/ironsource/M2;

    return-object v0
.end method

.method public final l()Lcom/ironsource/Oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->e:Lcom/ironsource/Oa;

    return-object v0
.end method

.method public final m()Lcom/ironsource/ua;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ja;->d:Lcom/ironsource/ua;

    return-object v0
.end method
