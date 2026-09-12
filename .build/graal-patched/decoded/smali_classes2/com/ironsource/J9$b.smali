.class public final Lcom/ironsource/J9$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ee;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/J9;->a(Landroid/content/Context;Lcom/unity3d/ironsourceads/InitRequest;Lcom/unity3d/ironsourceads/InitListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/ironsource/k5;

.field final synthetic c:Lcom/unity3d/ironsourceads/InitListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/J9$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ironsource/J9$b;->b:Lcom/ironsource/k5;

    iput-object p3, p0, Lcom/ironsource/J9$b;->c:Lcom/unity3d/ironsourceads/InitListener;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Yd;)V
    .locals 4

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/J9;->a:Lcom/ironsource/J9;

    .line 2
    iget-object v1, p0, Lcom/ironsource/J9$b;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object p1

    iget-object v2, p0, Lcom/ironsource/J9$b;->b:Lcom/ironsource/k5;

    iget-object v3, p0, Lcom/ironsource/J9$b;->c:Lcom/unity3d/ironsourceads/InitListener;

    .line 3
    invoke-static {v0, v1, p1, v2, v3}, Lcom/ironsource/J9;->a(Lcom/ironsource/J9;Landroid/content/Context;Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method public a(Lcom/ironsource/ae;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/J9;->a:Lcom/ironsource/J9;

    iget-object v1, p0, Lcom/ironsource/J9$b;->c:Lcom/unity3d/ironsourceads/InitListener;

    iget-object v2, p0, Lcom/ironsource/J9$b;->b:Lcom/ironsource/k5;

    invoke-static {v0, v1, v2, p1}, Lcom/ironsource/J9;->a(Lcom/ironsource/J9;Lcom/unity3d/ironsourceads/InitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    return-void
.end method
