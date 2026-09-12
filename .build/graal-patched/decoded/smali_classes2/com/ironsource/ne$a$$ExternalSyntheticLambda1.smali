.class public final synthetic Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/Yd;

.field public final synthetic f$1:Lcom/ironsource/ee;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Yd;

    iput-object p2, p0, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/ee;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;->f$0:Lcom/ironsource/Yd;

    iget-object v1, p0, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;->f$1:Lcom/ironsource/ee;

    invoke-static {v0, v1}, Lcom/ironsource/ne$a;->$r8$lambda$H9S2JFi_ckeKJ19XvGRXmXqwc04(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    return-void
.end method
