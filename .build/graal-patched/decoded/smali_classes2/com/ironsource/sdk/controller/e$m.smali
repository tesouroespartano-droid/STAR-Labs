.class Lcom/ironsource/sdk/controller/e$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/sdk/controller/e;->a(Lcom/ironsource/q8$e;Lcom/ironsource/X4;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/ironsource/sdk/controller/e;


# direct methods
.method constructor <init>(Lcom/ironsource/sdk/controller/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    iput-object p2, p0, Lcom/ironsource/sdk/controller/e$m;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/sdk/controller/e$m;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v0}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/ironsource/zg;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v2}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Lcom/ironsource/zg;->d()Lcom/ironsource/g4;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v3}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Lcom/ironsource/zg;->f()Lcom/ironsource/Y4;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v4}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v4

    .line 6
    invoke-virtual {v4}, Lcom/ironsource/zg;->e()I

    move-result v4

    iget-object v5, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v5}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v5

    .line 7
    invoke-virtual {v5}, Lcom/ironsource/zg;->g()Lcom/ironsource/i5;

    move-result-object v5

    iget-object v6, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v6}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgeth(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/zg;

    move-result-object v6

    .line 8
    invoke-virtual {v6}, Lcom/ironsource/zg;->c()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/ironsource/sdk/controller/e$m;->a:Ljava/lang/String;

    iget-object v8, p0, Lcom/ironsource/sdk/controller/e$m;->b:Ljava/lang/String;

    .line 9
    invoke-static/range {v0 .. v8}, Lcom/ironsource/sdk/controller/e;->-$$Nest$mb(Lcom/ironsource/sdk/controller/e;Landroid/content/Context;Lcom/ironsource/g4;Lcom/ironsource/Y4;ILcom/ironsource/i5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ironsource/sdk/controller/v;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fputb(Lcom/ironsource/sdk/controller/e;Lcom/ironsource/sdk/controller/l;)V

    .line 18
    iget-object v0, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v0}, Lcom/ironsource/sdk/controller/e;->-$$Nest$fgetb(Lcom/ironsource/sdk/controller/e;)Lcom/ironsource/sdk/controller/l;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/sdk/controller/l;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 20
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 21
    iget-object v1, p0, Lcom/ironsource/sdk/controller/e$m;->c:Lcom/ironsource/sdk/controller/e;

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ironsource/sdk/controller/e;->-$$Nest$md(Lcom/ironsource/sdk/controller/e;Ljava/lang/String;)V

    return-void
.end method
