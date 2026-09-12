.class public final Lcom/ironsource/V6$b;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/V6;->a(Lcom/ironsource/if$a;Ljava/lang/Runnable;)Lcom/ironsource/Vd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/if$a;

.field final synthetic c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ironsource/if$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/V6$b;->b:Lcom/ironsource/if$a;

    iput-object p2, p0, Lcom/ironsource/V6$b;->c:Ljava/lang/Runnable;

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/V6$b;->b:Lcom/ironsource/if$a;

    invoke-virtual {v0}, Lcom/ironsource/if$a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/V6$b;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
