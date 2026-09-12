.class public Lcom/ironsource/Yd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/he;


# direct methods
.method public constructor <init>(Lcom/ironsource/Yd;)V
    .locals 1

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p1, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-direct {p0, p1}, Lcom/ironsource/Yd;-><init>(Lcom/ironsource/he;)V

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/he;)V
    .locals 1

    const-string v0, "sdkInitResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/K1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->b()Lcom/ironsource/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/z1;->c()Lcom/ironsource/K1;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/ironsource/D1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->b()Lcom/ironsource/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/z1;->b()Lcom/ironsource/D1;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/ironsource/P5;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->b()Lcom/ironsource/P5;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/ironsource/Ae;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->c()Lcom/ironsource/Ae;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/ironsource/ub;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->a()Lcom/ironsource/V3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/V3;->b()Lcom/ironsource/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/z1;->e()Lcom/ironsource/ub;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/ironsource/Ae$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    invoke-virtual {v0}, Lcom/ironsource/he;->c()Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->h()Lcom/ironsource/Ae$a;

    move-result-object v0

    const-string v1, "sdkInitResponse.fullResponse.origin"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final g()Lcom/ironsource/he;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Yd;->a:Lcom/ironsource/he;

    return-object v0
.end method
