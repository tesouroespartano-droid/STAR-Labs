.class public final Lcom/ironsource/Yb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Yb$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/ironsource/Yb$a;

.field private static volatile f:Lcom/ironsource/Yb;


# instance fields
.field private a:Lcom/ironsource/qd;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Ljava/lang/String;

.field private d:Lcom/ironsource/U3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/Yb$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/Yb$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/Yb;->e:Lcom/ironsource/Yb$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/ironsource/Yb;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/ironsource/Yb;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Yb;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lcom/ironsource/Yb;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Yb;->f:Lcom/ironsource/Yb;

    return-object v0
.end method

.method public static final synthetic a(Lcom/ironsource/Yb;)V
    .locals 0

    .line 2
    sput-object p0, Lcom/ironsource/Yb;->f:Lcom/ironsource/Yb;

    return-void
.end method

.method public static final d()Lcom/ironsource/Yb;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lcom/ironsource/Yb;->e:Lcom/ironsource/Yb$a;

    invoke-virtual {v0}, Lcom/ironsource/Yb$a;->a()Lcom/ironsource/Yb;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/ironsource/U3;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/ironsource/Yb;->d:Lcom/ironsource/U3;

    return-void
.end method

.method public final a(Lcom/ironsource/qd;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ironsource/Yb;->a:Lcom/ironsource/qd;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Lcom/ironsource/Yb;->c:Ljava/lang/String;

    return-void
.end method

.method public final b()Lcom/ironsource/U3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yb;->d:Lcom/ironsource/U3;

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yb;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public final e()Lcom/ironsource/qd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yb;->a:Lcom/ironsource/qd;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yb;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
