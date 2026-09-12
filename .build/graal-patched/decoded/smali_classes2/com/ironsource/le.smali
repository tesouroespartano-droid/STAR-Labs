.class public final Lcom/ironsource/le;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/ae;

.field private final b:Lcom/ironsource/he;


# direct methods
.method public constructor <init>(Lcom/ironsource/ae;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/le;->a:Lcom/ironsource/ae;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/ironsource/le;->b:Lcom/ironsource/he;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/he;)V
    .locals 1

    const-string v0, "sdkInitResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/ironsource/le;->b:Lcom/ironsource/he;

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/ironsource/le;->a:Lcom/ironsource/ae;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/ae;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/le;->a:Lcom/ironsource/ae;

    return-object v0
.end method

.method public final b()Lcom/ironsource/he;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/le;->b:Lcom/ironsource/he;

    return-object v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/le;->a:Lcom/ironsource/ae;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/ironsource/le;->b:Lcom/ironsource/he;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/he;->c()Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->p()Z

    move-result v0

    return v0

    :cond_1
    return v1
.end method
