.class public final Lcom/ironsource/Ff$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/S8;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Ff;->a(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Lcom/ironsource/S8;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Ff;

.field final synthetic b:Lcom/ironsource/S8;


# direct methods
.method public static synthetic $r8$lambda$7Me6FnukxuOywmOMu4lp5wFIn8U(Lcom/ironsource/Ff$b;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Ff$b;->a(Lcom/ironsource/Ff$b;)V

    return-void
.end method

.method constructor <init>(Lcom/ironsource/Ff;Lcom/ironsource/S8;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Ff$b;->a:Lcom/ironsource/Ff;

    iput-object p2, p0, Lcom/ironsource/Ff$b;->b:Lcom/ironsource/S8;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Lcom/ironsource/Ff$b;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ff$b;->onUIReady()V

    return-void
.end method


# virtual methods
.method public onClosed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ff$b;->b:Lcom/ironsource/S8;

    invoke-interface {v0}, Lcom/ironsource/S8;->onClosed()V

    return-void
.end method

.method public onUIReady()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ff$b;->a:Lcom/ironsource/Ff;

    invoke-static {v0}, Lcom/ironsource/Ff;->d(Lcom/ironsource/Ff;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/Ff$b;->b:Lcom/ironsource/S8;

    invoke-interface {v0}, Lcom/ironsource/S8;->onUIReady()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Ff$b;->a:Lcom/ironsource/Ff;

    invoke-static {v0}, Lcom/ironsource/Ff;->a(Lcom/ironsource/Ff;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ironsource/Ff$b$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/ironsource/Ff$b$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Ff$b;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
