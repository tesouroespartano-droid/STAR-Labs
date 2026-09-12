.class public final synthetic Lcom/ironsource/jb$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic f$0:Lcom/ironsource/jb;

.field public final synthetic f$1:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/ironsource/jb;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/jb$$ExternalSyntheticLambda0;->f$0:Lcom/ironsource/jb;

    iput-object p2, p0, Lcom/ironsource/jb$$ExternalSyntheticLambda0;->f$1:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/ironsource/jb$$ExternalSyntheticLambda0;->f$0:Lcom/ironsource/jb;

    iget-object v1, p0, Lcom/ironsource/jb$$ExternalSyntheticLambda0;->f$1:Ljava/lang/Runnable;

    invoke-static {v0, v1, p1, p2}, Lcom/ironsource/jb;->$r8$lambda$Pi9NHvRJ37u-bk6vyqNz4O1eEoY(Lcom/ironsource/jb;Ljava/lang/Runnable;J)V

    return-void
.end method
