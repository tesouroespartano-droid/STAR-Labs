.class public final Lcom/ironsource/hg$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Fc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/hg;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/hg;


# direct methods
.method constructor <init>(Lcom/ironsource/hg;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/hg$b;->a:Lcom/ironsource/hg;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/hg$b;->a:Lcom/ironsource/hg;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/ironsource/Uc;->a(Z)V

    return-void
.end method
