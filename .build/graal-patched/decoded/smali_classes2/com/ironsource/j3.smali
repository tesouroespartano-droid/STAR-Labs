.class public abstract Lcom/ironsource/j3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/j3$a;,
        Lcom/ironsource/j3$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/ironsource/j3$a;


# instance fields
.field private final a:Lcom/ironsource/j3$b;

.field private final b:Lcom/ironsource/K2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/j3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/j3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/j3;->c:Lcom/ironsource/j3$a;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/j3$b;Lcom/ironsource/K2;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerAdProperties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/j3;->a:Lcom/ironsource/j3$b;

    .line 3
    iput-object p2, p0, Lcom/ironsource/j3;->b:Lcom/ironsource/K2;

    return-void
.end method


# virtual methods
.method public abstract b()V
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method protected final g()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/j3;->b:Lcom/ironsource/K2;

    invoke-virtual {v0}, Lcom/ironsource/K2;->j()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/ironsource/j3;->a:Lcom/ironsource/j3$b;

    invoke-virtual {v0}, Lcom/ironsource/j3$b;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/j3;->b:Lcom/ironsource/K2;

    invoke-virtual {v0}, Lcom/ironsource/K2;->i()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/ironsource/j3;->a:Lcom/ironsource/j3$b;

    invoke-virtual {v0}, Lcom/ironsource/j3$b;->d()Z

    move-result v0

    return v0
.end method
