.class public final synthetic Lcom/ironsource/Ad$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/Ad;

.field public final synthetic f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/Ad;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Ad$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Ad;

    iput-object p2, p0, Lcom/ironsource/Ad$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/Ad$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Ad;

    iget-object v1, p0, Lcom/ironsource/Ad$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-static {v0, v1}, Lcom/ironsource/Ad;->$r8$lambda$08qDiMpwggyhAGijlWClkAqsQwo(Lcom/ironsource/Ad;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method
