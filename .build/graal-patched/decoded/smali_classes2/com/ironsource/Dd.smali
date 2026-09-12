.class public final Lcom/ironsource/Dd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/bg;


# instance fields
.field private final a:Lcom/ironsource/qb;


# direct methods
.method public constructor <init>(Lcom/ironsource/qb;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Dd;->a:Lcom/ironsource/qb;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Dd;->a:Lcom/ironsource/qb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/ironsource/Dd$a;->a:Lcom/ironsource/Dd$a;

    invoke-interface {p0, v0, v1}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method
