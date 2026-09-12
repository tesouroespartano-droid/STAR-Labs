.class final Lcom/ironsource/ib$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/ib;->a(Lcom/unity3d/mediation/LevelPlayInitRequest;Lcom/ironsource/Yd;Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/mediation/LevelPlayInitListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Ra;

.field final synthetic b:Lcom/ironsource/k5;

.field final synthetic c:J

.field final synthetic d:Lcom/unity3d/mediation/LevelPlayInitListener;


# direct methods
.method constructor <init>(Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/ib$b;->a:Lcom/ironsource/Ra;

    iput-object p2, p0, Lcom/ironsource/ib$b;->b:Lcom/ironsource/k5;

    iput-wide p3, p0, Lcom/ironsource/ib$b;->c:J

    iput-object p5, p0, Lcom/ironsource/ib$b;->d:Lcom/unity3d/mediation/LevelPlayInitListener;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    sget-object v0, Lcom/ironsource/ib;->a:Lcom/ironsource/ib;

    .line 2
    iget-object v1, p0, Lcom/ironsource/ib$b;->a:Lcom/ironsource/Ra;

    iget-object v2, p0, Lcom/ironsource/ib$b;->b:Lcom/ironsource/k5;

    iget-wide v3, p0, Lcom/ironsource/ib$b;->c:J

    iget-object v5, p0, Lcom/ironsource/ib$b;->d:Lcom/unity3d/mediation/LevelPlayInitListener;

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/ironsource/ib;->a(Lcom/ironsource/ib;Lcom/ironsource/Ra;Lcom/ironsource/k5;JLcom/unity3d/mediation/LevelPlayInitListener;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/ib$b;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
