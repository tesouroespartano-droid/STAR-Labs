.class public final Lcom/ironsource/Ba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelPlayBannerReloadAdUnitStrategyNotVisiblePausedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayBannerReloadAdUnitStrategyNotVisiblePausedState.kt\ncom/unity3d/mediation/internal/ads/banner/strategy/bannerReloadAdUnitStrategy/states/LevelPlayBannerReloadAdUnitStrategyNotVisiblePausedState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private final b:Lcom/ironsource/M2;

.field private final c:Ljava/lang/Long;

.field private d:Lcom/ironsource/if$a;

.field private final e:J


# direct methods
.method public static synthetic $r8$lambda$hwl36RSRcuhpRlkC6fVT53sjke8(Lcom/ironsource/Ba;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Ba;->d(Lcom/ironsource/Ba;)V

    return-void
.end method

.method public static synthetic $r8$lambda$mK0i74fg4SxDV36a8r1kgDe4dME(Lcom/ironsource/Ba;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Ba;->c(Lcom/ironsource/Ba;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Ljava/lang/Long;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ba;->b:Lcom/ironsource/M2;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Ba;->c:Ljava/lang/Long;

    .line 8
    invoke-virtual {p1}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object p2

    invoke-interface {p2}, Lcom/ironsource/s4;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ironsource/Ba;->e:J

    .line 11
    invoke-virtual {p1}, Lcom/ironsource/xa;->r()V

    .line 12
    invoke-direct {p0}, Lcom/ironsource/Ba;->f()V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/Ba;)Lcom/ironsource/M2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/Ba;->b:Lcom/ironsource/M2;

    return-object p0
.end method

.method public static final synthetic b(Lcom/ironsource/Ba;)Lcom/ironsource/xa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    return-object p0
.end method

.method private static final c(Lcom/ironsource/Ba;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->a()Lcom/ironsource/n0;

    move-result-object v1

    new-instance v2, Lcom/ironsource/Ba$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/ironsource/Ba$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Ba;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/ironsource/jb;->a(Lcom/ironsource/jb;Ljava/lang/Runnable;JILjava/lang/Object;)V

    return-void
.end method

.method private static final d(Lcom/ironsource/Ba;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->k()Lcom/ironsource/X2;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v0, v1}, Lcom/ironsource/kg;->a(Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    .line 3
    iget-wide v2, p0, Lcom/ironsource/Ba;->e:J

    sub-long v2, v0, v2

    .line 4
    iget-object v4, p0, Lcom/ironsource/Ba;->c:Ljava/lang/Long;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    sub-long v4, v0, v4

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x0

    .line 6
    :goto_0
    new-instance v6, Lcom/ironsource/k3$c;

    .line 9
    new-instance v7, Lcom/ironsource/k3$d$f;

    invoke-direct {v7, v2, v3}, Lcom/ironsource/k3$d$f;-><init>(J)V

    .line 10
    invoke-direct {v6, v4, v5, v7}, Lcom/ironsource/k3$c;-><init>(JLcom/ironsource/k3$d;)V

    .line 16
    iget-object v2, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v2}, Lcom/ironsource/xa;->a()Lcom/ironsource/n0;

    move-result-object v7

    .line 17
    sget-object v2, Lcom/ironsource/Vd;->a:Lcom/ironsource/Vd$a;

    new-instance v3, Lcom/ironsource/Ba$a;

    invoke-direct {v3, p0, v6, v0, v1}, Lcom/ironsource/Ba$a;-><init>(Lcom/ironsource/Ba;Lcom/ironsource/k3$c;J)V

    invoke-virtual {v2, v3}, Lcom/ironsource/Vd$a;->a(Lkotlin/jvm/functions/Function0;)Lcom/ironsource/Vd;

    move-result-object v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    .line 18
    invoke-static/range {v7 .. v12}, Lcom/ironsource/jb;->a(Lcom/ironsource/jb;Lcom/ironsource/Vd;JILjava/lang/Object;)V

    return-void

    .line 26
    :cond_1
    invoke-direct {p0}, Lcom/ironsource/Ba;->f()V

    return-void
.end method

.method private final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->q()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    invoke-virtual {v2}, Lcom/ironsource/xa;->o()Lcom/ironsource/if;

    move-result-object v2

    new-instance v3, Lcom/ironsource/Ba$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/ironsource/Ba$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Ba;)V

    .line 30
    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v4, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v4}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    .line 31
    invoke-interface {v2, v3, v0, v1}, Lcom/ironsource/if;->a(Ljava/lang/Runnable;J)Lcom/ironsource/if$a;

    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/ironsource/Ba;->d:Lcom/ironsource/if$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 3
    iget-object p1, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    const-string v0, "Received load success while paused not visible"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    const-string v0, "Received load success while paused not visible"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    const-string v1, "Loading a loaded ad"

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ba;->d:Lcom/ironsource/if$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/if$a;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ba;->b:Lcom/ironsource/M2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 27
    iget-object v0, p0, Lcom/ironsource/Ba;->d:Lcom/ironsource/if$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/if$a;->a()V

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ba;->a:Lcom/ironsource/xa;

    .line 29
    new-instance v1, Lcom/ironsource/Da;

    .line 30
    iget-object v2, p0, Lcom/ironsource/Ba;->b:Lcom/ironsource/M2;

    .line 31
    invoke-direct {v1, v0, v2}, Lcom/ironsource/Da;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;)V

    .line 32
    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
