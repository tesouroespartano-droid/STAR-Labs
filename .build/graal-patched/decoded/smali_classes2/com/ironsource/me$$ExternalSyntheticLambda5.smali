.class public final synthetic Lcom/ironsource/me$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/ee;

.field public final synthetic f$1:Lcom/ironsource/Yd;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/me$$ExternalSyntheticLambda5;->f$0:Lcom/ironsource/ee;

    iput-object p2, p0, Lcom/ironsource/me$$ExternalSyntheticLambda5;->f$1:Lcom/ironsource/Yd;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/me$$ExternalSyntheticLambda5;->f$0:Lcom/ironsource/ee;

    iget-object v1, p0, Lcom/ironsource/me$$ExternalSyntheticLambda5;->f$1:Lcom/ironsource/Yd;

    invoke-static {v0, v1}, Lcom/ironsource/me;->$r8$lambda$Mbs3SPu7Mk7AQwjOgY-gaIskPnk(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V

    return-void
.end method
