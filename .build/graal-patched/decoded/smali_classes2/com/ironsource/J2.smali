.class public final Lcom/ironsource/J2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lcom/ironsource/V2;)Lcom/ironsource/N0;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ironsource/J2;->b(Lcom/ironsource/V2;)Lcom/ironsource/N0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/ironsource/V2;)Lcom/ironsource/N0;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/N0$a;->c:Lcom/ironsource/N0$a;

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/ironsource/N0$a;->b:Lcom/ironsource/N0$a;

    :goto_0
    move-object v2, v0

    .line 7
    new-instance v1, Lcom/ironsource/N0;

    .line 9
    invoke-virtual {p0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->j()J

    move-result-wide v3

    .line 10
    invoke-virtual {p0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->b()J

    move-result-wide v5

    .line 11
    invoke-virtual {p0}, Lcom/ironsource/V2;->h()I

    move-result p0

    int-to-long v7, p0

    const-wide/16 v9, 0x3e8

    mul-long/2addr v7, v9

    .line 12
    invoke-direct/range {v1 .. v8}, Lcom/ironsource/N0;-><init>(Lcom/ironsource/N0$a;JJJ)V

    return-object v1
.end method
