.class Lcom/ironsource/mediationsdk/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/mediationsdk/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/mediationsdk/w;


# direct methods
.method constructor <init>(Lcom/ironsource/mediationsdk/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgetl(Lcom/ironsource/mediationsdk/w;)Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "errorCode"

    if-nez v3, :cond_0

    .line 2
    :try_start_1
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v3, "mIronSourceBanner is null"

    invoke-virtual {v2, v3}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    sget-object v3, Lcom/ironsource/C5;->t2:Lcom/ironsource/C5;

    const/16 v5, 0x26e

    .line 5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    new-array v5, v1, [[Ljava/lang/Object;

    aput-object v4, v5, v0

    .line 6
    invoke-static {v2, v3, v5}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_0
    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/w;->o()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 13
    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$mv(Lcom/ironsource/mediationsdk/w;)V

    return-void

    .line 17
    :cond_1
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v3, "banner is not visible, reload skipped"

    invoke-virtual {v2, v3}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 18
    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    sget-object v3, Lcom/ironsource/C5;->t2:Lcom/ironsource/C5;

    const/16 v5, 0x265

    .line 20
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    new-array v5, v1, [[Ljava/lang/Object;

    aput-object v4, v5, v0

    .line 21
    invoke-static {v2, v3, v5}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 25
    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgetk(Lcom/ironsource/mediationsdk/w;)Lcom/ironsource/kb;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgeti(Lcom/ironsource/mediationsdk/w;)Lcom/ironsource/mediationsdk/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/k;->f()I

    move-result v2

    int-to-long v5, v2

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/ironsource/kb;->a(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v2

    .line 28
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 29
    iget-object v3, p0, Lcom/ironsource/mediationsdk/w$c;->a:Lcom/ironsource/mediationsdk/w;

    sget-object v4, Lcom/ironsource/C5;->Q5:Lcom/ironsource/C5;

    .line 31
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v5, "reason"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v2

    new-array v1, v1, [[Ljava/lang/Object;

    aput-object v2, v1, v0

    .line 32
    invoke-static {v3, v4, v1}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method
