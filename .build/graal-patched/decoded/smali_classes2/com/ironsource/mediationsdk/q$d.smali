.class Lcom/ironsource/mediationsdk/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/B3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/mediationsdk/q;->a(Ljava/util/Map;Ljava/util/List;Ljava/lang/StringBuilder;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ljava/lang/StringBuilder;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/ironsource/mediationsdk/q;


# direct methods
.method constructor <init>(Lcom/ironsource/mediationsdk/q;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    iput-object p2, p0, Lcom/ironsource/mediationsdk/q$d;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/ironsource/mediationsdk/q$d;->b:Ljava/lang/StringBuilder;

    iput-object p4, p0, Lcom/ironsource/mediationsdk/q$d;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;JLjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/C3;",
            ">;J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    sget-object v1, Lcom/ironsource/C5;->J0:Lcom/ironsource/C5;

    .line 3
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "duration"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x1

    new-array v5, v4, [[Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {v5}, Lcom/ironsource/ea;->a([[Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    .line 4
    invoke-static {v0, v1, v2}, Lcom/ironsource/mediationsdk/q;->-$$Nest$mc(Lcom/ironsource/mediationsdk/q;Lcom/ironsource/C5;Ljava/util/Map;)V

    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/C3;

    .line 9
    iget-object v1, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/q;->-$$Nest$fgett(Lcom/ironsource/mediationsdk/q;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/mediationsdk/r;

    .line 11
    invoke-virtual {v0}, Lcom/ironsource/C3;->a()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 12
    iget-object v2, p0, Lcom/ironsource/mediationsdk/q$d;->a:Ljava/util/Map;

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/ironsource/C3;->a()Ljava/util/Map;

    move-result-object v7

    .line 14
    invoke-interface {v2, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    iget-object v2, p0, Lcom/ironsource/mediationsdk/q$d;->b:Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v0}, Lcom/ironsource/C3;->d()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 18
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 19
    const-string v5, ","

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 22
    sget-object v2, Lcom/ironsource/C5;->W:Lcom/ironsource/C5;

    .line 24
    invoke-virtual {v0}, Lcom/ironsource/C3;->e()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    new-array v5, v4, [[Ljava/lang/Object;

    aput-object v0, v5, v6

    .line 25
    invoke-virtual {v1, v2, v5}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_0

    .line 31
    sget-object v2, Lcom/ironsource/C5;->X:Lcom/ironsource/C5;

    .line 34
    invoke-virtual {v0}, Lcom/ironsource/C3;->e()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v5

    .line 35
    invoke-virtual {v0}, Lcom/ironsource/C3;->b()Ljava/lang/String;

    move-result-object v0

    const-string v7, "reason"

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v7, 0x2

    new-array v7, v7, [[Ljava/lang/Object;

    aput-object v5, v7, v6

    aput-object v0, v7, v4

    .line 36
    invoke-virtual {v1, v2, v7}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 46
    :cond_2
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 47
    iget-object v0, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/q;->-$$Nest$fgett(Lcom/ironsource/mediationsdk/q;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ironsource/mediationsdk/r;

    if-eqz p4, :cond_3

    .line 50
    sget-object v0, Lcom/ironsource/C5;->Y:Lcom/ironsource/C5;

    .line 52
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    new-array v2, v4, [[Ljava/lang/Object;

    aput-object v1, v2, v6

    .line 53
    invoke-virtual {p4, v0, v2}, Lcom/ironsource/mediationsdk/r;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_1

    .line 59
    :cond_4
    iget-object p1, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    iget-object p2, p0, Lcom/ironsource/mediationsdk/q$d;->a:Ljava/util/Map;

    iget-object p3, p0, Lcom/ironsource/mediationsdk/q$d;->c:Ljava/util/List;

    iget-object p4, p0, Lcom/ironsource/mediationsdk/q$d;->b:Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p2, p3, p4}, Lcom/ironsource/mediationsdk/q;->-$$Nest$ma(Lcom/ironsource/mediationsdk/q;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    sget-object v1, Lcom/ironsource/C5;->K0:Lcom/ironsource/C5;

    const-string v2, "reason"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    new-array v2, v2, [[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 3
    invoke-static {v2}, Lcom/ironsource/ea;->a([[Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    .line 4
    invoke-static {v0, v1, p1}, Lcom/ironsource/mediationsdk/q;->-$$Nest$mc(Lcom/ironsource/mediationsdk/q;Lcom/ironsource/C5;Ljava/util/Map;)V

    .line 7
    iget-object p1, p0, Lcom/ironsource/mediationsdk/q$d;->d:Lcom/ironsource/mediationsdk/q;

    iget-object v0, p0, Lcom/ironsource/mediationsdk/q$d;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/q$d;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/ironsource/mediationsdk/q$d;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/ironsource/mediationsdk/q;->-$$Nest$ma(Lcom/ironsource/mediationsdk/q;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method
