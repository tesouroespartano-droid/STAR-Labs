.class public final Lcom/ironsource/y6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/x6;
.implements Lcom/ironsource/s6$b;
.implements Lcom/ironsource/s6$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/y6$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/ironsource/y6$a;

.field public static final g:Ljava/lang/String; = "Fullscreen ProgressiveOnLoaded Strategy"


# instance fields
.field private final a:Lcom/ironsource/n0;

.field private final b:Lcom/ironsource/t6;

.field private final c:Lcom/ironsource/v6;

.field private final d:Lcom/ironsource/w6;

.field private e:Lcom/ironsource/D6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/y6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/y6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/y6;->f:Lcom/ironsource/y6$a;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/n0;Lcom/ironsource/t6;Lcom/ironsource/v6;Lcom/ironsource/w6;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fullscreenAdUnitListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/y6;->a:Lcom/ironsource/n0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/y6;->b:Lcom/ironsource/t6;

    .line 4
    iput-object p3, p0, Lcom/ironsource/y6;->c:Lcom/ironsource/v6;

    .line 5
    iput-object p4, p0, Lcom/ironsource/y6;->d:Lcom/ironsource/w6;

    .line 7
    new-instance p1, Lcom/ironsource/z6;

    invoke-direct {p1, p0}, Lcom/ironsource/z6;-><init>(Lcom/ironsource/y6;)V

    iput-object p1, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/y6;->a:Lcom/ironsource/n0;

    return-object v0
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1}, Lcom/ironsource/D6;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public final a(Lcom/ironsource/D6;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    return-void
.end method

.method public a(Lcom/ironsource/s6;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1}, Lcom/ironsource/D6;->a(Lcom/ironsource/s6;)V

    return-void
.end method

.method public a(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/D6;->a(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public a(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/D6;->a(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/y6;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fullscreen ProgressiveOnLoaded Strategy - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/Sf;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final b()Lcom/ironsource/t6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/y6;->b:Lcom/ironsource/t6;

    return-object v0
.end method

.method public b(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/D6;->b(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public b(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/D6;->b(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public final c()Lcom/ironsource/v6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/y6;->c:Lcom/ironsource/v6;

    return-object v0
.end method

.method public c(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/D6;->c(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    return-void
.end method

.method public final d()Lcom/ironsource/w6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/y6;->d:Lcom/ironsource/w6;

    return-object v0
.end method

.method public loadAd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/y6;->e:Lcom/ironsource/D6;

    invoke-interface {v0}, Lcom/ironsource/D6;->loadAd()V

    return-void
.end method
