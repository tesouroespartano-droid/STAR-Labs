.class public final Lcom/ironsource/za;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Ha;


# instance fields
.field private final a:Lcom/ironsource/xa;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/ironsource/xa;Z)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    .line 3
    iput-boolean p2, p0, Lcom/ironsource/za;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/xa;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ironsource/za;-><init>(Lcom/ironsource/xa;Z)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    const-string v0, "Received load failed before load"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    const-string v0, "Received load success before load"

    invoke-virtual {p1, v0}, Lcom/ironsource/xa;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->j()Lcom/ironsource/O2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ironsource/O2;->a(Z)Lcom/ironsource/M2;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    invoke-virtual {v1}, Lcom/ironsource/xa;->g()Lcom/ironsource/L0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Lcom/ironsource/L0;)V

    .line 5
    new-instance v1, Lcom/ironsource/Ca;

    .line 6
    iget-object v2, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    .line 8
    iget-boolean v3, p0, Lcom/ironsource/za;->b:Z

    .line 9
    invoke-direct {v1, v2, v0, v3}, Lcom/ironsource/Ca;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Z)V

    .line 14
    iget-object v0, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/za;->a:Lcom/ironsource/xa;

    new-instance v1, Lcom/ironsource/Aa;

    invoke-direct {v1, v0}, Lcom/ironsource/Aa;-><init>(Lcom/ironsource/xa;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/za;->b:Z

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/za;->b:Z

    return-void
.end method
