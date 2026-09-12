.class public final Lcom/ironsource/gb$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/gb;->a(Lcom/ironsource/J7;)Lcom/ironsource/gb$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/J7;


# direct methods
.method constructor <init>(Lcom/ironsource/J7;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/gb$a;->a:Lcom/ironsource/J7;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/ironsource/f0;)Lcom/ironsource/v0;
    .locals 2

    const-string v0, "adProperties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/Gd;->z:Lcom/ironsource/Gd$a;

    .line 2
    iget-object v1, p0, Lcom/ironsource/gb$a;->a:Lcom/ironsource/J7;

    invoke-interface {v1}, Lcom/ironsource/J7;->e()Lcom/ironsource/I8;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/I8;->a()Lcom/ironsource/Ra;

    move-result-object v1

    .line 3
    invoke-virtual {v0, p2, v1, p1}, Lcom/ironsource/Gd$a;->a(Lcom/ironsource/f0;Lcom/ironsource/Ra;Z)Lcom/ironsource/Gd;

    move-result-object p1

    return-object p1
.end method
