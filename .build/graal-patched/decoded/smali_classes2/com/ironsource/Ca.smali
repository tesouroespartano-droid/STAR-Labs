.class public final Lcom/ironsource/Ca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private final b:Lcom/ironsource/M2;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Z)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ca;->a:Lcom/ironsource/xa;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ca;->b:Lcom/ironsource/M2;

    .line 4
    iput-boolean p3, p0, Lcom/ironsource/Ca;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 7

    .line 9
    iget-object v0, p0, Lcom/ironsource/Ca;->a:Lcom/ironsource/xa;

    .line 11
    iget-object v2, p0, Lcom/ironsource/Ca;->b:Lcom/ironsource/M2;

    .line 12
    new-instance v3, Lcom/ironsource/k3$a;

    sget-object v1, Lcom/ironsource/k3$b$a;->a:Lcom/ironsource/k3$b$a;

    invoke-direct {v3, v1}, Lcom/ironsource/k3$a;-><init>(Lcom/ironsource/k3$b;)V

    .line 13
    iget-boolean v5, p0, Lcom/ironsource/Ca;->c:Z

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    .line 14
    invoke-virtual/range {v0 .. v6}, Lcom/ironsource/xa;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/M2;Lcom/ironsource/k3;ZZLjava/lang/Long;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 8

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/ironsource/Ca;->a:Lcom/ironsource/xa;

    .line 3
    iget-object v3, p0, Lcom/ironsource/Ca;->b:Lcom/ironsource/M2;

    .line 6
    new-instance v5, Lcom/ironsource/k3$a;

    sget-object v0, Lcom/ironsource/k3$b$b;->a:Lcom/ironsource/k3$b$b;

    invoke-direct {v5, v0}, Lcom/ironsource/k3$a;-><init>(Lcom/ironsource/k3$b;)V

    .line 7
    iget-boolean v6, p0, Lcom/ironsource/Ca;->c:Z

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .line 8
    invoke-virtual/range {v1 .. v7}, Lcom/ironsource/xa;->a(Lcom/ironsource/s0;Lcom/ironsource/M2;Lcom/ironsource/M2;Lcom/ironsource/k3;ZLjava/lang/Long;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ca;->a:Lcom/ironsource/xa;

    const-string v1, "Loading an ad while loading"

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ca;->b:Lcom/ironsource/M2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ca;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/Ca;->c:Z

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/Ca;->c:Z

    return-void
.end method
