.class final Lcom/ironsource/b3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/b3;-><init>(Lcom/ironsource/N0;Lcom/ironsource/H0;Lcom/ironsource/G2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/ironsource/kb;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/b3;


# direct methods
.method public static synthetic $r8$lambda$LHrCuzvNIKl5mQADwdsJXaZfIls(Lcom/ironsource/b3;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/b3$b;->a(Lcom/ironsource/b3;)V

    return-void
.end method

.method constructor <init>(Lcom/ironsource/b3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/b3$b;->a:Lcom/ironsource/b3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final a(Lcom/ironsource/b3;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lcom/ironsource/b3;->a(Lcom/ironsource/b3;)Lcom/ironsource/G2;

    move-result-object p0

    invoke-interface {p0}, Lcom/ironsource/G2;->d()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/kb;
    .locals 4

    .line 1
    new-instance v0, Lcom/ironsource/kb;

    .line 2
    iget-object v1, p0, Lcom/ironsource/b3$b;->a:Lcom/ironsource/b3;

    new-instance v2, Lcom/ironsource/b3$b$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/ironsource/b3$b$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/b3;)V

    .line 3
    invoke-static {}, Lcom/ironsource/lifecycle/b;->d()Lcom/ironsource/lifecycle/b;

    move-result-object v1

    .line 4
    new-instance v3, Lcom/ironsource/Lf;

    invoke-direct {v3}, Lcom/ironsource/Lf;-><init>()V

    .line 5
    invoke-direct {v0, v2, v1, v3}, Lcom/ironsource/kb;-><init>(Ljava/lang/Runnable;Lcom/ironsource/lifecycle/b;Lcom/ironsource/Lf;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/b3$b;->a()Lcom/ironsource/kb;

    move-result-object v0

    return-object v0
.end method
