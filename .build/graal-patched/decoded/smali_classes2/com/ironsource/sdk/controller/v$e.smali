.class Lcom/ironsource/sdk/controller/v$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/sdk/controller/v;->a(Lcom/ironsource/q8$e;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/q8$e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/ironsource/sdk/controller/v;


# direct methods
.method constructor <init>(Lcom/ironsource/sdk/controller/v;Lcom/ironsource/q8$e;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/sdk/controller/v$e;->c:Lcom/ironsource/sdk/controller/v;

    iput-object p2, p0, Lcom/ironsource/sdk/controller/v$e;->a:Lcom/ironsource/q8$e;

    iput-object p3, p0, Lcom/ironsource/sdk/controller/v$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/sdk/controller/v$e;->a:Lcom/ironsource/q8$e;

    sget-object v1, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    if-ne v0, v1, :cond_1

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/ironsource/sdk/controller/v$e;->c:Lcom/ironsource/sdk/controller/v;

    invoke-static {v1, v0}, Lcom/ironsource/sdk/controller/v;->-$$Nest$ma(Lcom/ironsource/sdk/controller/v;Lcom/ironsource/q8$e;)Lcom/ironsource/u4;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/ironsource/sdk/controller/v$e;->a:Lcom/ironsource/q8$e;

    iget-object v2, p0, Lcom/ironsource/sdk/controller/v$e;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/ironsource/u4;->b(Lcom/ironsource/q8$e;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
