.class public final Lcom/ironsource/zd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/j9;


# instance fields
.field private final a:Lcom/ironsource/b1;

.field private final b:Lcom/ironsource/Md;


# direct methods
.method public constructor <init>(Lcom/ironsource/b1;Lcom/ironsource/Md;)V
    .locals 1

    const-string v0, "adapterConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adFormatConfigurations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/zd;->a:Lcom/ironsource/b1;

    .line 3
    iput-object p2, p0, Lcom/ironsource/zd;->b:Lcom/ironsource/Md;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/zd;->b:Lcom/ironsource/Md;

    invoke-virtual {v0}, Lcom/ironsource/Md;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/zd;->a:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "adapterConfig.providerName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/zd;->a:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/zd;->a:Lcom/ironsource/b1;

    invoke-virtual {v0}, Lcom/ironsource/b1;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "adapterConfig.adSourceNameForEvents"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Lcom/ironsource/l9;
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/l9;->b:Lcom/ironsource/l9$a;

    iget-object v1, p0, Lcom/ironsource/zd;->a:Lcom/ironsource/b1;

    invoke-virtual {v1}, Lcom/ironsource/b1;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ironsource/l9$a;->a(I)Lcom/ironsource/l9;

    move-result-object v0

    return-object v0
.end method
