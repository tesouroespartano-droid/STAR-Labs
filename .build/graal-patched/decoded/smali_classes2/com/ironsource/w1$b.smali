.class public final Lcom/ironsource/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ca;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/w1;-><init>(Lcom/ironsource/lifecycle/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/w1;


# direct methods
.method constructor <init>(Lcom/ironsource/w1;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/w1$b;->a:Lcom/ironsource/w1;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w1$b;->a:Lcom/ironsource/w1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/Uc;->a(Z)V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/w1$b;->a:Lcom/ironsource/w1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ironsource/Uc;->a(Z)V

    return-void
.end method
