.class final Lcom/ironsource/Ba$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Ba;->f()V
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
.field final synthetic a:Lcom/ironsource/Ba;

.field final synthetic b:Lcom/ironsource/k3$c;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lcom/ironsource/Ba;Lcom/ironsource/k3$c;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Ba$a;->a:Lcom/ironsource/Ba;

    iput-object p2, p0, Lcom/ironsource/Ba$a;->b:Lcom/ironsource/k3$c;

    iput-wide p3, p0, Lcom/ironsource/Ba$a;->c:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ba$a;->a:Lcom/ironsource/Ba;

    invoke-static {v0}, Lcom/ironsource/Ba;->b(Lcom/ironsource/Ba;)Lcom/ironsource/xa;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ironsource/Ba$a;->a:Lcom/ironsource/Ba;

    invoke-static {v1}, Lcom/ironsource/Ba;->a(Lcom/ironsource/Ba;)Lcom/ironsource/M2;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/ironsource/Ba$a;->b:Lcom/ironsource/k3$c;

    .line 4
    iget-wide v3, p0, Lcom/ironsource/Ba$a;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 5
    invoke-virtual {v0, v1, v2, v3}, Lcom/ironsource/xa;->a(Lcom/ironsource/M2;Lcom/ironsource/k3;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ba$a;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
