.class public final Lcom/ironsource/ne$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ee;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/ne;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/ee;


# direct methods
.method public static synthetic $r8$lambda$H9S2JFi_ckeKJ19XvGRXmXqwc04(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ne$a;->a(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    return-void
.end method

.method public static synthetic $r8$lambda$gI4OTj1s3UyxFlrTputLsR3BbQQ(Lcom/ironsource/ee;Lcom/ironsource/ae;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ne$a;->a(Lcom/ironsource/ee;Lcom/ironsource/ae;)V

    return-void
.end method

.method constructor <init>(Lcom/ironsource/ee;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/ne$a;->a:Lcom/ironsource/ee;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V
    .locals 1

    const-string v0, "$sdkConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    invoke-static {v0, p0, p1}, Lcom/ironsource/ne;->a(Lcom/ironsource/ne;Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ee;Lcom/ironsource/ae;)V
    .locals 1

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p0, p1}, Lcom/ironsource/ee;->a(Lcom/ironsource/ae;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Yd;)V
    .locals 3

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/ne;->a()Lcom/ironsource/qe;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/ne$a;->a:Lcom/ironsource/ee;

    new-instance v2, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1, v1}, Lcom/ironsource/ne$a$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    invoke-virtual {v0, v2}, Lcom/ironsource/qe;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/ironsource/ae;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/ironsource/ne;->a()Lcom/ironsource/qe;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/ne$a;->a:Lcom/ironsource/ee;

    new-instance v2, Lcom/ironsource/ne$a$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1, p1}, Lcom/ironsource/ne$a$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/ee;Lcom/ironsource/ae;)V

    invoke-virtual {v0, v2}, Lcom/ironsource/qe;->d(Ljava/lang/Runnable;)V

    return-void
.end method
