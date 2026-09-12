.class public Lcom/ironsource/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/o0;


# direct methods
.method public constructor <init>(Lcom/ironsource/o0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/z;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-static {p1}, Lcom/ironsource/o0;->a(Lcom/ironsource/o0;)Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {v0}, Lcom/ironsource/o0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/M;->a(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-static {p1}, Lcom/ironsource/o0;->b(Lcom/ironsource/o0;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/J0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ironsource/J0;->g()V

    :cond_0
    return-void
.end method

.method public b(Lcom/ironsource/z;)V
    .locals 3

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {p1}, Lcom/ironsource/z;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/o0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {v0}, Lcom/ironsource/o0;->k()Lcom/ironsource/mg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/mg;->b(Lcom/ironsource/z;)V

    .line 3
    iget-object p1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-static {p1}, Lcom/ironsource/o0;->a(Lcom/ironsource/o0;)Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {v0}, Lcom/ironsource/o0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/M;->g(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {p1}, Lcom/ironsource/o0;->f()Lcom/ironsource/V0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/V0;->l()Lcom/ironsource/M8$a;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/ironsource/o0$a;->a:Lcom/ironsource/o0;

    invoke-virtual {v0}, Lcom/ironsource/o0;->e()Lcom/ironsource/v0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ironsource/M8$a;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    return-void
.end method
