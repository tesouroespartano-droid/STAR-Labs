.class public final Lcom/unity3d/player/a/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:Lcom/unity3d/player/a/Z;


# direct methods
.method public constructor <init>(Lcom/unity3d/player/a/Z;Ljava/lang/String;IIIZJJ)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    iput-object p2, p0, Lcom/unity3d/player/a/V;->a:Ljava/lang/String;

    iput p3, p0, Lcom/unity3d/player/a/V;->b:I

    iput p4, p0, Lcom/unity3d/player/a/V;->c:I

    iput p5, p0, Lcom/unity3d/player/a/V;->d:I

    iput-boolean p6, p0, Lcom/unity3d/player/a/V;->e:Z

    iput-wide p7, p0, Lcom/unity3d/player/a/V;->f:J

    iput-wide p9, p0, Lcom/unity3d/player/a/V;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 45
    iget-object v0, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    iget-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    if-eqz v1, :cond_0

    const/4 v0, 0x5

    .line 48
    const-string v1, "Video already playing"

    invoke-static {v0, v1}, Lcom/unity3d/player/a/t;->Log(ILjava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    const/4 v1, 0x2

    iput v1, v0, Lcom/unity3d/player/a/Z;->g:I

    .line 50
    iget-object v0, v0, Lcom/unity3d/player/a/Z;->d:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void

    .line 57
    :cond_0
    new-instance v1, Lcom/unity3d/player/P0;

    iget-object v2, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    move-object v3, v2

    iget-object v2, v3, Lcom/unity3d/player/a/Z;->b:Landroid/content/Context;

    iget-object v3, v3, Lcom/unity3d/player/a/Z;->a:Lcom/unity3d/player/UnityPlayer;

    iget-object v4, p0, Lcom/unity3d/player/a/V;->a:Ljava/lang/String;

    iget v5, p0, Lcom/unity3d/player/a/V;->b:I

    iget v6, p0, Lcom/unity3d/player/a/V;->c:I

    iget v7, p0, Lcom/unity3d/player/a/V;->d:I

    iget-boolean v8, p0, Lcom/unity3d/player/a/V;->e:Z

    iget-wide v9, p0, Lcom/unity3d/player/a/V;->f:J

    iget-wide v11, p0, Lcom/unity3d/player/a/V;->g:J

    new-instance v13, Lcom/unity3d/player/a/U;

    invoke-direct {v13, p0}, Lcom/unity3d/player/a/U;-><init>(Lcom/unity3d/player/a/V;)V

    invoke-direct/range {v1 .. v13}, Lcom/unity3d/player/P0;-><init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IIIZJJLcom/unity3d/player/N0;)V

    iput-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    .line 76
    iget-object v0, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    iget-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    if-eqz v1, :cond_1

    .line 78
    iget-object v0, v0, Lcom/unity3d/player/a/Z;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->getFrameLayout()Landroid/widget/FrameLayout;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 80
    iget-object v1, p0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    iget-object v1, v1, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    return-void
.end method
