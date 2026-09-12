.class public final Lcom/ironsource/Id;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lcom/ironsource/Md;Z)Lcom/ironsource/N0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ironsource/Id;->b(Lcom/ironsource/Md;Z)Lcom/ironsource/N0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/ironsource/Md;Z)Lcom/ironsource/N0;
    .locals 8

    if-eqz p1, :cond_0

    .line 1
    sget-object p1, Lcom/ironsource/N0$a;->a:Lcom/ironsource/N0$a;

    :goto_0
    move-object v1, p1

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/Md;->k()Lcom/ironsource/p2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/p2;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    sget-object p1, Lcom/ironsource/N0$a;->e:Lcom/ironsource/N0$a;

    goto :goto_0

    .line 5
    :cond_1
    sget-object p1, Lcom/ironsource/N0$a;->d:Lcom/ironsource/N0$a;

    goto :goto_0

    .line 8
    :goto_1
    new-instance v0, Lcom/ironsource/N0;

    .line 10
    invoke-virtual {p0}, Lcom/ironsource/Md;->k()Lcom/ironsource/p2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/p2;->j()J

    move-result-wide v2

    .line 11
    invoke-virtual {p0}, Lcom/ironsource/Md;->k()Lcom/ironsource/p2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ironsource/p2;->b()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    .line 12
    invoke-direct/range {v0 .. v7}, Lcom/ironsource/N0;-><init>(Lcom/ironsource/N0$a;JJJ)V

    return-object v0
.end method
