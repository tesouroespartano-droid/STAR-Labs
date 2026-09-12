.class public final Lcom/ironsource/Ga;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private final b:Lcom/ironsource/M2;

.field private final c:Lcom/ironsource/M2;

.field private final d:J


# direct methods
.method public constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/M2;J)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadingAdUnit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ga;->b:Lcom/ironsource/M2;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Ga;->c:Lcom/ironsource/M2;

    .line 5
    iput-wide p4, p0, Lcom/ironsource/Ga;->d:J

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 9

    .line 16
    iget-object v0, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/Ga;->d:J

    sub-long/2addr v0, v2

    .line 18
    new-instance v5, Lcom/ironsource/k3$c;

    .line 19
    sget-object v2, Lcom/ironsource/k3$d$c;->a:Lcom/ironsource/k3$d$c;

    .line 20
    invoke-direct {v5, v0, v1, v2}, Lcom/ironsource/k3$c;-><init>(JLcom/ironsource/k3$d;)V

    .line 23
    iget-object v2, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    .line 25
    iget-object v4, p0, Lcom/ironsource/Ga;->b:Lcom/ironsource/M2;

    .line 29
    iget-wide v0, p0, Lcom/ironsource/Ga;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, p1

    .line 30
    invoke-virtual/range {v2 .. v8}, Lcom/ironsource/xa;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/M2;Lcom/ironsource/k3;ZZLjava/lang/Long;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 9

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->p()Lcom/ironsource/s4;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/Ga;->d:J

    sub-long/2addr v0, v2

    .line 3
    new-instance v6, Lcom/ironsource/k3$c;

    .line 4
    sget-object v2, Lcom/ironsource/k3$d$d;->a:Lcom/ironsource/k3$d$d;

    .line 5
    invoke-direct {v6, v0, v1, v2}, Lcom/ironsource/k3$c;-><init>(JLcom/ironsource/k3$d;)V

    .line 8
    iget-object v2, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    .line 10
    iget-object v4, p0, Lcom/ironsource/Ga;->c:Lcom/ironsource/M2;

    .line 11
    iget-object v5, p0, Lcom/ironsource/Ga;->b:Lcom/ironsource/M2;

    .line 14
    iget-wide v0, p0, Lcom/ironsource/Ga;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v7, 0x0

    move-object v3, p1

    .line 15
    invoke-virtual/range {v2 .. v8}, Lcom/ironsource/xa;->a(Lcom/ironsource/s0;Lcom/ironsource/M2;Lcom/ironsource/M2;Lcom/ironsource/k3;ZLjava/lang/Long;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    const-string v1, "Loading an ad while reloading after timer finished"

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ga;->b:Lcom/ironsource/M2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ga;->c:Lcom/ironsource/M2;

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ga;->a:Lcom/ironsource/xa;

    .line 2
    new-instance v1, Lcom/ironsource/Da;

    iget-object v2, p0, Lcom/ironsource/Ga;->b:Lcom/ironsource/M2;

    invoke-direct {v1, v0, v2}, Lcom/ironsource/Da;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
