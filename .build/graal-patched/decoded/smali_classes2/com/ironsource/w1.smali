.class public final Lcom/ironsource/w1;
.super Lcom/ironsource/Uc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/w1$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/ironsource/w1$a;

.field private static final g:Ljava/lang/String; = "AppLifecycleTrigger"


# instance fields
.field private final d:Lcom/ironsource/lifecycle/b;

.field private final e:Lcom/ironsource/ca;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/w1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/w1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/w1;->f:Lcom/ironsource/w1$a;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/lifecycle/b;)V
    .locals 3

    const-string v0, "lifeCycleObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-direct {p0, v2, v0, v1}, Lcom/ironsource/Uc;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/w1;->d:Lcom/ironsource/lifecycle/b;

    .line 10
    new-instance v0, Lcom/ironsource/w1$b;

    invoke-direct {v0, p0}, Lcom/ironsource/w1$b;-><init>(Lcom/ironsource/w1;)V

    iput-object v0, p0, Lcom/ironsource/w1;->e:Lcom/ironsource/ca;

    .line 25
    invoke-virtual {p1, v0}, Lcom/ironsource/lifecycle/b;->a(Lcom/ironsource/ca;)V

    .line 26
    invoke-virtual {p1}, Lcom/ironsource/lifecycle/b;->e()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Uc;->a(Z)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "AppLifecycleTrigger"

    return-object v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w1;->d:Lcom/ironsource/lifecycle/b;

    iget-object v1, p0, Lcom/ironsource/w1;->e:Lcom/ironsource/ca;

    invoke-virtual {v0, v1}, Lcom/ironsource/lifecycle/b;->b(Lcom/ironsource/ca;)V

    return-void
.end method
