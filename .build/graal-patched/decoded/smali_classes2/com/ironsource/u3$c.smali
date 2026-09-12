.class Lcom/ironsource/u3$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/E7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/u3;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/u3;


# direct methods
.method public static synthetic $r8$lambda$apktWkso3MA9fvi9XoAHwvbeFlQ(Lcom/ironsource/u3$c;Lcom/ironsource/E7$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ironsource/u3$c;->b(Lcom/ironsource/E7$a;)V

    return-void
.end method

.method constructor <init>(Lcom/ironsource/u3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private synthetic b(Lcom/ironsource/E7$a;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/ironsource/E7$a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-static {v0}, Lcom/ironsource/u3;->-$$Nest$fgetp(Lcom/ironsource/u3;)Lcom/ironsource/F4;

    move-result-object v1

    iget-object v0, v0, Lcom/ironsource/u3;->I:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/ironsource/F4;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v2, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-static {v2}, Lcom/ironsource/u3;->-$$Nest$fgetr(Lcom/ironsource/u3;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Lcom/ironsource/u3;->-$$Nest$fputt(Lcom/ironsource/u3;I)V

    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "Failed to send events. Saving them back to storage."

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    .line 14
    invoke-virtual {p1}, Lcom/ironsource/E7$a;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ironsource/E7$a;->a()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-static {v0, v1, v2}, Lcom/ironsource/u3;->-$$Nest$ma(Lcom/ironsource/u3;Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-virtual {v1, v0}, Lcom/ironsource/u3;->a(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 20
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 21
    iget-object v1, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-static {v1}, Lcom/ironsource/u3;->-$$Nest$fgetN(Lcom/ironsource/u3;)Lcom/ironsource/mediationsdk/events/ISErrorListener;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 22
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error on sending data "

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, Lcom/ironsource/mediationsdk/events/ISErrorListener;->onError(Ljava/lang/Throwable;)V

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/ironsource/E7$a;->b()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/u3$c;->a(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/ironsource/E7$a;)V
    .locals 2

    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/u3$c;->a:Lcom/ironsource/u3;

    invoke-static {v0}, Lcom/ironsource/u3;->-$$Nest$fgetK(Lcom/ironsource/u3;)Lcom/ironsource/E5;

    move-result-object v0

    new-instance v1, Lcom/ironsource/u3$c$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/u3$c$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/u3$c;Lcom/ironsource/E7$a;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/E5;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/ironsource/B5;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 5
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "clearData exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
