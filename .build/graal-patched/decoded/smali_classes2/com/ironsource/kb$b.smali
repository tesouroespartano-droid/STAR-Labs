.class Lcom/ironsource/kb$b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/kb;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/kb;


# direct methods
.method constructor <init>(Lcom/ironsource/kb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/kb$b;->a:Lcom/ironsource/kb;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/kb$b;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgeta(Lcom/ironsource/kb;)Lcom/ironsource/lifecycle/b;

    move-result-object v1

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetf(Lcom/ironsource/kb;)Lcom/ironsource/ca;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/lifecycle/b;->b(Lcom/ironsource/ca;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/kb$b;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetc(Lcom/ironsource/kb;)Lcom/ironsource/Lf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Lf;->b()V

    .line 3
    iget-object v0, p0, Lcom/ironsource/kb$b;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetb(Lcom/ironsource/kb;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
