.class public final Lcom/ironsource/Da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private final b:Lcom/ironsource/M2;


# direct methods
.method public constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentAdUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Da;->b:Lcom/ironsource/M2;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    const-string v0, "Received load failed while paused"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    const-string v0, "Received load success while paused"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    const-string v1, "Loading a loaded ad"

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Da;->b:Lcom/ironsource/M2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/Da;->a:Lcom/ironsource/xa;

    .line 2
    iget-object v1, p0, Lcom/ironsource/Da;->b:Lcom/ironsource/M2;

    .line 4
    new-instance v2, Lcom/ironsource/k3$a;

    .line 5
    sget-object v3, Lcom/ironsource/k3$b$c;->a:Lcom/ironsource/k3$b$c;

    .line 6
    invoke-direct {v2, v3}, Lcom/ironsource/k3$a;-><init>(Lcom/ironsource/k3$b;)V

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/ironsource/xa;->a(Lcom/ironsource/M2;Lcom/ironsource/k3;)V

    return-void
.end method
