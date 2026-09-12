.class public final Lcom/ironsource/Cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/mf$c;
.implements Lcom/ironsource/mf$d;
.implements Lcom/ironsource/mf$b;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/Handler;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;


# direct methods
.method public static synthetic $r8$lambda$FFG2O1w5HYdSXAXLh1VhUfbdtM4(Lcom/ironsource/Cf;Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/Cf;->a(Lcom/ironsource/Cf;Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$IcuiWSLufw91qi3JmdB2kD0PU08(Lcom/ironsource/Cf;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/Cf;->a(Lcom/ironsource/Cf;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Landroid/os/Handler;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ironsource/Cf;->a:Ljava/lang/ref/WeakReference;

    .line 7
    iput-object p2, p0, Lcom/ironsource/Cf;->b:Landroid/os/Handler;

    return-void
.end method

.method private final a(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)Landroid/widget/RelativeLayout;
    .locals 2

    .line 32
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 34
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 35
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private static final a(Lcom/ironsource/Cf;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/Cf;->f()Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;->getContainer()Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    return-void
.end method

.method private static final a(Lcom/ironsource/Cf;Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/Cf;->d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    :cond_0
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;->getContainer()Landroid/widget/RelativeLayout;

    move-result-object p1

    iget-object p0, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private final f()Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Cf;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;

    return-object v0
.end method


# virtual methods
.method public a(D)V
    .locals 1

    .line 21
    iget-object p1, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    if-nez p1, :cond_1

    .line 22
    invoke-direct {p0}, Lcom/ironsource/Cf;->f()Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 24
    iget-object p2, p0, Lcom/ironsource/Cf;->d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ironsource/Ef;->a:Lcom/ironsource/Ef;

    invoke-virtual {v0, p1}, Lcom/ironsource/Ef;->a(Landroid/content/Context;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    :goto_0
    invoke-direct {p0, p1}, Lcom/ironsource/Cf;->a(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)Landroid/widget/RelativeLayout;

    move-result-object p2

    iput-object p2, p0, Lcom/ironsource/Cf;->c:Landroid/widget/RelativeLayout;

    .line 26
    iget-object p2, p0, Lcom/ironsource/Cf;->b:Landroid/os/Handler;

    new-instance v0, Lcom/ironsource/Cf$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/Cf$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Cf;Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public a(Lcom/ironsource/sf;)V
    .locals 2

    const-string v0, "loadAdConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    .line 2
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 3
    invoke-virtual {v0, v1, p1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/sf;)V

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/zf;->h()V

    return-void
.end method

.method public a(Lcom/ironsource/sf;Ljava/lang/String;II)V
    .locals 2

    const-string v0, "loadAdConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/ironsource/Cf;->d()V

    .line 8
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/sf;)V

    .line 9
    invoke-direct {p0}, Lcom/ironsource/Cf;->f()Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {v0, p2, p3, p4}, Lcom/ironsource/zf;->a(Ljava/lang/String;II)Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object p2

    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/ironsource/zf;->a(Landroid/app/Activity;Lcom/ironsource/mediationsdk/ISBannerSize;)Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/ironsource/Cf;->d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    .line 20
    invoke-virtual {v0, p1}, Lcom/ironsource/zf;->b(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 6
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v0}, Lcom/ironsource/zf;->f()Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    .line 6
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    iget-object v1, p0, Lcom/ironsource/Cf;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public b(Lcom/ironsource/sf;)V
    .locals 2

    const-string v0, "loadAdConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    .line 2
    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 3
    invoke-virtual {v0, v1, p1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/sf;)V

    .line 5
    invoke-virtual {v0}, Lcom/ironsource/zf;->g()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    iget-object v1, p0, Lcom/ironsource/Cf;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Cf;->d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v1, v0}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ironsource/Cf;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ironsource/Cf$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/ironsource/Cf$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Cf;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ironsource/Cf;->d:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v0}, Lcom/ironsource/zf;->e()Z

    move-result v0

    return v0
.end method
