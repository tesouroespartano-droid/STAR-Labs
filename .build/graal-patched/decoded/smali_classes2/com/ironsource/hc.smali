.class public final Lcom/ironsource/hc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/zb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ironsource/zb<",
        "Lcom/ironsource/gc;",
        "Lcom/ironsource/f1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/gc;)Lcom/ironsource/f1;
    .locals 3

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/ironsource/f1;

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/gc;->d()Lcom/ironsource/Re;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Lcom/ironsource/gc;->b()Lcom/ironsource/U7;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/gc;->a()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-direct {v0, v1, v2, p1}, Lcom/ironsource/f1;-><init>(Lcom/ironsource/Re;Lcom/ironsource/U7;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/ironsource/gc;

    invoke-virtual {p0, p1}, Lcom/ironsource/hc;->a(Lcom/ironsource/gc;)Lcom/ironsource/f1;

    move-result-object p1

    return-object p1
.end method
