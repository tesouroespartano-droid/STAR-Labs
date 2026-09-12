.class public final Lcom/ironsource/hg;
.super Lcom/ironsource/Uc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/hg$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/ironsource/hg$a;

.field private static final g:Ljava/lang/String; = "ViewVisibilityTrigger"


# instance fields
.field private final d:Lcom/ironsource/hg$b;

.field private final e:Lcom/ironsource/jg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/hg$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/hg$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/hg;->f:Lcom/ironsource/hg$a;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1
    invoke-direct {p0, v1, v2, v0}, Lcom/ironsource/Uc;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    new-instance v0, Lcom/ironsource/hg$b;

    invoke-direct {v0, p0}, Lcom/ironsource/hg$b;-><init>(Lcom/ironsource/hg;)V

    iput-object v0, p0, Lcom/ironsource/hg;->d:Lcom/ironsource/hg$b;

    .line 14
    new-instance v1, Lcom/ironsource/jg;

    invoke-direct {v1, v0}, Lcom/ironsource/jg;-><init>(Lcom/ironsource/Fc;)V

    iput-object v1, p0, Lcom/ironsource/hg;->e:Lcom/ironsource/jg;

    .line 17
    invoke-virtual {v1, p1}, Lcom/ironsource/jg;->a(Landroid/view/View;)V

    .line 18
    invoke-virtual {v1}, Lcom/ironsource/jg;->c()Z

    move-result p1

    xor-int/2addr p1, v2

    invoke-virtual {p0, p1}, Lcom/ironsource/Uc;->a(Z)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ViewVisibilityTrigger"

    return-object v0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/hg;->e:Lcom/ironsource/jg;

    invoke-virtual {v0}, Lcom/ironsource/jg;->b()V

    return-void
.end method
