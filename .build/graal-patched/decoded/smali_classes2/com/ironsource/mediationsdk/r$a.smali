.class Lcom/ironsource/mediationsdk/r$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/mediationsdk/r;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/mediationsdk/r;


# direct methods
.method constructor <init>(Lcom/ironsource/mediationsdk/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 3
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/r;->-$$Nest$fgeth(Lcom/ironsource/mediationsdk/r;)Lcom/ironsource/mediationsdk/r$b;

    move-result-object v1

    sget-object v2, Lcom/ironsource/mediationsdk/r$b;->d:Lcom/ironsource/mediationsdk/r$b;

    const/16 v3, 0x401

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v6, "Rewarded Video - load instance time out"

    if-eq v1, v2, :cond_1

    sget-object v7, Lcom/ironsource/mediationsdk/r$b;->b:Lcom/ironsource/mediationsdk/r$b;

    if-ne v1, v7, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1fe

    move v1, v5

    goto :goto_2

    :cond_1
    :goto_0
    if-ne v1, v2, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    const/16 v1, 0x408

    .line 8
    const-string v6, "Rewarded Video - init instance time out"

    .line 11
    :goto_1
    sget-object v2, Lcom/ironsource/mediationsdk/r$b;->c:Lcom/ironsource/mediationsdk/r$b;

    invoke-static {v0, v2}, Lcom/ironsource/mediationsdk/r;->-$$Nest$ma(Lcom/ironsource/mediationsdk/r;Lcom/ironsource/mediationsdk/r$b;)V

    move v0, v1

    move v1, v4

    .line 15
    :goto_2
    iget-object v2, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-virtual {v2, v6}, Lcom/ironsource/mediationsdk/y;->a(Ljava/lang/String;)V

    const/4 v2, 0x3

    const/4 v7, 0x2

    const-string v8, "duration"

    const-string v9, "errorCode"

    if-eqz v1, :cond_3

    .line 18
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    sget-object v3, Lcom/ironsource/C5;->n0:Lcom/ironsource/C5;

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v9, v10}, [Ljava/lang/Object;

    move-result-object v10

    iget-object v11, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-static {v11}, Lcom/ironsource/mediationsdk/r;->-$$Nest$mv(Lcom/ironsource/mediationsdk/r;)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    filled-new-array {v8, v11}, [Ljava/lang/Object;

    move-result-object v11

    new-array v12, v7, [[Ljava/lang/Object;

    aput-object v10, v12, v5

    aput-object v11, v12, v4

    .line 22
    invoke-virtual {v1, v3, v12}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 27
    iget-object v1, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    sget-object v3, Lcom/ironsource/C5;->z0:Lcom/ironsource/C5;

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v9, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v9, "reason"

    filled-new-array {v9, v6}, [Ljava/lang/Object;

    move-result-object v6

    iget-object v9, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    .line 32
    invoke-static {v9}, Lcom/ironsource/mediationsdk/r;->-$$Nest$mv(Lcom/ironsource/mediationsdk/r;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    filled-new-array {v8, v9}, [Ljava/lang/Object;

    move-result-object v8

    new-array v2, v2, [[Ljava/lang/Object;

    aput-object v0, v2, v5

    aput-object v6, v2, v4

    aput-object v8, v2, v7

    .line 33
    invoke-virtual {v1, v3, v2}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 40
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/r;->-$$Nest$fgeti(Lcom/ironsource/mediationsdk/r;)Lcom/ironsource/oa;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/ironsource/oa;->d(Lcom/ironsource/mediationsdk/r;)V

    return-void

    .line 42
    :cond_3
    iget-object v0, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    sget-object v1, Lcom/ironsource/C5;->v0:Lcom/ironsource/C5;

    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v9, v3}, [Ljava/lang/Object;

    move-result-object v3

    iget-object v6, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    .line 46
    invoke-static {v6}, Lcom/ironsource/mediationsdk/r;->-$$Nest$mv(Lcom/ironsource/mediationsdk/r;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v8, v6}, [Ljava/lang/Object;

    move-result-object v6

    iget-object v8, p0, Lcom/ironsource/mediationsdk/r$a;->a:Lcom/ironsource/mediationsdk/r;

    invoke-static {v8}, Lcom/ironsource/mediationsdk/r;->-$$Nest$fgeth(Lcom/ironsource/mediationsdk/r;)Lcom/ironsource/mediationsdk/r$b;

    move-result-object v8

    .line 47
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "ext1"

    filled-new-array {v9, v8}, [Ljava/lang/Object;

    move-result-object v8

    new-array v2, v2, [[Ljava/lang/Object;

    aput-object v3, v2, v5

    aput-object v6, v2, v4

    aput-object v8, v2, v7

    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    return-void
.end method
