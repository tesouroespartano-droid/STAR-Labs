.class public Lcom/ironsource/mediationsdk/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/ironsource/V2;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/V2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/mediationsdk/k;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/ironsource/mediationsdk/k;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/ironsource/p2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/ironsource/V2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->f()I

    move-result v0

    return v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->h()I

    move-result v0

    return v0
.end method

.method public g()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/k;->c:Lcom/ironsource/V2;

    invoke-virtual {v0}, Lcom/ironsource/V2;->d()Lcom/ironsource/p2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/p2;->g()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
