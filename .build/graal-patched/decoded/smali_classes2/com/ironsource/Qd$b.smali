.class Lcom/ironsource/Qd$b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Qd;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Qd;


# direct methods
.method constructor <init>(Lcom/ironsource/Qd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Qd$b;->a:Lcom/ironsource/Qd;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Qd$b;->a:Lcom/ironsource/Qd;

    invoke-static {v0}, Lcom/ironsource/Qd;->-$$Nest$fgetb(Lcom/ironsource/Qd;)Lcom/ironsource/Rd;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/Rd;->b()V

    return-void
.end method
