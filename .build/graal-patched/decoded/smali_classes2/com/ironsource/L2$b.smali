.class Lcom/ironsource/L2$b;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/L2;->onAdOpened()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/L2;


# direct methods
.method constructor <init>(Lcom/ironsource/L2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/L2$b;->b:Lcom/ironsource/L2;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/L2$b;->b:Lcom/ironsource/L2;

    invoke-static {v0}, Lcom/ironsource/L2;->-$$Nest$mJ(Lcom/ironsource/L2;)V

    return-void
.end method
