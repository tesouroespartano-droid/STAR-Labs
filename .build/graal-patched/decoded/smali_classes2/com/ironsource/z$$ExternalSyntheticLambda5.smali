.class public final synthetic Lcom/ironsource/z$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/z;

.field public final synthetic f$1:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/z;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/z$$ExternalSyntheticLambda5;->f$0:Lcom/ironsource/z;

    iput-object p2, p0, Lcom/ironsource/z$$ExternalSyntheticLambda5;->f$1:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/z$$ExternalSyntheticLambda5;->f$0:Lcom/ironsource/z;

    iget-object v1, p0, Lcom/ironsource/z$$ExternalSyntheticLambda5;->f$1:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/ironsource/z;->$r8$lambda$W0kD1jFtsu01AthpmyntA2UAkmQ(Lcom/ironsource/z;Ljava/util/Map;)V

    return-void
.end method
