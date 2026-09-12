.class Lcom/ironsource/H2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/D3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/H2;->b(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/s3;

.field final synthetic b:Lcom/ironsource/H2;


# direct methods
.method constructor <init>(Lcom/ironsource/H2;Lcom/ironsource/s3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/H2$a;->b:Lcom/ironsource/H2;

    iput-object p2, p0, Lcom/ironsource/H2$a;->a:Lcom/ironsource/s3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2$a;->a:Lcom/ironsource/s3;

    check-cast v0, Lcom/ironsource/L2;

    invoke-virtual {v0}, Lcom/ironsource/L2;->Q()V

    return-void
.end method
