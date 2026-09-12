.class Lcom/ironsource/h3;
.super Lcom/ironsource/P0;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/ironsource/N0;Lcom/ironsource/tb;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/P0;-><init>(Lcom/ironsource/N0;Lcom/ironsource/tb;)V

    return-void
.end method

.method private n()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private p()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/P0;->i()V

    :cond_0
    return-void
.end method

.method m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/P0;->i()V

    :cond_0
    return-void
.end method

.method o()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    sget-object v1, Lcom/ironsource/N0$a;->c:Lcom/ironsource/N0$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method q()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ironsource/P0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ironsource/P0;->a(J)V

    :cond_0
    return-void
.end method

.method r()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ironsource/h3;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "banner reload interval is disabled"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/ironsource/h3;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 8
    invoke-virtual {p0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ironsource/P0;->a(J)V

    :cond_1
    return-void
.end method
