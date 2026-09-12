.class final Lcom/ironsource/Jf$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Jf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/M2;

.field public b:Lcom/ironsource/s0;

.field private c:Z

.field final synthetic d:Lcom/ironsource/Jf;


# direct methods
.method public constructor <init>(Lcom/ironsource/Jf;Lcom/ironsource/O2;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/O2;",
            "Z)V"
        }
    .end annotation

    const-string v0, "bannerAdUnitFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/ironsource/Jf$a;->d:Lcom/ironsource/Jf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-interface {p2, p3}, Lcom/ironsource/O2;->a(Z)Lcom/ironsource/M2;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/Jf$a;->a:Lcom/ironsource/M2;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/ironsource/Jf$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf$a;->b:Lcom/ironsource/s0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adUnitCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lcom/ironsource/s0;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Jf$a;->b:Lcom/ironsource/s0;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ironsource/Jf$a;->a:Lcom/ironsource/M2;

    invoke-virtual {v0, p1}, Lcom/ironsource/o0;->a(Z)V

    return-void
.end method

.method public final b()Lcom/ironsource/M2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf$a;->a:Lcom/ironsource/M2;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ironsource/Jf$a;->c:Z

    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/Jf$a;->c:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf$a;->a:Lcom/ironsource/M2;

    invoke-virtual {v0}, Lcom/ironsource/o0;->d()Lcom/ironsource/i0;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/i0;->a()Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Jf$a;->a:Lcom/ironsource/M2;

    iget-object v1, p0, Lcom/ironsource/Jf$a;->d:Lcom/ironsource/Jf;

    invoke-virtual {v0, v1}, Lcom/ironsource/o0;->a(Lcom/ironsource/L0;)V

    return-void
.end method
