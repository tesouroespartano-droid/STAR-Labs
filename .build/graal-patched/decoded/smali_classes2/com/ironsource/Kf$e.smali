.class final Lcom/ironsource/Kf$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Kf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Kf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/Mf;


# direct methods
.method public constructor <init>(Lcom/ironsource/Mf;)V
    .locals 1

    const-string v0, "timer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Kf$e;->a:Lcom/ironsource/Mf;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Kf$a;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Kf$e;->a:Lcom/ironsource/Mf;

    .line 2
    new-instance v1, Lcom/ironsource/Kf$e$a;

    invoke-direct {v1, p1}, Lcom/ironsource/Kf$e$a;-><init>(Lcom/ironsource/Kf$a;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/Mf;->a(Lcom/ironsource/Mf$a;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Kf$e;->a:Lcom/ironsource/Mf;

    invoke-virtual {v0}, Lcom/ironsource/Mf;->e()V

    return-void
.end method
