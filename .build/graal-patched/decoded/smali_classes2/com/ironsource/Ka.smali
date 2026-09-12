.class public final Lcom/ironsource/Ka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Oa;


# instance fields
.field private final a:Lcom/ironsource/Ja;


# direct methods
.method public constructor <init>(Lcom/ironsource/Ja;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    const-string v0, "Received load failed before load called"

    invoke-virtual {p1, v0}, Lcom/ironsource/Ja;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "adUnitCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    const-string v0, "Received load success before load called"

    invoke-virtual {p1, v0}, Lcom/ironsource/Ja;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    invoke-virtual {v0}, Lcom/ironsource/Ja;->i()Lcom/ironsource/O2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ironsource/O2;->a(Z)Lcom/ironsource/M2;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    invoke-virtual {v1, v0}, Lcom/ironsource/Ja;->a(Lcom/ironsource/M2;)V

    .line 3
    iget-object v1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    new-instance v2, Lcom/ironsource/Na;

    invoke-direct {v2, v1, v0}, Lcom/ironsource/Na;-><init>(Lcom/ironsource/Ja;Lcom/ironsource/M2;)V

    invoke-virtual {v1, v2}, Lcom/ironsource/Ja;->a(Lcom/ironsource/Oa;)V

    .line 4
    iget-object v1, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    invoke-virtual {v1}, Lcom/ironsource/Ja;->g()Lcom/ironsource/L0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Lcom/ironsource/L0;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    invoke-virtual {v0}, Lcom/ironsource/Ja;->k()Lcom/ironsource/M2;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Z)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/Ja;->a(Lcom/ironsource/M2;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/Ka;->a:Lcom/ironsource/Ja;

    new-instance v1, Lcom/ironsource/La;

    invoke-direct {v1, v0}, Lcom/ironsource/La;-><init>(Lcom/ironsource/Ja;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/Ja;->a(Lcom/ironsource/Oa;)V

    return-void
.end method
