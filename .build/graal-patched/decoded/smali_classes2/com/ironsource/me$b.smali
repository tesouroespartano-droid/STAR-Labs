.class public final Lcom/ironsource/me$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ee;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/me;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method public static synthetic $r8$lambda$FBlKRtwYMylLdjNx14Juzt0KSfA(Landroid/content/Context;Lcom/ironsource/Yd;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/me$b;->a(Landroid/content/Context;Lcom/ironsource/Yd;)V

    return-void
.end method

.method public static synthetic $r8$lambda$yrH4hDBStWIN-h6TSq4_9lul6V8(Lcom/ironsource/ae;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/me$b;->b(Lcom/ironsource/ae;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/me$b;->a:Landroid/content/Context;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Landroid/content/Context;Lcom/ironsource/Yd;)V
    .locals 2

    const-string v0, "$sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    const-string v1, "applicationContext"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0, p1}, Lcom/ironsource/me;->a(Lcom/ironsource/me;Landroid/content/Context;Lcom/ironsource/Yd;)V

    return-void
.end method

.method private static final b(Lcom/ironsource/ae;)V
    .locals 1

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    invoke-static {v0, p0}, Lcom/ironsource/me;->a(Lcom/ironsource/me;Lcom/ironsource/ae;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Yd;)V
    .locals 3

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/me;->a()Lcom/ironsource/qe;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/me$b;->a:Landroid/content/Context;

    new-instance v2, Lcom/ironsource/me$b$$ExternalSyntheticLambda1;

    invoke-direct {v2, v1, p1}, Lcom/ironsource/me$b$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Lcom/ironsource/Yd;)V

    invoke-virtual {v0, v2}, Lcom/ironsource/qe;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/ironsource/ae;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/ironsource/me;->a()Lcom/ironsource/qe;

    move-result-object v0

    new-instance v1, Lcom/ironsource/me$b$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/ironsource/me$b$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/ae;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->a(Ljava/lang/Runnable;)V

    return-void
.end method
