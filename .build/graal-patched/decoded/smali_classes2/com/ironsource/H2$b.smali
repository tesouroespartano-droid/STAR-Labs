.class Lcom/ironsource/H2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/D3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/H2;->c(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/s3;

.field final synthetic b:Lcom/ironsource/H2;


# direct methods
.method constructor <init>(Lcom/ironsource/H2;Lcom/ironsource/s3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    iput-object p2, p0, Lcom/ironsource/H2$b;->a:Lcom/ironsource/s3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2$b;->a:Lcom/ironsource/s3;

    check-cast v0, Lcom/ironsource/L2;

    invoke-virtual {v0}, Lcom/ironsource/L2;->Q()V

    .line 2
    iget-object v0, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    iget-object v1, v0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v1, v1, Lcom/ironsource/D0;->i:Lcom/ironsource/M;

    invoke-virtual {v0}, Lcom/ironsource/p3;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/M;->j(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    invoke-static {v0}, Lcom/ironsource/H2;->-$$Nest$fgetQ(Lcom/ironsource/H2;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    iget-object v0, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    invoke-static {v0}, Lcom/ironsource/H2;->-$$Nest$mW(Lcom/ironsource/H2;)V

    .line 11
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "start binding timer after impression, expected interval = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    iget-object v2, v2, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 13
    invoke-virtual {v2}, Lcom/ironsource/U;->h()Lcom/ironsource/N0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/N0;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", current timestamp = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/ironsource/H2$b;->b:Lcom/ironsource/H2;

    invoke-static {v0}, Lcom/ironsource/H2;->-$$Nest$mO(Lcom/ironsource/H2;)Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->h()V

    return-void
.end method
