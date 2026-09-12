.class Lcom/ironsource/K9$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/K9;->a(Landroid/app/Activity;Lcom/ironsource/G9;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/X4;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lcom/ironsource/K9;


# direct methods
.method constructor <init>(Lcom/ironsource/K9;Lcom/ironsource/X4;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/K9$g;->c:Lcom/ironsource/K9;

    iput-object p2, p0, Lcom/ironsource/K9$g;->a:Lcom/ironsource/X4;

    iput-object p3, p0, Lcom/ironsource/K9$g;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/K9$g;->c:Lcom/ironsource/K9;

    invoke-static {v0}, Lcom/ironsource/K9;->-$$Nest$fgeta(Lcom/ironsource/K9;)Lcom/ironsource/sdk/controller/e;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/K9$g;->a:Lcom/ironsource/X4;

    iget-object v3, p0, Lcom/ironsource/K9$g;->b:Ljava/util/Map;

    invoke-virtual {v1, v2, v3, v0}, Lcom/ironsource/sdk/controller/e;->a(Lcom/ironsource/X4;Ljava/util/Map;Lcom/ironsource/w4;)V

    return-void
.end method
