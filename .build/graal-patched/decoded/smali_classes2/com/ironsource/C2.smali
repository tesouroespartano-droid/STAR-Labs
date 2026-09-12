.class public final Lcom/ironsource/C2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/I;


# instance fields
.field private final a:Lcom/ironsource/eg;


# direct methods
.method public constructor <init>(Lcom/ironsource/eg;)V
    .locals 1

    const-string v0, "viewBinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/C2;->a:Lcom/ironsource/eg;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/y2;)V
    .locals 1

    const-string v0, "bannerAdInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/C2;->a:Lcom/ironsource/eg;

    invoke-virtual {p1, v0}, Lcom/ironsource/y2;->a(Lcom/ironsource/eg;)V

    return-void
.end method
