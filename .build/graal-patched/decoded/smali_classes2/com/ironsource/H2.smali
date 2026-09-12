.class public Lcom/ironsource/H2;
.super Lcom/ironsource/p3;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/r0;
.implements Lcom/ironsource/G2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ironsource/p3<",
        "Lcom/ironsource/L2;",
        "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdViewListener;",
        ">;",
        "Lcom/ironsource/r0;",
        "Lcom/ironsource/G2;"
    }
.end annotation


# instance fields
.field private K:Lcom/ironsource/b3;

.field private L:Z

.field private M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

.field private N:Landroid/view/View;

.field private O:Lcom/ironsource/s3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ironsource/s3<",
            "*>;"
        }
    .end annotation
.end field

.field private P:Landroid/widget/FrameLayout$LayoutParams;

.field private final Q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final R:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static bridge synthetic -$$Nest$fgetQ(Lcom/ironsource/H2;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/H2;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$mO(Lcom/ironsource/H2;)Lcom/ironsource/b3;
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic -$$Nest$mW(Lcom/ironsource/H2;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/H2;->W()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ironsource/V2;Ljava/lang/String;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/V2;",
            "Ljava/lang/String;",
            "Lcom/ironsource/fa;",
            "Lcom/ironsource/mediationsdk/IronSourceSegment;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ironsource/I2;

    invoke-direct {v0, p3, p1, p2}, Lcom/ironsource/I2;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/V2;)V

    invoke-direct {p0, v0, p4, p5}, Lcom/ironsource/p3;-><init>(Lcom/ironsource/U;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/ironsource/H2;->L:Z

    .line 9
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/ironsource/H2;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/ironsource/H2;->R:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    invoke-direct {p0}, Lcom/ironsource/H2;->N()Lcom/ironsource/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/H2;->K:Lcom/ironsource/b3;

    return-void
.end method

.method private M()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/p3;->q:Lcom/ironsource/P0;

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/ironsource/H2$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/h3;->l()V

    .line 10
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/h3;->m()V

    .line 11
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->a()V

    .line 12
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->b()V

    return-void

    .line 13
    :cond_1
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/P0;->a()V

    return-void
.end method

.method private N()Lcom/ironsource/b3;
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/b3;

    iget-object v1, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 2
    invoke-virtual {v1}, Lcom/ironsource/U;->h()Lcom/ironsource/N0;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v2}, Lcom/ironsource/U;->g()Lcom/ironsource/H0;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, Lcom/ironsource/b3;-><init>(Lcom/ironsource/N0;Lcom/ironsource/H0;Lcom/ironsource/G2;)V

    return-object v0
.end method

.method private O()Lcom/ironsource/b3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2;->K:Lcom/ironsource/b3;

    return-object v0
.end method

.method private P()Lcom/ironsource/h3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/p3;->q:Lcom/ironsource/P0;

    check-cast v0, Lcom/ironsource/h3;

    return-object v0
.end method

.method private Q()Lcom/ironsource/mediationsdk/ISBannerSize;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->getSize()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->getSize()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/ISBannerSize;->isSmart()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/AdapterUtils;->isLargeScreen(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/ironsource/mediationsdk/l;->a()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lcom/ironsource/mediationsdk/ISBannerSize;->BANNER:Lcom/ironsource/mediationsdk/ISBannerSize;

    return-object v0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->getSize()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private S()Z
    .locals 4

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/ironsource/H2;->N:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/ironsource/H2;->P:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ironsource/H2;->O:Lcom/ironsource/s3;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p0, v1}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/ironsource/H2;->N:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ironsource/H2;->P:Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ironsource/H2;->O:Lcom/ironsource/s3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/p3;->q:Lcom/ironsource/P0;

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/ironsource/H2$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/h3;->r()V

    return-void

    .line 10
    :cond_1
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/P0;->k()V

    return-void
.end method

.method private V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/p3;->q:Lcom/ironsource/P0;

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/P0;->b()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/ironsource/H2$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/h3;->q()V

    return-void

    .line 10
    :cond_1
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/P0;->k()V

    return-void
.end method

.method private W()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/ironsource/H2;->O:Lcom/ironsource/s3;

    .line 2
    iput-object v0, p0, Lcom/ironsource/H2;->N:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/ironsource/H2;->P:Landroid/widget/FrameLayout$LayoutParams;

    return-void
.end method

.method private b(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    .line 60
    move-object v0, p1

    check-cast v0, Lcom/ironsource/L2;

    invoke-virtual {v0}, Lcom/ironsource/L2;->R()V

    .line 62
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    new-instance v1, Lcom/ironsource/H2$a;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/H2$a;-><init>(Lcom/ironsource/H2;Lcom/ironsource/s3;)V

    invoke-static {v0, p2, p3, v1}, Lcom/ironsource/mediationsdk/l;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Lcom/ironsource/D3;)V

    return-void
.end method

.method private c(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    .line 21
    sget-object v0, Lcom/ironsource/p3$f;->e:Lcom/ironsource/p3$f;

    sget-object v1, Lcom/ironsource/p3$f;->f:Lcom/ironsource/p3$f;

    invoke-virtual {p0, v0, v1}, Lcom/ironsource/p3;->a(Lcom/ironsource/p3$f;Lcom/ironsource/p3$f;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/ironsource/H2;->R:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->e()V

    .line 27
    move-object v0, p1

    check-cast v0, Lcom/ironsource/L2;

    invoke-virtual {v0}, Lcom/ironsource/L2;->R()V

    .line 29
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    new-instance v1, Lcom/ironsource/H2$b;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/H2$b;-><init>(Lcom/ironsource/H2;Lcom/ironsource/s3;)V

    invoke-static {v0, p2, p3, v1}, Lcom/ironsource/mediationsdk/l;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Lcom/ironsource/D3;)V

    return-void

    .line 55
    :cond_0
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "wrong state = "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/ironsource/p3;->p:Lcom/ironsource/p3$f;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method R()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v2, "banner or one of its parents are INVISIBLE or GONE"

    invoke-virtual {v0, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v2, "banner has no window focus"

    invoke-virtual {v0, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return v1

    .line 13
    :cond_1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    iget-object v1, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    .line 15
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "visible = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    return v0
.end method

.method public T()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/ironsource/H2;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V

    :cond_0
    return-void
.end method

.method protected a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;)Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;
    .locals 0

    .line 7
    check-cast p2, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterSettingsInterface;

    .line 8
    invoke-interface {p2, p1}, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterSettingsInterface;->getBannerLoadWhileShowSupportedState(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Ljava/lang/String;)Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;
    .locals 2

    .line 204
    invoke-virtual {p0, p1}, Lcom/ironsource/H2;->b(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v0}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    .line 205
    invoke-static {p1, v0, p2, v1}, Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;->createAdDataForNetworkAdapter(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/s3;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/ironsource/H2;->b(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/L2;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/ironsource/A0;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/A0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 154
    invoke-super {p0, p1}, Lcom/ironsource/p3;->a(Lcom/ironsource/A0;)Ljava/util/Map;

    move-result-object p1

    .line 157
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {p0, v0}, Lcom/ironsource/H2;->b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->getSize()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ironsource/mediationsdk/l;->a(Ljava/util/Map;Lcom/ironsource/mediationsdk/ISBannerSize;)V

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/ironsource/p3;->i:Lcom/ironsource/mediationsdk/model/Placement;

    if-eqz v0, :cond_1

    .line 162
    invoke-virtual {p0}, Lcom/ironsource/p3;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "placement"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method protected a(ILjava/lang/String;Z)V
    .locals 2

    .line 9
    invoke-virtual {p0}, Lcom/ironsource/H2;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p3, :cond_0

    .line 14
    iget-object p3, p0, Lcom/ironsource/p3;->n:Lcom/ironsource/k5;

    invoke-static {p3}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v0

    .line 15
    iget-object p3, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object p3, p3, Lcom/ironsource/D0;->f:Lcom/ironsource/nb;

    invoke-virtual {p3, v0, v1, p1, p2}, Lcom/ironsource/nb;->a(JILjava/lang/String;)V

    .line 19
    new-instance p3, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-direct {p3, p1, p2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 20
    invoke-static {}, Lcom/ironsource/mediationsdk/n;->a()Lcom/ironsource/mediationsdk/n;

    move-result-object p1

    iget-object p2, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {p2}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/ironsource/mediationsdk/n;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/H2;->v()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 25
    sget-object p1, Lcom/ironsource/p3$f;->f:Lcom/ironsource/p3$f;

    invoke-virtual {p0, p1}, Lcom/ironsource/p3;->a(Lcom/ironsource/p3$f;)V

    .line 26
    invoke-direct {p0}, Lcom/ironsource/H2;->V()V

    :cond_1
    return-void

    .line 29
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/ironsource/p3;->a(ILjava/lang/String;Z)V

    return-void
.end method

.method protected a(Landroid/content/Context;Lcom/ironsource/mediationsdk/i;Lcom/ironsource/S1;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/p3;->c:Lcom/ironsource/mediationsdk/e;

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/ironsource/H2;->Q()Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ironsource/mediationsdk/i;->a(Lcom/ironsource/mediationsdk/ISBannerSize;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/p3;->c:Lcom/ironsource/mediationsdk/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ironsource/mediationsdk/e;->a(Landroid/content/Context;Lcom/ironsource/mediationsdk/i;Lcom/ironsource/S1;)V

    return-void

    .line 6
    :cond_0
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string p2, "mAuctionHandler is null"

    invoke-virtual {p0, p2}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V
    .locals 4

    const-string v0, "destroy banner failed - errorMessage = "

    .line 97
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/ironsource/H2;->b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 99
    const-string v1, "can\'t destroy banner - %s"

    if-nez p1, :cond_0

    .line 102
    const-string p1, "banner is null"

    goto :goto_0

    :cond_0
    const-string p1, "banner is destroyed"

    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 103
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 106
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void

    .line 109
    :cond_1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "destroying banner"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 112
    invoke-direct {p0}, Lcom/ironsource/H2;->M()V

    .line 115
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0}, Lcom/ironsource/rg;->d()Lcom/ironsource/s3;

    move-result-object v0

    check-cast v0, Lcom/ironsource/L2;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 119
    invoke-virtual {v0}, Lcom/ironsource/s3;->r()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 120
    invoke-virtual {v0}, Lcom/ironsource/s3;->r()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    .line 121
    :cond_2
    iget-object v2, p0, Lcom/ironsource/p3;->C:Lcom/ironsource/M8;

    iget-object v3, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v3}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ironsource/M8;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result v2

    .line 122
    :goto_1
    iget-object v3, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v3, v3, Lcom/ironsource/D0;->f:Lcom/ironsource/nb;

    invoke-virtual {v3, v2}, Lcom/ironsource/nb;->a(I)V

    .line 124
    invoke-virtual {v0}, Lcom/ironsource/L2;->P()V

    .line 126
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0, v1}, Lcom/ironsource/rg;->a(Lcom/ironsource/s3;)V

    .line 127
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0, v1}, Lcom/ironsource/rg;->b(Lcom/ironsource/s3;)V

    .line 131
    :cond_3
    invoke-static {p1}, Lcom/ironsource/mediationsdk/l;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V

    .line 132
    iput-object v1, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    .line 133
    iput-object v1, p0, Lcom/ironsource/p3;->i:Lcom/ironsource/mediationsdk/model/Placement;

    const/4 p1, 0x0

    .line 134
    iput-boolean p1, p0, Lcom/ironsource/H2;->L:Z

    .line 137
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    iget-object v0, p0, Lcom/ironsource/H2;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 139
    iget-object v0, p0, Lcom/ironsource/H2;->R:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 140
    invoke-direct {p0}, Lcom/ironsource/H2;->W()V

    .line 144
    :cond_4
    sget-object p1, Lcom/ironsource/p3$f;->b:Lcom/ironsource/p3$f;

    invoke-virtual {p0, p1}, Lcom/ironsource/p3;->a(Lcom/ironsource/p3$f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 148
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "destroyBanner - exception = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " state = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/p3;->p:Lcom/ironsource/p3$f;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 151
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0, p1}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    if-eqz v0, :cond_5

    .line 153
    iget-object v0, v0, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {v0, p1}, Lcom/ironsource/Sf;->g(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/mediationsdk/model/Placement;)V
    .locals 4

    .line 30
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "placement = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0, p1}, Lcom/ironsource/H2;->b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z

    move-result v0

    const-string v1, "can\'t load banner - %s"

    const/16 v2, 0x1fe

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    .line 39
    const-string v0, "banner is null"

    goto :goto_0

    :cond_0
    const-string v0, "banner is destroyed"

    :goto_0
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 40
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_1
    if-eqz p2, :cond_4

    .line 45
    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/ironsource/p3;->E:Lcom/ironsource/N7;

    .line 55
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 57
    invoke-virtual {v3}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v3

    .line 58
    invoke-interface {v0, v1, p2, v3}, Lcom/ironsource/N7;->c(Landroid/content/Context;Lcom/ironsource/mediationsdk/model/BasePlacement;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 62
    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/model/BasePlacement;->getPlacementName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "placement %s is capped"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 63
    iget-object v1, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v1}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    invoke-static {v1}, Lcom/ironsource/z0;->f(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :cond_4
    :goto_1
    if-nez p2, :cond_5

    .line 67
    const-string v0, "placement is null"

    goto :goto_2

    :cond_5
    const-string v0, "placement name is empty"

    :goto_2
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 68
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v1}, Lcom/ironsource/U;->b()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    invoke-static {v1}, Lcom/ironsource/z0;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I

    move-result v2

    .line 84
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 86
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0, v0}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 88
    invoke-virtual {p0, v2, v0, p1}, Lcom/ironsource/H2;->a(ILjava/lang/String;Z)V

    return-void

    .line 92
    :cond_6
    invoke-static {p1}, Lcom/ironsource/mediationsdk/l;->b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V

    .line 93
    iput-object p1, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    .line 94
    iput-object p2, p0, Lcom/ironsource/p3;->i:Lcom/ironsource/mediationsdk/model/Placement;

    .line 96
    invoke-virtual {p0}, Lcom/ironsource/p3;->A()V

    return-void
.end method

.method public a(Lcom/ironsource/s3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    .line 196
    invoke-super {p0, p1}, Lcom/ironsource/p3;->a(Lcom/ironsource/s3;)V

    .line 198
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/h3;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 199
    iget-object p1, p0, Lcom/ironsource/H2;->R:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 200
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/b3;->b()V

    .line 201
    invoke-direct {p0}, Lcom/ironsource/H2;->U()V

    return-void

    .line 203
    :cond_0
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v0, "Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress"

    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    .line 163
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mState = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ironsource/p3;->p:Lcom/ironsource/p3$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 165
    invoke-super {p0, p1}, Lcom/ironsource/p3;->d(Lcom/ironsource/s3;)V

    .line 167
    iget-object v0, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v0}, Lcom/ironsource/U;->h()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    sget-object v1, Lcom/ironsource/N0$a;->b:Lcom/ironsource/N0$a;

    if-ne v0, v1, :cond_0

    .line 169
    sget-object v0, Lcom/ironsource/p3$f;->e:Lcom/ironsource/p3$f;

    sget-object v1, Lcom/ironsource/p3$f;->f:Lcom/ironsource/p3$f;

    invoke-virtual {p0, v0, v1}, Lcom/ironsource/p3;->a(Lcom/ironsource/p3$f;Lcom/ironsource/p3$f;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0, p1}, Lcom/ironsource/rg;->a(Lcom/ironsource/s3;)V

    .line 171
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0, p1}, Lcom/ironsource/rg;->b(Lcom/ironsource/s3;)V

    .line 173
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/H2;->b(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    .line 175
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/P0;->k()V

    .line 178
    iget-object p2, p0, Lcom/ironsource/p3;->t:Lcom/ironsource/K0;

    invoke-virtual {p1}, Lcom/ironsource/s3;->f()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/K0;->c(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    return-void

    .line 180
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/H2;->P()Lcom/ironsource/h3;

    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lcom/ironsource/h3;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/ironsource/p3;->a:Lcom/ironsource/rg;

    invoke-virtual {v0, p1}, Lcom/ironsource/rg;->b(Lcom/ironsource/s3;)V

    .line 186
    iget-object v0, p0, Lcom/ironsource/H2;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/H2;->c(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    goto :goto_0

    .line 189
    :cond_1
    iput-object p1, p0, Lcom/ironsource/H2;->O:Lcom/ironsource/s3;

    .line 190
    iput-object p2, p0, Lcom/ironsource/H2;->N:Landroid/view/View;

    .line 191
    iput-object p3, p0, Lcom/ironsource/H2;->P:Landroid/widget/FrameLayout$LayoutParams;

    .line 195
    :goto_0
    iget-object p2, p0, Lcom/ironsource/p3;->t:Lcom/ironsource/K0;

    invoke-virtual {p1}, Lcom/ironsource/s3;->f()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/K0;->c(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    :cond_2
    return-void
.end method

.method protected b(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/L2;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "*",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdViewListener;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/ironsource/n2;",
            ")",
            "Lcom/ironsource/L2;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ironsource/l0;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    iget-object v2, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 4
    invoke-virtual {v2}, Lcom/ironsource/U;->o()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/ironsource/p3;->g:Lorg/json/JSONObject;

    iget v6, p0, Lcom/ironsource/p3;->e:I

    iget-object v7, p0, Lcom/ironsource/p3;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 11
    invoke-virtual {v3}, Lcom/ironsource/U;->n()I

    move-result v9

    move-object v8, p1

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v9}, Lcom/ironsource/l0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;ILjava/lang/String;Lcom/ironsource/mediationsdk/model/NetworkSettings;I)V

    .line 13
    new-instance p1, Lcom/ironsource/L2;

    iget-object v4, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    iget-object v5, p0, Lcom/ironsource/p3;->i:Lcom/ironsource/mediationsdk/model/Placement;

    .line 19
    invoke-virtual {p0}, Lcom/ironsource/H2;->v()Z

    move-result v6

    move-object v8, p0

    move-object v1, p0

    move-object v3, p2

    move-object v7, p5

    move-object v2, v0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lcom/ironsource/L2;-><init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/mediationsdk/model/Placement;ZLcom/ironsource/n2;Lcom/ironsource/r0;)V

    return-object v0
.end method

.method protected b(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Lorg/json/JSONObject;
    .locals 0

    .line 67
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getBannerSettings()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 5

    const-string v0, "wrong state = "

    .line 20
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Lcom/ironsource/p3;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 22
    :try_start_0
    iget-object v2, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-nez v2, :cond_0

    .line 23
    const-string v0, "mIronSourceBanner is null"

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v0, v0, Lcom/ironsource/D0;->f:Lcom/ironsource/nb;

    const/16 v1, 0x26e

    invoke-virtual {v0, v1}, Lcom/ironsource/nb;->b(I)V

    return-void

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/H2;->R()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 30
    iget-object v2, p0, Lcom/ironsource/p3;->x:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    sget-object v3, Lcom/ironsource/p3$f;->f:Lcom/ironsource/p3$f;

    sget-object v4, Lcom/ironsource/p3$f;->b:Lcom/ironsource/p3$f;

    invoke-virtual {p0, v3, v4}, Lcom/ironsource/p3;->a(Lcom/ironsource/p3$f;Lcom/ironsource/p3$f;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 32
    const-string v0, "start reload"

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lcom/ironsource/H2;->L:Z

    goto :goto_0

    .line 36
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ironsource/p3;->p:Lcom/ironsource/p3$f;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 38
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_4

    .line 40
    :try_start_2
    iget-object v0, p0, Lcom/ironsource/H2;->M:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    iget-object v1, p0, Lcom/ironsource/p3;->i:Lcom/ironsource/mediationsdk/model/Placement;

    invoke-virtual {p0, v0, v1}, Lcom/ironsource/H2;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;Lcom/ironsource/mediationsdk/model/Placement;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception v0

    .line 41
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v0}, Lcom/ironsource/U;->h()Lcom/ironsource/N0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/N0;->a()Lcom/ironsource/N0$a;

    move-result-object v0

    sget-object v2, Lcom/ironsource/N0$a;->b:Lcom/ironsource/N0$a;

    if-ne v0, v2, :cond_3

    .line 50
    const-string v0, "banner is not visible, reload skipped"

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v0, v0, Lcom/ironsource/D0;->f:Lcom/ironsource/nb;

    const/16 v1, 0x265

    invoke-virtual {v0, v1}, Lcom/ironsource/nb;->b(I)V

    .line 54
    :cond_3
    invoke-direct {p0}, Lcom/ironsource/H2;->U()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    .line 57
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 58
    iget-object v1, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v1, v1, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/Sf;->c(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public b(Lcom/ironsource/s3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    .line 63
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Lcom/ironsource/s3;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/ironsource/p3;->t:Lcom/ironsource/K0;

    invoke-virtual {p1}, Lcom/ironsource/s3;->f()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/K0;->e(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    return-void
.end method

.method b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 59
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/IronSourceBannerLayout;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/H2;->R()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "banner is not visible, binding skipped"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->h()V

    .line 5
    iget-object v0, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v0, v0, Lcom/ironsource/D0;->f:Lcom/ironsource/nb;

    const/16 v1, 0x26f

    invoke-virtual {v0, v1}, Lcom/ironsource/nb;->b(I)V

    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/H2;->S()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "done binding timer, binding view now, current timestamp = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/ironsource/H2;->O:Lcom/ironsource/s3;

    iget-object v1, p0, Lcom/ironsource/H2;->N:Landroid/view/View;

    iget-object v2, p0, Lcom/ironsource/H2;->P:Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p0, v0, v1, v2}, Lcom/ironsource/H2;->c(Lcom/ironsource/s3;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void

    .line 18
    :cond_1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "Cannot bind banner view after interval, the next ad is not ready yet"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/ironsource/H2;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public c(Lcom/ironsource/s3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    .line 56
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Lcom/ironsource/s3;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/ironsource/p3;->t:Lcom/ironsource/K0;

    invoke-virtual {p1}, Lcom/ironsource/s3;->f()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/K0;->b(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/H2;->R()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "banner is not visible, starting the impression timeout timer again"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/ironsource/H2;->O()Lcom/ironsource/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/b3;->e()V

    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ironsource/H2;->R:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "banner impression timeout reached, reloading banner manually"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Lcom/ironsource/H2;->U()V

    .line 19
    iget-object v0, p0, Lcom/ironsource/p3;->s:Lcom/ironsource/D0;

    iget-object v0, v0, Lcom/ironsource/D0;->j:Lcom/ironsource/Sf;

    invoke-virtual {v0, v1}, Lcom/ironsource/Sf;->b(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public f(Lcom/ironsource/s3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Lcom/ironsource/s3;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ironsource/p3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ironsource/p3;->t:Lcom/ironsource/K0;

    invoke-virtual {p1}, Lcom/ironsource/s3;->f()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/K0;->f(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V

    return-void
.end method

.method protected g()Lcom/ironsource/K0;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/c3;

    invoke-direct {v0}, Lcom/ironsource/c3;-><init>()V

    return-object v0
.end method

.method protected g(Lcom/ironsource/s3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method protected h()Lcom/ironsource/P0;
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/h3;

    iget-object v1, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    invoke-virtual {v1}, Lcom/ironsource/U;->h()Lcom/ironsource/N0;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/ironsource/h3;-><init>(Lcom/ironsource/N0;Lcom/ironsource/tb;)V

    return-object v0
.end method

.method protected h(Lcom/ironsource/s3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/s3<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method protected l()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BN"

    return-object v0
.end method

.method protected o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "OPW_BN"

    return-object v0
.end method

.method protected v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/H2;->L:Z

    return v0
.end method
