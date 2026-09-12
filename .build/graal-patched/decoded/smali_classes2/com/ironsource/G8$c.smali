.class public final Lcom/ironsource/G8$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/C8$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/G8;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/G8;


# direct methods
.method constructor <init>(Lcom/ironsource/G8;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/G8$c;->a:Lcom/ironsource/G8;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/gg;)V
    .locals 1

    const-string v0, "viewVisibilityParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/G8$c;->a:Lcom/ironsource/G8;

    invoke-virtual {v0}, Lcom/ironsource/G8;->n()Lcom/ironsource/G8$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ironsource/G8$a;->a(Lcom/ironsource/gg;)V

    :cond_0
    return-void
.end method
