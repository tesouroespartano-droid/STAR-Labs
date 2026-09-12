.class public final Lcom/unity3d/player/a/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/unity3d/player/a/U;


# direct methods
.method public constructor <init>(Lcom/unity3d/player/a/U;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/unity3d/player/a/T;->a:Lcom/unity3d/player/a/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/unity3d/player/a/T;->a:Lcom/unity3d/player/a/U;

    iget-object v0, v0, Lcom/unity3d/player/a/U;->a:Lcom/unity3d/player/a/V;

    iget-object v0, v0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    .line 126
    iget-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    if-eqz v1, :cond_0

    .line 128
    iget-object v2, v0, Lcom/unity3d/player/a/Z;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v2, v1}, Lcom/unity3d/player/UnityPlayer;->removeViewFromPlayer(Landroid/view/View;)V

    const/4 v1, 0x0

    .line 129
    iput-boolean v1, v0, Lcom/unity3d/player/a/Z;->i:Z

    .line 130
    iget-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    invoke-virtual {v1}, Lcom/unity3d/player/P0;->destroyPlayer()V

    const/4 v1, 0x0

    .line 131
    iput-object v1, v0, Lcom/unity3d/player/a/Z;->f:Lcom/unity3d/player/P0;

    .line 132
    iget-object v0, v0, Lcom/unity3d/player/a/Z;->c:Lcom/unity3d/player/a0;

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {v0}, Lcom/unity3d/player/a0;->a()V

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/a/T;->a:Lcom/unity3d/player/a/U;

    iget-object v0, v0, Lcom/unity3d/player/a/U;->a:Lcom/unity3d/player/a/V;

    iget-object v0, v0, Lcom/unity3d/player/a/V;->h:Lcom/unity3d/player/a/Z;

    iget-object v0, v0, Lcom/unity3d/player/a/Z;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->onResume()V

    return-void
.end method
