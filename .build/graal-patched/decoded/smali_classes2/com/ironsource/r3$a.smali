.class Lcom/ironsource/r3$a;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/r3;->onAdRewarded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/r3;


# direct methods
.method constructor <init>(Lcom/ironsource/r3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/r3$a;->b:Lcom/ironsource/r3;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/r3$a;->b:Lcom/ironsource/r3;

    invoke-static {v0}, Lcom/ironsource/r3;->-$$Nest$mU(Lcom/ironsource/r3;)V

    return-void
.end method
