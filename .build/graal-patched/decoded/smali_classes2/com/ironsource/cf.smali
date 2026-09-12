.class public Lcom/ironsource/cf;
.super Lcom/ironsource/vg;
.source "SourceFile"


# instance fields
.field private final d:Lcom/ironsource/Lc;

.field private final e:Lcom/ironsource/qg;

.field private final f:Lcom/ironsource/F;


# direct methods
.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/Lc;Lcom/ironsource/qg;Lcom/ironsource/F;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outcomeReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waterfallInstances"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInstanceLoadStrategy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ironsource/vg;-><init>(Lcom/ironsource/n0;Lcom/ironsource/Lc;)V

    .line 2
    iput-object p2, p0, Lcom/ironsource/cf;->d:Lcom/ironsource/Lc;

    .line 3
    iput-object p3, p0, Lcom/ironsource/cf;->e:Lcom/ironsource/qg;

    .line 4
    iput-object p4, p0, Lcom/ironsource/cf;->f:Lcom/ironsource/F;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/ironsource/cf;->f:Lcom/ironsource/F;

    invoke-virtual {v0}, Lcom/ironsource/F;->c()Lcom/ironsource/F$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/F$c;->a()Lcom/ironsource/z;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lcom/ironsource/cf;->d:Lcom/ironsource/Lc;

    iget-object v2, p0, Lcom/ironsource/cf;->e:Lcom/ironsource/qg;

    invoke-virtual {v2}, Lcom/ironsource/qg;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/ironsource/Lc;->a(Ljava/util/List;Lcom/ironsource/z;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/ironsource/z;)V
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/cf;->f:Lcom/ironsource/F;

    invoke-virtual {v0, p1}, Lcom/ironsource/F;->a(Lcom/ironsource/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/cf;->d:Lcom/ironsource/Lc;

    iget-object v1, p0, Lcom/ironsource/cf;->e:Lcom/ironsource/qg;

    invoke-virtual {v1}, Lcom/ironsource/qg;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ironsource/Lc;->a(Ljava/util/List;Lcom/ironsource/z;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/ironsource/cf;->f:Lcom/ironsource/F;

    invoke-virtual {p1}, Lcom/ironsource/F;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/ironsource/cf;->f:Lcom/ironsource/F;

    invoke-virtual {p1}, Lcom/ironsource/F;->c()Lcom/ironsource/F$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/F$c;->a()Lcom/ironsource/z;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/ironsource/cf;->d:Lcom/ironsource/Lc;

    iget-object v1, p0, Lcom/ironsource/cf;->e:Lcom/ironsource/qg;

    invoke-virtual {v1}, Lcom/ironsource/qg;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ironsource/Lc;->a(Ljava/util/List;Lcom/ironsource/z;)V

    :cond_1
    return-void
.end method

.method public b(Lcom/ironsource/z;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/ironsource/z;)V
    .locals 2

    const-string v0, "instanceToShow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/cf;->d:Lcom/ironsource/Lc;

    iget-object v1, p0, Lcom/ironsource/cf;->e:Lcom/ironsource/qg;

    invoke-virtual {v1}, Lcom/ironsource/qg;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ironsource/Lc;->a(Ljava/util/List;Lcom/ironsource/z;)V

    return-void
.end method
