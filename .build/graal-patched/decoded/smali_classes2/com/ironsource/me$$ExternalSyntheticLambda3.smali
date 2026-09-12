.class public final synthetic Lcom/ironsource/me$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/ee;

.field public final synthetic f$1:Lcom/ironsource/ae;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/ee;Lcom/ironsource/ae;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/me$$ExternalSyntheticLambda3;->f$0:Lcom/ironsource/ee;

    iput-object p2, p0, Lcom/ironsource/me$$ExternalSyntheticLambda3;->f$1:Lcom/ironsource/ae;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/me$$ExternalSyntheticLambda3;->f$0:Lcom/ironsource/ee;

    iget-object v1, p0, Lcom/ironsource/me$$ExternalSyntheticLambda3;->f$1:Lcom/ironsource/ae;

    invoke-static {v0, v1}, Lcom/ironsource/me;->$r8$lambda$u_2n6zvhc6Tazc7f9pPKSGgtBKc(Lcom/ironsource/ee;Lcom/ironsource/ae;)V

    return-void
.end method
