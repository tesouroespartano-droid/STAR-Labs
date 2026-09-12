.class public final Lcom/ironsource/mg$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/pg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/mg;->a(Lcom/ironsource/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/mg;


# direct methods
.method constructor <init>(Lcom/ironsource/mg;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/mg$a;->a:Lcom/ironsource/mg;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 1

    const-string v0, "errorReason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/mg$a;->a:Lcom/ironsource/mg;

    invoke-static {v0}, Lcom/ironsource/mg;->b(Lcom/ironsource/mg;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mg$a;->a:Lcom/ironsource/mg;

    invoke-static {v0}, Lcom/ironsource/mg;->a(Lcom/ironsource/mg;)Lcom/ironsource/tg;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ironsource/tg;->a(ILjava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/qg;)V
    .locals 1

    const-string v0, "waterfallInstances"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/mg$a;->a:Lcom/ironsource/mg;

    invoke-static {v0}, Lcom/ironsource/mg;->b(Lcom/ironsource/mg;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mg$a;->a:Lcom/ironsource/mg;

    invoke-static {v0, p1}, Lcom/ironsource/mg;->a(Lcom/ironsource/mg;Lcom/ironsource/qg;)V

    return-void
.end method
