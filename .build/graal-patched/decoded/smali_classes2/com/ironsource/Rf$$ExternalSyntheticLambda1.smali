.class public final synthetic Lcom/ironsource/Rf$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/Rf;

.field public final synthetic f$1:Lcom/ironsource/Uc;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Rf;

    iput-object p2, p0, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/Uc;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Rf;

    iget-object v1, p0, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/Uc;

    invoke-static {v0, v1}, Lcom/ironsource/Rf;->$r8$lambda$I5EHlng74QXvbS0AniIc3axut9c(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V

    return-void
.end method
