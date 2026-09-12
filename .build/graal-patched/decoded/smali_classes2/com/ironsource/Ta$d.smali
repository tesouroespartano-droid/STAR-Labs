.class final Lcom/ironsource/Ta$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Ta;-><init>(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;Lcom/ironsource/Ta$b;Lcom/ironsource/n0;Lcom/ironsource/h6;Lcom/ironsource/w0;Lcom/ironsource/J7;Lcom/ironsource/s4;Lcom/ironsource/x7;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/ironsource/g6;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Ta;


# direct methods
.method constructor <init>(Lcom/ironsource/Ta;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Ta$d;->a:Lcom/ironsource/Ta;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/g6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$d;->a:Lcom/ironsource/Ta;

    invoke-static {v0}, Lcom/ironsource/Ta;->a(Lcom/ironsource/Ta;)Lcom/ironsource/g6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ta$d;->a()Lcom/ironsource/g6;

    move-result-object v0

    return-object v0
.end method
