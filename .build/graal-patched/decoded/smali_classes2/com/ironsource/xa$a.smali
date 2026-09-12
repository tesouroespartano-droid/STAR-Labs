.class public final Lcom/ironsource/xa$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/P2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/xa;-><init>(Lcom/ironsource/n0;Lcom/ironsource/X2;JJLcom/ironsource/K2;Lcom/ironsource/ua;Lcom/ironsource/O2;Lcom/ironsource/if;Lcom/ironsource/s4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/xa;


# direct methods
.method constructor <init>(Lcom/ironsource/xa;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/xa$a;->a:Lcom/ironsource/xa;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$a;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/ua;->onAdLeftApplication()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$a;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/ua;->n()V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$a;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/ua;->l()V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$a;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/ua;->onAdClicked()V

    return-void
.end method

.method public bridge synthetic i()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/xa$a;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic j()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/xa$a;->c()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic m()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/xa$a;->b()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
