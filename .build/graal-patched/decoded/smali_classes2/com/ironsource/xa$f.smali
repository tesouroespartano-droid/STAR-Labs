.class public final Lcom/ironsource/xa$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/xa;->a(Lcom/ironsource/M2;Lcom/ironsource/k3;Ljava/lang/Long;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/xa;

.field final synthetic b:Lcom/ironsource/M2;

.field final synthetic c:Lcom/ironsource/k3;

.field final synthetic d:Ljava/lang/Long;


# direct methods
.method constructor <init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/k3;Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    iput-object p2, p0, Lcom/ironsource/xa$f;->b:Lcom/ironsource/M2;

    iput-object p3, p0, Lcom/ironsource/xa$f;->c:Lcom/ironsource/k3;

    iput-object p4, p0, Lcom/ironsource/xa$f;->d:Ljava/lang/Long;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->k()Lcom/ironsource/X2;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->k()Lcom/ironsource/X2;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->k()Lcom/ironsource/X2;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v0, v1}, Lcom/ironsource/kg;->a(Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->a()Lcom/ironsource/n0;

    move-result-object v1

    .line 7
    sget-object v0, Lcom/ironsource/Vd;->a:Lcom/ironsource/Vd$a;

    new-instance v2, Lcom/ironsource/xa$f$a;

    iget-object v3, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    iget-object v4, p0, Lcom/ironsource/xa$f;->b:Lcom/ironsource/M2;

    iget-object v5, p0, Lcom/ironsource/xa$f;->c:Lcom/ironsource/k3;

    invoke-direct {v2, v3, v4, v5}, Lcom/ironsource/xa$f$a;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Lcom/ironsource/k3;)V

    invoke-virtual {v0, v2}, Lcom/ironsource/Vd$a;->a(Lkotlin/jvm/functions/Function0;)Lcom/ironsource/Vd;

    move-result-object v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 8
    invoke-static/range {v1 .. v6}, Lcom/ironsource/jb;->a(Lcom/ironsource/jb;Lcom/ironsource/Vd;JILjava/lang/Object;)V

    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    invoke-virtual {v0}, Lcom/ironsource/xa;->a()Lcom/ironsource/n0;

    move-result-object v1

    .line 16
    sget-object v0, Lcom/ironsource/Vd;->a:Lcom/ironsource/Vd$a;

    new-instance v2, Lcom/ironsource/xa$f$b;

    iget-object v3, p0, Lcom/ironsource/xa$f;->a:Lcom/ironsource/xa;

    iget-object v4, p0, Lcom/ironsource/xa$f;->b:Lcom/ironsource/M2;

    iget-object v5, p0, Lcom/ironsource/xa$f;->d:Ljava/lang/Long;

    invoke-direct {v2, v3, v4, v5}, Lcom/ironsource/xa$f$b;-><init>(Lcom/ironsource/xa;Lcom/ironsource/M2;Ljava/lang/Long;)V

    invoke-virtual {v0, v2}, Lcom/ironsource/Vd$a;->a(Lkotlin/jvm/functions/Function0;)Lcom/ironsource/Vd;

    move-result-object v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/ironsource/jb;->a(Lcom/ironsource/jb;Lcom/ironsource/Vd;JILjava/lang/Object;)V

    return-void
.end method
