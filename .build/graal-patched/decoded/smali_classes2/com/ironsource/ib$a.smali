.class public final Lcom/ironsource/ib$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ee;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/ib;->c(Landroid/content/Context;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/unity3d/mediation/LevelPlayInitListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/unity3d/mediation/LevelPlayInitRequest;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/ironsource/k5;

.field final synthetic d:Lcom/unity3d/mediation/LevelPlayInitListener;


# direct methods
.method public static synthetic $r8$lambda$PtQT88pSuivNo1CVIbAyTPX7OHM(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ironsource/ib$a;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public static synthetic $r8$lambda$YI_tUMDc52iVkTP4nQDG-X5VBR4(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/ib$a;->a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    return-void
.end method

.method constructor <init>(Lcom/unity3d/mediation/LevelPlayInitRequest;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/ib$a;->a:Lcom/unity3d/mediation/LevelPlayInitRequest;

    iput-object p2, p0, Lcom/ironsource/ib$a;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/ironsource/ib$a;->c:Lcom/ironsource/k5;

    iput-object p4, p0, Lcom/ironsource/ib$a;->d:Lcom/unity3d/mediation/LevelPlayInitListener;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 1

    const-string v0, "$initDuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    invoke-static {v0, p0, p1, p2}, Lcom/ironsource/ib;->a(Lcom/ironsource/ib;Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    return-void
.end method

.method private static final a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 7

    const-string v0, "$initRequest"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$initDuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lcom/ironsource/ib;->a(Lcom/ironsource/ib;Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Yd;)V
    .locals 7

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/ib;->a()Lcom/ironsource/jb;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/ib$a;->a:Lcom/unity3d/mediation/LevelPlayInitRequest;

    iget-object v4, p0, Lcom/ironsource/ib$a;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/ironsource/ib$a;->c:Lcom/ironsource/k5;

    iget-object v6, p0, Lcom/ironsource/ib$a;->d:Lcom/unity3d/mediation/LevelPlayInitListener;

    new-instance v1, Lcom/ironsource/ib$a$$ExternalSyntheticLambda1;

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/ironsource/ib$a$$ExternalSyntheticLambda1;-><init>(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/ironsource/ae;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/ironsource/ib;->a()Lcom/ironsource/jb;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/ib$a;->d:Lcom/unity3d/mediation/LevelPlayInitListener;

    iget-object v2, p0, Lcom/ironsource/ib$a;->c:Lcom/ironsource/k5;

    new-instance v3, Lcom/ironsource/ib$a$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2, p1}, Lcom/ironsource/ib$a$$ExternalSyntheticLambda0;-><init>(Lcom/unity3d/mediation/LevelPlayInitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    invoke-virtual {v0, v3}, Lcom/ironsource/jb;->a(Ljava/lang/Runnable;)V

    return-void
.end method
