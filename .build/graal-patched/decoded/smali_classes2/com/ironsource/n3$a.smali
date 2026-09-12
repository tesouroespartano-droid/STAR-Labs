.class Lcom/ironsource/n3$a;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/n3;->a(Landroid/app/Activity;Lcom/ironsource/mediationsdk/model/Placement;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/ironsource/mediationsdk/model/Placement;

.field final synthetic d:Lcom/ironsource/n3;


# direct methods
.method constructor <init>(Lcom/ironsource/n3;Landroid/app/Activity;Lcom/ironsource/mediationsdk/model/Placement;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/n3$a;->d:Lcom/ironsource/n3;

    iput-object p2, p0, Lcom/ironsource/n3$a;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/ironsource/n3$a;->c:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/n3$a;->d:Lcom/ironsource/n3;

    iget-object v1, p0, Lcom/ironsource/n3$a;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/ironsource/n3$a;->c:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-static {v0, v1, v2}, Lcom/ironsource/n3;->-$$Nest$mb(Lcom/ironsource/n3;Landroid/app/Activity;Lcom/ironsource/mediationsdk/model/Placement;)V

    return-void
.end method
