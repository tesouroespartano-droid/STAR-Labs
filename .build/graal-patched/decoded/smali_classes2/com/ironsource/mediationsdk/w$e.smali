.class Lcom/ironsource/mediationsdk/w$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/B3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/mediationsdk/w;->a(Ljava/util/Map;Ljava/util/List;Ljava/lang/StringBuilder;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ljava/lang/StringBuilder;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/ironsource/mediationsdk/w;


# direct methods
.method constructor <init>(Lcom/ironsource/mediationsdk/w;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    iput-object p2, p0, Lcom/ironsource/mediationsdk/w$e;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/ironsource/mediationsdk/w$e;->b:Ljava/lang/StringBuilder;

    iput-object p4, p0, Lcom/ironsource/mediationsdk/w$e;->c:Ljava/util/List;

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
    iget-object v0, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    sget-object v1, Lcom/ironsource/C5;->P2:Lcom/ironsource/C5;

    .line 2
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "duration"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x1

    new-array v5, v4, [[Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    .line 3
    invoke-static {v0, v1, v5}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/C3;

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/C3;->a()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 8
    iget-object v1, p0, Lcom/ironsource/mediationsdk/w$e;->a:Ljava/util/Map;

    .line 9
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ironsource/C3;->a()Ljava/util/Map;

    move-result-object v5

    .line 10
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v1, p0, Lcom/ironsource/mediationsdk/w$e;->b:Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/C3;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 15
    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    iget-object v1, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgetq(Lcom/ironsource/mediationsdk/w;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    .line 17
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/mediationsdk/x;

    sget-object v2, Lcom/ironsource/C5;->d2:Lcom/ironsource/C5;

    .line 21
    invoke-virtual {v0}, Lcom/ironsource/C3;->e()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    new-array v5, v4, [[Ljava/lang/Object;

    aput-object v0, v5, v6

    .line 22
    invoke-virtual {v1, v2, v5}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_0

    .line 28
    :cond_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgetq(Lcom/ironsource/mediationsdk/w;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    .line 29
    invoke-virtual {v0}, Lcom/ironsource/C3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/mediationsdk/x;

    sget-object v2, Lcom/ironsource/C5;->e2:Lcom/ironsource/C5;

    .line 33
    invoke-virtual {v0}, Lcom/ironsource/C3;->e()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v5

    .line 34
    invoke-virtual {v0}, Lcom/ironsource/C3;->b()Ljava/lang/String;

    move-result-object v0

    const-string v7, "reason"

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v7, 0x2

    new-array v7, v7, [[Ljava/lang/Object;

    aput-object v5, v7, v6

    aput-object v0, v7, v4

    .line 35
    invoke-virtual {v1, v2, v7}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 44
    :cond_1
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 45
    iget-object v0, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/w;->-$$Nest$fgetq(Lcom/ironsource/mediationsdk/w;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    .line 46
    invoke-virtual {v0, p4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ironsource/mediationsdk/x;

    sget-object v0, Lcom/ironsource/C5;->f2:Lcom/ironsource/C5;

    .line 49
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    new-array v2, v4, [[Ljava/lang/Object;

    aput-object v1, v2, v6

    .line 50
    invoke-virtual {p4, v0, v2}, Lcom/ironsource/mediationsdk/x;->a(Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    goto :goto_1

    .line 55
    :cond_2
    iget-object p1, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    iget-object p2, p0, Lcom/ironsource/mediationsdk/w$e;->a:Ljava/util/Map;

    iget-object p3, p0, Lcom/ironsource/mediationsdk/w$e;->c:Ljava/util/List;

    iget-object p4, p0, Lcom/ironsource/mediationsdk/w$e;->b:Ljava/lang/StringBuilder;

    invoke-static {p1, p2, p3, p4}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Ljava/util/Map;Ljava/util/List;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    sget-object v1, Lcom/ironsource/C5;->Q2:Lcom/ironsource/C5;

    const-string v2, "duration"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    new-array v2, v2, [[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Lcom/ironsource/C5;[[Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/ironsource/mediationsdk/w$e;->d:Lcom/ironsource/mediationsdk/w;

    iget-object v0, p0, Lcom/ironsource/mediationsdk/w$e;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/ironsource/mediationsdk/w$e;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/ironsource/mediationsdk/w$e;->b:Ljava/lang/StringBuilder;

    invoke-static {p1, v0, v1, v2}, Lcom/ironsource/mediationsdk/w;->-$$Nest$ma(Lcom/ironsource/mediationsdk/w;Ljava/util/Map;Ljava/util/List;Ljava/lang/StringBuilder;)V

    return-void
.end method
