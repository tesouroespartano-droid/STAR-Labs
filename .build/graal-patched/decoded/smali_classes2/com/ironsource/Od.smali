.class public Lcom/ironsource/Od;
.super Lcom/ironsource/u3;
.source "SourceFile"


# static fields
.field private static R:Lcom/ironsource/Od;


# instance fields
.field private P:Ljava/lang/String;

.field private final Q:Lcom/ironsource/M8;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ironsource/u3;-><init>()V

    .line 4
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->s()Lcom/ironsource/M8;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/Od;->Q:Lcom/ironsource/M8;

    .line 6
    const-string v0, "outcome"

    iput-object v0, p0, Lcom/ironsource/u3;->H:Ljava/lang/String;

    const/4 v0, 0x3

    .line 7
    iput v0, p0, Lcom/ironsource/u3;->G:I

    .line 8
    const-string v0, "RV"

    iput-object v0, p0, Lcom/ironsource/u3;->I:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/ironsource/Od;->P:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized i()Lcom/ironsource/Od;
    .locals 2

    const-class v0, Lcom/ironsource/Od;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/ironsource/Od;->R:Lcom/ironsource/Od;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/ironsource/Od;

    invoke-direct {v1}, Lcom/ironsource/Od;-><init>()V

    sput-object v1, Lcom/ironsource/Od;->R:Lcom/ironsource/Od;

    .line 3
    invoke-virtual {v1}, Lcom/ironsource/u3;->e()V

    .line 5
    :cond_0
    sget-object v1, Lcom/ironsource/Od;->R:Lcom/ironsource/Od;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method protected c(Lcom/ironsource/B5;)I
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/ironsource/Od;->Q:Lcom/ironsource/M8;

    sget-object v0, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {p1, v0}, Lcom/ironsource/M8;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result p1

    return p1
.end method

.method protected d()V
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->O:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->P:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->Q:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->R:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->n0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->w0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->x0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->y0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->z0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->A0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v0, p0, Lcom/ironsource/u3;->J:Ljava/util/Set;

    sget-object v1, Lcom/ironsource/C5;->B0:Lcom/ironsource/C5;

    invoke-virtual {v1}, Lcom/ironsource/C5;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected d(Lcom/ironsource/B5;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/ironsource/B5;->c()I

    move-result p1

    .line 2
    sget-object v0, Lcom/ironsource/C5;->b:Lcom/ironsource/C5;

    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->K:Lcom/ironsource/C5;

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->L:Lcom/ironsource/C5;

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->M:Lcom/ironsource/C5;

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->R:Lcom/ironsource/C5;

    .line 6
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->S:Lcom/ironsource/C5;

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->q0:Lcom/ironsource/C5;

    .line 8
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->U:Lcom/ironsource/C5;

    .line 9
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->D0:Lcom/ironsource/C5;

    .line 10
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ironsource/C5;->E0:Lcom/ironsource/C5;

    .line 11
    invoke-virtual {v0}, Lcom/ironsource/C5;->b()I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected e(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_1

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_0

    const/16 v0, 0x190

    if-ge p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    const-string p1, ""

    return-object p1

    .line 2
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ironsource/Od;->P:Ljava/lang/String;

    return-object p1
.end method

.method protected f(Lcom/ironsource/B5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/ironsource/B5;->c()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/ironsource/B5;->c()I

    move-result v0

    const/16 v1, 0x12c

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/B5;->c()I

    move-result v0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 2
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/ironsource/B5;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "placement"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/Od;->P:Ljava/lang/String;

    return-void
.end method

.method protected j(Lcom/ironsource/B5;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
