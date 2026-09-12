.class public final Lcom/ironsource/Ta$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/t6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Ta;->b()Lcom/ironsource/g6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Ta;

.field final synthetic b:Lcom/ironsource/f0;


# direct methods
.method constructor <init>(Lcom/ironsource/Ta;Lcom/ironsource/f0;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Ta$e;->a:Lcom/ironsource/Ta;

    iput-object p2, p0, Lcom/ironsource/Ta$e;->b:Lcom/ironsource/f0;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/ironsource/v6;)Lcom/ironsource/s6;
    .locals 13

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$e;->a:Lcom/ironsource/Ta;

    invoke-virtual {v0}, Lcom/ironsource/Ta;->g()Lcom/ironsource/w0;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Ta$e;->b:Lcom/ironsource/f0;

    invoke-interface {v0, p1, v1}, Lcom/ironsource/w0;->a(ZLcom/ironsource/f0;)Lcom/ironsource/v0;

    move-result-object v5

    .line 2
    new-instance v4, Lcom/ironsource/V0;

    iget-object p1, p0, Lcom/ironsource/Ta$e;->a:Lcom/ironsource/Ta;

    invoke-virtual {p1}, Lcom/ironsource/Ta;->f()Lcom/ironsource/n0;

    move-result-object p1

    sget-object v0, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-direct {v4, p1, v5, v0}, Lcom/ironsource/V0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/v0;Lcom/ironsource/D0$b;)V

    .line 3
    new-instance v2, Lcom/ironsource/s6;

    sget-object p1, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {p1}, Lcom/ironsource/Ab$b;->c()Lcom/ironsource/Ab;

    move-result-object v3

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, p2

    invoke-direct/range {v2 .. v12}, Lcom/ironsource/s6;-><init>(Lcom/ironsource/Ab;Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/v6;Lcom/ironsource/ng;Lkotlin/jvm/functions/Function3;Lcom/ironsource/if;Lcom/ironsource/s4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
