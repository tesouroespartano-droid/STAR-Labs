.class public final Lcom/ironsource/s6$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/tg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/s6;->a()Lcom/ironsource/tg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFullscreenAdUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullscreenAdUnit.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/FullscreenAdUnit$createWaterfallListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/s6;


# direct methods
.method constructor <init>(Lcom/ironsource/s6;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 8

    const-string v0, "errorReason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->f(Lcom/ironsource/s6;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v1}, Lcom/ironsource/s6;->d(Lcom/ironsource/s6;)Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v1}, Lcom/ironsource/s6;->b(Lcom/ironsource/s6;)Lcom/ironsource/V0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/D5;->e()Lcom/ironsource/nb;

    move-result-object v2

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    move-wide v3, v0

    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->a(Lcom/ironsource/s6;)Lcom/ironsource/v0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/v0;->u()Z

    move-result v7

    move v5, p1

    move-object v6, p2

    .line 4
    invoke-virtual/range {v2 .. v7}, Lcom/ironsource/nb;->a(JILjava/lang/String;Z)V

    .line 6
    iget-object p1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {p1}, Lcom/ironsource/s6;->e(Lcom/ironsource/s6;)Lcom/ironsource/s6$b;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    new-instance v0, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-direct {v0, v5, v6}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, p2, v0}, Lcom/ironsource/s6$b;->b(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_2
    return-void
.end method

.method public a(Lcom/ironsource/z;)V
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->b(Lcom/ironsource/s6;)Lcom/ironsource/V0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v1}, Lcom/ironsource/s6;->c(Lcom/ironsource/s6;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->e(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->g(Lcom/ironsource/s6;)V

    .line 9
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->e(Lcom/ironsource/s6;)Lcom/ironsource/s6$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-virtual {p1}, Lcom/ironsource/z;->e()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ironsource/s6$b;->c(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/ironsource/z;)V
    .locals 4

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->f(Lcom/ironsource/s6;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v1}, Lcom/ironsource/s6;->d(Lcom/ironsource/s6;)Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v1}, Lcom/ironsource/s6;->b(Lcom/ironsource/s6;)Lcom/ironsource/V0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/D5;->e()Lcom/ironsource/nb;

    move-result-object v1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    const-wide/16 v2, 0x0

    :goto_1
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->a(Lcom/ironsource/s6;)Lcom/ironsource/v0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/v0;->u()Z

    move-result v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/ironsource/nb;->a(JZ)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->g(Lcom/ironsource/s6;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-static {v0}, Lcom/ironsource/s6;->e(Lcom/ironsource/s6;)Lcom/ironsource/s6$b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/ironsource/s6$c;->a:Lcom/ironsource/s6;

    invoke-virtual {p1}, Lcom/ironsource/z;->e()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ironsource/s6$b;->b(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    :cond_2
    return-void
.end method
