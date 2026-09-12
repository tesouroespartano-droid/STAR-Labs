.class Lcom/ironsource/lb$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/lb;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/lb;


# direct methods
.method constructor <init>(Lcom/ironsource/lb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/lb$a;->a:Lcom/ironsource/lb;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/lb$a;->a:Lcom/ironsource/lb;

    invoke-static {v0}, Lcom/ironsource/lb;->-$$Nest$fgetf(Lcom/ironsource/lb;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
