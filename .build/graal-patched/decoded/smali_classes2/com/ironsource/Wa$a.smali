.class public final Lcom/ironsource/Wa$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Wa;->a()Lcom/ironsource/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Wa;


# direct methods
.method constructor <init>(Lcom/ironsource/Wa;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Wa$a;->a:Lcom/ironsource/Wa;

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
    sget-object v0, Lcom/ironsource/z9;->z:Lcom/ironsource/z9$a;

    .line 2
    iget-object v1, p0, Lcom/ironsource/Wa$a;->a:Lcom/ironsource/Wa;

    invoke-static {v1}, Lcom/ironsource/Wa;->a(Lcom/ironsource/Wa;)Lcom/ironsource/J7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/J7;->e()Lcom/ironsource/I8;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/I8;->a()Lcom/ironsource/Ra;

    move-result-object v1

    .line 3
    invoke-virtual {v0, p2, v1, p1}, Lcom/ironsource/z9$a;->a(Lcom/ironsource/f0;Lcom/ironsource/Ra;Z)Lcom/ironsource/z9;

    move-result-object p1

    return-object p1
.end method
