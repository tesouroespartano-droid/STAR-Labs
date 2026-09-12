.class public final synthetic Lcom/ironsource/Ed$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/Ed;

.field public final synthetic f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/Ed;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Ed$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Ed;

    iput-object p2, p0, Lcom/ironsource/Ed$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/Ed$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Ed;

    iget-object v1, p0, Lcom/ironsource/Ed$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-static {v0, v1}, Lcom/ironsource/Ed;->$r8$lambda$jYGvdh4QTW07wOriQZ-PxDcaO2Q(Lcom/ironsource/Ed;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method
