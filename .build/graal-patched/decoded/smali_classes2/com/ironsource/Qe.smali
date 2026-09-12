.class public final Lcom/ironsource/Qe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/zb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ironsource/zb<",
        "Lcom/ironsource/Ke;",
        "Lcom/ironsource/u;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Ke;)Lcom/ironsource/u;
    .locals 8

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/ironsource/u;

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/Ke;->b()Lcom/ironsource/Re;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/Ke;->a()Lcom/ironsource/N;

    move-result-object v0

    const-string v3, "0"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/N;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v3

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/ironsource/Ke;->a()Lcom/ironsource/N;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/ironsource/N;->i()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    move-object v4, v3

    .line 7
    :cond_3
    invoke-virtual {p1}, Lcom/ironsource/Ke;->a()Lcom/ironsource/N;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/ironsource/N;->g()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    :cond_4
    move-object v5, v3

    .line 8
    :cond_5
    invoke-virtual {p1}, Lcom/ironsource/Ke;->a()Lcom/ironsource/N;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/ironsource/N;->e()Lcom/ironsource/U7;

    move-result-object v6

    if-nez v6, :cond_7

    :cond_6
    sget-object v6, Lcom/ironsource/U7;->c:Lcom/ironsource/U7;

    .line 9
    :cond_7
    invoke-virtual {p1}, Lcom/ironsource/Ke;->a()Lcom/ironsource/N;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/ironsource/N;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move-object v7, p1

    goto :goto_1

    :cond_9
    :goto_0
    move-object v7, v3

    :goto_1
    move-object v3, v0

    .line 10
    invoke-direct/range {v1 .. v7}, Lcom/ironsource/u;-><init>(Lcom/ironsource/Re;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/U7;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/ironsource/Ke;

    invoke-virtual {p0, p1}, Lcom/ironsource/Qe;->a(Lcom/ironsource/Ke;)Lcom/ironsource/u;

    move-result-object p1

    return-object p1
.end method
