.class public final Lcom/ironsource/Rf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Vc;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTriggeredTaskCountdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TriggeredTaskCountdown.kt\ncom/unity3d/mediation/internal/ads/tools/TriggeredTaskCountdown\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n32#2,2:77\n32#2,2:99\n766#3:79\n857#3,2:80\n2310#3,14:82\n1747#3,3:96\n*S KotlinDebug\n*F\n+ 1 TriggeredTaskCountdown.kt\ncom/unity3d/mediation/internal/ads/tools/TriggeredTaskCountdown\n*L\n13#1:77,2\n64#1:99,2\n23#1:79\n23#1:80,2\n23#1:82,14\n74#1:96,3\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/n0;

.field private final b:Ljava/lang/Runnable;

.field private final c:J

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/Uc;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/ironsource/hf;


# direct methods
.method public static synthetic $r8$lambda$7MzDCJs0-2trxJ7Tr_n5V6y2skU(Lcom/ironsource/Rf;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Rf;->a(Lcom/ironsource/Rf;)V

    return-void
.end method

.method public static synthetic $r8$lambda$I5EHlng74QXvbS0AniIc3axut9c(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Rf;->b(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V

    return-void
.end method

.method public static synthetic $r8$lambda$OmqFOxpBALWccix-Q_77X7vgkOg(Lcom/ironsource/Rf;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Rf;->b(Lcom/ironsource/Rf;)V

    return-void
.end method

.method public static synthetic $r8$lambda$l8pmrIdjMjIJIGJ9addXfhQK8R4(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Rf;->a(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/n0;Ljava/lang/Runnable;JLjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/n0;",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/Uc;",
            ">;)V"
        }
    .end annotation

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pauseTriggers"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Rf;->b:Ljava/lang/Runnable;

    .line 4
    iput-wide p3, p0, Lcom/ironsource/Rf;->c:J

    .line 5
    iput-object p5, p0, Lcom/ironsource/Rf;->d:Ljava/util/List;

    .line 8
    new-instance p2, Lcom/ironsource/hf;

    invoke-virtual {p1}, Lcom/ironsource/jb;->a()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/ironsource/Rf$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/ironsource/Rf$$ExternalSyntheticLambda3;-><init>(Lcom/ironsource/Rf;)V

    invoke-direct {p2, p1, v0, p3, p4}, Lcom/ironsource/hf;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;J)V

    iput-object p2, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    .line 11
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 75
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ironsource/Uc;

    .line 76
    invoke-virtual {p2, p0}, Lcom/ironsource/Uc;->a(Lcom/ironsource/Vc;)V

    .line 77
    invoke-virtual {p2}, Lcom/ironsource/Uc;->d()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 78
    invoke-virtual {p2}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/ironsource/Rf;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_1
    invoke-direct {p0}, Lcom/ironsource/Rf;->a()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 83
    iget-object p1, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {p1}, Lcom/ironsource/hf;->a()Lcom/ironsource/hf$a;

    move-result-object p1

    .line 85
    iget-object p2, p0, Lcom/ironsource/Rf;->d:Ljava/util/List;

    .line 141
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object p5, p4

    check-cast p5, Lcom/ironsource/Uc;

    .line 143
    invoke-virtual {p5}, Lcom/ironsource/Uc;->d()Z

    move-result p5

    if-eqz p5, :cond_2

    .line 200
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 202
    :cond_3
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 203
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    .line 204
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 205
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_2

    .line 206
    :cond_4
    move-object p4, p3

    check-cast p4, Lcom/ironsource/Uc;

    .line 207
    invoke-virtual {p4}, Lcom/ironsource/Uc;->c()J

    move-result-wide p4

    .line 272
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 273
    move-object v1, v0

    check-cast v1, Lcom/ironsource/Uc;

    .line 274
    invoke-virtual {v1}, Lcom/ironsource/Uc;->c()J

    move-result-wide v1

    cmp-long v3, p4, v1

    if-lez v3, :cond_6

    move-object p3, v0

    move-wide p4, v1

    .line 345
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 346
    :goto_2
    check-cast p3, Lcom/ironsource/Uc;

    .line 347
    invoke-virtual {p3}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object p2

    .line 348
    invoke-direct {p0, p2, p1}, Lcom/ironsource/Rf;->a(Ljava/lang/String;Lcom/ironsource/hf$a;)V

    return-void

    .line 409
    :cond_7
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_8
    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/n0;Ljava/lang/Runnable;JLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 410
    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    .line 411
    invoke-direct/range {v0 .. v5}, Lcom/ironsource/Rf;-><init>(Lcom/ironsource/n0;Ljava/lang/Runnable;JLjava/util/List;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/Rf;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/ironsource/Rf;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 45
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/Uc;

    const/4 v2, 0x0

    .line 46
    invoke-virtual {v1, v2}, Lcom/ironsource/Uc;->a(Lcom/ironsource/Vc;)V

    goto :goto_0

    .line 47
    :cond_0
    iget-object p0, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {p0}, Lcom/ironsource/hf;->a()Lcom/ironsource/hf$a;

    return-void
.end method

.method private static final a(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pauseableTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ironsource/Rf;->a(Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/ironsource/Rf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {v0}, Lcom/ironsource/hf;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {v0}, Lcom/ironsource/hf;->a()Lcom/ironsource/hf$a;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ironsource/Rf;->a(Ljava/lang/String;Lcom/ironsource/hf$a;)V

    :cond_0
    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/Sf;->d(Ljava/lang/String;)V

    return-void
.end method

.method private final a(Ljava/lang/String;Lcom/ironsource/hf$a;)V
    .locals 9

    .line 7
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v1

    .line 8
    iget-wide v3, p0, Lcom/ironsource/Rf;->c:J

    invoke-virtual {p2}, Lcom/ironsource/hf$a;->c()J

    move-result-wide v5

    invoke-virtual {p2}, Lcom/ironsource/hf$a;->d()J

    move-result-wide v7

    move-object v2, p1

    .line 9
    invoke-virtual/range {v1 .. v8}, Lcom/ironsource/Sf;->a(Ljava/lang/String;JJJ)V

    return-void
.end method

.method private final a()Z
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/ironsource/Rf;->d:Ljava/util/List;

    .line 70
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/Uc;

    .line 72
    invoke-virtual {v1}, Lcom/ironsource/Uc;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private final b()V
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ironsource/Rf;->c()V

    .line 12
    iget-object v0, p0, Lcom/ironsource/Rf;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private static final b(Lcom/ironsource/Rf;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Rf;->b()V

    return-void
.end method

.method private static final b(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pauseableTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ironsource/Rf;->b(Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/ironsource/Rf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {v0}, Lcom/ironsource/hf;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/ironsource/Rf;->e:Lcom/ironsource/hf;

    invoke-virtual {v0}, Lcom/ironsource/hf;->b()Lcom/ironsource/hf$a;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/Uc;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ironsource/Rf;->b(Ljava/lang/String;Lcom/ironsource/hf$a;)V

    :cond_0
    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/Sf;->e(Ljava/lang/String;)V

    return-void
.end method

.method private final b(Ljava/lang/String;Lcom/ironsource/hf$a;)V
    .locals 9

    .line 8
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v1

    .line 9
    iget-wide v3, p0, Lcom/ironsource/Rf;->c:J

    invoke-virtual {p2}, Lcom/ironsource/hf$a;->c()J

    move-result-wide v5

    invoke-virtual {p2}, Lcom/ironsource/hf$a;->d()J

    move-result-wide v7

    move-object v2, p1

    .line 10
    invoke-virtual/range {v1 .. v8}, Lcom/ironsource/Sf;->b(Ljava/lang/String;JJJ)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Uc;)V
    .locals 2

    const-string v0, "pauseableTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    new-instance v1, Lcom/ironsource/Rf$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/Rf$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lcom/ironsource/Uc;)V
    .locals 2

    const-string v0, "pauseableTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    new-instance v1, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/Rf$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Rf;Lcom/ironsource/Uc;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Rf;->a:Lcom/ironsource/n0;

    new-instance v1, Lcom/ironsource/Rf$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/ironsource/Rf$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/Rf;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->d(Ljava/lang/Runnable;)V

    return-void
.end method
