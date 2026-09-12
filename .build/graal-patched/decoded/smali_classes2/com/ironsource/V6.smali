.class public final Lcom/ironsource/V6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/if;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/V6$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/V6$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/ironsource/V6;-><init>(Lcom/ironsource/V6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/V6$a;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ironsource/V6;->a:Lcom/ironsource/V6$a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/V6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {p1}, Lcom/ironsource/W6;->a(Landroid/os/Handler;)Lcom/ironsource/V6$a;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/ironsource/V6;-><init>(Lcom/ironsource/V6$a;)V

    return-void
.end method

.method private final a(Lcom/ironsource/if$a;Ljava/lang/Runnable;)Lcom/ironsource/Vd;
    .locals 1

    .line 4
    new-instance v0, Lcom/ironsource/V6$b;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/V6$b;-><init>(Lcom/ironsource/if$a;Ljava/lang/Runnable;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;J)Lcom/ironsource/if$a;
    .locals 2

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/ironsource/if$a;

    invoke-direct {v0}, Lcom/ironsource/if$a;-><init>()V

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/ironsource/V6;->a(Lcom/ironsource/if$a;Ljava/lang/Runnable;)Lcom/ironsource/Vd;

    move-result-object p1

    .line 3
    iget-object v1, p0, Lcom/ironsource/V6;->a:Lcom/ironsource/V6$a;

    invoke-static {p2, p3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p2

    invoke-interface {v1, p1, p2, p3}, Lcom/ironsource/V6$a;->a(Ljava/lang/Runnable;J)V

    return-object v0
.end method
