.class final Lcom/ironsource/xa$f$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/xa$f;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/xa;

.field final synthetic b:Lcom/ironsource/M2;

.field final synthetic c:Ljava/lang/Long;


# direct methods
.method constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/xa$f$b;->a:Lcom/ironsource/xa;

    iput-object p2, p0, Lcom/ironsource/xa$f$b;->b:Lcom/ironsource/M2;

    iput-object p3, p0, Lcom/ironsource/xa$f$b;->c:Ljava/lang/Long;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$f$b;->a:Lcom/ironsource/xa;

    .line 2
    new-instance v1, Lcom/ironsource/Ba;

    .line 4
    iget-object v2, p0, Lcom/ironsource/xa$f$b;->b:Lcom/ironsource/M2;

    .line 5
    iget-object v3, p0, Lcom/ironsource/xa$f$b;->c:Ljava/lang/Long;

    .line 6
    invoke-direct {v1, v0, v2, v3}, Lcom/ironsource/Ba;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Ljava/lang/Long;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/ironsource/xa;->a(Lcom/ironsource/Ha;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/xa$f$b;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
