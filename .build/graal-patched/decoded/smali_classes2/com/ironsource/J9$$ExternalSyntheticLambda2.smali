.class public final synthetic Lcom/ironsource/J9$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/ae;

.field public final synthetic f$1:Lcom/unity3d/ironsourceads/InitListener;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/J9$$ExternalSyntheticLambda2;->f$0:Lcom/ironsource/ae;

    iput-object p2, p0, Lcom/ironsource/J9$$ExternalSyntheticLambda2;->f$1:Lcom/unity3d/ironsourceads/InitListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/J9$$ExternalSyntheticLambda2;->f$0:Lcom/ironsource/ae;

    iget-object v1, p0, Lcom/ironsource/J9$$ExternalSyntheticLambda2;->f$1:Lcom/unity3d/ironsourceads/InitListener;

    invoke-static {v0, v1}, Lcom/ironsource/J9;->$r8$lambda$IZ03YIFtewhVY3aNOls9NWhvE5k(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method
