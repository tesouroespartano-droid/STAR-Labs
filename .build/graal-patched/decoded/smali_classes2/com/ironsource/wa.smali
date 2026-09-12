.class final Lcom/ironsource/wa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ta;


# instance fields
.field private final a:Lcom/ironsource/j3;

.field private final b:Lcom/ironsource/ua;


# direct methods
.method public constructor <init>(Lcom/ironsource/j3;Lcom/ironsource/ua;)V
    .locals 1

    const-string v0, "legacyStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/wa;->a:Lcom/ironsource/j3;

    .line 3
    iput-object p2, p0, Lcom/ironsource/wa;->b:Lcom/ironsource/ua;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/ua;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/wa;->a:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/wa;->a:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->c()V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/wa;->a:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->d()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/wa;->a:Lcom/ironsource/j3;

    invoke-virtual {v0}, Lcom/ironsource/j3;->e()V

    return-void
.end method
