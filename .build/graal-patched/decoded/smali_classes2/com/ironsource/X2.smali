.class public final Lcom/ironsource/X2;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/eg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance p1, Lcom/ironsource/X2$a;

    invoke-direct {p1, p0}, Lcom/ironsource/X2$a;-><init>(Lcom/ironsource/X2;)V

    iput-object p1, p0, Lcom/ironsource/X2;->a:Lcom/ironsource/eg;

    return-void
.end method


# virtual methods
.method public final getViewBinder()Lcom/ironsource/eg;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/X2;->a:Lcom/ironsource/eg;

    return-object v0
.end method
