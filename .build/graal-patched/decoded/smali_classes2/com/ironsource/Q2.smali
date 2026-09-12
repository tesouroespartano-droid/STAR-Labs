.class public final Lcom/ironsource/Q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/D2;


# instance fields
.field private final a:Lcom/ironsource/G9;

.field private final b:Lcom/ironsource/h8;

.field private final c:Lcom/ironsource/W1;

.field private final d:Lcom/ironsource/p1;

.field private final e:Lcom/ironsource/ac;

.field private final f:Lcom/ironsource/If;

.field private final g:Lcom/ironsource/M8;

.field private final h:Lcom/ironsource/M8$a;

.field private i:Lcom/unity3d/ironsourceads/banner/BannerAdInfo;

.field private j:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/R2;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$6Z3nwMtj0iacUQkO1spSW2qZIU8(Lcom/ironsource/Q2;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Q2;->b(Lcom/ironsource/Q2;)V

    return-void
.end method

.method public static synthetic $r8$lambda$mnMaxQ7px5A6KSCcPcJBcwK2WBg(Lcom/ironsource/Q2;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Q2;->a(Lcom/ironsource/Q2;)V

    return-void
.end method

.method public static synthetic $r8$lambda$wU-aUQ9ArK2j5uGF27XtgwAk3kk(Lcom/ironsource/Q2;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Q2;->c(Lcom/ironsource/Q2;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/G9;Lcom/ironsource/h8;Lcom/ironsource/W1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;)V
    .locals 1

    const-string v0, "adInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "auctionDataReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkDestroyAPI"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDepthService"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDepthServiceEditor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ironsource/Q2;->a:Lcom/ironsource/G9;

    .line 4
    iput-object p2, p0, Lcom/ironsource/Q2;->b:Lcom/ironsource/h8;

    .line 5
    iput-object p3, p0, Lcom/ironsource/Q2;->c:Lcom/ironsource/W1;

    .line 6
    iput-object p4, p0, Lcom/ironsource/Q2;->d:Lcom/ironsource/p1;

    .line 7
    iput-object p5, p0, Lcom/ironsource/Q2;->e:Lcom/ironsource/ac;

    .line 8
    iput-object p6, p0, Lcom/ironsource/Q2;->f:Lcom/ironsource/If;

    .line 9
    iput-object p7, p0, Lcom/ironsource/Q2;->g:Lcom/ironsource/M8;

    .line 11
    iput-object p8, p0, Lcom/ironsource/Q2;->h:Lcom/ironsource/M8$a;

    .line 15
    new-instance p2, Lcom/unity3d/ironsourceads/banner/BannerAdInfo;

    invoke-virtual {p1}, Lcom/ironsource/G9;->f()Ljava/lang/String;

    move-result-object p3

    const-string p4, "adInstance.instanceId"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ironsource/G9;->e()Ljava/lang/String;

    move-result-object p4

    const-string p5, "adInstance.id"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3, p4}, Lcom/unity3d/ironsourceads/banner/BannerAdInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ironsource/Q2;->i:Lcom/unity3d/ironsourceads/banner/BannerAdInfo;

    .line 16
    new-instance p2, Ljava/lang/ref/WeakReference;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/ironsource/Q2;->j:Ljava/lang/ref/WeakReference;

    .line 17
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/ironsource/Q2;->k:Ljava/lang/ref/WeakReference;

    .line 25
    new-instance p2, Lcom/ironsource/yc;

    invoke-direct {p2}, Lcom/ironsource/yc;-><init>()V

    .line 26
    invoke-virtual {p1, p2}, Lcom/ironsource/G9;->a(Lcom/ironsource/wc;)V

    .line 27
    invoke-virtual {p2, p0}, Lcom/ironsource/yc;->a(Lcom/ironsource/D2;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/G9;Lcom/ironsource/h8;Lcom/ironsource/W1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 28
    new-instance v1, Lcom/ironsource/bc;

    invoke-direct {v1}, Lcom/ironsource/bc;-><init>()V

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    .line 29
    sget-object v1, Lcom/ironsource/T7;->a:Lcom/ironsource/T7;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 31
    sget-object v1, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v1}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/J7;->s()Lcom/ironsource/M8;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    .line 33
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->h()Lcom/ironsource/M8$a;

    move-result-object v0

    move-object v10, v0

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 34
    invoke-direct/range {v2 .. v10}, Lcom/ironsource/Q2;-><init>(Lcom/ironsource/G9;Lcom/ironsource/h8;Lcom/ironsource/W1;Lcom/ironsource/p1;Lcom/ironsource/ac;Lcom/ironsource/If;Lcom/ironsource/M8;Lcom/ironsource/M8$a;)V

    return-void
.end method

.method private final a()Lcom/ironsource/Q2$a;
    .locals 1

    .line 5
    new-instance v0, Lcom/ironsource/Q2$a;

    invoke-direct {v0, p0}, Lcom/ironsource/Q2$a;-><init>(Lcom/ironsource/Q2;)V

    return-object v0
.end method

.method private static final a(Lcom/ironsource/Q2;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/i1$d;->a:Lcom/ironsource/i1$d$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$d$a;->b()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Q2;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/Q2;->e:Lcom/ironsource/ac;

    iget-object p0, p0, Lcom/ironsource/Q2;->a:Lcom/ironsource/G9;

    invoke-interface {v0, p0}, Lcom/ironsource/ac;->a(Lcom/ironsource/G9;)V

    return-void
.end method

.method private static final b(Lcom/ironsource/Q2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object p0, p0, Lcom/ironsource/Q2;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ironsource/R2;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/ironsource/R2;->onBannerAdClicked()V

    :cond_0
    return-void
.end method

.method private static final c(Lcom/ironsource/Q2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p0, p0, Lcom/ironsource/Q2;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ironsource/R2;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/ironsource/R2;->onBannerAdShown()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/unity3d/ironsourceads/banner/BannerAdInfo;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/ironsource/Q2;->i:Lcom/unity3d/ironsourceads/banner/BannerAdInfo;

    return-void
.end method

.method public final a(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/R2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Q2;->j:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final b()V
    .locals 6

    .line 4
    iget-object v0, p0, Lcom/ironsource/Q2;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/Q2$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/ironsource/Q2$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Q2;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/ironsource/If;->a(Lcom/ironsource/If;Ljava/lang/Runnable;JILjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/FrameLayout;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/ironsource/Q2;->k:Ljava/lang/ref/WeakReference;

    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/ironsource/Q2;->a()Lcom/ironsource/Q2$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void
.end method

.method public final c()Lcom/unity3d/ironsourceads/banner/BannerAdInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q2;->i:Lcom/unity3d/ironsourceads/banner/BannerAdInfo;

    return-object v0
.end method

.method public final d()Lcom/ironsource/h8;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q2;->b:Lcom/ironsource/h8;

    return-object v0
.end method

.method public final e()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/R2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q2;->j:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final f()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q2;->k:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method protected final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Q2;->b()V

    return-void
.end method

.method public onBannerClick()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    invoke-virtual {v0}, Lcom/ironsource/i1$a$a;->a()Lcom/ironsource/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Q2;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v1}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/Q2;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/Q2$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/ironsource/Q2$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Q2;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onBannerShowSuccess()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q2;->g:Lcom/ironsource/M8;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v1}, Lcom/ironsource/M8;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result v0

    .line 2
    sget-object v2, Lcom/ironsource/i1$a;->a:Lcom/ironsource/i1$a$a;

    new-instance v3, Lcom/ironsource/l1$w;

    invoke-direct {v3, v0}, Lcom/ironsource/l1$w;-><init>(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/ironsource/m1;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    invoke-virtual {v2, v0}, Lcom/ironsource/i1$a$a;->f([Lcom/ironsource/m1;)Lcom/ironsource/i1;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/ironsource/Q2;->d:Lcom/ironsource/p1;

    invoke-interface {v0, v2}, Lcom/ironsource/i1;->a(Lcom/ironsource/p1;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/Q2;->h:Lcom/ironsource/M8$a;

    invoke-interface {v0, v1}, Lcom/ironsource/M8$a;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/Q2;->c:Lcom/ironsource/W1;

    const-string v1, "onBannerShowSuccess"

    invoke-virtual {v0, v1}, Lcom/ironsource/W1;->b(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ironsource/Q2;->f:Lcom/ironsource/If;

    new-instance v1, Lcom/ironsource/Q2$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/ironsource/Q2$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/Q2;)V

    invoke-interface {v0, v1}, Lcom/ironsource/If;->a(Ljava/lang/Runnable;)V

    return-void
.end method
