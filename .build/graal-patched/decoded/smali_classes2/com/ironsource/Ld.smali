.class public final Lcom/ironsource/Ld;
.super Lcom/ironsource/h1;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/ironsource/k1;)V
    .locals 8

    const-string v0, "eventBaseData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/Od;->i()Lcom/ironsource/Od;

    move-result-object v3

    const-string v0, "getInstance()"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/ironsource/Nd$d;

    invoke-direct {v4}, Lcom/ironsource/Nd$d;-><init>()V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 2
    invoke-direct/range {v1 .. v7}, Lcom/ironsource/h1;-><init>(Lcom/ironsource/k1;Lcom/ironsource/D7;Lcom/ironsource/zb;Lcom/ironsource/s4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
