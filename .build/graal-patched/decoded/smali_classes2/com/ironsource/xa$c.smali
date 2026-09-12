.class public final Lcom/ironsource/xa$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/x0;


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

    iput-object p1, p0, Lcom/ironsource/xa$c;->a:Lcom/ironsource/xa;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$c;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ironsource/ua;->d(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$c;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->n()Lcom/ironsource/ua;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/ua;->k()V

    return-void
.end method
