.class public final synthetic Lcom/ironsource/y2$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/y2;

.field public final synthetic f$1:Lcom/ironsource/eg;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/y2;Lcom/ironsource/eg;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/y2$$ExternalSyntheticLambda4;->f$0:Lcom/ironsource/y2;

    iput-object p2, p0, Lcom/ironsource/y2$$ExternalSyntheticLambda4;->f$1:Lcom/ironsource/eg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/y2$$ExternalSyntheticLambda4;->f$0:Lcom/ironsource/y2;

    iget-object v1, p0, Lcom/ironsource/y2$$ExternalSyntheticLambda4;->f$1:Lcom/ironsource/eg;

    invoke-static {v0, v1}, Lcom/ironsource/y2;->$r8$lambda$UbGVm1luH0fyG5J_kMSG9wrV1ZI(Lcom/ironsource/y2;Lcom/ironsource/eg;)V

    return-void
.end method
