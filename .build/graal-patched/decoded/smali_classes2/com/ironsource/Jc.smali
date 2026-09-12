.class public final Lcom/ironsource/Jc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/D0;


# direct methods
.method public constructor <init>(Lcom/ironsource/D0;)V
    .locals 1

    const-string v0, "eventsWrapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    sget-object v2, Lcom/ironsource/A0;->d0:Lcom/ironsource/A0;

    invoke-virtual {v1, v2, v0}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method

.method public final a(D)V
    .locals 4

    .line 11
    iget-object v0, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    .line 12
    sget-object v1, Lcom/ironsource/A0;->g0:Lcom/ironsource/A0;

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "flooring="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ext1"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 14
    invoke-virtual {v0, v1, p1}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method

.method public final a(J)V
    .locals 1

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 4
    const-string p2, "duration"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    sget-object p2, Lcom/ironsource/A0;->e0:Lcom/ironsource/A0;

    invoke-virtual {p1, p2, v0}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method

.method public final a(JILjava/lang/String;)V
    .locals 3

    const-string v0, "reason"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 7
    const-string v2, "errorCode"

    invoke-interface {v1, v2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-interface {v1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 9
    const-string p2, "duration"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object p1, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    sget-object p2, Lcom/ironsource/A0;->f0:Lcom/ironsource/A0;

    invoke-virtual {p1, p2, v1}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    sget-object v1, Lcom/ironsource/A0;->b0:Lcom/ironsource/A0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jc;->a:Lcom/ironsource/D0;

    sget-object v1, Lcom/ironsource/A0;->c0:Lcom/ironsource/A0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/D0;->a(Lcom/ironsource/A0;Ljava/util/Map;)V

    return-void
.end method
