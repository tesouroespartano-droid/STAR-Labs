.class public final Lcom/ironsource/jg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/Fc;

.field private b:Landroid/view/View;

.field private c:Z

.field private final d:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private final e:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

.field private final f:Landroid/graphics/Rect;


# direct methods
.method public static synthetic $r8$lambda$6sibsONk7Lv36VZ2ByWN01voT_4(Lcom/ironsource/jg;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/jg;->a(Lcom/ironsource/jg;)V

    return-void
.end method

.method public static synthetic $r8$lambda$OEa7z92CdHbns3syMzP3T8ilNGw(Lcom/ironsource/jg;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/jg;->a(Lcom/ironsource/jg;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/Fc;)V
    .locals 1

    const-string v0, "onVisibilityChangeListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/jg;->a:Lcom/ironsource/Fc;

    .line 6
    new-instance p1, Lcom/ironsource/jg$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/ironsource/jg$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/jg;)V

    iput-object p1, p0, Lcom/ironsource/jg;->d:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 7
    new-instance p1, Lcom/ironsource/jg$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/ironsource/jg$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/jg;)V

    iput-object p1, p0, Lcom/ironsource/jg;->e:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 9
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/ironsource/jg;->f:Landroid/graphics/Rect;

    return-void
.end method

.method private final a()V
    .locals 2

    .line 6
    invoke-virtual {p0}, Lcom/ironsource/jg;->c()Z

    move-result v0

    .line 7
    iget-boolean v1, p0, Lcom/ironsource/jg;->c:Z

    if-eq v1, v0, :cond_0

    .line 8
    iput-boolean v0, p0, Lcom/ironsource/jg;->c:Z

    .line 9
    iget-object v1, p0, Lcom/ironsource/jg;->a:Lcom/ironsource/Fc;

    invoke-interface {v1, v0}, Lcom/ironsource/Fc;->a(Z)V

    :cond_0
    return-void
.end method

.method private static final a(Lcom/ironsource/jg;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/ironsource/jg;->a()V

    return-void
.end method

.method private static final a(Lcom/ironsource/jg;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/ironsource/jg;->a()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/ironsource/jg;->b:Landroid/view/View;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/jg;->d:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/jg;->e:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/jg;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/jg;->d:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ironsource/jg;->b:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ironsource/jg;->e:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    :cond_1
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ironsource/jg;->b:Landroid/view/View;

    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/jg;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ironsource/jg;->f:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/ironsource/kg;->a(Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
