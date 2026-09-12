.class public final Lcom/ironsource/L3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/r7;
.implements Lcom/ironsource/r7$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/L3$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/Nc;

.field private final b:Lcom/ironsource/af;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/ironsource/L3;-><init>(Lcom/ironsource/s4;Lcom/ironsource/K7;Lcom/ironsource/Q8;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/s4;Lcom/ironsource/K7;Lcom/ironsource/Q8;)V
    .locals 1

    const-string v0, "currentTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pacingDataRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showCountDataRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Lcom/ironsource/Nc;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/Nc;-><init>(Lcom/ironsource/s4;Lcom/ironsource/K7;)V

    iput-object v0, p0, Lcom/ironsource/L3;->a:Lcom/ironsource/Nc;

    .line 21
    new-instance p2, Lcom/ironsource/af;

    invoke-direct {p2, p1, p3}, Lcom/ironsource/af;-><init>(Lcom/ironsource/s4;Lcom/ironsource/Q8;)V

    iput-object p2, p0, Lcom/ironsource/L3;->b:Lcom/ironsource/af;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/s4;Lcom/ironsource/K7;Lcom/ironsource/Q8;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 22
    new-instance p1, Lcom/ironsource/s4$a;

    invoke-direct {p1}, Lcom/ironsource/s4$a;-><init>()V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const-string v0, "getInstance().applicationContext"

    if-eqz p5, :cond_1

    .line 24
    new-instance p2, Lcom/ironsource/Oc;

    .line 26
    new-instance v1, Lcom/ironsource/Ve;

    .line 27
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object p5

    invoke-virtual {p5}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 28
    const-string v3, "pacing_service"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/ironsource/Ve;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/K8;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    invoke-direct {p2, v1}, Lcom/ironsource/Oc;-><init>(Lcom/ironsource/I3;)V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 35
    new-instance p3, Lcom/ironsource/Ye;

    .line 37
    new-instance v1, Lcom/ironsource/Ve;

    .line 38
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object p4

    invoke-virtual {p4}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 39
    const-string v3, "capping_service"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/ironsource/Ve;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/K8;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    invoke-direct {p3, v1}, Lcom/ironsource/Ye;-><init>(Lcom/ironsource/I3;)V

    .line 41
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/L3;-><init>(Lcom/ironsource/s4;Lcom/ironsource/K7;Lcom/ironsource/Q8;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lcom/ironsource/N3;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/L3;->a:Lcom/ironsource/Nc;

    invoke-virtual {v0, p1}, Lcom/ironsource/Nc;->a(Ljava/lang/String;)Lcom/ironsource/N3;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/N3;->d()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit p0

    return-object v0

    .line 6
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ironsource/L3;->b:Lcom/ironsource/af;

    invoke-virtual {v0, p1}, Lcom/ironsource/af;->a(Ljava/lang/String;)Lcom/ironsource/N3;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cappingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cappingConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lcom/ironsource/L3$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    .line 10
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/ironsource/L3;->b:Lcom/ironsource/af;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ironsource/af;->a(Ljava/lang/String;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/ironsource/L3;->a:Lcom/ironsource/Nc;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ironsource/Nc;->a(Ljava/lang/String;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/L3;->a:Lcom/ironsource/Nc;

    invoke-virtual {v0, p1}, Lcom/ironsource/Nc;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/L3;->b:Lcom/ironsource/af;

    invoke-virtual {v0, p1}, Lcom/ironsource/af;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
