.class public final Lcom/ironsource/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ca;


# instance fields
.field private final a:Lcom/ironsource/Ce;

.field private b:J


# direct methods
.method public constructor <init>(Lcom/ironsource/l7;Lcom/ironsource/Ce;)V
    .locals 1

    const-string v0, "applicationLifecycleService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p2, p0, Lcom/ironsource/c6;->a:Lcom/ironsource/Ce;

    .line 9
    invoke-interface {p1, p0}, Lcom/ironsource/N1;->a(Lcom/ironsource/ca;)V

    .line 11
    invoke-direct {p0}, Lcom/ironsource/c6;->f()V

    return-void
.end method

.method private final e()J
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ironsource/c6;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private final f()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ironsource/c6;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/c6;->a:Lcom/ironsource/Ce;

    invoke-direct {p0}, Lcom/ironsource/c6;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/Ce;->a(Ljava/lang/Long;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/c6;->a:Lcom/ironsource/Ce;

    invoke-virtual {v0}, Lcom/ironsource/Ce;->run()V

    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/c6;->f()V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
