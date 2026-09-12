.class public final Lcom/ironsource/mg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/E;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWaterfall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Waterfall.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/waterfall/Waterfall\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1855#2,2:156\n*S KotlinDebug\n*F\n+ 1 Waterfall.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/waterfall/Waterfall\n*L\n81#1:156,2\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/V0;

.field private final b:Lcom/ironsource/v0;

.field private final c:Lcom/ironsource/tg;

.field private final d:Lcom/ironsource/og;

.field private e:Lcom/ironsource/F;

.field private f:Lcom/ironsource/vg;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/z;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/ironsource/z;

.field private i:Z


# direct methods
.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/tg;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/mg;->a:Lcom/ironsource/V0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/mg;->b:Lcom/ironsource/v0;

    .line 4
    iput-object p3, p0, Lcom/ironsource/mg;->c:Lcom/ironsource/tg;

    .line 7
    sget-object p3, Lcom/ironsource/og;->d:Lcom/ironsource/og$a;

    invoke-virtual {p3, p1, p2}, Lcom/ironsource/og$a;->a(Lcom/ironsource/V0;Lcom/ironsource/v0;)Lcom/ironsource/og;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/mg;->d:Lcom/ironsource/og;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/mg;)Lcom/ironsource/tg;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/mg;->c:Lcom/ironsource/tg;

    return-object p0
.end method

.method public static final synthetic a(Lcom/ironsource/mg;Lcom/ironsource/qg;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/ironsource/mg;->a(Lcom/ironsource/qg;)V

    return-void
.end method

.method private final a(Lcom/ironsource/qg;)V
    .locals 8

    .line 34
    sget-object v0, Lcom/ironsource/F;->c:Lcom/ironsource/F$a;

    iget-object v1, p0, Lcom/ironsource/mg;->b:Lcom/ironsource/v0;

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/F$a;->a(Lcom/ironsource/v0;Lcom/ironsource/qg;)Lcom/ironsource/F;

    move-result-object v7

    .line 35
    iput-object v7, p0, Lcom/ironsource/mg;->e:Lcom/ironsource/F;

    .line 37
    sget-object v2, Lcom/ironsource/vg;->c:Lcom/ironsource/vg$a;

    .line 38
    iget-object v3, p0, Lcom/ironsource/mg;->a:Lcom/ironsource/V0;

    iget-object v4, p0, Lcom/ironsource/mg;->b:Lcom/ironsource/v0;

    iget-object v0, p0, Lcom/ironsource/mg;->d:Lcom/ironsource/og;

    invoke-virtual {v0}, Lcom/ironsource/og;->a()Lcom/ironsource/Lc;

    move-result-object v5

    move-object v6, p1

    .line 39
    invoke-virtual/range {v2 .. v7}, Lcom/ironsource/vg$a;->a(Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/Lc;Lcom/ironsource/qg;Lcom/ironsource/F;)Lcom/ironsource/vg;

    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    .line 44
    invoke-direct {p0}, Lcom/ironsource/mg;->f()V

    return-void
.end method

.method public static final synthetic b(Lcom/ironsource/mg;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ironsource/mg;->i:Z

    return p0
.end method

.method private final c(Lcom/ironsource/z;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/ironsource/mg;->d(Lcom/ironsource/z;)V

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/mg;->b()V

    return-void
.end method

.method private final d(Lcom/ironsource/z;)V
    .locals 1

    .line 3
    iput-object p1, p0, Lcom/ironsource/mg;->h:Lcom/ironsource/z;

    .line 4
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mg;->h:Lcom/ironsource/z;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/mg;->e:Lcom/ironsource/F;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/F;->d()Lcom/ironsource/F$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/F$b;->e()Z

    move-result v1

    if-nez v1, :cond_3

    .line 7
    invoke-virtual {v0}, Lcom/ironsource/F$b;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    iget-object v0, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ironsource/vg;->a()V

    return-void

    .line 12
    :cond_1
    invoke-virtual {v0}, Lcom/ironsource/F$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/z;

    .line 13
    invoke-virtual {v1, p0}, Lcom/ironsource/z;->a(Lcom/ironsource/E;)V

    goto :goto_1

    :cond_2
    return-void

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/ironsource/mg;->c:Lcom/ironsource/tg;

    const/16 v1, 0x1fd

    const-string v2, "Mediation No fill"

    invoke-interface {v0, v1, v2}, Lcom/ironsource/tg;->a(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/ironsource/mg;->i:Z

    .line 14
    iget-object v0, p0, Lcom/ironsource/mg;->h:Lcom/ironsource/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/z;->b()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/ironsource/C;)V
    .locals 2

    const-string v0, "adInstanceFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/mg;->d:Lcom/ironsource/og;

    .line 5
    new-instance v1, Lcom/ironsource/mg$a;

    invoke-direct {v1, p0}, Lcom/ironsource/mg$a;-><init>(Lcom/ironsource/mg;)V

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/ironsource/og;->a(Lcom/ironsource/C;Lcom/ironsource/pg;)V

    return-void
.end method

.method public final a(Lcom/ironsource/I;)V
    .locals 4

    const-string v0, "adInstancePresenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/mg;->e:Lcom/ironsource/F;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/F;->c()Lcom/ironsource/F$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/ironsource/F$c;->c()Lcom/ironsource/z;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 10
    invoke-direct {p0, v1}, Lcom/ironsource/mg;->c(Lcom/ironsource/z;)V

    .line 11
    iget-object v1, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/ironsource/F$c;->c()Lcom/ironsource/z;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ironsource/F$c;->d()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/ironsource/vg;->a(Lcom/ironsource/z;Ljava/util/List;)V

    .line 12
    :cond_1
    invoke-virtual {v0}, Lcom/ironsource/F$c;->c()Lcom/ironsource/z;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/z;->a(Lcom/ironsource/I;)V

    :cond_2
    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/z;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "instance"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-boolean p1, p0, Lcom/ironsource/mg;->i:Z

    if-eqz p1, :cond_0

    return-void

    .line 33
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/mg;->f()V

    return-void
.end method

.method public a(Lcom/ironsource/z;)V
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-boolean v0, p0, Lcom/ironsource/mg;->i:Z

    if-nez v0, :cond_5

    invoke-direct {p0}, Lcom/ironsource/mg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/ironsource/vg;->a(Lcom/ironsource/z;)V

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 23
    iget-object v0, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/ironsource/vg;->b(Lcom/ironsource/z;)V

    .line 24
    :cond_2
    iget-object v0, p0, Lcom/ironsource/mg;->c:Lcom/ironsource/tg;

    invoke-interface {v0, p1}, Lcom/ironsource/tg;->b(Lcom/ironsource/z;)V

    return-void

    .line 27
    :cond_3
    iget-object v0, p0, Lcom/ironsource/mg;->e:Lcom/ironsource/F;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Lcom/ironsource/F;->a(Lcom/ironsource/z;)Z

    move-result v0

    if-ne v0, v1, :cond_4

    .line 28
    iget-object v0, p0, Lcom/ironsource/mg;->c:Lcom/ironsource/tg;

    invoke-interface {v0, p1}, Lcom/ironsource/tg;->a(Lcom/ironsource/z;)V

    :cond_4
    return-void

    .line 29
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lcom/ironsource/z;->c()V

    return-void
.end method

.method public final b()V
    .locals 5

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/mg;->a:Lcom/ironsource/V0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "dispose"

    invoke-static {v1, v4, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    .line 78
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/z;

    .line 79
    invoke-virtual {v1}, Lcom/ironsource/z;->c()V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 81
    iget-object v0, p0, Lcom/ironsource/mg;->a:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->h()Lcom/ironsource/Sf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Sf;->a()V

    return-void
.end method

.method public final b(Lcom/ironsource/z;)V
    .locals 3

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/ironsource/mg;->f:Lcom/ironsource/vg;

    if-eqz v0, :cond_0

    .line 83
    iget-object v1, p0, Lcom/ironsource/mg;->b:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->l()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/mg;->b:Lcom/ironsource/v0;

    invoke-virtual {v2}, Lcom/ironsource/v0;->o()Lcom/ironsource/fa;

    move-result-object v2

    .line 84
    invoke-virtual {v0, p1, v1, v2}, Lcom/ironsource/vg;->a(Lcom/ironsource/z;Ljava/lang/String;Lcom/ironsource/fa;)V

    :cond_0
    return-void
.end method

.method public final c()Lcom/ironsource/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mg;->e:Lcom/ironsource/F;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/F;->c()Lcom/ironsource/F$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/F$c;->c()Lcom/ironsource/z;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/mg;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/z;

    .line 2
    invoke-virtual {v1}, Lcom/ironsource/z;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
