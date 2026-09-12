.class public final Lcom/ironsource/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/bg;


# instance fields
.field private final a:Lcom/ironsource/qb;

.field private final b:Lcom/unity3d/ironsourceads/AdSize;


# direct methods
.method public constructor <init>(Lcom/ironsource/qb;Lcom/unity3d/ironsourceads/AdSize;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/e3;->a:Lcom/ironsource/qb;

    .line 3
    iput-object p2, p0, Lcom/ironsource/e3;->b:Lcom/unity3d/ironsourceads/AdSize;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/e3;->a:Lcom/ironsource/qb;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    sget-object v3, Lcom/ironsource/e3$a;->a:Lcom/ironsource/e3$a;

    invoke-interface {p0, v0, v3}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/e3;->b:Lcom/unity3d/ironsourceads/AdSize;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    sget-object v0, Lcom/ironsource/e3$b;->a:Lcom/ironsource/e3$b;

    invoke-interface {p0, v1, v0}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method
